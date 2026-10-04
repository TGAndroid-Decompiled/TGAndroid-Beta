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
    public final Paint f464a;
    public final ch.d f465b;
    public final Matrix f466c;
    public LinearGradient d;
    public final Matrix f467e;
    public LinearGradient f468f;
    public BitmapShader f469g;
    public ComposeShader h;
    public final Matrix f470i;
    public final Paint f471j;
    public Bitmap f472k;
    public int f473l;
    public boolean f474m;
    public final Paint f475n;
    public int f476o;
    public boolean f477p;
    public int f478q;

    public e(ch.d dVar) {
        Paint paint = new Paint(1);
        this.f464a = paint;
        this.f466c = new Matrix();
        this.f467e = new Matrix();
        this.f470i = new Matrix();
        Paint paint2 = new Paint(1);
        this.f471j = paint2;
        d dVar2 = new d(this, 0);
        this.f475n = new Paint(1);
        this.f478q = 255;
        this.f465b = dVar;
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
        if (this.f473l == i10 && this.f474m == z10) {
            return;
        }
        this.f473l = i10;
        this.f474m = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.f464a.setShader(a2);
        this.f475n.setShader(null);
        Matrix matrix = this.f466c;
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
        if (!bounds.isEmpty() && this.f478q != 0) {
            ch.d dVar = this.f465b;
            fh.a t10 = dVar.t();
            while (t10 instanceof fh.e) {
                t10 = ((fh.e) t10).f9866a;
            }
            boolean z11 = this.f477p;
            Matrix matrix = this.f466c;
            int i11 = 0;
            Matrix matrix2 = this.f467e;
            if (!z11 && (t10 instanceof fh.c)) {
                int i12 = ((fh.c) t10).f9857b;
                int i13 = this.f476o;
                Paint paint = this.f475n;
                if (i13 != i12 || this.f468f == null) {
                    LinearGradient a2 = a(i12, this.f474m);
                    this.f468f = a2;
                    this.f476o = i12;
                    paint.setShader(a2);
                }
                if (this.f473l < 0) {
                    i11 = bounds.height() + this.f473l;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i11);
                this.f468f.setLocalMatrix(matrix2);
                paint.setAlpha(this.f478q);
                canvas.drawRect(bounds, paint);
            } else if (!z11 && (t10 instanceof fh.b) && (i10 = Build.VERSION.SDK_INT) >= 28) {
                fh.b bVar = (fh.b) t10;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z12 = true;
                    if (this.f476o == -16777216 && this.f468f != null) {
                        z10 = false;
                    } else {
                        this.f468f = a(-16777216, this.f474m);
                        this.f476o = -16777216;
                        z10 = true;
                    }
                    if (this.f469g != null && this.f472k == bitmap) {
                        z12 = z10;
                    } else {
                        this.f472k = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f469g = bitmapShader;
                        if (i10 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f471j;
                    if (z12 || this.h == null) {
                        ComposeShader composeShader = new ComposeShader(this.f469g, this.f468f, PorterDuff.Mode.DST_IN);
                        this.h = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f473l < 0) {
                        i11 = bounds.height() + this.f473l;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i11);
                    this.f468f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f9851b;
                    Matrix matrix4 = this.f470i;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-dVar.f15649c, -dVar.d);
                    this.f469g.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.f478q);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f478q);
                if (this.f473l < 0) {
                    i11 = bounds.height() + this.f473l;
                }
                dVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i11);
                canvas.drawRect(0.0f, -i11, bounds.width(), bounds.height() - i11, this.f464a);
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f478q;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f465b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f478q = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
