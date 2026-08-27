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

    public final Bitmap f12272a;

    public final int f12273b;

    public final BitmapShader f12275e;

    public float f12277g;

    public final int f12280k;

    public final int f12281l;

    public final int f12274c = 119;
    public final Paint d = new Paint(3);

    public final Matrix f12276f = new Matrix();
    public final Rect h = new Rect();

    public final RectF f12278i = new RectF();

    public boolean f12279j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f12273b = 160;
        if (resources != null) {
            this.f12273b = resources.getDisplayMetrics().densityDpi;
        }
        this.f12272a = bitmap;
        if (bitmap == null) {
            this.f12281l = -1;
            this.f12280k = -1;
            this.f12275e = null;
        } else {
            int i10 = this.f12273b;
            this.f12280k = bitmap.getScaledWidth(i10);
            this.f12281l = bitmap.getScaledHeight(i10);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f12275e = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    public final void a() {
        if (this.f12279j) {
            Gravity.apply(this.f12274c, this.f12280k, this.f12281l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f12278i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f12275e;
            if (bitmapShader != null) {
                float f10 = rectF.left;
                float f11 = rectF.top;
                Matrix matrix = this.f12276f;
                matrix.setTranslate(f10, f11);
                float fWidth = rectF.width();
                Bitmap bitmap = this.f12272a;
                matrix.preScale(fWidth / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f12279j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f12272a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f12278i;
        float f10 = this.f12277g;
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
        return this.f12281l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f12280k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        return (this.f12274c != 119 || (bitmap = this.f12272a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f12277g > 0.05f) ? -3 : -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f12277g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f12279j = true;
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
