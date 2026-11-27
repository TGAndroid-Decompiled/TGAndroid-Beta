package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import org.telegram.messenger.Utilities;
public final class mh7 {
    public static final float[] k = new float[4];
    public static final Matrix l = new Matrix();
    public final rx6 a = new rx6(new hz6((byte) 16));
    public final lp b = new lp((byte) 10);
    public final cp4 c;
    public final kh7 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final Matrix i;
    public final RectF j;

    public mh7() {
        ?? obj = new Object();
        Paint paint = new Paint();
        obj.c = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        obj.d = new lh7(tileMode);
        obj.e = new lh7(tileMode);
        obj.f = new lh7(Shader.TileMode.REPEAT);
        obj.g = new ed((byte) 11, false);
        obj.h = new ed((byte) 11, false);
        obj.a = new float[4];
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.c = obj;
        this.i = new Matrix();
        this.j = new RectF();
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new kh7();
        } else {
            this.d = null;
        }
    }

    public static boolean d(float f) {
        if (Math.abs(f - 1.0f) <= 1.0E-4f) {
            return true;
        }
        return false;
    }

    public static void e(Matrix matrix, float[] fArr) {
        Matrix matrix2 = l;
        matrix.invert(matrix2);
        float[] fArr2 = k;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 1.0f;
        fArr2[3] = 1.0f;
        matrix2.mapPoints(fArr2);
        fArr[0] = fArr2[2] - fArr2[0];
        fArr[1] = fArr2[3] - fArr2[1];
        fArr[2] = fArr2[0];
        fArr[3] = fArr2[1];
    }

    public final void a(RectF rectF) {
        RectF rectF2 = this.j;
        rectF2.set(0.0f, 0.0f, this.e, this.f);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix = this.i;
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        cp4 cp4Var = this.c;
        lh7 lh7Var = (lh7) cp4Var.d;
        lh7Var.b.set(matrix);
        BitmapShader bitmapShader = lh7Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        lh7 lh7Var2 = (lh7) cp4Var.e;
        lh7Var2.b.set(matrix);
        BitmapShader bitmapShader2 = lh7Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        kh7 kh7Var = this.d;
        if (kh7Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = kh7Var.g;
            e(matrix, fArr);
            kh7Var.e.a(fArr);
            kh7Var.f.a(fArr);
        }
    }

    public final void b(Matrix matrix) {
        boolean z;
        cp4 cp4Var = this.c;
        float[] fArr = cp4Var.a;
        e(matrix, fArr);
        lh7 lh7Var = (lh7) cp4Var.f;
        lh7Var.b.set(matrix);
        BitmapShader bitmapShader = lh7Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z2 = false;
        if (d(fArr[0]) && d(fArr[1])) {
            z = true;
        } else {
            z = false;
        }
        lh7Var.a(z);
        kh7 kh7Var = this.d;
        if (kh7Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = kh7Var.g;
            e(matrix, fArr2);
            lh7 lh7Var2 = kh7Var.d;
            if (d(fArr2[0]) && d(fArr2[1])) {
                z2 = true;
            }
            lh7Var2.a(z2);
            kh7Var.e.b(fArr2);
            kh7Var.f.b(fArr2);
        }
    }

    public final Paint c(Bitmap bitmap, Bitmap bitmap2, int i, int i2, int i3, boolean z) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.a.H(bitmap2);
        if (i3 >= 0) {
            int o = vm2.o(i, ((Color.alpha(i) * i2) * i3) / 25500);
            lp lpVar = this.b;
            tj0 tj0Var = (tj0) lpVar.c;
            if (tj0Var.a(bitmap) || o != lpVar.b || ((Bitmap) lpVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) lpVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) lpVar.d).getHeight() != bitmap.getHeight()) {
                    lpVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) lpVar.d, o);
                tj0Var.b(bitmap);
                lpVar.b = o;
            }
            bitmap3 = (Bitmap) lpVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.e = bitmap.getWidth();
        this.f = bitmap.getHeight();
        this.g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        kh7 kh7Var = this.d;
        if (kh7Var != null && z && Build.VERSION.SDK_INT >= 33) {
            return kh7Var.a(bitmap, bitmap4, bitmap6, i2, i3);
        }
        cp4 cp4Var = this.c;
        ed edVar = (ed) cp4Var.g;
        ed edVar2 = (ed) cp4Var.h;
        lh7 lh7Var = (lh7) cp4Var.e;
        Paint paint = (Paint) cp4Var.c;
        lh7 lh7Var2 = (lh7) cp4Var.d;
        boolean b = lh7Var2.b(bitmap);
        lh7 lh7Var3 = (lh7) cp4Var.f;
        boolean b2 = b | lh7Var3.b(bitmap4);
        if (i3 >= 0) {
            if ((b2 | lh7Var.b(bitmap6)) || cp4Var.b != 1) {
                cp4Var.b = (byte) 1;
                paint.setShader(new ComposeShader(lh7Var2.d, new ComposeShader(lh7Var.d, lh7Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((b2 | edVar2.s0(vm2.o(-1, ((-i3) * i2) / 100)) | edVar.s0(-16777216)) || cp4Var.b != 2) {
            cp4Var.b = (byte) 2;
            paint.setShader(new ComposeShader((tm2) edVar.c, new ComposeShader(new ComposeShader(lh7Var2.d, lh7Var3.d, PorterDuff.Mode.DST_IN), (tm2) edVar2.c, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
