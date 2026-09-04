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
import org.telegram.messenger.wl;
public final class a2 extends Drawable {
    public final Context f13755a;
    public final Drawable f13756b;
    public Drawable f13757c;
    public int d;
    public int f13758e;
    public Drawable f13759f;
    public boolean f13760g;

    public a2(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = org.telegram.ui.ActionBar.j6.f20663d6;
        this.f13760g = true;
        this.f13755a = context;
        this.f13756b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f13760g == z10) {
            return;
        }
        this.f13760g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f13756b;
        drawable.setBounds(wl.w(2, centerX, drawable), wl.e(2, centerY, drawable), wl.B(2, centerX, drawable), wl.z(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f13760g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, this.d, false);
            Drawable drawable2 = this.f13757c;
            Context context = this.f13755a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f13757c = mutate;
                this.f13758e = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (w02 != this.f13758e) {
                Drawable drawable3 = this.f13757c;
                this.f13758e = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f13759f == null) {
                this.f13759f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f13757c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f13757c.draw(canvas);
            this.f13759f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f13759f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f13756b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f13756b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f13756b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f13756b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f13756b.setColorFilter(colorFilter);
    }
}
