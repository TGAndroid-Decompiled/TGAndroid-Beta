package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
public final class ima extends nf0 {
    public long[] E1;

    public ima(Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.x0 = true;
        this.y0 = true;
    }

    @Override
    public final void C(int i, int i2) {
        float f;
        int b;
        fk1 fk1Var = this.i0;
        if (fk1Var != null) {
            int i3 = this.t0;
            float f2 = this.H0;
            float f3 = (this.h0.k * f2) - nf0.l1;
            hma hmaVar = (hma) fk1Var;
            float[] fArr = hmaVar.b;
            if (fArr.length < 2) {
                f = 1.0f;
            } else {
                f = fArr[1] * f2;
            }
            float f4 = (i + f3) / (f2 - f);
            if (f4 < 0.0f) {
                this.t0 = 0;
                b = 0;
            } else if (f4 > 1.0f) {
                b = hmaVar.a.length - 1;
                this.t0 = b;
            } else {
                b = hmaVar.b(f4, this.G, this.H);
                this.t0 = b;
                int i4 = this.H;
                if (b > i4) {
                    this.t0 = i4;
                    b = i4;
                }
                int i5 = this.G;
                if (b < i5) {
                    this.t0 = i5;
                    b = i5;
                }
            }
            if (i3 != b) {
                this.v0 = true;
                c(true);
                x(f3);
                lf0 lf0Var = this.R0;
                if (lf0Var != null) {
                    getSelectedDate();
                    dxa dxaVar = (dxa) ((wh9) lf0Var).b;
                    dxaVar.f();
                    dxaVar.b.u0.d(false, false);
                }
                invalidate();
                B();
            }
        }
    }

