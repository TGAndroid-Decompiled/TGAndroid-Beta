package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class b2 extends Drawable {
    public final Context f13150a;
    public final Drawable f13151b;
    public Drawable f13152c;
    public int d;
    public int e;
    public Drawable f13153f;
    public boolean f13154g;

    public b2(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = org.telegram.ui.ActionBar.g6.f19601d6;
        this.f13154g = true;
        this.f13150a = context;
        this.f13151b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f13154g == z10) {
            return;
        }
        this.f13154g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f13151b;
        drawable.setBounds(org.telegram.ui.Cells.c1.r(2, centerX, drawable), org.telegram.ui.Cells.c1.c(2, centerY, drawable), org.telegram.ui.Cells.c1.v(2, centerX, drawable), org.telegram.ui.Cells.c1.u(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f13154g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, this.d, false);
            Drawable drawable2 = this.f13152c;
            Context context = this.f13150a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f13152c = mutate;
                this.e = x02;
                mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.e) {
                Drawable drawable3 = this.f13152c;
                this.e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f13153f == null) {
                this.f13153f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f13152c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f13152c.draw(canvas);
            this.f13153f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f13153f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f13151b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f13151b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f13151b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f13151b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f13151b.setColorFilter(colorFilter);
    }
}
