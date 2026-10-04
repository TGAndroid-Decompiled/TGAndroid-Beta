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
    public final Bitmap f13611a;
    public final int f13612b;
    public final BitmapShader f13614e;
    public float f13616g;
    public final int f13619k;
    public final int f13620l;
    public final int f13613c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f13615f = new Matrix();
    public final Rect h = new Rect();
    public final RectF f13617i = new RectF();
    public boolean f13618j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f13612b = 160;
        if (resources != null) {
            this.f13612b = resources.getDisplayMetrics().densityDpi;
        }
        this.f13611a = bitmap;
        if (bitmap != null) {
            int i10 = this.f13612b;
            this.f13619k = bitmap.getScaledWidth(i10);
            this.f13620l = bitmap.getScaledHeight(i10);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f13614e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f13620l = -1;
        this.f13619k = -1;
        this.f13614e = null;
    }

    public final void a() {
        if (this.f13618j) {
            Gravity.apply(this.f13613c, this.f13619k, this.f13620l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f13617i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f13614e;
            if (bitmapShader != null) {
                float f7 = rectF.left;
                float f10 = rectF.top;
                Matrix matrix = this.f13615f;
                matrix.setTranslate(f7, f10);
                float width = rectF.width();
                Bitmap bitmap = this.f13611a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f13618j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f13611a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f13617i;
        float f7 = this.f13616g;
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
        return this.f13620l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f13619k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f13613c != 119 || (bitmap = this.f13611a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f13616g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f13616g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13618j = true;
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
