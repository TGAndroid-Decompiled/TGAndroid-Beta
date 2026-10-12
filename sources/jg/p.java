package jg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import bi.w5;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.nq0;
import org.telegram.ui.ra1;
public final class p extends g {
    public long[] D1;

    public p(Context context, c6 c6Var) {
        super(context, c6Var);
        this.f13068w0 = true;
        this.f13070x0 = true;
    }

    @Override
    public final void C(int i10, int i11) {
        float f7;
        kg.b bVar = this.f13047h0;
        if (bVar != null) {
            int i12 = this.f13063s0;
            float f10 = this.G0;
            float f11 = (this.f13045g0.f13086k * f10) - g.f13014k1;
            kg.d dVar = (kg.d) bVar;
            float[] fArr = dVar.f14250b;
            if (fArr.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = fArr[1] * f10;
            }
            float f12 = (i10 + f11) / (f10 - f7);
            if (f12 < 0.0f) {
                this.f13063s0 = 0;
            } else if (f12 > 1.0f) {
                this.f13063s0 = dVar.f14249a.length - 1;
            } else {
                int b10 = dVar.b(f12, this.F, this.G);
                this.f13063s0 = b10;
                int i13 = this.G;
                if (b10 > i13) {
                    this.f13063s0 = i13;
                }
                int i14 = this.f13063s0;
                int i15 = this.F;
                if (i14 < i15) {
                    this.f13063s0 = i15;
                }
            }
            if (i12 != this.f13063s0) {
                this.f13065u0 = true;
                c(true);
                x(f11);
                e eVar = this.Q0;
                if (eVar != null) {
                    getSelectedDate();
                    ra1 ra1Var = (ra1) ((nq0) eVar).f38783b;
                    ra1Var.f();
                    ra1Var.f39719b.f13064t0.d(false, false);
                }
                invalidate();
                B();
            }
        }
    }

