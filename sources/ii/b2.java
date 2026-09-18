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
import org.telegram.ui.ActionBar.j6;
public final class b2 extends Drawable {
    public final Context f11252a;
    public final Drawable f11253b;
    public Drawable f11254c;
    public int d;
    public int e;
    public Drawable f11255f;
    public boolean f11256g;

    public b2(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = j6.f19062d6;
        this.f11256g = true;
        this.f11252a = context;
        this.f11253b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f11256g == z10) {
            return;
        }
        this.f11256g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f11253b;
        drawable.setBounds(org.telegram.ui.Cells.c1.r(2, centerX, drawable), org.telegram.ui.Cells.c1.c(2, centerY, drawable), org.telegram.ui.Cells.c1.v(2, centerX, drawable), org.telegram.ui.Cells.c1.u(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f11256g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int w02 = j6.w0(null, this.d, false);
            Drawable drawable2 = this.f11254c;
            Context context = this.f11252a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f11254c = mutate;
                this.e = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (w02 != this.e) {
                Drawable drawable3 = this.f11254c;
                this.e = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f11255f == null) {
                this.f11255f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f11254c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f11254c.draw(canvas);
            this.f11255f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f11255f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f11253b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f11253b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f11253b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f11253b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f11253b.setColorFilter(colorFilter);
    }
}
