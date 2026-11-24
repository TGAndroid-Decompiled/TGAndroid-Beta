package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.HashSet;
public final class ql0 extends Drawable implements tjb {
    public final Paint E;
    public int F;
    public boolean G;
    public int H;
    public final Paint a;
    public final il0 b;
    public final Matrix c;
    public LinearGradient d;
    public final Matrix e;
    public LinearGradient f;
    public BitmapShader h;
    public ComposeShader n;
    public final Matrix r;
    public final Paint s;
    public Bitmap w;
    public int x;
    public boolean y;

    public ql0(il0 il0Var) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = new Matrix();
        this.e = new Matrix();
        this.r = new Matrix();
        Paint paint2 = new Paint(1);
        this.s = paint2;
        in inVar = new in(this, (byte) 1);
        this.E = new Paint(1);
        this.H = 255;
        this.b = il0Var;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(gl.L(40.0f), false);
        il0Var.setCallback(inVar);
    }

    public static LinearGradient a(int i, boolean z) {
        int alpha = Color.alpha(i);
        if (z) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{bm2.o(i, 0), bm2.o(i, (alpha * 96) / 285), bm2.o(i, (alpha * 176) / 285), bm2.o(i, (alpha * 232) / 285)}, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{bm2.o(i, 0), bm2.o(i, (alpha * 96) / 255), bm2.o(i, (alpha * 176) / 255), bm2.o(i, (alpha * 232) / 255), bm2.o(i, (alpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i, boolean z) {
        if (this.x == i && this.y == z) {
            return;
        }
        this.x = i;
        this.y = z;
        LinearGradient a = a(-16777216, z);
        this.d = a;
        this.a.setShader(a);
        this.E.setShader(null);
        Matrix matrix = this.c;
        matrix.reset();
        matrix.setScale(1.0f, i);
        if (i < 0) {
            matrix.postTranslate(0.0f, -i);
        }
        this.d.setLocalMatrix(matrix);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i;
        boolean z;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.H != 0) {
            il0 il0Var = this.b;
            gx4 v = il0.v(il0Var.r);
            int i2 = 0;
            if (!this.G) {
                boolean z2 = v instanceof ix4;
                Matrix matrix = this.c;
                Matrix matrix2 = this.e;
                if (z2) {
                    int i3 = ((ix4) v).b;
                    int i4 = this.F;
                    Paint paint = this.E;
                    if (i4 != i3 || this.f == null) {
                        LinearGradient a = a(i3, this.y);
                        this.f = a;
                        this.F = i3;
                        paint.setShader(a);
                    }
                    if (this.x < 0) {
                        i2 = bounds.height() + this.x;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i2);
                    this.f.setLocalMatrix(matrix2);
                    paint.setAlpha(this.H);
                    canvas.drawRect(bounds, paint);
                    return;
                } else if ((v instanceof hx4) && (i = Build.VERSION.SDK_INT) >= 28) {
                    hx4 hx4Var = (hx4) v;
                    Bitmap bitmap = hx4Var.d;
                    if (bitmap != null) {
                        boolean z3 = true;
                        if (this.F == -16777216 && this.f != null) {
                            z = false;
                        } else {
                            this.f = a(-16777216, this.y);
                            this.F = -16777216;
                            z = true;
                        }
                        if (this.h != null && this.w == bitmap) {
                            z3 = z;
                        } else {
                            this.w = bitmap;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                            this.h = bitmapShader;
                            if (i >= 33) {
                                bitmapShader.setFilterMode(2);
                            }
                        }
                        Paint paint2 = this.s;
                        if (z3 || this.n == null) {
                            ComposeShader composeShader = new ComposeShader(this.h, this.f, PorterDuff.Mode.DST_IN);
                            this.n = composeShader;
                            paint2.setShader(composeShader);
                        }
                        if (this.x < 0) {
                            i2 = bounds.height() + this.x;
                        }
                        matrix2.set(matrix);
                        matrix2.postTranslate(bounds.left, bounds.top + i2);
                        this.f.setLocalMatrix(matrix2);
                        Matrix matrix3 = hx4Var.b;
                        Matrix matrix4 = this.r;
                        matrix4.set(matrix3);
                        matrix4.postTranslate(-il0Var.d, -il0Var.e);
                        this.h.setLocalMatrix(matrix4);
                        paint2.setAlpha(this.H);
                        canvas.drawRect(bounds, paint2);
                        return;
                    }
                    return;
                }
            }
            int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.H);
            if (this.x < 0) {
                i2 = bounds.height() + this.x;
            }
            il0Var.draw(canvas);
            canvas.translate(bounds.left, bounds.top + i2);
            canvas.drawRect(0.0f, -i2, bounds.width(), bounds.height() - i2, this.a);
            canvas.restoreToCount(saveLayerAlpha);
        }
    }

    @Override
    public final int getAlpha() {
        return this.H;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i) {
        this.H = i;
    }

    @Override
    public final void updateColors() {
        try {
            this.b.updateColors();
            invalidateSelf();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
