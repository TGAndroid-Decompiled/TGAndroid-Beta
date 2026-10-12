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
    public final Context f13146a;
    public final Drawable f13147b;
    public Drawable f13148c;
    public int d;
    public int e;
    public Drawable f13149f;
    public boolean f13150g;

    public b2(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = org.telegram.ui.ActionBar.g6.f19901d6;
        this.f13150g = true;
        this.f13146a = context;
        this.f13147b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f13150g == z10) {
            return;
        }
        this.f13150g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f13147b;
        drawable.setBounds(org.telegram.ui.Cells.d0.u(2, centerX, drawable), org.telegram.ui.Cells.d0.d(2, centerY, drawable), org.telegram.ui.Cells.d0.y(2, centerX, drawable), org.telegram.ui.Cells.d0.x(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f13150g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, this.d, false);
            Drawable drawable2 = this.f13148c;
            Context context = this.f13146a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f13148c = mutate;
                this.e = x02;
                mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.e) {
                Drawable drawable3 = this.f13148c;
                this.e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f13149f == null) {
                this.f13149f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f13148c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f13148c.draw(canvas);
            this.f13149f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f13149f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f13147b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f13147b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f13147b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f13147b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f13147b.setColorFilter(colorFilter);
    }
}
