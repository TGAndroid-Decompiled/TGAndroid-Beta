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
import org.telegram.ui.Components.g01;
public final class c1 extends Drawable {
    public final float f613a = 0.75f;
    public final Drawable f614b;
    public final g01 f615c;

    public c1(Context context, int i10) {
        this.f614b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        g01 g01Var = new g01(hg.k0.i(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f615c = g01Var;
        g01Var.f24147a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.f614b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        int centerY = bounds.centerY();
        this.f615c.c(bounds.centerX() - (this.f615c.f24149c / 2.0f), AndroidUtilities.dp(0.15f) + centerY, drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f614b.getAlpha();
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f614b.getIntrinsicHeight() * this.f613a);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f614b.getIntrinsicWidth() * this.f613a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f614b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f614b.setColorFilter(colorFilter);
    }
}
