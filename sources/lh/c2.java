package lh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import mh.wa;
import org.telegram.messenger.LiteMode;
public final class c2 extends Drawable {
    public final int f12643a;
    public final RectF f12644b;
    public final Path f12645c;
    public final Paint d;
    public final wa f12646e;
    public boolean f12647f;
    public eh.m f12648g;
    public dg.h0 h;
    public boolean f12649i;

    public c2(int i10) {
        this(i0.a.k(i10, 128), i10);
    }

    public final void a() {
        boolean z4;
        if (this.f12646e != null && this.f12649i && LiteMode.isEnabled(131072)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f12647f == z4) {
            return;
        }
        this.f12647f = z4;
        if (z4) {
            lf.j d = lf.j.d();
            eh.m mVar = new eh.m(this, 29);
            this.f12648g = mVar;
            d.a(15, mVar);
        } else {
            lf.j.d().f(this.f12648g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f12645c;
        canvas.drawPath(path, paint);
        wa waVar = this.f12646e;
        if (waVar != null) {
            if (this.f12647f || !this.f12649i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f12648g == null) {
                    waVar.d();
                }
                waVar.a(canvas, this.f12643a);
                canvas.restore();
                if (this.f12648g == null) {
                    invalidateSelf();
                }
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float min = Math.min(rect.width(), rect.height()) / 2.0f;
        RectF rectF = this.f12644b;
        rectF.set(rect);
        Path path = this.f12645c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        wa waVar = this.f12646e;
        if (waVar != null) {
            waVar.g(rectF);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.d.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    public c2(int i10, int i11) {
        this.f12644b = new RectF();
        this.f12645c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f12643a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f12646e = new wa(1, 25);
        } else {
            this.f12646e = null;
        }
    }
}
