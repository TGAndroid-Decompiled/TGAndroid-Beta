package mg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.i7;
import org.telegram.messenger.p5;
import org.telegram.messenger.x7;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.m0;
public final class f {
    public int f19305a;
    public int f19306b;
    public boolean f19307c;
    public Object d;
    public Object f19308e;
    public final Object f19309f;
    public final Object f19310g;
    public final Object h;

    public f(int i3, int i10, p5 p5Var) {
        this.d = new ArrayList();
        this.f19308e = new ArrayList();
        this.f19307c = false;
        this.f19310g = new x7(this, 0);
        this.h = new x7(this, 1);
        this.f19306b = i3;
        this.f19305a = i10;
        this.f19309f = p5Var;
    }

    public void a(i7 i7Var) {
        ArrayList arrayList = (ArrayList) this.d;
        int i3 = 0;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (arrayList.get(i10) == i7Var) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        while (true) {
            if (i3 < arrayList.size()) {
                if (i7Var.W0 > ((i7) arrayList.get(i3)).W0) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 >= 0) {
            arrayList.add(i3, i7Var);
        } else {
            arrayList.add(i7Var);
        }
    }

    public void b(boolean z10) {
        p5 p5Var = (p5) this.f19309f;
        x7 x7Var = (x7) this.h;
        if (z10) {
            p5Var.a(x7Var);
            x7Var.run();
        } else if (this.f19307c) {
        } else {
            this.f19307c = true;
            p5Var.a(x7Var);
            p5Var.e(x7Var, 20L);
        }
    }

    public void c(Canvas canvas, float f10, float f11, float f12) {
        Drawable drawable = (Drawable) this.f19310g;
        m0 m0Var = (m0) this.h;
        RectF rectF = m0Var.f50870a;
        rectF.set(0.0f, 0.0f, f10, f11);
        canvas.saveLayerAlpha(rectF, (int) (f12 * 255.0f), 31);
        g6 g6Var = (g6) this.d;
        float i3 = g6Var.i();
        g6 g6Var2 = (g6) this.f19308e;
        float i10 = g6Var2.i();
        TextPaint textPaint = g6Var2.f33981a;
        float f13 = i10 * i3;
        canvas.save();
        float f14 = 0.82f * f11;
        canvas.translate(0.0f, com.google.android.recaptcha.internal.a.y(1.0f, m0Var.H, f14, -g0.L(1.0f)));
        canvas.translate(0.0f, (-g0.L(4.0f)) * f13);
        float T1 = g0.T1(1.0f, 0.86f, f13) * m0Var.H;
        canvas.scale(T1, T1, 0.0f, 0.0f);
        g6Var.o(0.0f, 0.0f, f10, f11);
        g6Var.draw(canvas);
        canvas.restore();
        float d = ((u5) this.f19309f).d(this.f19307c);
        canvas.save();
        canvas.translate(0.0f, a1.g.D(1.0f, f13, g0.L(4.0f), (g0.L(14.0f) * f13) + ((1.0f - m0Var.H) * f14 * f13) + (-g0.L(1.0f))));
        float T12 = g0.T1(1.15f, 0.9f, f13) * m0Var.H;
        canvas.scale(T12, T12, 0.0f, 0.0f);
        g6Var2.u(i0.a.f(d, this.f19305a, k6.x0(null, k6.f28122q7, false)));
        if (d > 0.0f) {
            if (this.f19306b != textPaint.getColor()) {
                int color = textPaint.getColor();
                this.f19306b = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (d * 255.0f));
            drawable.setBounds(0, ((int) (f11 - g0.L(16.0f))) / 2, g0.L(16.0f), ((int) (g0.L(16.0f) + f11)) / 2);
            drawable.draw(canvas);
        }
        g6Var2.o(g0.L(20.0f) * d, 0.0f, f10, f11);
        g6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f10 - g0.L(12.0f), 0.0f, f10, f11);
        m0Var.f50895s0.w(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }

    public Bitmap d(int i3, int i10) {
        Canvas canvas;
        Paint paint = (Paint) this.f19310g;
        RectF rectF = (RectF) this.f19309f;
        int w02 = k6.w0(k6.f27878d6, (e6) this.h);
        int i11 = (i3 + i10) << 10;
        if (i11 == this.f19305a && !this.f19307c) {
            if (w02 != this.f19306b && (canvas = (Canvas) this.f19308e) != null && ((Bitmap) this.d) != null) {
                this.f19306b = w02;
                canvas.drawColor(w02, PorterDuff.Mode.SRC);
                ((Canvas) this.f19308e).drawRoundRect(rectF, g0.L(6.0f), g0.L(6.0f), paint);
            }
        } else {
            this.f19307c = false;
            this.f19305a = i11;
            this.d = Bitmap.createBitmap(i10, i3, Bitmap.Config.ARGB_8888);
            this.f19308e = new Canvas((Bitmap) this.d);
            rectF.set(0.0f, 0.0f, i10, i3);
            this.f19306b = w02;
            ((Canvas) this.f19308e).drawColor(w02);
            ((Canvas) this.f19308e).drawRoundRect(rectF, g0.L(6.0f), g0.L(6.0f), paint);
        }
        return (Bitmap) this.d;
    }

    public f(m0 m0Var) {
        this.h = m0Var;
        g6 g6Var = new g6(true, true, true);
        this.d = g6Var;
        g6 g6Var2 = new g6(true, true, true);
        this.f19308e = g6Var2;
        this.f19309f = new u5(m0Var, 0L, 300L, xq.h);
        this.f19307c = false;
        g6Var.K = true;
        g6Var.w(g0.L(18.33f));
        g6Var.A = 0.6f;
        g6Var.x(g0.o());
        g6Var.q(false);
        g6Var.setCallback(m0Var);
        g6Var.M = 9999999;
        g6Var2.K = true;
        g6Var2.w(g0.L(14.0f));
        g6Var2.q(false);
        g6Var2.setCallback(m0Var);
        g6Var2.M = 9999999;
        this.f19310g = m0Var.getContext().getResources().getDrawable(2131232845).mutate();
    }

    public f(e6 e6Var) {
        this.f19309f = new RectF();
        Paint paint = new Paint(1);
        this.f19310g = paint;
        this.f19305a = 0;
        this.f19307c = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.h = e6Var;
    }
}
