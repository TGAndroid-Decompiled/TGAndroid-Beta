package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.SweepGradient;
import android.os.Build;
public final class kz4 {
    public static final rt4 h = new rt4(4194304, (byte) 1);
    public static final float[] i = new float[8];
    public static final jz4 j = new jz4();
    public final long[] a = new long[4];
    public final iz4[] b = new iz4[4];
    public final int[] c = new int[4];
    public final PorterDuffColorFilter[] d = new PorterDuffColorFilter[4];
    public final Paint e = new Paint(2);
    public final float[] f = new float[8];
    public final Rect g = new Rect();

    public static void b(Canvas canvas, Path path, float f, Paint paint) {
        canvas.save();
        canvas.clipPath(path);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f * 2.0f);
        paint.setStrokeJoin(Paint.Join.ROUND);
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    public static float e(float f, float f2, float f3) {
        if (f3 > f2 && f3 > 0.0f) {
            return Math.min(f, f2 / f3);
        }
        return f;
    }

    public static jz4 f(int i2, hz4 hz4Var, float[] fArr, int i3, int i4) {
        float f;
        int round;
        boolean z;
        jz4 jz4Var = j;
        jz4Var.a = i2;
        boolean z2 = false;
        for (int i5 = 0; i5 < 8; i5++) {
            jz4Var.b[i5] = Math.round(fArr[i5] * 4.0f);
        }
        hz4Var.getClass();
        if (i2 == 3) {
            jz4Var.d = 0.0f;
            jz4Var.c = 0.0f;
            jz4Var.l = Math.round(hz4Var.k * 16.0f);
            jz4Var.q = 0;
            jz4Var.p = 0;
            jz4Var.o = 0;
            jz4Var.n = 0;
            jz4Var.m = 0;
        } else if (i2 == 2) {
            jz4Var.d = 0.0f;
            jz4Var.c = 0.0f;
            jz4Var.l = Math.round(hz4Var.e * 16.0f);
            jz4Var.m = 0;
            jz4Var.n = Math.round(hz4Var.g * 1000.0f);
            jz4Var.o = Math.round(hz4Var.h * 1000.0f);
            jz4Var.p = Math.round(hz4Var.i * 1000.0f);
            if (hz4Var.b()) {
                round = 0;
            } else {
                round = Math.round(hz4Var.j * 1000.0f);
            }
            jz4Var.q = round;
        } else {
            if (i2 == 0) {
                f = hz4Var.a;
            } else {
                f = -hz4Var.c;
            }
            jz4Var.c = Math.round((0.0f * f) * 8.0f) / 8.0f;
            jz4Var.d = Math.round((1.0f * f) * 8.0f) / 8.0f;
            jz4Var.q = 0;
            jz4Var.p = 0;
            jz4Var.o = 0;
            jz4Var.n = 0;
            jz4Var.m = 0;
            jz4Var.l = 0;
        }
        float abs = Math.abs(jz4Var.c);
        float abs2 = Math.abs(jz4Var.d);
        jz4Var.e = ((int) Math.ceil(Math.max(fArr[0], fArr[6]) + abs)) + 1;
        jz4Var.g = ((int) Math.ceil(Math.max(fArr[2], fArr[4]) + abs)) + 1;
        jz4Var.f = ((int) Math.ceil(Math.max(fArr[1], fArr[3]) + abs2)) + 1;
        int ceil = ((int) Math.ceil(Math.max(fArr[5], fArr[7]) + abs2)) + 1;
        int i6 = jz4Var.e + jz4Var.g + 2;
        if (i3 >= i6) {
            z = true;
        } else {
            z = false;
        }
        jz4Var.j = z;
        int i7 = jz4Var.f + ceil + 2;
        if (i4 >= i7) {
            z2 = true;
        }
        jz4Var.k = z2;
        if (z) {
            i3 = i6;
        }
        jz4Var.h = i3;
        if (z2) {
            i4 = i7;
        }
        jz4Var.i = i4;
        return jz4Var;
    }

