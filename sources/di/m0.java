package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.r11;
public final class m0 extends Drawable {
    public final float f8770a = 0.75f;
    public final Drawable f8771b;
    public final r11 f8772c;

    public m0(Context context, int i10) {
        this.f8771b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        r11 r11Var = new r11(ic.a.i(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f8772c = r11Var;
        r11Var.f32088a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.f8771b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        int centerY = bounds.centerY();
        this.f8772c.c(bounds.centerX() - (this.f8772c.f32090c / 2.0f), AndroidUtilities.dp(0.15f) + centerY, drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f8771b.getAlpha();
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f8771b.getIntrinsicHeight() * this.f8770a);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f8771b.getIntrinsicWidth() * this.f8770a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f8771b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f8771b.setColorFilter(colorFilter);
    }
}
