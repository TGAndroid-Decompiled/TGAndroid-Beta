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
    public final Bitmap f16125a;
    public final int f16126b;
    public final BitmapShader f16128e;
    public float f16130g;
    public final int f16133k;
    public final int f16134l;
    public final int f16127c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f16129f = new Matrix();
    public final Rect h = new Rect();
    public final RectF f16131i = new RectF();
    public boolean f16132j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f16126b = 160;
        if (resources != null) {
            this.f16126b = resources.getDisplayMetrics().densityDpi;
        }
        this.f16125a = bitmap;
        if (bitmap != null) {
            int i3 = this.f16126b;
            this.f16133k = bitmap.getScaledWidth(i3);
            this.f16134l = bitmap.getScaledHeight(i3);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f16128e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f16134l = -1;
        this.f16133k = -1;
        this.f16128e = null;
    }

    public final void a() {
        if (this.f16132j) {
            Gravity.apply(this.f16127c, this.f16133k, this.f16134l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f16131i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f16128e;
            if (bitmapShader != null) {
                float f10 = rectF.left;
                float f11 = rectF.top;
                Matrix matrix = this.f16129f;
                matrix.setTranslate(f10, f11);
                float width = rectF.width();
                Bitmap bitmap = this.f16125a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f16132j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f16125a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f16131i;
        float f10 = this.f16130g;
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
        return this.f16134l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f16133k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f16127c != 119 || (bitmap = this.f16125a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f16130g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f16130g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f16132j = true;
    }

    @Override
    public final void setAlpha(int i3) {
        Paint paint = this.d;
        if (i3 != paint.getAlpha()) {
            paint.setAlpha(i3);
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
