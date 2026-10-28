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
    public Drawable f10940i;
    public Drawable f10941j;
    public StaticLayout f10942k;
    public float f10943l;
    public float f10944m;
    public Paint f10945n;
    public final j2 f10946o;

    public h2(j2 j2Var, int i10, int i11, String str) {
        super(j2Var);
        this.f10946o = j2Var;
        this.f10891a = i10;
        Drawable mutate = j2Var.getContext().getResources().getDrawable(i11).mutate();
        this.f10940i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = j2Var.f11041b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f10942k = staticLayout;
        this.f10943l = staticLayout.getLineCount() > 0 ? this.f10942k.getLineWidth(0) : 0.0f;
        this.f10944m = this.f10942k.getLineCount() > 0 ? this.f10942k.getLineLeft(0) : 0.0f;
        this.f10892b = AndroidUtilities.dpf2(45.6f) + this.f10943l;
        this.f10893c = AndroidUtilities.dpf2(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        RectF rectF = this.f10894f;
        rectF.set(f7, f10, this.f10892b + f7, this.f10893c + f10);
        float a2 = this.f10895g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f10946o.f11040a);
        if (this.f10941j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i10 = 0;
        if (this.f10940i == null) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(null);
            this.f10940i = emojiBigDrawable;
            if (emojiBigDrawable instanceof Emoji.EmojiDrawable) {
                ((Emoji.EmojiDrawable) emojiBigDrawable).fullSize = false;
            }
        }
        if (this.f10940i != null) {
            float dp = AndroidUtilities.dp(24.0f) / 2;
            this.f10940i.setBounds((int) ((rectF.left + AndroidUtilities.dp(18.0f)) - dp), (int) (((this.f10893c / 2.0f) + rectF.top) - dp), (int) (rectF.left + AndroidUtilities.dp(18.0f) + dp), (int) ((this.f10893c / 2.0f) + rectF.top + dp));
            this.f10940i.draw(canvas);
        }
        if (this.f10941j != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rectF.left + AndroidUtilities.dp(18.55f), ((rectF.top + this.f10893c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.55f), rectF.left + AndroidUtilities.dp(29.45f), rectF.left + AndroidUtilities.dp(31.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f10945n);
            this.f10941j.setBounds((int) (rectF.left + AndroidUtilities.dp(18.0f)), (int) (((rectF.top + this.f10893c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.0f)), (int) (rectF.left + AndroidUtilities.dp(30.0f)), (int) ((rectF.top + this.f10893c) - AndroidUtilities.dp(5.0f)));
            this.f10941j.draw(canvas);
            canvas.restore();
        }
        float f11 = rectF.left;
        if (this.f10940i != null) {
            i10 = 28;
        }
        canvas.translate((f11 + AndroidUtilities.dp(i10 + 6)) - this.f10944m, ((this.f10893c / 2.0f) + rectF.top) - (this.f10942k.getHeight() / 2.0f));
        this.f10942k.draw(canvas);
        canvas.restore();
    }

    public h2(j2 j2Var, CharSequence charSequence) {
        super(j2Var);
        this.f10946o = j2Var;
        this.f10891a = 5;
        TextPaint textPaint = j2Var.f11041b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f10942k = staticLayout;
        this.f10943l = staticLayout.getLineCount() > 0 ? this.f10942k.getLineWidth(0) : 0.0f;
        this.f10944m = this.f10942k.getLineCount() > 0 ? this.f10942k.getLineLeft(0) : 0.0f;
        this.f10892b = AndroidUtilities.dpf2(12.0f) + this.f10943l;
        this.f10893c = AndroidUtilities.dpf2(36.0f);
    }
}
