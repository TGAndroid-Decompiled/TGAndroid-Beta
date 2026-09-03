package lg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class a extends Drawable {
    public final TextPaint f12059a;
    public final TextPaint f12060b;
    public final RectF f12061c;
    public final Drawable d;
    public float e;
    public String f12062f;

    public a(Context context) {
        TextPaint textPaint = new TextPaint(1);
        this.f12059a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f12060b = textPaint2;
        this.f12061c = new RectF();
        textPaint.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint2.setColor(-6915073);
        this.d = context.getDrawable(R.drawable.mini_boost_badge);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f12061c;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f12060b);
        int dp = AndroidUtilities.dp(2.0f) + bounds.left;
        int dp2 = AndroidUtilities.dp(1.0f) + bounds.top;
        int dp3 = AndroidUtilities.dp(2.0f) + bounds.left;
        Drawable drawable = this.d;
        drawable.setBounds(dp, dp2, drawable.getIntrinsicWidth() + dp3, drawable.getIntrinsicHeight() + AndroidUtilities.dp(1.0f) + getBounds().top);
        drawable.draw(canvas);
        String str = this.f12062f;
        if (str != null) {
            canvas.drawText(str, AndroidUtilities.dp(16.5f) + bounds.left, AndroidUtilities.dp(13.0f) + bounds.top, this.f12059a);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (AndroidUtilities.dp(23.0f) + this.e);
    }

    @Override
    public final int getOpacity() {
        return -1;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
