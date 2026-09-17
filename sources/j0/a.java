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
    public final Bitmap f13134a;
    public final int f13135b;
    public final BitmapShader f13137e;
    public float f13139g;
    public final int f13142k;
    public final int f13143l;
    public final int f13136c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f13138f = new Matrix();
    public final Rect h = new Rect();
    public final RectF f13140i = new RectF();
    public boolean f13141j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f13135b = 160;
        if (resources != null) {
            this.f13135b = resources.getDisplayMetrics().densityDpi;
        }
        this.f13134a = bitmap;
        if (bitmap != null) {
            int i10 = this.f13135b;
            this.f13142k = bitmap.getScaledWidth(i10);
            this.f13143l = bitmap.getScaledHeight(i10);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f13137e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f13143l = -1;
        this.f13142k = -1;
        this.f13137e = null;
    }

    public final void a() {
        if (this.f13141j) {
            Gravity.apply(this.f13136c, this.f13142k, this.f13143l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f13140i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f13137e;
            if (bitmapShader != null) {
                float f7 = rectF.left;
                float f10 = rectF.top;
                Matrix matrix = this.f13138f;
                matrix.setTranslate(f7, f10);
                float width = rectF.width();
                Bitmap bitmap = this.f13134a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f13141j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f13134a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f13140i;
        float f7 = this.f13139g;
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
        return this.f13143l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f13142k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f13136c != 119 || (bitmap = this.f13134a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f13139g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f13139g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13141j = true;
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
