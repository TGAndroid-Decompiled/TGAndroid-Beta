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
    public final Context f15140a;
    public final Drawable f15141b;
    public Drawable f15142c;
    public int d;
    public int e;
    public Drawable f15143f;
    public boolean f15144g;

    public b2(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = h6.f20993d6;
        this.f15144g = true;
        this.f15140a = context;
        this.f15141b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f15144g == z10) {
            return;
        }
        this.f15144g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f15141b;
        drawable.setBounds(org.telegram.ui.Cells.c1.w(2, centerX, drawable), org.telegram.ui.Cells.c1.f(2, centerY, drawable), org.telegram.ui.Cells.c1.B(2, centerX, drawable), org.telegram.ui.Cells.c1.A(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f15144g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int x02 = h6.x0(null, this.d, false);
            Drawable drawable2 = this.f15142c;
            Context context = this.f15140a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f15142c = mutate;
                this.e = x02;
                mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.e) {
                Drawable drawable3 = this.f15142c;
                this.e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f15143f == null) {
                this.f15143f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f15142c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f15142c.draw(canvas);
            this.f15143f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f15143f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f15141b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f15141b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f15141b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f15141b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15141b.setColorFilter(colorFilter);
    }
}
