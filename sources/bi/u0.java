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
import org.telegram.ui.Components.f01;
public final class u0 extends Drawable {
    public final float f3780a = 0.75f;
    public final Drawable f3781b;
    public final f01 f3782c;

    public u0(Context context, int i10) {
        this.f3781b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        f01 f01Var = new f01(i2.g.i(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f3782c = f01Var;
        f01Var.f25845a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.f3781b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        int centerY = bounds.centerY();
        this.f3782c.c(bounds.centerX() - (this.f3782c.f25847c / 2.0f), AndroidUtilities.dp(0.15f) + centerY, drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f3781b.getAlpha();
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f3781b.getIntrinsicHeight() * this.f3780a);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f3781b.getIntrinsicWidth() * this.f3780a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f3781b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3781b.setColorFilter(colorFilter);
    }
}
