package hg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.n11;
public final class x1 extends ReplacementSpan {
    public static final int d = 0;
    public final int f11443a;
    public final Object f11444b;
    public final Object f11445c;

    public x1(View[] viewArr) {
        this.f11443a = 2;
        this.f11444b = new is(0.33d, 0.0d, 0.67d, 1.0d);
        this.f11445c = viewArr;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float interpolation;
        switch (this.f11443a) {
            case 0:
                float dpf2 = AndroidUtilities.dpf2(14.66f);
                float f10 = (i12 + i14) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                float f11 = dpf2 / 2.0f;
                rectF.set(f7, f10 - f11, ((int) (((n11) this.f11445c).f28902c + AndroidUtilities.dp(10.0f))) + f7, f11 + f10);
                Paint paint2 = (Paint) this.f11444b;
                int i15 = h6.f21189z6;
                paint2.setColor(h6.m1(0.15f, h6.x0(null, i15, false)));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                ((n11) this.f11445c).c(f7 + AndroidUtilities.dp(5.0f), f10, Utilities.clamp((paint.getAlpha() * 2) / 255.0f, 1.0f, 0.0f), h6.x0(null, i15, false), canvas);
                return;
            case 1:
                float f12 = (i12 + i14) / 2.0f;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(f7, f12 - AndroidUtilities.dp(7.66f), ((n11) this.f11445c).f28902c + f7 + AndroidUtilities.dp(6.66f), AndroidUtilities.dp(7.66f) + f12);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                Paint paint3 = (Paint) this.f11444b;
                paint3.setColor(paint.getColor());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint3);
                ((n11) this.f11445c).c(f7 + AndroidUtilities.dp(3.33f), f12, 1.0f, -1, canvas);
                canvas.restore();
                return;
            default:
                is isVar = (is) this.f11444b;
                canvas.save();
                canvas.translate(f7 + AndroidUtilities.dp(4.0f), i13 / 2.0f);
                long uptimeMillis = (SystemClock.uptimeMillis() % 250) + 500;
                for (int i16 = 0; i16 < 3; i16++) {
                    float min = Math.min(1.0f, ((float) (((i16 * 250) + uptimeMillis) % 750)) / 667.0f);
                    if (min <= 0.425f) {
                        interpolation = isVar.getInterpolation(min / 0.425f);
                    } else {
                        interpolation = 1.0f - isVar.getInterpolation((min - 0.425f) / 0.575f);
                    }
                    canvas.drawCircle(AndroidUtilities.dpf2((isVar.getInterpolation(min) * 16.0f) + 1.667f), AndroidUtilities.dp(3.0f), AndroidUtilities.dpf2(interpolation * 2.0f), paint);
                }
                canvas.restore();
                for (View view : (View[]) this.f11445c) {
                    view.invalidate();
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f11443a) {
            case 0:
                return (int) (((n11) this.f11445c).f28902c + AndroidUtilities.dp(10.0f));
            case 1:
                return (int) (((n11) this.f11445c).f28902c + AndroidUtilities.dp(6.66f));
            default:
                return AndroidUtilities.dp(20.0f);
        }
    }

    public x1(int i10) {
        this.f11443a = 0;
        this.f11444b = new Paint(1);
        this.f11445c = new n11(LocaleController.formatPluralString("BusinessRepliesMore", i10, new Object[0]), 9.33f, AndroidUtilities.bold());
    }

    public x1() {
        this.f11443a = 1;
        this.f11444b = new Paint(1);
        n11 n11Var = new n11("x50", 13.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f11445c = n11Var;
        n11Var.f28900a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
