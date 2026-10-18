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
    public final Context f15138a;
    public final Drawable f15139b;
    public Drawable f15140c;
    public int d;
    public int e;
    public Drawable f15141f;
    public boolean f15142g;

    public b2(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = h6.f20986d6;
        this.f15142g = true;
        this.f15138a = context;
        this.f15139b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f15142g == z10) {
            return;
        }
        this.f15142g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f15139b;
        drawable.setBounds(org.telegram.ui.Cells.c1.w(2, centerX, drawable), org.telegram.ui.Cells.c1.f(2, centerY, drawable), org.telegram.ui.Cells.c1.B(2, centerX, drawable), org.telegram.ui.Cells.c1.A(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f15142g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int x02 = h6.x0(null, this.d, false);
            Drawable drawable2 = this.f15140c;
            Context context = this.f15138a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f15140c = mutate;
                this.e = x02;
                mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.e) {
                Drawable drawable3 = this.f15140c;
                this.e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f15141f == null) {
                this.f15141f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f15140c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f15140c.draw(canvas);
            this.f15141f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f15141f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f15139b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f15139b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f15139b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f15139b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15139b.setColorFilter(colorFilter);
    }
}
