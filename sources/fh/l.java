package fh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import c8.q0;
public final class l {
    public static final i h = new i(4194304, 0);
    public static final float[] f11728i = new float[8];
    public static final k f11729j = new k();
    public final long[] f11730a = new long[4];
    public final j[] f11731b = new j[4];
    public final int[] f11732c = new int[4];
    public final PorterDuffColorFilter[] d = new PorterDuffColorFilter[4];
    public final Paint f11733e = new Paint(2);
    public final float[] f11734f = new float[8];
    public final Rect f11735g = new Rect();

    public static void b(Canvas canvas, Path path, float f10, Paint paint) {
        canvas.save();
        canvas.clipPath(path);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f10 * 2.0f);
        paint.setStrokeJoin(Paint.Join.ROUND);
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    public static float e(float f10, float f11, float f12) {
        if (f12 > f11 && f12 > 0.0f) {
            return Math.min(f10, f11 / f12);
        }
        return f10;
    }

    public static k f(int i7, h hVar, float[] fArr, int i10, int i11) {
        float f10;
        boolean z10;
        k kVar = f11729j;
        kVar.f11713a = i7;
        boolean z11 = false;
        for (int i12 = 0; i12 < 8; i12++) {
            kVar.f11714b[i12] = Math.round(fArr[i12] * 4.0f);
        }
        hVar.getClass();
        double radians = Math.toRadians(0.0f);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        if (i7 == 3) {
            kVar.d = 0.0f;
            kVar.f11715c = 0.0f;
            kVar.f11722l = Math.round(hVar.f11708g * 16.0f);
            kVar.f11727q = 0;
            kVar.f11726p = 0;
            kVar.f11725o = 0;
            kVar.f11724n = 0;
            kVar.f11723m = 0;
        } else if (i7 == 2) {
            kVar.d = 0.0f;
            kVar.f11715c = 0.0f;
            kVar.f11722l = Math.round(hVar.f11706e * 16.0f);
            kVar.f11723m = 0;
            kVar.f11724n = Math.round(1000.0f);
            kVar.f11725o = Math.round(1000.0f);
            kVar.f11726p = Math.round(1000.0f);
            kVar.f11727q = 0;
        } else {
            if (i7 == 0) {
                f10 = hVar.f11703a;
            } else {
                f10 = -hVar.f11705c;
            }
            kVar.f11715c = Math.round((sin * f10) * 8.0f) / 8.0f;
            kVar.d = Math.round((cos * f10) * 8.0f) / 8.0f;
            kVar.f11727q = 0;
            kVar.f11726p = 0;
            kVar.f11725o = 0;
            kVar.f11724n = 0;
            kVar.f11723m = 0;
            kVar.f11722l = 0;
        }
        float abs = Math.abs(kVar.f11715c);
        float abs2 = Math.abs(kVar.d);
        kVar.f11716e = ((int) Math.ceil(Math.max(fArr[0], fArr[6]) + abs)) + 1;
        kVar.f11718g = ((int) Math.ceil(Math.max(fArr[2], fArr[4]) + abs)) + 1;
        kVar.f11717f = ((int) Math.ceil(Math.max(fArr[1], fArr[3]) + abs2)) + 1;
        int ceil = ((int) Math.ceil(Math.max(fArr[5], fArr[7]) + abs2)) + 1;
        int i13 = kVar.f11716e + kVar.f11718g + 2;
        if (i10 >= i13) {
            z10 = true;
        } else {
            z10 = false;
        }
        kVar.f11720j = z10;
        int i14 = kVar.f11717f + ceil + 2;
        if (i11 >= i14) {
            z11 = true;
        }
        kVar.f11721k = z11;
        if (z10) {
            i10 = i13;
        }
        kVar.h = i10;
        if (z11) {
            i11 = i14;
        }
        kVar.f11719i = i11;
        return kVar;
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, float[] fArr, h hVar, float f14) {
        float f15 = f12 - f10;
        float f16 = f13 - f11;
        if (f15 >= 1.0f && f16 >= 1.0f && f14 > 0.0f) {
            float e10 = e(e(e(e(1.0f, f15, fArr[0] + fArr[2]), f15, fArr[6] + fArr[4]), f16, fArr[1] + fArr[7]), f16, fArr[3] + fArr[5]);
            for (int i7 = 0; i7 < 8; i7++) {
                this.f11734f[i7] = Math.max(0.0f, fArr[i7]) * e10;
            }
            if (hVar.a()) {
                c(canvas, 2, f10, f11, f12, f13, hVar, hVar.f11707f, f14);
            }
            if (hVar.f11703a > 0.05f) {
                int i10 = hVar.f11704b;
                if ((i10 >>> 24) != 0) {
                    c(canvas, 0, f10, f11, f12, f13, hVar, i10, f14);
                }
            }
            if (hVar.f11705c > 0.05f) {
                int i11 = hVar.d;
                if ((i11 >>> 24) != 0) {
                    c(canvas, 1, f10, f11, f12, f13, hVar, i11, f14);
                }
            }
            if (hVar.f11708g > 0.05f) {
                int i12 = hVar.h;
                if ((i12 >>> 24) != 0) {
                    c(canvas, 3, f10, f11, f12, f13, hVar, i12, f14);
                }
            }
        }
    }

