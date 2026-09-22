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
import org.telegram.messenger.rk;
import org.telegram.ui.ActionBar.j6;
public final class b2 extends Drawable {
    public final Context f11253a;
    public final Drawable f11254b;
    public Drawable f11255c;
    public int d;
    public int e;
    public Drawable f11256f;
    public boolean f11257g;

    public b2(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = j6.f19109d6;
        this.f11257g = true;
        this.f11253a = context;
        this.f11254b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f11257g == z10) {
            return;
        }
        this.f11257g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f11254b;
        drawable.setBounds(rk.y(2, centerX, drawable), rk.d(2, centerY, drawable), org.telegram.ui.Cells.c1.d(2, centerX, drawable), rk.A(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f11257g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int w02 = j6.w0(null, this.d, false);
            Drawable drawable2 = this.f11255c;
            Context context = this.f11253a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f11255c = mutate;
                this.e = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (w02 != this.e) {
                Drawable drawable3 = this.f11255c;
                this.e = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f11256f == null) {
                this.f11256f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f11255c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f11255c.draw(canvas);
            this.f11256f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f11256f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f11254b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f11254b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f11254b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f11254b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f11254b.setColorFilter(colorFilter);
    }
}
