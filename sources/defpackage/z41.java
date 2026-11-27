package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
public final class z41 extends ReplacementSpan {
    public final vnb a;
    public final Paint b = new Paint(1);
    public final pkb c;
    public final Runnable d;
    public v41 e;
    public Integer f;

    public z41(String str, Runnable runnable, vnb vnbVar) {
        this.a = vnbVar;
        this.d = runnable;
        this.c = new pkb(str, 12.0f, null);
    }

    public static SpannableString b(String str, Runnable runnable, vnb vnbVar, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        z41 z41Var = new z41(str, runnable, vnbVar);
        spannableString.setSpan(z41Var, 0, spannableString.length(), 33);
        z41Var.f = num;
        return spannableString;
    }

    public final int a() {
        return (int) (this.c.c + hl.L(14.0f));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float a;
        int v0;
        float N = hl.N(17.0f);
        float f2 = (i3 + i5) / 2.0f;
        RectF rectF = hl.P;
        float f3 = N / 2.0f;
        rectF.set(f, f2 - f3, a() + f, f2 + f3);
        v41 v41Var = this.e;
        if (v41Var == null) {
            a = 1.0f;
        } else {
            a = v41Var.a(0.025f);
        }
        canvas.save();
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        Integer num = this.f;
        if (num != null) {
            v0 = num.intValue();
        } else {
            v0 = aob.v0(aob.Fi, this.a);
        }
        int i6 = v0;
        int p1 = aob.p1(0.15f, i6);
        Paint paint2 = this.b;
        paint2.setColor(p1);
        canvas.drawRoundRect(rectF, f3, f3, paint2);
        this.c.c(f + hl.L(7.0f), f2, 1.0f, i6, canvas);
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
