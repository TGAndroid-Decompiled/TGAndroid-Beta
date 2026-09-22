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
    public final Paint f427a;
    public final ch.d f428b;
    public final Matrix f429c;
    public LinearGradient d;
    public final Matrix e;
    public LinearGradient f430f;
    public BitmapShader f431g;
    public ComposeShader h;
    public final Matrix f432i;
    public final Paint f433j;
    public Bitmap f434k;
    public int f435l;
    public boolean f436m;
    public final Paint f437n;
    public int f438o;
    public boolean f439p;
    public int f440q;

    public e(ch.d dVar) {
        Paint paint = new Paint(1);
        this.f427a = paint;
        this.f429c = new Matrix();
        this.e = new Matrix();
        this.f432i = new Matrix();
        Paint paint2 = new Paint(1);
        this.f433j = paint2;
        d dVar2 = new d(this, 0);
        this.f437n = new Paint(1);
        this.f440q = 255;
        this.f428b = dVar;
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
        if (this.f435l == i10 && this.f436m == z10) {
            return;
        }
        this.f435l = i10;
        this.f436m = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.f427a.setShader(a2);
        this.f437n.setShader(null);
        Matrix matrix = this.f429c;
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
        if (!bounds.isEmpty() && this.f440q != 0) {
            ch.d dVar = this.f428b;
            fh.a i11 = dVar.i();
            while (i11 instanceof fh.e) {
                i11 = ((fh.e) i11).f9081a;
            }
            boolean z11 = this.f439p;
            Matrix matrix = this.f429c;
            int i12 = 0;
            Matrix matrix2 = this.e;
            if (!z11 && (i11 instanceof fh.c)) {
                int color = ((fh.c) i11).f9073a.getColor();
                int i13 = this.f438o;
                Paint paint = this.f437n;
                if (i13 != color || this.f430f == null) {
                    LinearGradient a2 = a(color, this.f436m);
                    this.f430f = a2;
                    this.f438o = color;
                    paint.setShader(a2);
                }
                if (this.f435l < 0) {
                    i12 = bounds.height() + this.f435l;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i12);
                this.f430f.setLocalMatrix(matrix2);
                paint.setAlpha(this.f440q);
                canvas.drawRect(bounds, paint);
            } else if (!z11 && (i11 instanceof fh.b) && (i10 = Build.VERSION.SDK_INT) >= 28) {
                fh.b bVar = (fh.b) i11;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z12 = true;
                    if (this.f438o == -16777216 && this.f430f != null) {
                        z10 = false;
                    } else {
                        this.f430f = a(-16777216, this.f436m);
                        this.f438o = -16777216;
                        z10 = true;
                    }
                    if (this.f431g != null && this.f434k == bitmap) {
                        z12 = z10;
                    } else {
                        this.f434k = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f431g = bitmapShader;
                        if (i10 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f433j;
                    if (z12 || this.h == null) {
                        ComposeShader composeShader = new ComposeShader(this.f431g, this.f430f, PorterDuff.Mode.DST_IN);
                        this.h = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f435l < 0) {
                        i12 = bounds.height() + this.f435l;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i12);
                    this.f430f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f9069b;
                    Matrix matrix4 = this.f432i;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-dVar.f4281a, -dVar.f4282b);
                    this.f431g.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.f440q);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f440q);
                if (this.f435l < 0) {
                    i12 = bounds.height() + this.f435l;
                }
                dVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i12);
                canvas.drawRect(0.0f, -i12, bounds.width(), bounds.height() - i12, this.f427a);
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f440q;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f428b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f440q = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
