package defpackage;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.os.Build;
import java.lang.reflect.Array;
import java.util.Random;
public final class znc {
    public static final int[] x = {-13669377, -13384961, -11887617};
    public final Object a;
    public float c;
    public long d;
    public long e;
    public float p;
    public final Paint t;
    public long u;
    public final float[] v;
    public float w;
    public final Paint b = new Paint();
    public final float[] f = new float[160];
    public final float[] g = new float[160];
    public final float[] h = new float[160];
    public final float[] i = new float[160];
    public final float[] j = new float[160];
    public final float[] k = new float[160];
    public final float[] l = new float[160];
    public final int[] m = new int[160];
    public final int[] n = new int[160];
    public final boolean[] o = new boolean[160];
    public final Random q = new Random();
    public final float[][] r = (float[][]) Array.newInstance(Float.TYPE, 18, 320);
    public final int[] s = new int[18];

    public znc() {
        BlendMode blendMode;
        BlendMode blendMode2;
        Paint paint = new Paint(1);
        this.t = paint;
        this.v = new float[2];
        paint.setStrokeCap(Paint.Cap.ROUND);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            blendMode2 = BlendMode.PLUS;
            paint.setBlendMode(blendMode2);
        }
        this.w = 1.0f;
        if (i >= 33) {
            try {
                fn3.c();
                Shader runtimeShader = new RuntimeShader("uniform float2 uSize;\nuniform float2 uOrigin;\nuniform float uRadius;\nuniform float uDp;\nuniform float uTime;\nuniform float uK;\nuniform float uLv;\nuniform float uB;\nuniform float3 uC0;\nuniform float3 uC1;\nuniform float3 uC2;\nfloat sdRound(float2 p, float2 b, float r) {\n  float2 q = abs(p) - b + r;\n  return length(max(q, 0.0)) + min(max(q.x, q.y), 0.0) - r;\n}\nfloat3 pal(float x) {\n  float3 c = mix(uC0, uC1, 0.5 + 0.5 * sin(6.2832 * x));\n  float v = fract(x * 0.37 + uTime * 0.03) - 0.5;\n  return mix(c, uC2, 0.8 * exp(-v * v / 0.0072));\n}\nhalf4 main(float2 fc) {\n  float2 hs = uSize * 0.5;\n  float2 p = fc - (uOrigin + hs);\n  float R = min(uRadius, hs.y);\n  float d = sdRound(p, hs, R);\n  if (abs(d) > 24.0 * uDp) return half4(0.0);\n  float cr = hs.x - R;\n  float s0 = p.x > cr ? R * atan(abs(p.y), p.x - cr) : R * 1.5708 + (cr - p.x);\n  float sb = uB >= cr ? 0.0 : R * 1.5708 + (cr - uB);\n  float s = s0 >= sb ? s0 - sb : (sb - s0) * 3.0;\n  float L = uSize.x;\n  float fadeLen = (0.55 + 0.15 * uLv) * L;\n  float decay = 1.0 - smoothstep(0.0, fadeLen, s);\n  float pn = 1.0 - smoothstep(0.0, 0.4 * L, s);\n  float2 hp = p - float2(min(uB, hs.x), 0.0);\n  float halo = (0.18 + 0.4 * uLv) * exp(-dot(hp, hp) / (196.0 * uDp * uDp));\n  if (decay <= 0.0 && halo < 0.002) return half4(0.0);\n  float ad = abs(d);\n  float core = exp(-ad / ((0.75 + 0.35 * pn) * uDp));\n  float glow = (0.3 + 0.45 * pn) * exp(-ad / ((2.0 + 3.0 * pn) * uDp));\n  float a = min(1.0, core + glow) * max(decay, 0.0) * (0.2 + 0.25 * pn + (0.8 - 0.25 * pn) * uLv) * (1.0 + 0.9 * pn) * uK;\n  a += halo * uK;\n  float3 col = pal(s / max(fadeLen, 1.0) * 0.6 + uTime * 0.04);\n  a = min(a, 0.85 / max(max(col.r, col.g), max(col.b, 0.001)));\n  return half4(half3(col * a), half(a));\n}\n");
                for (int i2 = 0; i2 < 3; i2++) {
                    int i3 = x[i2];
                    runtimeShader.setFloatUniform("uC" + i2, ((i3 >> 16) & 255) / 255.0f, ((i3 >> 8) & 255) / 255.0f, (i3 & 255) / 255.0f);
                }
                this.a = runtimeShader;
                this.b.setShader(runtimeShader);
                Paint paint2 = this.b;
                blendMode = BlendMode.PLUS;
                paint2.setBlendMode(blendMode);
            } catch (Throwable unused) {
                this.a = null;
            }
        }
    }

    public static float b(float f, float f2) {
        float max = Math.max(0.0f, Math.min(1.0f, (f2 - 0.0f) / (f - 0.0f)));
        return xnb.B(max, 2.0f, 3.0f, max * max);
    }

    public final void a(Canvas canvas, RectF rectF, float f, float f2, long j, float f3) {
        float min;
        float f4;
        float f5;
        boolean z;
        int[] iArr;
        float[][] fArr;
        int i;
        int i2;
        float f6;
        float f7;
        int i3;
        float f8;
        int i4;
        float[] fArr2;
        float f9;
        int i5;
        Random random;
        Object obj = this.a;
        if (obj != null && Build.VERSION.SDK_INT >= 33 && f2 > 0.003f) {
            float f10 = 0.0f;
            if (rectF.width() > 0.0f) {
                float f11 = hl.p;
                RuntimeShader runtimeShader = (RuntimeShader) obj;
                runtimeShader.setFloatUniform("uSize", rectF.width(), rectF.height());
                runtimeShader.setFloatUniform("uOrigin", rectF.left, rectF.top);
                runtimeShader.setFloatUniform("uRadius", Math.min(f, rectF.height() / 2.0f));
                runtimeShader.setFloatUniform("uDp", f11);
                runtimeShader.setFloatUniform("uTime", ((float) ((j - this.e) % 3600000)) / 1000.0f);
                runtimeShader.setFloatUniform("uK", f2);
                runtimeShader.setFloatUniform("uLv", this.c);
                runtimeShader.setFloatUniform("uB", Math.min(0.0f, f3) + (rectF.width() / 2.0f));
                float f12 = 24.0f * f11;
                canvas.drawRect(rectF.left - f12, rectF.top - f12, rectF.right + f12, rectF.bottom + f12, this.b);
                float min2 = Math.min(f, rectF.height() / 2.0f);
                long j2 = this.u;
                if (j2 == 0) {
                    min = 0.0f;
                } else {
                    min = Math.min(0.05f, ((float) (j - j2)) / 1000.0f);
                }
                this.u = j;
                float width = rectF.width();
                float z2 = xnb.z(this.c, 0.15f, 0.55f, width);
                float f13 = 1.0f;
                this.w = Math.max(1.0f, width);
                float f14 = this.c;
                int i6 = (f14 > 0.06f ? 1 : (f14 == 0.06f ? 0 : -1));
                int i7 = 160;
                boolean[] zArr = this.o;
                if (i6 > 0 && min > 0.0f) {
                    f4 = 0.3f;
                    this.p = c00.x(f14, 110.0f, min, this.p);
                    while (true) {
                        float f15 = this.p;
                        if (f15 < 1.0f) {
                            break;
                        }
                        this.p = f15 - 1.0f;
                        int i8 = 0;
                        while (true) {
                            if (i8 < 160) {
                                if (!zArr[i8]) {
                                    break;
                                }
                                i8++;
                            } else {
                                i8 = -1;
                                break;
                            }
                        }
                        if (i8 >= 0) {
                            float f16 = 0.0f;
                            float f17 = 0.0f;
                            int i9 = 0;
                            while (true) {
                                random = this.q;
                                if (i9 >= 6) {
                                    break;
                                }
                                f16 = random.nextFloat() * z2;
                                f17 = 1.0f - b(z2, f16);
                                if (random.nextFloat() < f17) {
                                    break;
                                }
                                i9++;
                            }
                            float f18 = f17;
                            c(f16, f18, f11, i8);
                            if (random.nextFloat() < (1.0f - b(this.w * 0.3f, f16)) * 0.5f) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= 160) {
                                        break;
                                    } else if (!zArr[i10]) {
                                        c(((random.nextFloat() - 0.5f) * 4.0f * f11) + f16, f18, f11, i10);
                                        break;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                        }
                    }
                    f5 = 0.5f;
                    z = false;
                } else {
                    f4 = 0.3f;
                    f5 = 0.5f;
                    z = false;
                    this.p = 0.0f;
                }
                int i11 = z ? 1 : 0;
                while (true) {
                    iArr = this.s;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    iArr[i11] = z ? 1 : 0;
                    i11++;
                }
                int i12 = z ? 1 : 0;
                int i13 = i12;
                while (true) {
                    fArr = this.r;
                    float f19 = f10;
                    if (i12 >= i7) {
                        break;
                    }
                    if (zArr[i12]) {
                        float[] fArr3 = this.j;
                        float f20 = fArr3[i12] + min;
                        fArr3[i12] = f20;
                        float f21 = f20 / this.k[i12];
                        if (f21 >= f13) {
                            zArr[i12] = z;
                        } else {
                            float f22 = f13 - f21;
                            float f23 = f22 * f22 * this.l[i12];
                            if (f23 < 0.02f) {
                                f8 = min2;
                                i4 = i12;
                            } else {
                                float max = Math.max((-2.0f) * f11, this.h[i12] * ((f13 - ((float) Math.exp((-3.0f) * f20))) / 3.0f));
                                float f24 = (this.i[i12] * fArr3[i12]) + this.f[i12];
                                float f25 = this.g[i12];
                                float centerY = rectF.centerY();
                                float f26 = rectF.right - min2;
                                float f27 = 1.5708f * min2;
                                int i14 = (f24 > f27 ? 1 : (f24 == f27 ? 0 : -1));
                                float[] fArr4 = this.v;
                                if (i14 < 0) {
                                    fArr2 = fArr4;
                                    i4 = i12;
                                    double max2 = f24 / Math.max(min2, 1.0f);
                                    f8 = min2;
                                    float sin = ((float) Math.sin(max2)) * (-f25);
                                    float f28 = f8 + max;
                                    fArr2[z ? 1 : 0] = (((float) Math.cos(max2)) * f28) + f26;
                                    fArr2[1] = (f28 * sin) + centerY;
                                } else {
                                    f8 = min2;
                                    fArr2 = fArr4;
                                    i4 = i12;
                                    fArr2[z ? 1 : 0] = f26 - (f24 - f27);
                                    if (f25 > f19) {
                                        f9 = rectF.top - max;
                                    } else {
                                        f9 = rectF.bottom + max;
                                    }
                                    fArr2[1] = f9;
                                }
                                if (f23 > 0.6f) {
                                    i5 = 2;
                                } else if (f23 > f4) {
                                    i5 = 1;
                                } else {
                                    i5 = z ? 1 : 0;
                                }
                                int i15 = (((this.n[i4] * 3) + i5) << 1) + this.m[i4];
                                int i16 = iArr[i15];
                                float[] fArr5 = fArr[i15];
                                int i17 = i16 << 1;
                                fArr5[i17] = fArr2[z ? 1 : 0];
                                fArr5[i17 + 1] = fArr2[1];
                                iArr[i15] = i16 + 1;
                            }
                            i13 = 1;
                            i12 = i4 + 1;
                            f10 = f19;
                            min2 = f8;
                            f13 = 1.0f;
                            i7 = 160;
                        }
                    }
                    f8 = min2;
                    i4 = i12;
                    i12 = i4 + 1;
                    f10 = f19;
                    min2 = f8;
                    f13 = 1.0f;
                    i7 = 160;
                }
                int i18 = 1;
                if (i13 != 0) {
                    int i19 = z ? 1 : 0;
                    boolean z3 = z;
                    while (i19 < 3) {
                        int i20 = z3;
                        boolean z4 = z3;
                        while (i20 < 3) {
                            int i21 = z4 ? 1 : 0;
                            int i22 = 2;
                            boolean z5 = z4;
                            while (i21 < i22) {
                                int i23 = (((i19 * 3) + i20) << 1) + i21;
                                int i24 = iArr[i23];
                                if (i24 == 0) {
                                    i3 = z5 ? 1 : 0;
                                    i2 = i18;
                                    i = 2;
                                } else {
                                    int i25 = x[i19];
                                    Paint paint = this.t;
                                    paint.setColor(i25);
                                    float f29 = 255.0f * f2;
                                    i = 2;
                                    if (i20 == 2) {
                                        f6 = 0.85f;
                                        i2 = i18;
                                    } else {
                                        i2 = i18;
                                        if (i20 == i2) {
                                            f6 = f5;
                                        } else {
                                            f6 = 0.22f;
                                        }
                                    }
                                    paint.setAlpha((int) (f29 * f6));
                                    if (i21 == i2) {
                                        f7 = 1.8f;
                                    } else {
                                        f7 = 0.8f;
                                    }
                                    paint.setStrokeWidth(f7 * f11);
                                    i3 = z5 ? 1 : 0;
                                    canvas.drawPoints(fArr[i23], i3, i24 << 1, paint);
                                }
                                i21++;
                                i22 = i;
                                i18 = i2;
                                z5 = i3;
                            }
                            i20++;
                            z4 = z5;
                        }
                        i19++;
                        z3 = z4;
                    }
                }
            }
        }
    }

    public final void c(float f, float f2, float f3, int i) {
        float f4;
        boolean z;
        int i2;
        int i3 = 1;
        this.o[i] = true;
        this.f[i] = Math.max(0.0f, f);
        Random random = this.q;
        float f5 = -1.0f;
        if (random.nextBoolean()) {
            f4 = 1.0f;
        } else {
            f4 = -1.0f;
        }
        this.g[i] = f4;
        if (random.nextFloat() < 0.1f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f5 = 1.0f;
        }
        this.h[i] = ((random.nextFloat() * 0.6f) + 0.7f) * (((1.0f - b(this.w * 0.3f, f)) * 0.3f) + 1.0f) * xnb.z(this.c, 48.0f, 12.0f, f5) * f3;
        this.i[i] = ((random.nextFloat() * 12.0f) + 8.0f) * f3;
        this.j[i] = 0.0f;
        this.k[i] = ik8.e(random, 0.5f, 0.5f);
        if (random.nextFloat() < (this.c * 0.6f) + 0.25f) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this.m[i] = i2;
        float nextFloat = random.nextFloat();
        if (nextFloat < 0.6f) {
            i3 = 0;
        } else if (nextFloat >= 0.92f) {
            i3 = 2;
        }
        this.n[i] = i3;
        this.l[i] = Math.max(0.25f, f2);
    }
}
