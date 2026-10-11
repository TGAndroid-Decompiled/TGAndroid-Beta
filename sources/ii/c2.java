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
    public final Context f12304a;
    public final Drawable f12305b;
    public Drawable f12306c;
    public int d;
    public int f12307e;
    public Drawable f12308f;
    public boolean f12309g;

    public c2(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = org.telegram.ui.ActionBar.h6.f20786d6;
        this.f12309g = true;
        this.f12304a = context;
        this.f12305b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f12309g == z10) {
            return;
        }
        this.f12309g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f12305b;
        drawable.setBounds(org.telegram.ui.Cells.c1.s(2, centerX, drawable), org.telegram.ui.Cells.c1.c(2, centerY, drawable), org.telegram.ui.Cells.c1.w(2, centerX, drawable), org.telegram.ui.Cells.c1.v(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f12309g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, this.d, false);
            Drawable drawable2 = this.f12306c;
            Context context = this.f12304a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f12306c = mutate;
                this.f12307e = x02;
                mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.f12307e) {
                Drawable drawable3 = this.f12306c;
                this.f12307e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f12308f == null) {
                this.f12308f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f12306c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f12306c.draw(canvas);
            this.f12308f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f12308f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f12305b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f12305b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f12305b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f12305b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f12305b.setColorFilter(colorFilter);
    }
}
