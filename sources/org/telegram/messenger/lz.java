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
public final class lz extends Drawable {
    public static float v;
    public static float f25507w;
    public static long f25508x;
    public static j2 f25509y;
    public static WeakReference f25510z;
    public Paint f25513c;
    public Paint d;
    public int f25514e;
    public int f25515f;
    public ImageReceiver f25519k;
    public int f25521m;
    public Integer f25522n;
    public org.telegram.ui.ActionBar.h6 f25523o;
    public float f25524p;
    public static final int[] f25506u = new int[2];
    public static boolean A = pc.e(32);
    public final ArrayList f25511a = new ArrayList();
    public final HashMap f25512b = new HashMap();
    public final Bitmap[] f25516g = new Bitmap[3];
    public final Canvas[] h = new Canvas[3];
    public final LinearGradient[] f25517i = new LinearGradient[3];
    public final Matrix[] f25518j = new Matrix[3];
    public final int[] f25520l = new int[2];
    public float f25525q = 1.0f;
    public final SparseArray f25526r = new SparseArray();
    public boolean f25527s = true;
    public boolean f25528t = false;

    public static void a(lz lzVar, Object obj, Paint paint) {
        lzVar.f25511a.add(obj);
        lzVar.f25512b.put(obj, new Paint(paint));
    }

