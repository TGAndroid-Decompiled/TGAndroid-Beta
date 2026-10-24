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
import org.telegram.messenger.tl;
import org.telegram.ui.ActionBar.k6;
public final class b2 extends Drawable {
    public final Context f15185a;
    public final Drawable f15186b;
    public Drawable f15187c;
    public int d;
    public int e;
    public Drawable f15188f;
    public boolean f15189g;

    public b2(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = k6.f21184d6;
        this.f15189g = true;
        this.f15185a = context;
        this.f15186b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f15189g == z10) {
            return;
        }
        this.f15189g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f15186b;
        drawable.setBounds(org.telegram.ui.Cells.b1.f(2, centerX, drawable), tl.d(2, centerY, drawable), org.telegram.ui.Cells.b1.y(2, centerX, drawable), org.telegram.ui.Cells.b1.u(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f15189g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int x02 = k6.x0(null, this.d, false);
            Drawable drawable2 = this.f15187c;
            Context context = this.f15185a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f15187c = mutate;
                this.e = x02;
                mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (x02 != this.e) {
                Drawable drawable3 = this.f15187c;
                this.e = x02;
                drawable3.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f15188f == null) {
                this.f15188f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f15187c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f15187c.draw(canvas);
            this.f15188f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f15188f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f15186b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f15186b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f15186b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f15186b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15186b.setColorFilter(colorFilter);
    }
}
