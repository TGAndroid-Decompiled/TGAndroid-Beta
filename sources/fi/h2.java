package fi;

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
public final class h2 extends g2 {
    public Drawable f10941i;
    public Drawable f10942j;
    public StaticLayout f10943k;
    public float f10944l;
    public float f10945m;
    public Paint f10946n;
    public final j2 f10947o;

    public h2(j2 j2Var, int i10, int i11, String str) {
        super(j2Var);
        this.f10947o = j2Var;
        this.f10892a = i10;
        Drawable mutate = j2Var.getContext().getResources().getDrawable(i11).mutate();
        this.f10941i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = j2Var.f11042b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f10943k = staticLayout;
        this.f10944l = staticLayout.getLineCount() > 0 ? this.f10943k.getLineWidth(0) : 0.0f;
        this.f10945m = this.f10943k.getLineCount() > 0 ? this.f10943k.getLineLeft(0) : 0.0f;
        this.f10893b = AndroidUtilities.dpf2(45.6f) + this.f10944l;
        this.f10894c = AndroidUtilities.dpf2(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        RectF rectF = this.f10895f;
        rectF.set(f7, f10, this.f10893b + f7, this.f10894c + f10);
        float a2 = this.f10896g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f10947o.f11041a);
        if (this.f10942j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i10 = 0;
        if (this.f10941i == null) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(null);
            this.f10941i = emojiBigDrawable;
            if (emojiBigDrawable instanceof Emoji.EmojiDrawable) {
                ((Emoji.EmojiDrawable) emojiBigDrawable).fullSize = false;
            }
        }
        if (this.f10941i != null) {
            float dp = AndroidUtilities.dp(24.0f) / 2;
            this.f10941i.setBounds((int) ((rectF.left + AndroidUtilities.dp(18.0f)) - dp), (int) (((this.f10894c / 2.0f) + rectF.top) - dp), (int) (rectF.left + AndroidUtilities.dp(18.0f) + dp), (int) ((this.f10894c / 2.0f) + rectF.top + dp));
            this.f10941i.draw(canvas);
        }
        if (this.f10942j != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rectF.left + AndroidUtilities.dp(18.55f), ((rectF.top + this.f10894c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.55f), rectF.left + AndroidUtilities.dp(29.45f), rectF.left + AndroidUtilities.dp(31.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f10946n);
            this.f10942j.setBounds((int) (rectF.left + AndroidUtilities.dp(18.0f)), (int) (((rectF.top + this.f10894c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.0f)), (int) (rectF.left + AndroidUtilities.dp(30.0f)), (int) ((rectF.top + this.f10894c) - AndroidUtilities.dp(5.0f)));
            this.f10942j.draw(canvas);
            canvas.restore();
        }
        float f11 = rectF.left;
        if (this.f10941i != null) {
            i10 = 28;
        }
        canvas.translate((f11 + AndroidUtilities.dp(i10 + 6)) - this.f10945m, ((this.f10894c / 2.0f) + rectF.top) - (this.f10943k.getHeight() / 2.0f));
        this.f10943k.draw(canvas);
        canvas.restore();
    }

    public h2(j2 j2Var, CharSequence charSequence) {
        super(j2Var);
        this.f10947o = j2Var;
        this.f10892a = 5;
        TextPaint textPaint = j2Var.f11042b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f10943k = staticLayout;
        this.f10944l = staticLayout.getLineCount() > 0 ? this.f10943k.getLineWidth(0) : 0.0f;
        this.f10945m = this.f10943k.getLineCount() > 0 ? this.f10943k.getLineLeft(0) : 0.0f;
        this.f10893b = AndroidUtilities.dpf2(12.0f) + this.f10944l;
        this.f10894c = AndroidUtilities.dpf2(36.0f);
    }
}
