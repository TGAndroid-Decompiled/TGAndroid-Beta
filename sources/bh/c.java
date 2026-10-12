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
    public final Paint f2748a;
    public final dh.d f2749b;
    public final Matrix f2750c;
    public LinearGradient d;
    public final Matrix e;
    public LinearGradient f2751f;
    public BitmapShader f2752g;
    public ComposeShader h;
    public final Matrix f2753i;
    public final Paint f2754j;
    public Bitmap f2755k;
    public int f2756l;
    public boolean f2757m;
    public final Paint f2758n;
    public int f2759o;
    public boolean f2760p;
    public int f2761q;

    public c(dh.d dVar) {
        Paint paint = new Paint(1);
        this.f2748a = paint;
        this.f2750c = new Matrix();
        this.e = new Matrix();
        this.f2753i = new Matrix();
        Paint paint2 = new Paint(1);
        this.f2754j = paint2;
        this.f2758n = new Paint(1);
        this.f2761q = 255;
        this.f2749b = dVar;
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
        if (this.f2756l == i10 && this.f2757m == z10) {
            return;
        }
        this.f2756l = i10;
        this.f2757m = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.f2748a.setShader(a2);
        this.f2758n.setShader(null);
        Matrix matrix = this.f2750c;
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
        if (!bounds.isEmpty() && this.f2761q != 0) {
            dh.d dVar = this.f2749b;
            gh.a i11 = dVar.i();
            while (i11 instanceof gh.e) {
                i11 = ((gh.e) i11).f10156a;
            }
            boolean z11 = this.f2760p;
            Matrix matrix = this.f2750c;
            int i12 = 0;
            Matrix matrix2 = this.e;
            if (!z11 && (i11 instanceof gh.c)) {
                int color = ((gh.c) i11).f10148a.getColor();
                int i13 = this.f2759o;
                Paint paint = this.f2758n;
                if (i13 != color || this.f2751f == null) {
                    LinearGradient a2 = a(color, this.f2757m);
                    this.f2751f = a2;
                    this.f2759o = color;
                    paint.setShader(a2);
                }
                if (this.f2756l < 0) {
                    i12 = bounds.height() + this.f2756l;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i12);
                this.f2751f.setLocalMatrix(matrix2);
                paint.setAlpha(this.f2761q);
                canvas.drawRect(bounds, paint);
            } else if (!z11 && (i11 instanceof gh.b) && (i10 = Build.VERSION.SDK_INT) >= 28) {
                gh.b bVar = (gh.b) i11;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z12 = true;
                    if (this.f2759o == -16777216 && this.f2751f != null) {
                        z10 = false;
                    } else {
                        this.f2751f = a(-16777216, this.f2757m);
                        this.f2759o = -16777216;
                        z10 = true;
                    }
                    if (this.f2752g != null && this.f2755k == bitmap) {
                        z12 = z10;
                    } else {
                        this.f2755k = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f2752g = bitmapShader;
                        if (i10 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f2754j;
                    if (z12 || this.h == null) {
                        ComposeShader composeShader = new ComposeShader(this.f2752g, this.f2751f, PorterDuff.Mode.DST_IN);
                        this.h = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f2756l < 0) {
                        i12 = bounds.height() + this.f2756l;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i12);
                    this.f2751f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f10144b;
                    Matrix matrix4 = this.f2753i;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-dVar.f6552a, -dVar.f6553b);
                    this.f2752g.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.f2761q);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f2761q);
                if (this.f2756l < 0) {
                    i12 = bounds.height() + this.f2756l;
                }
                dVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i12);
                canvas.drawRect(0.0f, -i12, bounds.width(), bounds.height() - i12, this.f2748a);
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f2761q;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2749b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f2761q = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
