package lg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import di.n4;
import java.util.ArrayList;
public final class k extends g {
    @Override
    public final void K() {
        if (g.B1) {
            ArrayList arrayList = this.d;
            int i7 = 0;
            if (((ng.f) arrayList.get(0)).f20584n) {
                super.K();
                return;
            }
            int size = arrayList.size();
            long j3 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ng.f fVar = (ng.f) obj;
                if (fVar.f20584n) {
                    long j10 = fVar.f20573a.f20024e;
                    if (j10 > j3) {
                        j3 = j10;
                    }
                }
            }
            if (arrayList.size() > 1) {
                j3 = ((float) j3) * ((mg.c) this.f18308h0).f20037l[1];
            }
            if (j3 > 0) {
                float f10 = (float) j3;
                if (f10 != this.f18315l0) {
                    this.f18315l0 = f10;
                    Animator animator = this.f18298d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e10 = g.e(this.f18312j0, this.f18315l0, new n4(this, 4));
                    this.f18298d0 = e10;
                    e10.start();
                }
            }
        }
    }

    @Override
    public final ng.d f(long j3, int i7, long j10) {
        float[] fArr = ((mg.c) this.f18308h0).f20037l;
        float f10 = 1.0f;
        if (fArr.length >= 2) {
            char c10 = 0;
            if (fArr[0] == 1.0f) {
                c10 = 1;
            }
            f10 = fArr[c10];
        }
        return new ng.d(j3, j10, this.P0, f10, i7, this.N, this.O);
    }

    @Override
    public final ng.f h(mg.a aVar) {
        return new ng.f(aVar, false, this.W0);
    }

    @Override
    public final void k(Canvas canvas) {
        float f10;
        char c10;
        float f11;
        boolean z9;
        float f12;
        float f13;
        float f14;
        int i7;
        float f15;
        int i10;
        char c11;
        if (this.f18308h0 != null) {
            float f16 = this.F0;
            j jVar = this.f18306g0;
            float f17 = jVar.f18350l;
            float f18 = jVar.f18349k;
            float f19 = f16 / (f17 - f18);
            float f20 = g.f18275k1;
            float f21 = (f18 * f19) - f20;
            canvas.save();
            int i11 = this.f18333y0;
            float f22 = 2.0f;
            int i12 = 2;
            char c12 = 1;
            if (i11 == 2) {
                ng.j jVar2 = this.f18334z0;
                float f23 = jVar2.f20594f;
                if (f23 > 0.5f) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f - (f23 * 2.0f);
                }
                canvas.scale((f23 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.f20593e);
            } else if (i11 == 1) {
                float f24 = this.f18334z0.f20594f;
                if (f24 < 0.3f) {
                    f10 = 0.0f;
                } else {
                    f10 = f24;
                }
                canvas.save();
                ng.j jVar3 = this.f18334z0;
                float f25 = jVar3.f20594f;
                canvas.scale(f25, f25, jVar3.d, jVar3.f20593e);
            } else if (i11 == 3) {
                f10 = this.f18334z0.f20594f;
            } else {
                f10 = 1.0f;
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i14 < arrayList.size()) {
                    ng.f fVar = (ng.f) arrayList.get(i14);
                    boolean z10 = fVar.f20584n;
                    float[] fArr = fVar.f20581k;
                    float f26 = f22;
                    Path path = fVar.f20577f;
                    Paint paint = fVar.f20575c;
                    if (!z10 && fVar.f20585o == 0.0f) {
                        f12 = f19;
                        f13 = f21;
                        f14 = f20;
                        i7 = i13;
                        c10 = c12;
                    } else {
                        long[] jArr = fVar.f20573a.f20021a;
                        path.reset();
                        float[] fArr2 = ((mg.c) this.f18308h0).f20029b;
                        c10 = c12;
                        if (fArr2.length < i12) {
                            f11 = 1.0f;
                        } else {
                            f11 = fArr2[c10] * f19;
                        }
                        int i15 = ((int) (f20 / f11)) + 1;
                        int max = Math.max(i13, this.F - i15);
                        int min = Math.min(((mg.c) this.f18308h0).f20029b.length - 1, this.G + i15);
                        char c13 = c10;
                        int i16 = 0;
                        while (true) {
                            z9 = g.A1;
                            if (max > min) {
                                break;
                            }
                            float f27 = f19;
                            float f28 = f21;
                            long j3 = jArr[max];
                            if (j3 < 0) {
                                f15 = f20;
                                i10 = min;
                                c11 = c13;
                            } else {
                                f15 = f20;
                                mg.c cVar = (mg.c) this.f18308h0;
                                i10 = min;
                                float f29 = (cVar.f20029b[max] * f27) - f28;
                                float f30 = ((float) j3) * cVar.f20037l[i14];
                                float f31 = this.f18330x;
                                float strokeWidth = paint.getStrokeWidth() / f26;
                                c11 = c13;
                                float v = com.google.android.recaptcha.internal.a.v((getMeasuredHeight() - this.f18323s) - g.n1, strokeWidth, (f30 - f31) / (this.f18328w - f31), (getMeasuredHeight() - this.f18323s) - strokeWidth);
                                if (z9) {
                                    if (i16 == 0) {
                                        int i17 = i16 + 1;
                                        fArr[i16] = f29;
                                        i16 += 2;
                                        fArr[i17] = v;
                                    } else {
                                        fArr[i16] = f29;
                                        fArr[i16 + 1] = v;
                                        int i18 = i16 + 3;
                                        fArr[i16 + 2] = f29;
                                        i16 += 4;
                                        fArr[i18] = v;
                                    }
                                } else if (c11 != 0) {
                                    path.moveTo(f29, v);
                                    c13 = 0;
                                    max++;
                                    f19 = f27;
                                    f21 = f28;
                                    f20 = f15;
                                    min = i10;
                                } else {
                                    path.lineTo(f29, v);
                                }
                            }
                            c13 = c11;
                            max++;
                            f19 = f27;
                            f21 = f28;
                            f20 = f15;
                            min = i10;
                        }
                        f12 = f19;
                        f13 = f21;
                        f14 = f20;
                        if (this.G - this.F > 100) {
                            paint.setStrokeCap(Paint.Cap.SQUARE);
                        } else {
                            paint.setStrokeCap(Paint.Cap.ROUND);
                        }
                        paint.setAlpha((int) (fVar.f20585o * 255.0f * f10));
                        if (!z9) {
                            canvas.drawPath(path, paint);
                            i7 = 0;
                        } else {
                            i7 = 0;
                            canvas.drawLines(fArr, 0, i16, paint);
                        }
                    }
                    i14++;
                    i13 = i7;
                    f22 = f26;
                    c12 = c10;
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
        boolean z9;
        int i7;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList2;
        int i13;
        float f10;
        int measuredHeight = getMeasuredHeight();
        int i14 = g.f18279q1;
        int i15 = measuredHeight - i14;
        int measuredHeight2 = (getMeasuredHeight() - this.B0) - i14;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f18308h0 != null) {
            int i16 = 0;
            while (i16 < size) {
                ng.f fVar = (ng.f) arrayList3.get(i16);
                boolean z10 = fVar.f20584n;
                Paint paint = fVar.f20574b;
                float[] fArr = fVar.f20582l;
                Path path = fVar.f20576e;
                if (!z10 && fVar.f20585o == 0.0f) {
                    i7 = i15;
                    arrayList = arrayList3;
                    i10 = measuredHeight2;
                    i11 = i16;
                } else {
                    path.reset();
                    int length = ((mg.c) this.f18308h0).f20029b.length;
                    long[] jArr = fVar.f20573a.f20021a;
                    fVar.f20577f.reset();
                    int i17 = 0;
                    int i18 = 0;
                    while (true) {
                        z9 = g.A1;
                        if (i18 >= length) {
                            break;
                        }
                        int i19 = i16;
                        long j3 = jArr[i18];
                        if (j3 < 0) {
                            i12 = i15;
                            arrayList2 = arrayList3;
                            i13 = measuredHeight2;
                        } else {
                            i12 = i15;
                            mg.b bVar = this.f18308h0;
                            float f11 = this.C0 * ((mg.c) bVar).f20029b[i18];
                            if (g.B1) {
                                arrayList2 = arrayList3;
                                f10 = this.f18312j0;
                                i13 = measuredHeight2;
                            } else {
                                arrayList2 = arrayList3;
                                i13 = measuredHeight2;
                                f10 = (float) ((mg.c) bVar).f20031e;
                            }
                            float f12 = (1.0f - ((((float) j3) * ((mg.c) bVar).f20037l[i19]) / f10)) * (i12 - i13);
                            if (z9) {
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
                    i7 = i15;
                    arrayList = arrayList3;
                    i10 = measuredHeight2;
                    i11 = i16;
                    fVar.f20580j = i17;
                    if (fVar.f20584n || fVar.f20585o != 0.0f) {
                        paint.setAlpha((int) (fVar.f20585o * 255.0f));
                        if (z9) {
                            canvas.drawLines(fArr, 0, fVar.f20580j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                        i16 = i11 + 1;
                        i15 = i7;
                        arrayList3 = arrayList;
                        measuredHeight2 = i10;
                    }
                }
                i16 = i11 + 1;
                i15 = i7;
                arrayList3 = arrayList;
                measuredHeight2 = i10;
            }
        }
    }

    @Override
    public final void o(Canvas canvas) {
        int i7 = this.f18324s0;
        if (i7 >= 0 && this.f18326u0) {
            float f10 = this.F0;
            j jVar = this.f18306g0;
            float f11 = jVar.f18350l;
            float f12 = jVar.f18349k;
            float f13 = f10 / (f11 - f12);
            float f14 = (((mg.c) this.f18308h0).f20029b[i7] * f13) - ((f12 * f13) - g.f18275k1);
            Paint paint = this.M;
            paint.setAlpha((int) (this.f18321r * this.f18327v0));
            canvas.drawLine(f14, 0.0f, f14, this.H0.bottom, paint);
            ArrayList arrayList = this.d;
            this.m0 = arrayList.size();
            int i10 = 0;
            while (true) {
                this.f18317n0 = i10;
                int i11 = this.f18317n0;
                if (i11 < this.m0) {
                    ng.f fVar = (ng.f) arrayList.get(i11);
                    boolean z9 = fVar.f20584n;
                    Paint paint2 = fVar.d;
                    if (z9 || fVar.f20585o != 0.0f) {
                        float f15 = ((float) fVar.f20573a.f20021a[this.f18324s0]) * ((mg.c) this.f18308h0).f20037l[this.f18317n0];
                        float f16 = this.f18330x;
                        float measuredHeight = (getMeasuredHeight() - this.f18323s) - (((f15 - f16) / (this.f18328w - f16)) * ((getMeasuredHeight() - this.f18323s) - g.n1));
                        paint2.setAlpha((int) (fVar.f20585o * 255.0f * this.f18327v0));
                        Paint paint3 = this.S;
                        paint3.setAlpha((int) (fVar.f20585o * 255.0f * this.f18327v0));
                        canvas.drawPoint(f14, measuredHeight, paint2);
                        canvas.drawPoint(f14, measuredHeight, paint3);
                    }
                    i10 = this.f18317n0 + 1;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void p(android.graphics.Canvas r22, ng.d r23) {
        throw new UnsupportedOperationException("Method not decompiled: lg.k.p(android.graphics.Canvas, ng.d):void");
    }

    @Override
    public final long r(int i7, int i10) {
        long j3;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (((ng.f) arrayList.get(i11)).f20584n) {
                j3 = ((float) ((mg.a) ((mg.c) this.f18308h0).d.get(i11)).f20022b.w0(i7, i10)) * ((mg.c) this.f18308h0).f20037l[i11];
            } else {
                j3 = 0;
            }
            if (j3 > j10) {
                j10 = j3;
            }
        }
        return j10;
    }

    @Override
    public final long s(int i7, int i10) {
        long j3;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            if (((ng.f) arrayList.get(i11)).f20584n) {
                j3 = (int) (((float) ((mg.a) ((mg.c) this.f18308h0).d.get(i11)).f20022b.H0(i7, i10)) * ((mg.c) this.f18308h0).f20037l[i11]);
            } else {
                j3 = 2147483647L;
            }
            if (j3 < j10) {
                j10 = j3;
            }
        }
        return j10;
    }

    @Override
    public final void t() {
        this.P0 = true;
        super.t();
    }
}
