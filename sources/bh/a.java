package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.g0;
public final class a extends Drawable {
    public final TextPaint f3330a;
    public final TextPaint f3331b;
    public final RectF f3332c;
    public final Drawable d;
    public float f3333e;
    public String f3334f;

    public a(Context context) {
        TextPaint textPaint = new TextPaint(1);
        this.f3330a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f3331b = textPaint2;
        this.f3332c = new RectF();
        textPaint.setColor(-1);
        textPaint.setTypeface(g0.o());
        textPaint.setTextSize(g0.L(12.0f));
        textPaint2.setColor(-6915073);
        this.d = context.getDrawable(2131231932);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f3332c;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        canvas.drawRoundRect(rectF, g0.L(12.0f), g0.L(12.0f), this.f3331b);
        int L = g0.L(2.0f) + bounds.left;
        int L2 = g0.L(1.0f) + bounds.top;
        int L3 = g0.L(2.0f) + bounds.left;
        Drawable drawable = this.d;
        drawable.setBounds(L, L2, drawable.getIntrinsicWidth() + L3, drawable.getIntrinsicHeight() + g0.L(1.0f) + getBounds().top);
        drawable.draw(canvas);
        String str = this.f3334f;
        if (str != null) {
            canvas.drawText(str, g0.L(16.5f) + bounds.left, g0.L(13.0f) + bounds.top, this.f3330a);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return g0.L(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (g0.L(23.0f) + this.f3333e);
    }

    @Override
    public final int getOpacity() {
        return -1;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
