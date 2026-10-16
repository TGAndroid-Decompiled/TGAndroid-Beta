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
public final class m2 extends l2 {
    public Drawable f7413i;
    public Drawable f7414j;
    public StaticLayout f7415k;
    public float f7416l;
    public float f7417m;
    public Paint f7418n;
    public final p2 f7419o;

    public m2(p2 p2Var, int i10, int i11, String str) {
        super(p2Var);
        this.f7419o = p2Var;
        this.f7346a = i10;
        Drawable mutate = p2Var.getContext().getResources().getDrawable(i11).mutate();
        this.f7413i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = p2Var.f7581b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f7415k = staticLayout;
        this.f7416l = staticLayout.getLineCount() > 0 ? this.f7415k.getLineWidth(0) : 0.0f;
        this.f7417m = this.f7415k.getLineCount() > 0 ? this.f7415k.getLineLeft(0) : 0.0f;
        this.f7347b = AndroidUtilities.dpf2(45.6f) + this.f7416l;
        this.f7348c = AndroidUtilities.dpf2(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        RectF rectF = this.f7349f;
        rectF.set(f7, f10, this.f7347b + f7, this.f7348c + f10);
        float a2 = this.f7350g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f7419o.f7580a);
        if (this.f7414j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i10 = 0;
        if (this.f7413i == null) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(null);
            this.f7413i = emojiBigDrawable;
            if (emojiBigDrawable instanceof Emoji.EmojiDrawable) {
                ((Emoji.EmojiDrawable) emojiBigDrawable).fullSize = false;
            }
        }
        if (this.f7413i != null) {
            float dp = AndroidUtilities.dp(24.0f) / 2;
            this.f7413i.setBounds((int) ((rectF.left + AndroidUtilities.dp(18.0f)) - dp), (int) (((this.f7348c / 2.0f) + rectF.top) - dp), (int) (rectF.left + AndroidUtilities.dp(18.0f) + dp), (int) ((this.f7348c / 2.0f) + rectF.top + dp));
            this.f7413i.draw(canvas);
        }
        if (this.f7414j != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rectF.left + AndroidUtilities.dp(18.55f), ((rectF.top + this.f7348c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.55f), rectF.left + AndroidUtilities.dp(29.45f), rectF.left + AndroidUtilities.dp(31.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f7418n);
            this.f7414j.setBounds((int) (rectF.left + AndroidUtilities.dp(18.0f)), (int) (((rectF.top + this.f7348c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.0f)), (int) (rectF.left + AndroidUtilities.dp(30.0f)), (int) ((rectF.top + this.f7348c) - AndroidUtilities.dp(5.0f)));
            this.f7414j.draw(canvas);
            canvas.restore();
        }
        float f11 = rectF.left;
        if (this.f7413i != null) {
            i10 = 28;
        }
        canvas.translate((f11 + AndroidUtilities.dp(i10 + 6)) - this.f7417m, ((this.f7348c / 2.0f) + rectF.top) - (this.f7415k.getHeight() / 2.0f));
        this.f7415k.draw(canvas);
        canvas.restore();
    }

    public m2(p2 p2Var, CharSequence charSequence) {
        super(p2Var);
        this.f7419o = p2Var;
        this.f7346a = 5;
        TextPaint textPaint = p2Var.f7581b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f7415k = staticLayout;
        this.f7416l = staticLayout.getLineCount() > 0 ? this.f7415k.getLineWidth(0) : 0.0f;
        this.f7417m = this.f7415k.getLineCount() > 0 ? this.f7415k.getLineLeft(0) : 0.0f;
        this.f7347b = AndroidUtilities.dpf2(12.0f) + this.f7416l;
        this.f7348c = AndroidUtilities.dpf2(36.0f);
    }
}
