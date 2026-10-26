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
import org.telegram.ui.Components.q11;
public final class m0 extends Drawable {
    public final float f8771a = 0.75f;
    public final Drawable f8772b;
    public final q11 f8773c;

    public m0(Context context, int i10) {
        this.f8772b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        q11 q11Var = new q11(ic.a.i(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f8773c = q11Var;
        q11Var.f31788a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.f8772b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        int centerY = bounds.centerY();
        this.f8773c.c(bounds.centerX() - (this.f8773c.f31790c / 2.0f), AndroidUtilities.dp(0.15f) + centerY, drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f8772b.getAlpha();
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.f8772b.getIntrinsicHeight() * this.f8771a);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.f8772b.getIntrinsicWidth() * this.f8771a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f8772b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f8772b.setColorFilter(colorFilter);
    }
}
