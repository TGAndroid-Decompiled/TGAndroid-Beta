package lg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.google.android.gms.internal.vision.e2;
import fi.d4;
import java.util.ArrayList;
public final class k extends g {
    @Override
    public final void K() {
        if (g.C1) {
            ArrayList arrayList = this.d;
            int i7 = 0;
            if (((ng.f) arrayList.get(0)).f21606n) {
                super.K();
                return;
            }
            int size = arrayList.size();
            long j3 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ng.f fVar = (ng.f) obj;
                if (fVar.f21606n) {
                    long j10 = fVar.f21595a.f21070e;
                    if (j10 > j3) {
                        j3 = j10;
                    }
                }
            }
            if (arrayList.size() > 1) {
                j3 = ((float) j3) * ((mg.c) this.f19900i0).f21083l[1];
            }
            if (j3 > 0) {
                float f10 = (float) j3;
                if (f10 != this.m0) {
                    this.m0 = f10;
                    Animator animator = this.f19891e0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e10 = g.e(this.f19904k0, this.m0, new d4(this, 4));
                    this.f19891e0 = e10;
                    e10.start();
                }
            }
        }
    }

    @Override
    public final ng.d f(long j3, int i7, long j10) {
        float[] fArr = ((mg.c) this.f19900i0).f21083l;
        float f10 = 1.0f;
        if (fArr.length >= 2) {
            char c10 = 0;
            if (fArr[0] == 1.0f) {
                c10 = 1;
            }
            f10 = fArr[c10];
        }
        return new ng.d(j3, j10, this.Q0, f10, i7, this.O, this.P);
    }

    @Override
    public final ng.f h(mg.a aVar) {
        return new ng.f(aVar, false, this.X0);
    }

    @Override
    public final void k(Canvas canvas) {
        float f10;
        char c10;
        float f11;
        boolean z10;
        float f12;
        float f13;
        float f14;
        int i7;
        float f15;
        int i10;
        char c11;
        if (this.f19900i0 != null) {
            float f16 = this.G0;
            j jVar = this.f19898h0;
            float f17 = jVar.f19941l;
            float f18 = jVar.f19940k;
            float f19 = f16 / (f17 - f18);
            float f20 = g.l1;
            float f21 = (f18 * f19) - f20;
            canvas.save();
            int i11 = this.f19925z0;
            float f22 = 2.0f;
            int i12 = 2;
            char c12 = 1;
            if (i11 == 2) {
                ng.j jVar2 = this.A0;
                float f23 = jVar2.f21616f;
                if (f23 > 0.5f) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f - (f23 * 2.0f);
                }
                canvas.scale((f23 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.f21615e);
            } else if (i11 == 1) {
                float f24 = this.A0.f21616f;
                if (f24 < 0.3f) {
                    f10 = 0.0f;
                } else {
                    f10 = f24;
                }
                canvas.save();
                ng.j jVar3 = this.A0;
                float f25 = jVar3.f21616f;
                canvas.scale(f25, f25, jVar3.d, jVar3.f21615e);
            } else if (i11 == 3) {
                f10 = this.A0.f21616f;
            } else {
                f10 = 1.0f;
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i14 < arrayList.size()) {
                    ng.f fVar = (ng.f) arrayList.get(i14);
                    boolean z11 = fVar.f21606n;
                    float[] fArr = fVar.f21603k;
                    float f26 = f22;
                    Path path = fVar.f21599f;
                    Paint paint = fVar.f21597c;
                    if (!z11 && fVar.f21607o == 0.0f) {
                        f12 = f19;
                        f13 = f21;
                        f14 = f20;
                        i7 = i13;
                        c10 = c12;
                    } else {
                        long[] jArr = fVar.f21595a.f21067a;
                        path.reset();
                        float[] fArr2 = ((mg.c) this.f19900i0).f21075b;
                        c10 = c12;
                        if (fArr2.length < i12) {
                            f11 = 1.0f;
                        } else {
                            f11 = fArr2[c10] * f19;
                        }
                        int i15 = ((int) (f20 / f11)) + 1;
                        int max = Math.max(i13, this.G - i15);
                        int min = Math.min(((mg.c) this.f19900i0).f21075b.length - 1, this.H + i15);
                        char c13 = c10;
                        int i16 = 0;
                        while (true) {
                            z10 = g.B1;
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
                                mg.c cVar = (mg.c) this.f19900i0;
                                i10 = min;
                                float f29 = (cVar.f21075b[max] * f27) - f28;
                                float f30 = ((float) j3) * cVar.f21083l[i14];
                                float f31 = this.f19921x;
                                float strokeWidth = paint.getStrokeWidth() / f26;
                                c11 = c13;
                                float t6 = e2.t((getMeasuredHeight() - this.f19914s) - g.f19867o1, strokeWidth, (f30 - f31) / (this.f19919w - f31), (getMeasuredHeight() - this.f19914s) - strokeWidth);
                                if (z10) {
                                    if (i16 == 0) {
                                        int i17 = i16 + 1;
                                        fArr[i16] = f29;
                                        i16 += 2;
                                        fArr[i17] = t6;
                                    } else {
                                        fArr[i16] = f29;
                                        fArr[i16 + 1] = t6;
                                        int i18 = i16 + 3;
                                        fArr[i16 + 2] = f29;
                                        i16 += 4;
                                        fArr[i18] = t6;
                                    }
                                } else if (c11 != 0) {
                                    path.moveTo(f29, t6);
                                    c13 = 0;
                                    max++;
                                    f19 = f27;
                                    f21 = f28;
                                    f20 = f15;
                                    min = i10;
                                } else {
                                    path.lineTo(f29, t6);
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
                        if (this.H - this.G > 100) {
                            paint.setStrokeCap(Paint.Cap.SQUARE);
                        } else {
                            paint.setStrokeCap(Paint.Cap.ROUND);
                        }
                        paint.setAlpha((int) (fVar.f21607o * 255.0f * f10));
                        if (!z10) {
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
        boolean z10;
        int i7;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList2;
        int i13;
        float f10;
        int measuredHeight = getMeasuredHeight();
        int i14 = g.f19870r1;
        int i15 = measuredHeight - i14;
        int measuredHeight2 = (getMeasuredHeight() - this.C0) - i14;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f19900i0 != null) {
            int i16 = 0;
            while (i16 < size) {
                ng.f fVar = (ng.f) arrayList3.get(i16);
                boolean z11 = fVar.f21606n;
                Paint paint = fVar.f21596b;
                float[] fArr = fVar.f21604l;
                Path path = fVar.f21598e;
                if (!z11 && fVar.f21607o == 0.0f) {
                    i7 = i15;
                    arrayList = arrayList3;
                    i10 = measuredHeight2;
                    i11 = i16;
                } else {
                    path.reset();
                    int length = ((mg.c) this.f19900i0).f21075b.length;
                    long[] jArr = fVar.f21595a.f21067a;
                    fVar.f21599f.reset();
                    int i17 = 0;
                    int i18 = 0;
                    while (true) {
                        z10 = g.B1;
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
                            mg.b bVar = this.f19900i0;
                            float f11 = this.D0 * ((mg.c) bVar).f21075b[i18];
                            if (g.C1) {
                                arrayList2 = arrayList3;
                                f10 = this.f19904k0;
                                i13 = measuredHeight2;
                            } else {
                                arrayList2 = arrayList3;
                                i13 = measuredHeight2;
                                f10 = (float) ((mg.c) bVar).f21077e;
                            }
                            float f12 = (1.0f - ((((float) j3) * ((mg.c) bVar).f21083l[i19]) / f10)) * (i12 - i13);
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
                    i7 = i15;
                    arrayList = arrayList3;
                    i10 = measuredHeight2;
                    i11 = i16;
                    fVar.f21602j = i17;
                    if (fVar.f21606n || fVar.f21607o != 0.0f) {
                        paint.setAlpha((int) (fVar.f21607o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.f21602j, paint);
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
        int i7 = this.f19916t0;
        if (i7 >= 0 && this.f19918v0) {
            float f10 = this.G0;
            j jVar = this.f19898h0;
            float f11 = jVar.f19941l;
            float f12 = jVar.f19940k;
            float f13 = f10 / (f11 - f12);
            float f14 = (((mg.c) this.f19900i0).f21075b[i7] * f13) - ((f12 * f13) - g.l1);
            Paint paint = this.N;
            paint.setAlpha((int) (this.f19912r * this.f19920w0));
            canvas.drawLine(f14, 0.0f, f14, this.I0.bottom, paint);
            ArrayList arrayList = this.d;
            this.f19908n0 = arrayList.size();
            int i10 = 0;
            while (true) {
                this.f19909o0 = i10;
                int i11 = this.f19909o0;
                if (i11 < this.f19908n0) {
                    ng.f fVar = (ng.f) arrayList.get(i11);
                    boolean z10 = fVar.f21606n;
                    Paint paint2 = fVar.d;
                    if (z10 || fVar.f21607o != 0.0f) {
                        float f15 = ((float) fVar.f21595a.f21067a[this.f19916t0]) * ((mg.c) this.f19900i0).f21083l[this.f19909o0];
                        float f16 = this.f19921x;
                        float measuredHeight = (getMeasuredHeight() - this.f19914s) - (((f15 - f16) / (this.f19919w - f16)) * ((getMeasuredHeight() - this.f19914s) - g.f19867o1));
                        paint2.setAlpha((int) (fVar.f21607o * 255.0f * this.f19920w0));
                        Paint paint3 = this.T;
                        paint3.setAlpha((int) (fVar.f21607o * 255.0f * this.f19920w0));
                        canvas.drawPoint(f14, measuredHeight, paint2);
                        canvas.drawPoint(f14, measuredHeight, paint3);
                    }
                    i10 = this.f19909o0 + 1;
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
            if (((ng.f) arrayList.get(i11)).f21606n) {
                j3 = ((float) ((mg.a) ((mg.c) this.f19900i0).d.get(i11)).f21068b.P0(i7, i10)) * ((mg.c) this.f19900i0).f21083l[i11];
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
            if (((ng.f) arrayList.get(i11)).f21606n) {
                j3 = (int) (((float) ((mg.a) ((mg.c) this.f19900i0).d.get(i11)).f21068b.T0(i7, i10)) * ((mg.c) this.f19900i0).f21083l[i11]);
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
        this.Q0 = true;
        super.t();
    }
}
