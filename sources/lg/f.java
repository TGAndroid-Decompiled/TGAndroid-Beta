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
import org.telegram.messenger.q5;
import org.telegram.messenger.x7;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.l0;
public final class f {
    public int f19763a;
    public int f19764b;
    public boolean f19765c;
    public Object d;
    public Object f19766e;
    public final Object f19767f;
    public final Object f19768g;
    public final Object h;

    public f(int i7, int i10, q5 q5Var) {
        this.d = new ArrayList();
        this.f19766e = new ArrayList();
        this.f19765c = false;
        this.f19768g = new x7(this, 0);
        this.h = new x7(this, 1);
        this.f19764b = i7;
        this.f19763a = i10;
        this.f19767f = q5Var;
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
        q5 q5Var = (q5) this.f19767f;
        x7 x7Var = (x7) this.h;
        if (z10) {
            q5Var.a(x7Var);
            x7Var.run();
        } else if (this.f19765c) {
        } else {
            this.f19765c = true;
            q5Var.a(x7Var);
            q5Var.d(x7Var, 20L);
        }
    }

    public void c(Canvas canvas, float f10, float f11, float f12) {
        Drawable drawable = (Drawable) this.f19768g;
        l0 l0Var = (l0) this.h;
        RectF rectF = l0Var.f53127a;
        rectF.set(0.0f, 0.0f, f10, f11);
        canvas.saveLayerAlpha(rectF, (int) (f12 * 255.0f), 31);
        m6 m6Var = (m6) this.d;
        float i7 = m6Var.i();
        m6 m6Var2 = (m6) this.f19766e;
        float i10 = m6Var2.i();
        TextPaint textPaint = m6Var2.f37375a;
        float f13 = i10 * i7;
        canvas.save();
        float f14 = 0.82f * f11;
        canvas.translate(0.0f, e2.z(1.0f, l0Var.H, f14, -g0.L(1.0f)));
        canvas.translate(0.0f, (-g0.L(4.0f)) * f13);
        float T1 = g0.T1(1.0f, 0.86f, f13) * l0Var.H;
        canvas.scale(T1, T1, 0.0f, 0.0f);
        m6Var.o(0.0f, 0.0f, f10, f11);
        m6Var.draw(canvas);
        canvas.restore();
        float d = ((c6) this.f19767f).d(this.f19765c);
        canvas.save();
        canvas.translate(0.0f, e2.t(1.0f, f13, g0.L(4.0f), (g0.L(14.0f) * f13) + ((1.0f - l0Var.H) * f14 * f13) + (-g0.L(1.0f))));
        float T12 = g0.T1(1.15f, 0.9f, f13) * l0Var.H;
        canvas.scale(T12, T12, 0.0f, 0.0f);
        m6Var2.u(i0.a.f(d, this.f19763a, n6.x0(null, n6.f29635q7, false)));
        if (d > 0.0f) {
            if (this.f19764b != textPaint.getColor()) {
                int color = textPaint.getColor();
                this.f19764b = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (d * 255.0f));
            drawable.setBounds(0, ((int) (f11 - g0.L(16.0f))) / 2, g0.L(16.0f), ((int) (g0.L(16.0f) + f11)) / 2);
            drawable.draw(canvas);
        }
        m6Var2.o(g0.L(20.0f) * d, 0.0f, f10, f11);
        m6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f10 - g0.L(12.0f), 0.0f, f10, f11);
        l0Var.f53152s0.n(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }

    public Bitmap d(int i7, int i10) {
        Canvas canvas;
        Paint paint = (Paint) this.f19768g;
        RectF rectF = (RectF) this.f19767f;
        int w02 = n6.w0(n6.f29394d6, (i6) this.h);
        int i11 = (i7 + i10) << 10;
        if (i11 == this.f19763a && !this.f19765c) {
            if (w02 != this.f19764b && (canvas = (Canvas) this.f19766e) != null && ((Bitmap) this.d) != null) {
                this.f19764b = w02;
                canvas.drawColor(w02, PorterDuff.Mode.SRC);
                ((Canvas) this.f19766e).drawRoundRect(rectF, g0.L(6.0f), g0.L(6.0f), paint);
            }
        } else {
            this.f19765c = false;
            this.f19763a = i11;
            this.d = Bitmap.createBitmap(i10, i7, Bitmap.Config.ARGB_8888);
            this.f19766e = new Canvas((Bitmap) this.d);
            rectF.set(0.0f, 0.0f, i10, i7);
            this.f19764b = w02;
            ((Canvas) this.f19766e).drawColor(w02);
            ((Canvas) this.f19766e).drawRoundRect(rectF, g0.L(6.0f), g0.L(6.0f), paint);
        }
        return (Bitmap) this.d;
    }

    public f(l0 l0Var) {
        this.h = l0Var;
        m6 m6Var = new m6(true, true, true);
        this.d = m6Var;
        m6 m6Var2 = new m6(true, true, true);
        this.f19766e = m6Var2;
        this.f19767f = new c6(l0Var, 0L, 300L, lr.h);
        this.f19765c = false;
        m6Var.L = true;
        m6Var.w(g0.L(18.33f));
        m6Var.B = 0.6f;
        m6Var.x(g0.o());
        m6Var.q(false);
        m6Var.setCallback(l0Var);
        m6Var.N = 9999999;
        m6Var2.L = true;
        m6Var2.w(g0.L(14.0f));
        m6Var2.q(false);
        m6Var2.setCallback(l0Var);
        m6Var2.N = 9999999;
        this.f19768g = l0Var.getContext().getResources().getDrawable(2131232852).mutate();
    }

    public f(i6 i6Var) {
        this.f19767f = new RectF();
        Paint paint = new Paint(1);
        this.f19768g = paint;
        this.f19763a = 0;
        this.f19765c = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.h = i6Var;
    }
}
