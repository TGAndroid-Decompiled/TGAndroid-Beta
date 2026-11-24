package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.LruCache;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
public final class jmc {
    public static volatile boolean j0;
    public static Bitmap[] m0;
    public static Bitmap[][] n0;
    public PorterDuffColorFilter A;
    public int B;
    public PorterDuffColorFilter C;
    public final RectF M;
    public Bitmap Q;
    public final Context R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public float X;
    public float Z;
    public final Runnable a;
    public float a0;
    public SweepGradient c0;
    public final SweepGradient d0;
    public final ComposeShader e0;
    public int f0;
    public boolean i0;
    public float q;
    public boolean r;
    public final SweepGradient v;
    public final SweepGradient w;
    public final ComposeShader y;
    public int z;
    public static final AtomicBoolean k0 = new AtomicBoolean();
    public static final do3 l0 = new do3("walletCardAssets", 10);
    public static final int[] o0 = {-16748837, -16747809, -16746781, -16745754, -16744728, -16743955, -16743183, -16742412, -16741643};
    public static final LruCache p0 = new LruCache(2);
    public final Paint b = new Paint(3);
    public final Paint c = new Paint(3);
    public final Paint d = new Paint(1);
    public final Matrix e = new Matrix();
    public final RectF f = new RectF(0.0f, 0.0f, 336.0f, 205.0f);
    public final RectF g = new RectF();
    public final RectF h = new RectF(-42.0f, -107.5f, 378.0f, 312.5f);
    public final float[] i = new float[152];
    public final float[] j = new float[152];
    public final float[] k = new float[152];
    public final float[] l = new float[152];
    public final float[] m = new float[76];
    public final float[] n = new float[76];
    public final int[] o = new int[76];
    public final Path p = new Path();
    public final Path s = new Path();
    public final Path t = new Path();
    public final Path u = new Path();
    public final Shader[] x = new Shader[2];
    public final int[] D = new int[2];
    public final Shader[] E = new Shader[2];
    public final SweepGradient[] F = new SweepGradient[2];
    public final boolean[] G = new boolean[2];
    public final int[][] H = new int[2];
    public final PorterDuffColorFilter[][] I = (PorterDuffColorFilter[][]) Array.newInstance(PorterDuffColorFilter.class, 2, 8);
    public final int[] J = {0, 0};
    public final int[] K = {0, 0};
    public final float[][] L = (float[][]) Array.newInstance(Float.TYPE, 22, 6);
    public final int[] N = new int[65];
    public final Bitmap[] O = new Bitmap[8];
    public final Bitmap[] P = new Bitmap[8];
    public float Y = 1.0f;
    public float b0 = 1.0f;
    public int g0 = -14456619;
    public int h0 = -14184457;

