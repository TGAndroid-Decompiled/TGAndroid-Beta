package ai;

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
import org.telegram.messenger.TelegramQRCodeWriter;
import org.telegram.messenger.wh;
import org.telegram.ui.d3;
public final class h {
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
    public int f1525l;
    public g f1526m;
    public g f1527n;
    public long f1529p;
    public boolean[] f1532s;
    public PorterDuffColorFilter f1538z;
    public final float[] f1517a = new float[2400];
    public final float[] f1518b = new float[2400];
    public final float[] f1519c = new float[2400];
    public final float[] d = new float[2400];
    public final float[] e = new float[2400];
    public final float[] f1520f = new float[2400];
    public final float[] f1521g = new float[2400];
    public final float[] h = new float[2400];
    public final float[] f1522i = new float[2400];
    public final float[] f1523j = new float[2400];
    public final byte[] f1524k = new byte[2400];
    public float f1528o = 1.0f;
    public int f1530q = 0;
    public final RectF f1531r = new RectF();
    public final Paint f1533t = new Paint(3);
    public final Paint f1534u = new Paint(1);
    public final Rect v = new Rect();
    public final RectF f1535w = new RectF();
    public final Random f1536x = new Random();
    public int f1537y = -16777216;
    public float D = -1.0f;
    public final Paint I = new Paint(3);
    public final Paint K = new Paint(3);

