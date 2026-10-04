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
import org.telegram.ui.Components.e11;
public final class c1 extends Drawable {
    public final float f687a = 0.75f;
    public final Drawable f688b;
    public final e11 f689c;

    public c1(Context context, int i10) {
        this.f688b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        e11 e11Var = new e11(hg.k0.h(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f689c = e11Var;
        e11Var.f25877a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.f688b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        int centerY = bounds.centerY();
        this.f689c.c(bounds.centerX() - (this.f689c.f25879c / 2.0f), AndroidUtilities.dp(0.15f) + centerY, drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f688b.getAlpha();
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f688b.getIntrinsicHeight() * this.f687a);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f688b.getIntrinsicWidth() * this.f687a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f688b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f688b.setColorFilter(colorFilter);
    }
}
