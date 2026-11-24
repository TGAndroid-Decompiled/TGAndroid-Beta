package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
public final class foc extends Drawable {
    public final byte a;
    public final Path b;
    public final Paint c;
    public final Object d;
    public final Object e;

    public foc() {
        this.a = (byte) 0;
        this.c = new Paint(1);
        this.b = new Path();
        this.d = new RectF();
        this.e = new float[]{gm.L(24.0f), gm.L(24.0f), gm.L(24.0f), gm.L(24.0f), 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public final void c() {
        invalidateSelf();
        ((wu) this.e).P.setContentDescription(jb6.M0(2131750519, null));
    }

    @Override
    public final void draw(Canvas canvas) {
        byte b = this.a;
        Paint paint = this.c;
        Path path = this.b;
        switch (b) {
            case 0:
                canvas.drawPath(path, paint);
                return;
            default:
                float d = ((ln) this.d).d(true);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float width = getBounds().width();
                float f = 0.57f * width;
                path.rewind();
                float f2 = f / 2.0f;
                path.moveTo(centerX - gm.R1(f2, (-f) / 2.0f, d), centerY);
                float f3 = f2 + centerX;
                path.lineTo(f3, centerY);
                float f4 = f3 - (0.27f * width);
                float f5 = (0.54f * width) / 2.0f;
                path.moveTo(f4, centerY - f5);
                path.lineTo(f3, centerY);
                path.lineTo(f4, f5 + centerY);
                canvas.save();
                paint.setStrokeWidth(gm.L(2.0f));
                canvas.translate(0.0f, (-width) * 0.1f * d);
                canvas.rotate(d * 90.0f, centerX, centerY);
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return gm.L(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return gm.L(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return -3;
            default:
                return -2;
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        switch (this.a) {
            case 0:
                super.onBoundsChange(rect);
                RectF rectF = (RectF) this.d;
                rectF.set(rect);
                Path path = this.b;
                path.reset();
                path.addRoundRect(rectF, (float[]) this.e, Path.Direction.CW);
                this.c.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{-16216082, -12207881}, new float[]{0.15f, 0.53f}, Shader.TileMode.CLAMP));
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                this.c.setAlpha(i);
                invalidateSelf();
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                this.c.setColorFilter(colorFilter);
                invalidateSelf();
                return;
            default:
                return;
        }
    }

    public foc(wu wuVar) {
        this.a = (byte) 1;
        this.e = wuVar;
        this.b = new Path();
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.d = new ln(new cpc(this, (byte) 9), 350L, d53.h, 0);
    }

    private final void a(int i) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
