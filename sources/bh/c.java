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
    public final Paint f2682a;
    public final dh.d f2683b;
    public final Matrix f2684c;
    public LinearGradient d;
    public final Matrix f2685e;
    public LinearGradient f2686f;
    public BitmapShader f2687g;
    public ComposeShader h;
    public final Matrix f2688i;
    public final Paint f2689j;
    public Bitmap f2690k;
    public int f2691l;
    public boolean f2692m;
    public final Paint f2693n;
    public int f2694o;
    public boolean f2695p;
    public int f2696q;

    public c(dh.d dVar) {
        Paint paint = new Paint(1);
        this.f2682a = paint;
        this.f2684c = new Matrix();
        this.f2685e = new Matrix();
        this.f2688i = new Matrix();
        Paint paint2 = new Paint(1);
        this.f2689j = paint2;
        this.f2693n = new Paint(1);
        this.f2696q = 255;
        this.f2683b = dVar;
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
        if (this.f2691l == i10 && this.f2692m == z10) {
            return;
        }
        this.f2691l = i10;
        this.f2692m = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.f2682a.setShader(a2);
        this.f2693n.setShader(null);
        Matrix matrix = this.f2684c;
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
        if (!bounds.isEmpty() && this.f2696q != 0) {
            dh.d dVar = this.f2683b;
            gh.a i11 = dVar.i();
            while (i11 instanceof gh.e) {
                i11 = ((gh.e) i11).f10689a;
            }
            boolean z11 = this.f2695p;
            Matrix matrix = this.f2684c;
            int i12 = 0;
            Matrix matrix2 = this.f2685e;
            if (!z11 && (i11 instanceof gh.c)) {
                int color = ((gh.c) i11).f10680a.getColor();
                int i13 = this.f2694o;
                Paint paint = this.f2693n;
                if (i13 != color || this.f2686f == null) {
                    LinearGradient a2 = a(color, this.f2692m);
                    this.f2686f = a2;
                    this.f2694o = color;
                    paint.setShader(a2);
                }
                if (this.f2691l < 0) {
                    i12 = bounds.height() + this.f2691l;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i12);
                this.f2686f.setLocalMatrix(matrix2);
                paint.setAlpha(this.f2696q);
                canvas.drawRect(bounds, paint);
            } else if (!z11 && (i11 instanceof gh.b) && (i10 = Build.VERSION.SDK_INT) >= 28) {
                gh.b bVar = (gh.b) i11;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z12 = true;
                    if (this.f2694o == -16777216 && this.f2686f != null) {
                        z10 = false;
                    } else {
                        this.f2686f = a(-16777216, this.f2692m);
                        this.f2694o = -16777216;
                        z10 = true;
                    }
                    if (this.f2687g != null && this.f2690k == bitmap) {
                        z12 = z10;
                    } else {
                        this.f2690k = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f2687g = bitmapShader;
                        if (i10 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f2689j;
                    if (z12 || this.h == null) {
                        ComposeShader composeShader = new ComposeShader(this.f2687g, this.f2686f, PorterDuff.Mode.DST_IN);
                        this.h = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f2691l < 0) {
                        i12 = bounds.height() + this.f2691l;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i12);
                    this.f2686f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f10675b;
                    Matrix matrix4 = this.f2688i;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-dVar.f6859a, -dVar.f6860b);
                    this.f2687g.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.f2696q);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f2696q);
                if (this.f2691l < 0) {
                    i12 = bounds.height() + this.f2691l;
                }
                dVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i12);
                canvas.drawRect(0.0f, -i12, bounds.width(), bounds.height() - i12, this.f2682a);
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f2696q;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2683b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f2696q = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
