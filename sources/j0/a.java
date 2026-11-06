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
    public final Bitmap f16391a;
    public final int f16392b;
    public final BitmapShader f16394e;
    public float f16396g;
    public final int f16399k;
    public final int f16400l;
    public final int f16393c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f16395f = new Matrix();
    public final Rect h = new Rect();
    public final RectF f16397i = new RectF();
    public boolean f16398j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f16392b = 160;
        if (resources != null) {
            this.f16392b = resources.getDisplayMetrics().densityDpi;
        }
        this.f16391a = bitmap;
        if (bitmap != null) {
            int i7 = this.f16392b;
            this.f16399k = bitmap.getScaledWidth(i7);
            this.f16400l = bitmap.getScaledHeight(i7);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f16394e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f16400l = -1;
        this.f16399k = -1;
        this.f16394e = null;
    }

    public final void a() {
        if (this.f16398j) {
            Gravity.apply(this.f16393c, this.f16399k, this.f16400l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f16397i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f16394e;
            if (bitmapShader != null) {
                float f10 = rectF.left;
                float f11 = rectF.top;
                Matrix matrix = this.f16395f;
                matrix.setTranslate(f10, f11);
                float width = rectF.width();
                Bitmap bitmap = this.f16391a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f16398j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f16391a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f16397i;
        float f10 = this.f16396g;
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
        return this.f16400l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f16399k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f16393c != 119 || (bitmap = this.f16391a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f16396g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f16396g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f16398j = true;
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
