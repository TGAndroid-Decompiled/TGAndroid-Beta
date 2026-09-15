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
    public final Bitmap f12534a;
    public final int f12535b;
    public final BitmapShader e;
    public float f12538g;
    public final int f12541k;
    public final int f12542l;
    public final int f12536c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f12537f = new Matrix();
    public final Rect h = new Rect();
    public final RectF f12539i = new RectF();
    public boolean f12540j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f12535b = 160;
        if (resources != null) {
            this.f12535b = resources.getDisplayMetrics().densityDpi;
        }
        this.f12534a = bitmap;
        if (bitmap != null) {
            int i10 = this.f12535b;
            this.f12541k = bitmap.getScaledWidth(i10);
            this.f12542l = bitmap.getScaledHeight(i10);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f12542l = -1;
        this.f12541k = -1;
        this.e = null;
    }

    public final void a() {
        if (this.f12540j) {
            Gravity.apply(this.f12536c, this.f12541k, this.f12542l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f12539i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.e;
            if (bitmapShader != null) {
                float f7 = rectF.left;
                float f10 = rectF.top;
                Matrix matrix = this.f12537f;
                matrix.setTranslate(f7, f10);
                float width = rectF.width();
                Bitmap bitmap = this.f12534a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f12540j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f12534a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f12539i;
        float f7 = this.f12538g;
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
        return this.f12542l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f12541k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f12536c != 119 || (bitmap = this.f12534a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f12538g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f12538g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f12540j = true;
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
