package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
public final class kz extends Drawable {
    public static float v;
    public static float f25402w;
    public static long f25403x;
    public static j2 f25404y;
    public static WeakReference f25405z;
    public Paint f25408c;
    public Paint d;
    public int f25409e;
    public int f25410f;
    public ImageReceiver f25414k;
    public int f25416m;
    public Integer f25417n;
    public org.telegram.ui.ActionBar.i6 f25418o;
    public float f25419p;
    public static final int[] f25401u = new int[2];
    public static boolean A = pc.e(32);
    public final ArrayList f25406a = new ArrayList();
    public final HashMap f25407b = new HashMap();
    public final Bitmap[] f25411g = new Bitmap[3];
    public final Canvas[] h = new Canvas[3];
    public final LinearGradient[] f25412i = new LinearGradient[3];
    public final Matrix[] f25413j = new Matrix[3];
    public final int[] f25415l = new int[2];
    public float f25420q = 1.0f;
    public final SparseArray f25421r = new SparseArray();
    public boolean f25422s = true;
    public boolean f25423t = false;

    public static void a(kz kzVar, Object obj, Paint paint) {
        kzVar.f25406a.add(obj);
        kzVar.f25407b.put(obj, new Paint(paint));
    }

    public final kz clone() {
        kz kzVar = new kz();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f25406a;
            if (i7 < arrayList.size()) {
                kzVar.f25406a.add(arrayList.get(i7));
                Paint paint = (Paint) this.f25407b.get(arrayList.get(i7));
                if (paint != null) {
                    Paint paint2 = new Paint();
                    paint2.setColor(paint.getColor());
                    paint2.setStrokeCap(paint.getStrokeCap());
                    paint2.setStrokeJoin(paint.getStrokeJoin());
                    paint2.setStrokeWidth(paint.getStrokeWidth());
                    paint2.setStyle(paint.getStyle());
                    kzVar.f25407b.put(arrayList.get(i7), paint2);
                }
                i7++;
            } else {
                kzVar.f25409e = this.f25409e;
                kzVar.f25410f = this.f25410f;
                return kzVar;
            }
        }
    }

    public final void c(Canvas canvas, boolean z10, int i7, long j3, float f10, float f11, float f12, float f13) {
        float min;
        long j10;
        int i10;
        int i11;
        long j11;
        int i12 = this.f25416m;
        if (i12 >= 0) {
            f(i12, this.f25418o, this.f25419p, z10);
        }
        float f14 = ((int) f12) / this.f25409e;
        float f15 = ((int) f13) / this.f25410f;
        if (this.f25422s) {
            min = Math.max(f14, f15);
        } else {
            min = Math.min(f14, f15);
        }
        LinearGradient[] linearGradientArr = this.f25412i;
        if (linearGradientArr[i7] != null) {
            float f16 = f25402w;
            if (f16 > 0.0f && A) {
                long j12 = 64;
                if (z10) {
                    long j13 = j3 - f25403x;
                    if (j13 > 64) {
                        j11 = 64;
                    } else {
                        j11 = j13;
                    }
                    if (j11 > 0) {
                        f25403x = j3;
                        v = a8.p0.f((float) j11, f16, 1800.0f, v);
                        while (true) {
                            float f17 = v;
                            float f18 = f25402w * 2.0f;
                            if (f17 < f18) {
                                break;
                            }
                            v = f17 - f18;
                        }
                    }
                } else if (f25404y == null || f25405z.get() == this) {
                    long j14 = j3 - f25403x;
                    if (j14 <= 64) {
                        j12 = j14;
                    }
                    if (j12 < 0) {
                        j10 = 0;
                    } else {
                        j10 = j12;
                    }
                    f25403x = j3;
                    v = a8.p0.f((float) j10, f25402w, 1800.0f, v);
                    while (true) {
                        float f19 = v;
                        float f20 = f25402w;
                        if (f19 < f20 / 2.0f) {
                            break;
                        }
                        v = f19 - f20;
                    }
                    f25405z = new WeakReference(this);
                    j2 j2Var = f25404y;
                    if (j2Var != null) {
                        g0.r(j2Var);
                    }
                    j2 j2Var2 = new j2(18);
                    f25404y = j2Var2;
                    g0.h3(j2Var2, ((int) (1000.0f / g0.f24227r)) - 1);
                }
                ImageReceiver imageReceiver = this.f25414k;
                if (imageReceiver != null && !z10) {
                    View view = imageReceiver.f22728e;
                    int[] iArr = f25401u;
                    if (view != null) {
                        view.getLocationInWindow(iArr);
                    }
                    i10 = iArr[0];
                } else {
                    i10 = 0;
                }
                if (z10) {
                    i11 = i7 + 1;
                } else {
                    i11 = 0;
                }
                Matrix[] matrixArr = this.f25413j;
                Matrix matrix = matrixArr[i11];
                if (matrix != null) {
                    matrix.reset();
                    if (z10) {
                        matrixArr[i11].postTranslate(((-i10) + v) - f10, 0.0f);
                    } else {
                        matrixArr[i11].postTranslate(((-i10) + v) - f10, 0.0f);
                    }
                    float f21 = 1.0f / min;
                    matrixArr[i11].postScale(f21, f21);
                    linearGradientArr[i11].setLocalMatrix(matrixArr[i11]);
                    ImageReceiver imageReceiver2 = this.f25414k;
                    if (imageReceiver2 != null && !z10) {
                        imageReceiver2.invalidate();
                    }
                }
            }
        }
        canvas.save();
        canvas.translate(f10, f11);
        if (!this.f25422s || this.f25423t) {
            canvas.translate(com.google.android.gms.internal.vision.e2.w(this.f25409e, min, f12, 2.0f), com.google.android.gms.internal.vision.e2.w(this.f25410f, min, f13, 2.0f));
        }
        canvas.scale(min, min);
        ArrayList arrayList = this.f25406a;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = arrayList.get(i13);
            if (obj instanceof Matrix) {
                canvas.save();
                canvas.concat((Matrix) obj);
            } else if (obj == null) {
                canvas.restore();
            } else {
                Paint paint = (Paint) this.f25421r.get(i13);
                if (paint == null) {
                    paint = this.f25408c;
                }
                if (z10) {
                    paint = this.d;
                } else if (paint == null) {
                    paint = (Paint) this.f25407b.get(obj);
                }
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (this.f25420q * alpha));
                if (obj instanceof Path) {
                    canvas.drawPath((Path) obj, paint);
                } else if (obj instanceof Rect) {
                    canvas.drawRect((Rect) obj, paint);
                } else if (obj instanceof RectF) {
                    canvas.drawRect((RectF) obj, paint);
                } else if (obj instanceof ez) {
                    ez ezVar = (ez) obj;
                    canvas.drawLine(ezVar.f23909a, ezVar.f23910b, ezVar.f23911c, ezVar.d, paint);
                } else if (obj instanceof dz) {
                    dz dzVar = (dz) obj;
                    canvas.drawCircle(dzVar.f23736a, dzVar.f23737b, dzVar.f23738c, paint);
                } else if (obj instanceof fz) {
                    canvas.drawOval(((fz) obj).f24195a, paint);
                } else if (obj instanceof hz) {
                    hz hzVar = (hz) obj;
                    RectF rectF = hzVar.f24625a;
                    float f22 = hzVar.f24626b;
                    canvas.drawRoundRect(rectF, f22, f22, paint);
                }
                paint.setAlpha(alpha);
            }
        }
        canvas.restore();
    }

    public final void d() {
        this.f25423t = true;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas, false, 0, System.currentTimeMillis(), getBounds().left, getBounds().top, getBounds().width(), getBounds().height());
    }

    public final void e(int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f25416m = i7;
        this.f25418o = i6Var;
    }

    public final void f(int i7, org.telegram.ui.ActionBar.i6 i6Var, float f10, boolean z10) {
        int intValue;
        BitmapShader bitmapShader;
        Integer num = this.f25417n;
        if (num == null) {
            intValue = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        } else {
            intValue = num.intValue();
        }
        this.f25418o = i6Var;
        int[] iArr = this.f25415l;
        if (iArr[z10 ? 1 : 0] != intValue) {
            this.f25419p = f10;
            this.f25416m = i7;
            iArr[z10 ? 1 : 0] = intValue;
            f25402w = g0.f24226q.x * 2;
            boolean z11 = A;
            HashMap hashMap = this.f25407b;
            if (!z11) {
                int o4 = i0.a.o(intValue, 70);
                if (z10) {
                    if (this.d == null) {
                        this.d = new Paint(1);
                    }
                    this.d.setShader(null);
                    this.d.setColor(o4);
                    return;
                }
                for (Paint paint : hashMap.values()) {
                    paint.setShader(null);
                    paint.setColor(o4);
                }
                return;
            }
            float L = g0.L(180.0f) / f25402w;
            int argb = Color.argb((int) ((Color.alpha(intValue) / 2) * this.f25419p), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
            float f11 = (1.0f - L) / 2.0f;
            float f12 = L / 2.0f;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f25402w, 0.0f, new int[]{0, 0, argb, 0, 0}, new float[]{0.0f, f11 - f12, f11, f12 + f11, 1.0f}, tileMode);
            LinearGradient[] linearGradientArr = this.f25412i;
            linearGradientArr[z10 ? 1 : 0] = linearGradient;
            if (Build.VERSION.SDK_INT >= 28) {
                bitmapShader = new LinearGradient(0.0f, 0.0f, f25402w, 0.0f, new int[]{argb, argb}, (float[]) null, tileMode);
            } else {
                Bitmap[] bitmapArr = this.f25411g;
                Bitmap bitmap = bitmapArr[z10 ? 1 : 0];
                Canvas[] canvasArr = this.h;
                if (bitmap == null) {
                    bitmapArr[z10 ? 1 : 0] = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                    canvasArr[z10 ? 1 : 0] = new Canvas(bitmapArr[z10 ? 1 : 0]);
                }
                canvasArr[z10 ? 1 : 0].drawColor(argb);
                bitmapShader = new BitmapShader(bitmapArr[z10 ? 1 : 0], tileMode, tileMode);
            }
            Matrix matrix = new Matrix();
            this.f25413j[z10 ? 1 : 0] = matrix;
            linearGradientArr[z10 ? 1 : 0].setLocalMatrix(matrix);
            if (z10) {
                if (this.d == null) {
                    this.d = new Paint(1);
                }
                this.d.setShader(new ComposeShader(linearGradientArr[z10 ? 1 : 0], bitmapShader, PorterDuff.Mode.ADD));
                return;
            }
            for (Paint paint2 : hashMap.values()) {
                paint2.setShader(new ComposeShader(linearGradientArr[z10 ? 1 : 0], bitmapShader, PorterDuff.Mode.ADD));
            }
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f25409e;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f25410f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f25420q = i7 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
