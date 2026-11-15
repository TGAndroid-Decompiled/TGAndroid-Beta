package ai;

import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.widget.EditText;
import java.util.Arrays;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.xe;
public final class k1 {
    public static final er E = new er(0.42d, 0.0d, 0.22d, 1.0d);
    public final int[] A;
    public final float B;
    public e0 C;
    public boolean D;
    public final EditText f1311b;
    public boolean d;
    public long f1313e;
    public float f1314f;
    public float f1315g;
    public Bitmap h;
    public int f1318k;
    public int f1319l;
    public int f1320m;
    public int f1321n;
    public final Paint f1323p;
    public final Paint f1324q;
    public final LinearGradient f1325r;
    public final LinearGradient f1326s;
    public final LinearGradient f1327t;
    public final Matrix f1328u;
    public int v;
    public int f1329w;
    public int f1330x;
    public float f1331y;
    public float f1332z;
    public long f1310a = 900;
    public final nu0 f1312c = new nu0(2600);
    public float[] f1316i = new float[0];
    public float[] f1317j = new float[0];
    public final Paint f1322o = new Paint(2);

    public k1(xe xeVar) {
        Paint paint = new Paint();
        this.f1323p = paint;
        Paint paint2 = new Paint();
        this.f1324q = paint2;
        this.f1328u = new Matrix();
        this.A = new int[2];
        this.f1311b = xeVar;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f1325r = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 0, -16777216, tileMode);
        this.f1326s = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, tileMode);
        this.f1327t = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 16777215, -1, tileMode);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.B = org.telegram.messenger.g0.L(22.0f);
    }

    public final void a() {
        this.d = false;
        this.f1313e = 0L;
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        this.f1312c.a();
    }

    public final float b(float f10) {
        float interpolation = E.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f10 * 1000.0f) / (((float) this.f1310a) - 60.0f))));
        float f11 = this.f1314f;
        return com.google.android.gms.internal.vision.e2.z(this.f1315g, f11, interpolation, f11);
    }

    public final void c(LinearGradient linearGradient, float f10, float f11) {
        float sqrt = (float) Math.sqrt(1.809999942779541d);
        float f12 = 1.0f / sqrt;
        float f13 = 0.9f / sqrt;
        float f14 = f10 / sqrt;
        float f15 = f11 / sqrt;
        Matrix matrix = this.f1328u;
        matrix.reset();
        matrix.setScale(Math.max(0.01f, f15 - f14), 1.0f);
        matrix.postRotate((float) Math.toDegrees(Math.atan2(f13, f12)));
        matrix.postTranslate(f12 * f14, f14 * f13);
        linearGradient.setLocalMatrix(matrix);
    }

    public final int d(int i7, Bitmap bitmap, boolean z10) {
        float f10;
        float[] fArr;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int max = Math.max(1, Math.round(org.telegram.messenger.g0.f23608p * 0.8f));
        int i10 = 0;
        for (int i11 = 0; i11 < height; i11 += max) {
            for (int i12 = 0; i12 < width; i12 += max) {
                if ((iArr[(i11 * width) + i12] >>> 24) > 90) {
                    i10++;
                }
            }
        }
        if (i10 > i7) {
            f10 = i7 / i10;
        } else {
            f10 = 1.0f;
        }
        if (z10) {
            fArr = this.f1316i;
        } else {
            fArr = this.f1317j;
        }
        int i13 = i7 + 32;
        if (fArr.length < Math.min(i10, i13) * 3) {
            fArr = new float[Math.min(i10, i13) * 3];
        }
        int i14 = 0;
        for (int i15 = 0; i15 < height; i15 += max) {
            for (int i16 = 0; i16 < width; i16 += max) {
                if ((iArr[(i15 * width) + i16] >>> 24) > 90) {
                    if (z10) {
                        int i17 = this.f1329w;
                        if (i15 >= i17 - max) {
                            if (i15 > i17 + this.f1330x + max) {
                            }
                        }
                    }
                    nu0 nu0Var = this.f1312c;
                    if (nu0Var.d() <= f10) {
                        int i18 = i14 + 1;
                        if (i18 * 3 <= fArr.length) {
                            float f11 = max;
                            float d = ((nu0Var.d() - 0.5f) * f11) + i16;
                            float d2 = ((nu0Var.d() - 0.5f) * f11) + i15;
                            int i19 = i14 * 3;
                            fArr[i19] = d;
                            fArr[i19 + 1] = d2;
                            fArr[i19 + 2] = (d2 * 0.9f) + d;
                            i14 = i18;
                        }
                    }
                }
            }
        }
        Integer[] numArr = new Integer[i14];
        for (int i20 = 0; i20 < i14; i20++) {
            numArr[i20] = Integer.valueOf(i20);
        }
        Arrays.sort(numArr, new k(1, fArr));
        float[] copyOf = Arrays.copyOf(fArr, i14 * 3);
        for (int i21 = 0; i21 < i14; i21++) {
            int i22 = i21 * 3;
            int intValue = numArr[i21].intValue() * 3;
            fArr[i22] = copyOf[intValue];
            fArr[i22 + 1] = copyOf[intValue + 1];
            fArr[i22 + 2] = copyOf[intValue + 2];
        }
        if (z10) {
            this.f1316i = fArr;
            return i14;
        }
        this.f1317j = fArr;
        return i14;
    }

    public final long e(float f10) {
        if (this.f1315g <= this.f1314f) {
            return 0L;
        }
        float f11 = ((float) this.f1310a) / 1000.0f;
        float f12 = 0.0f;
        for (int i7 = 0; i7 < 24; i7++) {
            float f13 = (f12 + f11) / 2.0f;
            if (b(f13) < f10) {
                f12 = f13;
            } else {
                f11 = f13;
            }
        }
        return f11 * 1000.0f;
    }
}
