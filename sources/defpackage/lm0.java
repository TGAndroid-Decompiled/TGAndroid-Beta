package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.util.Pair;
public final class lm0 extends ReplacementSpan {
    public final Drawable a;
    public final Drawable b;
    public boolean c;
    public boolean d;
    public final hn e;
    public final TextPaint f;
    public final int h;

    public lm0(wb2 wb2Var, TextPaint textPaint, int i) {
        this.f = textPaint;
        hn hnVar = new hn(false, false, true);
        this.e = hnVar;
        hnVar.n(0.3f, 250L, k43.h);
        hnVar.setCallback(wb2Var);
        hnVar.w(hl.L(11.5f));
        hnVar.x(hl.o());
        hnVar.t("", true, true);
        hnVar.b = 17;
        Drawable mutate = wb2Var.getContext().getDrawable(2131231934).mutate();
        this.a = mutate;
        Drawable mutate2 = wb2Var.getContext().getDrawable(2131231935).mutate();
        this.b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i;
        hnVar.t(i > 1 ? String.valueOf(i) : "", false, true);
    }

    public static Pair a(wb2 wb2Var, TextPaint textPaint, int i) {
        SpannableString spannableString = new SpannableString("d");
        lm0 lm0Var = new lm0(wb2Var, textPaint, i);
        spannableString.setSpan(lm0Var, 0, 1, 33);
        return new Pair(spannableString, lm0Var);
    }

    public final int b() {
        int i;
        if (this.d) {
            i = 8;
        } else {
            i = 0;
        }
        return (int) (this.e.e() + hl.L(i + 16));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        TextPaint textPaint = this.f;
        int color = textPaint.getColor();
        hn hnVar = this.e;
        TextPaint textPaint2 = hnVar.a;
        TextPaint textPaint3 = hnVar.a;
        int color2 = textPaint2.getColor();
        Drawable drawable = this.b;
        Drawable drawable2 = this.a;
        if (color != color2) {
            hnVar.u(textPaint.getColor());
            int color3 = textPaint3.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(textPaint3.getColor(), mode));
        }
        canvas.save();
        if (this.d && !this.c) {
            i6 = hl.L(8.0f);
        } else {
            i6 = 0;
        }
        canvas.translate(f + i6, -hl.L(0.2f));
        if (this.h == 1) {
            canvas.translate(hl.L(1.5f), 0.0f);
            drawable2.draw(canvas);
        } else {
            drawable.draw(canvas);
        }
        canvas.translate(hl.L(16.0f), 0.0f);
        Rect rect = hl.Q;
        rect.set(0, 0, (int) hnVar.c(), (int) hnVar.e);
        hnVar.setBounds(rect);
        hnVar.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
