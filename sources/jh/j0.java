package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pz0;

public final class j0 extends Drawable {

    public final float f13519a = 0.75f;

    public final Drawable f13520b;

    public final pz0 f13521c;

    public j0(Context context, int i10) {
        this.f13520b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        pz0 pz0Var = new pz0(i0.a.k(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f13521c = pz0Var;
        pz0Var.f31695a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.f13520b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        this.f13521c.c(bounds.centerX() - (this.f13521c.f31697c / 2.0f), AndroidUtilities.dp(0.15f) + bounds.centerY(), drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f13520b.getAlpha();
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f13520b.getIntrinsicHeight() * this.f13519a);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f13520b.getIntrinsicWidth() * this.f13519a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f13520b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f13520b.setColorFilter(colorFilter);
    }
}
