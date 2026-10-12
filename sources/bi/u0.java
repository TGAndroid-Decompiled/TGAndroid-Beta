package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.h11;
public final class u0 extends Drawable {
    public final float f3770a = 0.75f;
    public final Drawable f3771b;
    public final h11 f3772c;

    public u0(Context context, int i10) {
        this.f3771b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        h11 h11Var = new h11(i2.d.i(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f3772c = h11Var;
        h11Var.f25471a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.f3771b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        int centerY = bounds.centerY();
        this.f3772c.c(bounds.centerX() - (this.f3772c.f25473c / 2.0f), AndroidUtilities.dp(0.15f) + centerY, drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f3771b.getAlpha();
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f3771b.getIntrinsicHeight() * this.f3770a);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f3771b.getIntrinsicWidth() * this.f3770a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f3771b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3771b.setColorFilter(colorFilter);
    }
}
