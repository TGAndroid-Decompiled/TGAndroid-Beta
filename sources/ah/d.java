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
    public final Paint f426a;
    public final ch.d f427b;
    public final Matrix f428c;
    public LinearGradient d;
    public final Matrix e;
    public LinearGradient f429f;
    public BitmapShader f430g;
    public ComposeShader h;
    public final Matrix f431i;
    public final Paint f432j;
    public Bitmap f433k;
    public int f434l;
    public boolean f435m;
    public final Paint f436n;
    public int f437o;
    public boolean f438p;
    public int f439q;

    public d(ch.d dVar) {
        Paint paint = new Paint(1);
        this.f426a = paint;
        this.f428c = new Matrix();
        this.e = new Matrix();
        this.f431i = new Matrix();
        Paint paint2 = new Paint(1);
        this.f432j = paint2;
        this.f436n = new Paint(1);
        this.f439q = 255;
        this.f427b = dVar;
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
        if (this.f434l == i10 && this.f435m == z10) {
            return;
        }
        this.f434l = i10;
        this.f435m = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.f426a.setShader(a2);
        this.f436n.setShader(null);
        Matrix matrix = this.f428c;
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
        if (!bounds.isEmpty() && this.f439q != 0) {
            ch.d dVar = this.f427b;
            fh.a i11 = dVar.i();
            while (i11 instanceof fh.e) {
                i11 = ((fh.e) i11).f9076a;
            }
            boolean z11 = this.f438p;
            Matrix matrix = this.f428c;
            int i12 = 0;
            Matrix matrix2 = this.e;
            if (!z11 && (i11 instanceof fh.c)) {
                int color = ((fh.c) i11).f9068a.getColor();
                int i13 = this.f437o;
                Paint paint = this.f436n;
                if (i13 != color || this.f429f == null) {
                    LinearGradient a2 = a(color, this.f435m);
                    this.f429f = a2;
                    this.f437o = color;
                    paint.setShader(a2);
                }
                if (this.f434l < 0) {
                    i12 = bounds.height() + this.f434l;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i12);
                this.f429f.setLocalMatrix(matrix2);
                paint.setAlpha(this.f439q);
                canvas.drawRect(bounds, paint);
            } else if (!z11 && (i11 instanceof fh.b) && (i10 = Build.VERSION.SDK_INT) >= 28) {
                fh.b bVar = (fh.b) i11;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z12 = true;
                    if (this.f437o == -16777216 && this.f429f != null) {
                        z10 = false;
                    } else {
                        this.f429f = a(-16777216, this.f435m);
                        this.f437o = -16777216;
                        z10 = true;
                    }
                    if (this.f430g != null && this.f433k == bitmap) {
                        z12 = z10;
                    } else {
                        this.f433k = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f430g = bitmapShader;
                        if (i10 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f432j;
                    if (z12 || this.h == null) {
                        ComposeShader composeShader = new ComposeShader(this.f430g, this.f429f, PorterDuff.Mode.DST_IN);
                        this.h = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f434l < 0) {
                        i12 = bounds.height() + this.f434l;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i12);
                    this.f429f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f9064b;
                    Matrix matrix4 = this.f431i;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-dVar.f4277a, -dVar.f4278b);
                    this.f430g.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.f439q);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f439q);
                if (this.f434l < 0) {
                    i12 = bounds.height() + this.f434l;
                }
                dVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i12);
                canvas.drawRect(0.0f, -i12, bounds.width(), bounds.height() - i12, this.f426a);
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f439q;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f427b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f439q = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
