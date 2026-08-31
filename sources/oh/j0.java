package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.l01;
public final class j0 extends Drawable {
    public final float f17308a = 0.75f;
    public final Drawable f17309b;
    public final l01 f17310c;

    public j0(Context context, int i10) {
        this.f17309b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        l01 l01Var = new l01(l.d.j(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f17310c = l01Var;
        l01Var.f28519a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.f17309b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        int centerY = bounds.centerY();
        this.f17310c.c(bounds.centerX() - (this.f17310c.f28521c / 2.0f), AndroidUtilities.dp(0.15f) + centerY, drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f17309b.getAlpha();
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f17309b.getIntrinsicHeight() * this.f17308a);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f17309b.getIntrinsicWidth() * this.f17308a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f17309b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17309b.setColorFilter(colorFilter);
    }
}
