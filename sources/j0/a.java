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
    public final Bitmap f17221a;
    public final int f17222b;
    public final BitmapShader f17224e;
    public float f17226g;
    public final int f17229k;
    public final int f17230l;
    public final int f17223c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f17225f = new Matrix();
    public final Rect h = new Rect();
    public final RectF f17227i = new RectF();
    public boolean f17228j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f17222b = 160;
        if (resources != null) {
            this.f17222b = resources.getDisplayMetrics().densityDpi;
        }
        this.f17221a = bitmap;
        if (bitmap != null) {
            int i7 = this.f17222b;
            this.f17229k = bitmap.getScaledWidth(i7);
            this.f17230l = bitmap.getScaledHeight(i7);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f17224e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f17230l = -1;
        this.f17229k = -1;
        this.f17224e = null;
    }

    public final void a() {
        if (this.f17228j) {
            Gravity.apply(this.f17223c, this.f17229k, this.f17230l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f17227i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f17224e;
            if (bitmapShader != null) {
                float f10 = rectF.left;
                float f11 = rectF.top;
                Matrix matrix = this.f17225f;
                matrix.setTranslate(f10, f11);
                float width = rectF.width();
                Bitmap bitmap = this.f17221a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f17228j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f17221a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f17227i;
        float f10 = this.f17226g;
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
        return this.f17230l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f17229k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f17223c != 119 || (bitmap = this.f17221a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f17226g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f17226g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f17228j = true;
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
    public final void setDither(boolean z10) {
        this.d.setDither(z10);
        invalidateSelf();
    }

    @Override
    public final void setFilterBitmap(boolean z10) {
        this.d.setFilterBitmap(z10);
        invalidateSelf();
    }
}
