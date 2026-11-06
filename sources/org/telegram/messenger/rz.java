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
    public static float f25379w;
    public static long f25380x;
    public static pd f25381y;
    public static WeakReference f25382z;
    public Paint f25385c;
    public Paint d;
    public int f25386e;
    public int f25387f;
    public ImageReceiver f25391k;
    public int f25393m;
    public Integer f25394n;
    public org.telegram.ui.ActionBar.f6 f25395o;
    public float f25396p;
    public static final int[] f25378u = new int[2];
    public static boolean A = rc.e(32);
    public final ArrayList f25383a = new ArrayList();
    public final HashMap f25384b = new HashMap();
    public final Bitmap[] f25388g = new Bitmap[3];
    public final Canvas[] h = new Canvas[3];
    public final LinearGradient[] f25389i = new LinearGradient[3];
    public final Matrix[] f25390j = new Matrix[3];
    public final int[] f25392l = new int[2];
    public float f25397q = 1.0f;
    public final SparseArray f25398r = new SparseArray();
    public boolean f25399s = true;
    public boolean f25400t = false;

    public static void a(rz rzVar, Object obj, Paint paint) {
        rzVar.f25383a.add(obj);
        rzVar.f25384b.put(obj, new Paint(paint));
    }

    public final rz clone() {
        rz rzVar = new rz();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f25383a;
            if (i7 < arrayList.size()) {
                rzVar.f25383a.add(arrayList.get(i7));
                Paint paint = (Paint) this.f25384b.get(arrayList.get(i7));
                if (paint != null) {
                    Paint paint2 = new Paint();
                    paint2.setColor(paint.getColor());
                    paint2.setStrokeCap(paint.getStrokeCap());
                    paint2.setStrokeJoin(paint.getStrokeJoin());
                    paint2.setStrokeWidth(paint.getStrokeWidth());
                    paint2.setStyle(paint.getStyle());
                    rzVar.f25384b.put(arrayList.get(i7), paint2);
                }
                i7++;
            } else {
                rzVar.f25386e = this.f25386e;
                rzVar.f25387f = this.f25387f;
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
        int i12 = this.f25393m;
        if (i12 >= 0) {
            f(i12, this.f25395o, this.f25396p, z9);
        }
        float f14 = ((int) f12) / this.f25386e;
        float f15 = ((int) f13) / this.f25387f;
        if (this.f25399s) {
            min = Math.max(f14, f15);
        } else {
            min = Math.min(f14, f15);
        }
        LinearGradient[] linearGradientArr = this.f25389i;
        if (linearGradientArr[i7] != null) {
            float f16 = f25379w;
            if (f16 > 0.0f && A) {
                long j12 = 64;
                if (z9) {
                    long j13 = j3 - f25380x;
                    if (j13 > 64) {
                        j11 = 64;
                    } else {
                        j11 = j13;
                    }
                    if (j11 > 0) {
                        f25380x = j3;
                        v = a8.p0.f((float) j11, f16, 1800.0f, v);
                        while (true) {
                            float f17 = v;
                            float f18 = f25379w * 2.0f;
                            if (f17 < f18) {
                                break;
                            }
                            v = f17 - f18;
                        }
                    }
                } else if (f25381y == null || f25382z.get() == this) {
                    long j14 = j3 - f25380x;
                    if (j14 <= 64) {
                        j12 = j14;
                    }
                    if (j12 < 0) {
                        j10 = 0;
                    } else {
                        j10 = j12;
                    }
                    f25380x = j3;
                    v = a8.p0.f((float) j10, f25379w, 1800.0f, v);
                    while (true) {
                        float f19 = v;
                        float f20 = f25379w;
                        if (f19 < f20 / 2.0f) {
                            break;
                        }
                        v = f19 - f20;
                    }
                    f25382z = new WeakReference(this);
                    pd pdVar = f25381y;
                    if (pdVar != null) {
                        g0.r(pdVar);
                    }
                    pd pdVar2 = new pd(10);
                    f25381y = pdVar2;
                    g0.i3(pdVar2, ((int) (1000.0f / g0.f22545r)) - 1);
                }
                ImageReceiver imageReceiver = this.f25391k;
                if (imageReceiver != null && !z9) {
                    View view = imageReceiver.f21185e;
                    int[] iArr = f25378u;
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
                Matrix[] matrixArr = this.f25390j;
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
                    ImageReceiver imageReceiver2 = this.f25391k;
                    if (imageReceiver2 != null && !z9) {
                        imageReceiver2.invalidate();
                    }
                }
            }
        }
        canvas.save();
        canvas.translate(f10, f11);
        if (!this.f25399s || this.f25400t) {
            canvas.translate(com.google.android.recaptcha.internal.a.w(this.f25386e, min, f12, 2.0f), com.google.android.recaptcha.internal.a.w(this.f25387f, min, f13, 2.0f));
        }
        canvas.scale(min, min);
        ArrayList arrayList = this.f25383a;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = arrayList.get(i13);
            if (obj instanceof Matrix) {
                canvas.save();
                canvas.concat((Matrix) obj);
            } else if (obj == null) {
                canvas.restore();
            } else {
                Paint paint = (Paint) this.f25398r.get(i13);
                if (paint == null) {
                    paint = this.f25385c;
                }
                if (z9) {
                    paint = this.d;
                } else if (paint == null) {
                    paint = (Paint) this.f25384b.get(obj);
                }
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (this.f25397q * alpha));
                if (obj instanceof Path) {
                    canvas.drawPath((Path) obj, paint);
                } else if (obj instanceof Rect) {
                    canvas.drawRect((Rect) obj, paint);
                } else if (obj instanceof RectF) {
                    canvas.drawRect((RectF) obj, paint);
                } else if (obj instanceof lz) {
                    lz lzVar = (lz) obj;
                    canvas.drawLine(lzVar.f23951a, lzVar.f23952b, lzVar.f23953c, lzVar.d, paint);
                } else if (obj instanceof kz) {
                    kz kzVar = (kz) obj;
                    canvas.drawCircle(kzVar.f23805a, kzVar.f23806b, kzVar.f23807c, paint);
                } else if (obj instanceof mz) {
                    canvas.drawOval(((mz) obj).f24107a, paint);
                } else if (obj instanceof oz) {
                    oz ozVar = (oz) obj;
                    RectF rectF = ozVar.f24421a;
                    float f22 = ozVar.f24422b;
                    canvas.drawRoundRect(rectF, f22, f22, paint);
                }
                paint.setAlpha(alpha);
            }
        }
        canvas.restore();
    }

    public final void d() {
        this.f25400t = true;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas, false, 0, System.currentTimeMillis(), getBounds().left, getBounds().top, getBounds().width(), getBounds().height());
    }

    public final void e(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f25393m = i7;
        this.f25395o = f6Var;
    }

    public final void f(int i7, org.telegram.ui.ActionBar.f6 f6Var, float f10, boolean z9) {
        int intValue;
        BitmapShader bitmapShader;
        Integer num = this.f25394n;
        if (num == null) {
            intValue = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        } else {
            intValue = num.intValue();
        }
        this.f25395o = f6Var;
        int[] iArr = this.f25392l;
        if (iArr[z9 ? 1 : 0] != intValue) {
            this.f25396p = f10;
            this.f25393m = i7;
            iArr[z9 ? 1 : 0] = intValue;
            f25379w = g0.f22544q.x * 2;
            boolean z10 = A;
            HashMap hashMap = this.f25384b;
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
            float L = g0.L(180.0f) / f25379w;
            int argb = Color.argb((int) ((Color.alpha(intValue) / 2) * this.f25396p), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
            float f11 = (1.0f - L) / 2.0f;
            float f12 = L / 2.0f;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f25379w, 0.0f, new int[]{0, 0, argb, 0, 0}, new float[]{0.0f, f11 - f12, f11, f12 + f11, 1.0f}, tileMode);
            LinearGradient[] linearGradientArr = this.f25389i;
            linearGradientArr[z9 ? 1 : 0] = linearGradient;
            if (Build.VERSION.SDK_INT >= 28) {
                bitmapShader = new LinearGradient(0.0f, 0.0f, f25379w, 0.0f, new int[]{argb, argb}, (float[]) null, tileMode);
            } else {
                Bitmap[] bitmapArr = this.f25388g;
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
            this.f25390j[z9 ? 1 : 0] = matrix;
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
        return this.f25386e;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f25387f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f25397q = i7 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
