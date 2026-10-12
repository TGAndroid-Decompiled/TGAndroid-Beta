package ig;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h11;
public final class w1 extends ReplacementSpan {
    public static final int d = 0;
    public final int f11682a;
    public final Object f11683b;
    public final Object f11684c;

    public w1(View[] viewArr) {
        this.f11682a = 2;
        this.f11683b = new es(0.33d, 0.0d, 0.67d, 1.0d);
        this.f11684c = viewArr;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float interpolation;
        switch (this.f11682a) {
            case 0:
                float dpf2 = AndroidUtilities.dpf2(14.66f);
                float f10 = (i12 + i14) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                float f11 = dpf2 / 2.0f;
                rectF.set(f7, f10 - f11, ((int) (((h11) this.f11684c).f25473c + AndroidUtilities.dp(10.0f))) + f7, f11 + f10);
                Paint paint2 = (Paint) this.f11683b;
                int i15 = g6.f20305z6;
                paint2.setColor(g6.m1(0.15f, g6.x0(null, i15, false)));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                ((h11) this.f11684c).c(f7 + AndroidUtilities.dp(5.0f), f10, Utilities.clamp((paint.getAlpha() * 2) / 255.0f, 1.0f, 0.0f), g6.x0(null, i15, false), canvas);
                return;
            case 1:
                float f12 = (i12 + i14) / 2.0f;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(f7, f12 - AndroidUtilities.dp(7.66f), ((h11) this.f11684c).f25473c + f7 + AndroidUtilities.dp(6.66f), AndroidUtilities.dp(7.66f) + f12);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                Paint paint3 = (Paint) this.f11683b;
                paint3.setColor(paint.getColor());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint3);
                ((h11) this.f11684c).c(f7 + AndroidUtilities.dp(3.33f), f12, 1.0f, -1, canvas);
                canvas.restore();
                return;
            default:
                es esVar = (es) this.f11683b;
                canvas.save();
                canvas.translate(f7 + AndroidUtilities.dp(4.0f), i13 / 2.0f);
                long uptimeMillis = (SystemClock.uptimeMillis() % 250) + 500;
                for (int i16 = 0; i16 < 3; i16++) {
                    float min = Math.min(1.0f, ((float) (((i16 * 250) + uptimeMillis) % 750)) / 667.0f);
                    if (min <= 0.425f) {
                        interpolation = esVar.getInterpolation(min / 0.425f);
                    } else {
                        interpolation = 1.0f - esVar.getInterpolation((min - 0.425f) / 0.575f);
                    }
                    canvas.drawCircle(AndroidUtilities.dpf2((esVar.getInterpolation(min) * 16.0f) + 1.667f), AndroidUtilities.dp(3.0f), AndroidUtilities.dpf2(interpolation * 2.0f), paint);
                }
                canvas.restore();
                for (View view : (View[]) this.f11684c) {
                    view.invalidate();
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f11682a) {
            case 0:
                return (int) (((h11) this.f11684c).f25473c + AndroidUtilities.dp(10.0f));
            case 1:
                return (int) (((h11) this.f11684c).f25473c + AndroidUtilities.dp(6.66f));
            default:
                return AndroidUtilities.dp(20.0f);
        }
    }

    public w1(int i10) {
        this.f11682a = 0;
        this.f11683b = new Paint(1);
        this.f11684c = new h11(LocaleController.formatPluralString("BusinessRepliesMore", i10, new Object[0]), 9.33f, AndroidUtilities.bold());
    }

    public w1() {
        this.f11682a = 1;
        this.f11683b = new Paint(1);
        h11 h11Var = new h11("x50", 13.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f11684c = h11Var;
        h11Var.f25471a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
