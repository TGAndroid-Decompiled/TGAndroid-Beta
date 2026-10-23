package ki;

import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
public final class c2 extends Drawable implements Drawable.Callback {
    public final Drawable f15227a;
    public final Paint f15228b;
    public final Path f15229c;
    public final RectF d;
    public final Outline e;
    public boolean f15230f;
    public final boolean h;
    public boolean f15231n;

    public c2(Drawable drawable) {
        Paint paint = new Paint(1);
        this.f15228b = paint;
        this.f15229c = new Path();
        this.d = new RectF();
        this.e = new Outline();
        this.f15230f = true;
        this.f15227a = drawable;
        drawable.setCallback(this);
        paint.setColor(0);
        this.h = true;
        a(k6.I.q());
    }

    public final void a(boolean z10) {
        float f7;
        this.f15231n = z10;
        float dp = AndroidUtilities.dp(12.0f);
        float dp2 = AndroidUtilities.dp(4.0f);
        if (z10) {
            f7 = 0.3f;
        } else {
            f7 = 0.1f;
        }
        this.f15228b.setShadowLayer(dp, 0.0f, dp2, k6.o1(f7, -16777216));
    }

    @Override
    public final void draw(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: ki.c2.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.f15227a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f15227a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f15227a.setBounds(rect);
        this.f15230f = true;
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        return this.f15227a.setState(iArr);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f15227a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15227a.setColorFilter(colorFilter);
    }

    @Override
    public final void setHotspot(float f7, float f10) {
        this.f15227a.setHotspot(f7, f10);
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f15227a.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
