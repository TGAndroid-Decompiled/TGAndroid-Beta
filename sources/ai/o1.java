package ai;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.SystemClock;
import android.text.Layout;
import android.widget.EditText;
import java.util.Arrays;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.yu0;
public final class o1 {
    public static final nr J = new nr(0.42d, 0.0d, 0.22d, 1.0d);
    public final int[] A;
    public final float B;
    public boolean C;
    public boolean D;
    public float E;
    public float F;
    public int[] G;
    public Runnable H;
    public boolean I;
    public final EditText f1354b;
    public boolean d;
    public long f1356e;
    public float f1357f;
    public float f1358g;
    public Bitmap h;
    public int f1361k;
    public int f1362l;
    public int f1363m;
    public int f1364n;
    public final Paint f1366p;
    public final Paint f1367q;
    public final LinearGradient f1368r;
    public final LinearGradient f1369s;
    public final LinearGradient f1370t;
    public final Matrix f1371u;
    public int v;
    public int f1372w;
    public int f1373x;
    public float f1374y;
    public float f1375z;
    public long f1353a = 900;
    public final yu0 f1355c = new yu0(2600);
    public float[] f1359i = new float[0];
    public float[] f1360j = new float[0];
    public final Paint f1365o = new Paint(2);

    public o1(gf gfVar) {
        Paint paint = new Paint();
        this.f1366p = paint;
        Paint paint2 = new Paint();
        this.f1367q = paint2;
        this.f1371u = new Matrix();
        this.A = new int[2];
        this.F = 0.06f;
        this.f1354b = gfVar;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f1368r = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 0, -16777216, tileMode);
        this.f1369s = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, tileMode);
        this.f1370t = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 16777215, -1, tileMode);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.B = org.telegram.messenger.g0.L(22.0f);
    }

    public final void a(long r6) {
        throw new UnsupportedOperationException("Method not decompiled: ai.o1.a(long):void");
    }

    public final boolean b(float f10, float f11, int i7, boolean z10) {
        float f12;
        c();
        EditText editText = this.f1354b;
        Layout layout = editText.getLayout();
        if (layout != null && layout.getWidth() > 0 && layout.getHeight() > 0) {
            try {
                this.h = Bitmap.createBitmap(layout.getWidth() + org.telegram.messenger.g0.L(4.0f), layout.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.h);
                editText.getPaint().setColor(editText.getCurrentTextColor());
                layout.draw(canvas);
                this.f1372w = editText.getScrollY();
                this.f1373x = Math.max(1, (editText.getHeight() - editText.getTotalPaddingTop()) - editText.getTotalPaddingBottom());
                this.f1361k = f(1200, this.h, true);
                int[] iArr = this.A;
                editText.getLocationInWindow(iArr);
                float totalPaddingTop = (editText.getTotalPaddingTop() + iArr[1]) - this.f1372w;
                if (editText instanceof rt) {
                    f12 = ((rt) editText).getOffsetY();
                } else {
                    f12 = 0.0f;
                }
                this.f1374y = f12 + totalPaddingTop;
                this.f1357f = f10;
                this.f1358g = f11;
                int i10 = this.v;
                Paint paint = this.f1367q;
                if (i10 != i7 || paint.getColorFilter() == null) {
                    this.v = i7;
                    paint.setColorFilter(new PorterDuffColorFilter(this.v, PorterDuff.Mode.SRC_IN));
                }
                yu0 yu0Var = this.f1355c;
                yu0Var.a();
                yu0Var.e(z10);
                yu0Var.f42550a = u0.k(z10);
                yu0Var.Q = org.telegram.messenger.g0.L(10.0f);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    public final void c() {
        this.d = false;
        this.f1356e = 0L;
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        this.f1355c.a();
    }

    public final float d(float f10) {
        float interpolation = J.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f10 * 1000.0f) / (((float) this.f1353a) - (this.F * 1000.0f)))));
        float f11 = this.f1357f;
        return com.google.android.gms.internal.vision.e2.z(this.f1358g, f11, interpolation, f11);
    }

    public final void e(LinearGradient linearGradient, float f10, float f11) {
        float sqrt = (float) Math.sqrt(1.809999942779541d);
        float f12 = 1.0f / sqrt;
        float f13 = 0.9f / sqrt;
        float f14 = f10 / sqrt;
        float f15 = f11 / sqrt;
        Matrix matrix = this.f1371u;
        matrix.reset();
        matrix.setScale(Math.max(0.01f, f15 - f14), 1.0f);
        matrix.postRotate((float) Math.toDegrees(Math.atan2(f13, f12)));
        matrix.postTranslate(f12 * f14, f14 * f13);
        linearGradient.setLocalMatrix(matrix);
    }

    public final int f(int i7, Bitmap bitmap, boolean z10) {
        float f10;
        float[] fArr;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = this.G;
        if (iArr == null || iArr.length < width * height) {
            this.G = new int[width * height];
        }
        int[] iArr2 = this.G;
        bitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
        int max = Math.max(1, Math.round(org.telegram.messenger.g0.f24045p * 0.8f));
        int i10 = 0;
        for (int i11 = 0; i11 < height; i11 += max) {
            for (int i12 = 0; i12 < width; i12 += max) {
                if ((iArr2[(i11 * width) + i12] >>> 24) > 90) {
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
            fArr = this.f1359i;
        } else {
            fArr = this.f1360j;
        }
        int i13 = i7 + 32;
        if (fArr.length < Math.min(i10, i13) * 3) {
            fArr = new float[Math.min(i10, i13) * 3];
        }
        int i14 = 0;
        for (int i15 = 0; i15 < height; i15 += max) {
            for (int i16 = 0; i16 < width; i16 += max) {
                if ((iArr2[(i15 * width) + i16] >>> 24) > 90) {
                    if (z10) {
                        int i17 = this.f1372w;
                        if (i15 >= i17 - max) {
                            if (i15 > i17 + this.f1373x + max) {
                            }
                        }
                    }
                    yu0 yu0Var = this.f1355c;
                    if (yu0Var.d() <= f10) {
                        int i18 = i14 + 1;
                        if (i18 * 3 <= fArr.length) {
                            float f11 = max;
                            float d = ((yu0Var.d() - 0.5f) * f11) + i16;
                            float d2 = ((yu0Var.d() - 0.5f) * f11) + i15;
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
        Arrays.sort(numArr, new l(1, fArr));
        float[] copyOf = Arrays.copyOf(fArr, i14 * 3);
        for (int i21 = 0; i21 < i14; i21++) {
            int i22 = i21 * 3;
            int intValue = numArr[i21].intValue() * 3;
            fArr[i22] = copyOf[intValue];
            fArr[i22 + 1] = copyOf[intValue + 1];
            fArr[i22 + 2] = copyOf[intValue + 2];
        }
        if (z10) {
            this.f1359i = fArr;
            return i14;
        }
        this.f1360j = fArr;
        return i14;
    }

    public final float g() {
        if (!this.d) {
            return -1.0f;
        }
        if (this.f1356e == 0) {
            return 0.0f;
        }
        return J.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.f1356e)) / ((float) this.f1353a)));
    }

    public final long h(float f10) {
        if (this.f1358g <= this.f1357f) {
            return 0L;
        }
        float f11 = ((float) this.f1353a) / 1000.0f;
        float f12 = 0.0f;
        for (int i7 = 0; i7 < 24; i7++) {
            float f13 = (f12 + f11) / 2.0f;
            if (d(f13) < f10) {
                f12 = f13;
            } else {
                f11 = f13;
            }
        }
        return f11 * 1000.0f;
    }
}
