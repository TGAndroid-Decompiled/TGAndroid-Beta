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
    public final int f3663a;
    public final RectF f3664b;
    public final Path f3665c;
    public final Paint d;
    public final ec f3666e;
    public boolean f3667f;
    public a3.f f3668g;
    public ai.g0 h;
    public boolean f3669i;

    public h3(int i7) {
        this(i0.a.o(i7, 128), i7);
    }

    public final void a() {
        boolean z10;
        if (this.f3666e != null && this.f3669i && pc.e(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f3667f == z10) {
            return;
        }
        this.f3667f = z10;
        if (z10) {
            bg.k d = bg.k.d();
            a3.f fVar = new a3.f(this, 24);
            this.f3668g = fVar;
            d.a(15, fVar);
        } else {
            bg.k.d().f(this.f3668g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f3665c;
        canvas.drawPath(path, paint);
        ec ecVar = this.f3666e;
        if (ecVar != null) {
            if (this.f3667f || !this.f3669i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f3668g == null) {
                    ecVar.d();
                }
                ecVar.a(canvas, this.f3663a);
                canvas.restore();
                if (this.f3668g == null) {
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
        RectF rectF = this.f3664b;
        rectF.set(rect);
        Path path = this.f3665c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        ec ecVar = this.f3666e;
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
        this.f3664b = new RectF();
        this.f3665c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f3663a = i7;
        paint.setColor(i10);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3666e = new ec(1, 25);
        } else {
            this.f3666e = null;
        }
    }
}
