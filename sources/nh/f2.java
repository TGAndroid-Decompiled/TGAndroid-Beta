package nh;

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
public final class f2 extends e2 {
    public Drawable f17622i;
    public Drawable f17623j;
    public StaticLayout f17624k;
    public float f17625l;
    public float f17626m;
    public Paint f17627n;
    public final i2 f17628o;

    public f2(i2 i2Var, int i10, int i11, String str) {
        super(i2Var);
        this.f17628o = i2Var;
        this.f17585a = i10;
        Drawable mutate = i2Var.getContext().getResources().getDrawable(i11).mutate();
        this.f17622i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = i2Var.f17878b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f17624k = staticLayout;
        this.f17625l = staticLayout.getLineCount() > 0 ? this.f17624k.getLineWidth(0) : 0.0f;
        this.f17626m = this.f17624k.getLineCount() > 0 ? this.f17624k.getLineLeft(0) : 0.0f;
        this.f17586b = AndroidUtilities.dpf2(45.6f) + this.f17625l;
        this.f17587c = AndroidUtilities.dpf2(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f9, float f10) {
        RectF rectF = this.f17589f;
        rectF.set(f9, f10, this.f17586b + f9, this.f17587c + f10);
        float a2 = this.f17590g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f17628o.f17877a);
        if (this.f17623j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i10 = 0;
        if (this.f17622i == null) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(null);
            this.f17622i = emojiBigDrawable;
            if (emojiBigDrawable instanceof Emoji.EmojiDrawable) {
                ((Emoji.EmojiDrawable) emojiBigDrawable).fullSize = false;
            }
        }
        if (this.f17622i != null) {
            float dp = AndroidUtilities.dp(24.0f) / 2;
            this.f17622i.setBounds((int) ((rectF.left + AndroidUtilities.dp(18.0f)) - dp), (int) (((this.f17587c / 2.0f) + rectF.top) - dp), (int) (rectF.left + AndroidUtilities.dp(18.0f) + dp), (int) ((this.f17587c / 2.0f) + rectF.top + dp));
            this.f17622i.draw(canvas);
        }
        if (this.f17623j != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rectF.left + AndroidUtilities.dp(18.55f), ((rectF.top + this.f17587c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.55f), rectF.left + AndroidUtilities.dp(29.45f), rectF.left + AndroidUtilities.dp(31.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f17627n);
            this.f17623j.setBounds((int) (rectF.left + AndroidUtilities.dp(18.0f)), (int) (((rectF.top + this.f17587c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.0f)), (int) (rectF.left + AndroidUtilities.dp(30.0f)), (int) ((rectF.top + this.f17587c) - AndroidUtilities.dp(5.0f)));
            this.f17623j.draw(canvas);
            canvas.restore();
        }
        float f11 = rectF.left;
        if (this.f17622i != null) {
            i10 = 28;
        }
        canvas.translate((f11 + AndroidUtilities.dp(i10 + 6)) - this.f17626m, ((this.f17587c / 2.0f) + rectF.top) - (this.f17624k.getHeight() / 2.0f));
        this.f17624k.draw(canvas);
        canvas.restore();
    }

    public f2(i2 i2Var, CharSequence charSequence) {
        super(i2Var);
        this.f17628o = i2Var;
        this.f17585a = 5;
        TextPaint textPaint = i2Var.f17878b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f17624k = staticLayout;
        this.f17625l = staticLayout.getLineCount() > 0 ? this.f17624k.getLineWidth(0) : 0.0f;
        this.f17626m = this.f17624k.getLineCount() > 0 ? this.f17624k.getLineLeft(0) : 0.0f;
        this.f17586b = AndroidUtilities.dpf2(12.0f) + this.f17625l;
        this.f17587c = AndroidUtilities.dpf2(36.0f);
    }
}
