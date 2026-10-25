package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.y6;
public final class z1 extends Drawable {
    public final Context f17658a;
    public final Drawable f17659b;
    public Drawable f17660c;
    public int d;
    public int e;
    public Drawable f17661f;
    public boolean f17662g;

    public z1(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = y6.f23354d6;
        this.f17662g = true;
        this.f17658a = context;
        this.f17659b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f17662g == z10) {
            return;
        }
        this.f17662g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f17659b;
        drawable.setBounds(org.telegram.ui.d3.x(2, centerX, drawable), org.telegram.ui.d3.i(2, centerY, drawable), org.telegram.ui.d3.C(2, centerX, drawable), org.telegram.ui.d3.B(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f17662g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int x02 = y6.x0(null, this.d, false);
            Drawable drawable2 = this.f17660c;
            Context context = this.f17658a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f17660c = mutate;
                this.e = x02;
                mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.e) {
                Drawable drawable3 = this.f17660c;
                this.e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f17661f == null) {
                this.f17661f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f17660c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f17660c.draw(canvas);
            this.f17661f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f17661f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f17659b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f17659b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f17659b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f17659b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17659b.setColorFilter(colorFilter);
    }
}
