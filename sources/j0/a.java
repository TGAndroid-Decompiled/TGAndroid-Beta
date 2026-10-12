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
    public final Bitmap f12495a;
    public final int f12496b;
    public final BitmapShader e;
    public float f12499g;
    public final int f12502k;
    public final int f12503l;
    public final int f12497c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f12498f = new Matrix();
    public final Rect h = new Rect();
    public final RectF f12500i = new RectF();
    public boolean f12501j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f12496b = 160;
        if (resources != null) {
            this.f12496b = resources.getDisplayMetrics().densityDpi;
        }
        this.f12495a = bitmap;
        if (bitmap != null) {
            int i10 = this.f12496b;
            this.f12502k = bitmap.getScaledWidth(i10);
            this.f12503l = bitmap.getScaledHeight(i10);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f12503l = -1;
        this.f12502k = -1;
        this.e = null;
    }

    public final void a() {
        if (this.f12501j) {
            Gravity.apply(this.f12497c, this.f12502k, this.f12503l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f12500i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.e;
            if (bitmapShader != null) {
                float f7 = rectF.left;
                float f10 = rectF.top;
                Matrix matrix = this.f12498f;
                matrix.setTranslate(f7, f10);
                float width = rectF.width();
                Bitmap bitmap = this.f12495a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f12501j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f12495a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f12500i;
        float f7 = this.f12499g;
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
        return this.f12503l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f12502k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f12497c != 119 || (bitmap = this.f12495a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f12499g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f12499g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f12501j = true;
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
