package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import java.util.HashMap;
import java.util.Random;
public final class ix8 {
    public static final float S;
    public static final float T;
    public static Bitmap U;
    public long A;
    public float B;
    public float C;
    public long E;
    public boolean F;
    public boolean G;
    public Bitmap H;
    public Bitmap J;
    public float[] L;
    public float[] M;
    public float[] N;
    public float[] O;
    public int[] P;
    public int[] Q;
    public short[] R;
    public int l;
    public hx8 m;
    public hx8 n;
    public long p;
    public boolean[] s;
    public PorterDuffColorFilter z;
    public final float[] a = new float[2400];
    public final float[] b = new float[2400];
    public final float[] c = new float[2400];
    public final float[] d = new float[2400];
    public final float[] e = new float[2400];
    public final float[] f = new float[2400];
    public final float[] g = new float[2400];
    public final float[] h = new float[2400];
    public final float[] i = new float[2400];
    public final float[] j = new float[2400];
    public final byte[] k = new byte[2400];
    public float o = 1.0f;
    public int q = 0;
    public final RectF r = new RectF();
    public final Paint t = new Paint(3);
    public final Paint u = new Paint(1);
    public final Rect v = new Rect();
    public final RectF w = new RectF();
    public final Random x = new Random();
    public int y = -16777216;
    public float D = -1.0f;
    public final Paint I = new Paint(3);
    public final Paint K = new Paint(3);

    static {
        float f;
        float f2;
        int i = 0;
        int i2 = 0;
        while (true) {
            f = 0.5f;
            if (i2 > 1000) {
                break;
            }
            float f3 = i2 / 1000.0f;
            if (p(f3 * 0.467f) >= 0.5f) {
                f = f3;
                break;
            }
            i2++;
        }
        while (true) {
            f2 = 0.8f;
            if (i > 1000) {
                break;
            }
            float f4 = i / 1000.0f;
            if (p(f4 * 0.467f) >= 0.8f) {
                f2 = f4;
                break;
            }
            i++;
        }
        S = f;
        T = f2;
    }