    public final lz clone() {
        lz lzVar = new lz();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f25511a;
            if (i7 < arrayList.size()) {
                lzVar.f25511a.add(arrayList.get(i7));
                Paint paint = (Paint) this.f25512b.get(arrayList.get(i7));
                if (paint != null) {
                    Paint paint2 = new Paint();
                    paint2.setColor(paint.getColor());
                    paint2.setStrokeCap(paint.getStrokeCap());
                    paint2.setStrokeJoin(paint.getStrokeJoin());
                    paint2.setStrokeWidth(paint.getStrokeWidth());
                    paint2.setStyle(paint.getStyle());
                    lzVar.f25512b.put(arrayList.get(i7), paint2);
                }
                i7++;
            } else {
                lzVar.f25514e = this.f25514e;
                lzVar.f25515f = this.f25515f;
                return lzVar;
            }
        }
    }

    public final void c(Canvas canvas, boolean z10, int i7, long j3, float f10, float f11, float f12, float f13) {
        float min;
        long j10;
        int i10;
        int i11;
        long j11;
        int i12 = this.f25521m;
        if (i12 >= 0) {
            f(i12, this.f25523o, this.f25524p, z10);
        }
        float f14 = ((int) f12) / this.f25514e;
        float f15 = ((int) f13) / this.f25515f;
        if (this.f25527s) {
            min = Math.max(f14, f15);
        } else {
            min = Math.min(f14, f15);
        }
        LinearGradient[] linearGradientArr = this.f25517i;
        if (linearGradientArr[i7] != null) {
            float f16 = f25507w;
            if (f16 > 0.0f && A) {
                long j12 = 64;
                if (z10) {
                    long j13 = j3 - f25508x;
                    if (j13 > 64) {
                        j11 = 64;
                    } else {
                        j11 = j13;
                    }
                    if (j11 > 0) {
                        f25508x = j3;
                        v = a8.p0.f((float) j11, f16, 1800.0f, v);
                        while (true) {
                            float f17 = v;
                            float f18 = f25507w * 2.0f;
                            if (f17 < f18) {
                                break;
                            }
                            v = f17 - f18;
                        }
                    }
                } else if (f25509y == null || f25510z.get() == this) {
                    long j14 = j3 - f25508x;
                    if (j14 <= 64) {
                        j12 = j14;
                    }
                    if (j12 < 0) {
                        j10 = 0;
                    } else {
                        j10 = j12;
                    }
                    f25508x = j3;
                    v = a8.p0.f((float) j10, f25507w, 1800.0f, v);
                    while (true) {
                        float f19 = v;
                        float f20 = f25507w;
                        if (f19 < f20 / 2.0f) {
                            break;
                        }
                        v = f19 - f20;
                    }
                    f25510z = new WeakReference(this);
                    j2 j2Var = f25509y;
                    if (j2Var != null) {
                        g0.r(j2Var);
                    }
                    j2 j2Var2 = new j2(18);
                    f25509y = j2Var2;
                    g0.h3(j2Var2, ((int) (1000.0f / g0.f24147r)) - 1);
                }
                ImageReceiver imageReceiver = this.f25519k;
                if (imageReceiver != null && !z10) {
                    View view = imageReceiver.f22658e;
                    int[] iArr = f25506u;
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
                Matrix[] matrixArr = this.f25518j;
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
                    ImageReceiver imageReceiver2 = this.f25519k;
                    if (imageReceiver2 != null && !z10) {
                        imageReceiver2.invalidate();
                    }
                }
            }
        }
        canvas.save();
        canvas.translate(f10, f11);
        if (!this.f25527s || this.f25528t) {
            canvas.translate(com.google.android.gms.internal.vision.e2.w(this.f25514e, min, f12, 2.0f), com.google.android.gms.internal.vision.e2.w(this.f25515f, min, f13, 2.0f));
        }
        canvas.scale(min, min);
        ArrayList arrayList = this.f25511a;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = arrayList.get(i13);
            if (obj instanceof Matrix) {
                canvas.save();
                canvas.concat((Matrix) obj);
            } else if (obj == null) {
                canvas.restore();
            } else {
                Paint paint = (Paint) this.f25526r.get(i13);
                if (paint == null) {
                    paint = this.f25513c;
                }
                if (z10) {
                    paint = this.d;
                } else if (paint == null) {
                    paint = (Paint) this.f25512b.get(obj);
                }
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (this.f25525q * alpha));
                if (obj instanceof Path) {
                    canvas.drawPath((Path) obj, paint);
                } else if (obj instanceof Rect) {
                    canvas.drawRect((Rect) obj, paint);
                } else if (obj instanceof RectF) {
                    canvas.drawRect((RectF) obj, paint);
                } else if (obj instanceof ez) {
                    ez ezVar = (ez) obj;
                    canvas.drawLine(ezVar.f23832a, ezVar.f23833b, ezVar.f23834c, ezVar.d, paint);
                } else if (obj instanceof dz) {
                    dz dzVar = (dz) obj;
                    canvas.drawCircle(dzVar.f23635a, dzVar.f23636b, dzVar.f23637c, paint);
                } else if (obj instanceof gz) {
                    canvas.drawOval(((gz) obj).f24358a, paint);
                } else if (obj instanceof iz) {
                    iz izVar = (iz) obj;
                    RectF rectF = izVar.f24787a;
                    float f22 = izVar.f24788b;
                    canvas.drawRoundRect(rectF, f22, f22, paint);
                }
                paint.setAlpha(alpha);
            }
        }
        canvas.restore();
    }

    public final void d() {
        this.f25528t = true;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas, false, 0, System.currentTimeMillis(), getBounds().left, getBounds().top, getBounds().width(), getBounds().height());
    }

    public final void e(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f25521m = i7;
        this.f25523o = h6Var;
    }

    public final void f(int i7, org.telegram.ui.ActionBar.h6 h6Var, float f10, boolean z10) {
        int intValue;
        BitmapShader bitmapShader;
        Integer num = this.f25522n;
        if (num == null) {
            intValue = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        } else {
            intValue = num.intValue();
        }
        this.f25523o = h6Var;
        int[] iArr = this.f25520l;
        if (iArr[z10 ? 1 : 0] != intValue) {
            this.f25524p = f10;
            this.f25521m = i7;
            iArr[z10 ? 1 : 0] = intValue;
            f25507w = g0.f24146q.x * 2;
            boolean z11 = A;
            HashMap hashMap = this.f25512b;
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
            float L = g0.L(180.0f) / f25507w;
            int argb = Color.argb((int) ((Color.alpha(intValue) / 2) * this.f25524p), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
            float f11 = (1.0f - L) / 2.0f;
            float f12 = L / 2.0f;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f25507w, 0.0f, new int[]{0, 0, argb, 0, 0}, new float[]{0.0f, f11 - f12, f11, f12 + f11, 1.0f}, tileMode);
            LinearGradient[] linearGradientArr = this.f25517i;
            linearGradientArr[z10 ? 1 : 0] = linearGradient;
            if (Build.VERSION.SDK_INT >= 28) {
                bitmapShader = new LinearGradient(0.0f, 0.0f, f25507w, 0.0f, new int[]{argb, argb}, (float[]) null, tileMode);
            } else {
                Bitmap[] bitmapArr = this.f25516g;
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
            this.f25518j[z10 ? 1 : 0] = matrix;
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
        return this.f25514e;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f25515f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f25525q = i7 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
