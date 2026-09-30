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
public final class n2 extends m2 {
    public Drawable f5198i;
    public Drawable f5199j;
    public StaticLayout f5200k;
    public float f5201l;
    public float f5202m;
    public Paint f5203n;
    public final q2 f5204o;

    public n2(q2 q2Var, int i10, int i11, String str) {
        super(q2Var);
        this.f5204o = q2Var;
        this.f5167a = i10;
        Drawable mutate = q2Var.getContext().getResources().getDrawable(i11).mutate();
        this.f5198i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = q2Var.f5332b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f5200k = staticLayout;
        this.f5201l = staticLayout.getLineCount() > 0 ? this.f5200k.getLineWidth(0) : 0.0f;
        this.f5202m = this.f5200k.getLineCount() > 0 ? this.f5200k.getLineLeft(0) : 0.0f;
        this.f5168b = AndroidUtilities.dpf2(45.6f) + this.f5201l;
        this.f5169c = AndroidUtilities.dpf2(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        RectF rectF = this.f5170f;
        rectF.set(f7, f10, this.f5168b + f7, this.f5169c + f10);
        float a2 = this.f5171g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f5204o.f5331a);
        if (this.f5199j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i10 = 0;
        if (this.f5198i == null) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(null);
            this.f5198i = emojiBigDrawable;
            if (emojiBigDrawable instanceof Emoji.EmojiDrawable) {
                ((Emoji.EmojiDrawable) emojiBigDrawable).fullSize = false;
            }
        }
        if (this.f5198i != null) {
            float dp = AndroidUtilities.dp(24.0f) / 2;
            this.f5198i.setBounds((int) ((rectF.left + AndroidUtilities.dp(18.0f)) - dp), (int) (((this.f5169c / 2.0f) + rectF.top) - dp), (int) (rectF.left + AndroidUtilities.dp(18.0f) + dp), (int) ((this.f5169c / 2.0f) + rectF.top + dp));
            this.f5198i.draw(canvas);
        }
        if (this.f5199j != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rectF.left + AndroidUtilities.dp(18.55f), ((rectF.top + this.f5169c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.55f), rectF.left + AndroidUtilities.dp(29.45f), rectF.left + AndroidUtilities.dp(31.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f5203n);
            this.f5199j.setBounds((int) (rectF.left + AndroidUtilities.dp(18.0f)), (int) (((rectF.top + this.f5169c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.0f)), (int) (rectF.left + AndroidUtilities.dp(30.0f)), (int) ((rectF.top + this.f5169c) - AndroidUtilities.dp(5.0f)));
            this.f5199j.draw(canvas);
            canvas.restore();
        }
        float f11 = rectF.left;
        if (this.f5198i != null) {
            i10 = 28;
        }
        canvas.translate((f11 + AndroidUtilities.dp(i10 + 6)) - this.f5202m, ((this.f5169c / 2.0f) + rectF.top) - (this.f5200k.getHeight() / 2.0f));
        this.f5200k.draw(canvas);
        canvas.restore();
    }

    public n2(q2 q2Var, CharSequence charSequence) {
        super(q2Var);
        this.f5204o = q2Var;
        this.f5167a = 5;
        TextPaint textPaint = q2Var.f5332b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f5200k = staticLayout;
        this.f5201l = staticLayout.getLineCount() > 0 ? this.f5200k.getLineWidth(0) : 0.0f;
        this.f5202m = this.f5200k.getLineCount() > 0 ? this.f5200k.getLineLeft(0) : 0.0f;
        this.f5168b = AndroidUtilities.dpf2(12.0f) + this.f5201l;
        this.f5169c = AndroidUtilities.dpf2(36.0f);
    }
}