    @Override
    public final void K() {
        if (nf0.C1) {
            int length = ((hma) this.i0).a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j = 0;
            for (int i = 0; i < length; i++) {
                long j2 = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    jma jmaVar = (jma) arrayList.get(i2);
                    if (jmaVar.n) {
                        j2 += jmaVar.a.a[i];
                    }
                }
                if (j2 > j) {
                    j = j2;
                }
            }
            if (j > 0) {
                float f = (float) j;
                if (f != this.m0) {
                    this.m0 = f;
                    Animator animator = this.e0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = nf0.e(this.k0, this.m0, new ae0(this, (byte) 14));
                    this.e0 = e;
                    e.start();
                }
            }
        }
    }

    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public final k26 h(ek1 ek1Var) {
        return new jma(ek1Var, this.X0);
    }

    @Override
    public final void k(Canvas canvas) {
        float f;
        float f2;
        ArrayList arrayList;
        float f3;
        float f4;
        int i;
        Paint paint;
        float f5;
        float f6;
        int i2;
        int i3;
        Canvas canvas2 = canvas;
        fk1 fk1Var = this.i0;
        if (fk1Var == null) {
            return;
        }
        float f7 = this.G0;
        lk1 lk1Var = this.h0;
        float f8 = lk1Var.l;
        float f9 = lk1Var.k;
        float f10 = f7 / (f8 - f9);
        float f11 = nf0.l1;
        float f12 = (f9 * f10) - f11;
        float[] fArr = ((hma) fk1Var).b;
        boolean z = true;
        if (fArr.length < 2) {
            f2 = 1.0f;
            f = 1.0f;
        } else {
            float f13 = fArr[1];
            float f14 = f13 * f10;
            f = (f10 - f14) * f13;
            f2 = f14;
        }
        int i4 = ((int) (f11 / f2)) + 1;
        int i5 = 0;
        int max = Math.max(0, (this.G - i4) - 2);
        int min = Math.min(((hma) this.i0).b.length - 1, this.H + i4 + 2);
        int i6 = 0;
        while (true) {
            arrayList = this.d;
            if (i6 >= arrayList.size()) {
                break;
            }
            ((k26) arrayList.get(i6)).j = 0;
            i6++;
        }
        canvas2.save();
        byte b = this.z0;
        float f15 = 0.0f;
        if (b == 2) {
            this.g0 = true;
            this.w0 = 0.0f;
            zyb zybVar = this.A0;
            float f16 = zybVar.f;
            f4 = 1.0f - f16;
            f3 = 2.0f;
            canvas2.scale((f16 * 2.0f) + 1.0f, 1.0f, zybVar.d, zybVar.e);
        } else {
            f3 = 2.0f;
            if (b == 1) {
                zyb zybVar2 = this.A0;
                float f17 = zybVar2.f;
                canvas2.scale(f17, 1.0f, zybVar2.d, zybVar2.e);
                f4 = f17;
            } else if (b == 3) {
                f4 = this.A0.f;
            } else {
                f4 = 1.0f;
            }
        }
        z = (this.t0 < 0 || !this.v0) ? false : false;
        while (true) {
            i = nf0.o1;
            if (max > min) {
                break;
            }
            if (this.t0 == max && z) {
                f6 = f15;
            } else {
                int i7 = i5;
                float f18 = f15;
                f6 = f18;
                while (i7 < arrayList.size()) {
                    k26 k26Var = (k26) arrayList.get(i7);
                    if (!k26Var.n && k26Var.o == f6) {
                        i2 = min;
                        i3 = max;
                    } else {
                        long[] jArr = k26Var.a.a;
                        float f19 = (((f10 - f2) * ((hma) this.i0).b[max]) + (f2 / f3)) - f12;
                        i2 = min;
                        i3 = max;
                        float measuredHeight = (((float) jArr[i3]) / this.w) * ((getMeasuredHeight() - this.s) - i) * k26Var.o;
                        float measuredHeight2 = (getMeasuredHeight() - this.s) - measuredHeight;
                        float[] fArr2 = k26Var.k;
                        int i8 = k26Var.j;
                        int i9 = i8 + 1;
                        k26Var.j = i9;
                        fArr2[i8] = f19;
                        int i10 = i8 + 2;
                        k26Var.j = i10;
                        fArr2[i9] = measuredHeight2 - f18;
                        int i11 = i8 + 3;
                        k26Var.j = i11;
                        fArr2[i10] = f19;
                        k26Var.j = i8 + 4;
                        fArr2[i11] = (getMeasuredHeight() - this.s) - f18;
                        f18 += measuredHeight;
                    }
                    i7++;
                    min = i2;
                    max = i3;
                }
            }
            max++;
            min = min;
            f15 = f6;
            i5 = 0;
        }
        float f20 = f15;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            jma jmaVar = (jma) arrayList.get(i12);
            if (!z && !this.g0) {
                paint = jmaVar.c;
            } else {
                paint = jmaVar.q;
            }
            if (z) {
                f5 = 255.0f;
                jmaVar.q.setColor(bm2.f(this.w0, jmaVar.m, jmaVar.r));
            } else {
                f5 = 255.0f;
            }
            if (this.g0) {
                jmaVar.q.setColor(bm2.f(1.0f, jmaVar.m, jmaVar.r));
            }
            paint.setAlpha((int) (f4 * f5));
            paint.setStrokeWidth(f);
            canvas2.drawLines(jmaVar.k, 0, jmaVar.j, paint);
        }
        if (z) {
            int i13 = 0;
            float f21 = f20;
            while (i13 < arrayList.size()) {
                k26 k26Var2 = (k26) arrayList.get(i13);
                boolean z2 = k26Var2.n;
                Paint paint2 = k26Var2.c;
                if (z2 || k26Var2.o != f20) {
                    long[] jArr2 = k26Var2.a.a;
                    float[] fArr3 = ((hma) this.i0).b;
                    int i14 = this.t0;
                    float f22 = (((f10 - f2) * fArr3[i14]) + (f2 / f3)) - f12;
                    float measuredHeight3 = (((float) jArr2[i14]) / this.w) * ((getMeasuredHeight() - this.s) - i) * k26Var2.o;
                    paint2.setStrokeWidth(f);
                    paint2.setAlpha((int) (f4 * 255.0f));
                    canvas2.drawLine(f22, ((getMeasuredHeight() - this.s) - measuredHeight3) - f21, f22, (getMeasuredHeight() - this.s) - f21, paint2);
                    f21 += measuredHeight3;
                }
                i13++;
                canvas2 = canvas;
            }
        }
        canvas.restore();
    }

    @Override
    public final void n(Canvas canvas) {
        fk1 fk1Var;
        float f;
        float f2;
        float f3;
        int i;
        char c;
        fk1 fk1Var2 = this.i0;
        if (fk1Var2 != null) {
            int length = ((hma) fk1Var2).b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((k26) arrayList.get(i3)).j = 0;
            }
            char c2 = 1;
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.E1;
            if (jArr == null || jArr.length < size) {
                this.E1 = new long[size];
            }
            int i4 = 0;
            while (true) {
                fk1Var = this.i0;
                if (i4 >= length) {
                    break;
                }
                float f4 = ((hma) fk1Var).b[i4] * this.D0;
                int i5 = i2;
                while (true) {
                    f2 = 0.0f;
                    if (i5 >= size) {
                        break;
                    }
                    k26 k26Var = (k26) arrayList.get(i5);
                    if (k26Var.n || k26Var.o != 0.0f) {
                        long j = k26Var.a.a[i4];
                        long[] jArr2 = this.E1;
                        if (j > jArr2[i5]) {
                            jArr2[i5] = j;
                        }
                    }
                    i5++;
                }
                if (i4 % max == 0) {
                    int i6 = i2;
                    float f5 = 0.0f;
                    while (i6 < size) {
                        k26 k26Var2 = (k26) arrayList.get(i6);
                        if (!k26Var2.n && k26Var2.o == f2) {
                            c = c2;
                            i = i4;
                        } else {
                            if (nf0.C1) {
                                f3 = this.k0;
                            } else {
                                f3 = (float) ((hma) this.i0).e;
                            }
                            long[] jArr3 = this.E1;
                            char c3 = c2;
                            i = i4;
                            float f6 = (((float) jArr3[i6]) / f3) * k26Var2.o;
                            float f7 = this.C0;
                            float f8 = f6 * f7;
                            float[] fArr = k26Var2.k;
                            int i7 = k26Var2.j;
                            c = c3;
                            int i8 = i7 + 1;
                            k26Var2.j = i8;
                            fArr[i7] = f4;
                            int i9 = i7 + 2;
                            k26Var2.j = i9;
                            fArr[i8] = (f7 - f8) - f5;
                            int i10 = i7 + 3;
                            k26Var2.j = i10;
                            fArr[i9] = f4;
                            k26Var2.j = i7 + 4;
                            fArr[i10] = f7 - f5;
                            f5 += f8;
                            jArr3[i6] = 0;
                        }
                        i6++;
                        i4 = i;
                        c2 = c;
                        f2 = 0.0f;
                    }
                }
                i4++;
                c2 = c2;
                i2 = 0;
            }
            char c4 = c2;
            float[] fArr2 = ((hma) fk1Var).b;
            if (fArr2.length < 2) {
                f = 1.0f;
            } else {
                f = this.D0 * fArr2[c4];
            }
            for (int i11 = 0; i11 < size; i11++) {
                k26 k26Var3 = (k26) arrayList.get(i11);
                Paint paint = k26Var3.c;
                paint.setStrokeWidth(max * f);
                paint.setAlpha(255);
                canvas.drawLines(k26Var3.k, 0, k26Var3.j, paint);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.b;
        this.n0 = arrayList.size();
        int i = 0;
        while (true) {
            this.o0 = i;
            int i2 = this.o0;
            if (i2 < this.n0) {
                l(canvas, (ik1) arrayList.get(i2));
                p(canvas, (ik1) arrayList.get(this.o0));
                i = this.o0 + 1;
            } else {
                j(canvas);
                m(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override
    public final long r(int i, int i2) {
        return ((hma) this.i0).m.L(i, i2);
    }

    @Override
    public final void u() {
        super.u();
        this.k0 = 0.0f;
        int length = ((hma) this.i0).a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                jma jmaVar = (jma) arrayList.get(i2);
                if (jmaVar.n) {
                    j += jmaVar.a.a[i];
                }
            }
            float f = (float) j;
            if (f > this.k0) {
                this.k0 = f;
            }
        }
    }

    @Override
    public final void z() {
        int length = ((ek1) ((hma) this.i0).d.get(0)).a.length;
        int size = ((hma) this.i0).d.size();
        ((hma) this.i0).l = new long[length];
        int i = 0;
        while (true) {
            fk1 fk1Var = this.i0;
            if (i < length) {
                ((hma) fk1Var).l[i] = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    if (((jma) this.d.get(i2)).n) {
                        fk1 fk1Var2 = this.i0;
                        long[] jArr = ((hma) fk1Var2).l;
                        jArr[i] = jArr[i] + ((ek1) ((hma) fk1Var2).d.get(i2)).a[i];
                    }
                }
                i++;
            } else {
                ((hma) fk1Var).m = new sk4(((hma) fk1Var).l);
                super.z();
                return;
            }
        }
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
