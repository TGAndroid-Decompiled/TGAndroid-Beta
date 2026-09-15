package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.ui.ActionBar.i6;
public final class b2 extends Drawable {
    public final Context f11249a;
    public final Drawable f11250b;
    public Drawable f11251c;
    public int d;
    public int e;
    public Drawable f11252f;
    public boolean f11253g;

    public b2(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = i6.f18836d6;
        this.f11253g = true;
        this.f11249a = context;
        this.f11250b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f11253g == z10) {
            return;
        }
        this.f11253g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f11250b;
        drawable.setBounds(wl.w(2, centerX, drawable), wl.e(2, centerY, drawable), wl.B(2, centerX, drawable), wl.z(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f11253g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int w02 = i6.w0(null, this.d, false);
            Drawable drawable2 = this.f11251c;
            Context context = this.f11249a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f11251c = mutate;
                this.e = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (w02 != this.e) {
                Drawable drawable3 = this.f11251c;
                this.e = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f11252f == null) {
                this.f11252f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f11251c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f11251c.draw(canvas);
            this.f11252f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f11252f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f11250b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f11250b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f11250b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f11250b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f11250b.setColorFilter(colorFilter);
    }
}
