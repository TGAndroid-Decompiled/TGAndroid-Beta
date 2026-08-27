package cg;

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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i6;

public final class a extends ReplacementSpan {

    public final Drawable f2589a;

    public final Drawable f2590b;

    public boolean f2591c;
    public boolean d;

    public final i6 f2592e;

    public final TextPaint f2593f;
    public final int h;

    public a(org.telegram.ui.Cells.s1 s1Var, TextPaint textPaint, int i10) {
        this.f2593f = textPaint;
        i6 i6Var = new i6(false, false, true, false);
        this.f2592e = i6Var;
        i6Var.k(0.3f, 250L, er.h);
        i6Var.setCallback(s1Var);
        i6Var.t(AndroidUtilities.dp(11.5f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.q("", true, true);
        i6Var.f29239b = 17;
        Drawable drawableMutate = s1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge).mutate();
        this.f2589a = drawableMutate;
        Drawable drawableMutate2 = s1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge2).mutate();
        this.f2590b = drawableMutate2;
        drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
        drawableMutate2.setBounds(0, 0, drawableMutate2.getIntrinsicWidth(), drawableMutate2.getIntrinsicHeight());
        this.h = i10;
        i6Var.q(i10 > 1 ? String.valueOf(i10) : "", false, true);
    }

    public static Pair a(org.telegram.ui.Cells.s1 s1Var, TextPaint textPaint, int i10) {
        SpannableString spannableString = new SpannableString("d");
        a aVar = new a(s1Var, textPaint, i10);
        spannableString.setSpan(aVar, 0, 1, 33);
        return new Pair(spannableString, aVar);
    }

    public final int b() {
        return (int) (this.f2592e.e() + AndroidUtilities.dp((this.d ? 8 : 0) + 16));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        TextPaint textPaint = this.f2593f;
        int color = textPaint.getColor();
        i6 i6Var = this.f2592e;
        int color2 = i6Var.f29238a.getColor();
        Drawable drawable = this.f2590b;
        Drawable drawable2 = this.f2589a;
        if (color != color2) {
            i6Var.r(textPaint.getColor());
            int color3 = i6Var.f29238a.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(i6Var.f29238a.getColor(), mode));
        }
        canvas.save();
        canvas.translate(f10 + ((!this.d || this.f2591c) ? 0 : AndroidUtilities.dp(8.0f)), -AndroidUtilities.dp(0.2f));
        if (this.h == 1) {
            canvas.translate(AndroidUtilities.dp(1.5f), 0.0f);
            drawable2.draw(canvas);
        } else {
            drawable.draw(canvas);
        }
        canvas.translate(AndroidUtilities.dp(16.0f), 0.0f);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, 0, (int) i6Var.d(), (int) i6Var.f29241e);
        i6Var.setBounds(rect);
        i6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