    @Override
    public final void K() {
        if (g.B1) {
            int length = ((kg.d) this.f13047h0).f14249a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    lg.h hVar = (lg.h) arrayList.get(i11);
                    if (hVar.f14720n) {
                        j11 += hVar.f14710a.f14243a[i10];
                    }
                }
                if (j11 > j10) {
                    j10 = j11;
                }
            }
            if (j10 > 0) {
                float f7 = (float) j10;
                if (f7 != this.f13054l0) {
                    this.f13054l0 = f7;
                    Animator animator = this.f13038d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = g.e(this.f13051j0, this.f13054l0, new w5(this, 5));
                    this.f13038d0 = e;
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
        kg.b bVar = this.f13047h0;
        if (bVar == null) {
            return;
        }
        float f15 = this.F0;
        j jVar = this.f13045g0;
        float f16 = jVar.f13087l;
        float f17 = jVar.f13086k;
        float f18 = f15 / (f16 - f17);
        float f19 = g.f13014k1;
        float f20 = (f17 * f18) - f19;
        float[] fArr = ((kg.d) bVar).f14250b;
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
        int min = Math.min(((kg.d) this.f13047h0).f14250b.length - 1, this.G + i13 + 2);
        int i15 = 0;
        while (true) {
            arrayList = this.d;
            if (i15 >= arrayList.size()) {
                break;
            }
            ((lg.f) arrayList.get(i15)).f14716j = 0;
            i15++;
        }
        canvas2.save();
        int i16 = this.f13072y0;
        float f23 = 0.0f;
        if (i16 == 2) {
            this.f13043f0 = true;
            this.f13066v0 = 0.0f;
            lg.j jVar2 = this.f13073z0;
            float f24 = jVar2.f14729f;
            f12 = 1.0f - f24;
            f11 = 2.0f;
            canvas2.scale((f24 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else {
            f11 = 2.0f;
            if (i16 == 1) {
                lg.j jVar3 = this.f13073z0;
                float f25 = jVar3.f14729f;
                canvas2.scale(f25, 1.0f, jVar3.d, jVar3.e);
                f12 = f25;
            } else if (i16 == 3) {
                f12 = this.f13073z0.f14729f;
            } else {
                f12 = 1.0f;
            }
        }
        z10 = (this.f13063s0 < 0 || !this.f13065u0) ? false : false;
        while (true) {
            i10 = g.f13016n1;
            if (max > min) {
                break;
            }
            if (this.f13063s0 == max && z10) {
                f14 = f23;
            } else {
                int i17 = i14;
                float f26 = f23;
                f14 = f26;
                while (i17 < arrayList.size()) {
                    lg.f fVar = (lg.f) arrayList.get(i17);
                    if (!fVar.f14720n && fVar.f14721o == f14) {
                        i11 = min;
                        i12 = max;
                    } else {
                        long[] jArr = fVar.f14710a.f14243a;
                        float f27 = (((f18 - f10) * ((kg.d) this.f13047h0).f14250b[max]) + (f10 / f11)) - f20;
                        i11 = min;
                        i12 = max;
                        float measuredHeight = (((float) jArr[i12]) / this.v) * ((getMeasuredHeight() - this.f13062s) - i10) * fVar.f14721o;
                        float measuredHeight2 = (getMeasuredHeight() - this.f13062s) - measuredHeight;
                        float[] fArr2 = fVar.f14717k;
                        int i18 = fVar.f14716j;
                        int i19 = i18 + 1;
                        fVar.f14716j = i19;
                        fArr2[i18] = f27;
                        int i20 = i18 + 2;
                        fVar.f14716j = i20;
                        fArr2[i19] = measuredHeight2 - f26;
                        int i21 = i18 + 3;
                        fVar.f14716j = i21;
                        fArr2[i20] = f27;
                        fVar.f14716j = i18 + 4;
                        fArr2[i21] = (getMeasuredHeight() - this.f13062s) - f26;
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
            if (!z10 && !this.f13043f0) {
                paint = hVar.f14712c;
            } else {
                paint = hVar.f14723q;
            }
            if (z10) {
                f13 = 255.0f;
                hVar.f14723q.setColor(i0.a.d(this.f13066v0, hVar.f14719m, hVar.f14724r));
            } else {
                f13 = 255.0f;
            }
            if (this.f13043f0) {
                hVar.f14723q.setColor(i0.a.d(1.0f, hVar.f14719m, hVar.f14724r));
            }
            paint.setAlpha((int) (f12 * f13));
            paint.setStrokeWidth(f7);
            canvas2.drawLines(hVar.f14717k, 0, hVar.f14716j, paint);
        }
        if (z10) {
            int i23 = 0;
            float f29 = f28;
            while (i23 < arrayList.size()) {
                lg.f fVar2 = (lg.f) arrayList.get(i23);
                boolean z11 = fVar2.f14720n;
                Paint paint2 = fVar2.f14712c;
                if (z11 || fVar2.f14721o != f28) {
                    long[] jArr2 = fVar2.f14710a.f14243a;
                    float[] fArr3 = ((kg.d) this.f13047h0).f14250b;
                    int i24 = this.f13063s0;
                    float f30 = (((f18 - f10) * fArr3[i24]) + (f10 / f11)) - f20;
                    float measuredHeight3 = (((float) jArr2[i24]) / this.v) * ((getMeasuredHeight() - this.f13062s) - i10) * fVar2.f14721o;
                    paint2.setStrokeWidth(f7);
                    paint2.setAlpha((int) (f12 * 255.0f));
                    canvas2.drawLine(f30, ((getMeasuredHeight() - this.f13062s) - measuredHeight3) - f29, f30, (getMeasuredHeight() - this.f13062s) - f29, paint2);
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
        kg.b bVar = this.f13047h0;
        if (bVar != null) {
            int length = ((kg.d) bVar).f14250b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((lg.f) arrayList.get(i13)).f14716j = 0;
            }
            char c11 = 1;
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.D1;
            if (jArr == null || jArr.length < size) {
                this.D1 = new long[size];
            }
            int i14 = 0;
            while (i14 < length) {
                float f12 = ((kg.d) this.f13047h0).f14250b[i14] * this.C0;
                int i15 = i12;
                while (true) {
                    f10 = 0.0f;
                    if (i15 >= size) {
                        break;
                    }
                    lg.f fVar = (lg.f) arrayList.get(i15);
                    if (fVar.f14720n || fVar.f14721o != 0.0f) {
                        long j10 = fVar.f14710a.f14243a[i14];
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
                        if (!fVar2.f14720n && fVar2.f14721o == f10) {
                            i11 = length;
                            c10 = c11;
                            i10 = i14;
                        } else {
                            if (g.B1) {
                                f11 = this.f13051j0;
                            } else {
                                f11 = (float) ((kg.d) this.f13047h0).e;
                            }
                            long[] jArr3 = this.D1;
                            char c12 = c11;
                            i10 = i14;
                            float f14 = (((float) jArr3[i16]) / f11) * fVar2.f14721o;
                            int i17 = this.B0;
                            float f15 = f14 * i17;
                            float[] fArr = fVar2.f14717k;
                            int i18 = fVar2.f14716j;
                            c10 = c12;
                            int i19 = i18 + 1;
                            fVar2.f14716j = i19;
                            fArr[i18] = f12;
                            int i20 = i18 + 2;
                            fVar2.f14716j = i20;
                            i11 = length;
                            fArr[i19] = (i17 - f15) - f13;
                            int i21 = i18 + 3;
                            fVar2.f14716j = i21;
                            fArr[i20] = f12;
                            fVar2.f14716j = i18 + 4;
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
            kg.b bVar2 = this.f13047h0;
            if (((kg.d) bVar2).f14250b.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = ((kg.d) bVar2).f14250b[c13] * this.C0;
            }
            for (int i22 = 0; i22 < size; i22++) {
                lg.f fVar3 = (lg.f) arrayList.get(i22);
                Paint paint = fVar3.f14712c;
                Paint paint2 = fVar3.f14712c;
                paint.setStrokeWidth(max * f7);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.f14717k, 0, fVar3.f14716j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f13032b;
        this.m0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f13056n0 = i10;
            int i11 = this.f13056n0;
            if (i11 < this.m0) {
                l(canvas, (lg.d) arrayList.get(i11));
                p(canvas, (lg.d) arrayList.get(this.f13056n0));
                i10 = this.f13056n0 + 1;
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
        return ((kg.d) this.f13047h0).f14259m.rMaxQ(i10, i11);
    }

    @Override
    public final void u() {
        super.u();
        this.f13051j0 = 0.0f;
        int length = ((kg.d) this.f13047h0).f14249a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                lg.h hVar = (lg.h) arrayList.get(i11);
                if (hVar.f14720n) {
                    j10 += hVar.f14710a.f14243a[i10];
                }
            }
            float f7 = (float) j10;
            if (f7 > this.f13051j0) {
                this.f13051j0 = f7;
            }
        }
    }

    @Override
    public final void z() {
        int length = ((kg.a) ((kg.d) this.f13047h0).d.get(0)).f14243a.length;
        int size = ((kg.d) this.f13047h0).d.size();
        ((kg.d) this.f13047h0).f14258l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((kg.d) this.f13047h0).f14258l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((lg.h) this.d.get(i11)).f14720n) {
                    kg.b bVar = this.f13047h0;
                    long[] jArr = ((kg.d) bVar).f14258l;
                    jArr[i10] = jArr[i10] + ((kg.a) ((kg.d) bVar).d.get(i11)).f14243a[i10];
                }
            }
        }
        kg.b bVar2 = this.f13047h0;
        ((kg.d) bVar2).f14259m = new SegmentTree(((kg.d) bVar2).f14258l);
        super.z();
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
