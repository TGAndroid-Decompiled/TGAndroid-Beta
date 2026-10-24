package jg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import ci.u4;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.d91;
import org.telegram.ui.rp0;
public final class p extends g {
    public long[] D1;

    public p(Context context, g6 g6Var) {
        super(context, g6Var);
        this.f14529w0 = true;
        this.f14531x0 = true;
    }

    @Override
    public final void C(int i10, int i11) {
        float f7;
        kg.b bVar = this.f14508h0;
        if (bVar != null) {
            int i12 = this.f14524s0;
            float f10 = this.G0;
            float f11 = (this.f14506g0.f14547k * f10) - g.f14475k1;
            kg.d dVar = (kg.d) bVar;
            float[] fArr = dVar.f15099b;
            if (fArr.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = fArr[1] * f10;
            }
            float f12 = (i10 + f11) / (f10 - f7);
            if (f12 < 0.0f) {
                this.f14524s0 = 0;
            } else if (f12 > 1.0f) {
                this.f14524s0 = dVar.f15098a.length - 1;
            } else {
                int b10 = dVar.b(f12, this.F, this.G);
                this.f14524s0 = b10;
                int i13 = this.G;
                if (b10 > i13) {
                    this.f14524s0 = i13;
                }
                int i14 = this.f14524s0;
                int i15 = this.F;
                if (i14 < i15) {
                    this.f14524s0 = i15;
                }
            }
            if (i12 != this.f14524s0) {
                this.f14526u0 = true;
                c(true);
                x(f11);
                e eVar = this.Q0;
                if (eVar != null) {
                    getSelectedDate();
                    d91 d91Var = (d91) ((rp0) eVar).f41206b;
                    d91Var.f();
                    d91Var.f36540b.f14525t0.d(false, false);
                }
                invalidate();
                B();
            }
        }
    }

