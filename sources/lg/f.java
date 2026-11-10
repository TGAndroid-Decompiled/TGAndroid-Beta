package lg;

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
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;
import org.telegram.ui.l0;
public final class f {
    public int f18269a;
    public int f18270b;
    public boolean f18271c;
    public Object d;
    public Object f18272e;
    public final Object f18273f;
    public final Object f18274g;
    public final Object h;

    public f(int i7, int i10, p5 p5Var) {
        this.d = new ArrayList();
        this.f18272e = new ArrayList();
        this.f18271c = false;
        this.f18274g = new x7(this, 0);
        this.h = new x7(this, 1);
        this.f18270b = i7;
        this.f18269a = i10;
        this.f18273f = p5Var;
    }

    public void a(i7 i7Var) {
        ArrayList arrayList = (ArrayList) this.d;
        int i7 = 0;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (arrayList.get(i10) == i7Var) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        while (true) {
            if (i7 < arrayList.size()) {
                if (i7Var.W0 > ((i7) arrayList.get(i7)).W0) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 >= 0) {
            arrayList.add(i7, i7Var);
        } else {
            arrayList.add(i7Var);
        }
    }

    public void b(boolean z9) {
        p5 p5Var = (p5) this.f18273f;
        x7 x7Var = (x7) this.h;
        if (z9) {
            p5Var.a(x7Var);
            x7Var.run();
        } else if (this.f18271c) {
        } else {
            this.f18271c = true;
            p5Var.a(x7Var);
            p5Var.d(x7Var, 20L);
        }
    }

    public void c(Canvas canvas, float f10, float f11, float f12) {
        Drawable drawable = (Drawable) this.f18274g;
        l0 l0Var = (l0) this.h;
        RectF rectF = l0Var.f51121a;
        rectF.set(0.0f, 0.0f, f10, f11);
        canvas.saveLayerAlpha(rectF, (int) (f12 * 255.0f), 31);
        h6 h6Var = (h6) this.d;
        float i7 = h6Var.i();
        h6 h6Var2 = (h6) this.f18272e;
        float i10 = h6Var2.i();
        TextPaint textPaint = h6Var2.f34185a;
        float f13 = i10 * i7;
        canvas.save();
        float f14 = 0.82f * f11;
        canvas.translate(0.0f, com.google.android.recaptcha.internal.a.z(1.0f, l0Var.G, f14, -g0.L(1.0f)));
        canvas.translate(0.0f, (-g0.L(4.0f)) * f13);
        float T1 = g0.T1(1.0f, 0.86f, f13) * l0Var.G;
        canvas.scale(T1, T1, 0.0f, 0.0f);
        h6Var.o(0.0f, 0.0f, f10, f11);
        h6Var.draw(canvas);
        canvas.restore();
        float d = ((v5) this.f18273f).d(this.f18271c);
        canvas.save();
        canvas.translate(0.0f, com.google.android.recaptcha.internal.a.v(1.0f, f13, g0.L(4.0f), (g0.L(14.0f) * f13) + ((1.0f - l0Var.G) * f14 * f13) + (-g0.L(1.0f))));
        float T12 = g0.T1(1.15f, 0.9f, f13) * l0Var.G;
        canvas.scale(T12, T12, 0.0f, 0.0f);
        h6Var2.u(i0.a.f(d, this.f18269a, m6.x0(null, m6.f28131q7, false)));
        if (d > 0.0f) {
            if (this.f18270b != textPaint.getColor()) {
                int color = textPaint.getColor();
                this.f18270b = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (d * 255.0f));
            drawable.setBounds(0, ((int) (f11 - g0.L(16.0f))) / 2, g0.L(16.0f), ((int) (g0.L(16.0f) + f11)) / 2);
            drawable.draw(canvas);
        }
        h6Var2.o(g0.L(20.0f) * d, 0.0f, f10, f11);
        h6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f10 - g0.L(12.0f), 0.0f, f10, f11);
        l0Var.f51144r0.m(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }

    public Bitmap d(int i7, int i10) {
        Canvas canvas;
        Paint paint = (Paint) this.f18274g;
        RectF rectF = (RectF) this.f18273f;
        int w02 = m6.w0(m6.f27890d6, (org.telegram.ui.ActionBar.h6) this.h);
        int i11 = (i7 + i10) << 10;
        if (i11 == this.f18269a && !this.f18271c) {
            if (w02 != this.f18270b && (canvas = (Canvas) this.f18272e) != null && ((Bitmap) this.d) != null) {
                this.f18270b = w02;
                canvas.drawColor(w02, PorterDuff.Mode.SRC);
                ((Canvas) this.f18272e).drawRoundRect(rectF, g0.L(6.0f), g0.L(6.0f), paint);
            }
        } else {
            this.f18271c = false;
            this.f18269a = i11;
            this.d = Bitmap.createBitmap(i10, i7, Bitmap.Config.ARGB_8888);
            this.f18272e = new Canvas((Bitmap) this.d);
            rectF.set(0.0f, 0.0f, i10, i7);
            this.f18270b = w02;
            ((Canvas) this.f18272e).drawColor(w02);
            ((Canvas) this.f18272e).drawRoundRect(rectF, g0.L(6.0f), g0.L(6.0f), paint);
        }
        return (Bitmap) this.d;
    }

    public f(l0 l0Var) {
        this.h = l0Var;
        h6 h6Var = new h6(true, true, true);
        this.d = h6Var;
        h6 h6Var2 = new h6(true, true, true);
        this.f18272e = h6Var2;
        this.f18273f = new v5(l0Var, 0L, 300L, wq.h);
        this.f18271c = false;
        h6Var.K = true;
        h6Var.w(g0.L(18.33f));
        h6Var.A = 0.6f;
        h6Var.x(g0.o());
        h6Var.q(false);
        h6Var.setCallback(l0Var);
        h6Var.M = 9999999;
        h6Var2.K = true;
        h6Var2.w(g0.L(14.0f));
        h6Var2.q(false);
        h6Var2.setCallback(l0Var);
        h6Var2.M = 9999999;
        this.f18274g = l0Var.getContext().getResources().getDrawable(2131232847).mutate();
    }

    public f(org.telegram.ui.ActionBar.h6 h6Var) {
        this.f18273f = new RectF();
        Paint paint = new Paint(1);
        this.f18274g = paint;
        this.f18269a = 0;
        this.f18271c = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.h = h6Var;
    }
}
