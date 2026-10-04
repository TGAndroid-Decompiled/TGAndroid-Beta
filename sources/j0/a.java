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
    public final Bitmap f13610a;
    public final int f13611b;
    public final BitmapShader f13613e;
    public float f13615g;
    public final int f13618k;
    public final int f13619l;
    public final int f13612c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f13614f = new Matrix();
    public final Rect h = new Rect();
    public final RectF f13616i = new RectF();
    public boolean f13617j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f13611b = 160;
        if (resources != null) {
            this.f13611b = resources.getDisplayMetrics().densityDpi;
        }
        this.f13610a = bitmap;
        if (bitmap != null) {
            int i10 = this.f13611b;
            this.f13618k = bitmap.getScaledWidth(i10);
            this.f13619l = bitmap.getScaledHeight(i10);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f13613e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f13619l = -1;
        this.f13618k = -1;
        this.f13613e = null;
    }

    public final void a() {
        if (this.f13617j) {
            Gravity.apply(this.f13612c, this.f13618k, this.f13619l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f13616i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f13613e;
            if (bitmapShader != null) {
                float f7 = rectF.left;
                float f10 = rectF.top;
                Matrix matrix = this.f13614f;
                matrix.setTranslate(f7, f10);
                float width = rectF.width();
                Bitmap bitmap = this.f13610a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f13617j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f13610a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f13616i;
        float f7 = this.f13615g;
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
        return this.f13619l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f13618k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f13612c != 119 || (bitmap = this.f13610a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f13615g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f13615g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13617j = true;
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
