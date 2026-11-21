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
    public final Bitmap f17155a;
    public final int f17156b;
    public final BitmapShader f17158e;
    public float f17160g;
    public final int f17163k;
    public final int f17164l;
    public final int f17157c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f17159f = new Matrix();
    public final Rect h = new Rect();
    public final RectF f17161i = new RectF();
    public boolean f17162j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f17156b = 160;
        if (resources != null) {
            this.f17156b = resources.getDisplayMetrics().densityDpi;
        }
        this.f17155a = bitmap;
        if (bitmap != null) {
            int i7 = this.f17156b;
            this.f17163k = bitmap.getScaledWidth(i7);
            this.f17164l = bitmap.getScaledHeight(i7);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f17158e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f17164l = -1;
        this.f17163k = -1;
        this.f17158e = null;
    }

    public final void a() {
        if (this.f17162j) {
            Gravity.apply(this.f17157c, this.f17163k, this.f17164l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f17161i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f17158e;
            if (bitmapShader != null) {
                float f10 = rectF.left;
                float f11 = rectF.top;
                Matrix matrix = this.f17159f;
                matrix.setTranslate(f10, f11);
                float width = rectF.width();
                Bitmap bitmap = this.f17155a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f17162j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f17155a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f17161i;
        float f10 = this.f17160g;
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
        return this.f17164l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f17163k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f17157c != 119 || (bitmap = this.f17155a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f17160g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f17160g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f17162j = true;
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
