package li;

import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.y6;
public final class a2 extends Drawable implements Drawable.Callback {
    public final Drawable f17074a;
    public final Paint f17075b;
    public final Path f17076c;
    public final RectF d;
    public final Outline e;
    public boolean f17077f;
    public final boolean h;
    public boolean f17078n;

    public a2(Drawable drawable) {
        Paint paint = new Paint(1);
        this.f17075b = paint;
        this.f17076c = new Path();
        this.d = new RectF();
        this.e = new Outline();
        this.f17077f = true;
        this.f17074a = drawable;
        drawable.setCallback(this);
        paint.setColor(0);
        this.h = true;
        a(y6.I.q());
    }

    public final void a(boolean z10) {
        float f7;
        this.f17078n = z10;
        float dp = AndroidUtilities.dp(12.0f);
        float dp2 = AndroidUtilities.dp(4.0f);
        if (z10) {
            f7 = 0.3f;
        } else {
            f7 = 0.1f;
        }
        this.f17075b.setShadowLayer(dp, 0.0f, dp2, y6.o1(f7, -16777216));
    }

    @Override
    public final void draw(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: li.a2.draw(android.graphics.Canvas):void");
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
        return this.f17074a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f17074a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f17074a.setBounds(rect);
        this.f17077f = true;
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        return this.f17074a.setState(iArr);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f17074a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17074a.setColorFilter(colorFilter);
    }

    @Override
    public final void setHotspot(float f7, float f10) {
        this.f17074a.setHotspot(f7, f10);
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f17074a.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
