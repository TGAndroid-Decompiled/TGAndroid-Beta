package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.m11;
public final class c1 extends Drawable {
    public final float f749a = 0.75f;
    public final Drawable f750b;
    public final m11 f751c;

    public c1(Context context, int i10) {
        this.f750b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        m11 m11Var = new m11(hg.c.h(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f751c = m11Var;
        m11Var.f28676a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.f750b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        int centerY = bounds.centerY();
        this.f751c.c(bounds.centerX() - (this.f751c.f28678c / 2.0f), AndroidUtilities.dp(0.15f) + centerY, drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f750b.getAlpha();
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f750b.getIntrinsicHeight() * this.f749a);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f750b.getIntrinsicWidth() * this.f749a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f750b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f750b.setColorFilter(colorFilter);
    }
}
