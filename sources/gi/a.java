package gi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
public final class a extends Drawable {
    public int f10162b;
    public int f10163c = 255;
    public final Drawable f10161a = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.settings_arrow).mutate();

    @Override
    public final void draw(Canvas canvas) {
        float exactCenterX = getBounds().exactCenterX();
        float exactCenterY = getBounds().exactCenterY();
        int x02 = g6.x0(null, g6.G6, false);
        int x03 = g6.x0(null, g6.f19601d6, false);
        int i10 = this.f10162b;
        Drawable drawable = this.f10161a;
        if (i10 != x03) {
            this.f10162b = x03;
            drawable.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.SRC_IN));
        }
        canvas.drawCircle(exactCenterX, exactCenterY, AndroidUtilities.dp(7.6666665f), g6.m0(i0.a.k(x03, this.f10163c)));
        canvas.drawCircle(exactCenterX, exactCenterY, AndroidUtilities.dp(6.6666665f), g6.m0(i0.a.k(x02, this.f10163c)));
        zf.q.d(drawable, exactCenterX, exactCenterY, 17);
        canvas.translate(0.0f, AndroidUtilities.dp(0.66f));
        canvas.save();
        canvas.rotate(90.0f, exactCenterX, exactCenterY);
        zf.q.b(canvas, drawable, 0.8f);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f10163c;
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(13.333333f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(13.333333f);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f10163c = i10;
        this.f10161a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
