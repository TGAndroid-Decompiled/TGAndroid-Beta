package jh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import cg.r;
import k2.p1;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.k6;
public final class c extends Drawable {
    public final int f16253a;
    public final Drawable f16254b;
    public int f16255c;
    public int d;

    public c() {
        this.f16253a = 1;
        this.d = 255;
        this.f16254b = p1.g(t0.f25457b, 2131232695);
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f16253a) {
            case 0:
                this.f16254b.draw(canvas);
                return;
            default:
                float exactCenterX = getBounds().exactCenterX();
                float exactCenterY = getBounds().exactCenterY();
                int x02 = k6.x0(null, k6.G6, false);
                int x03 = k6.x0(null, k6.f27878d6, false);
                int i3 = this.f16255c;
                Drawable drawable = this.f16254b;
                if (i3 != x03) {
                    this.f16255c = x03;
                    drawable.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.SRC_IN));
                }
                canvas.drawCircle(exactCenterX, exactCenterY, g0.L(7.6666665f), k6.n0(i0.a.o(x03, this.d)));
                canvas.drawCircle(exactCenterX, exactCenterY, g0.L(6.6666665f), k6.n0(i0.a.o(x02, this.d)));
                r.d(drawable, exactCenterX, exactCenterY, 17);
                canvas.translate(0.0f, g0.L(0.66f));
                canvas.save();
                canvas.rotate(90.0f, exactCenterX, exactCenterY);
                r.b(canvas, drawable, 0.8f);
                canvas.restore();
                return;
        }
    }

    @Override
    public final int getAlpha() {
        switch (this.f16253a) {
            case 0:
                return this.f16254b.getAlpha();
            default:
                return this.d;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f16253a) {
            case 1:
                return g0.L(13.333333f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f16253a) {
            case 1:
                return g0.L(13.333333f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f16253a) {
            case 0:
                return this.f16254b.getOpacity();
            default:
                return -3;
        }
    }

    @Override
    public void onBoundsChange(Rect rect) {
        switch (this.f16253a) {
            case 0:
                super.onBoundsChange(rect);
                int width = rect.width();
                int i3 = this.f16255c;
                int i10 = (width - i3) / 2;
                int height = rect.height();
                int i11 = this.d;
                int i12 = (height - i11) / 2;
                this.f16254b.setBounds(i10, i12, i3 + i10, i11 + i12);
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i3) {
        switch (this.f16253a) {
            case 0:
                this.f16254b.setAlpha(i3);
                return;
            default:
                this.d = i3;
                this.f16254b.setAlpha(i3);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i3 = this.f16253a;
    }

    public c(int i3, int i10, Drawable drawable) {
        this.f16253a = 0;
        this.f16255c = i3;
        this.d = i10;
        this.f16254b = drawable;
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