    @Override
    public final void K() {
        if (g.B1) {
            int length = ((kg.d) this.f14508h0).f15098a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    lg.h hVar = (lg.h) arrayList.get(i11);
                    if (hVar.f16126n) {
                        j11 += hVar.f16116a.f15092a[i10];
                    }
                }
                if (j11 > j10) {
                    j10 = j11;
                }
            }
            if (j10 > 0) {
                float f7 = (float) j10;
                if (f7 != this.f14515l0) {
                    this.f14515l0 = f7;
                    Animator animator = this.f14499d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = g.e(this.f14512j0, this.f14515l0, new u4(this, 5));
                    this.f14499d0 = e;
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
        kg.b bVar = this.f14508h0;
        if (bVar == null) {
            return;
        }
        float f15 = this.F0;
        j jVar = this.f14506g0;
        float f16 = jVar.f14548l;
        float f17 = jVar.f14547k;
        float f18 = f15 / (f16 - f17);
        float f19 = g.f14475k1;
        float f20 = (f17 * f18) - f19;
        float[] fArr = ((kg.d) bVar).f15099b;
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
        int min = Math.min(((kg.d) this.f14508h0).f15099b.length - 1, this.G + i13 + 2);
        int i15 = 0;
        while (true) {
            arrayList = this.d;
            if (i15 >= arrayList.size()) {
                break;
            }
            ((lg.f) arrayList.get(i15)).f16122j = 0;
            i15++;
        }
        canvas2.save();
        int i16 = this.f14533y0;
        float f23 = 0.0f;
        if (i16 == 2) {
            this.f14504f0 = true;
            this.f14527v0 = 0.0f;
            lg.j jVar2 = this.f14534z0;
            float f24 = jVar2.f16135f;
            f12 = 1.0f - f24;
            f11 = 2.0f;
            canvas2.scale((f24 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else {
            f11 = 2.0f;
            if (i16 == 1) {
                lg.j jVar3 = this.f14534z0;
                float f25 = jVar3.f16135f;
                canvas2.scale(f25, 1.0f, jVar3.d, jVar3.e);
                f12 = f25;
            } else if (i16 == 3) {
                f12 = this.f14534z0.f16135f;
            } else {
                f12 = 1.0f;
            }
        }
        z10 = (this.f14524s0 < 0 || !this.f14526u0) ? false : false;
        while (true) {
            i10 = g.f14477n1;
            if (max > min) {
                break;
            }
            if (this.f14524s0 == max && z10) {
                f14 = f23;
            } else {
                int i17 = i14;
                float f26 = f23;
                f14 = f26;
                while (i17 < arrayList.size()) {
                    lg.f fVar = (lg.f) arrayList.get(i17);
                    if (!fVar.f16126n && fVar.f16127o == f14) {
                        i11 = min;
                        i12 = max;
                    } else {
                        long[] jArr = fVar.f16116a.f15092a;
                        float f27 = (((f18 - f10) * ((kg.d) this.f14508h0).f15099b[max]) + (f10 / f11)) - f20;
                        i11 = min;
                        i12 = max;
                        float measuredHeight = (((float) jArr[i12]) / this.v) * ((getMeasuredHeight() - this.f14523s) - i10) * fVar.f16127o;
                        float measuredHeight2 = (getMeasuredHeight() - this.f14523s) - measuredHeight;
                        float[] fArr2 = fVar.f16123k;
                        int i18 = fVar.f16122j;
                        int i19 = i18 + 1;
                        fVar.f16122j = i19;
                        fArr2[i18] = f27;
                        int i20 = i18 + 2;
                        fVar.f16122j = i20;
                        fArr2[i19] = measuredHeight2 - f26;
                        int i21 = i18 + 3;
                        fVar.f16122j = i21;
                        fArr2[i20] = f27;
                        fVar.f16122j = i18 + 4;
                        fArr2[i21] = (getMeasuredHeight() - this.f14523s) - f26;
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
            if (!z10 && !this.f14504f0) {
                paint = hVar.f16118c;
            } else {
                paint = hVar.f16129q;
            }
            if (z10) {
                f13 = 255.0f;
                hVar.f16129q.setColor(i0.a.f(this.f14527v0, hVar.f16125m, hVar.f16130r));
            } else {
                f13 = 255.0f;
            }
            if (this.f14504f0) {
                hVar.f16129q.setColor(i0.a.f(1.0f, hVar.f16125m, hVar.f16130r));
            }
            paint.setAlpha((int) (f12 * f13));
            paint.setStrokeWidth(f7);
            canvas2.drawLines(hVar.f16123k, 0, hVar.f16122j, paint);
        }
        if (z10) {
            int i23 = 0;
            float f29 = f28;
            while (i23 < arrayList.size()) {
                lg.f fVar2 = (lg.f) arrayList.get(i23);
                boolean z11 = fVar2.f16126n;
                Paint paint2 = fVar2.f16118c;
                if (z11 || fVar2.f16127o != f28) {
                    long[] jArr2 = fVar2.f16116a.f15092a;
                    float[] fArr3 = ((kg.d) this.f14508h0).f15099b;
                    int i24 = this.f14524s0;
                    float f30 = (((f18 - f10) * fArr3[i24]) + (f10 / f11)) - f20;
                    float measuredHeight3 = (((float) jArr2[i24]) / this.v) * ((getMeasuredHeight() - this.f14523s) - i10) * fVar2.f16127o;
                    paint2.setStrokeWidth(f7);
                    paint2.setAlpha((int) (f12 * 255.0f));
                    canvas2.drawLine(f30, ((getMeasuredHeight() - this.f14523s) - measuredHeight3) - f29, f30, (getMeasuredHeight() - this.f14523s) - f29, paint2);
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
        kg.b bVar = this.f14508h0;
        if (bVar != null) {
            int length = ((kg.d) bVar).f15099b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((lg.f) arrayList.get(i13)).f16122j = 0;
            }
            char c11 = 1;
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.D1;
            if (jArr == null || jArr.length < size) {
                this.D1 = new long[size];
            }
            int i14 = 0;
            while (i14 < length) {
                float f12 = ((kg.d) this.f14508h0).f15099b[i14] * this.C0;
                int i15 = i12;
                while (true) {
                    f10 = 0.0f;
                    if (i15 >= size) {
                        break;
                    }
                    lg.f fVar = (lg.f) arrayList.get(i15);
                    if (fVar.f16126n || fVar.f16127o != 0.0f) {
                        long j10 = fVar.f16116a.f15092a[i14];
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
                        if (!fVar2.f16126n && fVar2.f16127o == f10) {
                            i11 = length;
                            c10 = c11;
                            i10 = i14;
                        } else {
                            if (g.B1) {
                                f11 = this.f14512j0;
                            } else {
                                f11 = (float) ((kg.d) this.f14508h0).e;
                            }
                            long[] jArr3 = this.D1;
                            char c12 = c11;
                            i10 = i14;
                            float f14 = (((float) jArr3[i16]) / f11) * fVar2.f16127o;
                            int i17 = this.B0;
                            float f15 = f14 * i17;
                            float[] fArr = fVar2.f16123k;
                            int i18 = fVar2.f16122j;
                            c10 = c12;
                            int i19 = i18 + 1;
                            fVar2.f16122j = i19;
                            fArr[i18] = f12;
                            int i20 = i18 + 2;
                            fVar2.f16122j = i20;
                            i11 = length;
                            fArr[i19] = (i17 - f15) - f13;
                            int i21 = i18 + 3;
                            fVar2.f16122j = i21;
                            fArr[i20] = f12;
                            fVar2.f16122j = i18 + 4;
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
            kg.b bVar2 = this.f14508h0;
            if (((kg.d) bVar2).f15099b.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = ((kg.d) bVar2).f15099b[c13] * this.C0;
            }
            for (int i22 = 0; i22 < size; i22++) {
                lg.f fVar3 = (lg.f) arrayList.get(i22);
                Paint paint = fVar3.f16118c;
                Paint paint2 = fVar3.f16118c;
                paint.setStrokeWidth(max * f7);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.f16123k, 0, fVar3.f16122j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f14493b;
        this.m0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f14517n0 = i10;
            int i11 = this.f14517n0;
            if (i11 < this.m0) {
                l(canvas, (lg.d) arrayList.get(i11));
                p(canvas, (lg.d) arrayList.get(this.f14517n0));
                i10 = this.f14517n0 + 1;
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
        return ((kg.d) this.f14508h0).f15108m.rMaxQ(i10, i11);
    }

    @Override
    public final void u() {
        super.u();
        this.f14512j0 = 0.0f;
        int length = ((kg.d) this.f14508h0).f15098a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                lg.h hVar = (lg.h) arrayList.get(i11);
                if (hVar.f16126n) {
                    j10 += hVar.f16116a.f15092a[i10];
                }
            }
            float f7 = (float) j10;
            if (f7 > this.f14512j0) {
                this.f14512j0 = f7;
            }
        }
    }

    @Override
    public final void z() {
        int length = ((kg.a) ((kg.d) this.f14508h0).d.get(0)).f15092a.length;
        int size = ((kg.d) this.f14508h0).d.size();
        ((kg.d) this.f14508h0).f15107l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((kg.d) this.f14508h0).f15107l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((lg.h) this.d.get(i11)).f16126n) {
                    kg.b bVar = this.f14508h0;
                    long[] jArr = ((kg.d) bVar).f15107l;
                    jArr[i10] = jArr[i10] + ((kg.a) ((kg.d) bVar).d.get(i11)).f15092a[i10];
                }
            }
        }
        kg.b bVar2 = this.f14508h0;
        ((kg.d) bVar2).f15108m = new SegmentTree(((kg.d) bVar2).f15107l);
        super.z();
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
