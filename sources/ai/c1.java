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
import org.telegram.ui.Components.v01;
public final class c1 extends Drawable {
    public final float f636a = 0.75f;
    public final Drawable f637b;
    public final v01 f638c;

    public c1(Context context, int i10) {
        this.f637b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        v01 v01Var = new v01(hg.k0.h(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f638c = v01Var;
        v01Var.f28985a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.f637b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        int centerY = bounds.centerY();
        this.f638c.c(bounds.centerX() - (this.f638c.f28987c / 2.0f), AndroidUtilities.dp(0.15f) + centerY, drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f637b.getAlpha();
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f637b.getIntrinsicHeight() * this.f636a);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f637b.getIntrinsicWidth() * this.f636a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f637b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f637b.setColorFilter(colorFilter);
    }
}
