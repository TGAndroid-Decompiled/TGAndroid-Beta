package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class wl0 extends Drawable {
    public float a = 1.0f;
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Path d = new Path();
    public final float e;
    public final float f;
    public final Drawable g;
    public final float h;
    public final xl0 i;

    public wl0(xl0 xl0Var, float f, float f2, Drawable drawable, float f3) {
        this.i = xl0Var;
        this.e = f;
        this.f = f2;
        this.g = drawable;
        this.h = f3;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap b;
        xl0 xl0Var = this.i;
        tl0 tl0Var = xl0Var.a;
        Matrix matrix = xl0Var.p;
        Paint paint = null;
        if (tl0Var != null && (b = tl0Var.b()) != null) {
            if (xl0Var.o == null || xl0Var.n != b) {
                xl0Var.n = b;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b, tileMode, tileMode);
                xl0Var.o = bitmapShader;
                xl0Var.h.setShader(bitmapShader);
            }
            matrix.reset();
            matrix.postTranslate((-0.0f) - this.e, (-0.0f) - this.f);
            View view = tl0Var.b;
            if (view != null) {
                matrix.preScale(view.getWidth() / b.getWidth(), tl0Var.b.getHeight() / b.getHeight());
            }
            xl0Var.o.setLocalMatrix(matrix);
            xl0Var.h.setAlpha((int) (this.a * 255.0f));
            paint = xl0Var.h;
        }
        Paint paint2 = paint;
        Rect bounds = getBounds();
        Drawable drawable = this.g;
        Paint paint3 = this.b;
        float f = this.h;
        if (paint2 == null && (tl0Var == null || !tl0Var.c())) {
            if (drawable != null) {
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                return;
            }
            paint3.setColor(-14145495);
            if (f > 0.0f) {
                RectF rectF = hl.P;
                rectF.set(bounds);
                canvas.drawRoundRect(rectF, f, f, paint3);
                return;
            }
            canvas.drawRect(bounds, paint3);
            return;
        }
        Path path = this.d;
        if (drawable != null) {
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
            drawable.setBounds(bounds);
            drawable.draw(canvas);
            Rect rect = this.c;
            if (tl0Var != null && tl0Var.c()) {
                canvas.save();
                getPadding(rect);
                RectF rectF2 = hl.P;
                rectF2.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
                path.rewind();
                path.addRoundRect(rectF2, f, f, Path.Direction.CW);
                canvas.clipPath(path);
                xl0Var.b(canvas, false);
                canvas.restore();
            } else {
                canvas.drawRect(bounds, paint2);
            }
            canvas.restore();
            getPadding(rect);
            RectF rectF3 = hl.P;
            rectF3.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
            paint3.setColor(1711276032);
            canvas.drawRoundRect(rectF3, f, f, paint3);
            return;
        }
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i > 0) {
            RectF rectF4 = hl.P;
            rectF4.set(bounds);
            if (tl0Var != null && tl0Var.c()) {
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF4, f, f, Path.Direction.CW);
                canvas.clipPath(path);
                xl0Var.b(canvas, false);
                canvas.restore();
            } else {
                canvas.drawRoundRect(rectF4, f, f, paint2);
            }
        } else if (tl0Var != null && tl0Var.c()) {
            canvas.save();
            canvas.clipRect(bounds);
            xl0Var.b(canvas, false);
            canvas.restore();
        } else {
            canvas.drawRect(bounds, paint2);
        }
        paint3.setColor(1711276032);
        if (i > 0) {
            RectF rectF5 = hl.P;
            rectF5.set(bounds);
            canvas.drawRoundRect(rectF5, f, f, paint3);
            return;
        }
        canvas.drawRect(bounds, paint3);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.g;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        rect.set(0, 0, 0, 0);
        return true;
    }

    @Override
    public final void setAlpha(int i) {
        this.a = i / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
