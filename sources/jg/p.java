package jg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import ci.v4;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.pp0;
import org.telegram.ui.z81;
public final class p extends g {
    public long[] D1;

    public p(Context context, d6 d6Var) {
        super(context, d6Var);
        this.f14486w0 = true;
        this.f14488x0 = true;
    }

    @Override
    public final void C(int i10, int i11) {
        float f7;
        kg.b bVar = this.f14465h0;
        if (bVar != null) {
            int i12 = this.f14481s0;
            float f10 = this.G0;
            float f11 = (this.f14463g0.f14504k * f10) - g.f14432k1;
            kg.d dVar = (kg.d) bVar;
            float[] fArr = dVar.f15055b;
            if (fArr.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = fArr[1] * f10;
            }
            float f12 = (i10 + f11) / (f10 - f7);
            if (f12 < 0.0f) {
                this.f14481s0 = 0;
            } else if (f12 > 1.0f) {
                this.f14481s0 = dVar.f15054a.length - 1;
            } else {
                int b10 = dVar.b(f12, this.F, this.G);
                this.f14481s0 = b10;
                int i13 = this.G;
                if (b10 > i13) {
                    this.f14481s0 = i13;
                }
                int i14 = this.f14481s0;
                int i15 = this.F;
                if (i14 < i15) {
                    this.f14481s0 = i15;
                }
            }
            if (i12 != this.f14481s0) {
                this.f14483u0 = true;
                c(true);
                x(f11);
                e eVar = this.Q0;
                if (eVar != null) {
                    getSelectedDate();
                    z81 z81Var = (z81) ((pp0) eVar).f40277b;
                    z81Var.f();
                    z81Var.f43670b.f14482t0.d(false, false);
                }
                invalidate();
                B();
            }
        }
    }

