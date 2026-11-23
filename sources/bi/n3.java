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
import org.telegram.messenger.qc;
public final class n3 extends Drawable {
    public final int f3873a;
    public final RectF f3874b;
    public final Path f3875c;
    public final Paint d;
    public final ec f3876e;
    public boolean f3877f;
    public a3.f f3878g;
    public ai.c0 h;
    public boolean f3879i;

    public n3(int i7) {
        this(i0.a.o(i7, 128), i7);
    }

    public final void a() {
        boolean z10;
        if (this.f3876e != null && this.f3879i && qc.e(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f3877f == z10) {
            return;
        }
        this.f3877f = z10;
        if (z10) {
            bg.k d = bg.k.d();
            a3.f fVar = new a3.f(this, 23);
            this.f3878g = fVar;
            d.a(15, fVar);
        } else {
            bg.k.d().f(this.f3878g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f3875c;
        canvas.drawPath(path, paint);
        ec ecVar = this.f3876e;
        if (ecVar != null) {
            if (this.f3877f || !this.f3879i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f3878g == null) {
                    ecVar.d();
                }
                ecVar.a(canvas, this.f3873a);
                canvas.restore();
                if (this.f3878g == null) {
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
        RectF rectF = this.f3874b;
        rectF.set(rect);
        Path path = this.f3875c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        ec ecVar = this.f3876e;
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

    public n3(int i7, int i10) {
        this.f3874b = new RectF();
        this.f3875c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f3873a = i7;
        paint.setColor(i10);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3876e = new ec(1, 25);
        } else {
            this.f3876e = null;
        }
    }
}
