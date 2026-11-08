package dh;

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
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.a6;
public final class d extends Drawable implements a6 {
    public final Paint D;
    public int E;
    public boolean F;
    public int G;
    public final Paint f8711a;
    public final fh.g f8712b;
    public final Matrix f8713c;
    public LinearGradient d;
    public final Matrix f8714e;
    public LinearGradient f8715f;
    public BitmapShader h;
    public ComposeShader f8716n;
    public final Matrix f8717r;
    public final Paint f8718s;
    public Bitmap f8719w;
    public int f8720x;
    public boolean f8721y;

    public d(fh.g gVar) {
        Paint paint = new Paint(1);
        this.f8711a = paint;
        this.f8713c = new Matrix();
        this.f8714e = new Matrix();
        this.f8717r = new Matrix();
        Paint paint2 = new Paint(1);
        this.f8718s = paint2;
        a5.b bVar = new a5.b(this, 3);
        this.D = new Paint(1);
        this.G = 255;
        this.f8712b = gVar;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(g0.L(40.0f), false);
        gVar.setCallback(bVar);
    }

    public static LinearGradient a(int i7, boolean z9) {
        int alpha = Color.alpha(i7);
        if (z9) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i7, 0), i0.a.o(i7, (alpha * 96) / 285), i0.a.o(i7, (alpha * 176) / 285), i0.a.o(i7, (alpha * 232) / 285)}, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i7, 0), i0.a.o(i7, (alpha * 96) / 255), i0.a.o(i7, (alpha * 176) / 255), i0.a.o(i7, (alpha * 232) / 255), i0.a.o(i7, (alpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i7, boolean z9) {
        if (this.f8720x == i7 && this.f8721y == z9) {
            return;
        }
        this.f8720x = i7;
        this.f8721y = z9;
        LinearGradient a10 = a(-16777216, z9);
        this.d = a10;
        this.f8711a.setShader(a10);
        this.D.setShader(null);
        Matrix matrix = this.f8713c;
        matrix.reset();
        matrix.setScale(1.0f, i7);
        if (i7 < 0) {
            matrix.postTranslate(0.0f, -i7);
        }
        this.d.setLocalMatrix(matrix);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        boolean z9;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.G != 0) {
            fh.g gVar = this.f8712b;
            ri.a v = fh.g.v(gVar.f11537r);
            boolean z10 = this.F;
            Matrix matrix = this.f8713c;
            int i10 = 0;
            Matrix matrix2 = this.f8714e;
            if (!z10 && (v instanceof ri.c)) {
                int i11 = ((ri.c) v).f54563b;
                int i12 = this.E;
                Paint paint = this.D;
                if (i12 != i11 || this.f8715f == null) {
                    LinearGradient a10 = a(i11, this.f8721y);
                    this.f8715f = a10;
                    this.E = i11;
                    paint.setShader(a10);
                }
                if (this.f8720x < 0) {
                    i10 = bounds.height() + this.f8720x;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i10);
                this.f8715f.setLocalMatrix(matrix2);
                paint.setAlpha(this.G);
                canvas.drawRect(bounds, paint);
            } else if (!z10 && (v instanceof ri.b) && (i7 = Build.VERSION.SDK_INT) >= 28) {
                ri.b bVar = (ri.b) v;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z11 = true;
                    if (this.E == -16777216 && this.f8715f != null) {
                        z9 = false;
                    } else {
                        this.f8715f = a(-16777216, this.f8721y);
                        this.E = -16777216;
                        z9 = true;
                    }
                    if (this.h != null && this.f8719w == bitmap) {
                        z11 = z9;
                    } else {
                        this.f8719w = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.h = bitmapShader;
                        if (i7 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f8718s;
                    if (z11 || this.f8716n == null) {
                        ComposeShader composeShader = new ComposeShader(this.h, this.f8715f, PorterDuff.Mode.DST_IN);
                        this.f8716n = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f8720x < 0) {
                        i10 = bounds.height() + this.f8720x;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i10);
                    this.f8715f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f54557b;
                    Matrix matrix4 = this.f8717r;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-gVar.d, -gVar.f21077e);
                    this.h.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.G);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.G);
                if (this.f8720x < 0) {
                    i10 = bounds.height() + this.f8720x;
                }
                gVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i10);
                canvas.drawRect(0.0f, -i10, bounds.width(), bounds.height() - i10, this.f8711a);
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.G;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f8712b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i7) {
        this.G = i7;
    }

    @Override
    public final void updateColors() {
        try {
            this.f8712b.updateColors();
            invalidateSelf();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
