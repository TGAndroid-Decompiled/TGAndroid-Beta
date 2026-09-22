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
import org.telegram.messenger.vl;
import org.telegram.ui.ActionBar.i6;
public final class b2 extends Drawable {
    public final Context f11251a;
    public final Drawable f11252b;
    public Drawable f11253c;
    public int d;
    public int e;
    public Drawable f11254f;
    public boolean f11255g;

    public b2(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = i6.f18834d6;
        this.f11255g = true;
        this.f11251a = context;
        this.f11252b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f11255g == z10) {
            return;
        }
        this.f11255g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f11252b;
        drawable.setBounds(vl.x(2, centerX, drawable), vl.e(2, centerY, drawable), vl.B(2, centerX, drawable), vl.z(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f11255g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int w02 = i6.w0(null, this.d, false);
            Drawable drawable2 = this.f11253c;
            Context context = this.f11251a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f11253c = mutate;
                this.e = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (w02 != this.e) {
                Drawable drawable3 = this.f11253c;
                this.e = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f11254f == null) {
                this.f11254f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f11253c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f11253c.draw(canvas);
            this.f11254f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f11254f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f11252b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f11252b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f11252b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f11252b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f11252b.setColorFilter(colorFilter);
    }
}
