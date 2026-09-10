package ei;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
public final class a extends Drawable {
    public int f7527b;
    public int f7528c = 255;
    public final Drawable f7526a = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.settings_arrow).mutate();

    @Override
    public final void draw(Canvas canvas) {
        float exactCenterX = getBounds().exactCenterX();
        float exactCenterY = getBounds().exactCenterY();
        int w02 = j6.w0(null, j6.G6, false);
        int w03 = j6.w0(null, j6.f17928d6, false);
        int i10 = this.f7527b;
        Drawable drawable = this.f7526a;
        if (i10 != w03) {
            this.f7527b = w03;
            drawable.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        canvas.drawCircle(exactCenterX, exactCenterY, AndroidUtilities.dp(7.6666665f), j6.l0(i0.a.k(w03, this.f7528c)));
        canvas.drawCircle(exactCenterX, exactCenterY, AndroidUtilities.dp(6.6666665f), j6.l0(i0.a.k(w02, this.f7528c)));
        xf.p.d(drawable, exactCenterX, exactCenterY, 17);
        canvas.translate(0.0f, AndroidUtilities.dp(0.66f));
        canvas.save();
        canvas.rotate(90.0f, exactCenterX, exactCenterY);
        xf.p.b(canvas, drawable, 0.8f);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f7528c;
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
        this.f7528c = i10;
        this.f7526a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