    static {
        float f7;
        float f10;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            f7 = 0.5f;
            if (i11 > 1000) {
                break;
            }
            float f11 = i11 / 1000.0f;
            if (p(f11 * 0.467f) >= 0.5f) {
                f7 = f11;
                break;
            }
            i11++;
        }
        while (true) {
            f10 = 0.8f;
            if (i10 > 1000) {
                break;
            }
            float f12 = i10 / 1000.0f;
            if (p(f12 * 0.467f) >= 0.8f) {
                f10 = f12;
                break;
            }
            i10++;
        }
        S = f7;
        T = f10;
    }

    public static synchronized Bitmap b() {
        Bitmap bitmap;
        synchronized (h.class) {
            try {
                if (U == null) {
                    U = Bitmap.createBitmap(384, 48, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(U);
                    Paint paint = new Paint(1);
                    paint.setColor(-1);
                    RectF rectF = new RectF();
                    for (int i10 = 0; i10 < 8; i10++) {
                        int i11 = i10 * 48;
                        rectF.set(i11 + 1.5f, 1.5f, (i11 + 48) - 1.5f, 46.5f);
                        float f7 = (1.0f - ((i10 * 0.7f) / 7.0f)) * 22.5f;
                        canvas.drawRoundRect(rectF, f7, f7, paint);
                    }
                }
                bitmap = U;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bitmap;
    }

    public static g c(String str, int i10, jc.c cVar, float f7, ColorDrawable colorDrawable) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(ec.b.f9873a, cVar);
            hashMap.put(ec.b.f9875c, 0);
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            if (colorDrawable != null) {
                telegramQRCodeWriter.setCenterDrawable(colorDrawable);
            }
            g gVar = new g();
            Bitmap encode = telegramQRCodeWriter.encode(str, i10, i10, hashMap, null, f7, 0, -1);
            gVar.f1498b = encode.getWidth();
            int i11 = ((lc.b) lc.c.b(str, cVar, hashMap).f9530f).f16969b;
            gVar.e = i11;
            gVar.f1500f = (gVar.f1498b - (gVar.f1501g * 2.0f)) / i11;
            int i12 = i11 * i11;
            gVar.h = new boolean[i12];
            gVar.f1502i = new float[i12];
            Random random = new Random(str.hashCode());
            for (int i13 = 0; i13 < gVar.e; i13++) {
                for (int i14 = 0; i14 < gVar.e; i14++) {
                    float f10 = gVar.f1501g;
                    float f11 = i14 + 0.5f;
                    float f12 = gVar.f1500f;
                    int i15 = (int) ((f11 * f12) + f10);
                    int a2 = (int) wh.a(i13, 0.5f, f12, f10);
                    boolean z10 = false;
                    for (int i16 = -1; i16 <= 1 && !z10; i16++) {
                        if (Color.alpha(encode.getPixel(Math.max(0, Math.min(gVar.f1498b - 1, ((int) (i16 * gVar.f1500f * 0.3f)) + i15)), a2)) > 40) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    boolean[] zArr = gVar.h;
                    int i17 = (gVar.e * i13) + i14;
                    zArr[i17] = z10;
                    gVar.f1502i[i17] = random.nextFloat();
                }
            }
            Bitmap b10 = b();
            int i18 = gVar.f1498b;
            gVar.d = i18 + 2;
            gVar.f1497a = Bitmap.createBitmap(Math.max(i18, b10.getWidth()), gVar.d + b10.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(gVar.f1497a);
            canvas.drawBitmap(encode, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(b10, 0.0f, gVar.d, (Paint) null);
            encode.recycle();
            gVar.f1497a.prepareToDraw();
            Rect rect = gVar.f1499c;
            int i19 = gVar.f1498b;
            rect.set(0, 0, i19, i19);
            gVar.f1505l = telegramQRCodeWriter.getImageSize();
            int round = Math.round(telegramQRCodeWriter.getImageSize() / gVar.f1500f) + 2;
            int i20 = (gVar.e - round) / 2;
            gVar.f1503j = i20;
            gVar.f1504k = i20 + round;
            return gVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int d(float f7) {
        return Math.max(0, Math.min(255, Math.round(f7 * 255.0f)));
    }

    public static float h(g gVar, float f7) {
        float f10 = 1.0f - f7;
        float f11 = f10 * f10;
        return wh.a(gVar.e, 6.0f, 1.0f - (((f10 * 0.45f) + 0.55f) * f11), -1.5f);
    }

    public static boolean i(g gVar, int i10, int i11) {
        if (i10 >= 7 || i11 >= 7) {
            int i12 = gVar.e;
            if (i10 < i12 - 7 || i11 >= 7) {
                if (i10 < 7 && i11 >= i12 - 7) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public static float j(float f7) {
        if (f7 <= 0.0031308f) {
            return f7 * 12.92f;
        }
        return (((float) Math.pow(f7, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    public static int k(float f7, int i10, int i11) {
        if (f7 <= 0.0f) {
            return i10;
        }
        if (f7 >= 1.0f) {
            return i11;
        }
        float q5 = q(Color.red(i10) / 255.0f);
        float q9 = q(Color.green(i10) / 255.0f);
        float q10 = q(Color.blue(i10) / 255.0f);
        float q11 = q(Color.red(i11) / 255.0f);
        float q12 = q(Color.green(i11) / 255.0f);
        float q13 = q(Color.blue(i11) / 255.0f);
        float f10 = q10 * 0.051445995f;
        float cbrt = (float) Math.cbrt(f10 + (q9 * 0.53633255f) + (q5 * 0.41222146f));
        float f11 = q10 * 0.10739696f;
        float cbrt2 = (float) Math.cbrt(f11 + (q9 * 0.6806995f) + (q5 * 0.2119035f));
        float f12 = q10 * 0.6299787f;
        float cbrt3 = (float) Math.cbrt(f12 + (q9 * 0.28171885f) + (q5 * 0.08830246f));
        float f13 = 0.051445995f * q13;
        float f14 = 0.6806995f * q12;
        float f15 = 0.10739696f * q13;
        float f16 = q13 * 0.6299787f;
        float z10 = c3.h0.z((float) Math.cbrt(f13 + (0.53633255f * q12) + (0.41222146f * q11)), cbrt, f7, cbrt);
        float z11 = c3.h0.z((float) Math.cbrt(f15 + f14 + (0.2119035f * q11)), cbrt2, f7, cbrt2);
        float z12 = c3.h0.z((float) Math.cbrt(f16 + (q12 * 0.28171885f) + (q11 * 0.08830246f)), cbrt3, f7, cbrt3);
        float f17 = z10 * z10 * z10;
        float f18 = z11 * z11 * z11;
        float f19 = z12 * z12 * z12;
        float f20 = (0.23096994f * f19) + ((4.0767417f * f17) - (3.3077116f * f18));
        float f21 = ((2.6097574f * f18) + ((-1.268438f) * f17)) - (0.34131938f * f19);
        float f22 = (f19 * 1.7076147f) + ((f17 * (-0.0041960864f)) - (f18 * 0.7034186f));
        return Color.argb((int) (((Color.alpha(i11) - Color.alpha(i10)) * f7) + Color.alpha(i10)), d(j(f20)), d(j(f21)), d(j(f22)));
    }

    public static float l(float f7) {
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        if (f7 >= 1.0f) {
            return 1.0f;
        }
        if (f7 < 0.6f) {
            float f10 = 1.0f - (f7 / 0.6f);
            return (1.0f - ((f10 * f10) * f10)) * 1.08f;
        }
        float f11 = (f7 - 0.6f) / 0.4f;
        return 1.08f - ((3.0f - (f11 * 2.0f)) * ((0.08f * f11) * f11));
    }

    public static void m(g gVar) {
        int i10;
        float f7;
        float f10;
        float f11;
        float f12;
        int i11;
        int i12;
        if (gVar.f1507n == null) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i13 >= gVar.e) {
                    break;
                }
                for (int i15 = 0; i15 < gVar.e; i15++) {
                    int i16 = gVar.f1503j;
                    if (i15 < i16 || i15 >= (i12 = gVar.f1504k) || i13 < i16 || i13 >= i12) {
                        i14++;
                    }
                }
                i13++;
            }
            gVar.f1506m = i14;
            gVar.f1507n = new float[i14];
            gVar.f1508o = new float[i14];
            gVar.f1509p = new float[i14];
            gVar.f1510q = new boolean[i14];
            gVar.f1511r = new int[i14 * 4];
            float f13 = 1.4142f * ((i10 - 1) / 2.0f);
            int i17 = 0;
            for (int i18 = 0; i18 < gVar.e; i18++) {
                int i19 = 0;
                while (true) {
                    int i20 = gVar.e;
                    if (i19 < i20) {
                        int i21 = gVar.f1503j;
                        if (i19 < i21 || i19 >= (i11 = gVar.f1504k) || i18 < i21 || i18 >= i11) {
                            int i22 = (i20 * i18) + i19;
                            float f14 = gVar.f1502i[i22] * 3.17f;
                            float floor = f14 - ((float) Math.floor(f14));
                            boolean i23 = i(gVar, i19, i18);
                            float[] fArr = gVar.f1507n;
                            float f15 = gVar.f1501g;
                            float f16 = gVar.f1500f;
                            fArr[i17] = ((i19 + 0.5f) * f16) + f15;
                            gVar.f1508o[i17] = wh.a(i18, 0.5f, f16, f15);
                            float[] fArr2 = gVar.f1509p;
                            float hypot = (((float) Math.hypot(f10 - f7, f11 - f7)) / f13) * 0.5f;
                            if (i23) {
                                f12 = hypot * 0.85f;
                            } else {
                                f12 = hypot + (floor * 0.06f);
                            }
                            fArr2[i17] = f12;
                            gVar.f1510q[i17] = gVar.h[i22];
                            int[] iArr = gVar.f1511r;
                            int i24 = i17 * 4;
                            iArr[i24] = i19;
                            iArr[i24 + 1] = i18;
                            i17++;
                        }
                        i19++;
                    }
                }
            }
        }
    }

    public static void n(float[] fArr, float[] fArr2, int[] iArr, int i10, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i11) {
        int i12 = i10 * 8;
        fArr[i12] = f7;
        int i13 = i12 + 1;
        fArr[i13] = f10;
        int i14 = i12 + 2;
        fArr[i14] = f11;
        int i15 = i12 + 3;
        fArr[i15] = f10;
        int i16 = i12 + 4;
        fArr[i16] = f11;
        int i17 = i12 + 5;
        fArr[i17] = f12;
        int i18 = i12 + 6;
        fArr[i18] = f7;
        int i19 = i12 + 7;
        fArr[i19] = f12;
        fArr2[i12] = f13;
        fArr2[i13] = f14;
        fArr2[i14] = f15;
        fArr2[i15] = f14;
        fArr2[i16] = f15;
        fArr2[i17] = f16;
        fArr2[i18] = f13;
        fArr2[i19] = f16;
        int i20 = i10 * 4;
        iArr[i20] = i11;
        iArr[i20 + 1] = i11;
        iArr[i20 + 2] = i11;
        iArr[i20 + 3] = i11;
    }

    public static float p(float f7) {
        double d = f7;
        double exp = Math.exp((-9.120752865260691d) * d);
        double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d * d;
        return (float) Math.min(1.0d, (1.0d - (((Math.sin(sqrt) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(sqrt)) * exp)) * 1.02d);
    }

    public static float q(float f7) {
        if (f7 <= 0.04045f) {
            return f7 / 12.92f;
        }
        return (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public final void a(g gVar) {
        this.f1526m = gVar;
        this.f1527n = null;
        this.f1530q = 2;
        this.f1528o = 0.0f;
        this.f1529p = 0L;
        this.E = 0L;
        this.F = false;
    }

    public final void e(android.graphics.Canvas r89, float r90, float r91, float r92) {
        throw new UnsupportedOperationException("Method not decompiled: ai.h.e(android.graphics.Canvas, float, float, float):void");
    }

    public final void f(Canvas canvas, g gVar, float f7, float f10, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float A;
        int i10;
        float f18;
        float f19;
        Paint paint;
        float f20;
        float y3;
        int i11;
        int i12;
        int i13;
        float f21 = f7;
        float f22 = f10;
        float f23 = f12;
        int i14 = this.f1530q;
        Paint paint2 = this.f1533t;
        RectF rectF = this.f1535w;
        int i15 = 1;
        if (i14 == 2) {
            m(gVar);
            int i16 = gVar.f1501g;
            int i17 = gVar.e;
            g((i17 * i17) + (gVar.f1506m * 2));
            Bitmap bitmap = this.J;
            Bitmap bitmap2 = gVar.f1497a;
            Paint paint3 = this.K;
            if (bitmap != bitmap2) {
                Bitmap bitmap3 = gVar.f1497a;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
                this.J = gVar.f1497a;
            }
            float f24 = f11 / gVar.f1498b;
            float min = Math.min(1.0f, Math.max(0.0f, f23) / 0.1f);
            float f25 = gVar.f1500f * 0.5f;
            float f26 = 1.0f;
            boolean z10 = true;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i18 < gVar.f1506m) {
                float f27 = (f23 - gVar.f1509p[i18]) / 0.434f;
                if (f27 < 0.0f) {
                    f27 = 0.0f;
                } else if (f27 > f26) {
                    f27 = f26;
                }
                if (f27 < 0.5f) {
                    f19 = c3.h0.E(f27, 4.0f, f27, f27);
                } else {
                    float f28 = (f27 * (-2.0f)) + 2.0f;
                    f19 = f26 - (((f28 * f28) * f28) * 0.5f);
                }
                float f29 = (gVar.f1507n[i18] * f24) + f21;
                float f30 = (gVar.f1508o[i18] * f24) + f22;
                if (gVar.f1510q[i18]) {
                    float f31 = f19 > 0.75f ? 4.0f * (f19 - 0.75f) : 0.0f;
                    paint = paint3;
                    if (f31 < f26) {
                        float C = c3.h0.C(f19, 0.8f, 0.2f, f25 * f24);
                        int min2 = Math.min(7, (int) ((f19 * 7.0f) + 0.5f));
                        float f32 = (f26 - f31) * min;
                        if (f32 > 0.004f) {
                            n(this.L, this.M, this.P, i19, f29 - C, f30 - C, f29 + C, f30 + C, min2 * 48, gVar.d, i12 + 48, i13 + 48, (((int) (f32 * 255.0f)) << 24) | o());
                            i19++;
                        }
                        z10 = false;
                    }
                    if (f31 > 0.0f) {
                        int i21 = i18 * 4;
                        float f33 = i16;
                        int[] iArr = gVar.f1511r;
                        float f34 = gVar.f1500f;
                        float f35 = (iArr[i21] * f34) + f33;
                        float f36 = (iArr[i21 + 1] * f34) + f33;
                        float f37 = f35 + f34;
                        float f38 = f36 + f34;
                        n(this.N, this.O, this.Q, i20, (f35 * f24) + f21, (f36 * f24) + f22, (f37 * f24) + f21, (f38 * f24) + f22, f35, f36, f37, f38, (((int) (min * 255.0f)) << 24) | o());
                        i20++;
                    }
                } else {
                    paint = paint3;
                    float f39 = (f26 - f19) * 0.2f;
                    boolean z11 = f19 < f26 ? false : z10;
                    if (f19 < 0.7f) {
                        f20 = f39;
                        y3 = f26;
                    } else {
                        f20 = f39;
                        y3 = org.telegram.messenger.t.y(f19, 0.7f, 0.3f, f26);
                    }
                    float f40 = 0.9f * min * y3;
                    if (f20 <= 0.01f || f40 <= 0.004f) {
                        z10 = z11;
                    } else {
                        float f41 = f25 * f24 * f20;
                        n(this.L, this.M, this.P, i19, f29 - f41, f30 - f41, f29 + f41, f30 + f41, 0.0f, gVar.d, 48.0f, i11 + 48, (((int) (f40 * 255.0f)) << 24) | o());
                        z10 = z11;
                        i19++;
                    }
                }
                i18++;
                f23 = f12;
                paint3 = paint;
                f26 = 1.0f;
            }
            Paint paint4 = paint3;
            float max = 1.0f - Math.max(0.0f, Math.min(1.0f, (f12 - 0.05f) / 0.45f));
            float A2 = d3.A(max, max, max, 1.0f);
            if (A2 > 0.0f) {
                int i22 = gVar.f1503j;
                while (i22 < gVar.f1504k) {
                    int i23 = gVar.f1503j;
                    int i24 = i20;
                    while (i23 < gVar.f1504k) {
                        if (gVar.h[(gVar.e * i22) + i23]) {
                            float f42 = i16;
                            float f43 = gVar.f1500f;
                            float f44 = (i23 * f43) + f42;
                            float f45 = (i22 * f43) + f42;
                            f18 = A2;
                            float f46 = f44 + f43;
                            float f47 = f45 + f43;
                            n(this.N, this.O, this.Q, i24, (f44 * f24) + f21, (f45 * f24) + f22, (f46 * f24) + f21, (f47 * f24) + f22, f44, f45, f46, f47, (((int) ((min * 255.0f) * f18)) << 24) | o());
                            i24++;
                        } else {
                            f18 = A2;
                        }
                        i23++;
                        A2 = f18;
                    }
                    i22++;
                    i20 = i24;
                }
            }
            if (z10 && min >= 1.0f) {
                rectF.set(f21, f22, f21 + f11, f22 + f11);
                canvas.drawBitmap(gVar.f1497a, gVar.f1499c, rectF, paint2);
                return;
            }
            if (i19 > 0) {
                int i25 = i20 * 8;
                int i26 = i19 * 8;
                System.arraycopy(this.L, 0, this.N, i25, i26);
                System.arraycopy(this.M, 0, this.O, i25, i26);
                System.arraycopy(this.P, 0, this.Q, i20 * 4, i19 * 4);
            }
            int i27 = i20 + i19;
            if (i27 > 0) {
                canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i27 * 8, this.N, 0, this.O, 0, this.Q, 0, this.R, 0, i27 * 6, paint4);
                return;
            }
            return;
        }
        int i28 = 0;
        float f48 = 2.0f;
        float f49 = 0.05f;
        int i29 = gVar.f1498b;
        int i30 = gVar.f1501g;
        float f50 = f11 / i29;
        float f51 = (gVar.e - 1) / 2.0f;
        float f52 = 1.4142f * f51;
        int i31 = 0;
        while (i31 < gVar.e) {
            int i32 = i28;
            while (true) {
                int i33 = gVar.e;
                if (i32 < i33) {
                    int i34 = (i33 * i31) + i32;
                    if (!gVar.h[i34] || i(gVar, i32, i31)) {
                        f13 = f50;
                        f14 = f51;
                        f15 = f52;
                        f16 = f22;
                        f17 = f21;
                    } else {
                        float f53 = i32;
                        float f54 = i31;
                        float c10 = (f12 - ((gVar.f1502i[i34] * 0.06f) + a1.g.c((float) Math.hypot(f53 - f51, f54 - f51), f52, 0.52f, f49))) / 0.367f;
                        if (c10 > 0.0f) {
                            if (c10 >= 1.0f) {
                                A = 1.0f;
                            } else {
                                float f55 = 1.0f - c10;
                                A = d3.A(f55, f55, f55, 1.0f);
                            }
                            float l4 = this.f1530q == 2 ? (0.6f * A) + 0.4f : l(c10);
                            if (this.f1530q != 2) {
                                A = Math.min(1.0f, c10 * 6.0f);
                            }
                            int i35 = gVar.f1503j;
                            if (i32 < i35 || i32 >= (i10 = gVar.f1504k) || i31 < i35 || i31 >= i10) {
                                float f56 = i30;
                                float f57 = gVar.f1500f;
                                int i36 = (int) ((f53 * f57) + f56);
                                int i37 = (int) ((f54 * f57) + f56);
                                float f58 = l4;
                                float f59 = f51;
                                f15 = f52;
                                int ceil = (int) Math.ceil(((i32 + 1) * f57) + f56);
                                int ceil2 = (int) Math.ceil(((i31 + 1) * gVar.f1500f) + f56);
                                Rect rect = this.v;
                                rect.set(i36, i37, ceil, ceil2);
                                f14 = f59;
                                float f60 = f48;
                                f17 = f7;
                                float c11 = a1.g.c(i36 + ceil, f60, f50, f17);
                                f16 = f10;
                                float c12 = a1.g.c(i37 + ceil2, f60, f50, f16);
                                float f61 = ((ceil - i36) / f60) * f50 * f58;
                                float f62 = ((ceil2 - i37) / f60) * f50 * f58;
                                f13 = f50;
                                rectF.set(c11 - f61, c12 - f62, c11 + f61, c12 + f62);
                                paint2.setAlpha((int) (A * 255.0f));
                                g gVar2 = this.f1527n;
                                canvas.drawBitmap(gVar.f1497a, rect, rectF, paint2);
                                paint2.setAlpha(255);
                            }
                        }
                        f17 = f7;
                        f13 = f50;
                        f14 = f51;
                        f15 = f52;
                        f16 = f10;
                    }
                    i32++;
                    f21 = f17;
                    f22 = f16;
                    f50 = f13;
                    f52 = f15;
                    f51 = f14;
                    f48 = 2.0f;
                    f49 = 0.05f;
                }
            }
            i31++;
            f22 = f22;
            f51 = f51;
            i28 = 0;
            f48 = 2.0f;
            f49 = 0.05f;
        }
        float f63 = f22;
        float f64 = f21;
        float f65 = f11 / gVar.f1498b;
        int i38 = 0;
        while (i38 < 3) {
            int i39 = i38 == i15 ? gVar.e - 7 : 0;
            int i40 = i38 == 2 ? gVar.e - 7 : 0;
            float f66 = f12 / 0.32f;
            if (f66 > 0.0f) {
                float f67 = i30;
                float f68 = gVar.f1500f;
                float e = d3.e(i39, f68, f67, f65, f64);
                float e10 = d3.e(i40, f68, f67, f65, f63);
                float e11 = d3.e(i39 + 7, f68, f67, f65, f64);
                float e12 = d3.e(i40 + 7, f68, f67, f65, f63);
                float l10 = l(f66);
                canvas.save();
                canvas.scale(l10, l10, (e + e11) / 2.0f, (e10 + e12) / 2.0f);
                canvas.clipRect(e - 1.0f, e10 - 1.0f, e11 + 1.0f, e12 + 1.0f);
                rectF.set(f64, f63, f64 + f11, f63 + f11);
                paint2.setAlpha(255);
                canvas.drawBitmap(gVar.f1497a, gVar.f1499c, rectF, paint2);
                canvas.restore();
            }
            i38++;
            i15 = 1;
        }
        paint2.setAlpha(255);
    }

    public final void g(int i10) {
        float[] fArr = this.L;
        if (fArr == null || fArr.length < i10 * 8) {
            int i11 = i10 * 8;
            this.L = new float[i11];
            this.M = new float[i11];
            int i12 = i10 * 4;
            this.P = new int[i12];
            this.N = new float[i11];
            this.O = new float[i11];
            this.Q = new int[i12];
            this.R = new short[i10 * 6];
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 4;
                short[] sArr = this.R;
                int i15 = i13 * 6;
                short s10 = (short) i14;
                sArr[i15] = s10;
                sArr[i15 + 1] = (short) (i14 + 1);
                short s11 = (short) (i14 + 2);
                sArr[i15 + 2] = s11;
                sArr[i15 + 3] = s10;
                sArr[i15 + 4] = s11;
                sArr[i15 + 5] = (short) (i14 + 3);
            }
        }
    }

    public final int o() {
        return this.f1537y & 16777215;
    }
}
