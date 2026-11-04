package eh;

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
import org.telegram.ui.ActionBar.z5;
public final class d extends Drawable implements z5 {
    public final Paint E;
    public int F;
    public boolean G;
    public int H;
    public final Paint f9989a;
    public final gh.g f9990b;
    public final Matrix f9991c;
    public LinearGradient d;
    public final Matrix f9992e;
    public LinearGradient f9993f;
    public BitmapShader h;
    public ComposeShader f9994n;
    public final Matrix f9995r;
    public final Paint f9996s;
    public Bitmap f9997w;
    public int f9998x;
    public boolean f9999y;

    public d(gh.g gVar) {
        Paint paint = new Paint(1);
        this.f9989a = paint;
        this.f9991c = new Matrix();
        this.f9992e = new Matrix();
        this.f9995r = new Matrix();
        Paint paint2 = new Paint(1);
        this.f9996s = paint2;
        ah.a aVar = new ah.a(this, 4);
        this.E = new Paint(1);
        this.H = 255;
        this.f9990b = gVar;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(g0.L(40.0f), false);
        gVar.setCallback(aVar);
    }

    public static LinearGradient a(int i3, boolean z10) {
        int alpha = Color.alpha(i3);
        if (z10) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i3, 0), i0.a.o(i3, (alpha * 96) / 285), i0.a.o(i3, (alpha * 176) / 285), i0.a.o(i3, (alpha * 232) / 285)}, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i3, 0), i0.a.o(i3, (alpha * 96) / 255), i0.a.o(i3, (alpha * 176) / 255), i0.a.o(i3, (alpha * 232) / 255), i0.a.o(i3, (alpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i3, boolean z10) {
        if (this.f9998x == i3 && this.f9999y == z10) {
            return;
        }
        this.f9998x = i3;
        this.f9999y = z10;
        LinearGradient a10 = a(-16777216, z10);
        this.d = a10;
        this.f9989a.setShader(a10);
        this.E.setShader(null);
        Matrix matrix = this.f9991c;
        matrix.reset();
        matrix.setScale(1.0f, i3);
        if (i3 < 0) {
            matrix.postTranslate(0.0f, -i3);
        }
        this.d.setLocalMatrix(matrix);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i3;
        boolean z10;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.H != 0) {
            gh.g gVar = this.f9990b;
            si.a v = gh.g.v(gVar.f12332r);
            boolean z11 = this.G;
            Matrix matrix = this.f9991c;
            int i10 = 0;
            Matrix matrix2 = this.f9992e;
            if (!z11 && (v instanceof si.c)) {
                int i11 = ((si.c) v).f54747b;
                int i12 = this.F;
                Paint paint = this.E;
                if (i12 != i11 || this.f9993f == null) {
                    LinearGradient a10 = a(i11, this.f9999y);
                    this.f9993f = a10;
                    this.F = i11;
                    paint.setShader(a10);
                }
                if (this.f9998x < 0) {
                    i10 = bounds.height() + this.f9998x;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i10);
                this.f9993f.setLocalMatrix(matrix2);
                paint.setAlpha(this.H);
                canvas.drawRect(bounds, paint);
            } else if (!z11 && (v instanceof si.b) && (i3 = Build.VERSION.SDK_INT) >= 28) {
                si.b bVar = (si.b) v;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z12 = true;
                    if (this.F == -16777216 && this.f9993f != null) {
                        z10 = false;
                    } else {
                        this.f9993f = a(-16777216, this.f9999y);
                        this.F = -16777216;
                        z10 = true;
                    }
                    if (this.h != null && this.f9997w == bitmap) {
                        z12 = z10;
                    } else {
                        this.f9997w = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.h = bitmapShader;
                        if (i3 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f9996s;
                    if (z12 || this.f9994n == null) {
                        ComposeShader composeShader = new ComposeShader(this.h, this.f9993f, PorterDuff.Mode.DST_IN);
                        this.f9994n = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f9998x < 0) {
                        i10 = bounds.height() + this.f9998x;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i10);
                    this.f9993f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f54741b;
                    Matrix matrix4 = this.f9995r;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-gVar.d, -gVar.f53580e);
                    this.h.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.H);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.H);
                if (this.f9998x < 0) {
                    i10 = bounds.height() + this.f9998x;
                }
                gVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i10);
                canvas.drawRect(0.0f, -i10, bounds.width(), bounds.height() - i10, this.f9989a);
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
        this.f9990b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i3) {
        this.H = i3;
    }

    @Override
    public final void updateColors() {
        try {
            this.f9990b.updateColors();
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