    public final void c(Canvas canvas, int i7, float f10, float f11, float f12, float f13, h hVar, int i10, float f14) {
        long j3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        k f15 = f(i7, hVar, this.f11734f, Math.round(f12 - f10), Math.round(f13 - f11));
        float f16 = hVar.f11706e;
        long a10 = f15.a();
        j[] jVarArr = this.f11731b;
        j jVar = jVarArr[i7];
        long[] jArr = this.f11730a;
        if (jVar == null || jArr[i7] != a10) {
            Long valueOf = Long.valueOf(a10);
            i iVar = h;
            jVar = (j) iVar.get(valueOf);
            if (jVar == null) {
                if (i7 == 2) {
                    i11 = ((int) Math.ceil(f16)) + 2;
                } else {
                    i11 = 1;
                }
                int i17 = i11 * 2;
                Bitmap createBitmap = Bitmap.createBitmap(f15.h + i17, f15.f11719i + i17, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f17 = i11;
                j3 = a10;
                RectF rectF = new RectF(f17, f17, f15.h + i11, f15.f11719i + i11);
                float[] fArr = new float[8];
                for (int i18 = 0; i18 < 8; i18++) {
                    fArr[i18] = f15.f11714b[i18] / 4.0f;
                }
                Paint paint = new Paint(1);
                paint.setColor(-1);
                if (i7 == 2) {
                    RectF rectF2 = new RectF(rectF);
                    float f18 = (-f16) / 2.0f;
                    rectF2.inset(f18, f18);
                    float[] fArr2 = new float[8];
                    for (int i19 = 0; i19 < 8; i19++) {
                        float f19 = fArr[i19];
                        float f20 = 0.0f;
                        if (f19 > 0.0f) {
                            f20 = (f16 / 2.0f) + f19;
                        }
                        fArr2[i19] = f20;
                    }
                    Path path = new Path();
                    path.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(f16);
                    paint.setAlpha(Math.round(Math.min(1.0f, 1.0f) * 255.0f));
                    canvas2.drawPath(path, paint);
                } else if (i7 == 3) {
                    Path path2 = new Path();
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                    b(canvas2, path2, hVar.f11708g, paint);
                } else {
                    Path path3 = new Path();
                    Path.Direction direction = Path.Direction.CW;
                    path3.addRoundRect(rectF, fArr, direction);
                    Path path4 = new Path();
                    float f21 = rectF.left;
                    float f22 = f15.f11715c;
                    float f23 = f21 + f22;
                    float f24 = rectF.top;
                    float f25 = f15.d;
                    path4.addRoundRect(f23, f24 + f25, rectF.right + f22, rectF.bottom + f25, fArr, direction);
                    canvas2.save();
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas2.clipOutPath(path4);
                    } else {
                        canvas2.clipPath(path4, Region.Op.DIFFERENCE);
                    }
                    canvas2.drawPath(path3, paint);
                    canvas2.restore();
                }
                createBitmap.prepareToDraw();
                boolean z10 = f15.f11720j;
                if (z10) {
                    i13 = f15.f11716e + i11;
                    i12 = 2;
                } else {
                    i12 = 2;
                    i13 = (f15.h / 2) + i11;
                }
                int i20 = i13;
                boolean z11 = f15.f11721k;
                if (z11) {
                    i14 = f15.f11717f + i11;
                } else {
                    i14 = (f15.f11719i / 2) + i11;
                }
                int i21 = i14;
                if (z10) {
                    i15 = i12;
                } else {
                    i15 = 1;
                }
                int i22 = i20 + i15;
                if (z11) {
                    i16 = i12;
                } else {
                    i16 = 1;
                }
                j jVar2 = new j(new NinePatch(createBitmap, q0.c(i20, i22, i21, i21 + i16, 0, 0, 0, 0, 1).array(), null), null, i11, createBitmap.getByteCount());
                iVar.put(Long.valueOf(j3), jVar2);
                jVar = jVar2;
            } else {
                j3 = a10;
            }
            jArr[i7] = j3;
            jVarArr[i7] = jVar;
        }
        int i23 = jVar.f11712c;
        int i24 = i10 | (-16777216);
        PorterDuffColorFilter[] porterDuffColorFilterArr = this.d;
        PorterDuffColorFilter porterDuffColorFilter = porterDuffColorFilterArr[i7];
        int[] iArr = this.f11732c;
        if (porterDuffColorFilter == null || iArr[i7] != i24) {
            iArr[i7] = i24;
            porterDuffColorFilterArr[i7] = new PorterDuffColorFilter(i24, PorterDuff.Mode.SRC_IN);
        }
        PorterDuffColorFilter porterDuffColorFilter2 = porterDuffColorFilterArr[i7];
        Paint paint2 = this.f11733e;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setAlpha(Math.round(Math.min(1.0f, f14) * Color.alpha(i10)));
        int round = Math.round(f10) - i23;
        int round2 = Math.round(f11) - i23;
        int round3 = Math.round(f12) + i23;
        int round4 = Math.round(f13) + i23;
        Rect rect = this.f11735g;
        rect.set(round, round2, round3, round4);
        jVar.f11710a.draw(canvas, rect, paint2);
    }

