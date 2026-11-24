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
public final class vm0 extends Drawable {
    public float a = 1.0f;
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Path d = new Path();
    public final float e;
    public final float f;
    public final Drawable g;
    public final float h;
    public final wm0 i;

    public vm0(wm0 wm0Var, float f, float f2, Drawable drawable, float f3) {
        this.i = wm0Var;
        this.e = f;
        this.f = f2;
        this.g = drawable;
        this.h = f3;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap b;
        wm0 wm0Var = this.i;
        sm0 sm0Var = wm0Var.a;
        Matrix matrix = wm0Var.p;
        Paint paint = null;
        if (sm0Var != null && (b = sm0Var.b()) != null) {
            if (wm0Var.o == null || wm0Var.n != b) {
                wm0Var.n = b;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b, tileMode, tileMode);
                wm0Var.o = bitmapShader;
                wm0Var.h.setShader(bitmapShader);
            }
            matrix.reset();
            matrix.postTranslate((-0.0f) - this.e, (-0.0f) - this.f);
            View view = sm0Var.b;
            if (view != null) {
                matrix.preScale(view.getWidth() / b.getWidth(), sm0Var.b.getHeight() / b.getHeight());
            }
            wm0Var.o.setLocalMatrix(matrix);
            wm0Var.h.setAlpha((int) (this.a * 255.0f));
            paint = wm0Var.h;
        }
        Paint paint2 = paint;
        Rect bounds = getBounds();
        Drawable drawable = this.g;
        Paint paint3 = this.b;
        float f = this.h;
        if (paint2 == null && (sm0Var == null || !sm0Var.c())) {
            if (drawable != null) {
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                return;
            }
            paint3.setColor(-14145495);
            if (f > 0.0f) {
                RectF rectF = gm.P;
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
            if (sm0Var != null && sm0Var.c()) {
                canvas.save();
                getPadding(rect);
                RectF rectF2 = gm.P;
                rectF2.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
                path.rewind();
                path.addRoundRect(rectF2, f, f, Path.Direction.CW);
                canvas.clipPath(path);
                wm0Var.b(canvas, false);
                canvas.restore();
            } else {
                canvas.drawRect(bounds, paint2);
            }
            canvas.restore();
            getPadding(rect);
            RectF rectF3 = gm.P;
            rectF3.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
            paint3.setColor(1711276032);
            canvas.drawRoundRect(rectF3, f, f, paint3);
            return;
        }
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i > 0) {
            RectF rectF4 = gm.P;
            rectF4.set(bounds);
            if (sm0Var != null && sm0Var.c()) {
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF4, f, f, Path.Direction.CW);
                canvas.clipPath(path);
                wm0Var.b(canvas, false);
                canvas.restore();
            } else {
                canvas.drawRoundRect(rectF4, f, f, paint2);
            }
        } else if (sm0Var != null && sm0Var.c()) {
            canvas.save();
            canvas.clipRect(bounds);
            wm0Var.b(canvas, false);
            canvas.restore();
        } else {
            canvas.drawRect(bounds, paint2);
        }
        paint3.setColor(1711276032);
        if (i > 0) {
            RectF rectF5 = gm.P;
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
