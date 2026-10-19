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
    public final Bitmap f13911a;
    public final int f13912b;
    public final BitmapShader e;
    public float f13915g;
    public final int f13918k;
    public final int f13919l;
    public final int f13913c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f13914f = new Matrix();
    public final Rect h = new Rect();
    public final RectF f13916i = new RectF();
    public boolean f13917j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f13912b = 160;
        if (resources != null) {
            this.f13912b = resources.getDisplayMetrics().densityDpi;
        }
        this.f13911a = bitmap;
        if (bitmap != null) {
            int i10 = this.f13912b;
            this.f13918k = bitmap.getScaledWidth(i10);
            this.f13919l = bitmap.getScaledHeight(i10);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f13919l = -1;
        this.f13918k = -1;
        this.e = null;
    }

    public final void a() {
        if (this.f13917j) {
            Gravity.apply(this.f13913c, this.f13918k, this.f13919l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f13916i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.e;
            if (bitmapShader != null) {
                float f7 = rectF.left;
                float f10 = rectF.top;
                Matrix matrix = this.f13914f;
                matrix.setTranslate(f7, f10);
                float width = rectF.width();
                Bitmap bitmap = this.f13911a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f13917j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f13911a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f13916i;
        float f7 = this.f13915g;
        canvas.drawRoundRect(rectF, f7, f7, paint);
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
        return this.f13919l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f13918k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f13913c != 119 || (bitmap = this.f13911a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f13915g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f13915g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13917j = true;
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
