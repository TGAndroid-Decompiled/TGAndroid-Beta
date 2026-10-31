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
public final class c00 extends Drawable {
    public static float v;
    public static float f14868w;
    public static long f14869x;
    public static rz f14870y;
    public static WeakReference f14871z;
    public Paint f14874c;
    public Paint d;
    public int e;
    public int f14875f;
    public ImageReceiver f14879k;
    public int f14881m;
    public Integer f14882n;
    public org.telegram.ui.ActionBar.p6 f14883o;
    public float f14884p;
    public static final int[] f14867u = new int[2];
    public static boolean A = sc.e(32);
    public final ArrayList f14872a = new ArrayList();
    public final HashMap f14873b = new HashMap();
    public final Bitmap[] f14876g = new Bitmap[3];
    public final Canvas[] h = new Canvas[3];
    public final LinearGradient[] f14877i = new LinearGradient[3];
    public final Matrix[] f14878j = new Matrix[3];
    public final int[] f14880l = new int[2];
    public float f14885q = 1.0f;
    public final SparseArray f14886r = new SparseArray();
    public boolean f14887s = true;
    public boolean f14888t = false;

    public static void a(c00 c00Var, Object obj, Paint paint) {
        c00Var.f14872a.add(obj);
        c00Var.f14873b.put(obj, new Paint(paint));
    }

