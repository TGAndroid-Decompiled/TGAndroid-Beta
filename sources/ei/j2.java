package ei;

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
public final class j2 extends i2 {
    public Drawable f9237i;
    public Drawable f9238j;
    public StaticLayout f9239k;
    public float f9240l;
    public float f9241m;
    public Paint f9242n;
    public final l2 f9243o;

    public j2(l2 l2Var, int i10, int i11, String str) {
        super(l2Var);
        this.f9243o = l2Var;
        this.f9186a = i10;
        Drawable mutate = l2Var.getContext().getResources().getDrawable(i11).mutate();
        this.f9237i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = l2Var.f9362b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f9239k = staticLayout;
        this.f9240l = staticLayout.getLineCount() > 0 ? this.f9239k.getLineWidth(0) : 0.0f;
        this.f9241m = this.f9239k.getLineCount() > 0 ? this.f9239k.getLineLeft(0) : 0.0f;
        this.f9187b = AndroidUtilities.dpf2(45.6f) + this.f9240l;
        this.f9188c = AndroidUtilities.dpf2(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        RectF rectF = this.f9189f;
        rectF.set(f7, f10, this.f9187b + f7, this.f9188c + f10);
        float a2 = this.f9190g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f9243o.f9361a);
        if (this.f9238j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i10 = 0;
        if (this.f9237i == null) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(null);
            this.f9237i = emojiBigDrawable;
            if (emojiBigDrawable instanceof Emoji.EmojiDrawable) {
                ((Emoji.EmojiDrawable) emojiBigDrawable).fullSize = false;
            }
        }
        if (this.f9237i != null) {
            float dp = AndroidUtilities.dp(24.0f) / 2;
            this.f9237i.setBounds((int) ((rectF.left + AndroidUtilities.dp(18.0f)) - dp), (int) (((this.f9188c / 2.0f) + rectF.top) - dp), (int) (rectF.left + AndroidUtilities.dp(18.0f) + dp), (int) ((this.f9188c / 2.0f) + rectF.top + dp));
            this.f9237i.draw(canvas);
        }
        if (this.f9238j != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rectF.left + AndroidUtilities.dp(18.55f), ((rectF.top + this.f9188c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.55f), rectF.left + AndroidUtilities.dp(29.45f), rectF.left + AndroidUtilities.dp(31.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f9242n);
            this.f9238j.setBounds((int) (rectF.left + AndroidUtilities.dp(18.0f)), (int) (((rectF.top + this.f9188c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.0f)), (int) (rectF.left + AndroidUtilities.dp(30.0f)), (int) ((rectF.top + this.f9188c) - AndroidUtilities.dp(5.0f)));
            this.f9238j.draw(canvas);
            canvas.restore();
        }
        float f11 = rectF.left;
        if (this.f9237i != null) {
            i10 = 28;
        }
        canvas.translate((f11 + AndroidUtilities.dp(i10 + 6)) - this.f9241m, ((this.f9188c / 2.0f) + rectF.top) - (this.f9239k.getHeight() / 2.0f));
        this.f9239k.draw(canvas);
        canvas.restore();
    }

    public j2(l2 l2Var, CharSequence charSequence) {
        super(l2Var);
        this.f9243o = l2Var;
        this.f9186a = 5;
        TextPaint textPaint = l2Var.f9362b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f9239k = staticLayout;
        this.f9240l = staticLayout.getLineCount() > 0 ? this.f9239k.getLineWidth(0) : 0.0f;
        this.f9241m = this.f9239k.getLineCount() > 0 ? this.f9239k.getLineLeft(0) : 0.0f;
        this.f9187b = AndroidUtilities.dpf2(12.0f) + this.f9240l;
        this.f9188c = AndroidUtilities.dpf2(36.0f);
    }
}
