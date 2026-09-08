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
    public final Context f13781a;
    public final Drawable f13782b;
    public Drawable f13783c;
    public int d;
    public int f13784e;
    public Drawable f13785f;
    public boolean f13786g;

    public a2(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = org.telegram.ui.ActionBar.j6.f20690d6;
        this.f13786g = true;
        this.f13781a = context;
        this.f13782b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f13786g == z10) {
            return;
        }
        this.f13786g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f13782b;
        drawable.setBounds(wl.w(2, centerX, drawable), wl.e(2, centerY, drawable), wl.B(2, centerX, drawable), wl.z(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f13786g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, this.d, false);
            Drawable drawable2 = this.f13783c;
            Context context = this.f13781a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f13783c = mutate;
                this.f13784e = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (w02 != this.f13784e) {
                Drawable drawable3 = this.f13783c;
                this.f13784e = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f13785f == null) {
                this.f13785f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f13783c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f13783c.draw(canvas);
            this.f13785f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f13785f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f13782b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f13782b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f13782b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f13782b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f13782b.setColorFilter(colorFilter);
    }
}
