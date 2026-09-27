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
import org.telegram.messenger.qk;
public final class c2 extends Drawable {
    public final Context f11267a;
    public final Drawable f11268b;
    public Drawable f11269c;
    public int d;
    public int e;
    public Drawable f11270f;
    public boolean f11271g;

    public c2(Context context, int i10) {
        Drawable mutate = context.getResources().getDrawable(i10).mutate();
        this.d = org.telegram.ui.ActionBar.i6.f19057d6;
        this.f11271g = true;
        this.f11267a = context;
        this.f11268b = mutate;
    }

    public final void a(boolean z10) {
        if (this.f11271g == z10) {
            return;
        }
        this.f11271g = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.f11268b;
        drawable.setBounds(qk.y(2, centerX, drawable), qk.d(2, centerY, drawable), org.telegram.ui.Cells.c1.d(2, centerX, drawable), qk.A(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.f11271g) {
            int dp = AndroidUtilities.dp(9.0f) + centerX;
            int dp2 = AndroidUtilities.dp(9.0f) + centerY;
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, this.d, false);
            Drawable drawable2 = this.f11269c;
            Context context = this.f11267a;
            if (drawable2 == null) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                this.f11269c = mutate;
                this.e = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (w02 != this.e) {
                Drawable drawable3 = this.f11269c;
                this.e = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            if (this.f11270f == null) {
                this.f11270f = context.getResources().getDrawable(R.drawable.star_premium).mutate();
            }
            this.f11269c.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f11269c.draw(canvas);
            this.f11270f.setBounds(dp - AndroidUtilities.dp(9.0f), dp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + dp, AndroidUtilities.dp(9.0f) + dp2);
            this.f11270f.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f11268b.getIntrinsicHeight());
    }

    @Override
    public final int getIntrinsicWidth() {
        return Math.max(AndroidUtilities.dp(38.0f), this.f11268b.getIntrinsicWidth());
    }

    @Override
    public final int getOpacity() {
        return this.f11268b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f11268b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f11268b.setColorFilter(colorFilter);
    }
}
