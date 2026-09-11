package jg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import bi.u5;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.la1;
import org.telegram.ui.vl0;
public final class p extends g {
    public long[] D1;

    public p(Context context, f6 f6Var) {
        super(context, f6Var);
        this.f13694w0 = true;
        this.f13696x0 = true;
    }

    @Override
    public final void C(int i10, int i11) {
        float f7;
        kg.b bVar = this.f13673h0;
        if (bVar != null) {
            int i12 = this.f13689s0;
            float f10 = this.G0;
            float f11 = (this.f13671g0.f13714k * f10) - g.f13639k1;
            kg.d dVar = (kg.d) bVar;
            float[] fArr = dVar.f14926b;
            if (fArr.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = fArr[1] * f10;
            }
            float f12 = (i10 + f11) / (f10 - f7);
            if (f12 < 0.0f) {
                this.f13689s0 = 0;
            } else if (f12 > 1.0f) {
                this.f13689s0 = dVar.f14925a.length - 1;
            } else {
                int b10 = dVar.b(f12, this.F, this.G);
                this.f13689s0 = b10;
                int i13 = this.G;
                if (b10 > i13) {
                    this.f13689s0 = i13;
                }
                int i14 = this.f13689s0;
                int i15 = this.F;
                if (i14 < i15) {
                    this.f13689s0 = i15;
                }
            }
            if (i12 != this.f13689s0) {
                this.f13691u0 = true;
                c(true);
                x(f11);
                e eVar = this.Q0;
                if (eVar != null) {
                    getSelectedDate();
                    la1 la1Var = (la1) ((vl0) eVar).f41589b;
                    la1Var.f();
                    la1Var.f38252b.f13690t0.d(false, false);
                }
                invalidate();
                B();
            }
        }
    }

