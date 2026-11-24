package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
public final class ivc {
    public static final PorterDuff.Mode[] Y = {null, PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_OUT, PorterDuff.Mode.SRC_ATOP, PorterDuff.Mode.DST_OVER, PorterDuff.Mode.DST_IN, PorterDuff.Mode.DST_OUT, PorterDuff.Mode.DST_ATOP, PorterDuff.Mode.ADD, PorterDuff.Mode.SRC, PorterDuff.Mode.XOR, PorterDuff.Mode.MULTIPLY, PorterDuff.Mode.SCREEN, PorterDuff.Mode.OVERLAY, PorterDuff.Mode.DARKEN, PorterDuff.Mode.LIGHTEN};
    public float A;
    public float B;
    public float C;
    public float D;
    public int[] E;
    public float[] F;
    public int G;
    public int H;
    public float I;
    public float J;
    public float K;
    public float[] L;
    public int M;
    public int N;
    public int O;
    public String P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public boolean U;
    public boolean V;
    public volatile long W;
    public long X;
    public final Paint a = new Paint(3);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint();
    public final Paint d;
    public final Path e;
    public final Path f;
    public final Matrix g;
    public final Matrix h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public final RectF l;
    public final Rect m;
    public final int n;
    public Bitmap o;
    public Bitmap p;
    public Canvas q;
    public int r;
    public int s;
    public int[] t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public ivc(int i) {
        Paint paint = new Paint();
        this.d = paint;
        this.e = new Path();
        this.f = new Path();
        this.g = new Matrix();
        this.h = new Matrix();
        this.i = new float[9];
        this.j = new float[6];
        this.k = new float[8];
        this.l = new RectF();
        this.m = new Rect();
        this.s = -1;
        this.n = i;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static void b(int r3, android.graphics.Paint r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivc.b(int, android.graphics.Paint):void");
    }

    public final void a(Paint paint) {
        int[] iArr;
        if (this.x != 0 && (iArr = this.E) != null) {
            float[] fArr = this.F;
            paint.setColor(-16777216);
            int i = this.x;
            float[] fArr2 = this.j;
            if (i == 1) {
                paint.setShader(new LinearGradient(fArr2[0], fArr2[1], fArr2[2], fArr2[3], iArr, fArr, Shader.TileMode.CLAMP));
                return;
            } else if (i == 2) {
                float f = fArr2[2];
                float max = Math.max(fArr2[5], 0.01f);
                if (f > 0.0f && f < max) {
                    float[] fArr3 = new float[fArr.length];
                    for (int i2 = 0; i2 < fArr.length; i2++) {
                        float f2 = f / max;
                        fArr3[i2] = tb4.A(1.0f, f2, fArr[i2], f2);
                    }
                    fArr = fArr3;
                }
                paint.setShader(new RadialGradient(fArr2[3], fArr2[4], max, iArr, fArr, Shader.TileMode.CLAMP));
                return;
            } else {
                SweepGradient sweepGradient = new SweepGradient(fArr2[1], fArr2[2], iArr, fArr);
                Matrix matrix = new Matrix();
                matrix.setRotate((float) Math.toDegrees(fArr2[0]), fArr2[1], fArr2[2]);
                sweepGradient.setLocalMatrix(matrix);
                paint.setShader(sweepGradient);
                return;
            }
        }
        paint.setShader(null);
        paint.setColor(this.y);
    }

    public final void c(android.graphics.Canvas r23, defpackage.hvc r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivc.c(android.graphics.Canvas, hvc):void");
    }

    public final void d(Paint paint) {
        Paint.Cap cap;
        Paint.Join join;
        int i;
        paint.setStrokeWidth(this.I);
        int i2 = this.G;
        if (i2 == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i2 == 2) {
            cap = Paint.Cap.SQUARE;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
        int i3 = this.H;
        if (i3 == 1) {
            join = Paint.Join.ROUND;
        } else if (i3 == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(this.J);
        paint.setPathEffect(null);
        float[] fArr = this.L;
        if (fArr != null) {
            int length = fArr.length;
            if (length % 2 == 1) {
                i = length << 1;
            } else {
                i = length;
            }
            float[] fArr2 = new float[i];
            float f = 0.0f;
            for (int i4 = 0; i4 < i; i4++) {
                float max = Math.max(0.0f, this.L[i4 % length]);
                fArr2[i4] = max;
                f += max;
            }
            if (f > 0.0f) {
                paint.setPathEffect(new DashPathEffect(fArr2, this.K));
            }
        }
    }

    public final void e(int i) {
        if (i >= 0 && i <= this.t.length - this.u) {
            return;
        }
        w26.j("Canvas batch: count");
    }

    public final float f() {
        int[] iArr = this.t;
        int i = this.u;
        this.u = i + 1;
        return Float.intBitsToFloat(iArr[i]);
    }

    public final void g(Path path, boolean z) {
        int i;
        path.rewind();
        int[] iArr = this.t;
        int i2 = this.u;
        int i3 = i2 + 1;
        this.u = i3;
        int i4 = iArr[i2];
        this.u = i2 + 2;
        int i5 = iArr[i3];
        e(i4);
        if (i5 >= 0) {
            int[] iArr2 = this.t;
            int length = iArr2.length;
            int i6 = this.u;
            if (i5 <= (length - i6) - i4) {
                int i7 = i6 + i4;
                int i8 = i7 + i5;
                int i9 = i7;
                for (int i10 = i6; i10 < i7; i10++) {
                    int i11 = iArr2[i10];
                    if (i11 != 0 && i11 != 1) {
                        if (i11 == 2) {
                            i = 4;
                        } else if (i11 == 3) {
                            i = 6;
                        } else {
                            i = 0;
                        }
                    } else {
                        i = 2;
                    }
                    if (i + i9 <= i8) {
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    if (i11 != 3) {
                                        if (i11 == 4) {
                                            path.close();
                                        }
                                    } else {
                                        path.cubicTo(Float.intBitsToFloat(iArr2[i9]), Float.intBitsToFloat(iArr2[i9 + 1]), Float.intBitsToFloat(iArr2[i9 + 2]), Float.intBitsToFloat(iArr2[i9 + 3]), Float.intBitsToFloat(iArr2[i9 + 4]), Float.intBitsToFloat(iArr2[i9 + 5]));
                                        i9 += 6;
                                    }
                                } else {
                                    path.quadTo(Float.intBitsToFloat(iArr2[i9]), Float.intBitsToFloat(iArr2[i9 + 1]), Float.intBitsToFloat(iArr2[i9 + 2]), Float.intBitsToFloat(iArr2[i9 + 3]));
                                    i9 += 4;
                                }
                            } else {
                                path.lineTo(Float.intBitsToFloat(iArr2[i9]), Float.intBitsToFloat(iArr2[i9 + 1]));
                            }
                        } else {
                            path.moveTo(Float.intBitsToFloat(iArr2[i9]), Float.intBitsToFloat(iArr2[i9 + 1]));
                        }
                        i9 += 2;
                    } else {
                        w26.j("Canvas batch: path");
                        return;
                    }
                }
                this.u = i4 + i5 + this.u;
                if (z) {
                    path.setFillType(Path.FillType.WINDING);
                    return;
                }
                return;
            }
        }
        w26.j("Canvas batch: count");
    }

    public final void h(defpackage.hvc r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivc.h(hvc):void");
    }

    public final synchronized void i() {
        Bitmap bitmap = this.o;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.o = null;
        this.q = null;
        this.p = null;
    }

    public final synchronized Bitmap j() {
        Bitmap copy;
        Bitmap bitmap = this.o;
        if (bitmap == null) {
            return null;
        }
        if (this.s != this.r || (copy = this.p) == null) {
            copy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            this.p = copy;
            this.s = this.r;
        }
        return copy;
    }
}
