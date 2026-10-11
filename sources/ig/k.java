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
            if (((kg.f) arrayList.get(0)).f14851n) {
                super.K();
                return;
            }
            int size = arrayList.size();
            long j3 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                kg.f fVar = (kg.f) obj;
                if (fVar.f14851n) {
                    long j10 = fVar.f14840a.f14153e;
                    if (j10 > j3) {
                        j3 = j10;
                    }
                }
            }
            if (arrayList.size() > 1) {
                j3 = ((float) j3) * ((jg.c) this.f12174h0).f14166l[1];
            }
            if (j3 > 0) {
                float f7 = (float) j3;
                if (f7 != this.f12181l0) {
                    this.f12181l0 = f7;
                    Animator animator = this.f12164d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e7 = g.e(this.f12178j0, this.f12181l0, new l6(this, 4));
                    this.f12164d0 = e7;
                    e7.start();
                }
            }
        }
    }

    @Override
    public final kg.d f(int i10, long j3, long j10) {
        float[] fArr = ((jg.c) this.f12174h0).f14166l;
        float f7 = 1.0f;
        if (fArr.length >= 2) {
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
        if (this.f12174h0 != null) {
            float f15 = this.F0;
            j jVar = this.f12172g0;
            float f16 = jVar.f12216l;
            float f17 = jVar.f12215k;
            float f18 = f15 / (f16 - f17);
            float f19 = g.f12140k1;
            float f20 = (f17 * f18) - f19;
            canvas.save();
            int i12 = this.f12199y0;
            float f21 = 2.0f;
            int i13 = 2;
            char c12 = 1;
            if (i12 == 2) {
                kg.j jVar2 = this.f12200z0;
                float f22 = jVar2.f14861f;
                if (f22 > 0.5f) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f - (f22 * 2.0f);
                }
                canvas.scale((f22 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.f14860e);
            } else if (i12 == 1) {
                float f23 = this.f12200z0.f14861f;
                if (f23 < 0.3f) {
                    f7 = 0.0f;
                } else {
                    f7 = f23;
                }
                canvas.save();
                kg.j jVar3 = this.f12200z0;
                float f24 = jVar3.f14861f;
                canvas.scale(f24, f24, jVar3.d, jVar3.f14860e);
            } else if (i12 == 3) {
                f7 = this.f12200z0.f14861f;
            } else {
                f7 = 1.0f;
            }
            int i14 = 0;
            int i15 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i15 < arrayList.size()) {
                    kg.f fVar = (kg.f) arrayList.get(i15);
                    boolean z11 = fVar.f14851n;
                    float[] fArr = fVar.f14848k;
                    float f25 = f21;
                    Path path = fVar.f14844f;
                    Paint paint = fVar.f14842c;
                    if (!z11 && fVar.f14852o == 0.0f) {
                        f11 = f18;
                        f12 = f20;
                        f13 = f19;
                        i10 = i14;
                        c10 = c12;
                    } else {
                        long[] jArr = fVar.f14840a.f14150a;
                        path.reset();
                        float[] fArr2 = ((jg.c) this.f12174h0).f14158b;
                        c10 = c12;
                        if (fArr2.length < i13) {
                            f10 = 1.0f;
                        } else {
                            f10 = fArr2[c10] * f18;
                        }
                        int i16 = ((int) (f19 / f10)) + 1;
                        int max = Math.max(i14, this.F - i16);
                        int min = Math.min(((jg.c) this.f12174h0).f14158b.length - 1, this.G + i16);
                        char c13 = c10;
                        int i17 = 0;
                        while (true) {
                            z10 = g.A1;
                            if (max > min) {
                                break;
                            }
                            float f26 = f18;
                            float f27 = f20;
                            long j3 = jArr[max];
                            if (j3 < 0) {
                                f14 = f19;
                                i11 = min;
                                c11 = c13;
                            } else {
                                f14 = f19;
                                jg.c cVar = (jg.c) this.f12174h0;
                                i11 = min;
                                float f28 = (cVar.f14158b[max] * f26) - f27;
                                float f29 = ((float) j3) * cVar.f14166l[i15];
                                float f30 = this.f12194w;
                                float strokeWidth = paint.getStrokeWidth() / f25;
                                c11 = c13;
                                float b10 = e2.b((getMeasuredHeight() - this.f12189s) - g.f12142n1, strokeWidth, (f29 - f30) / (this.v - f30), (getMeasuredHeight() - this.f12189s) - strokeWidth);
                                if (z10) {
                                    if (i17 == 0) {
                                        int i18 = i17 + 1;
                                        fArr[i17] = f28;
                                        i17 += 2;
                                        fArr[i18] = b10;
                                    } else {
                                        fArr[i17] = f28;
                                        fArr[i17 + 1] = b10;
                                        int i19 = i17 + 3;
                                        fArr[i17 + 2] = f28;
                                        i17 += 4;
                                        fArr[i19] = b10;
                                    }
                                } else if (c11 != 0) {
                                    path.moveTo(f28, b10);
                                    c13 = 0;
                                    max++;
                                    f18 = f26;
                                    f20 = f27;
                                    f19 = f14;
                                    min = i11;
                                } else {
                                    path.lineTo(f28, b10);
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
                        paint.setAlpha((int) (fVar.f14852o * 255.0f * f7));
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
        int i15 = g.f12145q1;
        int i16 = measuredHeight - i15;
        int measuredHeight2 = (getMeasuredHeight() - this.B0) - i15;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f12174h0 != null) {
            int i17 = 0;
            while (i17 < size) {
                kg.f fVar = (kg.f) arrayList3.get(i17);
                boolean z11 = fVar.f14851n;
                Paint paint = fVar.f14841b;
                float[] fArr = fVar.f14849l;
                Path path = fVar.f14843e;
                if (!z11 && fVar.f14852o == 0.0f) {
                    i10 = i16;
                    arrayList = arrayList3;
                    i11 = measuredHeight2;
                    i12 = i17;
                } else {
                    path.reset();
                    int length = ((jg.c) this.f12174h0).f14158b.length;
                    long[] jArr = fVar.f14840a.f14150a;
                    fVar.f14844f.reset();
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
                            jg.b bVar = this.f12174h0;
                            float f10 = this.C0 * ((jg.c) bVar).f14158b[i19];
                            if (g.B1) {
                                arrayList2 = arrayList3;
                                f7 = this.f12178j0;
                                i14 = measuredHeight2;
                            } else {
                                arrayList2 = arrayList3;
                                i14 = measuredHeight2;
                                f7 = (float) ((jg.c) bVar).f14160e;
                            }
                            float f11 = (1.0f - ((((float) j3) * ((jg.c) bVar).f14166l[i20]) / f7)) * (i13 - i14);
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
                    fVar.f14847j = i18;
                    if (fVar.f14851n || fVar.f14852o != 0.0f) {
                        paint.setAlpha((int) (fVar.f14852o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.f14847j, paint);
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
        int i10 = this.f12190s0;
        if (i10 >= 0 && this.f12192u0) {
            float f7 = this.F0;
            j jVar = this.f12172g0;
            float f10 = jVar.f12216l;
            float f11 = jVar.f12215k;
            float f12 = f7 / (f10 - f11);
            float f13 = (((jg.c) this.f12174h0).f14158b[i10] * f12) - ((f11 * f12) - g.f12140k1);
            Paint paint = this.M;
            paint.setAlpha((int) (this.f12187r * this.f12193v0));
            canvas.drawLine(f13, 0.0f, f13, this.H0.bottom, paint);
            ArrayList arrayList = this.d;
            this.m0 = arrayList.size();
            int i11 = 0;
            while (true) {
                this.f12183n0 = i11;
                int i12 = this.f12183n0;
                if (i12 < this.m0) {
                    kg.f fVar = (kg.f) arrayList.get(i12);
                    boolean z10 = fVar.f14851n;
                    Paint paint2 = fVar.d;
                    if (z10 || fVar.f14852o != 0.0f) {
                        float f14 = ((float) fVar.f14840a.f14150a[this.f12190s0]) * ((jg.c) this.f12174h0).f14166l[this.f12183n0];
                        float f15 = this.f12194w;
                        float measuredHeight = (getMeasuredHeight() - this.f12189s) - (((f14 - f15) / (this.v - f15)) * ((getMeasuredHeight() - this.f12189s) - g.f12142n1));
                        paint2.setAlpha((int) (fVar.f14852o * 255.0f * this.f12193v0));
                        Paint paint3 = this.S;
                        paint3.setAlpha((int) (fVar.f14852o * 255.0f * this.f12193v0));
                        canvas.drawPoint(f13, measuredHeight, paint2);
                        canvas.drawPoint(f13, measuredHeight, paint3);
                    }
                    i11 = this.f12183n0 + 1;
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
            if (((kg.f) arrayList.get(i12)).f14851n) {
                j3 = ((float) ((jg.a) ((jg.c) this.f12174h0).d.get(i12)).f14151b.rMaxQ(i10, i11)) * ((jg.c) this.f12174h0).f14166l[i12];
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
            if (((kg.f) arrayList.get(i12)).f14851n) {
                j3 = (int) (((float) ((jg.a) ((jg.c) this.f12174h0).d.get(i12)).f14151b.rMinQ(i10, i11)) * ((jg.c) this.f12174h0).f14166l[i12]);
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
