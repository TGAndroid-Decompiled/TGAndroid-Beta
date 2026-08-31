package og;

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
    public final Paint f16756a;
    public final qg.b f16757b;
    public final Matrix f16758c;
    public LinearGradient d;
    public final Matrix f16759e;
    public LinearGradient f16760f;
    public BitmapShader f16761g;
    public ComposeShader h;
    public final Matrix f16762i;
    public final Paint f16763j;
    public Bitmap f16764k;
    public int f16765l;
    public boolean f16766m;
    public final Paint f16767n;
    public int f16768o;
    public boolean f16769p;
    public int f16770q;

    public b(qg.b bVar) {
        Paint paint = new Paint(1);
        this.f16756a = paint;
        this.f16758c = new Matrix();
        this.f16759e = new Matrix();
        this.f16762i = new Matrix();
        Paint paint2 = new Paint(1);
        this.f16763j = paint2;
        this.f16767n = new Paint(1);
        this.f16770q = 255;
        this.f16757b = bVar;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(AndroidUtilities.dp(40.0f), false);
    }

    public static LinearGradient a(int i10, boolean z4) {
        int alpha = Color.alpha(i10);
        if (z4) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, 0), i0.a.k(i10, (alpha * 96) / 285), i0.a.k(i10, (alpha * 176) / 285), i0.a.k(i10, (alpha * 232) / 285)}, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, 0), i0.a.k(i10, (alpha * 96) / 255), i0.a.k(i10, (alpha * 176) / 255), i0.a.k(i10, (alpha * 232) / 255), i0.a.k(i10, (alpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i10, boolean z4) {
        if (this.f16765l == i10 && this.f16766m == z4) {
            return;
        }
        this.f16765l = i10;
        this.f16766m = z4;
        LinearGradient a2 = a(-16777216, z4);
        this.d = a2;
        this.f16756a.setShader(a2);
        this.f16767n.setShader(null);
        Matrix matrix = this.f16758c;
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
        boolean z4;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f16770q != 0) {
            qg.b bVar = this.f16757b;
            tg.a i11 = bVar.i();
            while (i11 instanceof tg.e) {
                i11 = ((tg.e) i11).f48095a;
            }
            boolean z10 = this.f16769p;
            Matrix matrix = this.f16758c;
            int i12 = 0;
            Matrix matrix2 = this.f16759e;
            if (!z10 && (i11 instanceof tg.c)) {
                int color = ((tg.c) i11).f48086a.getColor();
                int i13 = this.f16768o;
                Paint paint = this.f16767n;
                if (i13 != color || this.f16760f == null) {
                    LinearGradient a2 = a(color, this.f16766m);
                    this.f16760f = a2;
                    this.f16768o = color;
                    paint.setShader(a2);
                }
                if (this.f16765l < 0) {
                    i12 = bounds.height() + this.f16765l;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i12);
                this.f16760f.setLocalMatrix(matrix2);
                paint.setAlpha(this.f16770q);
                canvas.drawRect(bounds, paint);
            } else if (!z10 && (i11 instanceof tg.b) && (i10 = Build.VERSION.SDK_INT) >= 28) {
                tg.b bVar2 = (tg.b) i11;
                Bitmap bitmap = bVar2.d;
                if (bitmap != null) {
                    boolean z11 = true;
                    if (this.f16768o == -16777216 && this.f16760f != null) {
                        z4 = false;
                    } else {
                        this.f16760f = a(-16777216, this.f16766m);
                        this.f16768o = -16777216;
                        z4 = true;
                    }
                    if (this.f16761g != null && this.f16764k == bitmap) {
                        z11 = z4;
                    } else {
                        this.f16764k = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f16761g = bitmapShader;
                        if (i10 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f16763j;
                    if (z11 || this.h == null) {
                        ComposeShader composeShader = new ComposeShader(this.f16761g, this.f16760f, PorterDuff.Mode.DST_IN);
                        this.h = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f16765l < 0) {
                        i12 = bounds.height() + this.f16765l;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i12);
                    this.f16760f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar2.f48081b;
                    Matrix matrix4 = this.f16762i;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-bVar.f44849a, -bVar.f44850b);
                    this.f16761g.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.f16770q);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f16770q);
                if (this.f16765l < 0) {
                    i12 = bounds.height() + this.f16765l;
                }
                bVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i12);
                canvas.drawRect(0.0f, -i12, bounds.width(), bounds.height() - i12, this.f16756a);
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f16770q;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f16757b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f16770q = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
