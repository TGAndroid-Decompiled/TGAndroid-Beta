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
public final class mz extends Drawable {
    public static float v;
    public static float f25649w;
    public static long f25650x;
    public static j2 f25651y;
    public static WeakReference f25652z;
    public Paint f25655c;
    public Paint d;
    public int f25656e;
    public int f25657f;
    public ImageReceiver f25661k;
    public int f25663m;
    public Integer f25664n;
    public org.telegram.ui.ActionBar.h6 f25665o;
    public float f25666p;
    public static final int[] f25648u = new int[2];
    public static boolean A = qc.e(32);
    public final ArrayList f25653a = new ArrayList();
    public final HashMap f25654b = new HashMap();
    public final Bitmap[] f25658g = new Bitmap[3];
    public final Canvas[] h = new Canvas[3];
    public final LinearGradient[] f25659i = new LinearGradient[3];
    public final Matrix[] f25660j = new Matrix[3];
    public final int[] f25662l = new int[2];
    public float f25667q = 1.0f;
    public final SparseArray f25668r = new SparseArray();
    public boolean f25669s = true;
    public boolean f25670t = false;

    public static void a(mz mzVar, Object obj, Paint paint) {
        mzVar.f25653a.add(obj);
        mzVar.f25654b.put(obj, new Paint(paint));
    }