    public final void d(Canvas canvas, int i7, Path path, long j3, float f10, float f11, float f12, float f13, h hVar, int i10, float f14) {
        long[] jArr;
        int i11;
        int round = Math.round(f12 - f10);
        int round2 = Math.round(f13 - f11);
        k f15 = f(i7, hVar, f11728i, round, round2);
        float f16 = hVar.f11706e;
        long a10 = (((((f15.a() ^ j3) * 1099511628211L) ^ round) * 1099511628211L) ^ round2) * 1099511628211L;
        j[] jVarArr = this.f11731b;
        j jVar = jVarArr[i7];
        long[] jArr2 = this.f11730a;
        if (jVar == null || jArr2[i7] != a10) {
            Long valueOf = Long.valueOf(a10);
            i iVar = h;
            jVar = (j) iVar.get(valueOf);
            if (jVar == null) {
                int round3 = Math.round(f10);
                int round4 = Math.round(f11);
                jArr = jArr2;
                if (i7 == 2) {
                    i11 = ((int) Math.ceil(f16)) + 2;
                } else {
                    i11 = 1;
                }
                int i12 = i11 * 2;
                Bitmap createBitmap = Bitmap.createBitmap(round + i12, i12 + round2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                Path path2 = new Path(path);
                path2.offset(i11 - round3, i11 - round4);
                Paint paint = new Paint(1);
                paint.setColor(-1);
                canvas2.save();
                if (i7 == 2) {
                    float f17 = i11;
                    new RectF(f17, f17, i11 + round, i11 + round2);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(f16 * 2.0f);
                    paint.setStrokeJoin(Paint.Join.ROUND);
                    paint.setAlpha(Math.round(Math.min(1.0f, 1.0f) * 255.0f));
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas2.clipOutPath(path2);
                    } else {
                        canvas2.clipPath(path2, Region.Op.DIFFERENCE);
                    }
                    canvas2.drawPath(path2, paint);
                } else if (i7 == 3) {
                    b(canvas2, path2, hVar.f11708g, paint);
                } else {
                    Path path3 = new Path(path2);
                    path3.offset(f15.f11715c, f15.d);
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas2.clipOutPath(path3);
                    } else {
                        canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                    }
                    canvas2.drawPath(path2, paint);
                }
                canvas2.restore();
                createBitmap.prepareToDraw();
                j jVar2 = new j(null, createBitmap, i11, createBitmap.getByteCount());
                iVar.put(Long.valueOf(a10), jVar2);
                jVar = jVar2;
            } else {
                jArr = jArr2;
            }
            jArr[i7] = a10;
            jVarArr[i7] = jVar;
        }
        int i13 = jVar.f11712c;
        int i14 = i10 | (-16777216);
        PorterDuffColorFilter[] porterDuffColorFilterArr = this.d;
        PorterDuffColorFilter porterDuffColorFilter = porterDuffColorFilterArr[i7];
        int[] iArr = this.f11732c;
        if (porterDuffColorFilter == null || iArr[i7] != i14) {
            iArr[i7] = i14;
            porterDuffColorFilterArr[i7] = new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN);
        }
        PorterDuffColorFilter porterDuffColorFilter2 = porterDuffColorFilterArr[i7];
        Paint paint2 = this.f11733e;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setAlpha(Math.round(Math.min(1.0f, f14) * Color.alpha(i10)));
        if (paint2.getAlpha() > 0) {
            canvas.drawBitmap(jVar.f11711b, Math.round(f10) - i13, Math.round(f11) - i13, paint2);
        }
    }
}
