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
    public final Bitmap f10340a;
    public final int f10341b;
    public final BitmapShader f10343e;
    public float f10345g;
    public final int f10348k;
    public final int f10349l;
    public final int f10342c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f10344f = new Matrix();
    public final Rect h = new Rect();
    public final RectF f10346i = new RectF();
    public boolean f10347j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f10341b = 160;
        if (resources != null) {
            this.f10341b = resources.getDisplayMetrics().densityDpi;
        }
        this.f10340a = bitmap;
        if (bitmap != null) {
            int i10 = this.f10341b;
            this.f10348k = bitmap.getScaledWidth(i10);
            this.f10349l = bitmap.getScaledHeight(i10);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f10343e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f10349l = -1;
        this.f10348k = -1;
        this.f10343e = null;
    }

    public final void a() {
        if (this.f10347j) {
            Gravity.apply(this.f10342c, this.f10348k, this.f10349l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f10346i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f10343e;
            if (bitmapShader != null) {
                float f9 = rectF.left;
                float f10 = rectF.top;
                Matrix matrix = this.f10344f;
                matrix.setTranslate(f9, f10);
                float width = rectF.width();
                Bitmap bitmap = this.f10340a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f10347j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f10340a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f10346i;
        float f9 = this.f10345g;
        canvas.drawRoundRect(rectF, f9, f9, paint);
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
        return this.f10349l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f10348k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f10342c != 119 || (bitmap = this.f10340a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f10345g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f10345g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f10347j = true;
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
