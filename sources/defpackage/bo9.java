package defpackage;

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
public final class bo9 extends Drawable {
    public final Bitmap a;
    public final BitmapShader d;
    public float f;
    public final int j;
    public final int k;
    public final byte b = 119;
    public final Paint c = new Paint(3);
    public final Matrix e = new Matrix();
    public final Rect g = new Rect();
    public final RectF h = new RectF();
    public boolean i = true;

    public bo9(Resources resources, Bitmap bitmap) {
        int i;
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        } else {
            i = 160;
        }
        this.a = bitmap;
        if (bitmap != null) {
            this.j = bitmap.getScaledWidth(i);
            this.k = bitmap.getScaledHeight(i);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.d = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.k = -1;
        this.j = -1;
        this.d = null;
    }

    public final void a() {
        if (this.i) {
            Gravity.apply(this.b, this.j, this.k, getBounds(), this.g, 0);
            Rect rect = this.g;
            RectF rectF = this.h;
            rectF.set(rect);
            BitmapShader bitmapShader = this.d;
            if (bitmapShader != null) {
                float f = rectF.left;
                float f2 = rectF.top;
                Matrix matrix = this.e;
                matrix.setTranslate(f, f2);
                float width = rectF.width();
                Bitmap bitmap = this.a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.c.setShader(bitmapShader);
            }
            this.i = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.c;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.g, paint);
            return;
        }
        RectF rectF = this.h;
        float f = this.f;
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    @Override
    public final int getAlpha() {
        return this.c.getAlpha();
    }

    @Override
    public final ColorFilter getColorFilter() {
        return this.c.getColorFilter();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.k;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.j;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.b != 119 || (bitmap = this.a) == null || bitmap.hasAlpha() || this.c.getAlpha() < 255 || this.f > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.g, this.f);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.i = true;
    }

    @Override
    public final void setAlpha(int i) {
        Paint paint = this.c;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override
    public final void setDither(boolean z) {
        this.c.setDither(z);
        invalidateSelf();
    }

    @Override
    public final void setFilterBitmap(boolean z) {
        this.c.setFilterBitmap(z);
        invalidateSelf();
    }
}
