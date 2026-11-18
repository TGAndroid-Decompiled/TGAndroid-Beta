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
    public final Bitmap f17133a;
    public final int f17134b;
    public final BitmapShader f17136e;
    public float f17138g;
    public final int f17141k;
    public final int f17142l;
    public final int f17135c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f17137f = new Matrix();
    public final Rect h = new Rect();
    public final RectF f17139i = new RectF();
    public boolean f17140j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f17134b = 160;
        if (resources != null) {
            this.f17134b = resources.getDisplayMetrics().densityDpi;
        }
        this.f17133a = bitmap;
        if (bitmap != null) {
            int i7 = this.f17134b;
            this.f17141k = bitmap.getScaledWidth(i7);
            this.f17142l = bitmap.getScaledHeight(i7);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f17136e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f17142l = -1;
        this.f17141k = -1;
        this.f17136e = null;
    }

    public final void a() {
        if (this.f17140j) {
            Gravity.apply(this.f17135c, this.f17141k, this.f17142l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f17139i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f17136e;
            if (bitmapShader != null) {
                float f10 = rectF.left;
                float f11 = rectF.top;
                Matrix matrix = this.f17137f;
                matrix.setTranslate(f10, f11);
                float width = rectF.width();
                Bitmap bitmap = this.f17133a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f17140j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f17133a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f17139i;
        float f10 = this.f17138g;
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
        return this.f17142l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f17141k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f17135c != 119 || (bitmap = this.f17133a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f17138g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f17138g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f17140j = true;
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
