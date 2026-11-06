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
public final class rz extends Drawable {
    public static float v;
    public static float f25371w;
    public static long f25372x;
    public static pd f25373y;
    public static WeakReference f25374z;
    public Paint f25377c;
    public Paint d;
    public int f25378e;
    public int f25379f;
    public ImageReceiver f25383k;
    public int f25385m;
    public Integer f25386n;
    public org.telegram.ui.ActionBar.f6 f25387o;
    public float f25388p;
    public static final int[] f25370u = new int[2];
    public static boolean A = rc.e(32);
    public final ArrayList f25375a = new ArrayList();
    public final HashMap f25376b = new HashMap();
    public final Bitmap[] f25380g = new Bitmap[3];
    public final Canvas[] h = new Canvas[3];
    public final LinearGradient[] f25381i = new LinearGradient[3];
    public final Matrix[] f25382j = new Matrix[3];
    public final int[] f25384l = new int[2];
    public float f25389q = 1.0f;
    public final SparseArray f25390r = new SparseArray();
    public boolean f25391s = true;
    public boolean f25392t = false;

    public static void a(rz rzVar, Object obj, Paint paint) {
        rzVar.f25375a.add(obj);
        rzVar.f25376b.put(obj, new Paint(paint));
    }

    public final rz clone() {
        rz rzVar = new rz();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f25375a;
            if (i7 < arrayList.size()) {
                rzVar.f25375a.add(arrayList.get(i7));
                Paint paint = (Paint) this.f25376b.get(arrayList.get(i7));
                if (paint != null) {
                    Paint paint2 = new Paint();
                    paint2.setColor(paint.getColor());
                    paint2.setStrokeCap(paint.getStrokeCap());
                    paint2.setStrokeJoin(paint.getStrokeJoin());
                    paint2.setStrokeWidth(paint.getStrokeWidth());
                    paint2.setStyle(paint.getStyle());
                    rzVar.f25376b.put(arrayList.get(i7), paint2);
                }
                i7++;
            } else {
                rzVar.f25378e = this.f25378e;
                rzVar.f25379f = this.f25379f;
                return rzVar;
            }
        }
    }

    public final void c(Canvas canvas, boolean z9, int i7, long j3, float f10, float f11, float f12, float f13) {
        float min;
        long j10;
        int i10;
        int i11;
        long j11;
        int i12 = this.f25385m;
        if (i12 >= 0) {
            f(i12, this.f25387o, this.f25388p, z9);
        }
        float f14 = ((int) f12) / this.f25378e;
        float f15 = ((int) f13) / this.f25379f;
        if (this.f25391s) {
            min = Math.max(f14, f15);
        } else {
            min = Math.min(f14, f15);
        }
        LinearGradient[] linearGradientArr = this.f25381i;
        if (linearGradientArr[i7] != null) {
            float f16 = f25371w;
            if (f16 > 0.0f && A) {
                long j12 = 64;
                if (z9) {
                    long j13 = j3 - f25372x;
                    if (j13 > 64) {
                        j11 = 64;
                    } else {
                        j11 = j13;
                    }
                    if (j11 > 0) {
                        f25372x = j3;
                        v = a8.p0.f((float) j11, f16, 1800.0f, v);
                        while (true) {
                            float f17 = v;
                            float f18 = f25371w * 2.0f;
                            if (f17 < f18) {
                                break;
                            }
                            v = f17 - f18;
                        }
                    }
                } else if (f25373y == null || f25374z.get() == this) {
                    long j14 = j3 - f25372x;
                    if (j14 <= 64) {
                        j12 = j14;
                    }
                    if (j12 < 0) {
                        j10 = 0;
                    } else {
                        j10 = j12;
                    }
                    f25372x = j3;
                    v = a8.p0.f((float) j10, f25371w, 1800.0f, v);
                    while (true) {
                        float f19 = v;
                        float f20 = f25371w;
                        if (f19 < f20 / 2.0f) {
                            break;
                        }
                        v = f19 - f20;
                    }
                    f25374z = new WeakReference(this);
                    pd pdVar = f25373y;
                    if (pdVar != null) {
                        g0.r(pdVar);
                    }
                    pd pdVar2 = new pd(10);
                    f25373y = pdVar2;
                    g0.i3(pdVar2, ((int) (1000.0f / g0.f22538r)) - 1);
                }
                ImageReceiver imageReceiver = this.f25383k;
                if (imageReceiver != null && !z9) {
                    View view = imageReceiver.f21185e;
                    int[] iArr = f25370u;
                    if (view != null) {
                        view.getLocationInWindow(iArr);
                    }
                    i10 = iArr[0];
                } else {
                    i10 = 0;
                }
                if (z9) {
                    i11 = i7 + 1;
                } else {
                    i11 = 0;
                }
                Matrix[] matrixArr = this.f25382j;
                Matrix matrix = matrixArr[i11];
                if (matrix != null) {
                    matrix.reset();
                    if (z9) {
                        matrixArr[i11].postTranslate(((-i10) + v) - f10, 0.0f);
                    } else {
                        matrixArr[i11].postTranslate(((-i10) + v) - f10, 0.0f);
                    }
                    float f21 = 1.0f / min;
                    matrixArr[i11].postScale(f21, f21);
                    linearGradientArr[i11].setLocalMatrix(matrixArr[i11]);
                    ImageReceiver imageReceiver2 = this.f25383k;
                    if (imageReceiver2 != null && !z9) {
                        imageReceiver2.invalidate();
                    }
                }
            }
        }
        canvas.save();
        canvas.translate(f10, f11);
        if (!this.f25391s || this.f25392t) {
            canvas.translate(com.google.android.recaptcha.internal.a.w(this.f25378e, min, f12, 2.0f), com.google.android.recaptcha.internal.a.w(this.f25379f, min, f13, 2.0f));
        }
        canvas.scale(min, min);
        ArrayList arrayList = this.f25375a;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = arrayList.get(i13);
            if (obj instanceof Matrix) {
                canvas.save();
                canvas.concat((Matrix) obj);
            } else if (obj == null) {
                canvas.restore();
            } else {
                Paint paint = (Paint) this.f25390r.get(i13);
                if (paint == null) {
                    paint = this.f25377c;
                }
                if (z9) {
                    paint = this.d;
                } else if (paint == null) {
                    paint = (Paint) this.f25376b.get(obj);
                }
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (this.f25389q * alpha));
                if (obj instanceof Path) {
                    canvas.drawPath((Path) obj, paint);
                } else if (obj instanceof Rect) {
                    canvas.drawRect((Rect) obj, paint);
                } else if (obj instanceof RectF) {
                    canvas.drawRect((RectF) obj, paint);
                } else if (obj instanceof lz) {
                    lz lzVar = (lz) obj;
                    canvas.drawLine(lzVar.f23944a, lzVar.f23945b, lzVar.f23946c, lzVar.d, paint);
                } else if (obj instanceof kz) {
                    kz kzVar = (kz) obj;
                    canvas.drawCircle(kzVar.f23798a, kzVar.f23799b, kzVar.f23800c, paint);
                } else if (obj instanceof mz) {
                    canvas.drawOval(((mz) obj).f24100a, paint);
                } else if (obj instanceof oz) {
                    oz ozVar = (oz) obj;
                    RectF rectF = ozVar.f24414a;
                    float f22 = ozVar.f24415b;
                    canvas.drawRoundRect(rectF, f22, f22, paint);
                }
                paint.setAlpha(alpha);
            }
        }
        canvas.restore();
    }

    public final void d() {
        this.f25392t = true;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas, false, 0, System.currentTimeMillis(), getBounds().left, getBounds().top, getBounds().width(), getBounds().height());
    }

    public final void e(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f25385m = i7;
        this.f25387o = f6Var;
    }

    public final void f(int i7, org.telegram.ui.ActionBar.f6 f6Var, float f10, boolean z9) {
        int intValue;
        BitmapShader bitmapShader;
        Integer num = this.f25386n;
        if (num == null) {
            intValue = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        } else {
            intValue = num.intValue();
        }
        this.f25387o = f6Var;
        int[] iArr = this.f25384l;
        if (iArr[z9 ? 1 : 0] != intValue) {
            this.f25388p = f10;
            this.f25385m = i7;
            iArr[z9 ? 1 : 0] = intValue;
            f25371w = g0.f22537q.x * 2;
            boolean z10 = A;
            HashMap hashMap = this.f25376b;
            if (!z10) {
                int o4 = i0.a.o(intValue, 70);
                if (z9) {
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
            float L = g0.L(180.0f) / f25371w;
            int argb = Color.argb((int) ((Color.alpha(intValue) / 2) * this.f25388p), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
            float f11 = (1.0f - L) / 2.0f;
            float f12 = L / 2.0f;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f25371w, 0.0f, new int[]{0, 0, argb, 0, 0}, new float[]{0.0f, f11 - f12, f11, f12 + f11, 1.0f}, tileMode);
            LinearGradient[] linearGradientArr = this.f25381i;
            linearGradientArr[z9 ? 1 : 0] = linearGradient;
            if (Build.VERSION.SDK_INT >= 28) {
                bitmapShader = new LinearGradient(0.0f, 0.0f, f25371w, 0.0f, new int[]{argb, argb}, (float[]) null, tileMode);
            } else {
                Bitmap[] bitmapArr = this.f25380g;
                Bitmap bitmap = bitmapArr[z9 ? 1 : 0];
                Canvas[] canvasArr = this.h;
                if (bitmap == null) {
                    bitmapArr[z9 ? 1 : 0] = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                    canvasArr[z9 ? 1 : 0] = new Canvas(bitmapArr[z9 ? 1 : 0]);
                }
                canvasArr[z9 ? 1 : 0].drawColor(argb);
                bitmapShader = new BitmapShader(bitmapArr[z9 ? 1 : 0], tileMode, tileMode);
            }
            Matrix matrix = new Matrix();
            this.f25382j[z9 ? 1 : 0] = matrix;
            linearGradientArr[z9 ? 1 : 0].setLocalMatrix(matrix);
            if (z9) {
                if (this.d == null) {
                    this.d = new Paint(1);
                }
                this.d.setShader(new ComposeShader(linearGradientArr[z9 ? 1 : 0], bitmapShader, PorterDuff.Mode.ADD));
                return;
            }
            for (Paint paint2 : hashMap.values()) {
                paint2.setShader(new ComposeShader(linearGradientArr[z9 ? 1 : 0], bitmapShader, PorterDuff.Mode.ADD));
            }
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f25378e;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f25379f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f25389q = i7 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