    public static synchronized Bitmap b() {
        Bitmap bitmap;
        synchronized (ix8.class) {
            if (U == null) {
                U = Bitmap.createBitmap(384, 48, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(U);
                Paint paint = new Paint(1);
                paint.setColor(-1);
                RectF rectF = new RectF();
                for (int i = 0; i < 8; i++) {
                    int i2 = i * 48;
                    rectF.set(i2 + 1.5f, 1.5f, (i2 + 48) - 1.5f, 46.5f);
                    float f = (1.0f - ((i * 0.7f) / 7.0f)) * 22.5f;
                    canvas.drawRoundRect(rectF, f, f, paint);
                }
            }
            bitmap = U;
        }
        return bitmap;
    }

    public static hx8 c(String str, int i, g54 g54Var, float f, ColorDrawable colorDrawable) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(y34.a, g54Var);
            hashMap.put(y34.c, 0);
            jib jibVar = new jib((byte) 0);
            if (colorDrawable != null) {
                jibVar.g = colorDrawable;
            }
            hx8 hx8Var = new hx8();
            Bitmap a = jibVar.a(str, i, i, hashMap, null, f, 0, -1);
            hx8Var.b = a.getWidth();
            int i2 = ((rk0) a44.b(str, g54Var, hashMap).f).b;
            hx8Var.e = i2;
            hx8Var.f = (hx8Var.b - 32.0f) / i2;
            int i3 = i2 * i2;
            hx8Var.g = new boolean[i3];
            hx8Var.h = new float[i3];
            Random random = new Random(str.hashCode());
            for (int i4 = 0; i4 < hx8Var.e; i4++) {
                for (int i5 = 0; i5 < hx8Var.e; i5++) {
                    float f2 = i5 + 0.5f;
                    float f3 = hx8Var.f;
                    int i6 = (int) ((f2 * f3) + 16.0f);
                    int u = (int) hg9.u(i4, 0.5f, f3, 16.0f);
                    boolean z = false;
                    for (int i7 = -1; i7 <= 1 && !z; i7++) {
                        if (Color.alpha(a.getPixel(Math.max(0, Math.min(hx8Var.b - 1, ((int) (i7 * hx8Var.f * 0.3f)) + i6)), u)) > 40) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    boolean[] zArr = hx8Var.g;
                    int i8 = (hx8Var.e * i4) + i5;
                    zArr[i8] = z;
                    hx8Var.h[i8] = random.nextFloat();
                }
            }
            Bitmap b = b();
            int i9 = hx8Var.b;
            hx8Var.d = i9 + 2;
            hx8Var.a = Bitmap.createBitmap(Math.max(i9, b.getWidth()), hx8Var.d + b.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(hx8Var.a);
            canvas.drawBitmap(a, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(b, 0.0f, hx8Var.d, (Paint) null);
            a.recycle();
            hx8Var.a.prepareToDraw();
            Rect rect = hx8Var.c;
            int i10 = hx8Var.b;
            rect.set(0, 0, i10, i10);
            int i11 = jibVar.e;
            hx8Var.k = i11;
            int round = Math.round(i11 / hx8Var.f) + 2;
            int i12 = (hx8Var.e - round) / 2;
            hx8Var.i = i12;
            hx8Var.j = i12 + round;
            return hx8Var;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int d(float f) {
        return Math.max(0, Math.min(255, Math.round(f * 255.0f)));
    }

    public static float h(hx8 hx8Var, float f) {
        float f2 = 1.0f - f;
        float f3 = f2 * f2;
        return hg9.u(hx8Var.e, 6.0f, 1.0f - (((f2 * 0.45f) + 0.55f) * f3), -1.5f);
    }

    public static boolean i(hx8 hx8Var, int i, int i2) {
        if (i >= 7 || i2 >= 7) {
            int i3 = hx8Var.e;
            if (i < i3 - 7 || i2 >= 7) {
                if (i < 7 && i2 >= i3 - 7) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public static float j(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (((float) Math.pow(f, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    public static int k(float f, int i, int i2) {
        if (f <= 0.0f) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float q = q(Color.red(i) / 255.0f);
        float q2 = q(Color.green(i) / 255.0f);
        float q3 = q(Color.blue(i) / 255.0f);
        float q4 = q(Color.red(i2) / 255.0f);
        float q5 = q(Color.green(i2) / 255.0f);
        float q6 = q(Color.blue(i2) / 255.0f);
        float f2 = q3 * 0.051445995f;
        float cbrt = (float) Math.cbrt(f2 + (q2 * 0.53633255f) + (q * 0.41222146f));
        float f3 = q3 * 0.10739696f;
        float cbrt2 = (float) Math.cbrt(f3 + (q2 * 0.6806995f) + (q * 0.2119035f));
        float f4 = q3 * 0.6299787f;
        float cbrt3 = (float) Math.cbrt(f4 + (q2 * 0.28171885f) + (q * 0.08830246f));
        float f5 = 0.051445995f * q6;
        float f6 = 0.6806995f * q5;
        float f7 = 0.10739696f * q6;
        float f8 = q6 * 0.6299787f;
        float A = td4.A((float) Math.cbrt(f5 + (0.53633255f * q5) + (0.41222146f * q4)), cbrt, f, cbrt);
        float A2 = td4.A((float) Math.cbrt(f7 + f6 + (0.2119035f * q4)), cbrt2, f, cbrt2);
        float A3 = td4.A((float) Math.cbrt(f8 + (q5 * 0.28171885f) + (q4 * 0.08830246f)), cbrt3, f, cbrt3);
        float f9 = A * A * A;
        float f10 = A2 * A2 * A2;
        float f11 = A3 * A3 * A3;
        float f12 = (0.23096994f * f11) + ((4.0767417f * f9) - (3.3077116f * f10));
        float f13 = ((2.6097574f * f10) + ((-1.268438f) * f9)) - (0.34131938f * f11);
        float f14 = (f11 * 1.7076147f) + ((f9 * (-0.0041960864f)) - (f10 * 0.7034186f));
        return Color.argb((int) (((Color.alpha(i2) - Color.alpha(i)) * f) + Color.alpha(i)), d(j(f12)), d(j(f13)), d(j(f14)));
    }

    public static float l(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f < 0.6f) {
            float f2 = 1.0f - (f / 0.6f);
            return (1.0f - ((f2 * f2) * f2)) * 1.08f;
        }
        float f3 = (f - 0.6f) / 0.4f;
        return 1.08f - ((3.0f - (f3 * 2.0f)) * ((0.08f * f3) * f3));
    }

    public static void m(hx8 hx8Var) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        int i2;
        int i3;
        if (hx8Var.m == null) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 >= hx8Var.e) {
                    break;
                }
                for (int i6 = 0; i6 < hx8Var.e; i6++) {
                    int i7 = hx8Var.i;
                    if (i6 < i7 || i6 >= (i3 = hx8Var.j) || i4 < i7 || i4 >= i3) {
                        i5++;
                    }
                }
                i4++;
            }
            hx8Var.l = i5;
            hx8Var.m = new float[i5];
            hx8Var.n = new float[i5];
            hx8Var.o = new float[i5];
            hx8Var.p = new boolean[i5];
            hx8Var.q = new int[i5 << 2];
            float f5 = 1.4142f * ((i - 1) / 2.0f);
            int i8 = 0;
            for (int i9 = 0; i9 < hx8Var.e; i9++) {
                int i10 = 0;
                while (true) {
                    int i11 = hx8Var.e;
                    if (i10 < i11) {
                        int i12 = hx8Var.i;
                        if (i10 < i12 || i10 >= (i2 = hx8Var.j) || i9 < i12 || i9 >= i2) {
                            int i13 = (i11 * i9) + i10;
                            float f6 = hx8Var.h[i13] * 3.17f;
                            float floor = f6 - ((float) Math.floor(f6));
                            boolean i14 = i(hx8Var, i10, i9);
                            float[] fArr = hx8Var.m;
                            float f7 = hx8Var.f;
                            fArr[i8] = ((i10 + 0.5f) * f7) + 16.0f;
                            hx8Var.n[i8] = hg9.u(i9, 0.5f, f7, 16.0f);
                            float[] fArr2 = hx8Var.o;
                            float hypot = (((float) Math.hypot(f2 - f, f3 - f)) / f5) * 0.5f;
                            if (i14) {
                                f4 = hypot * 0.85f;
                            } else {
                                f4 = hypot + (floor * 0.06f);
                            }
                            fArr2[i8] = f4;
                            hx8Var.p[i8] = hx8Var.g[i13];
                            int[] iArr = hx8Var.q;
                            int i15 = i8 << 2;
                            iArr[i15] = i10;
                            iArr[i15 + 1] = i9;
                            i8++;
                        }
                        i10++;
                    }
                }
            }
        }
    }

    public static void n(float[] fArr, float[] fArr2, int[] iArr, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i2) {
        int i3 = i << 3;
        fArr[i3] = f;
        int i4 = i3 + 1;
        fArr[i4] = f2;
        int i5 = i3 + 2;
        fArr[i5] = f3;
        int i6 = i3 + 3;
        fArr[i6] = f2;
        int i7 = i3 + 4;
        fArr[i7] = f3;
        int i8 = i3 + 5;
        fArr[i8] = f4;
        int i9 = i3 + 6;
        fArr[i9] = f;
        int i10 = i3 + 7;
        fArr[i10] = f4;
        fArr2[i3] = f5;
        fArr2[i4] = f6;
        fArr2[i5] = f7;
        fArr2[i6] = f6;
        fArr2[i7] = f7;
        fArr2[i8] = f8;
        fArr2[i9] = f5;
        fArr2[i10] = f8;
        int i11 = i << 2;
        iArr[i11] = i2;
        iArr[i11 + 1] = i2;
        iArr[i11 + 2] = i2;
        iArr[i11 + 3] = i2;
    }

    public static float p(float f) {
        double d = f;
        double d2 = 4.417382225408931d * d;
        return (float) Math.min(1.0d, (1.0d - (((Math.sin(d2) * 2.0647416048350564d) + Math.cos(d2)) * Math.exp((-9.120752865260691d) * d))) * 1.02d);
    }

    public static float q(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public final void a(hx8 hx8Var) {
        this.m = hx8Var;
        this.n = null;
        this.q = 2;
        this.o = 0.0f;
        this.p = 0L;
        this.E = 0L;
        this.F = false;
    }

    public final void e(android.graphics.Canvas r90, float r91, float r92, float r93) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix8.e(android.graphics.Canvas, float, float, float):void");
    }

    public final void f(Canvas canvas, hx8 hx8Var, float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        Paint paint;
        float v;
        float l;
        int i;
        float f7;
        float f8;
        float f9;
        boolean z;
        float f10;
        float y;
        int i2;
        float f11;
        int i3;
        int i4;
        ix8 ix8Var = this;
        float f12 = f4;
        int i5 = ix8Var.q;
        Paint paint2 = ix8Var.t;
        RectF rectF = ix8Var.w;
        float f13 = 16.0f;
        float f14 = 1.0f;
        int i6 = 1;
        if (i5 == 2) {
            m(hx8Var);
            int i7 = hx8Var.e;
            ix8Var.g((i7 * i7) + (hx8Var.l << 1));
            Bitmap bitmap = ix8Var.J;
            Bitmap bitmap2 = hx8Var.a;
            Paint paint3 = ix8Var.K;
            if (bitmap != bitmap2) {
                Bitmap bitmap3 = hx8Var.a;
                f7 = 0.05f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
                ix8Var.J = hx8Var.a;
            } else {
                f7 = 0.05f;
            }
            float f15 = f3 / hx8Var.b;
            float min = Math.min(1.0f, Math.max(0.0f, f12) / 0.1f);
            float f16 = hx8Var.f * 0.5f;
            boolean z2 = true;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i8 < hx8Var.l) {
                float f17 = (f12 - hx8Var.o[i8]) / 0.434f;
                if (f17 < 0.0f) {
                    f17 = 0.0f;
                } else if (f17 > f14) {
                    f17 = f14;
                }
                float f18 = f14;
                if (f17 < 0.5f) {
                    f8 = mlb.C(f17, 4.0f, f17, f17);
                } else {
                    float f19 = (f17 * (-2.0f)) + 2.0f;
                    f8 = f18 - (((f19 * f19) * f19) * 0.5f);
                }
                float f20 = (hx8Var.m[i8] * f15) + f;
                float f21 = (hx8Var.n[i8] * f15) + f2;
                if (hx8Var.p[i8]) {
                    if (f8 > 0.75f) {
                        f11 = 4.0f * (f8 - 0.75f);
                    } else {
                        f11 = 0.0f;
                    }
                    f9 = f15;
                    if (f11 < f18) {
                        float A = mlb.A(f8, 0.8f, 0.2f, f16 * f9);
                        int min2 = Math.min(7, (int) ((f8 * 7.0f) + 0.5f));
                        float f22 = (f18 - f11) * min;
                        if (f22 > 0.004f) {
                            n(ix8Var.L, ix8Var.M, ix8Var.P, i9, f20 - A, f21 - A, f20 + A, f21 + A, min2 * 48, hx8Var.d, i3 + 48, i4 + 48, (((int) (f22 * 255.0f)) << 24) | ix8Var.o());
                            i9++;
                        }
                        z2 = false;
                    }
                    if (f11 > 0.0f) {
                        int i11 = i8 << 2;
                        int[] iArr = hx8Var.q;
                        float f23 = hx8Var.f;
                        float f24 = (iArr[i11] * f23) + 16.0f;
                        float f25 = (iArr[i11 + 1] * f23) + 16.0f;
                        float f26 = f24 + f23;
                        float f27 = f25 + f23;
                        n(ix8Var.N, ix8Var.O, ix8Var.Q, i10, (f24 * f9) + f, (f25 * f9) + f2, (f26 * f9) + f, (f27 * f9) + f2, f24, f25, f26, f27, (((int) (min * 255.0f)) << 24) | ix8Var.o());
                        i10++;
                    }
                } else {
                    f9 = f15;
                    if (f8 < f18) {
                        z = false;
                    } else {
                        z = z2;
                    }
                    float f28 = (f18 - f8) * 0.2f;
                    boolean z3 = z;
                    if (f8 < 0.7f) {
                        f10 = f28;
                        y = f18;
                    } else {
                        f10 = f28;
                        y = td4.y(f8, 0.7f, 0.3f, f18);
                    }
                    float f29 = 0.9f * min * y;
                    if (f10 > 0.01f && f29 > 0.004f) {
                        float f30 = f16 * f9 * f10;
                        n(ix8Var.L, ix8Var.M, ix8Var.P, i9, f20 - f30, f21 - f30, f20 + f30, f21 + f30, 0.0f, hx8Var.d, 48.0f, i2 + 48, (((int) (f29 * 255.0f)) << 24) | ix8Var.o());
                        z2 = z3;
                        i9++;
                    } else {
                        z2 = z3;
                    }
                }
                i8++;
                f12 = f4;
                f15 = f9;
                f14 = 1.0f;
            }
            float f31 = f15;
            float max = 1.0f - Math.max(0.0f, Math.min(1.0f, (f4 - f7) / 0.45f));
            float v2 = aq1.v(max, max, max, 1.0f);
            if (v2 > 0.0f) {
                int i12 = hx8Var.i;
                while (i12 < hx8Var.j) {
                    int i13 = i10;
                    for (int i14 = hx8Var.i; i14 < hx8Var.j; i14++) {
                        if (hx8Var.g[(hx8Var.e * i12) + i14]) {
                            float f32 = hx8Var.f;
                            float f33 = (i14 * f32) + 16.0f;
                            float f34 = (i12 * f32) + 16.0f;
                            float f35 = f33 + f32;
                            float f36 = f34 + f32;
                            n(ix8Var.N, ix8Var.O, ix8Var.Q, i13, (f33 * f31) + f, (f34 * f31) + f2, (f35 * f31) + f, (f36 * f31) + f2, f33, f34, f35, f36, (((int) ((min * 255.0f) * v2)) << 24) | ix8Var.o());
                            i13++;
                        }
                    }
                    i12++;
                    i10 = i13;
                }
            }
            if (z2 && min >= 1.0f) {
                rectF.set(f, f2, f + f3, f2 + f3);
                canvas.drawBitmap(hx8Var.a, hx8Var.c, rectF, paint2);
                return;
            }
            if (i9 > 0) {
                int i15 = i10 << 3;
                int i16 = i9 << 3;
                System.arraycopy(ix8Var.L, 0, ix8Var.N, i15, i16);
                System.arraycopy(ix8Var.M, 0, ix8Var.O, i15, i16);
                System.arraycopy(ix8Var.P, 0, ix8Var.Q, i10 << 2, i9 << 2);
            }
            int i17 = i10 + i9;
            if (i17 > 0) {
                canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i17 << 3, ix8Var.N, 0, ix8Var.O, 0, ix8Var.Q, 0, ix8Var.R, 0, i17 * 6, paint3);
                return;
            }
            return;
        }
        int i18 = 0;
        float f37 = 2.0f;
        float f38 = 0.05f;
        float f39 = f3 / hx8Var.b;
        float f40 = (hx8Var.e - 1) / 2.0f;
        float f41 = 1.4142f * f40;
        int i19 = 0;
        while (i19 < hx8Var.e) {
            int i20 = i18;
            while (true) {
                int i21 = hx8Var.e;
                if (i20 < i21) {
                    int i22 = (i21 * i19) + i20;
                    if (hx8Var.g[i22] && !i(hx8Var, i20, i19)) {
                        float f42 = i20;
                        Paint paint4 = paint2;
                        float f43 = i19;
                        f5 = f40;
                        float A2 = (f4 - ((hx8Var.h[i22] * 0.06f) + b10.A((float) Math.hypot(f42 - f40, f43 - f40), f41, 0.52f, f38))) / 0.367f;
                        if (A2 > 0.0f) {
                            if (A2 >= 1.0f) {
                                v = 1.0f;
                            } else {
                                float f44 = 1.0f - A2;
                                v = aq1.v(f44, f44, f44, 1.0f);
                            }
                            if (ix8Var.q == 2) {
                                l = (0.6f * v) + 0.4f;
                            } else {
                                l = l(A2);
                            }
                            if (ix8Var.q != 2) {
                                v = Math.min(1.0f, A2 * 6.0f);
                            }
                            int i23 = hx8Var.i;
                            if (i20 < i23 || i20 >= (i = hx8Var.j) || i19 < i23 || i19 >= i) {
                                float f45 = hx8Var.f;
                                int i24 = (int) ((f42 * f45) + 16.0f);
                                int i25 = (int) ((f43 * f45) + 16.0f);
                                float f46 = l;
                                int ceil = (int) Math.ceil(((i20 + 1) * f45) + 16.0f);
                                f6 = f41;
                                int ceil2 = (int) Math.ceil(((i19 + 1) * hx8Var.f) + 16.0f);
                                Rect rect = ix8Var.v;
                                rect.set(i24, i25, ceil, ceil2);
                                float f47 = f37;
                                float A3 = b10.A(i24 + ceil, f47, f39, f);
                                float A4 = b10.A(i25 + ceil2, f47, f39, f2);
                                float f48 = ((ceil - i24) / f47) * f39 * f46;
                                float f49 = ((ceil2 - i25) / f47) * f39 * f46;
                                rectF.set(A3 - f48, A4 - f49, A3 + f48, A4 + f49);
                                paint = paint4;
                                paint.setAlpha((int) (v * 255.0f));
                                canvas.drawBitmap(hx8Var.a, rect, rectF, paint);
                                paint.setAlpha(255);
                            }
                        }
                        f6 = f41;
                        paint = paint4;
                    } else {
                        f5 = f40;
                        f6 = f41;
                        paint = paint2;
                    }
                    i20++;
                    ix8Var = this;
                    paint2 = paint;
                    f41 = f6;
                    f40 = f5;
                    f37 = 2.0f;
                    f38 = 0.05f;
                }
            }
            i19++;
            ix8Var = this;
            i18 = 0;
            f37 = 2.0f;
            f38 = 0.05f;
        }
        Paint paint5 = paint2;
        float f50 = f3 / hx8Var.b;
        int i26 = 0;
        while (i26 < 3) {
            int i27 = i26 == i6 ? hx8Var.e - 7 : 0;
            int i28 = i26 == 2 ? hx8Var.e - 7 : 0;
            float f51 = f4 / 0.32f;
            if (f51 > 0.0f) {
                float f52 = hx8Var.f;
                float f53 = f13;
                float g = aq1.g(i27, f52, f53, f50, f);
                float g2 = aq1.g(i28, f52, f53, f50, f2);
                float g3 = aq1.g(i27 + 7, f52, f53, f50, f);
                float g4 = aq1.g(i28 + 7, f52, f53, f50, f2);
                float l2 = l(f51);
                canvas.save();
                canvas.scale(l2, l2, (g + g3) / 2.0f, (g2 + g4) / 2.0f);
                canvas.clipRect(g - 1.0f, g2 - 1.0f, g3 + 1.0f, g4 + 1.0f);
                rectF.set(f, f2, f + f3, f2 + f3);
                paint5.setAlpha(255);
                canvas.drawBitmap(hx8Var.a, hx8Var.c, rectF, paint5);
                canvas.restore();
            }
            i26++;
            f13 = 16.0f;
            i6 = 1;
        }
        paint5.setAlpha(255);
    }

    public final void g(int i) {
        float[] fArr = this.L;
        if (fArr == null || fArr.length < (i << 3)) {
            int i2 = i << 3;
            this.L = new float[i2];
            this.M = new float[i2];
            int i3 = i << 2;
            this.P = new int[i3];
            this.N = new float[i2];
            this.O = new float[i2];
            this.Q = new int[i3];
            this.R = new short[i * 6];
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 << 2;
                short[] sArr = this.R;
                int i6 = i4 * 6;
                short s = (short) i5;
                sArr[i6] = s;
                sArr[i6 + 1] = (short) (i5 + 1);
                short s2 = (short) (i5 + 2);
                sArr[i6 + 2] = s2;
                sArr[i6 + 3] = s;
                sArr[i6 + 4] = s2;
                sArr[i6 + 5] = (short) (i5 + 3);
            }
        }
    }

    public final int o() {
        return this.y & 16777215;
    }
}
