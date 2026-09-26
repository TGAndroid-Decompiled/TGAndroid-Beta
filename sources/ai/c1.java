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
import org.telegram.ui.Components.t01;
public final class c1 extends Drawable {
    public final float f633a = 0.75f;
    public final Drawable f634b;
    public final t01 f635c;

    public c1(Context context, int i10) {
        this.f634b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        t01 t01Var = new t01(hg.c.h(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f635c = t01Var;
        t01Var.f28361a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.f634b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        int centerY = bounds.centerY();
        this.f635c.c(bounds.centerX() - (this.f635c.f28363c / 2.0f), AndroidUtilities.dp(0.15f) + centerY, drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f634b.getAlpha();
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f634b.getIntrinsicHeight() * this.f633a);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f634b.getIntrinsicWidth() * this.f633a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f634b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f634b.setColorFilter(colorFilter);
    }
}
