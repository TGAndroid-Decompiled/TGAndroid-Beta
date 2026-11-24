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
public final class ln0 extends ReplacementSpan {
    public final Drawable a;
    public final Drawable b;
    public boolean c;
    public boolean d;
    public final ho e;
    public final TextPaint f;
    public final int h;

    public ln0(rc2 rc2Var, TextPaint textPaint, int i) {
        this.f = textPaint;
        ho hoVar = new ho(false, false, true);
        this.e = hoVar;
        hoVar.n(0.3f, 250L, d53.h);
        hoVar.setCallback(rc2Var);
        hoVar.w(gm.L(11.5f));
        hoVar.x(gm.o());
        hoVar.t("", true, true);
        hoVar.b = 17;
        Drawable mutate = rc2Var.getContext().getDrawable(2131231935).mutate();
        this.a = mutate;
        Drawable mutate2 = rc2Var.getContext().getDrawable(2131231936).mutate();
        this.b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i;
        hoVar.t(i > 1 ? String.valueOf(i) : "", false, true);
    }

    public static Pair a(rc2 rc2Var, TextPaint textPaint, int i) {
        SpannableString spannableString = new SpannableString("d");
        ln0 ln0Var = new ln0(rc2Var, textPaint, i);
        spannableString.setSpan(ln0Var, 0, 1, 33);
        return new Pair(spannableString, ln0Var);
    }

    public final int b() {
        int i;
        if (this.d) {
            i = 8;
        } else {
            i = 0;
        }
        return (int) (this.e.e() + gm.L(i + 16));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        TextPaint textPaint = this.f;
        int color = textPaint.getColor();
        ho hoVar = this.e;
        TextPaint textPaint2 = hoVar.a;
        TextPaint textPaint3 = hoVar.a;
        int color2 = textPaint2.getColor();
        Drawable drawable = this.b;
        Drawable drawable2 = this.a;
        if (color != color2) {
            hoVar.u(textPaint.getColor());
            int color3 = textPaint3.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(textPaint3.getColor(), mode));
        }
        canvas.save();
        if (this.d && !this.c) {
            i6 = gm.L(8.0f);
        } else {
            i6 = 0;
        }
        canvas.translate(f + i6, -gm.L(0.2f));
        if (this.h == 1) {
            canvas.translate(gm.L(1.5f), 0.0f);
            drawable2.draw(canvas);
        } else {
            drawable.draw(canvas);
        }
        canvas.translate(gm.L(16.0f), 0.0f);
        Rect rect = gm.Q;
        rect.set(0, 0, (int) hoVar.c(), (int) hoVar.e);
        hoVar.setBounds(rect);
        hoVar.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
