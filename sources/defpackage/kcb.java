package defpackage;

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
import org.telegram.messenger.ImageReceiver;
public final class kcb extends Drawable {
    public static float v;
    public static float w;
    public static long x;
    public static cza y;
    public static WeakReference z;
    public Paint c;
    public Paint d;
    public int e;
    public int f;
    public ImageReceiver k;
    public int m;
    public Integer n;
    public wjb o;
    public float p;
    public static final int[] u = new int[2];
    public static boolean A = e66.e(32);
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final Bitmap[] g = new Bitmap[3];
    public final Canvas[] h = new Canvas[3];
    public final LinearGradient[] i = new LinearGradient[3];
    public final Matrix[] j = new Matrix[3];
    public final int[] l = new int[2];
    public float q = 1.0f;
    public final SparseArray r = new SparseArray();
    public boolean s = true;
    public boolean t = false;

    public final void a(Object obj, Paint paint) {
        this.a.add(obj);
        this.b.put(obj, new Paint(paint));
    }

    public final kcb clone() {
        kcb kcbVar = new kcb();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                kcbVar.a.add(arrayList.get(i));
                Paint paint = (Paint) this.b.get(arrayList.get(i));
                if (paint != null) {
                    Paint paint2 = new Paint();
                    paint2.setColor(paint.getColor());
                    paint2.setStrokeCap(paint.getStrokeCap());
                    paint2.setStrokeJoin(paint.getStrokeJoin());
                    paint2.setStrokeWidth(paint.getStrokeWidth());
                    paint2.setStyle(paint.getStyle());
                    kcbVar.b.put(arrayList.get(i), paint2);
                }
                i++;
            } else {
                kcbVar.e = this.e;
                kcbVar.f = this.f;
                return kcbVar;
            }
        }
    }

    public final void c(Canvas canvas, boolean z2, int i, long j, float f, float f2, float f3, float f4) {
        float min;
        long j2;
        int i2;
        int i3;
        long j3;
        int i4 = this.m;
        if (i4 >= 0) {
            e(i4, this.o, this.p, z2);
        }
        float f5 = ((int) f3) / this.e;
        float f6 = ((int) f4) / this.f;
        if (this.s) {
            min = Math.max(f5, f6);
        } else {
            min = Math.min(f5, f6);
        }
        LinearGradient[] linearGradientArr = this.i;
        if (linearGradientArr[i] != null) {
            float f7 = w;
            if (f7 > 0.0f && A) {
                long j4 = 64;
                if (z2) {
                    long j5 = j - x;
                    if (j5 > 64) {
                        j3 = 64;
                    } else {
                        j3 = j5;
                    }
                    if (j3 > 0) {
                        x = j;
                        v = ls6.d((float) j3, f7, 1800.0f, v);
                        while (true) {
                            float f8 = v;
                            float f9 = w * 2.0f;
                            if (f8 < f9) {
                                break;
                            }
                            v = f8 - f9;
                        }
                    }
                } else if (y == null || z.get() == this) {
                    long j6 = j - x;
                    if (j6 <= 64) {
                        j4 = j6;
                    }
                    if (j4 < 0) {
                        j2 = 0;
                    } else {
                        j2 = j4;
                    }
                    x = j;
                    v = ls6.d((float) j2, w, 1800.0f, v);
                    while (true) {
                        float f10 = v;
                        float f11 = w;
                        if (f10 < f11 / 2.0f) {
                            break;
                        }
                        v = f10 - f11;
                    }
                    z = new WeakReference(this);
                    cza czaVar = y;
                    if (czaVar != null) {
                        gl.r(czaVar);
                    }
                    cza czaVar2 = new cza((byte) 2);
                    y = czaVar2;
                    gl.e3(czaVar2, ((int) (1000.0f / gl.r)) - 1);
                }
                ImageReceiver imageReceiver = this.k;
                if (imageReceiver != null && !z2) {
                    View view = imageReceiver.e;
                    int[] iArr = u;
                    if (view != null) {
                        view.getLocationInWindow(iArr);
                    }
                    i2 = iArr[0];
                } else {
                    i2 = 0;
                }
                if (z2) {
                    i3 = i + 1;
                } else {
                    i3 = 0;
                }
                Matrix[] matrixArr = this.j;
                Matrix matrix = matrixArr[i3];
                if (matrix != null) {
                    matrix.reset();
                    if (z2) {
                        matrixArr[i3].postTranslate(((-i2) + v) - f, 0.0f);
                    } else {
                        matrixArr[i3].postTranslate(((-i2) + v) - f, 0.0f);
                    }
                    float f12 = 1.0f / min;
                    matrixArr[i3].postScale(f12, f12);
                    linearGradientArr[i3].setLocalMatrix(matrixArr[i3]);
                    ImageReceiver imageReceiver2 = this.k;
                    if (imageReceiver2 != null && !z2) {
                        imageReceiver2.invalidate();
                    }
                }
            }
        }
        canvas.save();
        canvas.translate(f, f2);
        if (!this.s || this.t) {
            canvas.translate(b00.b(this.e, min, f3, 2.0f), b00.b(this.f, min, f4, 2.0f));
        }
        canvas.scale(min, min);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = arrayList.get(i5);
            if (obj instanceof Matrix) {
                canvas.save();
                canvas.concat((Matrix) obj);
            } else if (obj == null) {
                canvas.restore();
            } else {
                Paint paint = (Paint) this.r.get(i5);
                if (paint == null) {
                    paint = this.c;
                }
                if (z2) {
                    paint = this.d;
                } else if (paint == null) {
                    paint = (Paint) this.b.get(obj);
                }
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (this.q * alpha));
                if (obj instanceof Path) {
                    canvas.drawPath((Path) obj, paint);
                } else if (obj instanceof Rect) {
                    canvas.drawRect((Rect) obj, paint);
                } else if (obj instanceof RectF) {
                    canvas.drawRect((RectF) obj, paint);
                } else if (obj instanceof ecb) {
                    ecb ecbVar = (ecb) obj;
                    canvas.drawLine(ecbVar.a, ecbVar.b, ecbVar.c, ecbVar.d, paint);
                } else if (obj instanceof dcb) {
                    dcb dcbVar = (dcb) obj;
                    canvas.drawCircle(dcbVar.a, dcbVar.b, dcbVar.c, paint);
                } else if (obj instanceof fcb) {
                    canvas.drawOval(((fcb) obj).a, paint);
                } else if (obj instanceof hcb) {
                    hcb hcbVar = (hcb) obj;
                    RectF rectF = hcbVar.a;
                    float f13 = hcbVar.b;
                    canvas.drawRoundRect(rectF, f13, f13, paint);
                }
                paint.setAlpha(alpha);
            }
        }
        canvas.restore();
    }

    public final void d(int i, wjb wjbVar) {
        this.m = i;
        this.o = wjbVar;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas, false, 0, System.currentTimeMillis(), getBounds().left, getBounds().top, getBounds().width(), getBounds().height());
    }

    public final void e(int i, wjb wjbVar, float f, boolean z2) {
        int intValue;
        BitmapShader bitmapShader;
        Integer num = this.n;
        if (num == null) {
            intValue = bkb.v0(i, wjbVar);
        } else {
            intValue = num.intValue();
        }
        this.o = wjbVar;
        int[] iArr = this.l;
        if (iArr[z2 ? 1 : 0] != intValue) {
            this.p = f;
            this.m = i;
            iArr[z2 ? 1 : 0] = intValue;
            w = gl.q.x << 1;
            boolean z3 = A;
            HashMap hashMap = this.b;
            if (!z3) {
                int o = bm2.o(intValue, 70);
                if (z2) {
                    Paint paint = this.d;
                    if (paint == null) {
                        paint = new Paint(1);
                        this.d = paint;
                    }
                    paint.setShader(null);
                    this.d.setColor(o);
                    return;
                }
                for (Paint paint2 : hashMap.values()) {
                    paint2.setShader(null);
                    paint2.setColor(o);
                }
                return;
            }
            float L = gl.L(180.0f) / w;
            int argb = Color.argb((int) ((Color.alpha(intValue) / 2) * this.p), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
            float f2 = (1.0f - L) / 2.0f;
            float f3 = L / 2.0f;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, w, 0.0f, new int[]{0, 0, argb, 0, 0}, new float[]{0.0f, f2 - f3, f2, f3 + f2, 1.0f}, tileMode);
            LinearGradient[] linearGradientArr = this.i;
            linearGradientArr[z2 ? 1 : 0] = linearGradient;
            if (Build.VERSION.SDK_INT >= 28) {
                bitmapShader = new LinearGradient(0.0f, 0.0f, w, 0.0f, new int[]{argb, argb}, (float[]) null, tileMode);
            } else {
                Bitmap[] bitmapArr = this.g;
                Bitmap bitmap = bitmapArr[z2 ? 1 : 0];
                Canvas[] canvasArr = this.h;
                if (bitmap == null) {
                    bitmapArr[z2 ? 1 : 0] = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                    canvasArr[z2 ? 1 : 0] = new Canvas(bitmapArr[z2 ? 1 : 0]);
                }
                canvasArr[z2 ? 1 : 0].drawColor(argb);
                bitmapShader = new BitmapShader(bitmapArr[z2 ? 1 : 0], tileMode, tileMode);
            }
            Matrix matrix = new Matrix();
            this.j[z2 ? 1 : 0] = matrix;
            linearGradientArr[z2 ? 1 : 0].setLocalMatrix(matrix);
            if (z2) {
                Paint paint3 = this.d;
                if (paint3 == null) {
                    paint3 = new Paint(1);
                    this.d = paint3;
                }
                paint3.setShader(new ComposeShader(linearGradientArr[z2 ? 1 : 0], bitmapShader, PorterDuff.Mode.ADD));
                return;
            }
            for (Paint paint4 : hashMap.values()) {
                paint4.setShader(new ComposeShader(linearGradientArr[z2 ? 1 : 0], bitmapShader, PorterDuff.Mode.ADD));
            }
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.e;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.q = i / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
