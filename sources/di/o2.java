package di;

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
public final class o2 extends n2 {
    public Drawable f7719i;
    public Drawable f7720j;
    public StaticLayout f7721k;
    public float f7722l;
    public float f7723m;
    public Paint f7724n;
    public final r2 f7725o;

    public o2(r2 r2Var, int i10, int i11, String str) {
        super(r2Var);
        this.f7725o = r2Var;
        this.f7671a = i10;
        Drawable mutate = r2Var.getContext().getResources().getDrawable(i11).mutate();
        this.f7719i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = r2Var.f8058b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f7721k = staticLayout;
        this.f7722l = staticLayout.getLineCount() > 0 ? this.f7721k.getLineWidth(0) : 0.0f;
        this.f7723m = this.f7721k.getLineCount() > 0 ? this.f7721k.getLineLeft(0) : 0.0f;
        this.f7672b = AndroidUtilities.dpf2(45.6f) + this.f7722l;
        this.f7673c = AndroidUtilities.dpf2(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        RectF rectF = this.f7675f;
        rectF.set(f7, f10, this.f7672b + f7, this.f7673c + f10);
        float a2 = this.f7676g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f7725o.f8057a);
        if (this.f7720j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i10 = 0;
        if (this.f7719i == null) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(null);
            this.f7719i = emojiBigDrawable;
            if (emojiBigDrawable instanceof Emoji.EmojiDrawable) {
                ((Emoji.EmojiDrawable) emojiBigDrawable).fullSize = false;
            }
        }
        if (this.f7719i != null) {
            float dp = AndroidUtilities.dp(24.0f) / 2;
            this.f7719i.setBounds((int) ((rectF.left + AndroidUtilities.dp(18.0f)) - dp), (int) (((this.f7673c / 2.0f) + rectF.top) - dp), (int) (rectF.left + AndroidUtilities.dp(18.0f) + dp), (int) ((this.f7673c / 2.0f) + rectF.top + dp));
            this.f7719i.draw(canvas);
        }
        if (this.f7720j != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rectF.left + AndroidUtilities.dp(18.55f), ((rectF.top + this.f7673c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.55f), rectF.left + AndroidUtilities.dp(29.45f), rectF.left + AndroidUtilities.dp(31.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f7724n);
            this.f7720j.setBounds((int) (rectF.left + AndroidUtilities.dp(18.0f)), (int) (((rectF.top + this.f7673c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.0f)), (int) (rectF.left + AndroidUtilities.dp(30.0f)), (int) ((rectF.top + this.f7673c) - AndroidUtilities.dp(5.0f)));
            this.f7720j.draw(canvas);
            canvas.restore();
        }
        float f11 = rectF.left;
        if (this.f7719i != null) {
            i10 = 28;
        }
        canvas.translate((f11 + AndroidUtilities.dp(i10 + 6)) - this.f7723m, ((this.f7673c / 2.0f) + rectF.top) - (this.f7721k.getHeight() / 2.0f));
        this.f7721k.draw(canvas);
        canvas.restore();
    }

    public o2(r2 r2Var, CharSequence charSequence) {
        super(r2Var);
        this.f7725o = r2Var;
        this.f7671a = 5;
        TextPaint textPaint = r2Var.f8058b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f7721k = staticLayout;
        this.f7722l = staticLayout.getLineCount() > 0 ? this.f7721k.getLineWidth(0) : 0.0f;
        this.f7723m = this.f7721k.getLineCount() > 0 ? this.f7721k.getLineLeft(0) : 0.0f;
        this.f7672b = AndroidUtilities.dpf2(12.0f) + this.f7722l;
        this.f7673c = AndroidUtilities.dpf2(36.0f);
    }
}
