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
    public final Context f15133a;
    public final Drawable f15134b;
    public Drawable f15135c;
    public int d;
    public int e;
    public Drawable f15136f;
    public boolean f15137g;

    public b2(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = h6.f20986d6;
        this.f15137g = true;
        this.f15133a = context;
        this.f15134b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f15137g == z10) {
            return;
        }
        this.f15137g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f15134b;
        drawable.setBounds(org.telegram.ui.Cells.t0.w(2, centerX, drawable), org.telegram.ui.Cells.t0.g(2, centerY, drawable), org.telegram.ui.Cells.t0.B(2, centerX, drawable), org.telegram.ui.Cells.t0.A(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f15137g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int x02 = h6.x0(null, this.d, false);
            Drawable drawable2 = this.f15135c;
            Context context = this.f15133a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f15135c = mutate;
                this.e = x02;
                mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.e) {
                Drawable drawable3 = this.f15135c;
                this.e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f15136f == null) {
                this.f15136f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f15135c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f15135c.draw(canvas);
            this.f15136f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f15136f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f15134b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f15134b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f15134b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f15134b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15134b.setColorFilter(colorFilter);
    }
}