    public final c00 clone() {
        c00 c00Var = new c00();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f14872a;
            if (i10 < arrayList.size()) {
                c00Var.f14872a.add(arrayList.get(i10));
                Paint paint = (Paint) this.f14873b.get(arrayList.get(i10));
                if (paint != null) {
                    Paint paint2 = new Paint();
                    paint2.setColor(paint.getColor());
                    paint2.setStrokeCap(paint.getStrokeCap());
                    paint2.setStrokeJoin(paint.getStrokeJoin());
                    paint2.setStrokeWidth(paint.getStrokeWidth());
                    paint2.setStyle(paint.getStyle());
                    c00Var.f14873b.put(arrayList.get(i10), paint2);
                }
                i10++;
            } else {
                c00Var.e = this.e;
                c00Var.f14875f = this.f14875f;
                return c00Var;
            }
        }
    }

    public final void c(Canvas canvas, boolean z10, int i10, long j10, float f7, float f10, float f11, float f12) {
        float min;
        long j11;
        int i11;
        int i12;
        long j12;
        int i13 = this.f14881m;
        if (i13 >= 0) {
            f(i13, this.f14883o, this.f14884p, z10);
        }
        float f13 = ((int) f11) / this.e;
        float f14 = ((int) f12) / this.f14875f;
        if (this.f14887s) {
            min = Math.max(f13, f14);
        } else {
            min = Math.min(f13, f14);
        }
        LinearGradient[] linearGradientArr = this.f14877i;
        if (linearGradientArr[i10] != null) {
            float f15 = f14868w;
            if (f15 > 0.0f && A) {
                long j13 = 64;
                if (z10) {
                    long j14 = j10 - f14869x;
                    if (j14 > 64) {
                        j12 = 64;
                    } else {
                        j12 = j14;
                    }
                    if (j12 > 0) {
                        f14869x = j10;
                        v = a1.g.A((float) j12, f15, 1800.0f, v);
                        while (true) {
                            float f16 = v;
                            float f17 = f14868w * 2.0f;
                            if (f16 < f17) {
                                break;
                            }
                            v = f16 - f17;
                        }
                    }
                } else if (f14870y == null || f14871z.get() == this) {
                    long j15 = j10 - f14869x;
                    if (j15 <= 64) {
                        j13 = j15;
                    }
                    if (j13 < 0) {
                        j11 = 0;
                    } else {
                        j11 = j13;
                    }
                    f14869x = j10;
                    v = a1.g.A((float) j11, f14868w, 1800.0f, v);
                    while (true) {
                        float f18 = v;
                        float f19 = f14868w;
                        if (f18 < f19 / 2.0f) {
                            break;
                        }
                        v = f18 - f19;
                    }
                    f14871z = new WeakReference(this);
                    rz rzVar = f14870y;
                    if (rzVar != null) {
                        i0.r(rzVar);
                    }
                    rz rzVar2 = new rz(1);
                    f14870y = rzVar2;
                    i0.h3(rzVar2, ((int) (1000.0f / i0.f16027r)) - 1);
                }
                ImageReceiver imageReceiver = this.f14879k;
                if (imageReceiver != null && !z10) {
                    View view = imageReceiver.e;
                    int[] iArr = f14867u;
                    if (view != null) {
                        view.getLocationInWindow(iArr);
                    }
                    i11 = iArr[0];
                } else {
                    i11 = 0;
                }
                if (z10) {
                    i12 = i10 + 1;
                } else {
                    i12 = 0;
                }
                Matrix[] matrixArr = this.f14878j;
                Matrix matrix = matrixArr[i12];
                if (matrix != null) {
                    matrix.reset();
                    if (z10) {
                        matrixArr[i12].postTranslate(((-i11) + v) - f7, 0.0f);
                    } else {
                        matrixArr[i12].postTranslate(((-i11) + v) - f7, 0.0f);
                    }
                    float f20 = 1.0f / min;
                    matrixArr[i12].postScale(f20, f20);
                    linearGradientArr[i12].setLocalMatrix(matrixArr[i12]);
                    ImageReceiver imageReceiver2 = this.f14879k;
                    if (imageReceiver2 != null && !z10) {
                        imageReceiver2.invalidate();
                    }
                }
            }
        }
        canvas.save();
        canvas.translate(f7, f10);
        if (!this.f14887s || this.f14888t) {
            canvas.translate(c3.i0.g(this.e, min, f11, 2.0f), c3.i0.g(this.f14875f, min, f12, 2.0f));
        }
        canvas.scale(min, min);
        ArrayList arrayList = this.f14872a;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = arrayList.get(i14);
            if (obj instanceof Matrix) {
                canvas.save();
                canvas.concat((Matrix) obj);
            } else if (obj == null) {
                canvas.restore();
            } else {
                Paint paint = (Paint) this.f14886r.get(i14);
                if (paint == null) {
                    paint = this.f14874c;
                }
                if (z10) {
                    paint = this.d;
                } else if (paint == null) {
                    paint = (Paint) this.f14873b.get(obj);
                }
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (this.f14885q * alpha));
                if (obj instanceof Path) {
                    canvas.drawPath((Path) obj, paint);
                } else if (obj instanceof Rect) {
                    canvas.drawRect((Rect) obj, paint);
                } else if (obj instanceof RectF) {
                    canvas.drawRect((RectF) obj, paint);
                } else if (obj instanceof wz) {
                    wz wzVar = (wz) obj;
                    canvas.drawLine(wzVar.f19162a, wzVar.f19163b, wzVar.f19164c, wzVar.d, paint);
                } else if (obj instanceof vz) {
                    vz vzVar = (vz) obj;
                    canvas.drawCircle(vzVar.f19018a, vzVar.f19019b, vzVar.f19020c, paint);
                } else if (obj instanceof xz) {
                    canvas.drawOval(((xz) obj).f19314a, paint);
                } else if (obj instanceof zz) {
                    zz zzVar = (zz) obj;
                    RectF rectF = zzVar.f19787a;
                    float f21 = zzVar.f19788b;
                    canvas.drawRoundRect(rectF, f21, f21, paint);
                }
                paint.setAlpha(alpha);
            }
        }
        canvas.restore();
    }

    public final void d() {
        this.f14888t = true;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas, false, 0, System.currentTimeMillis(), getBounds().left, getBounds().top, getBounds().width(), getBounds().height());
    }

    public final void e(int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f14881m = i10;
        this.f14883o = p6Var;
    }

    public final void f(int i10, org.telegram.ui.ActionBar.p6 p6Var, float f7, boolean z10) {
        int intValue;
        BitmapShader bitmapShader;
        Integer num = this.f14882n;
        if (num == null) {
            intValue = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        } else {
            intValue = num.intValue();
        }
        this.f14883o = p6Var;
        int[] iArr = this.f14880l;
        if (iArr[z10 ? 1 : 0] != intValue) {
            this.f14884p = f7;
            this.f14881m = i10;
            iArr[z10 ? 1 : 0] = intValue;
            f14868w = i0.f16026q.x * 2;
            boolean z11 = A;
            HashMap hashMap = this.f14873b;
            if (!z11) {
                int o10 = i0.b.o(intValue, 70);
                if (z10) {
                    if (this.d == null) {
                        this.d = new Paint(1);
                    }
                    this.d.setShader(null);
                    this.d.setColor(o10);
                    return;
                }
                for (Paint paint : hashMap.values()) {
                    paint.setShader(null);
                    paint.setColor(o10);
                }
                return;
            }
            float L = i0.L(180.0f) / f14868w;
            int argb = Color.argb((int) ((Color.alpha(intValue) / 2) * this.f14884p), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
            float f10 = (1.0f - L) / 2.0f;
            float f11 = L / 2.0f;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f14868w, 0.0f, new int[]{0, 0, argb, 0, 0}, new float[]{0.0f, f10 - f11, f10, f11 + f10, 1.0f}, tileMode);
            LinearGradient[] linearGradientArr = this.f14877i;
            linearGradientArr[z10 ? 1 : 0] = linearGradient;
            if (Build.VERSION.SDK_INT >= 28) {
                bitmapShader = new LinearGradient(0.0f, 0.0f, f14868w, 0.0f, new int[]{argb, argb}, (float[]) null, tileMode);
            } else {
                Bitmap[] bitmapArr = this.f14876g;
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
            this.f14878j[z10 ? 1 : 0] = matrix;
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
        return this.e;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f14875f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f14885q = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