    public jmc(Context context, int i, int i2, Runnable runnable) {
        double d;
        int i3;
        boolean z;
        float f;
        double d2;
        int i4;
        float f2;
        int i5 = 3;
        boolean z2 = true;
        float f3 = 336.0f;
        float f4 = 205.0f;
        int i6 = 2;
        int i7 = 8;
        int i8 = 0;
        char c = 6;
        float f5 = 1.0f;
        this.a = runnable;
        this.R = context;
        int i9 = 0;
        while (i9 < 4) {
            float f6 = i9 < i6 ? 310.8f : 25.2f;
            int i10 = i8;
            if (i9 == 0 || i9 == i5) {
                i4 = i5;
                f2 = 25.368736f;
            } else {
                i4 = i5;
                f2 = 179.63126f;
            }
            char c2 = c;
            float f7 = f5;
            int i11 = i10;
            while (i11 <= 18) {
                double radians = Math.toRadians((i11 * 5) + ((i9 * 90) - 90));
                int i12 = i7;
                float cos = (float) Math.cos(radians);
                float sin = (float) Math.sin(radians);
                float[] fArr = this.i;
                int i13 = ((i9 * 19) + i11) << 1;
                fArr[i13] = b00.y(cos, 25.2f, f6, 336.0f);
                int i14 = i13 + 1;
                fArr[i14] = b00.y(25.368736f, sin, f2, 205.0f);
                float[] fArr2 = this.j;
                fArr2[i13] = cos;
                fArr2[i14] = sin;
                i11++;
                i7 = i12;
            }
            i9++;
            i8 = i10;
            i5 = i4;
            c = c2;
            f5 = f7;
            i6 = 2;
        }
        int i15 = i5;
        int i16 = i7;
        int i17 = i8;
        char c3 = c;
        float f8 = f5;
        float f9 = 336.0f - i2;
        this.M = new RectF(f9 - 48.0f, 74.0f, f9, 110.0f);
        if (m0 == null) {
            String[] strArr = {"finish_light", "finish_dark", "groove_along", "groove_across", "qr_brush_light", "qr_brush_dark", "grain"};
            m0 = new Bitmap[7];
            for (int i18 = i17; i18 < 7; i18++) {
                try {
                    InputStream open = context.getAssets().open("wallet_card_2d/" + strArr[i18] + ".webp");
                    m0[i18] = BitmapFactory.decodeStream(open);
                    Bitmap bitmap = m0[i18];
                    if (bitmap != null) {
                        bitmap.prepareToDraw();
                    }
                    if (open != null) {
                        open.close();
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
        if (n0 == null) {
            int[] iArr = new int[2];
            iArr[1] = i16;
            iArr[i17] = 2;
            Bitmap[][] bitmapArr = (Bitmap[][]) Array.newInstance(Bitmap.class, iArr);
            int i19 = i17;
            for (int i20 = 2; i19 < i20; i20 = 2) {
                int i21 = i16;
                for (int i22 = i17; i22 < i21; i22++) {
                    try {
                        InputStream open2 = context.getAssets().open("wallet_card_2d/face_" + i19 + "_" + i22 + ".webp");
                        bitmapArr[i19][i22] = BitmapFactory.decodeStream(open2);
                        Bitmap bitmap2 = bitmapArr[i19][i22];
                        if (bitmap2 != null) {
                            bitmap2.prepareToDraw();
                        }
                        if (open2 != null) {
                            open2.close();
                        }
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                }
                i19++;
                i16 = i21;
            }
            n0 = bitmapArr;
        }
        int[] iArr2 = new int[129];
        int[] iArr3 = new int[129];
        int i23 = i17;
        while (true) {
            d = 128.0d;
            i3 = 128;
            z = z2;
            if (i23 > 128) {
                break;
            }
            float f10 = f3;
            double d3 = ((i23 * 3.141592653589793d) * 2.0d) / 128.0d;
            iArr2[i23] = Color.argb(Math.round(((float) Math.pow(Math.pow(Math.sin(d3) / 0.64d, 2.0d) + 1.0d, -2.0d)) * 64.0f), 255, 255, 255);
            iArr3[i23] = Color.argb(Math.round(l(0.18f, 0.88f, (float) Math.abs(Math.cos(Math.atan2(Math.sin(d3) / 2.0d, Math.cos(d3))))) * 255.0f), 255, 255, 255);
            i23++;
            z2 = z ? 1 : 0;
            f3 = f10;
            f4 = f4;
        }
        float f11 = f3;
        float f12 = f4;
        this.v = new SweepGradient(168.0f, 102.5f, iArr2, (float[]) null);
        SweepGradient sweepGradient = new SweepGradient(168.0f, 102.5f, iArr3, (float[]) null);
        this.w = sweepGradient;
        if (m0[c3] != null) {
            Bitmap bitmap3 = m0[c3];
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
            f = 0.88f;
            this.e.setScale(f11 / m0[c3].getWidth(), f12 / m0[c3].getHeight());
            bitmapShader.setLocalMatrix(this.e);
            this.y = new ComposeShader(bitmapShader, sweepGradient, PorterDuff.Mode.DST_IN);
        } else {
            f = 0.88f;
        }
        int i24 = i17;
        while (i24 < 2) {
            if (m0[i24] != null) {
                Bitmap bitmap4 = m0[i24];
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                d2 = d;
                this.e.setScale(f11 / m0[i24].getWidth(), f12 / m0[i24].getHeight());
                bitmapShader2.setLocalMatrix(this.e);
                this.x[i24] = new ComposeShader(bitmapShader2, this.w, PorterDuff.Mode.DST_IN);
            } else {
                d2 = d;
            }
            int i25 = i24 + 2;
            if (m0[i25] != null) {
                Bitmap bitmap5 = m0[i25];
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader3 = new BitmapShader(bitmap5, tileMode3, tileMode3);
                this.e.setScale(f11 / m0[i25].getWidth(), f12 / m0[i25].getHeight());
                bitmapShader3.setLocalMatrix(this.e);
                int[] iArr4 = new int[129];
                int i26 = i17;
                while (i26 <= i3) {
                    double d4 = ((i26 * 3.141592653589793d) * 2.0d) / d2;
                    float abs = (float) Math.abs(Math.cos(Math.atan2(Math.sin(d4) / 2.0d, Math.cos(d4))));
                    float l = l(0.21814324f, 0.9293131f, abs);
                    float f13 = abs * abs;
                    if (i24 != 0) {
                        f13 = f8 - f13;
                    }
                    iArr4[i26] = a(l * f13, -1);
                    i26++;
                    i3 = 128;
                }
                this.F[i24] = new SweepGradient(168.0f, 102.5f, iArr4, (float[]) null);
                this.E[i24] = new ComposeShader(bitmapShader3, this.F[i24], PorterDuff.Mode.DST_IN);
            }
            i24++;
            d = d2;
            i3 = 128;
        }
        this.c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        this.d.setStyle(Paint.Style.STROKE);
        Random random = new Random(24560118926758988L);
        int i27 = i17;
        while (i27 < this.L.length) {
            float f14 = -1.0f;
            int i28 = i17;
            while (true) {
                if (i28 < (i27 == 0 ? z ? 1 : 0 : 32)) {
                    float nextFloat = random.nextFloat() * f11;
                    float nextFloat2 = random.nextFloat() * f12;
                    float f15 = Float.MAX_VALUE;
                    for (int i29 = i17; i29 < i27; i29++) {
                        float abs2 = Math.abs(nextFloat - this.L[i29][i17]);
                        float abs3 = Math.abs(nextFloat2 - this.L[i29][z ? 1 : 0]);
                        float min = Math.min(abs2, f11 - abs2);
                        float min2 = Math.min(abs3, f12 - abs3);
                        f15 = Math.min(f15, (min2 * min2) + (min * min));
                    }
                    if (f15 > f14) {
                        float[] fArr3 = this.L[i27];
                        fArr3[i17] = nextFloat;
                        fArr3[z ? 1 : 0] = nextFloat2;
                        f14 = f15;
                    }
                    i28++;
                }
            }
            this.L[i27][2] = (((random.nextFloat() * 6.0f) + f8) * f11) / 512.0f;
            double nextFloat3 = random.nextFloat() * 3.141592653589793d * 2.0d;
            float e3 = ug8.e(random, 0.45f, 0.05f);
            float sqrt = f8 / ((float) Math.sqrt((e3 * e3) + f8));
            this.L[i27][i15] = ((float) Math.cos(nextFloat3)) * e3 * sqrt;
            this.L[i27][4] = ((float) Math.sin(nextFloat3)) * e3 * sqrt;
            this.L[i27][5] = sqrt;
            i27++;
        }
        int[] iArr5 = new int[65];
        for (int i30 = i17; i30 <= 64; i30++) {
            iArr5[i30] = a((((float) Math.pow(Math.abs(Math.cos(((i30 * 3.141592653589793d) * 2.0d) / 64.0d)), 8.0d)) * f) + 0.12f, -1);
        }
        SweepGradient sweepGradient2 = new SweepGradient(this.M.centerX(), this.M.centerY(), iArr5, (float[]) null);
        this.d0 = sweepGradient2;
        if (m0[4] != null) {
            Bitmap bitmap6 = m0[4];
            Shader.TileMode tileMode4 = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader4 = new BitmapShader(bitmap6, tileMode4, tileMode4);
            this.e.setScale(this.M.width() / m0[4].getWidth(), this.M.height() / m0[4].getHeight());
            Matrix matrix = this.e;
            RectF rectF = this.M;
            matrix.postTranslate(rectF.left, rectF.top);
            bitmapShader4.setLocalMatrix(this.e);
            this.e0 = new ComposeShader(bitmapShader4, sweepGradient2, PorterDuff.Mode.DST_IN);
        }
        f(h(context, i));
        this.f0 = i;
        k(0.0f, 0.0f);
        j0 = z;
    }

    public static int a(float f, int i) {
        return bm2.o(i, Math.round(c(f) * 255.0f));
    }

    public static float c(float f) {
        return Math.max(0.0f, Math.min(1.0f, f));
    }

    public static int d(float f, float f2, float f3, int i, int i2) {
        float f4 = f3 * 255.0f;
        return Color.rgb(Math.min(255, Math.round((Color.red(i2) * f2) + (Color.red(i) * f) + f4)), Math.min(255, Math.round((Color.green(i2) * f2) + (Color.green(i) * f) + f4)), Math.min(255, Math.round((Color.blue(i2) * f2) + (Color.blue(i) * f) + f4)));
    }

    public static float g(int i) {
        float f = i / 255.0f;
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4d);
    }

    public static Bitmap[] h(Context context, int i) {
        String str;
        StringBuilder sb;
        int i2;
        String sb2;
        Integer valueOf = Integer.valueOf(i);
        LruCache lruCache = p0;
        Bitmap[] bitmapArr = (Bitmap[]) lruCache.get(valueOf);
        if (bitmapArr != null) {
            return bitmapArr;
        }
        if (i == 2131232816) {
            str = "qr";
        } else if (i == 2131232815) {
            str = "info";
        } else {
            w26.j(de9.k(i, "Missing packaged wallet icon: "));
            return null;
        }
        Bitmap[] bitmapArr2 = new Bitmap[17];
        for (int i3 = 0; i3 < 17; i3++) {
            if (i3 == 0) {
                sb2 = "mask";
            } else {
                if (i3 <= 8) {
                    sb = new StringBuilder("light_");
                    i2 = i3 - 1;
                } else {
                    sb = new StringBuilder("dark_");
                    i2 = i3 - 9;
                }
                sb.append(i2);
                sb2 = sb.toString();
            }
            try {
                InputStream open = context.getAssets().open("wallet_card_2d/icon_" + str + "_" + sb2 + ".webp");
                Bitmap decodeStream = BitmapFactory.decodeStream(open);
                bitmapArr2[i3] = decodeStream;
                if (decodeStream != null) {
                    decodeStream.prepareToDraw();
                    if (open != null) {
                        open.close();
                    }
                } else {
                    throw new IllegalStateException("Invalid wallet icon texture");
                }
            } catch (IOException e) {
                k93.h("Missing wallet icon texture", e);
                return null;
            }
        }
        lruCache.put(Integer.valueOf(i), bitmapArr2);
        return bitmapArr2;
    }

    public static float i(float f, float f2, float f3) {
        return tb4.A(f2, f, f3, f);
    }

    public static float l(float f, float f2, float f3) {
        float c = c((f3 - f) / (f2 - f));
        return yjb.B(c, 2.0f, 3.0f, c * c);
    }

    public final void b(Canvas canvas, Bitmap bitmap, RectF rectF, int i) {
        if (bitmap == null) {
            return;
        }
        Paint paint = this.b;
        paint.setAlpha(i);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
        paint.setAlpha(255);
    }

    public final void e(android.graphics.Canvas r35, float[] r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmc.e(android.graphics.Canvas, float[]):void");
    }

    public final void f(Bitmap[] bitmapArr) {
        this.Q = bitmapArr[0];
        System.arraycopy(bitmapArr, 1, this.O, 0, 8);
        System.arraycopy(bitmapArr, 9, this.P, 0, 8);
    }

    public final void j(int i) {
        if (i == this.f0) {
            return;
        }
        this.f0 = i;
        Bitmap[] bitmapArr = (Bitmap[]) p0.get(Integer.valueOf(i));
        if (bitmapArr != null) {
            f(bitmapArr);
            return;
        }
        l0.postRunnable(new on7(this, i, (byte) 25));
    }

    public final void k(float f, float f2) {
        float f3;
        float f4;
        SweepGradient[] sweepGradientArr;
        if (this.i0 && this.S == f && this.T == f2) {
            return;
        }
        this.i0 = true;
        this.S = f;
        this.T = f2;
        double d = f;
        double radians = Math.toRadians(d);
        double radians2 = Math.toRadians(f2);
        float sin = (float) (Math.sin(radians2) * Math.cos(radians));
        float sin2 = (float) Math.sin(radians);
        float cos = (float) (Math.cos(radians2) * Math.cos(radians));
        this.W = (float) ((sin * 0.83d) + (Math.cos(radians2) * 0.175d));
        this.X = 0.83f * sin2;
        float sin3 = (float) ((cos * 0.83d) + (Math.sin(radians2) * (-0.175d)));
        this.Y = sin3;
        float f5 = this.W;
        float f6 = this.X;
        float f7 = sin3 * sin3;
        float sqrt = (float) Math.sqrt(f7 + (f6 * f6) + (f5 * f5));
        float f8 = this.W / sqrt;
        this.W = f8;
        float f9 = this.X / sqrt;
        this.X = f9;
        float f10 = this.Y / sqrt;
        this.Y = f10;
        this.Z = f8 + sin;
        this.a0 = f9 + sin2;
        float f11 = f10 + cos;
        this.b0 = f11;
        float f12 = f11 * f11;
        float sqrt2 = (float) Math.sqrt(f12 + (f4 * f4) + (f3 * f3));
        this.Z /= sqrt2;
        this.a0 /= sqrt2;
        this.b0 /= sqrt2;
        this.U = (float) Math.toRadians(((f2 * 2.0f) + 1.72d) - (d * 1.25d));
        float f13 = (this.a0 * 4.0f) + ((this.Z - 0.103713065f) * (-2.0f));
        this.V = f13;
        Matrix matrix = this.e;
        matrix.setRotate((float) Math.toDegrees(f13), 168.0f, 102.5f);
        this.v.setLocalMatrix(matrix);
        this.w.setLocalMatrix(matrix);
        for (SweepGradient sweepGradient : this.F) {
            if (sweepGradient != null) {
                sweepGradient.setLocalMatrix(matrix);
            }
        }
        float cos2 = (float) Math.cos(radians);
        float sin4 = (float) Math.sin(radians);
        float cos3 = (float) Math.cos(radians2);
        float f14 = -((float) Math.sin(radians2));
        float f15 = (f14 * cos) + ((-cos3) * sin);
        float v = oo1.v(sin4, cos3, cos, (((-sin4) * f14) * sin) - (cos2 * sin2));
        float w = b00.w(cos2, cos3, cos, ((f14 * cos2) * sin) - (sin4 * sin2));
        double d2 = v;
        double d3 = w;
        float c = c((((((float) Math.pow(Math.max(0.0d, (d3 * 0.68d) + ((0.12d * d2) + (f15 * 0.72d))), 31.15d)) * 0.7832f) + ((((float) Math.pow(Math.max(0.0d, (d3 * 0.72d) + ((0.46d * d2) + ((-f15) * 0.52d))), 16.55d)) * 2.5191f) + ((((float) Math.pow(Math.max(0.0d, (0.571d * d3) + (d2 * 0.821d)), 4.65d)) * 0.1133f) + ((((float) Math.pow(Math.max(0.0d, (0.9757d * d3) + (0.2191d * d2)), 3.365d)) * 0.2556f) + i(0.061f, 0.356f, l(-0.45f, 0.72f, v)))))) - 0.12f) / 1.8f);
        float i = i(0.25f, 2.2f, c);
        float i2 = i(0.9f, 1.2f, c) * 0.35f;
        int i3 = 0;
        while (true) {
            int[] iArr = this.N;
            if (i3 < iArr.length) {
                double abs = Math.abs(Math.cos(((i3 * 3.141592653589793d) * 2.0d) / 64.0d));
                double d4 = abs * 0.65d * abs;
                double c2 = ((c(this.Y) * 0.35d) + 0.65d) * ((Math.pow(abs, 22.0d) * 13.0d) + d4 + (((0.4d * abs * abs) + 0.72d) * i)) * 6.0d;
                float i4 = i(i2, 1.0f, (float) Math.pow(c2 / (1.0d + c2), 0.9545454545454545d));
                iArr[i3] = Color.rgb(Math.round(0.992f * i4 * 255.0f), Math.round(0.996f * i4 * 255.0f), Math.round(i4 * 255.0f));
                i3++;
            } else {
                RectF rectF = this.M;
                this.c0 = new SweepGradient(rectF.centerX(), rectF.centerY(), iArr, (float[]) null);
                matrix.setRotate((float) Math.toDegrees(this.V), rectF.centerX(), rectF.centerY());
                this.c0.setLocalMatrix(matrix);
                this.d0.setLocalMatrix(matrix);
                return;
            }
        }
    }
}
