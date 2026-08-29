package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.zz0;
public final class j0 extends Drawable {
    public final float f15797a = 0.75f;
    public final Drawable f15798b;
    public final zz0 f15799c;

    public j0(Context context, int i10) {
        this.f15798b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        zz0 zz0Var = new zz0(j7.l1.k(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f15799c = zz0Var;
        zz0Var.f35460a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.f15798b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        int centerY = bounds.centerY();
        this.f15799c.c(bounds.centerX() - (this.f15799c.f35462c / 2.0f), AndroidUtilities.dp(0.15f) + centerY, drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f15798b.getAlpha();
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f15798b.getIntrinsicHeight() * this.f15797a);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f15798b.getIntrinsicWidth() * this.f15797a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f15798b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15798b.setColorFilter(colorFilter);
    }
}
