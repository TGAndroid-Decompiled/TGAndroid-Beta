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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.l0;
public final class f {
    public int f19760a;
    public int f19761b;
    public boolean f19762c;
    public Object d;
    public Object f19763e;
    public final Object f19764f;
    public final Object f19765g;
    public final Object h;

    public f(int i7, int i10, q5 q5Var) {
        this.d = new ArrayList();
        this.f19763e = new ArrayList();
        this.f19762c = false;
        this.f19765g = new x7(this, 0);
        this.h = new x7(this, 1);
        this.f19761b = i7;
        this.f19760a = i10;
        this.f19764f = q5Var;
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
        q5 q5Var = (q5) this.f19764f;
        x7 x7Var = (x7) this.h;
        if (z10) {
            q5Var.a(x7Var);
            x7Var.run();
        } else if (this.f19762c) {
        } else {
            this.f19762c = true;
            q5Var.a(x7Var);
            q5Var.d(x7Var, 20L);
        }
    }

    public void c(Canvas canvas, float f10, float f11, float f12) {
        Drawable drawable = (Drawable) this.f19765g;
        l0 l0Var = (l0) this.h;
        RectF rectF = l0Var.f53138a;
        rectF.set(0.0f, 0.0f, f10, f11);
        canvas.saveLayerAlpha(rectF, (int) (f12 * 255.0f), 31);
        n6 n6Var = (n6) this.d;
        float i7 = n6Var.i();
        n6 n6Var2 = (n6) this.f19763e;
        float i10 = n6Var2.i();
        TextPaint textPaint = n6Var2.f37749a;
        float f13 = i10 * i7;
        canvas.save();
        float f14 = 0.82f * f11;
        canvas.translate(0.0f, e2.z(1.0f, l0Var.H, f14, -g0.L(1.0f)));
        canvas.translate(0.0f, (-g0.L(4.0f)) * f13);
        float T1 = g0.T1(1.0f, 0.86f, f13) * l0Var.H;
        canvas.scale(T1, T1, 0.0f, 0.0f);
        n6Var.o(0.0f, 0.0f, f10, f11);
        n6Var.draw(canvas);
        canvas.restore();
        float d = ((d6) this.f19764f).d(this.f19762c);
        canvas.save();
        canvas.translate(0.0f, e2.t(1.0f, f13, g0.L(4.0f), (g0.L(14.0f) * f13) + ((1.0f - l0Var.H) * f14 * f13) + (-g0.L(1.0f))));
        float T12 = g0.T1(1.15f, 0.9f, f13) * l0Var.H;
        canvas.scale(T12, T12, 0.0f, 0.0f);
        n6Var2.u(i0.a.f(d, this.f19760a, m6.x0(null, m6.f29588q7, false)));
        if (d > 0.0f) {
            if (this.f19761b != textPaint.getColor()) {
                int color = textPaint.getColor();
                this.f19761b = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (d * 255.0f));
            drawable.setBounds(0, ((int) (f11 - g0.L(16.0f))) / 2, g0.L(16.0f), ((int) (g0.L(16.0f) + f11)) / 2);
            drawable.draw(canvas);
        }
        n6Var2.o(g0.L(20.0f) * d, 0.0f, f10, f11);
        n6Var2.draw(canvas);
        canvas.restore();
        rectF.set(f10 - g0.L(12.0f), 0.0f, f10, f11);
        l0Var.f53163s0.n(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }

    public Bitmap d(int i7, int i10) {
        Canvas canvas;
        Paint paint = (Paint) this.f19765g;
        RectF rectF = (RectF) this.f19764f;
        int w02 = m6.w0(m6.f29347d6, (h6) this.h);
        int i11 = (i7 + i10) << 10;
        if (i11 == this.f19760a && !this.f19762c) {
            if (w02 != this.f19761b && (canvas = (Canvas) this.f19763e) != null && ((Bitmap) this.d) != null) {
                this.f19761b = w02;
                canvas.drawColor(w02, PorterDuff.Mode.SRC);
                ((Canvas) this.f19763e).drawRoundRect(rectF, g0.L(6.0f), g0.L(6.0f), paint);
            }
        } else {
            this.f19762c = false;
            this.f19760a = i11;
            this.d = Bitmap.createBitmap(i10, i7, Bitmap.Config.ARGB_8888);
            this.f19763e = new Canvas((Bitmap) this.d);
            rectF.set(0.0f, 0.0f, i10, i7);
            this.f19761b = w02;
            ((Canvas) this.f19763e).drawColor(w02);
            ((Canvas) this.f19763e).drawRoundRect(rectF, g0.L(6.0f), g0.L(6.0f), paint);
        }
        return (Bitmap) this.d;
    }

    public f(l0 l0Var) {
        this.h = l0Var;
        n6 n6Var = new n6(true, true, true);
        this.d = n6Var;
        n6 n6Var2 = new n6(true, true, true);
        this.f19763e = n6Var2;
        this.f19764f = new d6(l0Var, 0L, 300L, nr.h);
        this.f19762c = false;
        n6Var.L = true;
        n6Var.w(g0.L(18.33f));
        n6Var.B = 0.6f;
        n6Var.x(g0.o());
        n6Var.q(false);
        n6Var.setCallback(l0Var);
        n6Var.N = 9999999;
        n6Var2.L = true;
        n6Var2.w(g0.L(14.0f));
        n6Var2.q(false);
        n6Var2.setCallback(l0Var);
        n6Var2.N = 9999999;
        this.f19765g = l0Var.getContext().getResources().getDrawable(2131232852).mutate();
    }

    public f(h6 h6Var) {
        this.f19764f = new RectF();
        Paint paint = new Paint(1);
        this.f19765g = paint;
        this.f19760a = 0;
        this.f19762c = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.h = h6Var;
    }
}
