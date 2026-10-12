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
import org.telegram.ui.Components.r11;
public final class c1 extends Drawable {
    public final float f747a = 0.75f;
    public final Drawable f748b;
    public final r11 f749c;

    public c1(Context context, int i10) {
        this.f748b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        r11 r11Var = new r11(hg.c.i(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f749c = r11Var;
        r11Var.f29987a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.f748b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        int centerY = bounds.centerY();
        this.f749c.c(bounds.centerX() - (this.f749c.f29989c / 2.0f), AndroidUtilities.dp(0.15f) + centerY, drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f748b.getAlpha();
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f748b.getIntrinsicHeight() * this.f747a);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f748b.getIntrinsicWidth() * this.f747a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f748b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f748b.setColorFilter(colorFilter);
    }
}
