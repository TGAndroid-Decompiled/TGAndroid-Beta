package ci;

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
public final class m2 extends l2 {
    public Drawable f5581i;
    public Drawable f5582j;
    public StaticLayout f5583k;
    public float f5584l;
    public float f5585m;
    public Paint f5586n;
    public final p2 f5587o;

    public m2(p2 p2Var, int i10, int i11, String str) {
        super(p2Var);
        this.f5587o = p2Var;
        this.f5377a = i10;
        Drawable mutate = p2Var.getContext().getResources().getDrawable(i11).mutate();
        this.f5581i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = p2Var.f5717b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f5583k = staticLayout;
        this.f5584l = staticLayout.getLineCount() > 0 ? this.f5583k.getLineWidth(0) : 0.0f;
        this.f5585m = this.f5583k.getLineCount() > 0 ? this.f5583k.getLineLeft(0) : 0.0f;
        this.f5378b = AndroidUtilities.dpf2(45.6f) + this.f5584l;
        this.f5379c = AndroidUtilities.dpf2(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        RectF rectF = this.f5381f;
        rectF.set(f7, f10, this.f5378b + f7, this.f5379c + f10);
        float a2 = this.f5382g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f5587o.f5716a);
        if (this.f5582j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i10 = 0;
        if (this.f5581i == null) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(null);
            this.f5581i = emojiBigDrawable;
            if (emojiBigDrawable instanceof Emoji.EmojiDrawable) {
                ((Emoji.EmojiDrawable) emojiBigDrawable).fullSize = false;
            }
        }
        if (this.f5581i != null) {
            float dp = AndroidUtilities.dp(24.0f) / 2;
            this.f5581i.setBounds((int) ((rectF.left + AndroidUtilities.dp(18.0f)) - dp), (int) (((this.f5379c / 2.0f) + rectF.top) - dp), (int) (rectF.left + AndroidUtilities.dp(18.0f) + dp), (int) ((this.f5379c / 2.0f) + rectF.top + dp));
            this.f5581i.draw(canvas);
        }
        if (this.f5582j != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rectF.left + AndroidUtilities.dp(18.55f), ((rectF.top + this.f5379c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.55f), rectF.left + AndroidUtilities.dp(29.45f), rectF.left + AndroidUtilities.dp(31.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f5586n);
            this.f5582j.setBounds((int) (rectF.left + AndroidUtilities.dp(18.0f)), (int) (((rectF.top + this.f5379c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.0f)), (int) (rectF.left + AndroidUtilities.dp(30.0f)), (int) ((rectF.top + this.f5379c) - AndroidUtilities.dp(5.0f)));
            this.f5582j.draw(canvas);
            canvas.restore();
        }
        float f11 = rectF.left;
        if (this.f5581i != null) {
            i10 = 28;
        }
        canvas.translate((f11 + AndroidUtilities.dp(i10 + 6)) - this.f5585m, ((this.f5379c / 2.0f) + rectF.top) - (this.f5583k.getHeight() / 2.0f));
        this.f5583k.draw(canvas);
        canvas.restore();
    }

    public m2(p2 p2Var, CharSequence charSequence) {
        super(p2Var);
        this.f5587o = p2Var;
        this.f5377a = 5;
        TextPaint textPaint = p2Var.f5717b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f5583k = staticLayout;
        this.f5584l = staticLayout.getLineCount() > 0 ? this.f5583k.getLineWidth(0) : 0.0f;
        this.f5585m = this.f5583k.getLineCount() > 0 ? this.f5583k.getLineLeft(0) : 0.0f;
        this.f5378b = AndroidUtilities.dpf2(12.0f) + this.f5584l;
        this.f5379c = AndroidUtilities.dpf2(36.0f);
    }
}
