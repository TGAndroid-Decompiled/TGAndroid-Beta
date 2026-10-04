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
import org.telegram.messenger.ok;
public final class c2 extends Drawable {
    public final Context f12256a;
    public final Drawable f12257b;
    public Drawable f12258c;
    public int d;
    public int f12259e;
    public Drawable f12260f;
    public boolean f12261g;

    public c2(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = org.telegram.ui.ActionBar.i6.f20817d6;
        this.f12261g = true;
        this.f12256a = context;
        this.f12257b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f12261g == z10) {
            return;
        }
        this.f12261g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f12257b;
        drawable.setBounds(org.telegram.ui.Cells.c1.e(2, centerX, drawable), ok.d(2, centerY, drawable), org.telegram.ui.Cells.c1.w(2, centerX, drawable), org.telegram.ui.Cells.c1.t(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f12261g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, this.d, false);
            Drawable drawable2 = this.f12258c;
            Context context = this.f12256a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f12258c = mutate;
                this.f12259e = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (w02 != this.f12259e) {
                Drawable drawable3 = this.f12258c;
                this.f12259e = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f12260f == null) {
                this.f12260f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f12258c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f12258c.draw(canvas);
            this.f12260f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f12260f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f12257b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f12257b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f12257b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f12257b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f12257b.setColorFilter(colorFilter);
    }
}
