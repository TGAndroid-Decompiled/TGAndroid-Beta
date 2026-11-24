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
public final class s0 extends ReplacementSpan {
    public static final int d = 0;
    public final byte a;
    public final Object b;
    public final Object c;

    public s0() {
        this.a = (byte) 0;
        this.b = new Paint(1);
        tgb tgbVar = new tgb("x50", 13.0f, gl.n1("fonts/num.otf"));
        this.c = tgbVar;
        tgbVar.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
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
                RectF rectF = gl.P;
                rectF.set(f, f2 - gl.L(7.66f), ((tgb) obj2).c + f + gl.L(6.66f), gl.L(7.66f) + f2);
                canvas.saveLayerAlpha(rectF, 255, 31);
                Paint paint2 = (Paint) obj;
                paint2.setColor(paint.getColor());
                canvas.drawRoundRect(rectF, gl.L(5.0f), gl.L(5.0f), paint2);
                ((tgb) obj2).c(f + gl.L(3.33f), f2, 1.0f, -1, canvas);
                canvas.restore();
                return;
            case 1:
                float N = gl.N(14.66f);
                float f3 = (i3 + i5) / 2.0f;
                RectF rectF2 = gl.P;
                float f4 = N / 2.0f;
                rectF2.set(f, f3 - f4, ((int) (((tgb) obj2).c + gl.L(10.0f))) + f, f4 + f3);
                Paint paint3 = (Paint) obj;
                int i6 = bkb.y6;
                paint3.setColor(bkb.p1(0.15f, bkb.w0(null, i6, false)));
                canvas.drawRoundRect(rectF2, gl.L(4.0f), gl.L(4.0f), paint3);
                ((tgb) obj2).c(f + gl.L(5.0f), f3, Utilities.i((paint.getAlpha() << 1) / 255.0f, 1.0f, 0.0f), bkb.w0(null, i6, false), canvas);
                return;
            default:
                s33 s33Var = (s33) obj;
                canvas.save();
                canvas.translate(f + gl.L(4.0f), i4 / 2.0f);
                long uptimeMillis = (SystemClock.uptimeMillis() % 250) + 500;
                for (int i7 = 0; i7 < 3; i7++) {
                    float min = Math.min(1.0f, ((float) (((i7 * 250) + uptimeMillis) % 750)) / 667.0f);
                    if (min <= 0.425f) {
                        interpolation = s33Var.getInterpolation(min / 0.425f);
                    } else {
                        interpolation = 1.0f - s33Var.getInterpolation((min - 0.425f) / 0.575f);
                    }
                    canvas.drawCircle(gl.N((s33Var.getInterpolation(min) * 16.0f) + 1.667f), gl.L(3.0f), gl.N(interpolation * 2.0f), paint);
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
                return (int) (((tgb) this.c).c + gl.L(6.66f));
            case 1:
                return (int) (((tgb) this.c).c + gl.L(10.0f));
            default:
                return gl.L(20.0f);
        }
    }

    public s0(int i) {
        this.a = (byte) 1;
        this.b = new Paint(1);
        this.c = new tgb(k96.G(i, "BusinessRepliesMore", new Object[0]), 9.33f, gl.o());
    }

    public s0(View[] viewArr) {
        this.a = (byte) 2;
        this.b = new s33(0.33d, 0.0d, 0.67d, 1.0d);
        this.c = viewArr;
    }
}
