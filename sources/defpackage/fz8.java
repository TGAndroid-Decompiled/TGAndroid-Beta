package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import java.util.HashMap;
public abstract class fz8 {
    public static Bitmap a;
    public static BitmapShader b;
    public static final Paint c = new Paint(2);
    public static final Paint d = new Paint(3);
    public static final RectF e = new RectF();
    public static final Matrix f = new Matrix();
    public static final HashMap g = new HashMap();
    public static final SweepGradient[] h = new SweepGradient[4];
    public static int i = -1;
    public static final Paint j = new Paint(2);
    public static final Rect k = new Rect();
    public static final RectF l = new RectF();
    public static final int[] m = new int[4];
    public static final int[] n = new int[4];
    public static final float[] o = new float[4];
    public static final float[] p = new float[4];

    public static boolean a(float f2, float f3, int i2, Canvas canvas, RectF rectF) {
        ?? r13;
        ?? r15;
        float f4;
        float f5;
        float f6;
        ?? r33;
        ?? r22;
        int i3;
        int i4;
        float f7;
        float f8;
        long j2;
        float f9;
        if (Build.VERSION.SDK_INT >= 29) {
            float f10 = 0.004f;
            boolean z = true;
            if (f3 <= 0.004f) {
                return true;
            }
            int i5 = i;
            SweepGradient[] sweepGradientArr = h;
            float[][] fArr = ehd.a;
            int i6 = 4;
            HashMap hashMap = g;
            if (i5 != 1) {
                i = 1;
                hashMap.clear();
                int i7 = 0;
                while (i7 < i6) {
                    float[] fArr2 = fArr[i7];
                    float f11 = f10;
                    int[] iArr = new int[73];
                    float[] fArr3 = new float[73];
                    int i8 = 0;
                    for (int i9 = 73; i8 < i9; i9 = 73) {
                        boolean z2 = z;
                        SweepGradient[] sweepGradientArr2 = sweepGradientArr;
                        double radians = Math.toRadians(i8 * 5);
                        int i10 = i6;
                        HashMap hashMap2 = hashMap;
                        float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr2[6]);
                        if (((float) Math.sin(radians)) < 0.0f) {
                            f9 = fArr2[11];
                        } else {
                            f9 = fArr2[12];
                        }
                        float f12 = f9 / 100.0f;
                        iArr[i8] = ((int) ((Math.max(0.0f, Math.min(1.0f, (((fArr2[5] / 100.0f) - f12) * pow) + f12)) * 255.0f) + 0.5f)) << 24;
                        fArr3[i8] = i8 / 72.0f;
                        i8++;
                        z = z2;
                        sweepGradientArr = sweepGradientArr2;
                        i6 = i10;
                        hashMap = hashMap2;
                    }
                    sweepGradientArr[i7] = new SweepGradient(0.0f, 0.0f, iArr, fArr3);
                    i7++;
                    f10 = f11;
                    z = z;
                }
            }
            float f13 = f10;
            boolean z3 = z;
            SweepGradient[] sweepGradientArr3 = sweepGradientArr;
            int i11 = i6;
            HashMap hashMap3 = hashMap;
            float[] fArr4 = fArr[i2];
            float N = hl.N(fArr4[8]);
            float f14 = rectF.left + N;
            float f15 = rectF.top + N;
            float f16 = rectF.right - N;
            float f17 = rectF.bottom - N;
            float f18 = f16 - f14;
            float f19 = f17 - f15;
            if (f18 >= 1.0f) {
                if (f19 >= 1.0f) {
                    float min = Math.min(Math.max(0.0f, f2 - N), Math.min(f18, f19) / 2.0f);
                    float N2 = hl.N(fArr4[i11]);
                    float max = Math.max(hl.N(fArr4[0]), hl.N(fArr4[2]));
                    int ceil = ((int) Math.ceil(N2)) + 2;
                    int ceil2 = ((int) Math.ceil(max + min)) + 1;
                    int round = Math.round(f18);
                    int round2 = Math.round(f19);
                    int i12 = (ceil2 << 1) + 2;
                    if (round >= i12) {
                        r13 = z3 ? 1 : 0;
                    } else {
                        r13 = false;
                    }
                    if (round2 >= i12) {
                        r15 = z3 ? 1 : 0;
                    } else {
                        r15 = false;
                    }
                    if (r13 != false) {
                        round = i12;
                    }
                    if (r15 != false) {
                        round2 = i12;
                    }
                    ?? r12 = r15;
                    long round3 = (((i2 << 56) ^ (Math.round(4.0f * min) << 32)) ^ (round << 16)) ^ round2;
                    Bitmap bitmap = (Bitmap) hashMap3.get(Long.valueOf(round3));
                    if (bitmap == null) {
                        float[] fArr5 = fArr[i2];
                        int i13 = ceil << 1;
                        f4 = f14;
                        bitmap = Bitmap.createBitmap(round + i13, i13 + round2, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmap);
                        f5 = f15;
                        float f20 = ceil;
                        RectF rectF2 = new RectF(f20, f20, round + ceil, round2 + ceil);
                        float N3 = hl.N(fArr5[i11]);
                        if (N3 > 0.05f) {
                            Matrix matrix = new Matrix();
                            f6 = f16;
                            matrix.setScale(rectF2.width() / Math.max(1.0f, rectF2.height()), 1.0f);
                            matrix.postTranslate(rectF2.centerX(), rectF2.centerY());
                            SweepGradient sweepGradient = sweepGradientArr3[i2];
                            sweepGradient.setLocalMatrix(matrix);
                            Paint paint = new Paint(z3 ? 1 : 0);
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setStrokeWidth(N3);
                            paint.setShader(sweepGradient);
                            RectF rectF3 = new RectF(rectF2);
                            float f21 = (-N3) / 2.0f;
                            rectF3.inset(f21, f21);
                            float f22 = (N3 / 2.0f) + min;
                            canvas2.drawRoundRect(rectF3, f22, f22, paint);
                        } else {
                            f6 = f16;
                        }
                        Paint paint2 = new Paint(1);
                        paint2.setColor(-1);
                        Path path = new Path();
                        Path path2 = new Path();
                        RectF rectF4 = new RectF();
                        r33 = r12;
                        r22 = r13;
                        int i14 = 0;
                        while (i14 < 2) {
                            if (i14 == 0) {
                                float N4 = hl.N(fArr5[0]);
                                f8 = fArr5[1];
                                f7 = N4;
                            } else {
                                f7 = -hl.N(fArr5[2]);
                                f8 = fArr5[3];
                            }
                            int i15 = i14;
                            float f23 = f8 / 100.0f;
                            if (f23 > f13 && Math.abs(f7) >= 0.1f) {
                                path.rewind();
                                j2 = round3;
                                Path.Direction direction = Path.Direction.CW;
                                path.addRoundRect(rectF2, min, min, direction);
                                rectF4.set(rectF2);
                                rectF4.offset(0.0f, f7);
                                path2.rewind();
                                path2.addRoundRect(rectF4, min, min, direction);
                                canvas2.save();
                                zz.d(canvas2, path2);
                                paint2.setAlpha(Math.round(Math.min(1.0f, f23) * 255.0f));
                                canvas2.drawPath(path, paint2);
                                canvas2.restore();
                            } else {
                                j2 = round3;
                            }
                            i14 = i15 + 1;
                            round3 = j2;
                        }
                        bitmap.prepareToDraw();
                        hashMap3.put(Long.valueOf(round3), bitmap);
                    } else {
                        f4 = f14;
                        f5 = f15;
                        f6 = f16;
                        r33 = r12;
                        r22 = r13;
                    }
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    if (r22 != false) {
                        i3 = 3;
                    } else {
                        i3 = 1;
                    }
                    if (r33 != false) {
                        i4 = 3;
                    } else {
                        i4 = 1;
                    }
                    int[] iArr2 = m;
                    iArr2[0] = 0;
                    float f24 = ceil;
                    float[] fArr6 = o;
                    fArr6[0] = f4 - f24;
                    if (r22 != false) {
                        iArr2[1] = ceil + ceil2;
                        iArr2[2] = (width - ceil) - ceil2;
                        float f25 = ceil2;
                        fArr6[1] = f4 + f25;
                        fArr6[2] = f6 - f25;
                    }
                    iArr2[i3] = width;
                    fArr6[i3] = f6 + f24;
                    int[] iArr3 = n;
                    iArr3[0] = 0;
                    float[] fArr7 = p;
                    fArr7[0] = f5 - f24;
                    if (r33 != false) {
                        iArr3[1] = ceil + ceil2;
                        iArr3[2] = (height - ceil) - ceil2;
                        float f26 = ceil2;
                        fArr7[1] = f5 + f26;
                        fArr7[2] = f17 - f26;
                    }
                    iArr3[i4] = height;
                    fArr7[i4] = f17 + f24;
                    Paint paint3 = j;
                    paint3.setAlpha((int) (Math.min(1.0f, f3) * 255.0f));
                    int i16 = 0;
                    while (i16 < i4) {
                        int i17 = 0;
                        while (i17 < i3) {
                            int i18 = iArr2[i17];
                            int i19 = iArr3[i16];
                            int i20 = i17 + 1;
                            int i21 = iArr2[i20];
                            int i22 = i16 + 1;
                            int i23 = iArr3[i22];
                            int i24 = i16;
                            Rect rect = k;
                            rect.set(i18, i19, i21, i23);
                            float f27 = fArr6[i17];
                            float f28 = fArr7[i24];
                            float f29 = fArr6[i20];
                            float f30 = fArr7[i22];
                            RectF rectF5 = l;
                            rectF5.set(f27, f28, f29, f30);
                            canvas.drawBitmap(bitmap, rect, rectF5, paint3);
                            i17 = i20;
                            i16 = i24;
                        }
                        i16++;
                    }
                } else {
                    return z3;
                }
            }
            return true;
        }
        return false;
    }

    public static void b(Canvas canvas, RectF rectF, float f2) {
        float f3 = rectF.left;
        float f4 = rectF.top;
        RectF rectF2 = e;
        rectF2.set(f3, f4, rectF.right, Math.min(rectF.height(), hl.L(40.0f)) + f4);
        Paint paint = c;
        paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, f2)) * 255.0f * 0.3125f));
        canvas.drawBitmap(d(), (Rect) null, rectF2, paint);
    }

    public static void c(Canvas canvas, RectF rectF, float f2, float f3) {
        Bitmap d2 = d();
        BitmapShader bitmapShader = b;
        Paint paint = d;
        if (bitmapShader == null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(d2, tileMode, tileMode);
            b = bitmapShader2;
            paint.setShader(bitmapShader2);
        }
        float width = rectF.width() / d2.getWidth();
        float min = Math.min(rectF.height(), hl.L(40.0f)) / d2.getHeight();
        Matrix matrix = f;
        matrix.setScale(width, min);
        matrix.postTranslate(rectF.left, rectF.top);
        b.setLocalMatrix(matrix);
        paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, f3)) * 255.0f * 0.3125f));
        canvas.drawRoundRect(rectF, f2, f2, paint);
    }

    public static Bitmap d() {
        Bitmap bitmap = a;
        if (bitmap == null) {
            int[] iArr = new int[64];
            for (int i2 = 0; i2 < 64; i2++) {
                iArr[i2] = (((int) (((1.0f - ((i2 + 0.5f) / 64.0f)) * 64.0f) + 0.5f)) << 24) | 16777215;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, 1, 64, Bitmap.Config.ARGB_8888);
            a = createBitmap;
            return createBitmap;
        }
        return bitmap;
    }
}
