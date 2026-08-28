package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.nz0;
public final class l0 extends Drawable {
    public final float f11694a = 0.75f;
    public final Drawable f11695b;
    public final nz0 f11696c;

    public l0(Context context, int i9) {
        this.f11695b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        nz0 nz0Var = new nz0(j3.r0.l(i9, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f11696c = nz0Var;
        nz0Var.f31221a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.f11695b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        int centerY = bounds.centerY();
        this.f11696c.c(bounds.centerX() - (this.f11696c.f31223c / 2.0f), AndroidUtilities.dp(0.15f) + centerY, drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f11695b.getAlpha();
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f11695b.getIntrinsicHeight() * this.f11694a);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f11695b.getIntrinsicWidth() * this.f11694a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
        this.f11695b.setAlpha(i9);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f11695b.setColorFilter(colorFilter);
    }
}
