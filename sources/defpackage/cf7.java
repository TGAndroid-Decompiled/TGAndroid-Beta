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
public final class cf7 {
    public static final float[] k = new float[4];
    public static final Matrix l = new Matrix();
    public final mv6 a = new mv6(new yw6((byte) 28));
    public final kp b = new kp((byte) 10);
    public final xm4 c;
    public final af7 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final Matrix i;
    public final RectF j;

    public cf7() {
        ?? obj = new Object();
        Paint paint = new Paint();
        obj.c = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        obj.d = new bf7(tileMode);
        obj.e = new bf7(tileMode);
        obj.f = new bf7(Shader.TileMode.REPEAT);
        obj.g = new dd((byte) 11, false);
        obj.h = new dd((byte) 11, false);
        obj.a = new float[4];
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.c = obj;
        this.i = new Matrix();
        this.j = new RectF();
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new af7();
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
        xm4 xm4Var = this.c;
        bf7 bf7Var = (bf7) xm4Var.d;
        bf7Var.b.set(matrix);
        BitmapShader bitmapShader = bf7Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        bf7 bf7Var2 = (bf7) xm4Var.e;
        bf7Var2.b.set(matrix);
        BitmapShader bitmapShader2 = bf7Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        af7 af7Var = this.d;
        if (af7Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = af7Var.g;
            e(matrix, fArr);
            af7Var.e.a(fArr);
            af7Var.f.a(fArr);
        }
    }

    public final void b(Matrix matrix) {
        boolean z;
        xm4 xm4Var = this.c;
        float[] fArr = xm4Var.a;
        e(matrix, fArr);
        bf7 bf7Var = (bf7) xm4Var.f;
        bf7Var.b.set(matrix);
        BitmapShader bitmapShader = bf7Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z2 = false;
        if (d(fArr[0]) && d(fArr[1])) {
            z = true;
        } else {
            z = false;
        }
        bf7Var.a(z);
        af7 af7Var = this.d;
        if (af7Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = af7Var.g;
            e(matrix, fArr2);
            bf7 bf7Var2 = af7Var.d;
            if (d(fArr2[0]) && d(fArr2[1])) {
                z2 = true;
            }
            bf7Var2.a(z2);
            af7Var.e.b(fArr2);
            af7Var.f.b(fArr2);
        }
    }

    public final Paint c(Bitmap bitmap, Bitmap bitmap2, int i, int i2, int i3, boolean z) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.a.G(bitmap2);
        if (i3 >= 0) {
            int o = bm2.o(i, ((Color.alpha(i) * i2) * i3) / 25500);
            kp kpVar = this.b;
            sj0 sj0Var = (sj0) kpVar.c;
            if (sj0Var.a(bitmap) || o != kpVar.b || ((Bitmap) kpVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) kpVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) kpVar.d).getHeight() != bitmap.getHeight()) {
                    kpVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) kpVar.d, o);
                sj0Var.b(bitmap);
                kpVar.b = o;
            }
            bitmap3 = (Bitmap) kpVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.e = bitmap.getWidth();
        this.f = bitmap.getHeight();
        this.g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        af7 af7Var = this.d;
        if (af7Var != null && z && Build.VERSION.SDK_INT >= 33) {
            return af7Var.a(bitmap, bitmap4, bitmap6, i2, i3);
        }
        xm4 xm4Var = this.c;
        dd ddVar = (dd) xm4Var.g;
        dd ddVar2 = (dd) xm4Var.h;
        bf7 bf7Var = (bf7) xm4Var.e;
        Paint paint = (Paint) xm4Var.c;
        bf7 bf7Var2 = (bf7) xm4Var.d;
        boolean b = bf7Var2.b(bitmap);
        bf7 bf7Var3 = (bf7) xm4Var.f;
        boolean b2 = b | bf7Var3.b(bitmap4);
        if (i3 >= 0) {
            if ((b2 | bf7Var.b(bitmap6)) || xm4Var.b != 1) {
                xm4Var.b = (byte) 1;
                paint.setShader(new ComposeShader(bf7Var2.d, new ComposeShader(bf7Var.d, bf7Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((b2 | ddVar2.p0(bm2.o(-1, ((-i3) * i2) / 100)) | ddVar.p0(-16777216)) || xm4Var.b != 2) {
            xm4Var.b = (byte) 2;
            paint.setShader(new ComposeShader((zl2) ddVar.c, new ComposeShader(new ComposeShader(bf7Var2.d, bf7Var3.d, PorterDuff.Mode.DST_IN), (zl2) ddVar2.c, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
