package ig;

import ai.l6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
public final class k extends g {
    @Override
    public final void K() {
        if (g.B1) {
            ArrayList arrayList = this.d;
            int i10 = 0;
            if (((kg.f) arrayList.get(0)).f13628n) {
                super.K();
                return;
            }
            int size = arrayList.size();
            long j3 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                kg.f fVar = (kg.f) obj;
                if (fVar.f13628n) {
                    long j10 = fVar.f13618a.e;
                    if (j10 > j3) {
                        j3 = j10;
                    }
                }
            }
            if (arrayList.size() > 1) {
                j3 = ((float) j3) * ((jg.c) this.f11149h0).f13010l[1];
            }
            if (j3 > 0) {
                float f7 = (float) j3;
                if (f7 != this.f11156l0) {
                    this.f11156l0 = f7;
                    Animator animator = this.f11140d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = g.e(this.f11153j0, this.f11156l0, new l6(this, 4));
                    this.f11140d0 = e;
                    e.start();
                }
            }
        }
    }

    @Override
    public final kg.d f(int i10, long j3, long j10) {
        float f7;
        float[] fArr = ((jg.c) this.f11149h0).f13010l;
        if (fArr.length < 2) {
            f7 = 1.0f;
        } else {
            char c10 = 0;
            if (fArr[0] == 1.0f) {
                c10 = 1;
            }
            f7 = fArr[c10];
        }
        return new kg.d(j3, j10, this.P0, f7, i10, this.N, this.O);
    }

    @Override
    public final kg.f h(jg.a aVar) {
        return new kg.f(aVar, false, this.W0);
    }

    @Override
    public final void k(Canvas canvas) {
        float f7;
        float f10;
        boolean z10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i10;
        boolean z11;
        if (this.f11149h0 != null) {
            float f15 = this.F0;
            j jVar = this.f11147g0;
            float f16 = jVar.f11189l;
            float f17 = jVar.f11188k;
            float f18 = f15 / (f16 - f17);
            float f19 = g.f11116k1;
            float f20 = (f17 * f18) - f19;
            canvas.save();
            int i11 = this.f11174y0;
            int i12 = 2;
            if (i11 == 2) {
                kg.j jVar2 = this.f11175z0;
                float f21 = jVar2.f13637f;
                if (f21 > 0.5f) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f - (f21 * 2.0f);
                }
                canvas.scale((f21 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
            } else if (i11 == 1) {
                float f22 = this.f11175z0.f13637f;
                if (f22 < 0.3f) {
                    f7 = 0.0f;
                } else {
                    f7 = f22;
                }
                canvas.save();
                kg.j jVar3 = this.f11175z0;
                float f23 = jVar3.f13637f;
                canvas.scale(f23, f23, jVar3.d, jVar3.e);
            } else if (i11 == 3) {
                f7 = this.f11175z0.f13637f;
            } else {
                f7 = 1.0f;
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i14 < arrayList.size()) {
                    kg.f fVar = (kg.f) arrayList.get(i14);
                    boolean z12 = fVar.f13628n;
                    float[] fArr = fVar.f13625k;
                    Path path = fVar.f13621f;
                    Paint paint = fVar.f13620c;
                    if (!z12 && fVar.f13629o == 0.0f) {
                        f11 = f18;
                        f12 = f20;
                        f13 = f19;
                    } else {
                        long[] jArr = fVar.f13618a.f12996a;
                        path.reset();
                        float[] fArr2 = ((jg.c) this.f11149h0).f13003b;
                        if (fArr2.length < i12) {
                            f10 = 1.0f;
                        } else {
                            f10 = fArr2[1] * f18;
                        }
                        int i15 = ((int) (f19 / f10)) + 1;
                        int max = Math.max(i13, this.F - i15);
                        int min = Math.min(((jg.c) this.f11149h0).f13003b.length - 1, this.G + i15);
                        boolean z13 = true;
                        int i16 = 0;
                        while (true) {
                            z10 = g.A1;
                            if (max > min) {
                                break;
                            }
                            float f24 = f18;
                            float f25 = f20;
                            long j3 = jArr[max];
                            if (j3 < 0) {
                                f14 = f19;
                                i10 = min;
                                z11 = z13;
                            } else {
                                f14 = f19;
                                jg.c cVar = (jg.c) this.f11149h0;
                                i10 = min;
                                float f26 = (cVar.f13003b[max] * f24) - f25;
                                float f27 = ((float) j3) * cVar.f13010l[i14];
                                float f28 = this.f11169w;
                                float strokeWidth = paint.getStrokeWidth() / 2.0f;
                                z11 = z13;
                                float b10 = e2.b((getMeasuredHeight() - this.f11164s) - g.f11118n1, strokeWidth, (f27 - f28) / (this.v - f28), (getMeasuredHeight() - this.f11164s) - strokeWidth);
                                if (z10) {
                                    if (i16 == 0) {
                                        int i17 = i16 + 1;
                                        fArr[i16] = f26;
                                        i16 += 2;
                                        fArr[i17] = b10;
                                    } else {
                                        fArr[i16] = f26;
                                        fArr[i16 + 1] = b10;
                                        int i18 = i16 + 3;
                                        fArr[i16 + 2] = f26;
                                        i16 += 4;
                                        fArr[i18] = b10;
                                    }
                                } else if (z11) {
                                    path.moveTo(f26, b10);
                                    z13 = false;
                                    max++;
                                    f18 = f24;
                                    f20 = f25;
                                    f19 = f14;
                                    min = i10;
                                } else {
                                    path.lineTo(f26, b10);
                                }
                            }
                            z13 = z11;
                            max++;
                            f18 = f24;
                            f20 = f25;
                            f19 = f14;
                            min = i10;
                        }
                        f11 = f18;
                        f12 = f20;
                        f13 = f19;
                        if (this.G - this.F > 100) {
                            paint.setStrokeCap(Paint.Cap.SQUARE);
                        } else {
                            paint.setStrokeCap(Paint.Cap.ROUND);
                        }
                        paint.setAlpha((int) (fVar.f13629o * 255.0f * f7));
                        if (!z10) {
                            canvas.drawPath(path, paint);
                        } else {
                            canvas.drawLines(fArr, 0, i16, paint);
                        }
                    }
                    i14++;
                    f18 = f11;
                    f20 = f12;
                    f19 = f13;
                    i13 = 0;
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
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList2;
        int i14;
        float f7;
        int measuredHeight = getMeasuredHeight();
        int i15 = g.f11121q1;
        int i16 = measuredHeight - i15;
        int measuredHeight2 = (getMeasuredHeight() - this.B0) - i15;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f11149h0 != null) {
            int i17 = 0;
            while (i17 < size) {
                kg.f fVar = (kg.f) arrayList3.get(i17);
                boolean z11 = fVar.f13628n;
                Paint paint = fVar.f13619b;
                float[] fArr = fVar.f13626l;
                Path path = fVar.e;
                if (!z11 && fVar.f13629o == 0.0f) {
                    i10 = i16;
                    arrayList = arrayList3;
                    i11 = measuredHeight2;
                    i12 = i17;
                } else {
                    path.reset();
                    int length = ((jg.c) this.f11149h0).f13003b.length;
                    long[] jArr = fVar.f13618a.f12996a;
                    fVar.f13621f.reset();
                    int i18 = 0;
                    int i19 = 0;
                    while (true) {
                        z10 = g.A1;
                        if (i19 >= length) {
                            break;
                        }
                        int i20 = i17;
                        long j3 = jArr[i19];
                        if (j3 < 0) {
                            i13 = i16;
                            arrayList2 = arrayList3;
                            i14 = measuredHeight2;
                        } else {
                            i13 = i16;
                            jg.b bVar = this.f11149h0;
                            float f10 = this.C0 * ((jg.c) bVar).f13003b[i19];
                            if (g.B1) {
                                arrayList2 = arrayList3;
                                f7 = this.f11153j0;
                                i14 = measuredHeight2;
                            } else {
                                arrayList2 = arrayList3;
                                i14 = measuredHeight2;
                                f7 = (float) ((jg.c) bVar).e;
                            }
                            float f11 = (1.0f - ((((float) j3) * ((jg.c) bVar).f13010l[i20]) / f7)) * (i13 - i14);
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
                    fVar.f13624j = i18;
                    if (fVar.f13628n || fVar.f13629o != 0.0f) {
                        paint.setAlpha((int) (fVar.f13629o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.f13624j, paint);
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
        int i10 = this.f11165s0;
        if (i10 >= 0 && this.f11167u0) {
            float f7 = this.F0;
            j jVar = this.f11147g0;
            float f10 = jVar.f11189l;
            float f11 = jVar.f11188k;
            float f12 = f7 / (f10 - f11);
            float f13 = (((jg.c) this.f11149h0).f13003b[i10] * f12) - ((f11 * f12) - g.f11116k1);
            Paint paint = this.M;
            paint.setAlpha((int) (this.f11162r * this.f11168v0));
            canvas.drawLine(f13, 0.0f, f13, this.H0.bottom, paint);
            ArrayList arrayList = this.d;
            this.m0 = arrayList.size();
            int i11 = 0;
            while (true) {
                this.f11158n0 = i11;
                int i12 = this.f11158n0;
                if (i12 < this.m0) {
                    kg.f fVar = (kg.f) arrayList.get(i12);
                    boolean z10 = fVar.f13628n;
                    Paint paint2 = fVar.d;
                    if (z10 || fVar.f13629o != 0.0f) {
                        float f14 = ((float) fVar.f13618a.f12996a[this.f11165s0]) * ((jg.c) this.f11149h0).f13010l[this.f11158n0];
                        float f15 = this.f11169w;
                        float measuredHeight = (getMeasuredHeight() - this.f11164s) - (((f14 - f15) / (this.v - f15)) * ((getMeasuredHeight() - this.f11164s) - g.f11118n1));
                        paint2.setAlpha((int) (fVar.f13629o * 255.0f * this.f11168v0));
                        Paint paint3 = this.S;
                        paint3.setAlpha((int) (fVar.f13629o * 255.0f * this.f11168v0));
                        canvas.drawPoint(f13, measuredHeight, paint2);
                        canvas.drawPoint(f13, measuredHeight, paint3);
                    }
                    i11 = this.f11158n0 + 1;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void p(android.graphics.Canvas r22, kg.d r23) {
        throw new UnsupportedOperationException("Method not decompiled: ig.k.p(android.graphics.Canvas, kg.d):void");
    }

    @Override
    public final long r(int i10, int i11) {
        long j3;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j10 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (((kg.f) arrayList.get(i12)).f13628n) {
                j3 = ((float) ((jg.a) ((jg.c) this.f11149h0).d.get(i12)).f12997b.rMaxQ(i10, i11)) * ((jg.c) this.f11149h0).f13010l[i12];
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
    public final long s(int i10, int i11) {
        long j3;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < size; i12++) {
            if (((kg.f) arrayList.get(i12)).f13628n) {
                j3 = (int) (((float) ((jg.a) ((jg.c) this.f11149h0).d.get(i12)).f12997b.rMinQ(i10, i11)) * ((jg.c) this.f11149h0).f13010l[i12]);
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
