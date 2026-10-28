package ch;

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
import bh.u0;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.p6;
public final class c extends Drawable implements p6 {
    public int E;
    public boolean F;
    public int G;
    public final Paint f6304a;
    public final eh.d f6305b;
    public final Matrix f6306c;
    public LinearGradient d;
    public final Matrix e;
    public LinearGradient f6307f;
    public BitmapShader h;
    public ComposeShader f6308n;
    public final Matrix f6309r;
    public final Paint f6310s;
    public Bitmap v;
    public int f6311w;
    public boolean f6312x;
    public final Paint f6313y;

    public c(eh.d dVar) {
        Paint paint = new Paint(1);
        this.f6304a = paint;
        this.f6306c = new Matrix();
        this.e = new Matrix();
        this.f6309r = new Matrix();
        Paint paint2 = new Paint(1);
        this.f6310s = paint2;
        u0 u0Var = new u0(this, 2);
        this.f6313y = new Paint(1);
        this.G = 255;
        this.f6305b = dVar;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(AndroidUtilities.dp(40.0f), false);
        dVar.setCallback(u0Var);
    }

    public static LinearGradient a(int i10, boolean z10) {
        int alpha = Color.alpha(i10);
        if (z10) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i10, 0), i0.a.o(i10, (alpha * 96) / 285), i0.a.o(i10, (alpha * 176) / 285), i0.a.o(i10, (alpha * 232) / 285)}, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i10, 0), i0.a.o(i10, (alpha * 96) / 255), i0.a.o(i10, (alpha * 176) / 255), i0.a.o(i10, (alpha * 232) / 255), i0.a.o(i10, (alpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i10, boolean z10) {
        if (this.f6311w == i10 && this.f6312x == z10) {
            return;
        }
        this.f6311w = i10;
        this.f6312x = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.f6304a.setShader(a2);
        this.f6313y.setShader(null);
        Matrix matrix = this.f6306c;
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
            eh.d dVar = this.f6305b;
            hh.a s10 = dVar.s();
            while (s10 instanceof hh.e) {
                s10 = ((hh.e) s10).f12844a;
            }
            boolean z11 = this.F;
            Matrix matrix = this.f6306c;
            int i11 = 0;
            Matrix matrix2 = this.e;
            if (!z11 && (s10 instanceof hh.c)) {
                int i12 = ((hh.c) s10).f12836b;
                int i13 = this.E;
                Paint paint = this.f6313y;
                if (i13 != i12 || this.f6307f == null) {
                    LinearGradient a2 = a(i12, this.f6312x);
                    this.f6307f = a2;
                    this.E = i12;
                    paint.setShader(a2);
                }
                if (this.f6311w < 0) {
                    i11 = bounds.height() + this.f6311w;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i11);
                this.f6307f.setLocalMatrix(matrix2);
                paint.setAlpha(this.G);
                canvas.drawRect(bounds, paint);
            } else if (!z11 && (s10 instanceof hh.b) && (i10 = Build.VERSION.SDK_INT) >= 28) {
                hh.b bVar = (hh.b) s10;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z12 = true;
                    if (this.E == -16777216 && this.f6307f != null) {
                        z10 = false;
                    } else {
                        this.f6307f = a(-16777216, this.f6312x);
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
                    Paint paint2 = this.f6310s;
                    if (z12 || this.f6308n == null) {
                        ComposeShader composeShader = new ComposeShader(this.h, this.f6307f, PorterDuff.Mode.DST_IN);
                        this.f6308n = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f6311w < 0) {
                        i11 = bounds.height() + this.f6311w;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i11);
                    this.f6307f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f12831b;
                    Matrix matrix4 = this.f6309r;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-dVar.f19461c, -dVar.d);
                    this.h.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.G);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.G);
                if (this.f6311w < 0) {
                    i11 = bounds.height() + this.f6311w;
                }
                dVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i11);
                canvas.drawRect(0.0f, -i11, bounds.width(), bounds.height() - i11, this.f6304a);
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
        this.f6305b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.G = i10;
    }

    @Override
    public final void updateColors() {
        try {
            this.f6305b.updateColors();
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
