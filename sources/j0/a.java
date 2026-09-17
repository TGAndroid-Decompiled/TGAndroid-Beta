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
    public final Bitmap f13160a;
    public final int f13161b;
    public final BitmapShader f13163e;
    public float f13165g;
    public final int f13168k;
    public final int f13169l;
    public final int f13162c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f13164f = new Matrix();
    public final Rect h = new Rect();
    public final RectF f13166i = new RectF();
    public boolean f13167j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.f13161b = 160;
        if (resources != null) {
            this.f13161b = resources.getDisplayMetrics().densityDpi;
        }
        this.f13160a = bitmap;
        if (bitmap != null) {
            int i10 = this.f13161b;
            this.f13168k = bitmap.getScaledWidth(i10);
            this.f13169l = bitmap.getScaledHeight(i10);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f13163e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f13169l = -1;
        this.f13168k = -1;
        this.f13163e = null;
    }

    public final void a() {
        if (this.f13167j) {
            Gravity.apply(this.f13162c, this.f13168k, this.f13169l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.f13166i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f13163e;
            if (bitmapShader != null) {
                float f7 = rectF.left;
                float f10 = rectF.top;
                Matrix matrix = this.f13164f;
                matrix.setTranslate(f7, f10);
                float width = rectF.width();
                Bitmap bitmap = this.f13160a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.f13167j = false;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f13160a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.f13166i;
        float f7 = this.f13165g;
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
        return this.f13169l;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f13168k;
    }

    @Override
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.f13162c != 119 || (bitmap = this.f13160a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.f13165g > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.f13165g);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13167j = true;
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
