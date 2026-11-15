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
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.i7;
import org.telegram.messenger.p5;
import org.telegram.messenger.x7;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.u5;
import org.telegram.ui.l0;
public final class f {
    public int f19399a;
    public int f19400b;
    public boolean f19401c;
    public Object d;
    public Object f19402e;
    public final Object f19403f;
    public final Object f19404g;
    public final Object h;

    public f(int i7, int i10, p5 p5Var) {
        this.d = new ArrayList();
        this.f19402e = new ArrayList();
        this.f19401c = false;
        this.f19404g = new x7(this, 0);
        this.h = new x7(this, 1);
        this.f19400b = i7;
        this.f19399a = i10;
        this.f19403f = p5Var;
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

    public void b(boolean z10) {
        p5 p5Var = (p5) this.f19403f;
        x7 x7Var = (x7) this.h;
        if (z10) {
            p5Var.a(x7Var);
            x7Var.run();
        } else if (this.f19401c) {
        } else {
            this.f19401c = true;
            p5Var.a(x7Var);
            p5Var.d(x7Var, 20L);
        }
    }

    public void c(Canvas canvas, float f10, float f11, float f12) {
        Drawable drawable = (Drawable) this.f19404g;
        l0 l0Var = (l0) this.h;
        RectF rectF = l0Var.f52647a;
        rectF.set(0.0f, 0.0f, f10, f11);
        canvas.saveLayerAlpha(rectF, (int) (f12 * 255.0f), 31);
        g6 g6Var = (g6) this.d;
        float i7 = g6Var.i();
        g6 g6Var2 = (g6) this.f19402e;
        float i10 = g6Var2.i();
        TextPaint textPaint = g6Var2.f34831a;
        float f13 = i10 * i7;
        canvas.save();
        float f14 = 0.82f * f11;
        canvas.translate(0.0f, e2.z(1.0f, l0Var.H, f14, -g0.L(1.0f)));
        canvas.translate(0.0f, (-g0.L(4.0f)) * f13);
        float T1 = g0.T1(1.0f, 0.86f, f13) * l0Var.H;
        canvas.scale(T1, T1, 0.0f, 0.0f);
        g6Var.o(0.0f, 0.0f, f10, f11);
        g6Var.draw(canvas);
        canvas.restore();
        float d = ((u5) this.f19403f).d(this.f19401c);
        canvas.save();
        canvas.translate(0.0f, e2.t(1.0f, f13, g0.L(4.0f), (g0.L(14.0f) * f13) + ((1.0f - l0Var.H) * f14 * f13) + (-g0.L(1.0f))));
        float T12 = g0.T1(1.15f, 0.9f, f13) * l0Var.H;
        canvas.scale(T12, T12, 0.0f, 0.0f);
        g6Var2.u(i0.a.f(d, this.f19399a, j6.x0(null, j6.f29090q7, false)));
        if (d > 0.0f) {
            if (this.f19400b != textPaint.getColor()) {
                int color = textPaint.getColor();
                this.f19400b = color;
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
        l0Var.f52672s0.m(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }

    public Bitmap d(int i7, int i10) {
        Canvas canvas;
        Paint paint = (Paint) this.f19404g;
        RectF rectF = (RectF) this.f19403f;
        int w02 = j6.w0(j6.f28849d6, (e6) this.h);
        int i11 = (i7 + i10) << 10;
        if (i11 == this.f19399a && !this.f19401c) {
            if (w02 != this.f19400b && (canvas = (Canvas) this.f19402e) != null && ((Bitmap) this.d) != null) {
                this.f19400b = w02;
                canvas.drawColor(w02, PorterDuff.Mode.SRC);
                ((Canvas) this.f19402e).drawRoundRect(rectF, g0.L(6.0f), g0.L(6.0f), paint);
            }
        } else {
            this.f19401c = false;
            this.f19399a = i11;
            this.d = Bitmap.createBitmap(i10, i7, Bitmap.Config.ARGB_8888);
            this.f19402e = new Canvas((Bitmap) this.d);
            rectF.set(0.0f, 0.0f, i10, i7);
            this.f19400b = w02;
            ((Canvas) this.f19402e).drawColor(w02);
            ((Canvas) this.f19402e).drawRoundRect(rectF, g0.L(6.0f), g0.L(6.0f), paint);
        }
        return (Bitmap) this.d;
    }

    public f(l0 l0Var) {
        this.h = l0Var;
        g6 g6Var = new g6(true, true, true);
        this.d = g6Var;
        g6 g6Var2 = new g6(true, true, true);
        this.f19402e = g6Var2;
        this.f19403f = new u5(l0Var, 0L, 300L, er.h);
        this.f19401c = false;
        g6Var.L = true;
        g6Var.w(g0.L(18.33f));
        g6Var.B = 0.6f;
        g6Var.x(g0.o());
        g6Var.q(false);
        g6Var.setCallback(l0Var);
        g6Var.N = 9999999;
        g6Var2.L = true;
        g6Var2.w(g0.L(14.0f));
        g6Var2.q(false);
        g6Var2.setCallback(l0Var);
        g6Var2.N = 9999999;
        this.f19404g = l0Var.getContext().getResources().getDrawable(2131232848).mutate();
    }

    public f(e6 e6Var) {
        this.f19403f = new RectF();
        Paint paint = new Paint(1);
        this.f19404g = paint;
        this.f19399a = 0;
        this.f19401c = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.h = e6Var;
    }
}
