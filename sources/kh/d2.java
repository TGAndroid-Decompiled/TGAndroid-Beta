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
public final class d2 extends Drawable {
    public final int f10527a;
    public final RectF f10528b;
    public final Path f10529c;
    public final Paint d;
    public final wa e;
    public boolean f10530f;
    public ef.e f10531g;
    public cg.h0 h;
    public boolean f10532i;

    public d2(int i10) {
        this(i0.a.k(i10, 128), i10);
    }

    public final void a() {
        boolean z4;
        if (this.e != null && this.f10532i && LiteMode.isEnabled(131072)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f10530f == z4) {
            return;
        }
        this.f10530f = z4;
        if (z4) {
            lf.j d = lf.j.d();
            ef.e eVar = new ef.e(this, 26);
            this.f10531g = eVar;
            d.a(15, eVar);
        } else {
            lf.j.d().f(this.f10531g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f10529c;
        canvas.drawPath(path, paint);
        wa waVar = this.e;
        if (waVar != null) {
            if (this.f10530f || !this.f10532i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f10531g == null) {
                    waVar.d();
                }
                waVar.a(canvas, this.f10527a);
                canvas.restore();
                if (this.f10531g == null) {
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
        RectF rectF = this.f10528b;
        rectF.set(rect);
        Path path = this.f10529c;
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

    public d2(int i10, int i11) {
        this.f10528b = new RectF();
        this.f10529c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f10527a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = new wa(1, 25);
        } else {
            this.e = null;
        }
    }
}
