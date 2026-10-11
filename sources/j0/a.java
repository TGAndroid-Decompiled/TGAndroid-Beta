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
    public final Bitmap f13656a;
    public final int f13657b;
    public final BitmapShader f13659e;
    public float f13661g;
    public final int f13664k;
    public final int f13665l;
    public final int f13658c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f13660f = new Matrix();
    public final Rect h = new Rect();
    public final RectF f13662i = new RectF();
    public boolean f13663j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f13657b = 160;
        if (resources != null) {
            this.f13657b = resources.getDisplayMetrics().densityDpi;
        }
        this.f13656a = bitmap;
        if (bitmap != null) {
            int i10 = this.f13657b;
            this.f13664k = bitmap.getScaledWidth(i10);
            this.f13665l = bitmap.getScaledHeight(i10);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f13659e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f13665l = -1;
        this.f13664k = -1;
        this.f13659e = null;
    }

    public final void a() {
        if (this.f13663j) {
            Gravity.apply(this.f13658c, this.f13664k, this.f13665l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f13662i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f13659e;
            if (bitmapShader != null) {
                float f7 = rectF.left;
                float f10 = rectF.top;
                Matrix matrix = this.f13660f;
                matrix.setTranslate(f7, f10);
                float width = rectF.width();
                Bitmap bitmap = this.f13656a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f13663j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f13656a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f13662i;
        float f7 = this.f13661g;
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
        return this.f13665l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f13664k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f13658c != 119 || (bitmap = this.f13656a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f13661g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f13661g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13663j = true;
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