    public static SweepGradient g(hz4 hz4Var, RectF rectF) {
        float f;
        int[] iArr = new int[73];
        float[] fArr = new float[73];
        for (int i2 = 0; i2 < 73; i2++) {
            double radians = Math.toRadians(i2 * 5);
            float pow = (float) Math.pow(Math.abs(Math.cos(radians)), hz4Var.j);
            if (Math.sin(radians) < 0.0d) {
                f = hz4Var.g;
            } else {
                f = hz4Var.h;
            }
            iArr[i2] = (Math.round(Math.max(0.0f, Math.min(1.0f, ((hz4Var.i - f) * pow) + f)) * 255.0f) << 24) | 16777215;
            fArr[i2] = i2 / 72.0f;
        }
        SweepGradient sweepGradient = new SweepGradient(0.0f, 0.0f, iArr, fArr);
        Matrix matrix = new Matrix();
        hz4Var.getClass();
        matrix.setRotate(-0.0f);
        matrix.postScale(rectF.width() / Math.max(1.0f, rectF.height()), 1.0f);
        matrix.postTranslate(rectF.centerX(), rectF.centerY());
        sweepGradient.setLocalMatrix(matrix);
        return sweepGradient;
    }

    public final void a(Canvas canvas, float f, float f2, float f3, float f4, float[] fArr, hz4 hz4Var, float f5) {
        float f6 = f3 - f;
        float f7 = f4 - f2;
        if (f6 >= 1.0f && f7 >= 1.0f && f5 > 0.0f) {
            float e = e(e(e(e(1.0f, f6, fArr[0] + fArr[2]), f6, fArr[6] + fArr[4]), f7, fArr[1] + fArr[7]), f7, fArr[3] + fArr[5]);
            for (int i2 = 0; i2 < 8; i2++) {
                this.f[i2] = Math.max(0.0f, fArr[i2]) * e;
            }
            if (hz4Var.a()) {
                c(canvas, 2, f, f2, f3, f4, hz4Var, hz4Var.f, f5);
            }
            if (hz4Var.a > 0.05f) {
                int i3 = hz4Var.b;
                if ((i3 >>> 24) != 0) {
                    c(canvas, 0, f, f2, f3, f4, hz4Var, i3, f5);
                }
            }
            if (hz4Var.c > 0.05f) {
                int i4 = hz4Var.d;
                if ((i4 >>> 24) != 0) {
                    c(canvas, 1, f, f2, f3, f4, hz4Var, i4, f5);
                }
            }
            if (hz4Var.k > 0.05f) {
                int i5 = hz4Var.l;
                if ((i5 >>> 24) != 0) {
                    c(canvas, 3, f, f2, f3, f4, hz4Var, i5, f5);
                }
            }
        }
    }

