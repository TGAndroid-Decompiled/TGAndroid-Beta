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
public final class pz extends Drawable {
    public static float v;
    public static float f26022w;
    public static long f26023x;
    public static c6 f26024y;
    public static WeakReference f26025z;
    public Paint f26028c;
    public Paint d;
    public int f26029e;
    public int f26030f;
    public ImageReceiver f26034k;
    public int f26036m;
    public Integer f26037n;
    public org.telegram.ui.ActionBar.e6 f26038o;
    public float f26039p;
    public static final int[] f26021u = new int[2];
    public static boolean A = qc.e(32);
    public final ArrayList f26026a = new ArrayList();
    public final HashMap f26027b = new HashMap();
    public final Bitmap[] f26031g = new Bitmap[3];
    public final Canvas[] h = new Canvas[3];
    public final LinearGradient[] f26032i = new LinearGradient[3];
    public final Matrix[] f26033j = new Matrix[3];
    public final int[] f26035l = new int[2];
    public float f26040q = 1.0f;
    public final SparseArray f26041r = new SparseArray();
    public boolean f26042s = true;
    public boolean f26043t = false;

    public static void a(pz pzVar, Object obj, Paint paint) {
        pzVar.f26026a.add(obj);
        pzVar.f26027b.put(obj, new Paint(paint));
    }

