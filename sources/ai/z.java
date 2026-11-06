package ai;

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
public abstract class z {
    public static Bitmap f1700a;
    public static BitmapShader f1701b;
    public static final Paint f1702c = new Paint(2);
    public static final Paint d = new Paint(3);
    public static final RectF f1703e = new RectF();
    public static final Matrix f1704f = new Matrix();
    public static final HashMap f1705g = new HashMap();
    public static final SweepGradient[] h = new SweepGradient[4];
    public static int f1706i = -1;
    public static final Paint f1707j = new Paint(2);
    public static final Rect f1708k = new Rect();
    public static final RectF f1709l = new RectF();
    public static final int[] f1710m = new int[4];
    public static final int[] f1711n = new int[4];
    public static final float[] f1712o = new float[4];
    public static final float[] f1713p = new float[4];

    public static boolean a(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        float f12;
        boolean z9;
        boolean z10;
        float f13;
        float f14;
        float f15;
        boolean z11;
        int i10;
        int i11;
        float f16;
        float f17;
        RectF rectF2;
        boolean z12;
        if (Build.VERSION.SDK_INT >= 29) {
            float f18 = 0.004f;
            boolean z13 = true;
            if (f11 <= 0.004f) {
                return true;
            }
            int i12 = f1706i;
            SweepGradient[] sweepGradientArr = h;
            float[][] fArr = o1.f1595a;
            int i13 = 4;
            HashMap hashMap = f1705g;
            if (i12 != 1) {
                f1706i = 1;
                hashMap.clear();
                int i14 = 0;
                while (i14 < i13) {
                    float[] fArr2 = fArr[i14];
                    float f19 = f18;
                    int[] iArr = new int[73];
                    float[] fArr3 = new float[73];
                    int i15 = 0;
                    for (int i16 = 73; i15 < i16; i16 = 73) {
                        boolean z14 = z13;
                        SweepGradient[] sweepGradientArr2 = sweepGradientArr;
                        double radians = Math.toRadians(i15 * 5);
                        int i17 = i13;
                        HashMap hashMap2 = hashMap;
                        float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr2[6]);
                        if (((float) Math.sin(radians)) < 0.0f) {
                            f12 = fArr2[11];
                        } else {
                            f12 = fArr2[12];
                        }
                        float f20 = f12 / 100.0f;
                        iArr[i15] = ((int) ((Math.max(0.0f, Math.min(1.0f, (((fArr2[5] / 100.0f) - f20) * pow) + f20)) * 255.0f) + 0.5f)) << 24;
                        fArr3[i15] = i15 / 72.0f;
                        i15++;
                        z13 = z14;
                        sweepGradientArr = sweepGradientArr2;
                        i13 = i17;
                        hashMap = hashMap2;
                    }
                    sweepGradientArr[i14] = new SweepGradient(0.0f, 0.0f, iArr, fArr3);
                    i14++;
                    f18 = f19;
                    z13 = z13;
                }
            }
            float f21 = f18;
            boolean z15 = z13;
            SweepGradient[] sweepGradientArr3 = sweepGradientArr;
            int i18 = i13;
            HashMap hashMap3 = hashMap;
            float[] fArr4 = fArr[i7];
            float N = org.telegram.messenger.g0.N(fArr4[8]);
            float f22 = rectF.left + N;
            float f23 = rectF.top + N;
            float f24 = rectF.right - N;
            float f25 = rectF.bottom - N;
            float f26 = f24 - f22;
            float f27 = f25 - f23;
            if (f26 >= 1.0f) {
                if (f27 >= 1.0f) {
                    float min = Math.min(Math.max(0.0f, f10 - N), Math.min(f26, f27) / 2.0f);
                    float N2 = org.telegram.messenger.g0.N(fArr4[i18]);
                    float max = Math.max(org.telegram.messenger.g0.N(fArr4[0]), org.telegram.messenger.g0.N(fArr4[2]));
                    int ceil = ((int) Math.ceil(N2)) + 2;
                    int ceil2 = ((int) Math.ceil(max + min)) + 1;
                    int round = Math.round(f26);
                    int round2 = Math.round(f27);
                    int i19 = (ceil2 * 2) + 2;
                    if (round >= i19) {
                        z9 = z15 ? 1 : 0;
                    } else {
                        z9 = false;
                    }
                    if (round2 >= i19) {
                        z10 = z15 ? 1 : 0;
                    } else {
                        z10 = false;
                    }
                    if (z9) {
                        round = i19;
                    }
                    if (z10) {
                        round2 = i19;
                    }
                    boolean z16 = z10;
                    long round3 = (((Math.round(4.0f * min) << 32) ^ (i7 << 56)) ^ (round << 16)) ^ round2;
                    Bitmap bitmap = (Bitmap) hashMap3.get(Long.valueOf(round3));
                    if (bitmap == null) {
                        float[] fArr5 = fArr[i7];
                        int i20 = ceil * 2;
                        bitmap = Bitmap.createBitmap(round + i20, i20 + round2, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmap);
                        f13 = f22;
                        float f28 = ceil;
                        RectF rectF3 = new RectF(f28, f28, round + ceil, round2 + ceil);
                        float N3 = org.telegram.messenger.g0.N(fArr5[i18]);
                        if (N3 > 0.05f) {
                            Matrix matrix = new Matrix();
                            f14 = f23;
                            f15 = f24;
                            matrix.setScale(rectF3.width() / Math.max(1.0f, rectF3.height()), 1.0f);
                            matrix.postTranslate(rectF3.centerX(), rectF3.centerY());
                            SweepGradient sweepGradient = sweepGradientArr3[i7];
                            sweepGradient.setLocalMatrix(matrix);
                            Paint paint = new Paint(z15 ? 1 : 0);
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setStrokeWidth(N3);
                            paint.setShader(sweepGradient);
                            RectF rectF4 = new RectF(rectF3);
                            float f29 = (-N3) / 2.0f;
                            rectF4.inset(f29, f29);
                            float f30 = (N3 / 2.0f) + min;
                            canvas2.drawRoundRect(rectF4, f30, f30, paint);
                        } else {
                            f14 = f23;
                            f15 = f24;
                        }
                        Paint paint2 = new Paint(1);
                        paint2.setColor(-1);
                        Path path = new Path();
                        Path path2 = new Path();
                        RectF rectF5 = new RectF();
                        int i21 = 0;
                        boolean z17 = z16;
                        while (i21 < 2) {
                            if (i21 == 0) {
                                f16 = org.telegram.messenger.g0.N(fArr5[0]);
                            } else {
                                f16 = -org.telegram.messenger.g0.N(fArr5[2]);
                            }
                            if (i21 == 0) {
                                f17 = fArr5[1];
                            } else {
                                f17 = fArr5[3];
                            }
                            int i22 = i21;
                            float f31 = f17 / 100.0f;
                            if (f31 <= f21 || Math.abs(f16) < 0.1f) {
                                rectF2 = rectF3;
                                z12 = z17;
                            } else {
                                path.rewind();
                                z12 = z17;
                                Path.Direction direction = Path.Direction.CW;
                                path.addRoundRect(rectF3, min, min, direction);
                                rectF5.set(rectF3);
                                rectF2 = rectF3;
                                rectF5.offset(0.0f, f16);
                                path2.rewind();
                                path2.addRoundRect(rectF5, min, min, direction);
                                canvas2.save();
                                a0.b(canvas2, path2);
                                paint2.setAlpha(Math.round(Math.min(1.0f, f31) * 255.0f));
                                canvas2.drawPath(path, paint2);
                                canvas2.restore();
                            }
                            i21 = i22 + 1;
                            z17 = z12;
                            rectF3 = rectF2;
                        }
                        z11 = z17;
                        bitmap.prepareToDraw();
                        hashMap3.put(Long.valueOf(round3), bitmap);
                    } else {
                        f13 = f22;
                        f14 = f23;
                        f15 = f24;
                        z11 = z16;
                    }
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    if (z9) {
                        i10 = 3;
                    } else {
                        i10 = 1;
                    }
                    if (z11) {
                        i11 = 3;
                    } else {
                        i11 = 1;
                    }
                    int[] iArr2 = f1710m;
                    iArr2[0] = 0;
                    float f32 = ceil;
                    float[] fArr6 = f1712o;
                    fArr6[0] = f13 - f32;
                    if (z9) {
                        iArr2[1] = ceil + ceil2;
                        iArr2[2] = (width - ceil) - ceil2;
                        float f33 = ceil2;
                        fArr6[1] = f13 + f33;
                        fArr6[2] = f15 - f33;
                    }
                    iArr2[i10] = width;
                    fArr6[i10] = f15 + f32;
                    int[] iArr3 = f1711n;
                    iArr3[0] = 0;
                    float[] fArr7 = f1713p;
                    fArr7[0] = f14 - f32;
                    if (z11) {
                        iArr3[1] = ceil + ceil2;
                        iArr3[2] = (height - ceil) - ceil2;
                        float f34 = ceil2;
                        fArr7[1] = f14 + f34;
                        fArr7[2] = f25 - f34;
                    }
                    iArr3[i11] = height;
                    fArr7[i11] = f25 + f32;
                    Paint paint3 = f1707j;
                    paint3.setAlpha((int) (Math.min(1.0f, f11) * 255.0f));
                    int i23 = 0;
                    while (i23 < i11) {
                        int i24 = 0;
                        while (i24 < i10) {
                            int i25 = iArr2[i24];
                            int i26 = iArr3[i23];
                            int i27 = i24 + 1;
                            int i28 = iArr2[i27];
                            int i29 = i23 + 1;
                            int i30 = iArr3[i29];
                            int i31 = i23;
                            Rect rect = f1708k;
                            rect.set(i25, i26, i28, i30);
                            float f35 = fArr6[i24];
                            float f36 = fArr7[i31];
                            float f37 = fArr6[i27];
                            float f38 = fArr7[i29];
                            RectF rectF6 = f1709l;
                            rectF6.set(f35, f36, f37, f38);
                            canvas.drawBitmap(bitmap, rect, rectF6, paint3);
                            i24 = i27;
                            i23 = i31;
                        }
                        i23++;
                    }
                } else {
                    return z15;
                }
            }
            return true;
        }
        return false;
    }

    public static void b(Canvas canvas, RectF rectF, float f10) {
        float f11 = rectF.left;
        float f12 = rectF.top;
        RectF rectF2 = f1703e;
        rectF2.set(f11, f12, rectF.right, Math.min(rectF.height(), org.telegram.messenger.g0.L(40.0f)) + f12);
        Paint paint = f1702c;
        paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, f10)) * 255.0f * 0.3125f));
        canvas.drawBitmap(d(), (Rect) null, rectF2, paint);
    }

    public static void c(Canvas canvas, RectF rectF, float f10, float f11) {
        Bitmap d2 = d();
        BitmapShader bitmapShader = f1701b;
        Paint paint = d;
        if (bitmapShader == null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(d2, tileMode, tileMode);
            f1701b = bitmapShader2;
            paint.setShader(bitmapShader2);
        }
        float width = rectF.width() / d2.getWidth();
        float min = Math.min(rectF.height(), org.telegram.messenger.g0.L(40.0f)) / d2.getHeight();
        Matrix matrix = f1704f;
        matrix.setScale(width, min);
        matrix.postTranslate(rectF.left, rectF.top);
        f1701b.setLocalMatrix(matrix);
        paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, f11)) * 255.0f * 0.3125f));
        canvas.drawRoundRect(rectF, f10, f10, paint);
    }

    public static Bitmap d() {
        if (f1700a == null) {
            int[] iArr = new int[64];
            for (int i7 = 0; i7 < 64; i7++) {
                iArr[i7] = (((int) (((1.0f - ((i7 + 0.5f) / 64.0f)) * 64.0f) + 0.5f)) << 24) | 16777215;
            }
            f1700a = Bitmap.createBitmap(iArr, 1, 64, Bitmap.Config.ARGB_8888);
        }
        return f1700a;
    }
}
