package ah;

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
public final class e extends Drawable {
    public final Paint f430a;
    public final ch.d f431b;
    public final Matrix f432c;
    public LinearGradient d;
    public final Matrix e;
    public LinearGradient f433f;
    public BitmapShader f434g;
    public ComposeShader h;
    public final Matrix f435i;
    public final Paint f436j;
    public Bitmap f437k;
    public int f438l;
    public boolean f439m;
    public final Paint f440n;
    public int f441o;
    public boolean f442p;
    public int f443q;

    public e(ch.d dVar) {
        Paint paint = new Paint(1);
        this.f430a = paint;
        this.f432c = new Matrix();
        this.e = new Matrix();
        this.f435i = new Matrix();
        Paint paint2 = new Paint(1);
        this.f436j = paint2;
        d dVar2 = new d(this, 0);
        this.f440n = new Paint(1);
        this.f443q = 255;
        this.f431b = dVar;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(AndroidUtilities.dp(40.0f), false);
        dVar.setCallback(dVar2);
    }

    public static LinearGradient a(int i10, boolean z10) {
        int alpha = Color.alpha(i10);
        if (z10) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, 0), i0.a.k(i10, (alpha * 96) / 285), i0.a.k(i10, (alpha * 176) / 285), i0.a.k(i10, (alpha * 232) / 285)}, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, 0), i0.a.k(i10, (alpha * 96) / 255), i0.a.k(i10, (alpha * 176) / 255), i0.a.k(i10, (alpha * 232) / 255), i0.a.k(i10, (alpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i10, boolean z10) {
        if (this.f438l == i10 && this.f439m == z10) {
            return;
        }
        this.f438l = i10;
        this.f439m = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.f430a.setShader(a2);
        this.f440n.setShader(null);
        Matrix matrix = this.f432c;
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
        if (!bounds.isEmpty() && this.f443q != 0) {
            ch.d dVar = this.f431b;
            fh.a i11 = dVar.i();
            while (i11 instanceof fh.e) {
                i11 = ((fh.e) i11).f9081a;
            }
            boolean z11 = this.f442p;
            Matrix matrix = this.f432c;
            int i12 = 0;
            Matrix matrix2 = this.e;
            if (!z11 && (i11 instanceof fh.c)) {
                int color = ((fh.c) i11).f9073a.getColor();
                int i13 = this.f441o;
                Paint paint = this.f440n;
                if (i13 != color || this.f433f == null) {
                    LinearGradient a2 = a(color, this.f439m);
                    this.f433f = a2;
                    this.f441o = color;
                    paint.setShader(a2);
                }
                if (this.f438l < 0) {
                    i12 = bounds.height() + this.f438l;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i12);
                this.f433f.setLocalMatrix(matrix2);
                paint.setAlpha(this.f443q);
                canvas.drawRect(bounds, paint);
            } else if (!z11 && (i11 instanceof fh.b) && (i10 = Build.VERSION.SDK_INT) >= 28) {
                fh.b bVar = (fh.b) i11;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z12 = true;
                    if (this.f441o == -16777216 && this.f433f != null) {
                        z10 = false;
                    } else {
                        this.f433f = a(-16777216, this.f439m);
                        this.f441o = -16777216;
                        z10 = true;
                    }
                    if (this.f434g != null && this.f437k == bitmap) {
                        z12 = z10;
                    } else {
                        this.f437k = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f434g = bitmapShader;
                        if (i10 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f436j;
                    if (z12 || this.h == null) {
                        ComposeShader composeShader = new ComposeShader(this.f434g, this.f433f, PorterDuff.Mode.DST_IN);
                        this.h = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f438l < 0) {
                        i12 = bounds.height() + this.f438l;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i12);
                    this.f433f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f9069b;
                    Matrix matrix4 = this.f435i;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-dVar.f4283a, -dVar.f4284b);
                    this.f434g.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.f443q);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f443q);
                if (this.f438l < 0) {
                    i12 = bounds.height() + this.f438l;
                }
                dVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i12);
                canvas.drawRect(0.0f, -i12, bounds.width(), bounds.height() - i12, this.f430a);
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f443q;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f431b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f443q = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
