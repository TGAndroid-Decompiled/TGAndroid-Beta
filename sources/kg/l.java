package kg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import di.u4;
import java.util.ArrayList;
public final class l extends h {
    @Override
    public final void K() {
        if (h.B1) {
            ArrayList arrayList = this.d;
            int i10 = 0;
            if (((mg.f) arrayList.get(0)).f18475n) {
                super.K();
                return;
            }
            int size = arrayList.size();
            long j10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                mg.f fVar = (mg.f) obj;
                if (fVar.f18475n) {
                    long j11 = fVar.f18465a.e;
                    if (j11 > j10) {
                        j10 = j11;
                    }
                }
            }
            if (arrayList.size() > 1) {
                j10 = ((float) j10) * ((lg.c) this.f16601h0).f17019l[1];
            }
            if (j10 > 0) {
                float f7 = (float) j10;
                if (f7 != this.f16608l0) {
                    this.f16608l0 = f7;
                    Animator animator = this.f16592d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = h.e(this.f16605j0, this.f16608l0, new u4(this, 4));
                    this.f16592d0 = e;
                    e.start();
                }
            }
        }
    }

    @Override
    public final mg.d f(int i10, long j10, long j11) {
        float[] fArr = ((lg.c) this.f16601h0).f17019l;
        float f7 = 1.0f;
        if (fArr.length >= 2) {
            char c10 = 0;
            if (fArr[0] == 1.0f) {
                c10 = 1;
            }
            f7 = fArr[c10];
        }
        return new mg.d(j10, j11, this.P0, f7, i10, this.N, this.O);
    }

    @Override
    public final mg.f h(lg.a aVar) {
        return new mg.f(aVar, false, this.W0);
    }

    @Override
    public final void k(Canvas canvas) {
        float f7;
        char c10;
        float f10;
        boolean z10;
        float f11;
        float f12;
        float f13;
        int i10;
        float f14;
        int i11;
        char c11;
        if (this.f16601h0 != null) {
            float f15 = this.F0;
            k kVar = this.f16599g0;
            float f16 = kVar.f16641l;
            float f17 = kVar.f16640k;
            float f18 = f15 / (f16 - f17);
            float f19 = h.f16568k1;
            float f20 = (f17 * f18) - f19;
            canvas.save();
            int i12 = this.f16626y0;
            float f21 = 2.0f;
            int i13 = 2;
            char c12 = 1;
            if (i12 == 2) {
                mg.j jVar = this.f16627z0;
                float f22 = jVar.f18484f;
                if (f22 > 0.5f) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f - (f22 * 2.0f);
                }
                canvas.scale((f22 * 2.0f) + 1.0f, 1.0f, jVar.d, jVar.e);
            } else if (i12 == 1) {
                float f23 = this.f16627z0.f18484f;
                if (f23 < 0.3f) {
                    f7 = 0.0f;
                } else {
                    f7 = f23;
                }
                canvas.save();
                mg.j jVar2 = this.f16627z0;
                float f24 = jVar2.f18484f;
                canvas.scale(f24, f24, jVar2.d, jVar2.e);
            } else if (i12 == 3) {
                f7 = this.f16627z0.f18484f;
            } else {
                f7 = 1.0f;
            }
            int i14 = 0;
            int i15 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i15 < arrayList.size()) {
                    mg.f fVar = (mg.f) arrayList.get(i15);
                    boolean z11 = fVar.f18475n;
                    float[] fArr = fVar.f18472k;
                    float f25 = f21;
                    Path path = fVar.f18468f;
                    Paint paint = fVar.f18467c;
                    if (!z11 && fVar.f18476o == 0.0f) {
                        f11 = f18;
                        f12 = f20;
                        f13 = f19;
                        i10 = i14;
                        c10 = c12;
                    } else {
                        long[] jArr = fVar.f18465a.f17005a;
                        path.reset();
                        float[] fArr2 = ((lg.c) this.f16601h0).f17012b;
                        c10 = c12;
                        if (fArr2.length < i13) {
                            f10 = 1.0f;
                        } else {
                            f10 = fArr2[c10] * f18;
                        }
                        int i16 = ((int) (f19 / f10)) + 1;
                        int max = Math.max(i14, this.F - i16);
                        int min = Math.min(((lg.c) this.f16601h0).f17012b.length - 1, this.G + i16);
                        char c13 = c10;
                        int i17 = 0;
                        while (true) {
                            z10 = h.A1;
                            if (max > min) {
                                break;
                            }
                            float f26 = f18;
                            float f27 = f20;
                            long j10 = jArr[max];
                            if (j10 < 0) {
                                f14 = f19;
                                i11 = min;
                                c11 = c13;
                            } else {
                                f14 = f19;
                                lg.c cVar = (lg.c) this.f16601h0;
                                i11 = min;
                                float f28 = (cVar.f17012b[max] * f26) - f27;
                                float f29 = ((float) j10) * cVar.f17019l[i15];
                                float f30 = this.f16621w;
                                float strokeWidth = paint.getStrokeWidth() / f25;
                                c11 = c13;
                                float d = ic.a.d((getMeasuredHeight() - this.f16616s) - h.f16570n1, strokeWidth, (f29 - f30) / (this.v - f30), (getMeasuredHeight() - this.f16616s) - strokeWidth);
                                if (z10) {
                                    if (i17 == 0) {
                                        int i18 = i17 + 1;
                                        fArr[i17] = f28;
                                        i17 += 2;
                                        fArr[i18] = d;
                                    } else {
                                        fArr[i17] = f28;
                                        fArr[i17 + 1] = d;
                                        int i19 = i17 + 3;
                                        fArr[i17 + 2] = f28;
                                        i17 += 4;
                                        fArr[i19] = d;
                                    }
                                } else if (c11 != 0) {
                                    path.moveTo(f28, d);
                                    c13 = 0;
                                    max++;
                                    f18 = f26;
                                    f20 = f27;
                                    f19 = f14;
                                    min = i11;
                                } else {
                                    path.lineTo(f28, d);
                                }
                            }
                            c13 = c11;
                            max++;
                            f18 = f26;
                            f20 = f27;
                            f19 = f14;
                            min = i11;
                        }
                        f11 = f18;
                        f12 = f20;
                        f13 = f19;
                        if (this.G - this.F > 100) {
                            paint.setStrokeCap(Paint.Cap.SQUARE);
                        } else {
                            paint.setStrokeCap(Paint.Cap.ROUND);
                        }
                        paint.setAlpha((int) (fVar.f18476o * 255.0f * f7));
                        if (!z10) {
                            canvas.drawPath(path, paint);
                            i10 = 0;
                        } else {
                            i10 = 0;
                            canvas.drawLines(fArr, 0, i17, paint);
                        }
                    }
                    i15++;
                    i14 = i10;
                    f21 = f25;
                    c12 = c10;
                    f18 = f11;
                    f20 = f12;
                    f19 = f13;
                    i13 = 2;
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
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList2;
        int i14;
        float f7;
        int measuredHeight = getMeasuredHeight();
        int i15 = h.f16573q1;
        int i16 = measuredHeight - i15;
        int measuredHeight2 = (getMeasuredHeight() - this.B0) - i15;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f16601h0 != null) {
            int i17 = 0;
            while (i17 < size) {
                mg.f fVar = (mg.f) arrayList3.get(i17);
                boolean z11 = fVar.f18475n;
                Paint paint = fVar.f18466b;
                float[] fArr = fVar.f18473l;
                Path path = fVar.e;
                if (!z11 && fVar.f18476o == 0.0f) {
                    i10 = i16;
                    arrayList = arrayList3;
                    i11 = measuredHeight2;
                    i12 = i17;
                } else {
                    path.reset();
                    int length = ((lg.c) this.f16601h0).f17012b.length;
                    long[] jArr = fVar.f18465a.f17005a;
                    fVar.f18468f.reset();
                    int i18 = 0;
                    int i19 = 0;
                    while (true) {
                        z10 = h.A1;
                        if (i19 >= length) {
                            break;
                        }
                        int i20 = i17;
                        long j10 = jArr[i19];
                        if (j10 < 0) {
                            i13 = i16;
                            arrayList2 = arrayList3;
                            i14 = measuredHeight2;
                        } else {
                            i13 = i16;
                            lg.b bVar = this.f16601h0;
                            float f10 = this.C0 * ((lg.c) bVar).f17012b[i19];
                            if (h.B1) {
                                arrayList2 = arrayList3;
                                f7 = this.f16605j0;
                                i14 = measuredHeight2;
                            } else {
                                arrayList2 = arrayList3;
                                i14 = measuredHeight2;
                                f7 = (float) ((lg.c) bVar).e;
                            }
                            float f11 = (1.0f - ((((float) j10) * ((lg.c) bVar).f17019l[i20]) / f7)) * (i13 - i14);
                            if (z10) {
                                if (i18 == 0) {
                                    int i21 = i18 + 1;
                                    fArr[i18] = f10;
                                    i18 += 2;
                                    fArr[i21] = f11;
                                } else {
                                    fArr[i18] = f10;
                                    fArr[i18 + 1] = f11;
                                    int i22 = i18 + 3;
                                    fArr[i18 + 2] = f10;
                                    i18 += 4;
                                    fArr[i22] = f11;
                                }
                            } else if (i19 == 0) {
                                path.moveTo(f10, f11);
                            } else {
                                path.lineTo(f10, f11);
                            }
                        }
                        i19++;
                        i17 = i20;
                        i16 = i13;
                        arrayList3 = arrayList2;
                        measuredHeight2 = i14;
                    }
                    i10 = i16;
                    arrayList = arrayList3;
                    i11 = measuredHeight2;
                    i12 = i17;
                    fVar.f18471j = i18;
                    if (fVar.f18475n || fVar.f18476o != 0.0f) {
                        paint.setAlpha((int) (fVar.f18476o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.f18471j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                        i17 = i12 + 1;
                        i16 = i10;
                        arrayList3 = arrayList;
                        measuredHeight2 = i11;
                    }
                }
                i17 = i12 + 1;
                i16 = i10;
                arrayList3 = arrayList;
                measuredHeight2 = i11;
            }
        }
    }

    @Override
    public final void o(Canvas canvas) {
        int i10 = this.f16617s0;
        if (i10 >= 0 && this.f16619u0) {
            float f7 = this.F0;
            k kVar = this.f16599g0;
            float f10 = kVar.f16641l;
            float f11 = kVar.f16640k;
            float f12 = f7 / (f10 - f11);
            float f13 = (((lg.c) this.f16601h0).f17012b[i10] * f12) - ((f11 * f12) - h.f16568k1);
            Paint paint = this.M;
            paint.setAlpha((int) (this.f16614r * this.f16620v0));
            canvas.drawLine(f13, 0.0f, f13, this.H0.bottom, paint);
            ArrayList arrayList = this.d;
            this.m0 = arrayList.size();
            int i11 = 0;
            while (true) {
                this.f16610n0 = i11;
                int i12 = this.f16610n0;
                if (i12 < this.m0) {
                    mg.f fVar = (mg.f) arrayList.get(i12);
                    boolean z10 = fVar.f18475n;
                    Paint paint2 = fVar.d;
                    if (z10 || fVar.f18476o != 0.0f) {
                        float f14 = ((float) fVar.f18465a.f17005a[this.f16617s0]) * ((lg.c) this.f16601h0).f17019l[this.f16610n0];
                        float f15 = this.f16621w;
                        float measuredHeight = (getMeasuredHeight() - this.f16616s) - (((f14 - f15) / (this.v - f15)) * ((getMeasuredHeight() - this.f16616s) - h.f16570n1));
                        paint2.setAlpha((int) (fVar.f18476o * 255.0f * this.f16620v0));
                        Paint paint3 = this.S;
                        paint3.setAlpha((int) (fVar.f18476o * 255.0f * this.f16620v0));
                        canvas.drawPoint(f13, measuredHeight, paint2);
                        canvas.drawPoint(f13, measuredHeight, paint3);
                    }
                    i11 = this.f16610n0 + 1;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void p(android.graphics.Canvas r22, mg.d r23) {
        throw new UnsupportedOperationException("Method not decompiled: kg.l.p(android.graphics.Canvas, mg.d):void");
    }

    @Override
    public final long r(int i10, int i11) {
        long j10;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (((mg.f) arrayList.get(i12)).f18475n) {
                j10 = ((float) ((lg.a) ((lg.c) this.f16601h0).d.get(i12)).f17006b.rMaxQ(i10, i11)) * ((lg.c) this.f16601h0).f17019l[i12];
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
    public final long s(int i10, int i11) {
        long j10;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j11 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < size; i12++) {
            if (((mg.f) arrayList.get(i12)).f18475n) {
                j10 = (int) (((float) ((lg.a) ((lg.c) this.f16601h0).d.get(i12)).f17006b.rMinQ(i10, i11)) * ((lg.c) this.f16601h0).f17019l[i12]);
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
        this.P0 = true;
        super.t();
    }
}
