package ai;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import ci.lc;
public final class w2 extends Drawable {
    public final int f1055a;
    public final RectF f1056b;
    public final Path f1057c;
    public final Paint d;
    public final lc f1058e;
    public boolean f1059f;
    public s f1060g;
    public v2 h;
    public boolean f1061i;

    public w2(int i3) {
        this(i0.a.o(i3, 128), i3);
    }

    public final void a() {
        boolean z10;
        if (this.f1058e != null && this.f1061i && org.telegram.messenger.lc.e(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f1059f == z10) {
            return;
        }
        this.f1059f = z10;
        if (z10) {
            cg.j d = cg.j.d();
            s sVar = new s(this, 5);
            this.f1060g = sVar;
            d.a(15, sVar);
        } else {
            cg.j.d().f(this.f1060g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f1057c;
        canvas.drawPath(path, paint);
        lc lcVar = this.f1058e;
        if (lcVar != null) {
            if (this.f1059f || !this.f1061i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f1060g == null) {
                    lcVar.d();
                }
                lcVar.a(canvas, this.f1055a);
                canvas.restore();
                if (this.f1060g == null) {
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
        RectF rectF = this.f1056b;
        rectF.set(rect);
        Path path = this.f1057c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        lc lcVar = this.f1058e;
        if (lcVar != null) {
            lcVar.g(rectF);
        }
    }

    @Override
    public final void setAlpha(int i3) {
        this.d.setAlpha(i3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    public w2(int i3, int i10) {
        this.f1056b = new RectF();
        this.f1057c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f1055a = i3;
        paint.setColor(i10);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1058e = new lc(1, 25);
        } else {
            this.f1058e = null;
        }
    }
}
