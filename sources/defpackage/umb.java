package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.util.Arrays;
public final class umb extends ImageView {
    public static final ax1 x = new ax1(Float.class, "radius", (byte) 4);
    public final Paint a;
    public final Matrix b;
    public RadialGradient c;
    public boolean d;
    public float e;
    public float f;
    public float h;
    public ry8 n;
    public ColorFilter r;
    public final int[] s;
    public final int[] w;

    public umb(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new Matrix();
        this.s = new int[2];
        this.w = new int[2];
    }

    public static void a(Bitmap bitmap, View view, ry8 ry8Var) {
        Drawable drawable = ry8Var.getDrawable();
        if (drawable != null && ry8Var.isAttachedToWindow() && bitmap.isMutable()) {
            int[] iArr = new int[2];
            RectF rectF = new RectF(drawable.getBounds());
            ry8Var.getImageMatrix().mapRect(rectF);
            ry8Var.getLocationInWindow(iArr);
            rectF.offset(ry8Var.getPaddingLeft() + iArr[0], ry8Var.getPaddingTop() + iArr[1]);
            if (view != null) {
                view.getLocationInWindow(iArr);
                rectF.offset(-iArr[0], -iArr[1]);
            }
            int max = Math.max(1, ((int) Math.floor(rectF.left)) - 1);
            int min = Math.min(bitmap.getWidth(), ((int) Math.ceil(rectF.right)) + 1);
            int max2 = Math.max(0, ((int) Math.floor(rectF.top)) - 1);
            int min2 = Math.min(bitmap.getHeight(), ((int) Math.ceil(rectF.bottom)) + 1);
            if (max < min && max2 < min2) {
                int i = min - max;
                int[] iArr2 = new int[i];
                for (int i2 = max2; i2 < min2; i2++) {
                    Arrays.fill(iArr2, bitmap.getPixel(max - 1, i2));
                    bitmap.setPixels(iArr2, 0, i, max, i2, i, 1);
                }
            }
        }
    }

    public final void b(float f, float f2, boolean z) {
        PorterDuff.Mode mode;
        this.e = f;
        this.f = f2;
        this.d = z;
        RadialGradient radialGradient = this.c;
        Paint paint = this.a;
        if (radialGradient == null) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-16777216, -16777216, 0}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            this.c = radialGradient2;
            paint.setShader(radialGradient2);
        }
        if (z) {
            mode = PorterDuff.Mode.DST_OUT;
        } else {
            mode = PorterDuff.Mode.DST_IN;
        }
        paint.setXfermode(new PorterDuffXfermode(mode));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (this.c == null) {
            super.onDraw(canvas);
        } else if (this.h < 1.0f && !this.d) {
        } else {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.onDraw(canvas);
            ry8 ry8Var = this.n;
            if (ry8Var != null) {
                drawable = ry8Var.getDrawable();
            } else {
                drawable = null;
            }
            if (drawable != null && this.n.isAttachedToWindow()) {
                ry8 ry8Var2 = this.n;
                int[] iArr = this.s;
                ry8Var2.getLocationInWindow(iArr);
                int[] iArr2 = this.w;
                getLocationInWindow(iArr2);
                ColorFilter colorFilter = drawable.getColorFilter();
                canvas.save();
                canvas.translate(this.n.getPaddingLeft() + (iArr[0] - iArr2[0]), this.n.getPaddingTop() + (iArr[1] - iArr2[1]));
                canvas.concat(this.n.getImageMatrix());
                drawable.setColorFilter(this.r);
                drawable.draw(canvas);
                drawable.setColorFilter(colorFilter);
                canvas.restore();
                if ((drawable instanceof Animatable) && ((Animatable) drawable).isRunning()) {
                    invalidate();
                }
            }
            float f = this.h;
            if (f >= 1.0f) {
                float f2 = f / 100.0f;
                Matrix matrix = this.b;
                matrix.setScale(f2, f2);
                matrix.postTranslate(this.e, this.f);
                this.c.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.a);
            }
            canvas.restoreToCount(saveLayer);
        }
    }

    public void setRadius(float f) {
        this.h = f;
        invalidate();
    }
}
