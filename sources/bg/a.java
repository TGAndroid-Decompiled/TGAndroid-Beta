package bg;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
public final class a extends ReplacementSpan {
    public final Drawable f1685a;
    public final Drawable f1686b;
    public boolean f1687c;
    public boolean d;
    public final i6 f1688e;
    public final TextPaint f1689f;
    public final int h;

    public a(org.telegram.ui.Cells.t1 t1Var, TextPaint textPaint, int i9) {
        this.f1689f = textPaint;
        i6 i6Var = new i6(false, false, true, false);
        this.f1688e = i6Var;
        i6Var.k(0.3f, 250L, gr.h);
        i6Var.setCallback(t1Var);
        i6Var.t(AndroidUtilities.dp(11.5f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.q("", true, true);
        i6Var.f29333b = 17;
        Drawable mutate = t1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge).mutate();
        this.f1685a = mutate;
        Drawable mutate2 = t1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge2).mutate();
        this.f1686b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i9;
        i6Var.q(i9 > 1 ? String.valueOf(i9) : "", false, true);
    }

    public static Pair a(org.telegram.ui.Cells.t1 t1Var, TextPaint textPaint, int i9) {
        SpannableString spannableString = new SpannableString("d");
        a aVar = new a(t1Var, textPaint, i9);
        spannableString.setSpan(aVar, 0, 1, 33);
        return new Pair(spannableString, aVar);
    }

    public final int b() {
        int i9;
        if (this.d) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        return (int) (this.f1688e.e() + AndroidUtilities.dp(i9 + 16));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14;
        TextPaint textPaint = this.f1689f;
        int color = textPaint.getColor();
        i6 i6Var = this.f1688e;
        int color2 = i6Var.f29332a.getColor();
        Drawable drawable = this.f1686b;
        Drawable drawable2 = this.f1685a;
        if (color != color2) {
            i6Var.r(textPaint.getColor());
            int color3 = i6Var.f29332a.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(i6Var.f29332a.getColor(), mode));
        }
        canvas.save();
        if (this.d && !this.f1687c) {
            i14 = AndroidUtilities.dp(8.0f);
        } else {
            i14 = 0;
        }
        canvas.translate(f10 + i14, -AndroidUtilities.dp(0.2f));
        if (this.h == 1) {
            canvas.translate(AndroidUtilities.dp(1.5f), 0.0f);
            drawable2.draw(canvas);
        } else {
            drawable.draw(canvas);
        }
        canvas.translate(AndroidUtilities.dp(16.0f), 0.0f);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, 0, (int) i6Var.d(), (int) i6Var.f29335e);
        i6Var.setBounds(rect);
        i6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
