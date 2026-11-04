package ch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.g0;
public final class a extends Drawable {
    public final TextPaint f4769a;
    public final TextPaint f4770b;
    public final RectF f4771c;
    public final Drawable d;
    public float f4772e;
    public String f4773f;

    public a(Context context) {
        TextPaint textPaint = new TextPaint(1);
        this.f4769a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f4770b = textPaint2;
        this.f4771c = new RectF();
        textPaint.setColor(-1);
        textPaint.setTypeface(g0.o());
        textPaint.setTextSize(g0.L(12.0f));
        textPaint2.setColor(-6915073);
        this.d = context.getDrawable(2131231928);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f4771c;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        canvas.drawRoundRect(rectF, g0.L(12.0f), g0.L(12.0f), this.f4770b);
        int L = g0.L(2.0f) + bounds.left;
        int L2 = g0.L(1.0f) + bounds.top;
        int L3 = g0.L(2.0f) + bounds.left;
        Drawable drawable = this.d;
        drawable.setBounds(L, L2, drawable.getIntrinsicWidth() + L3, drawable.getIntrinsicHeight() + g0.L(1.0f) + getBounds().top);
        drawable.draw(canvas);
        String str = this.f4773f;
        if (str != null) {
            canvas.drawText(str, g0.L(16.5f) + bounds.left, g0.L(13.0f) + bounds.top, this.f4769a);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return g0.L(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (g0.L(23.0f) + this.f4772e);
    }

    @Override
    public final int getOpacity() {
        return -1;
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
