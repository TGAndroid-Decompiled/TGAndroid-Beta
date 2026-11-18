package bi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import di.ec;
import org.telegram.messenger.pc;
public final class h3 extends Drawable {
    public final int f3689a;
    public final RectF f3690b;
    public final Path f3691c;
    public final Paint d;
    public final ec f3692e;
    public boolean f3693f;
    public a3.f f3694g;
    public ai.g0 h;
    public boolean f3695i;

    public h3(int i7) {
        this(i0.a.o(i7, 128), i7);
    }

    public final void a() {
        boolean z10;
        if (this.f3692e != null && this.f3695i && pc.e(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f3693f == z10) {
            return;
        }
        this.f3693f = z10;
        if (z10) {
            bg.k d = bg.k.d();
            a3.f fVar = new a3.f(this, 24);
            this.f3694g = fVar;
            d.a(15, fVar);
        } else {
            bg.k.d().f(this.f3694g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f3691c;
        canvas.drawPath(path, paint);
        ec ecVar = this.f3692e;
        if (ecVar != null) {
            if (this.f3693f || !this.f3695i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f3694g == null) {
                    ecVar.d();
                }
                ecVar.a(canvas, this.f3689a);
                canvas.restore();
                if (this.f3694g == null) {
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
        RectF rectF = this.f3690b;
        rectF.set(rect);
        Path path = this.f3691c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        ec ecVar = this.f3692e;
        if (ecVar != null) {
            ecVar.g(rectF);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.d.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    public h3(int i7, int i10) {
        this.f3690b = new RectF();
        this.f3691c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f3689a = i7;
        paint.setColor(i10);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3692e = new ec(1, 25);
        } else {
            this.f3692e = null;
        }
    }
}
