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
public final class jz extends Drawable {
    public static float v;
    public static float f23756w;
    public static long f23757x;
    public static hc f23758y;
    public static WeakReference f23759z;
    public Paint f23762c;
    public Paint d;
    public int f23763e;
    public int f23764f;
    public ImageReceiver f23768k;
    public int f23770m;
    public Integer f23771n;
    public org.telegram.ui.ActionBar.e6 f23772o;
    public float f23773p;
    public static final int[] f23755u = new int[2];
    public static boolean A = lc.e(32);
    public final ArrayList f23760a = new ArrayList();
    public final HashMap f23761b = new HashMap();
    public final Bitmap[] f23765g = new Bitmap[3];
    public final Canvas[] h = new Canvas[3];
    public final LinearGradient[] f23766i = new LinearGradient[3];
    public final Matrix[] f23767j = new Matrix[3];
    public final int[] f23769l = new int[2];
    public float f23774q = 1.0f;
    public final SparseArray f23775r = new SparseArray();
    public boolean f23776s = true;
    public boolean f23777t = false;

    public static void a(jz jzVar, Object obj, Paint paint) {
        jzVar.f23760a.add(obj);
        jzVar.f23761b.put(obj, new Paint(paint));
    }

    public final jz clone() {
        jz jzVar = new jz();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f23760a;
            if (i3 < arrayList.size()) {
                jzVar.f23760a.add(arrayList.get(i3));
                Paint paint = (Paint) this.f23761b.get(arrayList.get(i3));
                if (paint != null) {
                    Paint paint2 = new Paint();
                    paint2.setColor(paint.getColor());
                    paint2.setStrokeCap(paint.getStrokeCap());
                    paint2.setStrokeJoin(paint.getStrokeJoin());
                    paint2.setStrokeWidth(paint.getStrokeWidth());
                    paint2.setStyle(paint.getStyle());
                    jzVar.f23761b.put(arrayList.get(i3), paint2);
                }
                i3++;
            } else {
                jzVar.f23763e = this.f23763e;
                jzVar.f23764f = this.f23764f;
                return jzVar;
            }
        }
    }

    public final void c(Canvas canvas, boolean z10, int i3, long j10, float f10, float f11, float f12, float f13) {
        float min;
        long j11;
        int i10;
        int i11;
        long j12;
        int i12 = this.f23770m;
        if (i12 >= 0) {
            f(i12, this.f23772o, this.f23773p, z10);
        }
        float f14 = ((int) f12) / this.f23763e;
        float f15 = ((int) f13) / this.f23764f;
        if (this.f23776s) {
            min = Math.max(f14, f15);
        } else {
            min = Math.min(f14, f15);
        }
        LinearGradient[] linearGradientArr = this.f23766i;
        if (linearGradientArr[i3] != null) {
            float f16 = f23756w;
            if (f16 > 0.0f && A) {
                long j13 = 64;
                if (z10) {
                    long j14 = j10 - f23757x;
                    if (j14 > 64) {
                        j12 = 64;
                    } else {
                        j12 = j14;
                    }
                    if (j12 > 0) {
                        f23757x = j10;
                        v = a1.g.e((float) j12, f16, 1800.0f, v);
                        while (true) {
                            float f17 = v;
                            float f18 = f23756w * 2.0f;
                            if (f17 < f18) {
                                break;
                            }
                            v = f17 - f18;
                        }
                    }
                } else if (f23758y == null || f23759z.get() == this) {
                    long j15 = j10 - f23757x;
                    if (j15 <= 64) {
                        j13 = j15;
                    }
                    if (j13 < 0) {
                        j11 = 0;
                    } else {
                        j11 = j13;
                    }
                    f23757x = j10;
                    v = a1.g.e((float) j11, f23756w, 1800.0f, v);
                    while (true) {
                        float f19 = v;
                        float f20 = f23756w;
                        if (f19 < f20 / 2.0f) {
                            break;
                        }
                        v = f19 - f20;
                    }
                    f23759z = new WeakReference(this);
                    hc hcVar = f23758y;
                    if (hcVar != null) {
                        g0.r(hcVar);
                    }
                    hc hcVar2 = new hc(14);
                    f23758y = hcVar2;
                    g0.i3(hcVar2, ((int) (1000.0f / g0.f22609r)) - 1);
                }
                ImageReceiver imageReceiver = this.f23768k;
                if (imageReceiver != null && !z10) {
                    View view = imageReceiver.f21238e;
                    int[] iArr = f23755u;
                    if (view != null) {
                        view.getLocationInWindow(iArr);
                    }
                    i10 = iArr[0];
                } else {
                    i10 = 0;
                }
                if (z10) {
                    i11 = i3 + 1;
                } else {
                    i11 = 0;
                }
                Matrix[] matrixArr = this.f23767j;
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
                    ImageReceiver imageReceiver2 = this.f23768k;
                    if (imageReceiver2 != null && !z10) {
                        imageReceiver2.invalidate();
                    }
                }
            }
        }
        canvas.save();
        canvas.translate(f10, f11);
        if (!this.f23776s || this.f23777t) {
            canvas.translate(com.google.android.recaptcha.internal.a.c(this.f23763e, min, f12, 2.0f), com.google.android.recaptcha.internal.a.c(this.f23764f, min, f13, 2.0f));
        }
        canvas.scale(min, min);
        ArrayList arrayList = this.f23760a;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = arrayList.get(i13);
            if (obj instanceof Matrix) {
                canvas.save();
                canvas.concat((Matrix) obj);
            } else if (obj == null) {
                canvas.restore();
            } else {
                Paint paint = (Paint) this.f23775r.get(i13);
                if (paint == null) {
                    paint = this.f23762c;
                }
                if (z10) {
                    paint = this.d;
                } else if (paint == null) {
                    paint = (Paint) this.f23761b.get(obj);
                }
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (this.f23774q * alpha));
                if (obj instanceof Path) {
                    canvas.drawPath((Path) obj, paint);
                } else if (obj instanceof Rect) {
                    canvas.drawRect((Rect) obj, paint);
                } else if (obj instanceof RectF) {
                    canvas.drawRect((RectF) obj, paint);
                } else if (obj instanceof dz) {
                    dz dzVar = (dz) obj;
                    canvas.drawLine(dzVar.f22268a, dzVar.f22269b, dzVar.f22270c, dzVar.d, paint);
                } else if (obj instanceof cz) {
                    cz czVar = (cz) obj;
                    canvas.drawCircle(czVar.f22107a, czVar.f22108b, czVar.f22109c, paint);
                } else if (obj instanceof ez) {
                    canvas.drawOval(((ez) obj).f22425a, paint);
                } else if (obj instanceof gz) {
                    gz gzVar = (gz) obj;
                    RectF rectF = gzVar.f22807a;
                    float f22 = gzVar.f22808b;
                    canvas.drawRoundRect(rectF, f22, f22, paint);
                }
                paint.setAlpha(alpha);
            }
        }
        canvas.restore();
    }

    public final void d() {
        this.f23777t = true;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas, false, 0, System.currentTimeMillis(), getBounds().left, getBounds().top, getBounds().width(), getBounds().height());
    }

    public final void e(int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f23770m = i3;
        this.f23772o = e6Var;
    }

    public final void f(int i3, org.telegram.ui.ActionBar.e6 e6Var, float f10, boolean z10) {
        int intValue;
        BitmapShader bitmapShader;
        Integer num = this.f23771n;
        if (num == null) {
            intValue = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        } else {
            intValue = num.intValue();
        }
        this.f23772o = e6Var;
        int[] iArr = this.f23769l;
        if (iArr[z10 ? 1 : 0] != intValue) {
            this.f23773p = f10;
            this.f23770m = i3;
            iArr[z10 ? 1 : 0] = intValue;
            f23756w = g0.f22608q.x * 2;
            boolean z11 = A;
            HashMap hashMap = this.f23761b;
            if (!z11) {
                int o10 = i0.a.o(intValue, 70);
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
            float L = g0.L(180.0f) / f23756w;
            int argb = Color.argb((int) ((Color.alpha(intValue) / 2) * this.f23773p), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
            float f11 = (1.0f - L) / 2.0f;
            float f12 = L / 2.0f;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f23756w, 0.0f, new int[]{0, 0, argb, 0, 0}, new float[]{0.0f, f11 - f12, f11, f12 + f11, 1.0f}, tileMode);
            LinearGradient[] linearGradientArr = this.f23766i;
            linearGradientArr[z10 ? 1 : 0] = linearGradient;
            if (Build.VERSION.SDK_INT >= 28) {
                bitmapShader = new LinearGradient(0.0f, 0.0f, f23756w, 0.0f, new int[]{argb, argb}, (float[]) null, tileMode);
            } else {
                Bitmap[] bitmapArr = this.f23765g;
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
            this.f23767j[z10 ? 1 : 0] = matrix;
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
        return this.f23763e;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f23764f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
        this.f23774q = i3 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
