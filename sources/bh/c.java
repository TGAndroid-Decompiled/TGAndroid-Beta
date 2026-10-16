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
import org.telegram.messenger.AndroidUtilities;
public final class c extends Drawable {
    public final Paint f2752a;
    public final dh.d f2753b;
    public final Matrix f2754c;
    public LinearGradient d;
    public final Matrix e;
    public LinearGradient f2755f;
    public BitmapShader f2756g;
    public ComposeShader h;
    public final Matrix f2757i;
    public final Paint f2758j;
    public Bitmap f2759k;
    public int f2760l;
    public boolean f2761m;
    public final Paint f2762n;
    public int f2763o;
    public boolean f2764p;
    public int f2765q;

    public c(dh.d dVar) {
        Paint paint = new Paint(1);
        this.f2752a = paint;
        this.f2754c = new Matrix();
        this.e = new Matrix();
        this.f2757i = new Matrix();
        Paint paint2 = new Paint(1);
        this.f2758j = paint2;
        this.f2762n = new Paint(1);
        this.f2765q = 255;
        this.f2753b = dVar;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(AndroidUtilities.dp(40.0f), false);
    }

    public static LinearGradient a(int i10, boolean z10) {
        int alpha = Color.alpha(i10);
        if (z10) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, 0), i0.a.k(i10, (alpha * 96) / 285), i0.a.k(i10, (alpha * 176) / 285), i0.a.k(i10, (alpha * 232) / 285)}, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, 0), i0.a.k(i10, (alpha * 96) / 255), i0.a.k(i10, (alpha * 176) / 255), i0.a.k(i10, (alpha * 232) / 255), i0.a.k(i10, (alpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i10, boolean z10) {
        if (this.f2760l == i10 && this.f2761m == z10) {
            return;
        }
        this.f2760l = i10;
        this.f2761m = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.f2752a.setShader(a2);
        this.f2762n.setShader(null);
        Matrix matrix = this.f2754c;
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
        if (!bounds.isEmpty() && this.f2765q != 0) {
            dh.d dVar = this.f2753b;
            gh.a i11 = dVar.i();
            while (i11 instanceof gh.e) {
                i11 = ((gh.e) i11).f10160a;
            }
            boolean z11 = this.f2764p;
            Matrix matrix = this.f2754c;
            int i12 = 0;
            Matrix matrix2 = this.e;
            if (!z11 && (i11 instanceof gh.c)) {
                int color = ((gh.c) i11).f10152a.getColor();
                int i13 = this.f2763o;
                Paint paint = this.f2762n;
                if (i13 != color || this.f2755f == null) {
                    LinearGradient a2 = a(color, this.f2761m);
                    this.f2755f = a2;
                    this.f2763o = color;
                    paint.setShader(a2);
                }
                if (this.f2760l < 0) {
                    i12 = bounds.height() + this.f2760l;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i12);
                this.f2755f.setLocalMatrix(matrix2);
                paint.setAlpha(this.f2765q);
                canvas.drawRect(bounds, paint);
            } else if (!z11 && (i11 instanceof gh.b) && (i10 = Build.VERSION.SDK_INT) >= 28) {
                gh.b bVar = (gh.b) i11;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z12 = true;
                    if (this.f2763o == -16777216 && this.f2755f != null) {
                        z10 = false;
                    } else {
                        this.f2755f = a(-16777216, this.f2761m);
                        this.f2763o = -16777216;
                        z10 = true;
                    }
                    if (this.f2756g != null && this.f2759k == bitmap) {
                        z12 = z10;
                    } else {
                        this.f2759k = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f2756g = bitmapShader;
                        if (i10 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f2758j;
                    if (z12 || this.h == null) {
                        ComposeShader composeShader = new ComposeShader(this.f2756g, this.f2755f, PorterDuff.Mode.DST_IN);
                        this.h = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f2760l < 0) {
                        i12 = bounds.height() + this.f2760l;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i12);
                    this.f2755f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f10148b;
                    Matrix matrix4 = this.f2757i;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-dVar.f6555a, -dVar.f6556b);
                    this.f2756g.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.f2765q);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f2765q);
                if (this.f2760l < 0) {
                    i12 = bounds.height() + this.f2760l;
                }
                dVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i12);
                canvas.drawRect(0.0f, -i12, bounds.width(), bounds.height() - i12, this.f2752a);
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f2765q;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2753b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f2765q = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
