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
    public final Bitmap f8375a;
    public final int f8376b;
    public final BitmapShader e;
    public float f8379g;
    public final int f8382k;
    public final int f8383l;
    public final int f8377c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f8378f = new Matrix();
    public final Rect h = new Rect();
    public final RectF f8380i = new RectF();
    public boolean f8381j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f8376b = 160;
        if (resources != null) {
            this.f8376b = resources.getDisplayMetrics().densityDpi;
        }
        this.f8375a = bitmap;
        if (bitmap != null) {
            int i10 = this.f8376b;
            this.f8382k = bitmap.getScaledWidth(i10);
            this.f8383l = bitmap.getScaledHeight(i10);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f8383l = -1;
        this.f8382k = -1;
        this.e = null;
    }

    public final void a() {
        if (this.f8381j) {
            Gravity.apply(this.f8377c, this.f8382k, this.f8383l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f8380i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.e;
            if (bitmapShader != null) {
                float f10 = rectF.left;
                float f11 = rectF.top;
                Matrix matrix = this.f8378f;
                matrix.setTranslate(f10, f11);
                float width = rectF.width();
                Bitmap bitmap = this.f8375a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f8381j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f8375a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f8380i;
        float f10 = this.f8379g;
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
        return this.f8383l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f8382k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f8377c != 119 || (bitmap = this.f8375a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f8379g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f8379g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f8381j = true;
    }

    @Override
    public final void setAlpha(int i10) {
        Paint paint = this.d;
        if (i10 != paint.getAlpha()) {
            paint.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override
    public final void setDither(boolean z4) {
        this.d.setDither(z4);
        invalidateSelf();
    }

    @Override
    public final void setFilterBitmap(boolean z4) {
        this.d.setFilterBitmap(z4);
        invalidateSelf();
    }
}
