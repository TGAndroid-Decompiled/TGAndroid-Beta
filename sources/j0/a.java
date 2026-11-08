package j0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
public final class a extends Drawable {
    public final Bitmap f16394a;
    public final int f16395b;
    public final BitmapShader f16397e;
    public float f16399g;
    public final int f16402k;
    public final int f16403l;
    public final int f16396c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f16398f = new Matrix();
    public final Rect h = new Rect();
    public final RectF f16400i = new RectF();
    public boolean f16401j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f16395b = 160;
        if (resources != null) {
            this.f16395b = resources.getDisplayMetrics().densityDpi;
        }
        this.f16394a = bitmap;
        if (bitmap != null) {
            int i7 = this.f16395b;
            this.f16402k = bitmap.getScaledWidth(i7);
            this.f16403l = bitmap.getScaledHeight(i7);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f16397e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f16403l = -1;
        this.f16402k = -1;
        this.f16397e = null;
    }

    public final void a() {
        if (this.f16401j) {
            Gravity.apply(this.f16396c, this.f16402k, this.f16403l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f16400i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f16397e;
            if (bitmapShader != null) {
                float f10 = rectF.left;
                float f11 = rectF.top;
                Matrix matrix = this.f16398f;
                matrix.setTranslate(f10, f11);
                float width = rectF.width();
                Bitmap bitmap = this.f16394a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f16401j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f16394a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f16400i;
        float f10 = this.f16399g;
        canvas.drawRoundRect(rectF, f10, f10, paint);
    }

    @Override
    public final int getAlpha() {
        return this.d.getAlpha();
    }

    @Override
    public final ColorFilter getColorFilter() {
        return this.d.getColorFilter();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f16403l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f16402k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f16396c != 119 || (bitmap = this.f16394a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f16399g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f16399g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f16401j = true;
    }

    @Override
    public final void setAlpha(int i7) {
        Paint paint = this.d;
        if (i7 != paint.getAlpha()) {
            paint.setAlpha(i7);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override
    public final void setDither(boolean z9) {
        this.d.setDither(z9);
        invalidateSelf();
    }

    @Override
    public final void setFilterBitmap(boolean z9) {
        this.d.setFilterBitmap(z9);
        invalidateSelf();
    }
}