    public final pz clone() {
        pz pzVar = new pz();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f26026a;
            if (i7 < arrayList.size()) {
                pzVar.f26026a.add(arrayList.get(i7));
                Paint paint = (Paint) this.f26027b.get(arrayList.get(i7));
                if (paint != null) {
                    Paint paint2 = new Paint();
                    paint2.setColor(paint.getColor());
                    paint2.setStrokeCap(paint.getStrokeCap());
                    paint2.setStrokeJoin(paint.getStrokeJoin());
                    paint2.setStrokeWidth(paint.getStrokeWidth());
                    paint2.setStyle(paint.getStyle());
                    pzVar.f26027b.put(arrayList.get(i7), paint2);
                }
                i7++;
            } else {
                pzVar.f26029e = this.f26029e;
                pzVar.f26030f = this.f26030f;
                return pzVar;
            }
        }
    }

    public final void c(Canvas canvas, boolean z10, int i7, long j3, float f10, float f11, float f12, float f13) {
        float min;
        long j10;
        int i10;
        int i11;
        long j11;
        int i12 = this.f26036m;
        if (i12 >= 0) {
            f(i12, this.f26038o, this.f26039p, z10);
        }
        float f14 = ((int) f12) / this.f26029e;
        float f15 = ((int) f13) / this.f26030f;
        if (this.f26042s) {
            min = Math.max(f14, f15);
        } else {
            min = Math.min(f14, f15);
        }
        LinearGradient[] linearGradientArr = this.f26032i;
        if (linearGradientArr[i7] != null) {
            float f16 = f26022w;
            if (f16 > 0.0f && A) {
                long j12 = 64;
                if (z10) {
                    long j13 = j3 - f26023x;
                    if (j13 > 64) {
                        j11 = 64;
                    } else {
                        j11 = j13;
                    }
                    if (j11 > 0) {
                        f26023x = j3;
                        v = a8.p0.f((float) j11, f16, 1800.0f, v);
                        while (true) {
                            float f17 = v;
                            float f18 = f26022w * 2.0f;
                            if (f17 < f18) {
                                break;
                            }
                            v = f17 - f18;
                        }
                    }
                } else if (f26024y == null || f26025z.get() == this) {
                    long j14 = j3 - f26023x;
                    if (j14 <= 64) {
                        j12 = j14;
                    }
                    if (j12 < 0) {
                        j10 = 0;
                    } else {
                        j10 = j12;
                    }
                    f26023x = j3;
                    v = a8.p0.f((float) j10, f26022w, 1800.0f, v);
                    while (true) {
                        float f19 = v;
                        float f20 = f26022w;
                        if (f19 < f20 / 2.0f) {
                            break;
                        }
                        v = f19 - f20;
                    }
                    f26025z = new WeakReference(this);
                    c6 c6Var = f26024y;
                    if (c6Var != null) {
                        g0.r(c6Var);
                    }
                    c6 c6Var2 = new c6(16);
                    f26024y = c6Var2;
                    g0.i3(c6Var2, ((int) (1000.0f / g0.f23612r)) - 1);
                }
                ImageReceiver imageReceiver = this.f26034k;
                if (imageReceiver != null && !z10) {
                    View view = imageReceiver.f22267e;
                    int[] iArr = f26021u;
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
                Matrix[] matrixArr = this.f26033j;
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
                    ImageReceiver imageReceiver2 = this.f26034k;
                    if (imageReceiver2 != null && !z10) {
                        imageReceiver2.invalidate();
                    }
                }
            }
        }
        canvas.save();
        canvas.translate(f10, f11);
        if (!this.f26042s || this.f26043t) {
            canvas.translate(com.google.android.gms.internal.vision.e2.w(this.f26029e, min, f12, 2.0f), com.google.android.gms.internal.vision.e2.w(this.f26030f, min, f13, 2.0f));
        }
        canvas.scale(min, min);
        ArrayList arrayList = this.f26026a;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = arrayList.get(i13);
            if (obj instanceof Matrix) {
                canvas.save();
                canvas.concat((Matrix) obj);
            } else if (obj == null) {
                canvas.restore();
            } else {
                Paint paint = (Paint) this.f26041r.get(i13);
                if (paint == null) {
                    paint = this.f26028c;
                }
                if (z10) {
                    paint = this.d;
                } else if (paint == null) {
                    paint = (Paint) this.f26027b.get(obj);
                }
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (this.f26040q * alpha));
                if (obj instanceof Path) {
                    canvas.drawPath((Path) obj, paint);
                } else if (obj instanceof Rect) {
                    canvas.drawRect((Rect) obj, paint);
                } else if (obj instanceof RectF) {
                    canvas.drawRect((RectF) obj, paint);
                } else if (obj instanceof jz) {
                    jz jzVar = (jz) obj;
                    canvas.drawLine(jzVar.f24618a, jzVar.f24619b, jzVar.f24620c, jzVar.d, paint);
                } else if (obj instanceof iz) {
                    iz izVar = (iz) obj;
                    canvas.drawCircle(izVar.f24492a, izVar.f24493b, izVar.f24494c, paint);
                } else if (obj instanceof kz) {
                    canvas.drawOval(((kz) obj).f24785a, paint);
                } else if (obj instanceof mz) {
                    mz mzVar = (mz) obj;
                    RectF rectF = mzVar.f25127a;
                    float f22 = mzVar.f25128b;
                    canvas.drawRoundRect(rectF, f22, f22, paint);
                }
                paint.setAlpha(alpha);
            }
        }
        canvas.restore();
    }

    public final void d() {
        this.f26043t = true;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas, false, 0, System.currentTimeMillis(), getBounds().left, getBounds().top, getBounds().width(), getBounds().height());
    }

    public final void e(int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f26036m = i7;
        this.f26038o = e6Var;
    }

    public final void f(int i7, org.telegram.ui.ActionBar.e6 e6Var, float f10, boolean z10) {
        int intValue;
        BitmapShader bitmapShader;
        Integer num = this.f26037n;
        if (num == null) {
            intValue = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        } else {
            intValue = num.intValue();
        }
        this.f26038o = e6Var;
        int[] iArr = this.f26035l;
        if (iArr[z10 ? 1 : 0] != intValue) {
            this.f26039p = f10;
            this.f26036m = i7;
            iArr[z10 ? 1 : 0] = intValue;
            f26022w = g0.f23611q.x * 2;
            boolean z11 = A;
            HashMap hashMap = this.f26027b;
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
            float L = g0.L(180.0f) / f26022w;
            int argb = Color.argb((int) ((Color.alpha(intValue) / 2) * this.f26039p), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
            float f11 = (1.0f - L) / 2.0f;
            float f12 = L / 2.0f;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f26022w, 0.0f, new int[]{0, 0, argb, 0, 0}, new float[]{0.0f, f11 - f12, f11, f12 + f11, 1.0f}, tileMode);
            LinearGradient[] linearGradientArr = this.f26032i;
            linearGradientArr[z10 ? 1 : 0] = linearGradient;
            if (Build.VERSION.SDK_INT >= 28) {
                bitmapShader = new LinearGradient(0.0f, 0.0f, f26022w, 0.0f, new int[]{argb, argb}, (float[]) null, tileMode);
            } else {
                Bitmap[] bitmapArr = this.f26031g;
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
            this.f26033j[z10 ? 1 : 0] = matrix;
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
        return this.f26029e;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f26030f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f26040q = i7 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
