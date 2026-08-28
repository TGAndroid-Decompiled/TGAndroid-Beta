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
    public final Bitmap f13175a;
    public final int f13176b;
    public final BitmapShader f13178e;
    public float f13180g;
    public final int f13183k;
    public final int f13184l;
    public final int f13177c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f13179f = new Matrix();
    public final Rect h = new Rect();
    public final RectF f13181i = new RectF();
    public boolean f13182j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f13176b = 160;
        if (resources != null) {
            this.f13176b = resources.getDisplayMetrics().densityDpi;
        }
        this.f13175a = bitmap;
        if (bitmap != null) {
            int i9 = this.f13176b;
            this.f13183k = bitmap.getScaledWidth(i9);
            this.f13184l = bitmap.getScaledHeight(i9);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f13178e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f13184l = -1;
        this.f13183k = -1;
        this.f13178e = null;
    }

    public final void a() {
        if (this.f13182j) {
            Gravity.apply(this.f13177c, this.f13183k, this.f13184l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f13181i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f13178e;
            if (bitmapShader != null) {
                float f10 = rectF.left;
                float f11 = rectF.top;
                Matrix matrix = this.f13179f;
                matrix.setTranslate(f10, f11);
                float width = rectF.width();
                Bitmap bitmap = this.f13175a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f13182j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f13175a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f13181i;
        float f10 = this.f13180g;
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
        return this.f13184l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f13183k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f13177c != 119 || (bitmap = this.f13175a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f13180g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f13180g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13182j = true;
    }

    @Override
    public final void setAlpha(int i9) {
        Paint paint = this.d;
        if (i9 != paint.getAlpha()) {
            paint.setAlpha(i9);
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
