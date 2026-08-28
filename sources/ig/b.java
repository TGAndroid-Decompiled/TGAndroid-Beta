package ig;

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
public final class b extends Drawable {
    public final Paint f11133a;
    public final kg.d f11134b;
    public final Matrix f11135c;
    public LinearGradient d;
    public final Matrix f11136e;
    public LinearGradient f11137f;
    public BitmapShader f11138g;
    public ComposeShader h;
    public final Matrix f11139i;
    public final Paint f11140j;
    public Bitmap f11141k;
    public int f11142l;
    public boolean f11143m;
    public final Paint f11144n;
    public int f11145o;
    public boolean f11146p;
    public int f11147q;

    public b(kg.d dVar) {
        Paint paint = new Paint(1);
        this.f11133a = paint;
        this.f11135c = new Matrix();
        this.f11136e = new Matrix();
        this.f11139i = new Matrix();
        Paint paint2 = new Paint(1);
        this.f11140j = paint2;
        this.f11144n = new Paint(1);
        this.f11147q = 255;
        this.f11134b = dVar;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(AndroidUtilities.dp(40.0f), false);
    }

    public static LinearGradient a(int i9, boolean z10) {
        int alpha = Color.alpha(i9);
        if (z10) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i9, 0), i0.a.k(i9, (alpha * 96) / 285), i0.a.k(i9, (alpha * 176) / 285), i0.a.k(i9, (alpha * 232) / 285)}, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i9, 0), i0.a.k(i9, (alpha * 96) / 255), i0.a.k(i9, (alpha * 176) / 255), i0.a.k(i9, (alpha * 232) / 255), i0.a.k(i9, (alpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i9, boolean z10) {
        if (this.f11142l == i9 && this.f11143m == z10) {
            return;
        }
        this.f11142l = i9;
        this.f11143m = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.f11133a.setShader(a2);
        this.f11144n.setShader(null);
        Matrix matrix = this.f11135c;
        matrix.reset();
        matrix.setScale(1.0f, i9);
        if (i9 < 0) {
            matrix.postTranslate(0.0f, -i9);
        }
        this.d.setLocalMatrix(matrix);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i9;
        boolean z10;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f11147q != 0) {
            kg.d dVar = this.f11134b;
            ng.a i10 = dVar.i();
            while (i10 instanceof ng.e) {
                i10 = ((ng.e) i10).f18609a;
            }
            boolean z11 = this.f11146p;
            Matrix matrix = this.f11135c;
            int i11 = 0;
            Matrix matrix2 = this.f11136e;
            if (!z11 && (i10 instanceof ng.c)) {
                int color = ((ng.c) i10).f18600a.getColor();
                int i12 = this.f11145o;
                Paint paint = this.f11144n;
                if (i12 != color || this.f11137f == null) {
                    LinearGradient a2 = a(color, this.f11143m);
                    this.f11137f = a2;
                    this.f11145o = color;
                    paint.setShader(a2);
                }
                if (this.f11142l < 0) {
                    i11 = bounds.height() + this.f11142l;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i11);
                this.f11137f.setLocalMatrix(matrix2);
                paint.setAlpha(this.f11147q);
                canvas.drawRect(bounds, paint);
            } else if (!z11 && (i10 instanceof ng.b) && (i9 = Build.VERSION.SDK_INT) >= 28) {
                ng.b bVar = (ng.b) i10;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z12 = true;
                    if (this.f11145o == -16777216 && this.f11137f != null) {
                        z10 = false;
                    } else {
                        this.f11137f = a(-16777216, this.f11143m);
                        this.f11145o = -16777216;
                        z10 = true;
                    }
                    if (this.f11138g != null && this.f11141k == bitmap) {
                        z12 = z10;
                    } else {
                        this.f11141k = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f11138g = bitmapShader;
                        if (i9 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f11140j;
                    if (z12 || this.h == null) {
                        ComposeShader composeShader = new ComposeShader(this.f11138g, this.f11137f, PorterDuff.Mode.DST_IN);
                        this.h = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f11142l < 0) {
                        i11 = bounds.height() + this.f11142l;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i11);
                    this.f11137f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f18595b;
                    Matrix matrix4 = this.f11139i;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-dVar.f14815a, -dVar.f14816b);
                    this.f11138g.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.f11147q);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f11147q);
                if (this.f11142l < 0) {
                    i11 = bounds.height() + this.f11142l;
                }
                dVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i11);
                canvas.drawRect(0.0f, -i11, bounds.width(), bounds.height() - i11, this.f11133a);
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f11147q;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f11134b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i9) {
        this.f11147q = i9;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
