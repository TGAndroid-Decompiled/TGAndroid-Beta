package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f11;
public final class m0 extends Drawable {
    public final float f5599a = 0.75f;
    public final Drawable f5600b;
    public final f11 f5601c;

    public m0(Context context, int i10) {
        this.f5600b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        f11 f11Var = new f11(i2.e.j(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f5601c = f11Var;
        f11Var.f26019a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.f5600b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        int centerY = bounds.centerY();
        this.f5601c.c(bounds.centerX() - (this.f5601c.f26021c / 2.0f), AndroidUtilities.dp(0.15f) + centerY, drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f5600b.getAlpha();
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f5600b.getIntrinsicHeight() * this.f5599a);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f5600b.getIntrinsicWidth() * this.f5599a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f5600b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5600b.setColorFilter(colorFilter);
    }
}
