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
public final class fh7 {
    public static final float[] k = new float[4];
    public static final Matrix l = new Matrix();
    public final mx6 a = new mx6(new bh7((byte) 0));
    public final kq b = new kq((byte) 10);
    public final yo4 c;
    public final dh7 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final Matrix i;
    public final RectF j;

    public fh7() {
        ?? obj = new Object();
        Paint paint = new Paint();
        obj.c = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        obj.d = new eh7(tileMode);
        obj.e = new eh7(tileMode);
        obj.f = new eh7(Shader.TileMode.REPEAT);
        obj.g = new de((byte) 11, false);
        obj.h = new de((byte) 11, false);
        obj.a = new float[4];
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.c = obj;
        this.i = new Matrix();
        this.j = new RectF();
        if (Build.VERSION.SDK_INT >= 33) {
            this.d = new dh7();
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
        yo4 yo4Var = this.c;
        eh7 eh7Var = (eh7) yo4Var.d;
        eh7Var.b.set(matrix);
        BitmapShader bitmapShader = eh7Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        eh7 eh7Var2 = (eh7) yo4Var.e;
        eh7Var2.b.set(matrix);
        BitmapShader bitmapShader2 = eh7Var2.d;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        dh7 dh7Var = this.d;
        if (dh7Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr = dh7Var.g;
            e(matrix, fArr);
            dh7Var.e.a(fArr);
            dh7Var.f.a(fArr);
        }
    }

    public final void b(Matrix matrix) {
        boolean z;
        yo4 yo4Var = this.c;
        float[] fArr = yo4Var.a;
        e(matrix, fArr);
        eh7 eh7Var = (eh7) yo4Var.f;
        eh7Var.b.set(matrix);
        BitmapShader bitmapShader = eh7Var.d;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        boolean z2 = false;
        if (d(fArr[0]) && d(fArr[1])) {
            z = true;
        } else {
            z = false;
        }
        eh7Var.a(z);
        dh7 dh7Var = this.d;
        if (dh7Var != null && Build.VERSION.SDK_INT >= 33) {
            float[] fArr2 = dh7Var.g;
            e(matrix, fArr2);
            eh7 eh7Var2 = dh7Var.d;
            if (d(fArr2[0]) && d(fArr2[1])) {
                z2 = true;
            }
            eh7Var2.a(z2);
            dh7Var.e.b(fArr2);
            dh7Var.f.b(fArr2);
        }
    }

    public final Paint c(Bitmap bitmap, Bitmap bitmap2, int i, int i2, int i3, boolean z) {
        Bitmap bitmap3;
        Bitmap bitmap4 = (Bitmap) this.a.H(bitmap2);
        if (i3 >= 0) {
            int p = on2.p(i, ((Color.alpha(i) * i2) * i3) / 25500);
            kq kqVar = this.b;
            sk0 sk0Var = (sk0) kqVar.c;
            if (sk0Var.a(bitmap) || p != kqVar.b || ((Bitmap) kqVar.d) == null) {
                Bitmap bitmap5 = (Bitmap) kqVar.d;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) kqVar.d).getHeight() != bitmap.getHeight()) {
                    kqVar.d = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) kqVar.d, p);
                sk0Var.b(bitmap);
                kqVar.b = p;
            }
            bitmap3 = (Bitmap) kqVar.d;
        } else {
            bitmap3 = null;
        }
        Bitmap bitmap6 = bitmap3;
        this.e = bitmap.getWidth();
        this.f = bitmap.getHeight();
        this.g = bitmap4.getWidth();
        this.h = bitmap4.getHeight();
        dh7 dh7Var = this.d;
        if (dh7Var != null && z && Build.VERSION.SDK_INT >= 33) {
            return dh7Var.a(bitmap, bitmap4, bitmap6, i2, i3);
        }
        yo4 yo4Var = this.c;
        de deVar = (de) yo4Var.g;
        de deVar2 = (de) yo4Var.h;
        eh7 eh7Var = (eh7) yo4Var.e;
        Paint paint = (Paint) yo4Var.c;
        eh7 eh7Var2 = (eh7) yo4Var.d;
        boolean b = eh7Var2.b(bitmap);
        eh7 eh7Var3 = (eh7) yo4Var.f;
        boolean b2 = b | eh7Var3.b(bitmap4);
        if (i3 >= 0) {
            if ((b2 | eh7Var.b(bitmap6)) || yo4Var.b != 1) {
                yo4Var.b = (byte) 1;
                paint.setShader(new ComposeShader(eh7Var2.d, new ComposeShader(eh7Var.d, eh7Var3.d, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint;
            }
        } else if ((b2 | deVar2.q0(on2.p(-1, ((-i3) * i2) / 100)) | deVar.q0(-16777216)) || yo4Var.b != 2) {
            yo4Var.b = (byte) 2;
            paint.setShader(new ComposeShader((mn2) deVar.c, new ComposeShader(new ComposeShader(eh7Var2.d, eh7Var3.d, PorterDuff.Mode.DST_IN), (mn2) deVar2.c, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
            return paint;
        }
        return paint;
    }
}
