package bh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.b6;
public final class c extends Drawable implements b6 {
    public int E;
    public boolean F;
    public int G;
    public final Paint f4368a;
    public final dh.d f4369b;
    public final Matrix f4370c;
    public LinearGradient d;
    public final Matrix e;
    public LinearGradient f4371f;
    public BitmapShader h;
    public ComposeShader f4372n;
    public final Matrix f4373r;
    public final Paint f4374s;
    public Bitmap v;
    public int f4375w;
    public boolean f4376x;
    public final Paint f4377y;

    public c(dh.d dVar) {
        Paint paint = new Paint(1);
        this.f4368a = paint;
        this.f4370c = new Matrix();
        this.e = new Matrix();
        this.f4373r = new Matrix();
        Paint paint2 = new Paint(1);
        this.f4374s = paint2;
        this.f4377y = new Paint(1);
        this.G = 255;
        this.f4369b = dVar;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(AndroidUtilities.dp(40.0f), false);
    }

    public static LinearGradient a(int i10, boolean z10) {
        int alpha = Color.alpha(i10);
        if (z10) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i10, 0), i0.a.o(i10, (alpha * 96) / 285), i0.a.o(i10, (alpha * 176) / 285), i0.a.o(i10, (alpha * 232) / 285)}, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i10, 0), i0.a.o(i10, (alpha * 96) / 255), i0.a.o(i10, (alpha * 176) / 255), i0.a.o(i10, (alpha * 232) / 255), i0.a.o(i10, (alpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i10, boolean z10) {
        if (this.f4375w == i10 && this.f4376x == z10) {
            return;
        }
        this.f4375w = i10;
        this.f4376x = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.f4368a.setShader(a2);
        this.f4377y.setShader(null);
        Matrix matrix = this.f4370c;
        matrix.reset();
        matrix.setScale(1.0f, i10);
        if (i10 < 0) {
            matrix.postTranslate(0.0f, -i10);
        }
        this.d.setLocalMatrix(matrix);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        boolean z10;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.G != 0) {
            dh.d dVar = this.f4369b;
            gh.a i11 = dVar.i();
            while (i11 instanceof gh.e) {
                i11 = ((gh.e) i11).f11082a;
            }
            boolean z11 = this.F;
            Matrix matrix = this.f4370c;
            int i12 = 0;
            Matrix matrix2 = this.e;
            if (!z11 && (i11 instanceof gh.c)) {
                int color = ((gh.c) i11).f11074a.getColor();
                int i13 = this.E;
                Paint paint = this.f4377y;
                if (i13 != color || this.f4371f == null) {
                    LinearGradient a2 = a(color, this.f4376x);
                    this.f4371f = a2;
                    this.E = color;
                    paint.setShader(a2);
                }
                if (this.f4375w < 0) {
                    i12 = bounds.height() + this.f4375w;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i12);
                this.f4371f.setLocalMatrix(matrix2);
                paint.setAlpha(this.G);
                canvas.drawRect(bounds, paint);
            } else if (!z11 && (i11 instanceof gh.b) && (i10 = Build.VERSION.SDK_INT) >= 28) {
                gh.b bVar = (gh.b) i11;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z12 = true;
                    if (this.E == -16777216 && this.f4371f != null) {
                        z10 = false;
                    } else {
                        this.f4371f = a(-16777216, this.f4376x);
                        this.E = -16777216;
                        z10 = true;
                    }
                    if (this.h != null && this.v == bitmap) {
                        z12 = z10;
                    } else {
                        this.v = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.h = bitmapShader;
                        if (i10 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f4374s;
                    if (z12 || this.f4372n == null) {
                        ComposeShader composeShader = new ComposeShader(this.h, this.f4371f, PorterDuff.Mode.DST_IN);
                        this.f4372n = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f4375w < 0) {
                        i12 = bounds.height() + this.f4375w;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i12);
                    this.f4371f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f11070b;
                    Matrix matrix4 = this.f4373r;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-dVar.f8020a, -dVar.f8021b);
                    this.h.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.G);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.G);
                if (this.f4375w < 0) {
                    i12 = bounds.height() + this.f4375w;
                }
                dVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i12);
                canvas.drawRect(0.0f, -i12, bounds.width(), bounds.height() - i12, this.f4368a);
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
        this.f4369b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.G = i10;
    }

    @Override
    public final void updateColors() {
        try {
            this.f4369b.updateColors();
            invalidateSelf();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
