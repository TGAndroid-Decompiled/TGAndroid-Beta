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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oy0;
public final class p1 extends ReplacementSpan {
    public static final int d = 0;
    public final int f18036a;
    public final Object f18037b;
    public final Object f18038c;

    public p1(View[] viewArr) {
        this.f18036a = 2;
        this.f18037b = new er(0.33d, 0.0d, 0.67d, 1.0d);
        this.f18038c = viewArr;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float interpolation;
        switch (this.f18036a) {
            case 0:
                float N = org.telegram.messenger.g0.N(14.66f);
                float f11 = (i11 + i13) / 2.0f;
                RectF rectF = org.telegram.messenger.g0.P;
                float f12 = N / 2.0f;
                rectF.set(f10, f11 - f12, ((int) (((oy0) this.f18038c).f38103c + org.telegram.messenger.g0.L(10.0f))) + f10, f12 + f11);
                Paint paint2 = (Paint) this.f18037b;
                int i14 = j6.f29260z6;
                paint2.setColor(j6.r1(0.15f, j6.x0(null, i14, false)));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint2);
                ((oy0) this.f18038c).c(f10 + org.telegram.messenger.g0.L(5.0f), f11, Utilities.i((paint.getAlpha() * 2) / 255.0f, 1.0f, 0.0f), j6.x0(null, i14, false), canvas);
                return;
            case 1:
                float f13 = (i11 + i13) / 2.0f;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(f10, f13 - org.telegram.messenger.g0.L(7.66f), ((oy0) this.f18038c).f38103c + f10 + org.telegram.messenger.g0.L(6.66f), org.telegram.messenger.g0.L(7.66f) + f13);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                Paint paint3 = (Paint) this.f18037b;
                paint3.setColor(paint.getColor());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), paint3);
                ((oy0) this.f18038c).c(f10 + org.telegram.messenger.g0.L(3.33f), f13, 1.0f, -1, canvas);
                canvas.restore();
                return;
            default:
                er erVar = (er) this.f18037b;
                canvas.save();
                canvas.translate(f10 + org.telegram.messenger.g0.L(4.0f), i12 / 2.0f);
                long uptimeMillis = (SystemClock.uptimeMillis() % 250) + 500;
                for (int i15 = 0; i15 < 3; i15++) {
                    float min = Math.min(1.0f, ((float) (((i15 * 250) + uptimeMillis) % 750)) / 667.0f);
                    if (min <= 0.425f) {
                        interpolation = erVar.getInterpolation(min / 0.425f);
                    } else {
                        interpolation = 1.0f - erVar.getInterpolation((min - 0.425f) / 0.575f);
                    }
                    canvas.drawCircle(org.telegram.messenger.g0.N((erVar.getInterpolation(min) * 16.0f) + 1.667f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.N(interpolation * 2.0f), paint);
                }
                canvas.restore();
                for (View view : (View[]) this.f18038c) {
                    view.invalidate();
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f18036a) {
            case 0:
                return (int) (((oy0) this.f18038c).f38103c + org.telegram.messenger.g0.L(10.0f));
            case 1:
                return (int) (((oy0) this.f18038c).f38103c + org.telegram.messenger.g0.L(6.66f));
            default:
                return org.telegram.messenger.g0.L(20.0f);
        }
    }

    public p1(int i7) {
        this.f18036a = 0;
        this.f18037b = new Paint(1);
        this.f18038c = new oy0(hd.G(i7, "BusinessRepliesMore", new Object[0]), 9.33f, org.telegram.messenger.g0.o());
    }

    public p1() {
        this.f18036a = 1;
        this.f18037b = new Paint(1);
        oy0 oy0Var = new oy0("x50", 13.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
        this.f18038c = oy0Var;
        oy0Var.f38101a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
