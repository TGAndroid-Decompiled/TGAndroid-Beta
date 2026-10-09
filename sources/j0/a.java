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
    public final Bitmap f13657a;
    public final int f13658b;
    public final BitmapShader f13660e;
    public float f13662g;
    public final int f13665k;
    public final int f13666l;
    public final int f13659c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f13661f = new Matrix();
    public final Rect h = new Rect();
    public final RectF f13663i = new RectF();
    public boolean f13664j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f13658b = 160;
        if (resources != null) {
            this.f13658b = resources.getDisplayMetrics().densityDpi;
        }
        this.f13657a = bitmap;
        if (bitmap != null) {
            int i10 = this.f13658b;
            this.f13665k = bitmap.getScaledWidth(i10);
            this.f13666l = bitmap.getScaledHeight(i10);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f13660e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f13666l = -1;
        this.f13665k = -1;
        this.f13660e = null;
    }

    public final void a() {
        if (this.f13664j) {
            Gravity.apply(this.f13659c, this.f13665k, this.f13666l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f13663i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f13660e;
            if (bitmapShader != null) {
                float f7 = rectF.left;
                float f10 = rectF.top;
                Matrix matrix = this.f13661f;
                matrix.setTranslate(f7, f10);
                float width = rectF.width();
                Bitmap bitmap = this.f13657a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f13664j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f13657a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f13663i;
        float f7 = this.f13662g;
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
        return this.f13666l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f13665k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f13659c != 119 || (bitmap = this.f13657a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f13662g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f13662g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13664j = true;
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
