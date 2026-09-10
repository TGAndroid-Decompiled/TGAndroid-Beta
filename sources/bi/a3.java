package bi;

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
public final class a3 extends z2 {
    public Drawable f2304i;
    public Drawable f2305j;
    public StaticLayout f2306k;
    public float f2307l;
    public float f2308m;
    public Paint f2309n;
    public final d3 f2310o;

    public a3(d3 d3Var, int i10, int i11, String str) {
        super(d3Var);
        this.f2310o = d3Var;
        this.f3997a = i10;
        Drawable mutate = d3Var.getContext().getResources().getDrawable(i11).mutate();
        this.f2304i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = d3Var.f2542b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f2306k = staticLayout;
        this.f2307l = staticLayout.getLineCount() > 0 ? this.f2306k.getLineWidth(0) : 0.0f;
        this.f2308m = this.f2306k.getLineCount() > 0 ? this.f2306k.getLineLeft(0) : 0.0f;
        this.f3998b = AndroidUtilities.dpf2(45.6f) + this.f2307l;
        this.f3999c = AndroidUtilities.dpf2(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        RectF rectF = this.f4000f;
        rectF.set(f7, f10, this.f3998b + f7, this.f3999c + f10);
        float a2 = this.f4001g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f2310o.f2541a);
        if (this.f2305j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i10 = 0;
        if (this.f2304i == null) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(null);
            this.f2304i = emojiBigDrawable;
            if (emojiBigDrawable instanceof Emoji.EmojiDrawable) {
                ((Emoji.EmojiDrawable) emojiBigDrawable).fullSize = false;
            }
        }
        if (this.f2304i != null) {
            float dp = AndroidUtilities.dp(24.0f) / 2;
            this.f2304i.setBounds((int) ((rectF.left + AndroidUtilities.dp(18.0f)) - dp), (int) (((this.f3999c / 2.0f) + rectF.top) - dp), (int) (rectF.left + AndroidUtilities.dp(18.0f) + dp), (int) ((this.f3999c / 2.0f) + rectF.top + dp));
            this.f2304i.draw(canvas);
        }
        if (this.f2305j != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rectF.left + AndroidUtilities.dp(18.55f), ((rectF.top + this.f3999c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.55f), rectF.left + AndroidUtilities.dp(29.45f), rectF.left + AndroidUtilities.dp(31.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f2309n);
            this.f2305j.setBounds((int) (rectF.left + AndroidUtilities.dp(18.0f)), (int) (((rectF.top + this.f3999c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.0f)), (int) (rectF.left + AndroidUtilities.dp(30.0f)), (int) ((rectF.top + this.f3999c) - AndroidUtilities.dp(5.0f)));
            this.f2305j.draw(canvas);
            canvas.restore();
        }
        float f11 = rectF.left;
        if (this.f2304i != null) {
            i10 = 28;
        }
        canvas.translate((f11 + AndroidUtilities.dp(i10 + 6)) - this.f2308m, ((this.f3999c / 2.0f) + rectF.top) - (this.f2306k.getHeight() / 2.0f));
        this.f2306k.draw(canvas);
        canvas.restore();
    }

    public a3(d3 d3Var, CharSequence charSequence) {
        super(d3Var);
        this.f2310o = d3Var;
        this.f3997a = 5;
        TextPaint textPaint = d3Var.f2542b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f2306k = staticLayout;
        this.f2307l = staticLayout.getLineCount() > 0 ? this.f2306k.getLineWidth(0) : 0.0f;
        this.f2308m = this.f2306k.getLineCount() > 0 ? this.f2306k.getLineLeft(0) : 0.0f;
        this.f3998b = AndroidUtilities.dpf2(12.0f) + this.f2307l;
        this.f3999c = AndroidUtilities.dpf2(36.0f);
    }
}
