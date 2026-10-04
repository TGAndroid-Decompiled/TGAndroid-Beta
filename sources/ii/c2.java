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
    public final Context f12257a;
    public final Drawable f12258b;
    public Drawable f12259c;
    public int d;
    public int f12260e;
    public Drawable f12261f;
    public boolean f12262g;

    public c2(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = org.telegram.ui.ActionBar.i6.f20822d6;
        this.f12262g = true;
        this.f12257a = context;
        this.f12258b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f12262g == z10) {
            return;
        }
        this.f12262g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f12258b;
        drawable.setBounds(org.telegram.ui.Cells.c1.t(2, centerX, drawable), org.telegram.ui.Cells.c1.e(2, centerY, drawable), org.telegram.ui.Cells.c1.x(2, centerX, drawable), org.telegram.ui.Cells.c1.w(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f12262g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, this.d, false);
            Drawable drawable2 = this.f12259c;
            Context context = this.f12257a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f12259c = mutate;
                this.f12260e = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (w02 != this.f12260e) {
                Drawable drawable3 = this.f12259c;
                this.f12260e = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f12261f == null) {
                this.f12261f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f12259c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f12259c.draw(canvas);
            this.f12261f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f12261f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f12258b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f12258b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f12258b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f12258b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f12258b.setColorFilter(colorFilter);
    }
}
