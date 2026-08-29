package ih;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import jh.va;
import org.telegram.messenger.LiteMode;
public final class d2 extends Drawable {
    public final int f9089a;
    public final RectF f9090b;
    public final Path f9091c;
    public final Paint d;
    public final va f9092e;
    public boolean f9093f;
    public cg.m2 f9094g;
    public ag.i0 h;
    public boolean f9095i;

    public d2(int i10) {
        this(i0.a.k(i10, 128), i10);
    }

    public final void a() {
        boolean z10;
        if (this.f9092e != null && this.f9095i && LiteMode.isEnabled(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f9093f == z10) {
            return;
        }
        this.f9093f = z10;
        if (z10) {
            jf.j d = jf.j.d();
            cg.m2 m2Var = new cg.m2(this, 22);
            this.f9094g = m2Var;
            d.a(15, m2Var);
        } else {
            jf.j.d().f(this.f9094g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f9091c;
        canvas.drawPath(path, paint);
        va vaVar = this.f9092e;
        if (vaVar != null) {
            if (this.f9093f || !this.f9095i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f9094g == null) {
                    vaVar.d();
                }
                vaVar.a(canvas, this.f9089a);
                canvas.restore();
                if (this.f9094g == null) {
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
        RectF rectF = this.f9090b;
        rectF.set(rect);
        Path path = this.f9091c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        va vaVar = this.f9092e;
        if (vaVar != null) {
            vaVar.g(rectF);
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
        this.f9090b = new RectF();
        this.f9091c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f9089a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f9092e = new va(1, 25);
        } else {
            this.f9092e = null;
        }
    }
}
