package mg;

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
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gr;
public final class a extends ReplacementSpan {
    public final Drawable f13061a;
    public final Drawable f13062b;
    public boolean f13063c;
    public boolean d;
    public final e6 e;
    public final TextPaint f13064f;
    public final int h;

    public a(org.telegram.ui.Cells.q1 q1Var, TextPaint textPaint, int i10) {
        this.f13064f = textPaint;
        e6 e6Var = new e6(false, false, true);
        this.e = e6Var;
        e6Var.n(0.3f, 250L, gr.h);
        e6Var.setCallback(q1Var);
        e6Var.w(org.telegram.messenger.i0.L(11.5f));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.t("", true, true);
        e6Var.f25744b = 17;
        Drawable mutate = q1Var.getContext().getDrawable(2131231929).mutate();
        this.f13061a = mutate;
        Drawable mutate2 = q1Var.getContext().getDrawable(2131231930).mutate();
        this.f13062b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i10;
        e6Var.t(i10 > 1 ? String.valueOf(i10) : "", false, true);
    }

    public static Pair a(org.telegram.ui.Cells.q1 q1Var, TextPaint textPaint, int i10) {
        SpannableString spannableString = new SpannableString("d");
        a aVar = new a(q1Var, textPaint, i10);
        spannableString.setSpan(aVar, 0, 1, 33);
        return new Pair(spannableString, aVar);
    }

    public final int b() {
        int i10;
        if (this.d) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        return (int) (this.e.e() + org.telegram.messenger.i0.L(i10 + 16));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15;
        TextPaint textPaint = this.f13064f;
        int color = textPaint.getColor();
        e6 e6Var = this.e;
        int color2 = e6Var.f25742a.getColor();
        Drawable drawable = this.f13062b;
        Drawable drawable2 = this.f13061a;
        if (color != color2) {
            e6Var.u(textPaint.getColor());
            int color3 = e6Var.f25742a.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(e6Var.f25742a.getColor(), mode));
        }
        canvas.save();
        if (this.d && !this.f13063c) {
            i15 = org.telegram.messenger.i0.L(8.0f);
        } else {
            i15 = 0;
        }
        canvas.translate(f7 + i15, -org.telegram.messenger.i0.L(0.2f));
        if (this.h == 1) {
            canvas.translate(org.telegram.messenger.i0.L(1.5f), 0.0f);
            drawable2.draw(canvas);
        } else {
            drawable.draw(canvas);
        }
        canvas.translate(org.telegram.messenger.i0.L(16.0f), 0.0f);
        Rect rect = org.telegram.messenger.i0.Q;
        rect.set(0, 0, (int) e6Var.c(), (int) e6Var.e);
        e6Var.setBounds(rect);
        e6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