    @Override
    public final void K() {
        if (g.B1) {
            int length = ((kg.d) this.f13673h0).f14925a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j3 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    lg.h hVar = (lg.h) arrayList.get(i11);
                    if (hVar.f15448n) {
                        j10 += hVar.f15437a.f14918a[i10];
                    }
                }
                if (j10 > j3) {
                    j3 = j10;
                }
            }
            if (j3 > 0) {
                float f7 = (float) j3;
                if (f7 != this.f13680l0) {
                    this.f13680l0 = f7;
                    Animator animator = this.f13663d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e7 = g.e(this.f13677j0, this.f13680l0, new u5(this, 5));
                    this.f13663d0 = e7;
                    e7.start();
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
        int i11;
        int i12;
        Canvas canvas2 = canvas;
        kg.b bVar = this.f13673h0;
        if (bVar == null) {
            return;
        }
        float f14 = this.F0;
        j jVar = this.f13671g0;
        float f15 = jVar.f13715l;
        float f16 = jVar.f13714k;
        float f17 = f14 / (f15 - f16);
        float f18 = g.f13639k1;
        float f19 = (f16 * f17) - f18;
        float[] fArr = ((kg.d) bVar).f14926b;
        boolean z10 = true;
        if (fArr.length < 2) {
            f10 = 1.0f;
            f7 = 1.0f;
        } else {
            float f20 = fArr[1];
            float f21 = f20 * f17;
            f7 = (f17 - f21) * f20;
            f10 = f21;
        }
        int i13 = ((int) (f18 / f10)) + 1;
        int max = Math.max(0, (this.F - i13) - 2);
        int min = Math.min(((kg.d) this.f13673h0).f14926b.length - 1, this.G + i13 + 2);
        int i14 = 0;
        while (true) {
            arrayList = this.d;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((lg.f) arrayList.get(i14)).f15444j = 0;
            i14++;
        }
        canvas2.save();
        int i15 = this.f13698y0;
        if (i15 == 2) {
            this.f13669f0 = true;
            this.f13692v0 = 0.0f;
            lg.j jVar2 = this.f13699z0;
            float f22 = jVar2.f15458f;
            f12 = 1.0f - f22;
            f11 = 2.0f;
            canvas2.scale((f22 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.f15457e);
        } else {
            f11 = 2.0f;
            if (i15 == 1) {
                lg.j jVar3 = this.f13699z0;
                float f23 = jVar3.f15458f;
                canvas2.scale(f23, 1.0f, jVar3.d, jVar3.f15457e);
                f12 = f23;
            } else if (i15 == 3) {
                f12 = this.f13699z0.f15458f;
            } else {
                f12 = 1.0f;
            }
        }
        z10 = (this.f13689s0 < 0 || !this.f13691u0) ? false : false;
        while (true) {
            i10 = g.f13641n1;
            if (max > min) {
                break;
            }
            if (this.f13689s0 != max || !z10) {
                int i16 = 0;
                float f24 = 0.0f;
                while (i16 < arrayList.size()) {
                    lg.f fVar = (lg.f) arrayList.get(i16);
                    if (!fVar.f15448n && fVar.f15449o == 0.0f) {
                        i11 = min;
                        i12 = max;
                    } else {
                        long[] jArr = fVar.f15437a.f14918a;
                        float f25 = (((f17 - f10) * ((kg.d) this.f13673h0).f14926b[max]) + (f10 / f11)) - f19;
                        i11 = min;
                        i12 = max;
                        float measuredHeight = (((float) jArr[i12]) / this.v) * ((getMeasuredHeight() - this.f13688s) - i10) * fVar.f15449o;
                        float measuredHeight2 = (getMeasuredHeight() - this.f13688s) - measuredHeight;
                        float[] fArr2 = fVar.f15445k;
                        int i17 = fVar.f15444j;
                        int i18 = i17 + 1;
                        fVar.f15444j = i18;
                        fArr2[i17] = f25;
                        int i19 = i17 + 2;
                        fVar.f15444j = i19;
                        fArr2[i18] = measuredHeight2 - f24;
                        int i20 = i17 + 3;
                        fVar.f15444j = i20;
                        fArr2[i19] = f25;
                        fVar.f15444j = i17 + 4;
                        fArr2[i20] = (getMeasuredHeight() - this.f13688s) - f24;
                        f24 += measuredHeight;
                    }
                    i16++;
                    min = i11;
                    max = i12;
                }
            }
            max++;
            min = min;
        }
        for (int i21 = 0; i21 < arrayList.size(); i21++) {
            lg.h hVar = (lg.h) arrayList.get(i21);
            if (!z10 && !this.f13669f0) {
                paint = hVar.f15439c;
            } else {
                paint = hVar.f15451q;
            }
            if (z10) {
                f13 = 255.0f;
                hVar.f15451q.setColor(i0.a.d(this.f13692v0, hVar.f15447m, hVar.f15452r));
            } else {
                f13 = 255.0f;
            }
            if (this.f13669f0) {
                hVar.f15451q.setColor(i0.a.d(1.0f, hVar.f15447m, hVar.f15452r));
            }
            paint.setAlpha((int) (f12 * f13));
            paint.setStrokeWidth(f7);
            canvas2.drawLines(hVar.f15445k, 0, hVar.f15444j, paint);
        }
        if (z10) {
            int i22 = 0;
            float f26 = 0.0f;
            while (i22 < arrayList.size()) {
                lg.f fVar2 = (lg.f) arrayList.get(i22);
                boolean z11 = fVar2.f15448n;
                Paint paint2 = fVar2.f15439c;
                if (z11 || fVar2.f15449o != 0.0f) {
                    long[] jArr2 = fVar2.f15437a.f14918a;
                    float[] fArr3 = ((kg.d) this.f13673h0).f14926b;
                    int i23 = this.f13689s0;
                    float f27 = (((f17 - f10) * fArr3[i23]) + (f10 / f11)) - f19;
                    float measuredHeight3 = (((float) jArr2[i23]) / this.v) * ((getMeasuredHeight() - this.f13688s) - i10) * fVar2.f15449o;
                    paint2.setStrokeWidth(f7);
                    paint2.setAlpha((int) (f12 * 255.0f));
                    canvas2.drawLine(f27, ((getMeasuredHeight() - this.f13688s) - measuredHeight3) - f26, f27, (getMeasuredHeight() - this.f13688s) - f26, paint2);
                    f26 += measuredHeight3;
                }
                i22++;
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
        int i11;
        kg.b bVar = this.f13673h0;
        if (bVar != null) {
            int length = ((kg.d) bVar).f14926b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((lg.f) arrayList.get(i12)).f15444j = 0;
            }
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.D1;
            if (jArr == null || jArr.length < size) {
                this.D1 = new long[size];
            }
            int i13 = 0;
            while (i13 < length) {
                float f12 = ((kg.d) this.f13673h0).f14926b[i13] * this.C0;
                int i14 = 0;
                while (true) {
                    f10 = 0.0f;
                    if (i14 >= size) {
                        break;
                    }
                    lg.f fVar = (lg.f) arrayList.get(i14);
                    if (fVar.f15448n || fVar.f15449o != 0.0f) {
                        long j3 = fVar.f15437a.f14918a[i13];
                        long[] jArr2 = this.D1;
                        if (j3 > jArr2[i14]) {
                            jArr2[i14] = j3;
                        }
                    }
                    i14++;
                }
                if (i13 % max == 0) {
                    int i15 = 0;
                    float f13 = 0.0f;
                    while (i15 < size) {
                        lg.f fVar2 = (lg.f) arrayList.get(i15);
                        if (!fVar2.f15448n && fVar2.f15449o == f10) {
                            i11 = length;
                            i10 = i13;
                        } else {
                            if (g.B1) {
                                f11 = this.f13677j0;
                            } else {
                                f11 = (float) ((kg.d) this.f13673h0).f14928e;
                            }
                            long[] jArr3 = this.D1;
                            i10 = i13;
                            float f14 = (((float) jArr3[i15]) / f11) * fVar2.f15449o;
                            int i16 = this.B0;
                            float f15 = f14 * i16;
                            float[] fArr = fVar2.f15445k;
                            int i17 = fVar2.f15444j;
                            int i18 = i17 + 1;
                            fVar2.f15444j = i18;
                            fArr[i17] = f12;
                            int i19 = i17 + 2;
                            fVar2.f15444j = i19;
                            i11 = length;
                            fArr[i18] = (i16 - f15) - f13;
                            int i20 = i17 + 3;
                            fVar2.f15444j = i20;
                            fArr[i19] = f12;
                            fVar2.f15444j = i17 + 4;
                            fArr[i20] = i16 - f13;
                            f13 += f15;
                            jArr3[i15] = 0;
                        }
                        i15++;
                        i13 = i10;
                        length = i11;
                        f10 = 0.0f;
                    }
                }
                i13++;
                length = length;
            }
            kg.b bVar2 = this.f13673h0;
            if (((kg.d) bVar2).f14926b.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = ((kg.d) bVar2).f14926b[1] * this.C0;
            }
            for (int i21 = 0; i21 < size; i21++) {
                lg.f fVar3 = (lg.f) arrayList.get(i21);
                Paint paint = fVar3.f15439c;
                Paint paint2 = fVar3.f15439c;
                paint.setStrokeWidth(max * f7);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.f15445k, 0, fVar3.f15444j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f13657b;
        this.m0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f13682n0 = i10;
            int i11 = this.f13682n0;
            if (i11 < this.m0) {
                l(canvas, (lg.d) arrayList.get(i11));
                p(canvas, (lg.d) arrayList.get(this.f13682n0));
                i10 = this.f13682n0 + 1;
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
        return ((kg.d) this.f13673h0).f14936m.rMaxQ(i10, i11);
    }

    @Override
    public final void u() {
        super.u();
        this.f13677j0 = 0.0f;
        int length = ((kg.d) this.f13673h0).f14925a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j3 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                lg.h hVar = (lg.h) arrayList.get(i11);
                if (hVar.f15448n) {
                    j3 += hVar.f15437a.f14918a[i10];
                }
            }
            float f7 = (float) j3;
            if (f7 > this.f13677j0) {
                this.f13677j0 = f7;
            }
        }
    }

    @Override
    public final void z() {
        int length = ((kg.a) ((kg.d) this.f13673h0).d.get(0)).f14918a.length;
        int size = ((kg.d) this.f13673h0).d.size();
        ((kg.d) this.f13673h0).f14935l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((kg.d) this.f13673h0).f14935l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((lg.h) this.d.get(i11)).f15448n) {
                    kg.b bVar = this.f13673h0;
                    long[] jArr = ((kg.d) bVar).f14935l;
                    jArr[i10] = jArr[i10] + ((kg.a) ((kg.d) bVar).d.get(i11)).f14918a[i10];
                }
            }
        }
        kg.b bVar2 = this.f13673h0;
        ((kg.d) bVar2).f14936m = new SegmentTree(((kg.d) bVar2).f14935l);
        super.z();
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
