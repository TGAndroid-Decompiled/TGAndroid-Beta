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
    public final Bitmap f8393a;
    public final int f8394b;
    public final BitmapShader e;
    public float f8397g;
    public final int f8400k;
    public final int f8401l;
    public final int f8395c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f8396f = new Matrix();
    public final Rect h = new Rect();
    public final RectF f8398i = new RectF();
    public boolean f8399j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f8394b = 160;
        if (resources != null) {
            this.f8394b = resources.getDisplayMetrics().densityDpi;
        }
        this.f8393a = bitmap;
        if (bitmap != null) {
            int i10 = this.f8394b;
            this.f8400k = bitmap.getScaledWidth(i10);
            this.f8401l = bitmap.getScaledHeight(i10);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f8401l = -1;
        this.f8400k = -1;
        this.e = null;
    }

    public final void a() {
        if (this.f8399j) {
            Gravity.apply(this.f8395c, this.f8400k, this.f8401l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f8398i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.e;
            if (bitmapShader != null) {
                float f10 = rectF.left;
                float f11 = rectF.top;
                Matrix matrix = this.f8396f;
                matrix.setTranslate(f10, f11);
                float width = rectF.width();
                Bitmap bitmap = this.f8393a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f8399j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f8393a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f8398i;
        float f10 = this.f8397g;
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
        return this.f8401l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f8400k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f8395c != 119 || (bitmap = this.f8393a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f8397g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f8397g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f8399j = true;
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
