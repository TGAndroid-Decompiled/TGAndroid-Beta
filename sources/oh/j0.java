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
import org.telegram.ui.Components.k01;
public final class j0 extends Drawable {
    public final float f17310a = 0.75f;
    public final Drawable f17311b;
    public final k01 f17312c;

    public j0(Context context, int i10) {
        this.f17311b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        k01 k01Var = new k01(l.d.j(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f17312c = k01Var;
        k01Var.f28225a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.f17311b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        int centerY = bounds.centerY();
        this.f17312c.c(bounds.centerX() - (this.f17312c.f28227c / 2.0f), AndroidUtilities.dp(0.15f) + centerY, drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f17311b.getAlpha();
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f17311b.getIntrinsicHeight() * this.f17310a);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f17311b.getIntrinsicWidth() * this.f17310a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f17311b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17311b.setColorFilter(colorFilter);
    }
}