    @Override
    public final void K() {
        if (g.B1) {
            int length = ((kg.d) this.f14465h0).f15054a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    lg.h hVar = (lg.h) arrayList.get(i11);
                    if (hVar.f16065n) {
                        j11 += hVar.f16055a.f15048a[i10];
                    }
                }
                if (j11 > j10) {
                    j10 = j11;
                }
            }
            if (j10 > 0) {
                float f7 = (float) j10;
                if (f7 != this.f14472l0) {
                    this.f14472l0 = f7;
                    Animator animator = this.f14456d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = g.e(this.f14469j0, this.f14472l0, new v4(this, 5));
                    this.f14456d0 = e;
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
    public final lg.f h(kg.a aVar) {
        return new lg.h(aVar, this.W0);
    }

    @Override
    public final void k(Canvas canvas) {
        float f7;
        float f10;
        ArrayList arrayList;
        float f11;
        float f12;
        int i10;
        Paint paint;
        float f13;
        float f14;
        int i11;
        int i12;
        Canvas canvas2 = canvas;
        kg.b bVar = this.f14465h0;
        if (bVar == null) {
            return;
        }
        float f15 = this.F0;
        j jVar = this.f14463g0;
        float f16 = jVar.f14505l;
        float f17 = jVar.f14504k;
        float f18 = f15 / (f16 - f17);
        float f19 = g.f14432k1;
        float f20 = (f17 * f18) - f19;
        float[] fArr = ((kg.d) bVar).f15055b;
        boolean z10 = true;
        if (fArr.length < 2) {
            f10 = 1.0f;
            f7 = 1.0f;
        } else {
            float f21 = fArr[1];
            float f22 = f21 * f18;
            f7 = (f18 - f22) * f21;
            f10 = f22;
        }
        int i13 = ((int) (f19 / f10)) + 1;
        int i14 = 0;
        int max = Math.max(0, (this.F - i13) - 2);
        int min = Math.min(((kg.d) this.f14465h0).f15055b.length - 1, this.G + i13 + 2);
        int i15 = 0;
        while (true) {
            arrayList = this.d;
            if (i15 >= arrayList.size()) {
                break;
            }
            ((lg.f) arrayList.get(i15)).f16061j = 0;
            i15++;
        }
        canvas2.save();
        int i16 = this.f14490y0;
        float f23 = 0.0f;
        if (i16 == 2) {
            this.f14461f0 = true;
            this.f14484v0 = 0.0f;
            lg.j jVar2 = this.f14491z0;
            float f24 = jVar2.f16074f;
            f12 = 1.0f - f24;
            f11 = 2.0f;
            canvas2.scale((f24 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else {
            f11 = 2.0f;
            if (i16 == 1) {
                lg.j jVar3 = this.f14491z0;
                float f25 = jVar3.f16074f;
                canvas2.scale(f25, 1.0f, jVar3.d, jVar3.e);
                f12 = f25;
            } else if (i16 == 3) {
                f12 = this.f14491z0.f16074f;
            } else {
                f12 = 1.0f;
            }
        }
        z10 = (this.f14481s0 < 0 || !this.f14483u0) ? false : false;
        while (true) {
            i10 = g.f14434n1;
            if (max > min) {
                break;
            }
            if (this.f14481s0 == max && z10) {
                f14 = f23;
            } else {
                int i17 = i14;
                float f26 = f23;
                f14 = f26;
                while (i17 < arrayList.size()) {
                    lg.f fVar = (lg.f) arrayList.get(i17);
                    if (!fVar.f16065n && fVar.f16066o == f14) {
                        i11 = min;
                        i12 = max;
                    } else {
                        long[] jArr = fVar.f16055a.f15048a;
                        float f27 = (((f18 - f10) * ((kg.d) this.f14465h0).f15055b[max]) + (f10 / f11)) - f20;
                        i11 = min;
                        i12 = max;
                        float measuredHeight = (((float) jArr[i12]) / this.v) * ((getMeasuredHeight() - this.f14480s) - i10) * fVar.f16066o;
                        float measuredHeight2 = (getMeasuredHeight() - this.f14480s) - measuredHeight;
                        float[] fArr2 = fVar.f16062k;
                        int i18 = fVar.f16061j;
                        int i19 = i18 + 1;
                        fVar.f16061j = i19;
                        fArr2[i18] = f27;
                        int i20 = i18 + 2;
                        fVar.f16061j = i20;
                        fArr2[i19] = measuredHeight2 - f26;
                        int i21 = i18 + 3;
                        fVar.f16061j = i21;
                        fArr2[i20] = f27;
                        fVar.f16061j = i18 + 4;
                        fArr2[i21] = (getMeasuredHeight() - this.f14480s) - f26;
                        f26 += measuredHeight;
                    }
                    i17++;
                    min = i11;
                    max = i12;
                }
            }
            max++;
            min = min;
            f23 = f14;
            i14 = 0;
        }
        float f28 = f23;
        for (int i22 = 0; i22 < arrayList.size(); i22++) {
            lg.h hVar = (lg.h) arrayList.get(i22);
            if (!z10 && !this.f14461f0) {
                paint = hVar.f16057c;
            } else {
                paint = hVar.f16068q;
            }
            if (z10) {
                f13 = 255.0f;
                hVar.f16068q.setColor(i0.a.f(this.f14484v0, hVar.f16064m, hVar.f16069r));
            } else {
                f13 = 255.0f;
            }
            if (this.f14461f0) {
                hVar.f16068q.setColor(i0.a.f(1.0f, hVar.f16064m, hVar.f16069r));
            }
            paint.setAlpha((int) (f12 * f13));
            paint.setStrokeWidth(f7);
            canvas2.drawLines(hVar.f16062k, 0, hVar.f16061j, paint);
        }
        if (z10) {
            int i23 = 0;
            float f29 = f28;
            while (i23 < arrayList.size()) {
                lg.f fVar2 = (lg.f) arrayList.get(i23);
                boolean z11 = fVar2.f16065n;
                Paint paint2 = fVar2.f16057c;
                if (z11 || fVar2.f16066o != f28) {
                    long[] jArr2 = fVar2.f16055a.f15048a;
                    float[] fArr3 = ((kg.d) this.f14465h0).f15055b;
                    int i24 = this.f14481s0;
                    float f30 = (((f18 - f10) * fArr3[i24]) + (f10 / f11)) - f20;
                    float measuredHeight3 = (((float) jArr2[i24]) / this.v) * ((getMeasuredHeight() - this.f14480s) - i10) * fVar2.f16066o;
                    paint2.setStrokeWidth(f7);
                    paint2.setAlpha((int) (f12 * 255.0f));
                    canvas2.drawLine(f30, ((getMeasuredHeight() - this.f14480s) - measuredHeight3) - f29, f30, (getMeasuredHeight() - this.f14480s) - f29, paint2);
                    f29 += measuredHeight3;
                }
                i23++;
                canvas2 = canvas;
            }
        }
        canvas.restore();
    }

    @Override
    public final void n(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        int i10;
        char c10;
        int i11;
        kg.b bVar = this.f14465h0;
        if (bVar != null) {
            int length = ((kg.d) bVar).f15055b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((lg.f) arrayList.get(i13)).f16061j = 0;
            }
            char c11 = 1;
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.D1;
            if (jArr == null || jArr.length < size) {
                this.D1 = new long[size];
            }
            int i14 = 0;
            while (i14 < length) {
                float f12 = ((kg.d) this.f14465h0).f15055b[i14] * this.C0;
                int i15 = i12;
                while (true) {
                    f10 = 0.0f;
                    if (i15 >= size) {
                        break;
                    }
                    lg.f fVar = (lg.f) arrayList.get(i15);
                    if (fVar.f16065n || fVar.f16066o != 0.0f) {
                        long j10 = fVar.f16055a.f15048a[i14];
                        long[] jArr2 = this.D1;
                        if (j10 > jArr2[i15]) {
                            jArr2[i15] = j10;
                        }
                    }
                    i15++;
                }
                if (i14 % max == 0) {
                    int i16 = i12;
                    float f13 = 0.0f;
                    while (i16 < size) {
                        lg.f fVar2 = (lg.f) arrayList.get(i16);
                        if (!fVar2.f16065n && fVar2.f16066o == f10) {
                            i11 = length;
                            c10 = c11;
                            i10 = i14;
                        } else {
                            if (g.B1) {
                                f11 = this.f14469j0;
                            } else {
                                f11 = (float) ((kg.d) this.f14465h0).e;
                            }
                            long[] jArr3 = this.D1;
                            char c12 = c11;
                            i10 = i14;
                            float f14 = (((float) jArr3[i16]) / f11) * fVar2.f16066o;
                            int i17 = this.B0;
                            float f15 = f14 * i17;
                            float[] fArr = fVar2.f16062k;
                            int i18 = fVar2.f16061j;
                            c10 = c12;
                            int i19 = i18 + 1;
                            fVar2.f16061j = i19;
                            fArr[i18] = f12;
                            int i20 = i18 + 2;
                            fVar2.f16061j = i20;
                            i11 = length;
                            fArr[i19] = (i17 - f15) - f13;
                            int i21 = i18 + 3;
                            fVar2.f16061j = i21;
                            fArr[i20] = f12;
                            fVar2.f16061j = i18 + 4;
                            fArr[i21] = i17 - f13;
                            f13 += f15;
                            jArr3[i16] = 0;
                        }
                        i16++;
                        i14 = i10;
                        c11 = c10;
                        length = i11;
                        f10 = 0.0f;
                    }
                }
                i14++;
                c11 = c11;
                length = length;
                i12 = 0;
            }
            char c13 = c11;
            kg.b bVar2 = this.f14465h0;
            if (((kg.d) bVar2).f15055b.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = ((kg.d) bVar2).f15055b[c13] * this.C0;
            }
            for (int i22 = 0; i22 < size; i22++) {
                lg.f fVar3 = (lg.f) arrayList.get(i22);
                Paint paint = fVar3.f16057c;
                Paint paint2 = fVar3.f16057c;
                paint.setStrokeWidth(max * f7);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.f16062k, 0, fVar3.f16061j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f14450b;
        this.m0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f14474n0 = i10;
            int i11 = this.f14474n0;
            if (i11 < this.m0) {
                l(canvas, (lg.d) arrayList.get(i11));
                p(canvas, (lg.d) arrayList.get(this.f14474n0));
                i10 = this.f14474n0 + 1;
            } else {
                j(canvas);
                m(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override
    public final long r(int i10, int i11) {
        return ((kg.d) this.f14465h0).f15064m.rMaxQ(i10, i11);
    }

    @Override
    public final void u() {
        super.u();
        this.f14469j0 = 0.0f;
        int length = ((kg.d) this.f14465h0).f15054a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                lg.h hVar = (lg.h) arrayList.get(i11);
                if (hVar.f16065n) {
                    j10 += hVar.f16055a.f15048a[i10];
                }
            }
            float f7 = (float) j10;
            if (f7 > this.f14469j0) {
                this.f14469j0 = f7;
            }
        }
    }

    @Override
    public final void z() {
        int length = ((kg.a) ((kg.d) this.f14465h0).d.get(0)).f15048a.length;
        int size = ((kg.d) this.f14465h0).d.size();
        ((kg.d) this.f14465h0).f15063l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((kg.d) this.f14465h0).f15063l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((lg.h) this.d.get(i11)).f16065n) {
                    kg.b bVar = this.f14465h0;
                    long[] jArr = ((kg.d) bVar).f15063l;
                    jArr[i10] = jArr[i10] + ((kg.a) ((kg.d) bVar).d.get(i11)).f15048a[i10];
                }
            }
        }
        kg.b bVar2 = this.f14465h0;
        ((kg.d) bVar2).f15064m = new SegmentTree(((kg.d) bVar2).f15063l);
        super.z();
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
