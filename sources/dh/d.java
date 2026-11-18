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
import org.telegram.ui.ActionBar.c6;
public final class d extends Drawable implements c6 {
    public final Paint E;
    public int F;
    public boolean G;
    public int H;
    public final Paint f8380a;
    public final fh.g f8381b;
    public final Matrix f8382c;
    public LinearGradient d;
    public final Matrix f8383e;
    public LinearGradient f8384f;
    public BitmapShader h;
    public ComposeShader f8385n;
    public final Matrix f8386r;
    public final Paint f8387s;
    public Bitmap f8388w;
    public int f8389x;
    public boolean f8390y;

    public d(fh.g gVar) {
        Paint paint = new Paint(1);
        this.f8380a = paint;
        this.f8382c = new Matrix();
        this.f8383e = new Matrix();
        this.f8386r = new Matrix();
        Paint paint2 = new Paint(1);
        this.f8387s = paint2;
        a5.b bVar = new a5.b(this, 2);
        this.E = new Paint(1);
        this.H = 255;
        this.f8381b = gVar;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(g0.L(40.0f), false);
        gVar.setCallback(bVar);
    }

    public static LinearGradient a(int i7, boolean z10) {
        int alpha = Color.alpha(i7);
        if (z10) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i7, 0), i0.a.o(i7, (alpha * 96) / 285), i0.a.o(i7, (alpha * 176) / 285), i0.a.o(i7, (alpha * 232) / 285)}, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i7, 0), i0.a.o(i7, (alpha * 96) / 255), i0.a.o(i7, (alpha * 176) / 255), i0.a.o(i7, (alpha * 232) / 255), i0.a.o(i7, (alpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i7, boolean z10) {
        if (this.f8389x == i7 && this.f8390y == z10) {
            return;
        }
        this.f8389x = i7;
        this.f8390y = z10;
        LinearGradient a10 = a(-16777216, z10);
        this.d = a10;
        this.f8380a.setShader(a10);
        this.E.setShader(null);
        Matrix matrix = this.f8382c;
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
        boolean z10;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.H != 0) {
            fh.g gVar = this.f8381b;
            ui.a v = fh.g.v(gVar.f11669r);
            boolean z11 = this.G;
            Matrix matrix = this.f8382c;
            int i10 = 0;
            Matrix matrix2 = this.f8383e;
            if (!z11 && (v instanceof ui.c)) {
                int i11 = ((ui.c) v).f58999b;
                int i12 = this.F;
                Paint paint = this.E;
                if (i12 != i11 || this.f8384f == null) {
                    LinearGradient a10 = a(i11, this.f8390y);
                    this.f8384f = a10;
                    this.F = i11;
                    paint.setShader(a10);
                }
                if (this.f8389x < 0) {
                    i10 = bounds.height() + this.f8389x;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i10);
                this.f8384f.setLocalMatrix(matrix2);
                paint.setAlpha(this.H);
                canvas.drawRect(bounds, paint);
            } else if (!z11 && (v instanceof ui.b) && (i7 = Build.VERSION.SDK_INT) >= 28) {
                ui.b bVar = (ui.b) v;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z12 = true;
                    if (this.F == -16777216 && this.f8384f != null) {
                        z10 = false;
                    } else {
                        this.f8384f = a(-16777216, this.f8390y);
                        this.F = -16777216;
                        z10 = true;
                    }
                    if (this.h != null && this.f8388w == bitmap) {
                        z12 = z10;
                    } else {
                        this.f8388w = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.h = bitmapShader;
                        if (i7 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f8387s;
                    if (z12 || this.f8385n == null) {
                        ComposeShader composeShader = new ComposeShader(this.h, this.f8384f, PorterDuff.Mode.DST_IN);
                        this.f8385n = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f8389x < 0) {
                        i10 = bounds.height() + this.f8389x;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i10);
                    this.f8384f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f58993b;
                    Matrix matrix4 = this.f8386r;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-gVar.d, -gVar.f56672e);
                    this.h.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.H);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.H);
                if (this.f8389x < 0) {
                    i10 = bounds.height() + this.f8389x;
                }
                gVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i10);
                canvas.drawRect(0.0f, -i10, bounds.width(), bounds.height() - i10, this.f8380a);
                canvas.restoreToCount(saveLayerAlpha);
            }
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
        this.f8381b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i7) {
        this.H = i7;
    }

    @Override
    public final void updateColors() {
        try {
            this.f8381b.updateColors();
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
