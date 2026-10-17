package jg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import ci.v4;
import com.google.android.gms.internal.cast.a6;
import java.util.ArrayList;
public final class k extends g {
    @Override
    public final void K() {
        if (g.B1) {
            ArrayList arrayList = this.d;
            int i10 = 0;
            if (((lg.f) arrayList.get(0)).f16057n) {
                super.K();
                return;
            }
            int size = arrayList.size();
            long j10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                lg.f fVar = (lg.f) obj;
                if (fVar.f16057n) {
                    long j11 = fVar.f16047a.e;
                    if (j11 > j10) {
                        j10 = j11;
                    }
                }
            }
            if (arrayList.size() > 1) {
                j10 = ((float) j10) * ((kg.c) this.f14458h0).f15054l[1];
            }
            if (j10 > 0) {
                float f7 = (float) j10;
                if (f7 != this.f14465l0) {
                    this.f14465l0 = f7;
                    Animator animator = this.f14449d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = g.e(this.f14462j0, this.f14465l0, new v4(this, 4));
                    this.f14449d0 = e;
                    e.start();
                }
            }
        }
    }

    @Override
    public final lg.d f(int i10, long j10, long j11) {
        float[] fArr = ((kg.c) this.f14458h0).f15054l;
        float f7 = 1.0f;
        if (fArr.length >= 2) {
            char c10 = 0;
            if (fArr[0] == 1.0f) {
                c10 = 1;
            }
            f7 = fArr[c10];
        }
        return new lg.d(j10, j11, this.P0, f7, i10, this.N, this.O);
    }

    @Override
    public final lg.f h(kg.a aVar) {
        return new lg.f(aVar, false, this.W0);
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
        if (this.f14458h0 != null) {
            float f15 = this.F0;
            j jVar = this.f14456g0;
            float f16 = jVar.f14498l;
            float f17 = jVar.f14497k;
            float f18 = f15 / (f16 - f17);
            float f19 = g.f14425k1;
            float f20 = (f17 * f18) - f19;
            canvas.save();
            int i12 = this.f14483y0;
            float f21 = 2.0f;
            int i13 = 2;
            char c12 = 1;
            if (i12 == 2) {
                lg.j jVar2 = this.f14484z0;
                float f22 = jVar2.f16066f;
                if (f22 > 0.5f) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f - (f22 * 2.0f);
                }
                canvas.scale((f22 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
            } else if (i12 == 1) {
                float f23 = this.f14484z0.f16066f;
                if (f23 < 0.3f) {
                    f7 = 0.0f;
                } else {
                    f7 = f23;
                }
                canvas.save();
                lg.j jVar3 = this.f14484z0;
                float f24 = jVar3.f16066f;
                canvas.scale(f24, f24, jVar3.d, jVar3.e);
            } else if (i12 == 3) {
                f7 = this.f14484z0.f16066f;
            } else {
                f7 = 1.0f;
            }
            int i14 = 0;
            int i15 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i15 < arrayList.size()) {
                    lg.f fVar = (lg.f) arrayList.get(i15);
                    boolean z11 = fVar.f16057n;
                    float[] fArr = fVar.f16054k;
                    float f25 = f21;
                    Path path = fVar.f16050f;
                    Paint paint = fVar.f16049c;
                    if (!z11 && fVar.f16058o == 0.0f) {
                        f11 = f18;
                        f12 = f20;
                        f13 = f19;
                        i10 = i14;
                        c10 = c12;
                    } else {
                        long[] jArr = fVar.f16047a.f15040a;
                        path.reset();
                        float[] fArr2 = ((kg.c) this.f14458h0).f15047b;
                        c10 = c12;
                        if (fArr2.length < i13) {
                            f10 = 1.0f;
                        } else {
                            f10 = fArr2[c10] * f18;
                        }
                        int i16 = ((int) (f19 / f10)) + 1;
                        int max = Math.max(i14, this.F - i16);
                        int min = Math.min(((kg.c) this.f14458h0).f15047b.length - 1, this.G + i16);
                        char c13 = c10;
                        int i17 = 0;
                        while (true) {
                            z10 = g.A1;
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
                                kg.c cVar = (kg.c) this.f14458h0;
                                i11 = min;
                                float f28 = (cVar.f15047b[max] * f26) - f27;
                                float f29 = ((float) j10) * cVar.f15054l[i15];
                                float f30 = this.f14478w;
                                float strokeWidth = paint.getStrokeWidth() / f25;
                                c11 = c13;
                                float D = a6.D((getMeasuredHeight() - this.f14473s) - g.f14427n1, strokeWidth, (f29 - f30) / (this.v - f30), (getMeasuredHeight() - this.f14473s) - strokeWidth);
                                if (z10) {
                                    if (i17 == 0) {
                                        int i18 = i17 + 1;
                                        fArr[i17] = f28;
                                        i17 += 2;
                                        fArr[i18] = D;
                                    } else {
                                        fArr[i17] = f28;
                                        fArr[i17 + 1] = D;
                                        int i19 = i17 + 3;
                                        fArr[i17 + 2] = f28;
                                        i17 += 4;
                                        fArr[i19] = D;
                                    }
                                } else if (c11 != 0) {
                                    path.moveTo(f28, D);
                                    c13 = 0;
                                    max++;
                                    f18 = f26;
                                    f20 = f27;
                                    f19 = f14;
                                    min = i11;
                                } else {
                                    path.lineTo(f28, D);
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
                        paint.setAlpha((int) (fVar.f16058o * 255.0f * f7));
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
        int i15 = g.f14430q1;
        int i16 = measuredHeight - i15;
        int measuredHeight2 = (getMeasuredHeight() - this.B0) - i15;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f14458h0 != null) {
            int i17 = 0;
            while (i17 < size) {
                lg.f fVar = (lg.f) arrayList3.get(i17);
                boolean z11 = fVar.f16057n;
                Paint paint = fVar.f16048b;
                float[] fArr = fVar.f16055l;
                Path path = fVar.e;
                if (!z11 && fVar.f16058o == 0.0f) {
                    i10 = i16;
                    arrayList = arrayList3;
                    i11 = measuredHeight2;
                    i12 = i17;
                } else {
                    path.reset();
                    int length = ((kg.c) this.f14458h0).f15047b.length;
                    long[] jArr = fVar.f16047a.f15040a;
                    fVar.f16050f.reset();
                    int i18 = 0;
                    int i19 = 0;
                    while (true) {
                        z10 = g.A1;
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
                            kg.b bVar = this.f14458h0;
                            float f10 = this.C0 * ((kg.c) bVar).f15047b[i19];
                            if (g.B1) {
                                arrayList2 = arrayList3;
                                f7 = this.f14462j0;
                                i14 = measuredHeight2;
                            } else {
                                arrayList2 = arrayList3;
                                i14 = measuredHeight2;
                                f7 = (float) ((kg.c) bVar).e;
                            }
                            float f11 = (1.0f - ((((float) j10) * ((kg.c) bVar).f15054l[i20]) / f7)) * (i13 - i14);
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
                    fVar.f16053j = i18;
                    if (fVar.f16057n || fVar.f16058o != 0.0f) {
                        paint.setAlpha((int) (fVar.f16058o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.f16053j, paint);
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
        int i10 = this.f14474s0;
        if (i10 >= 0 && this.f14476u0) {
            float f7 = this.F0;
            j jVar = this.f14456g0;
            float f10 = jVar.f14498l;
            float f11 = jVar.f14497k;
            float f12 = f7 / (f10 - f11);
            float f13 = (((kg.c) this.f14458h0).f15047b[i10] * f12) - ((f11 * f12) - g.f14425k1);
            Paint paint = this.M;
            paint.setAlpha((int) (this.f14471r * this.f14477v0));
            canvas.drawLine(f13, 0.0f, f13, this.H0.bottom, paint);
            ArrayList arrayList = this.d;
            this.m0 = arrayList.size();
            int i11 = 0;
            while (true) {
                this.f14467n0 = i11;
                int i12 = this.f14467n0;
                if (i12 < this.m0) {
                    lg.f fVar = (lg.f) arrayList.get(i12);
                    boolean z10 = fVar.f16057n;
                    Paint paint2 = fVar.d;
                    if (z10 || fVar.f16058o != 0.0f) {
                        float f14 = ((float) fVar.f16047a.f15040a[this.f14474s0]) * ((kg.c) this.f14458h0).f15054l[this.f14467n0];
                        float f15 = this.f14478w;
                        float measuredHeight = (getMeasuredHeight() - this.f14473s) - (((f14 - f15) / (this.v - f15)) * ((getMeasuredHeight() - this.f14473s) - g.f14427n1));
                        paint2.setAlpha((int) (fVar.f16058o * 255.0f * this.f14477v0));
                        Paint paint3 = this.S;
                        paint3.setAlpha((int) (fVar.f16058o * 255.0f * this.f14477v0));
                        canvas.drawPoint(f13, measuredHeight, paint2);
                        canvas.drawPoint(f13, measuredHeight, paint3);
                    }
                    i11 = this.f14467n0 + 1;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void p(android.graphics.Canvas r22, lg.d r23) {
        throw new UnsupportedOperationException("Method not decompiled: jg.k.p(android.graphics.Canvas, lg.d):void");
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
            if (((lg.f) arrayList.get(i12)).f16057n) {
                j10 = ((float) ((kg.a) ((kg.c) this.f14458h0).d.get(i12)).f15041b.rMaxQ(i10, i11)) * ((kg.c) this.f14458h0).f15054l[i12];
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
            if (((lg.f) arrayList.get(i12)).f16057n) {
                j10 = (int) (((float) ((kg.a) ((kg.c) this.f14458h0).d.get(i12)).f15041b.rMinQ(i10, i11)) * ((kg.c) this.f14458h0).f15054l[i12]);
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
