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
import org.telegram.ui.Components.w01;
public final class c1 extends Drawable {
    public final float f615a = 0.75f;
    public final Drawable f616b;
    public final w01 f617c;

    public c1(Context context, int i10) {
        this.f616b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        w01 w01Var = new w01(hg.k0.h(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f617c = w01Var;
        w01Var.f29860a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.f616b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        int centerY = bounds.centerY();
        this.f617c.c(bounds.centerX() - (this.f617c.f29862c / 2.0f), AndroidUtilities.dp(0.15f) + centerY, drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f616b.getAlpha();
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f616b.getIntrinsicHeight() * this.f615a);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f616b.getIntrinsicWidth() * this.f615a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f616b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f616b.setColorFilter(colorFilter);
    }
}
