package kh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
public final class i2 extends h2 {
    public Drawable f15412i;
    public Drawable f15413j;
    public StaticLayout f15414k;
    public float f15415l;
    public float f15416m;
    public Paint f15417n;
    public final l2 f15418o;

    public i2(l2 l2Var, int i9, int i10, String str) {
        super(l2Var);
        this.f15418o = l2Var;
        this.f15386a = i9;
        Drawable mutate = l2Var.getContext().getResources().getDrawable(i10).mutate();
        this.f15412i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = l2Var.f15583b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f15414k = staticLayout;
        this.f15415l = staticLayout.getLineCount() > 0 ? this.f15414k.getLineWidth(0) : 0.0f;
        this.f15416m = this.f15414k.getLineCount() > 0 ? this.f15414k.getLineLeft(0) : 0.0f;
        this.f15387b = AndroidUtilities.dpf2(45.6f) + this.f15415l;
        this.f15388c = AndroidUtilities.dpf2(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        RectF rectF = this.f15390f;
        rectF.set(f10, f11, this.f15387b + f10, this.f15388c + f11);
        float a2 = this.f15391g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f15418o.f15582a);
        if (this.f15413j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i9 = 0;
        if (this.f15412i == null) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(null);
            this.f15412i = emojiBigDrawable;
            if (emojiBigDrawable instanceof Emoji.EmojiDrawable) {
                ((Emoji.EmojiDrawable) emojiBigDrawable).fullSize = false;
            }
        }
        if (this.f15412i != null) {
            float dp = AndroidUtilities.dp(24.0f) / 2;
            this.f15412i.setBounds((int) ((rectF.left + AndroidUtilities.dp(18.0f)) - dp), (int) (((this.f15388c / 2.0f) + rectF.top) - dp), (int) (rectF.left + AndroidUtilities.dp(18.0f) + dp), (int) ((this.f15388c / 2.0f) + rectF.top + dp));
            this.f15412i.draw(canvas);
        }
        if (this.f15413j != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rectF.left + AndroidUtilities.dp(18.55f), ((rectF.top + this.f15388c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.55f), rectF.left + AndroidUtilities.dp(29.45f), rectF.left + AndroidUtilities.dp(31.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f15417n);
            this.f15413j.setBounds((int) (rectF.left + AndroidUtilities.dp(18.0f)), (int) (((rectF.top + this.f15388c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.0f)), (int) (rectF.left + AndroidUtilities.dp(30.0f)), (int) ((rectF.top + this.f15388c) - AndroidUtilities.dp(5.0f)));
            this.f15413j.draw(canvas);
            canvas.restore();
        }
        float f12 = rectF.left;
        if (this.f15412i != null) {
            i9 = 28;
        }
        canvas.translate((f12 + AndroidUtilities.dp(i9 + 6)) - this.f15416m, ((this.f15388c / 2.0f) + rectF.top) - (this.f15414k.getHeight() / 2.0f));
        this.f15414k.draw(canvas);
        canvas.restore();
    }

    public i2(l2 l2Var, CharSequence charSequence) {
        super(l2Var);
        this.f15418o = l2Var;
        this.f15386a = 5;
        TextPaint textPaint = l2Var.f15583b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f15414k = staticLayout;
        this.f15415l = staticLayout.getLineCount() > 0 ? this.f15414k.getLineWidth(0) : 0.0f;
        this.f15416m = this.f15414k.getLineCount() > 0 ? this.f15414k.getLineLeft(0) : 0.0f;
        this.f15387b = AndroidUtilities.dpf2(12.0f) + this.f15415l;
        this.f15388c = AndroidUtilities.dpf2(36.0f);
    }
}
