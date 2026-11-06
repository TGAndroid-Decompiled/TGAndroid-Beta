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
import org.telegram.messenger.k5;
import org.telegram.messenger.xz;
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
    public int f1211l;
    public g f1212m;
    public g f1213n;
    public long f1215p;
    public boolean[] f1218s;
    public PorterDuffColorFilter f1224z;
    public final float[] f1202a = new float[2400];
    public final float[] f1203b = new float[2400];
    public final float[] f1204c = new float[2400];
    public final float[] d = new float[2400];
    public final float[] f1205e = new float[2400];
    public final float[] f1206f = new float[2400];
    public final float[] f1207g = new float[2400];
    public final float[] h = new float[2400];
    public final float[] f1208i = new float[2400];
    public final float[] f1209j = new float[2400];
    public final byte[] f1210k = new byte[2400];
    public float f1214o = 1.0f;
    public int f1216q = 0;
    public final RectF f1217r = new RectF();
    public final Paint f1219t = new Paint(3);
    public final Paint f1220u = new Paint(1);
    public final Rect v = new Rect();
    public final RectF f1221w = new RectF();
    public final Random f1222x = new Random();
    public int f1223y = -16777216;
    public float D = -1.0f;
    public final Paint I = new Paint(3);
    public final Paint K = new Paint(3);

    static {
        float f10;
        float f11;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            f10 = 0.5f;
            if (i10 > 1000) {
                break;
            }
            float f12 = i10 / 1000.0f;
            if (p(f12 * 0.467f) >= 0.5f) {
                f10 = f12;
                break;
            }
            i10++;
        }
        while (true) {
            f11 = 0.8f;
            if (i7 > 1000) {
                break;
            }
            float f13 = i7 / 1000.0f;
            if (p(f13 * 0.467f) >= 0.8f) {
                f11 = f13;
                break;
            }
            i7++;
        }
        S = f10;
        T = f11;
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
                    for (int i7 = 0; i7 < 8; i7++) {
                        int i10 = i7 * 48;
                        rectF.set(i10 + 1.5f, 1.5f, (i10 + 48) - 1.5f, 46.5f);
                        float f10 = (1.0f - ((i7 * 0.7f) / 7.0f)) * 22.5f;
                        canvas.drawRoundRect(rectF, f10, f10, paint);
                    }
                }
                bitmap = U;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bitmap;
    }

    public static g c(String str, int i7, gc.b bVar, float f10, ColorDrawable colorDrawable) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(bc.b.f3158a, bVar);
            hashMap.put(bc.b.f3160c, 0);
            xz xzVar = new xz();
            if (colorDrawable != null) {
                xzVar.f26557g = colorDrawable;
            }
            g gVar = new g();
            Bitmap a10 = xzVar.a(str, i7, i7, hashMap, null, f10, 0, -1);
            gVar.f1183b = a10.getWidth();
            int i10 = ((cc.c) ic.b.b(str, bVar, hashMap).f194f).f6048b;
            gVar.f1185e = i10;
            gVar.f1186f = (gVar.f1183b - (gVar.f1187g * 2.0f)) / i10;
            int i11 = i10 * i10;
            gVar.h = new boolean[i11];
            gVar.f1188i = new float[i11];
            Random random = new Random(str.hashCode());
            for (int i12 = 0; i12 < gVar.f1185e; i12++) {
                for (int i13 = 0; i13 < gVar.f1185e; i13++) {
                    float f11 = gVar.f1187g;
                    float f12 = i13 + 0.5f;
                    float f13 = gVar.f1186f;
                    int i14 = (int) ((f12 * f13) + f11);
                    int b10 = (int) org.telegram.messenger.camera.q.b(i12, 0.5f, f13, f11);
                    boolean z9 = false;
                    for (int i15 = -1; i15 <= 1 && !z9; i15++) {
                        if (Color.alpha(a10.getPixel(Math.max(0, Math.min(gVar.f1183b - 1, ((int) (i15 * gVar.f1186f * 0.3f)) + i14)), b10)) > 40) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    }
                    boolean[] zArr = gVar.h;
                    int i16 = (gVar.f1185e * i12) + i13;
                    zArr[i16] = z9;
                    gVar.f1188i[i16] = random.nextFloat();
                }
            }
            Bitmap b11 = b();
            int i17 = gVar.f1183b;
            gVar.d = i17 + 2;
            gVar.f1182a = Bitmap.createBitmap(Math.max(i17, b11.getWidth()), gVar.d + b11.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(gVar.f1182a);
            canvas.drawBitmap(a10, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(b11, 0.0f, gVar.d, (Paint) null);
            a10.recycle();
            gVar.f1182a.prepareToDraw();
            Rect rect = gVar.f1184c;
            int i18 = gVar.f1183b;
            rect.set(0, 0, i18, i18);
            int i19 = xzVar.f26556f;
            gVar.f1191l = i19;
            int round = Math.round(i19 / gVar.f1186f) + 2;
            int i20 = (gVar.f1185e - round) / 2;
            gVar.f1189j = i20;
            gVar.f1190k = i20 + round;
            return gVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int d(float f10) {
        return Math.max(0, Math.min(255, Math.round(f10 * 255.0f)));
    }

    public static float h(g gVar, float f10) {
        float f11 = 1.0f - f10;
        float f12 = f11 * f11;
        return org.telegram.messenger.camera.q.b(gVar.f1185e, 6.0f, 1.0f - (((f11 * 0.45f) + 0.55f) * f12), -1.5f);
    }

    public static boolean i(g gVar, int i7, int i10) {
        if (i7 >= 7 || i10 >= 7) {
            int i11 = gVar.f1185e;
            if (i7 < i11 - 7 || i10 >= 7) {
                if (i7 < 7 && i10 >= i11 - 7) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public static float j(float f10) {
        if (f10 <= 0.0031308f) {
            return f10 * 12.92f;
        }
        return (((float) Math.pow(f10, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    public static int k(float f10, int i7, int i10) {
        if (f10 <= 0.0f) {
            return i7;
        }
        if (f10 >= 1.0f) {
            return i10;
        }
        float q10 = q(Color.red(i7) / 255.0f);
        float q11 = q(Color.green(i7) / 255.0f);
        float q12 = q(Color.blue(i7) / 255.0f);
        float q13 = q(Color.red(i10) / 255.0f);
        float q14 = q(Color.green(i10) / 255.0f);
        float q15 = q(Color.blue(i10) / 255.0f);
        float f11 = q12 * 0.051445995f;
        float cbrt = (float) Math.cbrt(f11 + (q11 * 0.53633255f) + (q10 * 0.41222146f));
        float f12 = q12 * 0.10739696f;
        float cbrt2 = (float) Math.cbrt(f12 + (q11 * 0.6806995f) + (q10 * 0.2119035f));
        float f13 = q12 * 0.6299787f;
        float cbrt3 = (float) Math.cbrt(f13 + (q11 * 0.28171885f) + (q10 * 0.08830246f));
        float f14 = 0.051445995f * q15;
        float f15 = 0.6806995f * q14;
        float f16 = 0.10739696f * q15;
        float f17 = q15 * 0.6299787f;
        float z9 = com.google.android.recaptcha.internal.a.z((float) Math.cbrt(f14 + (0.53633255f * q14) + (0.41222146f * q13)), cbrt, f10, cbrt);
        float z10 = com.google.android.recaptcha.internal.a.z((float) Math.cbrt(f16 + f15 + (0.2119035f * q13)), cbrt2, f10, cbrt2);
        float z11 = com.google.android.recaptcha.internal.a.z((float) Math.cbrt(f17 + (q14 * 0.28171885f) + (q13 * 0.08830246f)), cbrt3, f10, cbrt3);
        float f18 = z9 * z9 * z9;
        float f19 = z10 * z10 * z10;
        float f20 = z11 * z11 * z11;
        float f21 = (0.23096994f * f20) + ((4.0767417f * f18) - (3.3077116f * f19));
        float f22 = ((2.6097574f * f19) + ((-1.268438f) * f18)) - (0.34131938f * f20);
        float f23 = (f20 * 1.7076147f) + ((f18 * (-0.0041960864f)) - (f19 * 0.7034186f));
        return Color.argb((int) (((Color.alpha(i10) - Color.alpha(i7)) * f10) + Color.alpha(i7)), d(j(f21)), d(j(f22)), d(j(f23)));
    }

    public static float l(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 < 0.6f) {
            float f11 = 1.0f - (f10 / 0.6f);
            return (1.0f - ((f11 * f11) * f11)) * 1.08f;
        }
        float f12 = (f10 - 0.6f) / 0.4f;
        return 1.08f - ((3.0f - (f12 * 2.0f)) * ((0.08f * f12) * f12));
    }

    public static void m(g gVar) {
        int i7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        int i11;
        if (gVar.f1193n == null) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i12 >= gVar.f1185e) {
                    break;
                }
                for (int i14 = 0; i14 < gVar.f1185e; i14++) {
                    int i15 = gVar.f1189j;
                    if (i14 < i15 || i14 >= (i11 = gVar.f1190k) || i12 < i15 || i12 >= i11) {
                        i13++;
                    }
                }
                i12++;
            }
            gVar.f1192m = i13;
            gVar.f1193n = new float[i13];
            gVar.f1194o = new float[i13];
            gVar.f1195p = new float[i13];
            gVar.f1196q = new boolean[i13];
            gVar.f1197r = new int[i13 * 4];
            float f14 = 1.4142f * ((i7 - 1) / 2.0f);
            int i16 = 0;
            for (int i17 = 0; i17 < gVar.f1185e; i17++) {
                int i18 = 0;
                while (true) {
                    int i19 = gVar.f1185e;
                    if (i18 < i19) {
                        int i20 = gVar.f1189j;
                        if (i18 < i20 || i18 >= (i10 = gVar.f1190k) || i17 < i20 || i17 >= i10) {
                            int i21 = (i19 * i17) + i18;
                            float f15 = gVar.f1188i[i21] * 3.17f;
                            float floor = f15 - ((float) Math.floor(f15));
                            boolean i22 = i(gVar, i18, i17);
                            float[] fArr = gVar.f1193n;
                            float f16 = gVar.f1187g;
                            float f17 = gVar.f1186f;
                            fArr[i16] = ((i18 + 0.5f) * f17) + f16;
                            gVar.f1194o[i16] = org.telegram.messenger.camera.q.b(i17, 0.5f, f17, f16);
                            float[] fArr2 = gVar.f1195p;
                            float hypot = (((float) Math.hypot(f11 - f10, f12 - f10)) / f14) * 0.5f;
                            if (i22) {
                                f13 = hypot * 0.85f;
                            } else {
                                f13 = hypot + (floor * 0.06f);
                            }
                            fArr2[i16] = f13;
                            gVar.f1196q[i16] = gVar.h[i21];
                            int[] iArr = gVar.f1197r;
                            int i23 = i16 * 4;
                            iArr[i23] = i18;
                            iArr[i23 + 1] = i17;
                            i16++;
                        }
                        i18++;
                    }
                }
            }
        }
    }

    public static void n(float[] fArr, float[] fArr2, int[] iArr, int i7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i10) {
        int i11 = i7 * 8;
        fArr[i11] = f10;
        int i12 = i11 + 1;
        fArr[i12] = f11;
        int i13 = i11 + 2;
        fArr[i13] = f12;
        int i14 = i11 + 3;
        fArr[i14] = f11;
        int i15 = i11 + 4;
        fArr[i15] = f12;
        int i16 = i11 + 5;
        fArr[i16] = f13;
        int i17 = i11 + 6;
        fArr[i17] = f10;
        int i18 = i11 + 7;
        fArr[i18] = f13;
        fArr2[i11] = f14;
        fArr2[i12] = f15;
        fArr2[i13] = f16;
        fArr2[i14] = f15;
        fArr2[i15] = f16;
        fArr2[i16] = f17;
        fArr2[i17] = f14;
        fArr2[i18] = f17;
        int i19 = i7 * 4;
        iArr[i19] = i10;
        iArr[i19 + 1] = i10;
        iArr[i19 + 2] = i10;
        iArr[i19 + 3] = i10;
    }

    public static float p(float f10) {
        double d = f10;
        double exp = Math.exp((-9.120752865260691d) * d);
        double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d * d;
        return (float) Math.min(1.0d, (1.0d - (((Math.sin(sqrt) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(sqrt)) * exp)) * 1.02d);
    }

    public static float q(float f10) {
        if (f10 <= 0.04045f) {
            return f10 / 12.92f;
        }
        return (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public final void a(g gVar) {
        this.f1212m = gVar;
        this.f1213n = null;
        this.f1216q = 2;
        this.f1214o = 0.0f;
        this.f1215p = 0L;
        this.E = 0L;
        this.F = false;
    }

    public final void e(android.graphics.Canvas r90, float r91, float r92, float r93) {
        throw new UnsupportedOperationException("Method not decompiled: ai.h.e(android.graphics.Canvas, float, float, float):void");
    }

    public final void f(Canvas canvas, g gVar, float f10, float f11, float f12, float f13) {
        int i7;
        int i10;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float x10;
        float l10;
        int i11;
        float f19;
        float f20;
        Paint paint;
        boolean z9;
        float f21;
        float y10;
        int i12;
        float f22;
        int i13;
        int i14;
        float f23 = f10;
        float f24 = f11;
        float f25 = f13;
        int i15 = this.f1216q;
        Paint paint2 = this.f1219t;
        RectF rectF = this.f1221w;
        int i16 = 1;
        if (i15 == 2) {
            m(gVar);
            int i17 = gVar.f1187g;
            int i18 = gVar.f1185e;
            g((i18 * i18) + (gVar.f1192m * 2));
            Bitmap bitmap = this.J;
            Bitmap bitmap2 = gVar.f1182a;
            Paint paint3 = this.K;
            if (bitmap != bitmap2) {
                Bitmap bitmap3 = gVar.f1182a;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
                this.J = gVar.f1182a;
            }
            float f26 = f12 / gVar.f1183b;
            float min = Math.min(1.0f, Math.max(0.0f, f25) / 0.1f);
            float f27 = gVar.f1186f * 0.5f;
            float f28 = 1.0f;
            boolean z10 = true;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i19 < gVar.f1192m) {
                float f29 = (f25 - gVar.f1195p[i19]) / 0.434f;
                if (f29 < 0.0f) {
                    f29 = 0.0f;
                } else if (f29 > f28) {
                    f29 = f28;
                }
                if (f29 < 0.5f) {
                    f20 = com.google.android.recaptcha.internal.a.D(f29, 4.0f, f29, f29);
                } else {
                    float f30 = (f29 * (-2.0f)) + 2.0f;
                    f20 = f28 - (((f30 * f30) * f30) * 0.5f);
                }
                float f31 = (gVar.f1193n[i19] * f26) + f23;
                float f32 = (gVar.f1194o[i19] * f26) + f24;
                if (gVar.f1196q[i19]) {
                    if (f20 > 0.75f) {
                        f22 = 4.0f * (f20 - 0.75f);
                    } else {
                        f22 = 0.0f;
                    }
                    paint = paint3;
                    if (f22 < f28) {
                        float B = com.google.android.recaptcha.internal.a.B(f20, 0.8f, 0.2f, f27 * f26);
                        int min2 = Math.min(7, (int) ((f20 * 7.0f) + 0.5f));
                        float f33 = (f28 - f22) * min;
                        if (f33 > 0.004f) {
                            n(this.L, this.M, this.P, i20, f31 - B, f32 - B, f31 + B, f32 + B, min2 * 48, gVar.d, i13 + 48, i14 + 48, (((int) (f33 * 255.0f)) << 24) | o());
                            i20++;
                        }
                        z10 = false;
                    }
                    if (f22 > 0.0f) {
                        int i22 = i19 * 4;
                        float f34 = i17;
                        int[] iArr = gVar.f1197r;
                        float f35 = gVar.f1186f;
                        float f36 = (iArr[i22] * f35) + f34;
                        float f37 = (iArr[i22 + 1] * f35) + f34;
                        float f38 = f36 + f35;
                        float f39 = f37 + f35;
                        n(this.N, this.O, this.Q, i21, (f36 * f26) + f23, (f37 * f26) + f24, (f38 * f26) + f23, (f39 * f26) + f24, f36, f37, f38, f39, (((int) (min * 255.0f)) << 24) | o());
                        i21++;
                    }
                } else {
                    paint = paint3;
                    if (f20 < f28) {
                        z9 = false;
                    } else {
                        z9 = z10;
                    }
                    float f40 = (f28 - f20) * 0.2f;
                    boolean z11 = z9;
                    if (f20 < 0.7f) {
                        f21 = f40;
                        y10 = f28;
                    } else {
                        f21 = f40;
                        y10 = k5.y(f20, 0.7f, 0.3f, f28);
                    }
                    float f41 = 0.9f * min * y10;
                    if (f21 > 0.01f && f41 > 0.004f) {
                        float f42 = f27 * f26 * f21;
                        n(this.L, this.M, this.P, i20, f31 - f42, f32 - f42, f31 + f42, f32 + f42, 0.0f, gVar.d, 48.0f, i12 + 48, (((int) (f41 * 255.0f)) << 24) | o());
                        z10 = z11;
                        i20++;
                    } else {
                        z10 = z11;
                    }
                }
                i19++;
                f25 = f13;
                paint3 = paint;
                f28 = 1.0f;
            }
            Paint paint4 = paint3;
            float max = 1.0f - Math.max(0.0f, Math.min(1.0f, (f13 - 0.05f) / 0.45f));
            float x11 = org.telegram.ui.Cells.f1.x(max, max, max, 1.0f);
            if (x11 > 0.0f) {
                int i23 = gVar.f1189j;
                while (i23 < gVar.f1190k) {
                    int i24 = gVar.f1189j;
                    int i25 = i21;
                    while (i24 < gVar.f1190k) {
                        if (!gVar.h[(gVar.f1185e * i23) + i24]) {
                            f19 = x11;
                        } else {
                            float f43 = i17;
                            float f44 = gVar.f1186f;
                            float f45 = (i24 * f44) + f43;
                            float f46 = (i23 * f44) + f43;
                            f19 = x11;
                            float f47 = f45 + f44;
                            float f48 = f46 + f44;
                            n(this.N, this.O, this.Q, i25, (f45 * f26) + f23, (f46 * f26) + f24, (f47 * f26) + f23, (f48 * f26) + f24, f45, f46, f47, f48, (((int) ((min * 255.0f) * f19)) << 24) | o());
                            i25++;
                        }
                        i24++;
                        x11 = f19;
                    }
                    i23++;
                    i21 = i25;
                }
            }
            if (z10 && min >= 1.0f) {
                rectF.set(f23, f24, f23 + f12, f24 + f12);
                canvas.drawBitmap(gVar.f1182a, gVar.f1184c, rectF, paint2);
                return;
            }
            if (i20 > 0) {
                int i26 = i21 * 8;
                int i27 = i20 * 8;
                System.arraycopy(this.L, 0, this.N, i26, i27);
                System.arraycopy(this.M, 0, this.O, i26, i27);
                System.arraycopy(this.P, 0, this.Q, i21 * 4, i20 * 4);
            }
            int i28 = i21 + i20;
            if (i28 > 0) {
                canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i28 * 8, this.N, 0, this.O, 0, this.Q, 0, this.R, 0, i28 * 6, paint4);
                return;
            }
            return;
        }
        int i29 = 0;
        float f49 = 2.0f;
        float f50 = 0.05f;
        int i30 = gVar.f1183b;
        int i31 = gVar.f1187g;
        float f51 = f12 / i30;
        float f52 = (gVar.f1185e - 1) / 2.0f;
        float f53 = 1.4142f * f52;
        int i32 = 0;
        while (i32 < gVar.f1185e) {
            int i33 = i29;
            while (true) {
                int i34 = gVar.f1185e;
                if (i33 < i34) {
                    int i35 = (i34 * i32) + i33;
                    if (!gVar.h[i35] || i(gVar, i33, i32)) {
                        f14 = f51;
                        f15 = f52;
                        f16 = f53;
                        f17 = f24;
                        f18 = f23;
                    } else {
                        float f54 = i33;
                        float f55 = i32;
                        float c10 = (f13 - ((gVar.f1188i[i35] * 0.06f) + com.google.android.recaptcha.internal.a.c((float) Math.hypot(f54 - f52, f55 - f52), f53, 0.52f, f50))) / 0.367f;
                        if (c10 > 0.0f) {
                            if (c10 >= 1.0f) {
                                x10 = 1.0f;
                            } else {
                                float f56 = 1.0f - c10;
                                x10 = org.telegram.ui.Cells.f1.x(f56, f56, f56, 1.0f);
                            }
                            if (this.f1216q == 2) {
                                l10 = (0.6f * x10) + 0.4f;
                            } else {
                                l10 = l(c10);
                            }
                            if (this.f1216q != 2) {
                                x10 = Math.min(1.0f, c10 * 6.0f);
                            }
                            int i36 = gVar.f1189j;
                            if (i33 < i36 || i33 >= (i11 = gVar.f1190k) || i32 < i36 || i32 >= i11) {
                                float f57 = i31;
                                float f58 = gVar.f1186f;
                                int i37 = (int) ((f54 * f58) + f57);
                                int i38 = (int) ((f55 * f58) + f57);
                                float f59 = l10;
                                float f60 = f52;
                                f16 = f53;
                                int ceil = (int) Math.ceil(((i33 + 1) * f58) + f57);
                                int ceil2 = (int) Math.ceil(((i32 + 1) * gVar.f1186f) + f57);
                                Rect rect = this.v;
                                rect.set(i37, i38, ceil, ceil2);
                                f15 = f60;
                                float f61 = f49;
                                f18 = f10;
                                float c11 = com.google.android.recaptcha.internal.a.c(i37 + ceil, f61, f51, f18);
                                f17 = f11;
                                float c12 = com.google.android.recaptcha.internal.a.c(i38 + ceil2, f61, f51, f17);
                                float f62 = ((ceil - i37) / f61) * f51 * f59;
                                float f63 = ((ceil2 - i38) / f61) * f51 * f59;
                                f14 = f51;
                                rectF.set(c11 - f62, c12 - f63, c11 + f62, c12 + f63);
                                paint2.setAlpha((int) (x10 * 255.0f));
                                g gVar2 = this.f1213n;
                                canvas.drawBitmap(gVar.f1182a, rect, rectF, paint2);
                                paint2.setAlpha(255);
                            }
                        }
                        f18 = f10;
                        f14 = f51;
                        f15 = f52;
                        f16 = f53;
                        f17 = f11;
                    }
                    i33++;
                    f23 = f18;
                    f24 = f17;
                    f51 = f14;
                    f53 = f16;
                    f52 = f15;
                    f49 = 2.0f;
                    f50 = 0.05f;
                }
            }
            i32++;
            f24 = f24;
            f52 = f52;
            i29 = 0;
            f49 = 2.0f;
            f50 = 0.05f;
        }
        float f64 = f24;
        float f65 = f23;
        float f66 = f12 / gVar.f1183b;
        int i39 = 0;
        while (i39 < 3) {
            if (i39 == i16) {
                i7 = gVar.f1185e - 7;
            } else {
                i7 = 0;
            }
            if (i39 == 2) {
                i10 = gVar.f1185e - 7;
            } else {
                i10 = 0;
            }
            float f67 = f13 / 0.32f;
            if (f67 > 0.0f) {
                float f68 = i31;
                float f69 = gVar.f1186f;
                float f70 = (((i7 * f69) + f68) * f66) + f65;
                float f71 = (((i10 * f69) + f68) * f66) + f64;
                float f72 = ((((i7 + 7) * f69) + f68) * f66) + f65;
                float f73 = ((((i10 + 7) * f69) + f68) * f66) + f64;
                float l11 = l(f67);
                canvas.save();
                canvas.scale(l11, l11, (f70 + f72) / 2.0f, (f71 + f73) / 2.0f);
                canvas.clipRect(f70 - 1.0f, f71 - 1.0f, f72 + 1.0f, f73 + 1.0f);
                rectF.set(f65, f64, f65 + f12, f64 + f12);
                paint2.setAlpha(255);
                canvas.drawBitmap(gVar.f1182a, gVar.f1184c, rectF, paint2);
                canvas.restore();
            }
            i39++;
            i16 = 1;
        }
        paint2.setAlpha(255);
    }

    public final void g(int i7) {
        float[] fArr = this.L;
        if (fArr == null || fArr.length < i7 * 8) {
            int i10 = i7 * 8;
            this.L = new float[i10];
            this.M = new float[i10];
            int i11 = i7 * 4;
            this.P = new int[i11];
            this.N = new float[i10];
            this.O = new float[i10];
            this.Q = new int[i11];
            this.R = new short[i7 * 6];
            for (int i12 = 0; i12 < i7; i12++) {
                int i13 = i12 * 4;
                short[] sArr = this.R;
                int i14 = i12 * 6;
                short s5 = (short) i13;
                sArr[i14] = s5;
                sArr[i14 + 1] = (short) (i13 + 1);
                short s9 = (short) (i13 + 2);
                sArr[i14 + 2] = s9;
                sArr[i14 + 3] = s5;
                sArr[i14 + 4] = s9;
                sArr[i14 + 5] = (short) (i13 + 3);
            }
        }
    }

    public final int o() {
        return this.f1223y & 16777215;
    }
}
