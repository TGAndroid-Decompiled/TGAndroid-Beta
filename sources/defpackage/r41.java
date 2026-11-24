package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
public final class r41 extends ReplacementSpan {
    public final wjb a;
    public final Paint b = new Paint(1);
    public final tgb c;
    public final Runnable d;
    public n41 e;
    public Integer f;

    public r41(String str, Runnable runnable, wjb wjbVar) {
        this.a = wjbVar;
        this.d = runnable;
        this.c = new tgb(str, 12.0f, null);
    }

    public static SpannableString b(String str, Runnable runnable, wjb wjbVar, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        r41 r41Var = new r41(str, runnable, wjbVar);
        spannableString.setSpan(r41Var, 0, spannableString.length(), 33);
        r41Var.f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.c.c + gl.L(14.0f));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float a;
        int v0;
        float N = gl.N(17.0f);
        float f2 = (i3 + i5) / 2.0f;
        RectF rectF = gl.P;
        float f3 = N / 2.0f;
        rectF.set(f, f2 - f3, a() + f, f2 + f3);
        n41 n41Var = this.e;
        if (n41Var == null) {
            a = 1.0f;
        } else {
            a = n41Var.a(0.025f);
        }
        canvas.save();
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        Integer num = this.f;
        if (num != null) {
            v0 = num.intValue();
        } else {
            v0 = bkb.v0(bkb.Ei, this.a);
        }
        int i6 = v0;
        int p1 = bkb.p1(0.15f, i6);
        Paint paint2 = this.b;
        paint2.setColor(p1);
        canvas.drawRoundRect(rectF, f3, f3, paint2);
        this.c.c(f + gl.L(7.0f), f2, 1.0f, i6, canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return a();
    }
}