    public final void c(Canvas canvas, int i2, float f, float f2, float f3, float f4, hz4 hz4Var, int i3, float f5) {
        long j2;
        iz4[] iz4VarArr;
        long[] jArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        jz4 f6 = f(i2, hz4Var, this.f, Math.round(f3 - f), Math.round(f4 - f2));
        float f7 = hz4Var.e;
        long a = f6.a();
        iz4[] iz4VarArr2 = this.b;
        iz4 iz4Var = iz4VarArr2[i2];
        long[] jArr2 = this.a;
        if (iz4Var == null || jArr2[i2] != a) {
            Long valueOf = Long.valueOf(a);
            rt4 rt4Var = h;
            iz4Var = (iz4) rt4Var.get(valueOf);
            if (iz4Var == null) {
                if (i2 == 2) {
                    i4 = ((int) Math.ceil(f7)) + 2;
                } else {
                    i4 = 1;
                }
                int i10 = i4 << 1;
                Bitmap createBitmap = Bitmap.createBitmap(f6.h + i10, f6.i + i10, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f8 = i4;
                j2 = a;
                RectF rectF = new RectF(f8, f8, f6.h + i4, f6.i + i4);
                float[] fArr = new float[8];
                for (int i11 = 0; i11 < 8; i11++) {
                    fArr[i11] = f6.b[i11] / 4.0f;
                }
                Paint paint = new Paint(1);
                paint.setColor(-1);
                if (i2 == 2) {
                    RectF rectF2 = new RectF(rectF);
                    float f9 = (-f7) / 2.0f;
                    rectF2.inset(f9, f9);
                    iz4VarArr = iz4VarArr2;
                    float[] fArr2 = new float[8];
                    jArr = jArr2;
                    for (int i12 = 0; i12 < 8; i12++) {
                        float f10 = fArr[i12];
                        float f11 = 0.0f;
                        if (f10 > 0.0f) {
                            f11 = (f7 / 2.0f) + f10;
                        }
                        fArr2[i12] = f11;
                    }
                    Path path = new Path();
                    path.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(f7);
                    if (!hz4Var.b()) {
                        paint.setShader(g(hz4Var, rectF));
                    } else {
                        paint.setAlpha(Math.round(Math.min(1.0f, hz4Var.i) * 255.0f));
                    }
                    canvas2.drawPath(path, paint);
                } else {
                    iz4VarArr = iz4VarArr2;
                    jArr = jArr2;
                    if (i2 == 3) {
                        Path path2 = new Path();
                        path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                        b(canvas2, path2, hz4Var.k, paint);
                    } else {
                        Path path3 = new Path();
                        Path.Direction direction = Path.Direction.CW;
                        path3.addRoundRect(rectF, fArr, direction);
                        Path path4 = new Path();
                        float f12 = rectF.left;
                        float f13 = f6.c;
                        float f14 = f12 + f13;
                        float f15 = rectF.top;
                        float f16 = f6.d;
                        path4.addRoundRect(f14, f15 + f16, rectF.right + f13, rectF.bottom + f16, fArr, direction);
                        canvas2.save();
                        if (Build.VERSION.SDK_INT >= 26) {
                            canvas2.clipOutPath(path4);
                        } else {
                            canvas2.clipPath(path4, Region.Op.DIFFERENCE);
                        }
                        canvas2.drawPath(path3, paint);
                        canvas2.restore();
                    }
                }
                createBitmap.prepareToDraw();
                boolean z = f6.j;
                if (z) {
                    i6 = f6.e + i4;
                    i5 = 2;
                } else {
                    i5 = 2;
                    i6 = (f6.h / 2) + i4;
                }
                int i13 = i6;
                boolean z2 = f6.k;
                if (z2) {
                    i7 = f6.f + i4;
                } else {
                    i7 = (f6.i / 2) + i4;
                }
                int i14 = i7;
                if (z) {
                    i8 = i5;
                } else {
                    i8 = 1;
                }
                int i15 = i13 + i8;
                if (z2) {
                    i9 = i5;
                } else {
                    i9 = 1;
                }
                iz4 iz4Var2 = new iz4(new NinePatch(createBitmap, jue.c(i13, i15, i14, i14 + i9, 0, 0, 0, 0, 1).array(), null), null, i4, createBitmap.getByteCount());
                rt4Var.put(Long.valueOf(j2), iz4Var2);
                iz4Var = iz4Var2;
            } else {
                j2 = a;
                iz4VarArr = iz4VarArr2;
                jArr = jArr2;
            }
            jArr[i2] = j2;
            iz4VarArr[i2] = iz4Var;
        }
        int i16 = iz4Var.c;
        int i17 = i3 | (-16777216);
        PorterDuffColorFilter[] porterDuffColorFilterArr = this.d;
        PorterDuffColorFilter porterDuffColorFilter = porterDuffColorFilterArr[i2];
        int[] iArr = this.c;
        if (porterDuffColorFilter == null || iArr[i2] != i17) {
            iArr[i2] = i17;
            porterDuffColorFilterArr[i2] = new PorterDuffColorFilter(i17, PorterDuff.Mode.SRC_IN);
        }
        PorterDuffColorFilter porterDuffColorFilter2 = porterDuffColorFilterArr[i2];
        Paint paint2 = this.e;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setAlpha(Math.round(Math.min(1.0f, f5) * Color.alpha(i3)));
        Rect rect = this.g;
        rect.set(Math.round(f) - i16, Math.round(f2) - i16, Math.round(f3) + i16, Math.round(f4) + i16);
        iz4Var.a.draw(canvas, rect, paint2);
    }

    public final void d(Canvas canvas, int i2, Path path, long j2, float f, float f2, float f3, float f4, hz4 hz4Var, int i3, float f5) {
        long[] jArr;
        int i4;
        int round = Math.round(f3 - f);
        int round2 = Math.round(f4 - f2);
        jz4 f6 = f(i2, hz4Var, i, round, round2);
        float f7 = hz4Var.e;
        long a = (((((f6.a() ^ j2) * 1099511628211L) ^ round) * 1099511628211L) ^ round2) * 1099511628211L;
        iz4[] iz4VarArr = this.b;
        iz4 iz4Var = iz4VarArr[i2];
        long[] jArr2 = this.a;
        if (iz4Var == null || jArr2[i2] != a) {
            Long valueOf = Long.valueOf(a);
            rt4 rt4Var = h;
            iz4Var = (iz4) rt4Var.get(valueOf);
            if (iz4Var == null) {
                int round3 = Math.round(f);
                int round4 = Math.round(f2);
                jArr = jArr2;
                if (i2 == 2) {
                    i4 = ((int) Math.ceil(f7)) + 2;
                } else {
                    i4 = 1;
                }
                int i5 = i4 << 1;
                Bitmap createBitmap = Bitmap.createBitmap(round + i5, i5 + round2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                Path path2 = new Path(path);
                path2.offset(i4 - round3, i4 - round4);
                Paint paint = new Paint(1);
                paint.setColor(-1);
                canvas2.save();
                if (i2 == 2) {
                    float f8 = i4;
                    RectF rectF = new RectF(f8, f8, i4 + round, i4 + round2);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(2.0f * f7);
                    paint.setStrokeJoin(Paint.Join.ROUND);
                    if (!hz4Var.b()) {
                        paint.setShader(g(hz4Var, rectF));
                    } else {
                        paint.setAlpha(Math.round(Math.min(1.0f, hz4Var.i) * 255.0f));
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas2.clipOutPath(path2);
                    } else {
                        canvas2.clipPath(path2, Region.Op.DIFFERENCE);
                    }
                    canvas2.drawPath(path2, paint);
                } else if (i2 == 3) {
                    b(canvas2, path2, hz4Var.k, paint);
                } else {
                    Path path3 = new Path(path2);
                    path3.offset(f6.c, f6.d);
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas2.clipOutPath(path3);
                    } else {
                        canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                    }
                    canvas2.drawPath(path2, paint);
                }
                canvas2.restore();
                createBitmap.prepareToDraw();
                iz4 iz4Var2 = new iz4(null, createBitmap, i4, createBitmap.getByteCount());
                rt4Var.put(Long.valueOf(a), iz4Var2);
                iz4Var = iz4Var2;
            } else {
                jArr = jArr2;
            }
            jArr[i2] = a;
            iz4VarArr[i2] = iz4Var;
        }
        int i6 = iz4Var.c;
        int i7 = i3 | (-16777216);
        PorterDuffColorFilter[] porterDuffColorFilterArr = this.d;
        PorterDuffColorFilter porterDuffColorFilter = porterDuffColorFilterArr[i2];
        int[] iArr = this.c;
        if (porterDuffColorFilter == null || iArr[i2] != i7) {
            iArr[i2] = i7;
            porterDuffColorFilterArr[i2] = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        }
        PorterDuffColorFilter porterDuffColorFilter2 = porterDuffColorFilterArr[i2];
        Paint paint2 = this.e;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setAlpha(Math.round(Math.min(1.0f, f5) * Color.alpha(i3)));
        if (paint2.getAlpha() > 0) {
            canvas.drawBitmap(iz4Var.b, Math.round(f) - i6, Math.round(f2) - i6, paint2);
        }
    }
}
