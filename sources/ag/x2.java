package ag;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
public final class x2 extends ReplacementSpan {
    public static final int d = 0;
    public final int f797a;
    public final Object f798b;
    public final Object f799c;

    public x2(View[] viewArr) {
        this.f797a = 2;
        this.f798b = new gr(0.33d, 0.0d, 0.67d, 1.0d);
        this.f799c = viewArr;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float interpolation;
        switch (this.f797a) {
            case 0:
                float N = org.telegram.messenger.i0.N(14.66f);
                float f10 = (i12 + i14) / 2.0f;
                RectF rectF = org.telegram.messenger.i0.P;
                float f11 = N / 2.0f;
                rectF.set(f7, f10 - f11, ((int) (((qz0) this.f799c).f29774c + org.telegram.messenger.i0.L(10.0f))) + f7, f11 + f10);
                Paint paint2 = (Paint) this.f798b;
                int i15 = t6.f21330z6;
                paint2.setColor(t6.r1(0.15f, t6.x0(null, i15, false)));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint2);
                ((qz0) this.f799c).c(f7 + org.telegram.messenger.i0.L(5.0f), f10, Utilities.i((paint.getAlpha() * 2) / 255.0f, 1.0f, 0.0f), t6.x0(null, i15, false), canvas);
                return;
            case 1:
                float f12 = (i12 + i14) / 2.0f;
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(f7, f12 - org.telegram.messenger.i0.L(7.66f), ((qz0) this.f799c).f29774c + f7 + org.telegram.messenger.i0.L(6.66f), org.telegram.messenger.i0.L(7.66f) + f12);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                Paint paint3 = (Paint) this.f798b;
                paint3.setColor(paint.getColor());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f), paint3);
                ((qz0) this.f799c).c(f7 + org.telegram.messenger.i0.L(3.33f), f12, 1.0f, -1, canvas);
                canvas.restore();
                return;
            default:
                gr grVar = (gr) this.f798b;
                canvas.save();
                canvas.translate(f7 + org.telegram.messenger.i0.L(4.0f), i13 / 2.0f);
                long uptimeMillis = (SystemClock.uptimeMillis() % 250) + 500;
                for (int i16 = 0; i16 < 3; i16++) {
                    float min = Math.min(1.0f, ((float) (((i16 * 250) + uptimeMillis) % 750)) / 667.0f);
                    if (min <= 0.425f) {
                        interpolation = grVar.getInterpolation(min / 0.425f);
                    } else {
                        interpolation = 1.0f - grVar.getInterpolation((min - 0.425f) / 0.575f);
                    }
                    canvas.drawCircle(org.telegram.messenger.i0.N((grVar.getInterpolation(min) * 16.0f) + 1.667f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.N(interpolation * 2.0f), paint);
                }
                canvas.restore();
                for (View view : (View[]) this.f799c) {
                    view.invalidate();
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f797a) {
            case 0:
                return (int) (((qz0) this.f799c).f29774c + org.telegram.messenger.i0.L(10.0f));
            case 1:
                return (int) (((qz0) this.f799c).f29774c + org.telegram.messenger.i0.L(6.66f));
            default:
                return org.telegram.messenger.i0.L(20.0f);
        }
    }

    public x2(int i10) {
        this.f797a = 0;
        this.f798b = new Paint(1);
        this.f799c = new qz0(cd.G(i10, "BusinessRepliesMore", new Object[0]), 9.33f, org.telegram.messenger.i0.o());
    }

    public x2() {
        this.f797a = 1;
        this.f798b = new Paint(1);
        qz0 qz0Var = new qz0("x50", 13.0f, org.telegram.messenger.i0.o1("fonts/num.otf"));
        this.f799c = qz0Var;
        qz0Var.f29772a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