    public final mz clone() {
        mz mzVar = new mz();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f25653a;
            if (i7 < arrayList.size()) {
                mzVar.f25653a.add(arrayList.get(i7));
                Paint paint = (Paint) this.f25654b.get(arrayList.get(i7));
                if (paint != null) {
                    Paint paint2 = new Paint();
                    paint2.setColor(paint.getColor());
                    paint2.setStrokeCap(paint.getStrokeCap());
                    paint2.setStrokeJoin(paint.getStrokeJoin());
                    paint2.setStrokeWidth(paint.getStrokeWidth());
                    paint2.setStyle(paint.getStyle());
                    mzVar.f25654b.put(arrayList.get(i7), paint2);
                }
                i7++;
            } else {
                mzVar.f25656e = this.f25656e;
                mzVar.f25657f = this.f25657f;
                return mzVar;
            }
        }
    }

    public final void c(Canvas canvas, boolean z10, int i7, long j3, float f10, float f11, float f12, float f13) {
        float min;
        long j10;
        int i10;
        int i11;
        long j11;
        int i12 = this.f25663m;
        if (i12 >= 0) {
            f(i12, this.f25665o, this.f25666p, z10);
        }
        float f14 = ((int) f12) / this.f25656e;
        float f15 = ((int) f13) / this.f25657f;
        if (this.f25669s) {
            min = Math.max(f14, f15);
        } else {
            min = Math.min(f14, f15);
        }
        LinearGradient[] linearGradientArr = this.f25659i;
        if (linearGradientArr[i7] != null) {
            float f16 = f25649w;
            if (f16 > 0.0f && A) {
                long j12 = 64;
                if (z10) {
                    long j13 = j3 - f25650x;
                    if (j13 > 64) {
                        j11 = 64;
                    } else {
                        j11 = j13;
                    }
                    if (j11 > 0) {
                        f25650x = j3;
                        v = a8.p0.f((float) j11, f16, 1800.0f, v);
                        while (true) {
                            float f17 = v;
                            float f18 = f25649w * 2.0f;
                            if (f17 < f18) {
                                break;
                            }
                            v = f17 - f18;
                        }
                    }
                } else if (f25651y == null || f25652z.get() == this) {
                    long j14 = j3 - f25650x;
                    if (j14 <= 64) {
                        j12 = j14;
                    }
                    if (j12 < 0) {
                        j10 = 0;
                    } else {
                        j10 = j12;
                    }
                    f25650x = j3;
                    v = a8.p0.f((float) j10, f25649w, 1800.0f, v);
                    while (true) {
                        float f19 = v;
                        float f20 = f25649w;
                        if (f19 < f20 / 2.0f) {
                            break;
                        }
                        v = f19 - f20;
                    }
                    f25652z = new WeakReference(this);
                    j2 j2Var = f25651y;
                    if (j2Var != null) {
                        g0.r(j2Var);
                    }
                    j2 j2Var2 = new j2(18);
                    f25651y = j2Var2;
                    g0.h3(j2Var2, ((int) (1000.0f / g0.f24011r)) - 1);
                }
                ImageReceiver imageReceiver = this.f25661k;
                if (imageReceiver != null && !z10) {
                    View view = imageReceiver.f22625e;
                    int[] iArr = f25648u;
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
                Matrix[] matrixArr = this.f25660j;
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
                    ImageReceiver imageReceiver2 = this.f25661k;
                    if (imageReceiver2 != null && !z10) {
                        imageReceiver2.invalidate();
                    }
                }
            }
        }
        canvas.save();
        canvas.translate(f10, f11);
        if (!this.f25669s || this.f25670t) {
            canvas.translate(com.google.android.gms.internal.vision.e2.w(this.f25656e, min, f12, 2.0f), com.google.android.gms.internal.vision.e2.w(this.f25657f, min, f13, 2.0f));
        }
        canvas.scale(min, min);
        ArrayList arrayList = this.f25653a;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = arrayList.get(i13);
            if (obj instanceof Matrix) {
                canvas.save();
                canvas.concat((Matrix) obj);
            } else if (obj == null) {
                canvas.restore();
            } else {
                Paint paint = (Paint) this.f25668r.get(i13);
                if (paint == null) {
                    paint = this.f25655c;
                }
                if (z10) {
                    paint = this.d;
                } else if (paint == null) {
                    paint = (Paint) this.f25654b.get(obj);
                }
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (this.f25667q * alpha));
                if (obj instanceof Path) {
                    canvas.drawPath((Path) obj, paint);
                } else if (obj instanceof Rect) {
                    canvas.drawRect((Rect) obj, paint);
                } else if (obj instanceof RectF) {
                    canvas.drawRect((RectF) obj, paint);
                } else if (obj instanceof fz) {
                    fz fzVar = (fz) obj;
                    canvas.drawLine(fzVar.f23977a, fzVar.f23978b, fzVar.f23979c, fzVar.d, paint);
                } else if (obj instanceof ez) {
                    ez ezVar = (ez) obj;
                    canvas.drawCircle(ezVar.f23764a, ezVar.f23765b, ezVar.f23766c, paint);
                } else if (obj instanceof hz) {
                    canvas.drawOval(((hz) obj).f24525a, paint);
                } else if (obj instanceof jz) {
                    jz jzVar = (jz) obj;
                    RectF rectF = jzVar.f24923a;
                    float f22 = jzVar.f24924b;
                    canvas.drawRoundRect(rectF, f22, f22, paint);
                }
                paint.setAlpha(alpha);
            }
        }
        canvas.restore();
    }

    public final void d() {
        this.f25670t = true;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas, false, 0, System.currentTimeMillis(), getBounds().left, getBounds().top, getBounds().width(), getBounds().height());
    }

    public final void e(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f25663m = i7;
        this.f25665o = h6Var;
    }

    public final void f(int i7, org.telegram.ui.ActionBar.h6 h6Var, float f10, boolean z10) {
        int intValue;
        BitmapShader bitmapShader;
        Integer num = this.f25664n;
        if (num == null) {
            intValue = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        } else {
            intValue = num.intValue();
        }
        this.f25665o = h6Var;
        int[] iArr = this.f25662l;
        if (iArr[z10 ? 1 : 0] != intValue) {
            this.f25666p = f10;
            this.f25663m = i7;
            iArr[z10 ? 1 : 0] = intValue;
            f25649w = g0.f24010q.x * 2;
            boolean z11 = A;
            HashMap hashMap = this.f25654b;
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
            float L = g0.L(180.0f) / f25649w;
            int argb = Color.argb((int) ((Color.alpha(intValue) / 2) * this.f25666p), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
            float f11 = (1.0f - L) / 2.0f;
            float f12 = L / 2.0f;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f25649w, 0.0f, new int[]{0, 0, argb, 0, 0}, new float[]{0.0f, f11 - f12, f11, f12 + f11, 1.0f}, tileMode);
            LinearGradient[] linearGradientArr = this.f25659i;
            linearGradientArr[z10 ? 1 : 0] = linearGradient;
            if (Build.VERSION.SDK_INT >= 28) {
                bitmapShader = new LinearGradient(0.0f, 0.0f, f25649w, 0.0f, new int[]{argb, argb}, (float[]) null, tileMode);
            } else {
                Bitmap[] bitmapArr = this.f25658g;
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
            this.f25660j[z10 ? 1 : 0] = matrix;
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
        return this.f25656e;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f25657f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f25667q = i7 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
