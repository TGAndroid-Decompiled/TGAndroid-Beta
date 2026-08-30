package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.k01;
public final class k0 extends Drawable {
    public final float f15527a = 0.75f;
    public final Drawable f15528b;
    public final k01 f15529c;

    public k0(Context context, int i10) {
        this.f15528b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        k01 k01Var = new k01(kh.a2.j(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f15529c = k01Var;
        k01Var.f26082a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.f15528b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        int centerY = bounds.centerY();
        this.f15529c.c(bounds.centerX() - (this.f15529c.f26084c / 2.0f), AndroidUtilities.dp(0.15f) + centerY, drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f15528b.getAlpha();
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f15528b.getIntrinsicHeight() * this.f15527a);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f15528b.getIntrinsicWidth() * this.f15527a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f15528b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15528b.setColorFilter(colorFilter);
    }
}
