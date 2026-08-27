package jg;

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

    public final Paint f12945a;

    public final lg.d f12946b;

    public final Matrix f12947c;
    public LinearGradient d;

    public final Matrix f12948e;

    public LinearGradient f12949f;

    public BitmapShader f12950g;
    public ComposeShader h;

    public final Matrix f12951i;

    public final Paint f12952j;

    public Bitmap f12953k;

    public int f12954l;

    public boolean f12955m;

    public final Paint f12956n;

    public int f12957o;

    public boolean f12958p;

    public int f12959q;

    public b(lg.d dVar) {
        Paint paint = new Paint(1);
        this.f12945a = paint;
        this.f12947c = new Matrix();
        this.f12948e = new Matrix();
        this.f12951i = new Matrix();
        Paint paint2 = new Paint(1);
        this.f12952j = paint2;
        this.f12956n = new Paint(1);
        this.f12959q = 255;
        this.f12946b = dVar;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(AndroidUtilities.dp(40.0f), false);
    }

    public static LinearGradient a(int i10, boolean z10) {
        int iAlpha = Color.alpha(i10);
        return z10 ? new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.b.k(i10, 0), i0.b.k(i10, (iAlpha * 96) / 285), i0.b.k(i10, (iAlpha * 176) / 285), i0.b.k(i10, (iAlpha * 232) / 285)}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.b.k(i10, 0), i0.b.k(i10, (iAlpha * 96) / 255), i0.b.k(i10, (iAlpha * 176) / 255), i0.b.k(i10, (iAlpha * 232) / 255), i0.b.k(i10, (iAlpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i10, boolean z10) {
        if (this.f12954l == i10 && this.f12955m == z10) {
            return;
        }
        this.f12954l = i10;
        this.f12955m = z10;
        LinearGradient linearGradientA = a(-16777216, z10);
        this.d = linearGradientA;
        this.f12945a.setShader(linearGradientA);
        this.f12956n.setShader(null);
        Matrix matrix = this.f12947c;
        matrix.reset();
        matrix.setScale(1.0f, i10);
        if (i10 < 0) {
            matrix.postTranslate(0.0f, -i10);
        }
        this.d.setLocalMatrix(matrix);
    }

    @Override
    public final void draw(Canvas canvas) {
        int iHeight;
        int i10;
        boolean z10;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.f12959q == 0) {
            return;
        }
        lg.d dVar = this.f12946b;
        og.a aVarI = dVar.i();
        while (aVarI instanceof og.e) {
            aVarI = ((og.e) aVarI).f19458a;
        }
        boolean z11 = this.f12958p;
        Matrix matrix = this.f12947c;
        Matrix matrix2 = this.f12948e;
        if (!z11 && (aVarI instanceof og.c)) {
            int color = ((og.c) aVarI).f19449a.getColor();
            int i11 = this.f12957o;
            Paint paint = this.f12956n;
            if (i11 != color || this.f12949f == null) {
                LinearGradient linearGradientA = a(color, this.f12955m);
                this.f12949f = linearGradientA;
                this.f12957o = color;
                paint.setShader(linearGradientA);
            }
            iHeight = this.f12954l < 0 ? bounds.height() + this.f12954l : 0;
            matrix2.set(matrix);
            matrix2.postTranslate(bounds.left, bounds.top + iHeight);
            this.f12949f.setLocalMatrix(matrix2);
            paint.setAlpha(this.f12959q);
            canvas.drawRect(bounds, paint);
            return;
        }
        if (z11 || !(aVarI instanceof og.b) || (i10 = Build.VERSION.SDK_INT) < 28) {
            int iSaveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f12959q);
            iHeight = this.f12954l < 0 ? bounds.height() + this.f12954l : 0;
            dVar.draw(canvas);
            canvas.translate(bounds.left, bounds.top + iHeight);
            canvas.drawRect(0.0f, -iHeight, bounds.width(), bounds.height() - iHeight, this.f12945a);
            canvas.restoreToCount(iSaveLayerAlpha);
            return;
        }
        og.b bVar = (og.b) aVarI;
        Bitmap bitmap = bVar.d;
        if (bitmap == null) {
            return;
        }
        boolean z12 = true;
        if (this.f12957o != -16777216 || this.f12949f == null) {
            this.f12949f = a(-16777216, this.f12955m);
            this.f12957o = -16777216;
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f12950g == null || this.f12953k != bitmap) {
            this.f12953k = bitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.f12950g = bitmapShader;
            if (i10 >= 33) {
                bitmapShader.setFilterMode(2);
            }
        } else {
            z12 = z10;
        }
        Paint paint2 = this.f12952j;
        if (z12 || this.h == null) {
            ComposeShader composeShader = new ComposeShader(this.f12950g, this.f12949f, PorterDuff.Mode.DST_IN);
            this.h = composeShader;
            paint2.setShader(composeShader);
        }
        iHeight = this.f12954l < 0 ? bounds.height() + this.f12954l : 0;
        matrix2.set(matrix);
        matrix2.postTranslate(bounds.left, bounds.top + iHeight);
        this.f12949f.setLocalMatrix(matrix2);
        Matrix matrix3 = bVar.f19444b;
        Matrix matrix4 = this.f12951i;
        matrix4.set(matrix3);
        matrix4.postTranslate(-dVar.f15593a, -dVar.f15594b);
        this.f12950g.setLocalMatrix(matrix4);
        paint2.setAlpha(this.f12959q);
        canvas.drawRect(bounds, paint2);
    }

    @Override
    public final int getAlpha() {
        return this.f12959q;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f12946b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f12959q = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
