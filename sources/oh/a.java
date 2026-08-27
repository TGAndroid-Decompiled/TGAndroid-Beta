package oh;

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

    public int f19460b;

    public int f19461c = 255;

    public final Drawable f19459a = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.settings_arrow).mutate();

    @Override
    public final void draw(Canvas canvas) {
        float fExactCenterX = getBounds().exactCenterX();
        float fExactCenterY = getBounds().exactCenterY();
        int iW0 = g6.w0(null, g6.G6, false);
        int iW1 = g6.w0(null, g6.f23053d6, false);
        int i10 = this.f19460b;
        Drawable drawable = this.f19459a;
        if (i10 != iW1) {
            this.f19460b = iW1;
            drawable.setColorFilter(new PorterDuffColorFilter(iW1, PorterDuff.Mode.SRC_IN));
        }
        canvas.drawCircle(fExactCenterX, fExactCenterY, AndroidUtilities.dp(7.6666665f), g6.l0(i0.b.k(iW1, this.f19461c)));
        canvas.drawCircle(fExactCenterX, fExactCenterY, AndroidUtilities.dp(6.6666665f), g6.l0(i0.b.k(iW0, this.f19461c)));
        gf.s.d(drawable, fExactCenterX, fExactCenterY, 17);
        canvas.translate(0.0f, AndroidUtilities.dp(0.66f));
        canvas.save();
        canvas.rotate(90.0f, fExactCenterX, fExactCenterY);
        gf.s.b(canvas, drawable, 0.8f);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return this.f19461c;
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
        this.f19461c = i10;
        this.f19459a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
