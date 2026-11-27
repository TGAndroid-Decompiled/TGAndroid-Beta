package defpackage;

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
import java.util.Arrays;
public final class sn3 {
    public static final k43 J = new k43(0.42d, 0.0d, 0.22d, 1.0d);
    public final int[] A;
    public final float B;
    public boolean C;
    public boolean D;
    public float E;
    public float F;
    public int[] G;
    public Runnable H;
    public boolean I;
    public final tx1 b;
    public boolean d;
    public long e;
    public float f;
    public float g;
    public Bitmap h;
    public int k;
    public int l;
    public int m;
    public int n;
    public final Paint p;
    public final Paint q;
    public final LinearGradient r;
    public final LinearGradient s;
    public final LinearGradient t;
    public final Matrix u;
    public int v;
    public int w;
    public int x;
    public float y;
    public float z;
    public long a = 900;
    public final mva c = new mva(2600);
    public float[] i = new float[0];
    public float[] j = new float[0];
    public final Paint o = new Paint(2);

    public sn3(tx1 tx1Var) {
        Paint paint = new Paint();
        this.p = paint;
        Paint paint2 = new Paint();
        this.q = paint2;
        this.u = new Matrix();
        this.A = new int[2];
        this.F = 0.06f;
        this.b = tx1Var;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.r = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 0, -16777216, tileMode);
        this.s = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, tileMode);
        this.t = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 16777215, -1, tileMode);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.B = hl.L(22.0f);
    }

    public final void a(long r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn3.a(long):void");
    }

    public final boolean b(float f, float f2, int i, boolean z) {
        float f3;
        c();
        tx1 tx1Var = this.b;
        Layout layout = tx1Var.getLayout();
        if (layout != null && layout.getWidth() > 0 && layout.getHeight() > 0) {
            try {
                this.h = Bitmap.createBitmap(layout.getWidth() + hl.L(4.0f), layout.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.h);
                tx1Var.getPaint().setColor(tx1Var.getCurrentTextColor());
                layout.draw(canvas);
                this.w = tx1Var.getScrollY();
                this.x = Math.max(1, (tx1Var.getHeight() - tx1Var.getTotalPaddingTop()) - tx1Var.getTotalPaddingBottom());
                this.k = f(1200, this.h, true);
                int[] iArr = this.A;
                tx1Var.getLocationInWindow(iArr);
                float totalPaddingTop = (tx1Var.getTotalPaddingTop() + iArr[1]) - this.w;
                if (ik8.A(tx1Var)) {
                    f3 = tx1Var.getOffsetY();
                } else {
                    f3 = 0.0f;
                }
                this.y = f3 + totalPaddingTop;
                this.f = f;
                this.g = f2;
                int i2 = this.v;
                Paint paint = this.q;
                if (i2 != i || paint.getColorFilter() == null) {
                    this.v = i;
                    paint.setColorFilter(new PorterDuffColorFilter(this.v, PorterDuff.Mode.SRC_IN));
                }
                mva mvaVar = this.c;
                mvaVar.a();
                mvaVar.e(z);
                mvaVar.b = gn3.k(z);
                mvaVar.R = hl.L(10.0f);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    public final void c() {
        this.d = false;
        this.e = 0L;
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        this.c.a();
    }

    public final float d(float f) {
        float interpolation = J.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f * 1000.0f) / (((float) this.a) - (this.F * 1000.0f)))));
        float f2 = this.f;
        return qd4.A(this.g, f2, interpolation, f2);
    }

    public final void e(LinearGradient linearGradient, float f, float f2) {
        float f3 = f / 1.3453624f;
        Matrix matrix = this.u;
        matrix.reset();
        matrix.setScale(Math.max(0.01f, (f2 / 1.3453624f) - f3), 1.0f);
        matrix.postRotate(41.987213f);
        matrix.postTranslate(0.7432941f * f3, f3 * 0.6689647f);
        linearGradient.setLocalMatrix(matrix);
    }

    public final int f(int i, Bitmap bitmap, boolean z) {
        int i2;
        float f;
        float[] fArr;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = this.G;
        if (iArr == null || iArr.length < width * height) {
            iArr = new int[width * height];
            this.G = iArr;
        }
        int[] iArr2 = iArr;
        bitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
        int max = Math.max(1, Math.round(hl.p * 0.8f));
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = 90;
            if (i3 >= height) {
                break;
            }
            for (int i5 = 0; i5 < width; i5 += max) {
                if ((iArr2[(i3 * width) + i5] >>> 24) > 90) {
                    i4++;
                }
            }
            i3 += max;
        }
        if (i4 > i) {
            f = i / i4;
        } else {
            f = 1.0f;
        }
        if (z) {
            fArr = this.i;
        } else {
            fArr = this.j;
        }
        int i6 = i + 32;
        if (fArr.length < Math.min(i4, i6) * 3) {
            fArr = new float[Math.min(i4, i6) * 3];
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < height) {
            int i9 = 0;
            while (i9 < width) {
                if ((iArr2[(i7 * width) + i9] >>> 24) > i2) {
                    if (z) {
                        int i10 = this.w;
                        if (i7 >= i10 - max) {
                            if (i7 > i10 + this.x + max) {
                            }
                        }
                    }
                    mva mvaVar = this.c;
                    if (mvaVar.d() <= f) {
                        int i11 = i8 + 1;
                        if (i11 * 3 <= fArr.length) {
                            float f2 = max;
                            float d = ((mvaVar.d() - 0.5f) * f2) + i9;
                            float d2 = ((mvaVar.d() - 0.5f) * f2) + i7;
                            int i12 = i8 * 3;
                            fArr[i12] = d;
                            fArr[i12 + 1] = d2;
                            fArr[i12 + 2] = (d2 * 0.9f) + d;
                            i8 = i11;
                        }
                    }
                }
                i9 += max;
                i2 = 90;
            }
            i7 += max;
            i2 = 90;
        }
        Integer[] numArr = new Integer[i8];
        for (int i13 = 0; i13 < i8; i13++) {
            numArr[i13] = Integer.valueOf(i13);
        }
        Arrays.sort(numArr, new gm3(fArr, (byte) 2));
        float[] copyOf = Arrays.copyOf(fArr, i8 * 3);
        for (int i14 = 0; i14 < i8; i14++) {
            int i15 = i14 * 3;
            int intValue = numArr[i14].intValue() * 3;
            fArr[i15] = copyOf[intValue];
            fArr[i15 + 1] = copyOf[intValue + 1];
            fArr[i15 + 2] = copyOf[intValue + 2];
        }
        if (z) {
            this.i = fArr;
            return i8;
        }
        this.j = fArr;
        return i8;
    }

    public final float g() {
        if (!this.d) {
            return -1.0f;
        }
        if (this.e == 0) {
            return 0.0f;
        }
        return J.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.e)) / ((float) this.a)));
    }

    public final long h(float f) {
        if (this.g <= this.f) {
            return 0L;
        }
        float f2 = ((float) this.a) / 1000.0f;
        float f3 = 0.0f;
        for (int i = 0; i < 24; i++) {
            float f4 = (f3 + f2) / 2.0f;
            if (d(f4) < f) {
                f3 = f4;
            } else {
                f2 = f4;
            }
        }
        return f2 * 1000.0f;
    }
}
