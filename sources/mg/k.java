package mg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import ei.n4;
import java.util.ArrayList;
public final class k extends g {
    @Override
    public final void K() {
        if (g.C1) {
            ArrayList arrayList = this.d;
            int i3 = 0;
            if (((og.f) arrayList.get(0)).f21096n) {
                super.K();
                return;
            }
            int size = arrayList.size();
            long j10 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                og.f fVar = (og.f) obj;
                if (fVar.f21096n) {
                    long j11 = fVar.f21085a.f20369e;
                    if (j11 > j10) {
                        j10 = j11;
                    }
                }
            }
            if (arrayList.size() > 1) {
                j10 = ((float) j10) * ((ng.c) this.f19346i0).f20382l[1];
            }
            if (j10 > 0) {
                float f10 = (float) j10;
                if (f10 != this.m0) {
                    this.m0 = f10;
                    Animator animator = this.f19337e0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e10 = g.e(this.f19350k0, this.m0, new n4(this, 4));
                    this.f19337e0 = e10;
                    e10.start();
                }
            }
        }
    }

    @Override
    public final og.d f(long j10, int i3, long j11) {
        float[] fArr = ((ng.c) this.f19346i0).f20382l;
        float f10 = 1.0f;
        if (fArr.length >= 2) {
            char c2 = 0;
            if (fArr[0] == 1.0f) {
                c2 = 1;
            }
            f10 = fArr[c2];
        }
        return new og.d(j10, j11, this.Q0, f10, i3, this.O, this.P);
    }

    @Override
    public final og.f h(ng.a aVar) {
        return new og.f(aVar, false, this.X0);
    }

    @Override
    public final void k(Canvas canvas) {
        float f10;
        char c2;
        float f11;
        boolean z10;
        float f12;
        float f13;
        float f14;
        int i3;
        float f15;
        int i10;
        char c10;
        if (this.f19346i0 != null) {
            float f16 = this.G0;
            j jVar = this.f19344h0;
            float f17 = jVar.f19386l;
            float f18 = jVar.f19385k;
            float f19 = f16 / (f17 - f18);
            float f20 = g.f19311l1;
            float f21 = (f18 * f19) - f20;
            canvas.save();
            int i11 = this.f19370z0;
            float f22 = 2.0f;
            int i12 = 2;
            char c11 = 1;
            if (i11 == 2) {
                og.j jVar2 = this.A0;
                float f23 = jVar2.f21106f;
                if (f23 > 0.5f) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f - (f23 * 2.0f);
                }
                canvas.scale((f23 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.f21105e);
            } else if (i11 == 1) {
                float f24 = this.A0.f21106f;
                if (f24 < 0.3f) {
                    f10 = 0.0f;
                } else {
                    f10 = f24;
                }
                canvas.save();
                og.j jVar3 = this.A0;
                float f25 = jVar3.f21106f;
                canvas.scale(f25, f25, jVar3.d, jVar3.f21105e);
            } else if (i11 == 3) {
                f10 = this.A0.f21106f;
            } else {
                f10 = 1.0f;
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i14 < arrayList.size()) {
                    og.f fVar = (og.f) arrayList.get(i14);
                    boolean z11 = fVar.f21096n;
                    float[] fArr = fVar.f21093k;
                    float f26 = f22;
                    Path path = fVar.f21089f;
                    Paint paint = fVar.f21087c;
                    if (!z11 && fVar.f21097o == 0.0f) {
                        f12 = f19;
                        f13 = f21;
                        f14 = f20;
                        i3 = i13;
                        c2 = c11;
                    } else {
                        long[] jArr = fVar.f21085a.f20366a;
                        path.reset();
                        float[] fArr2 = ((ng.c) this.f19346i0).f20374b;
                        c2 = c11;
                        if (fArr2.length < i12) {
                            f11 = 1.0f;
                        } else {
                            f11 = fArr2[c2] * f19;
                        }
                        int i15 = ((int) (f20 / f11)) + 1;
                        int max = Math.max(i13, this.G - i15);
                        int min = Math.min(((ng.c) this.f19346i0).f20374b.length - 1, this.H + i15);
                        char c12 = c2;
                        int i16 = 0;
                        while (true) {
                            z10 = g.B1;
                            if (max > min) {
                                break;
                            }
                            float f27 = f19;
                            float f28 = f21;
                            long j10 = jArr[max];
                            if (j10 < 0) {
                                f15 = f20;
                                i10 = min;
                                c10 = c12;
                            } else {
                                f15 = f20;
                                ng.c cVar = (ng.c) this.f19346i0;
                                i10 = min;
                                float f29 = (cVar.f20374b[max] * f27) - f28;
                                float f30 = ((float) j10) * cVar.f20382l[i14];
                                float f31 = this.f19366x;
                                float strokeWidth = paint.getStrokeWidth() / f26;
                                c10 = c12;
                                float D = a1.g.D((getMeasuredHeight() - this.f19359s) - g.f19313o1, strokeWidth, (f30 - f31) / (this.f19364w - f31), (getMeasuredHeight() - this.f19359s) - strokeWidth);
                                if (z10) {
                                    if (i16 == 0) {
                                        int i17 = i16 + 1;
                                        fArr[i16] = f29;
                                        i16 += 2;
                                        fArr[i17] = D;
                                    } else {
                                        fArr[i16] = f29;
                                        fArr[i16 + 1] = D;
                                        int i18 = i16 + 3;
                                        fArr[i16 + 2] = f29;
                                        i16 += 4;
                                        fArr[i18] = D;
                                    }
                                } else if (c10 != 0) {
                                    path.moveTo(f29, D);
                                    c12 = 0;
                                    max++;
                                    f19 = f27;
                                    f21 = f28;
                                    f20 = f15;
                                    min = i10;
                                } else {
                                    path.lineTo(f29, D);
                                }
                            }
                            c12 = c10;
                            max++;
                            f19 = f27;
                            f21 = f28;
                            f20 = f15;
                            min = i10;
                        }
                        f12 = f19;
                        f13 = f21;
                        f14 = f20;
                        if (this.H - this.G > 100) {
                            paint.setStrokeCap(Paint.Cap.SQUARE);
                        } else {
                            paint.setStrokeCap(Paint.Cap.ROUND);
                        }
                        paint.setAlpha((int) (fVar.f21097o * 255.0f * f10));
                        if (!z10) {
                            canvas.drawPath(path, paint);
                            i3 = 0;
                        } else {
                            i3 = 0;
                            canvas.drawLines(fArr, 0, i16, paint);
                        }
                    }
                    i14++;
                    i13 = i3;
                    f22 = f26;
                    c11 = c2;
                    f19 = f12;
                    f21 = f13;
                    f20 = f14;
                    i12 = 2;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    @Override
    public final void n(Canvas canvas) {
        boolean z10;
        int i3;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList2;
        int i13;
        float f10;
        int measuredHeight = getMeasuredHeight();
        int i14 = g.f19316r1;
        int i15 = measuredHeight - i14;
        int measuredHeight2 = (getMeasuredHeight() - this.C0) - i14;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f19346i0 != null) {
            int i16 = 0;
            while (i16 < size) {
                og.f fVar = (og.f) arrayList3.get(i16);
                boolean z11 = fVar.f21096n;
                Paint paint = fVar.f21086b;
                float[] fArr = fVar.f21094l;
                Path path = fVar.f21088e;
                if (!z11 && fVar.f21097o == 0.0f) {
                    i3 = i15;
                    arrayList = arrayList3;
                    i10 = measuredHeight2;
                    i11 = i16;
                } else {
                    path.reset();
                    int length = ((ng.c) this.f19346i0).f20374b.length;
                    long[] jArr = fVar.f21085a.f20366a;
                    fVar.f21089f.reset();
                    int i17 = 0;
                    int i18 = 0;
                    while (true) {
                        z10 = g.B1;
                        if (i18 >= length) {
                            break;
                        }
                        int i19 = i16;
                        long j10 = jArr[i18];
                        if (j10 < 0) {
                            i12 = i15;
                            arrayList2 = arrayList3;
                            i13 = measuredHeight2;
                        } else {
                            i12 = i15;
                            ng.b bVar = this.f19346i0;
                            float f11 = this.D0 * ((ng.c) bVar).f20374b[i18];
                            if (g.C1) {
                                arrayList2 = arrayList3;
                                f10 = this.f19350k0;
                                i13 = measuredHeight2;
                            } else {
                                arrayList2 = arrayList3;
                                i13 = measuredHeight2;
                                f10 = (float) ((ng.c) bVar).f20376e;
                            }
                            float f12 = (1.0f - ((((float) j10) * ((ng.c) bVar).f20382l[i19]) / f10)) * (i12 - i13);
                            if (z10) {
                                if (i17 == 0) {
                                    int i20 = i17 + 1;
                                    fArr[i17] = f11;
                                    i17 += 2;
                                    fArr[i20] = f12;
                                } else {
                                    fArr[i17] = f11;
                                    fArr[i17 + 1] = f12;
                                    int i21 = i17 + 3;
                                    fArr[i17 + 2] = f11;
                                    i17 += 4;
                                    fArr[i21] = f12;
                                }
                            } else if (i18 == 0) {
                                path.moveTo(f11, f12);
                            } else {
                                path.lineTo(f11, f12);
                            }
                        }
                        i18++;
                        i16 = i19;
                        i15 = i12;
                        arrayList3 = arrayList2;
                        measuredHeight2 = i13;
                    }
                    i3 = i15;
                    arrayList = arrayList3;
                    i10 = measuredHeight2;
                    i11 = i16;
                    fVar.f21092j = i17;
                    if (fVar.f21096n || fVar.f21097o != 0.0f) {
                        paint.setAlpha((int) (fVar.f21097o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.f21092j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                        i16 = i11 + 1;
                        i15 = i3;
                        arrayList3 = arrayList;
                        measuredHeight2 = i10;
                    }
                }
                i16 = i11 + 1;
                i15 = i3;
                arrayList3 = arrayList;
                measuredHeight2 = i10;
            }
        }
    }

    @Override
    public final void o(Canvas canvas) {
        int i3 = this.f19361t0;
        if (i3 >= 0 && this.f19363v0) {
            float f10 = this.G0;
            j jVar = this.f19344h0;
            float f11 = jVar.f19386l;
            float f12 = jVar.f19385k;
            float f13 = f10 / (f11 - f12);
            float f14 = (((ng.c) this.f19346i0).f20374b[i3] * f13) - ((f12 * f13) - g.f19311l1);
            Paint paint = this.N;
            paint.setAlpha((int) (this.f19357r * this.f19365w0));
            canvas.drawLine(f14, 0.0f, f14, this.I0.bottom, paint);
            ArrayList arrayList = this.d;
            this.f19353n0 = arrayList.size();
            int i10 = 0;
            while (true) {
                this.f19354o0 = i10;
                int i11 = this.f19354o0;
                if (i11 < this.f19353n0) {
                    og.f fVar = (og.f) arrayList.get(i11);
                    boolean z10 = fVar.f21096n;
                    Paint paint2 = fVar.d;
                    if (z10 || fVar.f21097o != 0.0f) {
                        float f15 = ((float) fVar.f21085a.f20366a[this.f19361t0]) * ((ng.c) this.f19346i0).f20382l[this.f19354o0];
                        float f16 = this.f19366x;
                        float measuredHeight = (getMeasuredHeight() - this.f19359s) - (((f15 - f16) / (this.f19364w - f16)) * ((getMeasuredHeight() - this.f19359s) - g.f19313o1));
                        paint2.setAlpha((int) (fVar.f21097o * 255.0f * this.f19365w0));
                        Paint paint3 = this.T;
                        paint3.setAlpha((int) (fVar.f21097o * 255.0f * this.f19365w0));
                        canvas.drawPoint(f14, measuredHeight, paint2);
                        canvas.drawPoint(f14, measuredHeight, paint3);
                    }
                    i10 = this.f19354o0 + 1;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void p(android.graphics.Canvas r22, og.d r23) {
        throw new UnsupportedOperationException("Method not decompiled: mg.k.p(android.graphics.Canvas, og.d):void");
    }

    @Override
    public final long r(int i3, int i10) {
        long j10;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (((og.f) arrayList.get(i11)).f21096n) {
                j10 = ((float) ((ng.a) ((ng.c) this.f19346i0).d.get(i11)).f20367b.I0(i3, i10)) * ((ng.c) this.f19346i0).f20382l[i11];
            } else {
                j10 = 0;
            }
            if (j10 > j11) {
                j11 = j10;
            }
        }
        return j11;
    }

    @Override
    public final long s(int i3, int i10) {
        long j10;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j11 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            if (((og.f) arrayList.get(i11)).f21096n) {
                j10 = (int) (((float) ((ng.a) ((ng.c) this.f19346i0).d.get(i11)).f20367b.O0(i3, i10)) * ((ng.c) this.f19346i0).f20382l[i11]);
            } else {
                j10 = 2147483647L;
            }
            if (j10 < j11) {
                j11 = j10;
            }
        }
        return j11;
    }

    @Override
    public final void t() {
        this.Q0 = true;
        super.t();
    }
}
