package kg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.xy0;
public final class q1 extends ReplacementSpan {
    public static final int d = 0;
    public final int f18467a;
    public final Object f18468b;
    public final Object f18469c;

    public q1(View[] viewArr) {
        this.f18467a = 2;
        this.f18468b = new nr(0.33d, 0.0d, 0.67d, 1.0d);
        this.f18469c = viewArr;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float interpolation;
        switch (this.f18467a) {
            case 0:
                float N = org.telegram.messenger.g0.N(14.66f);
                float f11 = (i11 + i13) / 2.0f;
                RectF rectF = org.telegram.messenger.g0.P;
                float f12 = N / 2.0f;
                rectF.set(f10, f11 - f12, ((int) (((xy0) this.f18469c).f42247c + org.telegram.messenger.g0.L(10.0f))) + f10, f12 + f11);
                Paint paint2 = (Paint) this.f18468b;
                int i14 = m6.f29792z6;
                paint2.setColor(m6.r1(0.15f, m6.x0(null, i14, false)));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint2);
                ((xy0) this.f18469c).c(f10 + org.telegram.messenger.g0.L(5.0f), f11, Utilities.i((paint.getAlpha() * 2) / 255.0f, 1.0f, 0.0f), m6.x0(null, i14, false), canvas);
                return;
            case 1:
                float f13 = (i11 + i13) / 2.0f;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(f10, f13 - org.telegram.messenger.g0.L(7.66f), ((xy0) this.f18469c).f42247c + f10 + org.telegram.messenger.g0.L(6.66f), org.telegram.messenger.g0.L(7.66f) + f13);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                Paint paint3 = (Paint) this.f18468b;
                paint3.setColor(paint.getColor());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), paint3);
                ((xy0) this.f18469c).c(f10 + org.telegram.messenger.g0.L(3.33f), f13, 1.0f, -1, canvas);
                canvas.restore();
                return;
            default:
                nr nrVar = (nr) this.f18468b;
                canvas.save();
                canvas.translate(f10 + org.telegram.messenger.g0.L(4.0f), i12 / 2.0f);
                long uptimeMillis = (SystemClock.uptimeMillis() % 250) + 500;
                for (int i15 = 0; i15 < 3; i15++) {
                    float min = Math.min(1.0f, ((float) (((i15 * 250) + uptimeMillis) % 750)) / 667.0f);
                    if (min <= 0.425f) {
                        interpolation = nrVar.getInterpolation(min / 0.425f);
                    } else {
                        interpolation = 1.0f - nrVar.getInterpolation((min - 0.425f) / 0.575f);
                    }
                    canvas.drawCircle(org.telegram.messenger.g0.N((nrVar.getInterpolation(min) * 16.0f) + 1.667f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.N(interpolation * 2.0f), paint);
                }
                canvas.restore();
                for (View view : (View[]) this.f18469c) {
                    view.invalidate();
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f18467a) {
            case 0:
                return (int) (((xy0) this.f18469c).f42247c + org.telegram.messenger.g0.L(10.0f));
            case 1:
                return (int) (((xy0) this.f18469c).f42247c + org.telegram.messenger.g0.L(6.66f));
            default:
                return org.telegram.messenger.g0.L(20.0f);
        }
    }

    public q1(int i7) {
        this.f18467a = 0;
        this.f18468b = new Paint(1);
        this.f18469c = new xy0(hd.G(i7, "BusinessRepliesMore", new Object[0]), 9.33f, org.telegram.messenger.g0.o());
    }

    public q1() {
        this.f18467a = 1;
        this.f18468b = new Paint(1);
        xy0 xy0Var = new xy0("x50", 13.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
        this.f18469c = xy0Var;
        xy0Var.f42245a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
