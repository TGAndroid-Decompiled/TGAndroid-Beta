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
public final class c2 extends Drawable {
    public final Context f12305a;
    public final Drawable f12306b;
    public Drawable f12307c;
    public int d;
    public int f12308e;
    public Drawable f12309f;
    public boolean f12310g;

    public c2(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = org.telegram.ui.ActionBar.i6.f20797d6;
        this.f12310g = true;
        this.f12305a = context;
        this.f12306b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f12310g == z10) {
            return;
        }
        this.f12310g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f12306b;
        drawable.setBounds(org.telegram.ui.Cells.c1.s(2, centerX, drawable), org.telegram.ui.Cells.c1.c(2, centerY, drawable), org.telegram.ui.Cells.c1.w(2, centerX, drawable), org.telegram.ui.Cells.c1.v(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f12310g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, this.d, false);
            Drawable drawable2 = this.f12307c;
            Context context = this.f12305a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f12307c = mutate;
                this.f12308e = x02;
                mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.f12308e) {
                Drawable drawable3 = this.f12307c;
                this.f12308e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f12309f == null) {
                this.f12309f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f12307c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f12307c.draw(canvas);
            this.f12309f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f12309f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f12306b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f12306b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f12306b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f12306b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f12306b.setColorFilter(colorFilter);
    }
}
