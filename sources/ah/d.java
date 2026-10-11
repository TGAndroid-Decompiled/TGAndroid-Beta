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
    public final Paint f548a;
    public final ch.d f549b;
    public final Matrix f550c;
    public LinearGradient d;
    public final Matrix f551e;
    public LinearGradient f552f;
    public BitmapShader f553g;
    public ComposeShader h;
    public final Matrix f554i;
    public final Paint f555j;
    public Bitmap f556k;
    public int f557l;
    public boolean f558m;
    public final Paint f559n;
    public int f560o;
    public boolean f561p;
    public int f562q;

    public d(ch.d dVar) {
        Paint paint = new Paint(1);
        this.f548a = paint;
        this.f550c = new Matrix();
        this.f551e = new Matrix();
        this.f554i = new Matrix();
        Paint paint2 = new Paint(1);
        this.f555j = paint2;
        this.f559n = new Paint(1);
        this.f562q = 255;
        this.f549b = dVar;
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
        if (this.f557l == i10 && this.f558m == z10) {
            return;
        }
        this.f557l = i10;
        this.f558m = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.f548a.setShader(a2);
        this.f559n.setShader(null);
        Matrix matrix = this.f550c;
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
        if (!bounds.isEmpty() && this.f562q != 0) {
            ch.d dVar = this.f549b;
            fh.a i11 = dVar.i();
            while (i11 instanceof fh.e) {
                i11 = ((fh.e) i11).f9941a;
            }
            boolean z11 = this.f561p;
            Matrix matrix = this.f550c;
            int i12 = 0;
            Matrix matrix2 = this.f551e;
            if (!z11 && (i11 instanceof fh.c)) {
                int color = ((fh.c) i11).f9932a.getColor();
                int i13 = this.f560o;
                Paint paint = this.f559n;
                if (i13 != color || this.f552f == null) {
                    LinearGradient a2 = a(color, this.f558m);
                    this.f552f = a2;
                    this.f560o = color;
                    paint.setShader(a2);
                }
                if (this.f557l < 0) {
                    i12 = bounds.height() + this.f557l;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i12);
                this.f552f.setLocalMatrix(matrix2);
                paint.setAlpha(this.f562q);
                canvas.drawRect(bounds, paint);
            } else if (!z11 && (i11 instanceof fh.b) && (i10 = Build.VERSION.SDK_INT) >= 28) {
                fh.b bVar = (fh.b) i11;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z12 = true;
                    if (this.f560o == -16777216 && this.f552f != null) {
                        z10 = false;
                    } else {
                        this.f552f = a(-16777216, this.f558m);
                        this.f560o = -16777216;
                        z10 = true;
                    }
                    if (this.f553g != null && this.f556k == bitmap) {
                        z12 = z10;
                    } else {
                        this.f556k = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f553g = bitmapShader;
                        if (i10 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f555j;
                    if (z12 || this.h == null) {
                        ComposeShader composeShader = new ComposeShader(this.f553g, this.f552f, PorterDuff.Mode.DST_IN);
                        this.h = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f557l < 0) {
                        i12 = bounds.height() + this.f557l;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i12);
                    this.f552f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f9927b;
                    Matrix matrix4 = this.f554i;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-dVar.f4677a, -dVar.f4678b);
                    this.f553g.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.f562q);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f562q);
                if (this.f557l < 0) {
                    i12 = bounds.height() + this.f557l;
                }
                dVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i12);
                canvas.drawRect(0.0f, -i12, bounds.width(), bounds.height() - i12, this.f548a);
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f562q;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f549b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f562q = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
