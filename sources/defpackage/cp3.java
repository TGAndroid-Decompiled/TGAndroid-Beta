package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class cp3 extends nf0 {
    @Override
    public final void K() {
        if (nf0.C1) {
            ArrayList arrayList = this.d;
            int i = 0;
            if (((k26) arrayList.get(0)).n) {
                super.K();
                return;
            }
            int size = arrayList.size();
            long j = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                k26 k26Var = (k26) obj;
                if (k26Var.n) {
                    long j2 = k26Var.a.e;
                    if (j2 > j) {
                        j = j2;
                    }
                }
            }
            if (arrayList.size() > 1) {
                j = ((float) j) * ((bp3) this.i0).l[1];
            }
            if (j > 0) {
                float f = (float) j;
                if (f != this.m0) {
                    this.m0 = f;
                    Animator animator = this.e0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = nf0.e(this.k0, this.m0, new ae0(this, (byte) 5));
                    this.e0 = e;
                    e.start();
                }
            }
        }
    }

    @Override
    public final ik1 f(long j, int i, long j2) {
        float[] fArr = ((bp3) this.i0).l;
        float f = 1.0f;
        if (fArr.length >= 2) {
            char c = 0;
            if (fArr[0] == 1.0f) {
                c = 1;
            }
            f = fArr[c];
        }
        return new ik1(j, j2, this.Q0, f, i, this.O, this.P);
    }

    @Override
    public final k26 h(ek1 ek1Var) {
        return new k26(ek1Var, false, this.X0);
    }

    @Override
    public final void n(Canvas canvas) {
        boolean z;
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList2;
        int i6;
        int i7;
        float f;
        int measuredHeight = getMeasuredHeight();
        int i8 = nf0.r1;
        int i9 = measuredHeight - i8;
        int measuredHeight2 = (getMeasuredHeight() - this.C0) - i8;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.i0 != null) {
            int i10 = 0;
            while (i10 < size) {
                k26 k26Var = (k26) arrayList3.get(i10);
                boolean z2 = k26Var.n;
                float[] fArr = k26Var.l;
                Paint paint = k26Var.b;
                Path path = k26Var.e;
                if (!z2 && k26Var.o == 0.0f) {
                    i = i9;
                    arrayList = arrayList3;
                    i2 = measuredHeight2;
                    i3 = size;
                    i4 = i10;
                } else {
                    path.reset();
                    int length = ((bp3) this.i0).b.length;
                    long[] jArr = k26Var.a.a;
                    k26Var.f.reset();
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        z = nf0.B1;
                        if (i12 >= length) {
                            break;
                        }
                        int i13 = i10;
                        long j = jArr[i12];
                        if (j < 0) {
                            i5 = i9;
                            arrayList2 = arrayList3;
                            i6 = measuredHeight2;
                            i7 = size;
                        } else {
                            i5 = i9;
                            bp3 bp3Var = (bp3) this.i0;
                            arrayList2 = arrayList3;
                            float f2 = this.D0 * bp3Var.b[i12];
                            if (nf0.C1) {
                                i6 = measuredHeight2;
                                f = this.k0;
                                i7 = size;
                            } else {
                                i6 = measuredHeight2;
                                i7 = size;
                                f = (float) bp3Var.e;
                            }
                            float f3 = (1.0f - ((((float) j) * bp3Var.l[i13]) / f)) * (i5 - i6);
                            if (z) {
                                int i14 = i11 + 1;
                                if (i11 == 0) {
                                    fArr[i11] = f2;
                                    i11 += 2;
                                    fArr[i14] = f3;
                                } else {
                                    fArr[i11] = f2;
                                    fArr[i14] = f3;
                                    int i15 = i11 + 3;
                                    fArr[i11 + 2] = f2;
                                    i11 += 4;
                                    fArr[i15] = f3;
                                }
                            } else if (i12 == 0) {
                                path.moveTo(f2, f3);
                            } else {
                                path.lineTo(f2, f3);
                            }
                        }
                        i12++;
                        i10 = i13;
                        i9 = i5;
                        arrayList3 = arrayList2;
                        measuredHeight2 = i6;
                        size = i7;
                    }
                    i = i9;
                    arrayList = arrayList3;
                    i2 = measuredHeight2;
                    i3 = size;
                    i4 = i10;
                    k26Var.j = i11;
                    if (k26Var.n || k26Var.o != 0.0f) {
                        paint.setAlpha((int) (k26Var.o * 255.0f));
                        if (z) {
                            canvas.drawLines(fArr, 0, k26Var.j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                    }
                }
                i10 = i4 + 1;
                i9 = i;
                arrayList3 = arrayList;
                measuredHeight2 = i2;
                size = i3;
            }
        }
    }

    @Override
    public final void o(Canvas canvas) {
        int i = this.t0;
        if (i >= 0 && this.v0) {
            float f = this.G0;
            lk1 lk1Var = this.h0;
            float f2 = lk1Var.l;
            float f3 = lk1Var.k;
            float f4 = f / (f2 - f3);
            float f5 = (((bp3) this.i0).b[i] * f4) - ((f3 * f4) - nf0.l1);
            Paint paint = this.N;
            paint.setAlpha((int) (this.r * this.w0));
            canvas.drawLine(f5, 0.0f, f5, this.I0.bottom, paint);
            ArrayList arrayList = this.d;
            this.n0 = arrayList.size();
            int i2 = 0;
            while (true) {
                this.o0 = i2;
                int i3 = this.o0;
                if (i3 < this.n0) {
                    k26 k26Var = (k26) arrayList.get(i3);
                    boolean z = k26Var.n;
                    Paint paint2 = k26Var.d;
                    if (z || k26Var.o != 0.0f) {
                        float f6 = ((float) k26Var.a.a[this.t0]) * ((bp3) this.i0).l[this.o0];
                        float f7 = this.x;
                        float measuredHeight = (getMeasuredHeight() - this.s) - (((f6 - f7) / (this.w - f7)) * ((getMeasuredHeight() - this.s) - nf0.o1));
                        paint2.setAlpha((int) (k26Var.o * 255.0f * this.w0));
                        Paint paint3 = this.T;
                        paint3.setAlpha((int) (k26Var.o * 255.0f * this.w0));
                        canvas.drawPoint(f5, measuredHeight, paint2);
                        canvas.drawPoint(f5, measuredHeight, paint3);
                    }
                    i2 = this.o0 + 1;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void p(android.graphics.Canvas r22, defpackage.ik1 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cp3.p(android.graphics.Canvas, ik1):void");
    }

    @Override
    public final long r(int i, int i2) {
        long j;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (((k26) arrayList.get(i3)).n) {
                j = ((float) ((ek1) ((bp3) this.i0).d.get(i3)).b.L(i, i2)) * ((bp3) this.i0).l[i3];
            } else {
                j = 0;
            }
            if (j > j2) {
                j2 = j;
            }
        }
        return j2;
    }

    @Override
    public final long s(int i, int i2) {
        long j;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j2 = Long.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            if (((k26) arrayList.get(i3)).n) {
                j = (int) (((float) ((ek1) ((bp3) this.i0).d.get(i3)).b.U(i, i2)) * ((bp3) this.i0).l[i3]);
            } else {
                j = 2147483647L;
            }
            if (j < j2) {
                j2 = j;
            }
        }
        return j2;
    }

    @Override
    public final void t() {
        this.Q0 = true;
        super.t();
    }
}
