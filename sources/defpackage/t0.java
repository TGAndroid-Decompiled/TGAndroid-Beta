package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class t0 extends ReplacementSpan {
    public static final int d = 0;
    public final byte a;
    public final Object b;
    public final Object c;

    public t0() {
        this.a = (byte) 0;
        this.b = new Paint(1);
        pkb pkbVar = new pkb("x50", 13.0f, hl.n1("fonts/num.otf"));
        this.c = pkbVar;
        pkbVar.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float interpolation;
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                float f2 = (i3 + i5) / 2.0f;
                RectF rectF = hl.P;
                rectF.set(f, f2 - hl.L(7.66f), ((pkb) obj2).c + f + hl.L(6.66f), hl.L(7.66f) + f2);
                canvas.saveLayerAlpha(rectF, 255, 31);
                Paint paint2 = (Paint) obj;
                paint2.setColor(paint.getColor());
                canvas.drawRoundRect(rectF, hl.L(5.0f), hl.L(5.0f), paint2);
                ((pkb) obj2).c(f + hl.L(3.33f), f2, 1.0f, -1, canvas);
                canvas.restore();
                return;
            case 1:
                float N = hl.N(14.66f);
                float f3 = (i3 + i5) / 2.0f;
                RectF rectF2 = hl.P;
                float f4 = N / 2.0f;
                rectF2.set(f, f3 - f4, ((int) (((pkb) obj2).c + hl.L(10.0f))) + f, f4 + f3);
                Paint paint3 = (Paint) obj;
                int i6 = aob.z6;
                paint3.setColor(aob.p1(0.15f, aob.w0(null, i6, false)));
                canvas.drawRoundRect(rectF2, hl.L(4.0f), hl.L(4.0f), paint3);
                ((pkb) obj2).c(f + hl.L(5.0f), f3, Utilities.i((paint.getAlpha() << 1) / 255.0f, 1.0f, 0.0f), aob.w0(null, i6, false), canvas);
                return;
            default:
                k43 k43Var = (k43) obj;
                canvas.save();
                canvas.translate(f + hl.L(4.0f), i4 / 2.0f);
                long uptimeMillis = (SystemClock.uptimeMillis() % 250) + 500;
                for (int i7 = 0; i7 < 3; i7++) {
                    float min = Math.min(1.0f, ((float) (((i7 * 250) + uptimeMillis) % 750)) / 667.0f);
                    if (min <= 0.425f) {
                        interpolation = k43Var.getInterpolation(min / 0.425f);
                    } else {
                        interpolation = 1.0f - k43Var.getInterpolation((min - 0.425f) / 0.575f);
                    }
                    canvas.drawCircle(hl.N((k43Var.getInterpolation(min) * 16.0f) + 1.667f), hl.L(3.0f), hl.N(interpolation * 2.0f), paint);
                }
                canvas.restore();
                for (View view : (View[]) obj2) {
                    view.invalidate();
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                return (int) (((pkb) this.c).c + hl.L(6.66f));
            case 1:
                return (int) (((pkb) this.c).c + hl.L(10.0f));
            default:
                return hl.L(20.0f);
        }
    }

    public t0(int i) {
        this.a = (byte) 1;
        this.b = new Paint(1);
        this.c = new pkb(ob6.G(i, "BusinessRepliesMore", new Object[0]), 9.33f, hl.o());
    }

    public t0(View[] viewArr) {
        this.a = (byte) 2;
        this.b = new k43(0.33d, 0.0d, 0.67d, 1.0d);
        this.c = viewArr;
    }
}
