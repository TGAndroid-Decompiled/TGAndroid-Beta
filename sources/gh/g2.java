package gh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import hh.bb;
import org.telegram.messenger.LiteMode;

public final class g2 extends Drawable {

    public final int f7262a;

    public final RectF f7263b;

    public final Path f7264c;
    public final Paint d;

    public final bb f7265e;

    public boolean f7266f;

    public f2.r f7267g;
    public ag.n0 h;

    public boolean f7268i;

    public g2(int i10) {
        this(i0.b.k(i10, 128), i10);
    }

    public final void a() {
        boolean z10 = this.f7265e != null && this.f7268i && LiteMode.isEnabled(131072);
        if (this.f7266f == z10) {
            return;
        }
        this.f7266f = z10;
        if (z10) {
            gf.k kVarD = gf.k.d();
            f2.r rVar = new f2.r(this, 9);
            this.f7267g = rVar;
            kVarD.a(15, rVar);
        } else {
            gf.k.d().g(this.f7267g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f7264c;
        canvas.drawPath(path, paint);
        bb bbVar = this.f7265e;
        if (bbVar != null) {
            if (this.f7266f || !this.f7268i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f7267g == null) {
                    bbVar.d();
                }
                bbVar.a(canvas, this.f7262a);
                canvas.restore();
                if (this.f7267g == null) {
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
        float fMin = Math.min(rect.width(), rect.height()) / 2.0f;
        RectF rectF = this.f7263b;
        rectF.set(rect);
        Path path = this.f7264c;
        path.rewind();
        path.addRoundRect(rectF, fMin, fMin, Path.Direction.CW);
        bb bbVar = this.f7265e;
        if (bbVar != null) {
            bbVar.g(rectF);
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

    public g2(int i10, int i11) {
        this.f7263b = new RectF();
        this.f7264c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f7262a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f7265e = new bb(1, 25);
        } else {
            this.f7265e = null;
        }
    }
}
