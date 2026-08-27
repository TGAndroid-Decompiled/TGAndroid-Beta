package lh;

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

public final class g2 extends f2 {

    public Drawable f16024i;

    public Drawable f16025j;

    public StaticLayout f16026k;

    public float f16027l;

    public float f16028m;

    public Paint f16029n;

    public final j2 f16030o;

    public g2(j2 j2Var, int i10, int i11, String str) {
        super(j2Var);
        this.f16030o = j2Var;
        this.f15949a = i10;
        Drawable drawableMutate = j2Var.getContext().getResources().getDrawable(i11).mutate();
        this.f16024i = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = j2Var.f16169b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f16026k = staticLayout;
        this.f16027l = staticLayout.getLineCount() > 0 ? this.f16026k.getLineWidth(0) : 0.0f;
        this.f16028m = this.f16026k.getLineCount() > 0 ? this.f16026k.getLineLeft(0) : 0.0f;
        this.f15950b = AndroidUtilities.dpf2(45.6f) + this.f16027l;
        this.f15951c = AndroidUtilities.dpf2(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        float f12 = this.f15950b + f10;
        float f13 = this.f15951c + f11;
        RectF rectF = this.f15953f;
        rectF.set(f10, f11, f12, f13);
        float fA = this.f15954g.a(0.05f);
        canvas.save();
        canvas.scale(fA, fA, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f16030o.f16168a);
        if (this.f16025j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        if (this.f16024i == null) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(null);
            this.f16024i = emojiBigDrawable;
            if (emojiBigDrawable instanceof Emoji.EmojiDrawable) {
                ((Emoji.EmojiDrawable) emojiBigDrawable).fullSize = false;
            }
        }
        if (this.f16024i != null) {
            float fDp = AndroidUtilities.dp(24.0f) / 2;
            this.f16024i.setBounds((int) ((rectF.left + AndroidUtilities.dp(18.0f)) - fDp), (int) (((this.f15951c / 2.0f) + rectF.top) - fDp), (int) (rectF.left + AndroidUtilities.dp(18.0f) + fDp), (int) ((this.f15951c / 2.0f) + rectF.top + fDp));
            this.f16024i.draw(canvas);
        }
        if (this.f16025j != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rectF.left + AndroidUtilities.dp(18.55f), ((rectF.top + this.f15951c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.55f), rectF.left + AndroidUtilities.dp(29.45f), rectF.left + AndroidUtilities.dp(31.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f16029n);
            this.f16025j.setBounds((int) (rectF.left + AndroidUtilities.dp(18.0f)), (int) (((rectF.top + this.f15951c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.0f)), (int) (rectF.left + AndroidUtilities.dp(30.0f)), (int) ((rectF.top + this.f15951c) - AndroidUtilities.dp(5.0f)));
            this.f16025j.draw(canvas);
            canvas.restore();
        }
        canvas.translate((rectF.left + AndroidUtilities.dp(6 + (this.f16024i != null ? 28 : 0))) - this.f16028m, ((this.f15951c / 2.0f) + rectF.top) - (this.f16026k.getHeight() / 2.0f));
        this.f16026k.draw(canvas);
        canvas.restore();
    }

    public g2(j2 j2Var, CharSequence charSequence) {
        super(j2Var);
        this.f16030o = j2Var;
        this.f15949a = 5;
        TextPaint textPaint = j2Var.f16169b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f16026k = staticLayout;
        this.f16027l = staticLayout.getLineCount() > 0 ? this.f16026k.getLineWidth(0) : 0.0f;
        this.f16028m = this.f16026k.getLineCount() > 0 ? this.f16026k.getLineLeft(0) : 0.0f;
        this.f15950b = AndroidUtilities.dpf2(12.0f) + this.f16027l;
        this.f15951c = AndroidUtilities.dpf2(36.0f);
    }
}
