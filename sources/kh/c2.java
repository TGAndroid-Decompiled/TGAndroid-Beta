package kh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import lh.wa;
import org.telegram.messenger.LiteMode;
public final class c2 extends Drawable {
    public final int f10624a;
    public final RectF f10625b;
    public final Path f10626c;
    public final Paint d;
    public final wa e;
    public boolean f10627f;
    public e3.h f10628g;
    public cg.h0 h;
    public boolean f10629i;

    public c2(int i10) {
        this(i0.a.k(i10, 128), i10);
    }

    public final void a() {
        boolean z4;
        if (this.e != null && this.f10629i && LiteMode.isEnabled(131072)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f10627f == z4) {
            return;
        }
        this.f10627f = z4;
        if (z4) {
            kf.j d = kf.j.d();
            e3.h hVar = new e3.h(this, 28);
            this.f10628g = hVar;
            d.a(15, hVar);
        } else {
            kf.j.d().f(this.f10628g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f10626c;
        canvas.drawPath(path, paint);
        wa waVar = this.e;
        if (waVar != null) {
            if (this.f10627f || !this.f10629i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f10628g == null) {
                    waVar.d();
                }
                waVar.a(canvas, this.f10624a);
                canvas.restore();
                if (this.f10628g == null) {
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
        RectF rectF = this.f10625b;
        rectF.set(rect);
        Path path = this.f10626c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        wa waVar = this.e;
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
        this.f10625b = new RectF();
        this.f10626c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f10624a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = new wa(1, 25);
        } else {
            this.e = null;
        }
    }
}
