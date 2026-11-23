package ih;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import bg.t;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.n6;
public final class c extends Drawable {
    public final int f16342a;
    public final Drawable f16343b;
    public int f16344c;
    public int d;

    public c() {
        this.f16342a = 1;
        this.d = 255;
        this.f16343b = i5.c.g(t0.f27013b, 2131232702);
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f16342a) {
            case 0:
                this.f16343b.draw(canvas);
                return;
            default:
                float exactCenterX = getBounds().exactCenterX();
                float exactCenterY = getBounds().exactCenterY();
                int x02 = n6.x0(null, n6.G6, false);
                int x03 = n6.x0(null, n6.f29451d6, false);
                int i7 = this.f16344c;
                Drawable drawable = this.f16343b;
                if (i7 != x03) {
                    this.f16344c = x03;
                    drawable.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.SRC_IN));
                }
                canvas.drawCircle(exactCenterX, exactCenterY, g0.L(7.6666665f), n6.n0(i0.a.o(x03, this.d)));
                canvas.drawCircle(exactCenterX, exactCenterY, g0.L(6.6666665f), n6.n0(i0.a.o(x02, this.d)));
                t.d(drawable, exactCenterX, exactCenterY, 17);
                canvas.translate(0.0f, g0.L(0.66f));
                canvas.save();
                canvas.rotate(90.0f, exactCenterX, exactCenterY);
                t.b(canvas, drawable, 0.8f);
                canvas.restore();
                return;
        }
    }

    @Override
    public final int getAlpha() {
        switch (this.f16342a) {
            case 0:
                return this.f16343b.getAlpha();
            default:
                return this.d;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f16342a) {
            case 1:
                return g0.L(13.333333f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f16342a) {
            case 1:
                return g0.L(13.333333f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f16342a) {
            case 0:
                return this.f16343b.getOpacity();
            default:
                return -3;
        }
    }

    @Override
    public void onBoundsChange(Rect rect) {
        switch (this.f16342a) {
            case 0:
                super.onBoundsChange(rect);
                int width = rect.width();
                int i7 = this.f16344c;
                int i10 = (width - i7) / 2;
                int height = rect.height();
                int i11 = this.d;
                int i12 = (height - i11) / 2;
                this.f16343b.setBounds(i10, i12, i7 + i10, i11 + i12);
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f16342a) {
            case 0:
                this.f16343b.setAlpha(i7);
                return;
            default:
                this.d = i7;
                this.f16343b.setAlpha(i7);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.f16342a;
    }

    public c(int i7, int i10, Drawable drawable) {
        this.f16342a = 0;
        this.f16344c = i7;
        this.d = i10;
        this.f16343b = drawable;
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
