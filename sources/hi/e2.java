package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.em;
public final class e2 extends Drawable {
    public final Context f9537a;
    public final Drawable f9538b;
    public Drawable f9539c;
    public int d;
    public int e;
    public Drawable f9540f;
    public boolean f9541g;

    public e2(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = org.telegram.ui.ActionBar.j6.f17928d6;
        this.f9541g = true;
        this.f9537a = context;
        this.f9538b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f9541g == z10) {
            return;
        }
        this.f9541g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f9538b;
        drawable.setBounds(em.w(2, centerX, drawable), em.e(2, centerY, drawable), em.B(2, centerX, drawable), em.z(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f9541g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, this.d, false);
            Drawable drawable2 = this.f9539c;
            Context context = this.f9537a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f9539c = mutate;
                this.e = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (w02 != this.e) {
                Drawable drawable3 = this.f9539c;
                this.e = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f9540f == null) {
                this.f9540f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f9539c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f9539c.draw(canvas);
            this.f9540f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f9540f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f9538b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f9538b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f9538b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f9538b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9538b.setColorFilter(colorFilter);
    }
}
