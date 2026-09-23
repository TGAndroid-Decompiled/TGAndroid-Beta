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
public final class d extends Drawable {
    public final Paint f428a;
    public final ch.d f429b;
    public final Matrix f430c;
    public LinearGradient d;
    public final Matrix e;
    public LinearGradient f431f;
    public BitmapShader f432g;
    public ComposeShader h;
    public final Matrix f433i;
    public final Paint f434j;
    public Bitmap f435k;
    public int f436l;
    public boolean f437m;
    public final Paint f438n;
    public int f439o;
    public boolean f440p;
    public int f441q;

    public d(ch.d dVar) {
        Paint paint = new Paint(1);
        this.f428a = paint;
        this.f430c = new Matrix();
        this.e = new Matrix();
        this.f433i = new Matrix();
        Paint paint2 = new Paint(1);
        this.f434j = paint2;
        this.f438n = new Paint(1);
        this.f441q = 255;
        this.f429b = dVar;
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
        if (this.f436l == i10 && this.f437m == z10) {
            return;
        }
        this.f436l = i10;
        this.f437m = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.f428a.setShader(a2);
        this.f438n.setShader(null);
        Matrix matrix = this.f430c;
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
        if (!bounds.isEmpty() && this.f441q != 0) {
            ch.d dVar = this.f429b;
            fh.a i11 = dVar.i();
            while (i11 instanceof fh.e) {
                i11 = ((fh.e) i11).f9064a;
            }
            boolean z11 = this.f440p;
            Matrix matrix = this.f430c;
            int i12 = 0;
            Matrix matrix2 = this.e;
            if (!z11 && (i11 instanceof fh.c)) {
                int color = ((fh.c) i11).f9056a.getColor();
                int i13 = this.f439o;
                Paint paint = this.f438n;
                if (i13 != color || this.f431f == null) {
                    LinearGradient a2 = a(color, this.f437m);
                    this.f431f = a2;
                    this.f439o = color;
                    paint.setShader(a2);
                }
                if (this.f436l < 0) {
                    i12 = bounds.height() + this.f436l;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i12);
                this.f431f.setLocalMatrix(matrix2);
                paint.setAlpha(this.f441q);
                canvas.drawRect(bounds, paint);
            } else if (!z11 && (i11 instanceof fh.b) && (i10 = Build.VERSION.SDK_INT) >= 28) {
                fh.b bVar = (fh.b) i11;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z12 = true;
                    if (this.f439o == -16777216 && this.f431f != null) {
                        z10 = false;
                    } else {
                        this.f431f = a(-16777216, this.f437m);
                        this.f439o = -16777216;
                        z10 = true;
                    }
                    if (this.f432g != null && this.f435k == bitmap) {
                        z12 = z10;
                    } else {
                        this.f435k = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f432g = bitmapShader;
                        if (i10 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f434j;
                    if (z12 || this.h == null) {
                        ComposeShader composeShader = new ComposeShader(this.f432g, this.f431f, PorterDuff.Mode.DST_IN);
                        this.h = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f436l < 0) {
                        i12 = bounds.height() + this.f436l;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i12);
                    this.f431f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f9052b;
                    Matrix matrix4 = this.f433i;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-dVar.f4274a, -dVar.f4275b);
                    this.f432g.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.f441q);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f441q);
                if (this.f436l < 0) {
                    i12 = bounds.height() + this.f436l;
                }
                dVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i12);
                canvas.drawRect(0.0f, -i12, bounds.width(), bounds.height() - i12, this.f428a);
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f441q;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f429b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f441q = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
