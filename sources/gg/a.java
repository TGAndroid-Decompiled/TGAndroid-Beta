package gg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.mr;
public final class a extends ReplacementSpan {
    public final Drawable f6535a;
    public final Drawable f6536b;
    public boolean f6537c;
    public boolean d;
    public final j6 e;
    public final TextPaint f6538f;
    public final int h;

    public a(org.telegram.ui.Cells.s1 s1Var, TextPaint textPaint, int i10) {
        this.f6538f = textPaint;
        j6 j6Var = new j6(false, false, true, false);
        this.e = j6Var;
        j6Var.k(0.3f, 250L, mr.h);
        j6Var.setCallback(s1Var);
        j6Var.t(AndroidUtilities.dp(11.5f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.q("", true, true);
        j6Var.f25847b = 17;
        Drawable mutate = s1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge).mutate();
        this.f6535a = mutate;
        Drawable mutate2 = s1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge2).mutate();
        this.f6536b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i10;
        j6Var.q(i10 > 1 ? String.valueOf(i10) : "", false, true);
    }

    public static Pair a(org.telegram.ui.Cells.s1 s1Var, TextPaint textPaint, int i10) {
        SpannableString spannableString = new SpannableString("d");
        a aVar = new a(s1Var, textPaint, i10);
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
        return (int) (this.e.e() + AndroidUtilities.dp(i10 + 16));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int i15;
        TextPaint textPaint = this.f6538f;
        int color = textPaint.getColor();
        j6 j6Var = this.e;
        int color2 = j6Var.f25846a.getColor();
        Drawable drawable = this.f6536b;
        Drawable drawable2 = this.f6535a;
        if (color != color2) {
            j6Var.r(textPaint.getColor());
            int color3 = j6Var.f25846a.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(j6Var.f25846a.getColor(), mode));
        }
        canvas.save();
        if (this.d && !this.f6537c) {
            i15 = AndroidUtilities.dp(8.0f);
        } else {
            i15 = 0;
        }
        canvas.translate(f10 + i15, -AndroidUtilities.dp(0.2f));
        if (this.h == 1) {
            canvas.translate(AndroidUtilities.dp(1.5f), 0.0f);
            drawable2.draw(canvas);
        } else {
            drawable.draw(canvas);
        }
        canvas.translate(AndroidUtilities.dp(16.0f), 0.0f);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, 0, (int) j6Var.d(), (int) j6Var.e);
        j6Var.setBounds(rect);
        j6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
