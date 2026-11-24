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
    public final gn e;
    public final TextPaint f;
    public final int h;

    public lm0(gb2 gb2Var, TextPaint textPaint, int i) {
        this.f = textPaint;
        gn gnVar = new gn(false, false, true);
        this.e = gnVar;
        gnVar.n(0.3f, 250L, s33.h);
        gnVar.setCallback(gb2Var);
        gnVar.w(gl.L(11.5f));
        gnVar.x(gl.o());
        gnVar.t("", true, true);
        gnVar.b = 17;
        Drawable mutate = gb2Var.getContext().getDrawable(2131231934).mutate();
        this.a = mutate;
        Drawable mutate2 = gb2Var.getContext().getDrawable(2131231935).mutate();
        this.b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i;
        gnVar.t(i > 1 ? String.valueOf(i) : "", false, true);
    }

    public static Pair a(gb2 gb2Var, TextPaint textPaint, int i) {
        SpannableString spannableString = new SpannableString("d");
        lm0 lm0Var = new lm0(gb2Var, textPaint, i);
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
        return (int) (this.e.e() + gl.L(i + 16));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        TextPaint textPaint = this.f;
        int color = textPaint.getColor();
        gn gnVar = this.e;
        TextPaint textPaint2 = gnVar.a;
        TextPaint textPaint3 = gnVar.a;
        int color2 = textPaint2.getColor();
        Drawable drawable = this.b;
        Drawable drawable2 = this.a;
        if (color != color2) {
            gnVar.u(textPaint.getColor());
            int color3 = textPaint3.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(textPaint3.getColor(), mode));
        }
        canvas.save();
        if (this.d && !this.c) {
            i6 = gl.L(8.0f);
        } else {
            i6 = 0;
        }
        canvas.translate(f + i6, -gl.L(0.2f));
        if (this.h == 1) {
            canvas.translate(gl.L(1.5f), 0.0f);
            drawable2.draw(canvas);
        } else {
            drawable.draw(canvas);
        }
        canvas.translate(gl.L(16.0f), 0.0f);
        Rect rect = gl.Q;
        rect.set(0, 0, (int) gnVar.c(), (int) gnVar.e);
        gnVar.setBounds(rect);
        gnVar.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
