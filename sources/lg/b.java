package lg;

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
    public final Paint f15226a;
    public final ng.d f15227b;
    public final Matrix f15228c;
    public LinearGradient d;
    public final Matrix f15229e;
    public LinearGradient f15230f;
    public BitmapShader f15231g;
    public ComposeShader h;
    public final Matrix f15232i;
    public final Paint f15233j;
    public Bitmap f15234k;
    public int f15235l;
    public boolean f15236m;
    public final Paint f15237n;
    public int f15238o;
    public boolean f15239p;
    public int f15240q;

    public b(ng.d dVar) {
        Paint paint = new Paint(1);
        this.f15226a = paint;
        this.f15228c = new Matrix();
        this.f15229e = new Matrix();
        this.f15232i = new Matrix();
        Paint paint2 = new Paint(1);
        this.f15233j = paint2;
        this.f15237n = new Paint(1);
        this.f15240q = 255;
        this.f15227b = dVar;
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
        if (this.f15235l == i10 && this.f15236m == z10) {
            return;
        }
        this.f15235l = i10;
        this.f15236m = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.f15226a.setShader(a2);
        this.f15237n.setShader(null);
        Matrix matrix = this.f15228c;
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
        if (!bounds.isEmpty() && this.f15240q != 0) {
            ng.d dVar = this.f15227b;
            qg.a i11 = dVar.i();
            while (i11 instanceof qg.e) {
                i11 = ((qg.e) i11).f46676a;
            }
            boolean z11 = this.f15239p;
            Matrix matrix = this.f15228c;
            int i12 = 0;
            Matrix matrix2 = this.f15229e;
            if (!z11 && (i11 instanceof qg.c)) {
                int color = ((qg.c) i11).f46667a.getColor();
                int i13 = this.f15238o;
                Paint paint = this.f15237n;
                if (i13 != color || this.f15230f == null) {
                    LinearGradient a2 = a(color, this.f15236m);
                    this.f15230f = a2;
                    this.f15238o = color;
                    paint.setShader(a2);
                }
                if (this.f15235l < 0) {
                    i12 = bounds.height() + this.f15235l;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i12);
                this.f15230f.setLocalMatrix(matrix2);
                paint.setAlpha(this.f15240q);
                canvas.drawRect(bounds, paint);
            } else if (!z11 && (i11 instanceof qg.b) && (i10 = Build.VERSION.SDK_INT) >= 28) {
                qg.b bVar = (qg.b) i11;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z12 = true;
                    if (this.f15238o == -16777216 && this.f15230f != null) {
                        z10 = false;
                    } else {
                        this.f15230f = a(-16777216, this.f15236m);
                        this.f15238o = -16777216;
                        z10 = true;
                    }
                    if (this.f15231g != null && this.f15234k == bitmap) {
                        z12 = z10;
                    } else {
                        this.f15234k = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f15231g = bitmapShader;
                        if (i10 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f15233j;
                    if (z12 || this.h == null) {
                        ComposeShader composeShader = new ComposeShader(this.f15231g, this.f15230f, PorterDuff.Mode.DST_IN);
                        this.h = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f15235l < 0) {
                        i12 = bounds.height() + this.f15235l;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i12);
                    this.f15230f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f46662b;
                    Matrix matrix4 = this.f15232i;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-dVar.f17339a, -dVar.f17340b);
                    this.f15231g.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.f15240q);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f15240q);
                if (this.f15235l < 0) {
                    i12 = bounds.height() + this.f15235l;
                }
                dVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i12);
                canvas.drawRect(0.0f, -i12, bounds.width(), bounds.height() - i12, this.f15226a);
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f15240q;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f15227b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f15240q = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
