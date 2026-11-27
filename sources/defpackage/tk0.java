package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.a;
public final class tk0 extends Drawable {
    public final byte a;
    public final Drawable b;
    public int c;
    public int d;

    public tk0() {
        this.a = (byte) 1;
        this.d = 255;
        this.b = c00.e(a.b, 2131232713);
    }

    @Override
    public final void draw(Canvas canvas) {
        byte b = this.a;
        Drawable drawable = this.b;
        switch (b) {
            case 0:
                drawable.draw(canvas);
                return;
            default:
                float exactCenterX = getBounds().exactCenterX();
                float exactCenterY = getBounds().exactCenterY();
                int w0 = aob.w0(null, aob.G6, false);
                int w02 = aob.w0(null, aob.d6, false);
                if (this.c != w02) {
                    this.c = w02;
                    drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                }
                canvas.drawCircle(exactCenterX, exactCenterY, hl.L(7.6666665f), aob.l0(vm2.o(w02, this.d)));
                canvas.drawCircle(exactCenterX, exactCenterY, hl.L(6.6666665f), aob.l0(vm2.o(w0, this.d)));
                br3.d(drawable, exactCenterX, exactCenterY, 17);
                canvas.translate(0.0f, hl.L(0.66f));
                canvas.save();
                canvas.rotate(90.0f, exactCenterX, exactCenterY);
                br3.b(canvas, drawable, 0.8f);
                canvas.restore();
                return;
        }
    }

    @Override
    public final int getAlpha() {
        switch (this.a) {
            case 0:
                return this.b.getAlpha();
            default:
                return this.d;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return hl.L(13.333333f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return hl.L(13.333333f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return this.b.getOpacity();
            default:
                return -3;
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        switch (this.a) {
            case 0:
                super.onBoundsChange(rect);
                int width = rect.width();
                int i = this.c;
                int i2 = (width - i) / 2;
                int height = rect.height();
                int i3 = this.d;
                int i4 = (height - i3) / 2;
                this.b.setBounds(i2, i4, i + i2, i3 + i4);
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i) {
        byte b = this.a;
        Drawable drawable = this.b;
        switch (b) {
            case 0:
                drawable.setAlpha(i);
                return;
            default:
                this.d = i;
                drawable.setAlpha(i);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
    }

    public tk0(int i, int i2, Drawable drawable) {
        this.a = (byte) 0;
        this.c = i;
        this.d = i2;
        this.b = drawable;
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
