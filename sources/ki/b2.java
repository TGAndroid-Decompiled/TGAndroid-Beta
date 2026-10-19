package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
public final class b2 extends Drawable {
    public final Context f15141a;
    public final Drawable f15142b;
    public Drawable f15143c;
    public int d;
    public int e;
    public Drawable f15144f;
    public boolean f15145g;

    public b2(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = h6.f20989d6;
        this.f15145g = true;
        this.f15141a = context;
        this.f15142b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f15145g == z10) {
            return;
        }
        this.f15145g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f15142b;
        drawable.setBounds(org.telegram.ui.Cells.c1.w(2, centerX, drawable), org.telegram.ui.Cells.c1.f(2, centerY, drawable), org.telegram.ui.Cells.c1.B(2, centerX, drawable), org.telegram.ui.Cells.c1.A(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f15145g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int x02 = h6.x0(null, this.d, false);
            Drawable drawable2 = this.f15143c;
            Context context = this.f15141a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f15143c = mutate;
                this.e = x02;
                mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.e) {
                Drawable drawable3 = this.f15143c;
                this.e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f15144f == null) {
                this.f15144f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f15143c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f15143c.draw(canvas);
            this.f15144f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f15144f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f15142b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f15142b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f15142b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f15142b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15142b.setColorFilter(colorFilter);
    }
}
