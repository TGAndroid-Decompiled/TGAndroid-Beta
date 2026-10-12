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
    public final Paint f550a;
    public final ch.d f551b;
    public final Matrix f552c;
    public LinearGradient d;
    public final Matrix f553e;
    public LinearGradient f554f;
    public BitmapShader f555g;
    public ComposeShader h;
    public final Matrix f556i;
    public final Paint f557j;
    public Bitmap f558k;
    public int f559l;
    public boolean f560m;
    public final Paint f561n;
    public int f562o;
    public boolean f563p;
    public int f564q;

    public d(ch.d dVar) {
        Paint paint = new Paint(1);
        this.f550a = paint;
        this.f552c = new Matrix();
        this.f553e = new Matrix();
        this.f556i = new Matrix();
        Paint paint2 = new Paint(1);
        this.f557j = paint2;
        this.f561n = new Paint(1);
        this.f564q = 255;
        this.f551b = dVar;
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
        if (this.f559l == i10 && this.f560m == z10) {
            return;
        }
        this.f559l = i10;
        this.f560m = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.f550a.setShader(a2);
        this.f561n.setShader(null);
        Matrix matrix = this.f552c;
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
        if (!bounds.isEmpty() && this.f564q != 0) {
            ch.d dVar = this.f551b;
            fh.a i11 = dVar.i();
            while (i11 instanceof fh.e) {
                i11 = ((fh.e) i11).f9940a;
            }
            boolean z11 = this.f563p;
            Matrix matrix = this.f552c;
            int i12 = 0;
            Matrix matrix2 = this.f553e;
            if (!z11 && (i11 instanceof fh.c)) {
                int color = ((fh.c) i11).f9931a.getColor();
                int i13 = this.f562o;
                Paint paint = this.f561n;
                if (i13 != color || this.f554f == null) {
                    LinearGradient a2 = a(color, this.f560m);
                    this.f554f = a2;
                    this.f562o = color;
                    paint.setShader(a2);
                }
                if (this.f559l < 0) {
                    i12 = bounds.height() + this.f559l;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i12);
                this.f554f.setLocalMatrix(matrix2);
                paint.setAlpha(this.f564q);
                canvas.drawRect(bounds, paint);
            } else if (!z11 && (i11 instanceof fh.b) && (i10 = Build.VERSION.SDK_INT) >= 28) {
                fh.b bVar = (fh.b) i11;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z12 = true;
                    if (this.f562o == -16777216 && this.f554f != null) {
                        z10 = false;
                    } else {
                        this.f554f = a(-16777216, this.f560m);
                        this.f562o = -16777216;
                        z10 = true;
                    }
                    if (this.f555g != null && this.f558k == bitmap) {
                        z12 = z10;
                    } else {
                        this.f558k = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f555g = bitmapShader;
                        if (i10 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f557j;
                    if (z12 || this.h == null) {
                        ComposeShader composeShader = new ComposeShader(this.f555g, this.f554f, PorterDuff.Mode.DST_IN);
                        this.h = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f559l < 0) {
                        i12 = bounds.height() + this.f559l;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i12);
                    this.f554f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f9926b;
                    Matrix matrix4 = this.f556i;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-dVar.f4676a, -dVar.f4677b);
                    this.f555g.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.f564q);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f564q);
                if (this.f559l < 0) {
                    i12 = bounds.height() + this.f559l;
                }
                dVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i12);
                canvas.drawRect(0.0f, -i12, bounds.width(), bounds.height() - i12, this.f550a);
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f564q;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f551b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f564q = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
