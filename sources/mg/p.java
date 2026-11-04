package mg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import ei.n4;
import java.util.ArrayList;
import m2.t;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.b41;
import org.telegram.ui.ci0;
public final class p extends g {
    public long[] E1;

    public p(Context context, e6 e6Var) {
        super(context, e6Var);
        this.f19367x0 = true;
        this.f19369y0 = true;
    }

    @Override
    public final void C(int i3, int i10) {
        float f10;
        ng.b bVar = this.f19346i0;
        if (bVar != null) {
            int i11 = this.f19361t0;
            float f11 = this.H0;
            float f12 = (this.f19344h0.f19385k * f11) - g.f19311l1;
            ng.d dVar = (ng.d) bVar;
            float[] fArr = dVar.f20374b;
            if (fArr.length < 2) {
                f10 = 1.0f;
            } else {
                f10 = fArr[1] * f11;
            }
            float f13 = (i3 + f12) / (f11 - f10);
            if (f13 < 0.0f) {
                this.f19361t0 = 0;
            } else if (f13 > 1.0f) {
                this.f19361t0 = dVar.f20373a.length - 1;
            } else {
                int b10 = dVar.b(f13, this.G, this.H);
                this.f19361t0 = b10;
                int i12 = this.H;
                if (b10 > i12) {
                    this.f19361t0 = i12;
                }
                int i13 = this.f19361t0;
                int i14 = this.G;
                if (i13 < i14) {
                    this.f19361t0 = i14;
                }
            }
            if (i11 != this.f19361t0) {
                this.f19363v0 = true;
                c(true);
                x(f12);
                e eVar = this.R0;
                if (eVar != null) {
                    getSelectedDate();
                    b41 b41Var = (b41) ((ci0) eVar).f44362b;
                    b41Var.f();
                    b41Var.f43918b.f19362u0.d(false, false);
                }
                invalidate();
                B();
            }
        }
    }

    @Override
    public final void K() {
        if (g.C1) {
            int length = ((ng.d) this.f19346i0).f20373a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                long j11 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    og.h hVar = (og.h) arrayList.get(i10);
                    if (hVar.f21096n) {
                        j11 += hVar.f21085a.f20366a[i3];
                    }
                }
                if (j11 > j10) {
                    j10 = j11;
                }
            }
            if (j10 > 0) {
                float f10 = (float) j10;
                if (f10 != this.m0) {
                    this.m0 = f10;
                    Animator animator = this.f19337e0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e10 = g.e(this.f19350k0, this.m0, new n4(this, 5));
                    this.f19337e0 = e10;
                    e10.start();
                }
            }
        }
    }

    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public final og.f h(ng.a aVar) {
        return new og.h(aVar, this.X0);
    }

    @Override
    public final void k(Canvas canvas) {
        float f10;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        int i3;
        Paint paint;
        float f14;
        float f15;
        int i10;
        int i11;
        Canvas canvas2 = canvas;
        ng.b bVar = this.f19346i0;
        if (bVar == null) {
            return;
        }
        float f16 = this.G0;
        j jVar = this.f19344h0;
        float f17 = jVar.f19386l;
        float f18 = jVar.f19385k;
        float f19 = f16 / (f17 - f18);
        float f20 = g.f19311l1;
        float f21 = (f18 * f19) - f20;
        float[] fArr = ((ng.d) bVar).f20374b;
        boolean z10 = true;
        if (fArr.length < 2) {
            f11 = 1.0f;
            f10 = 1.0f;
        } else {
            float f22 = fArr[1];
            float f23 = f22 * f19;
            f10 = (f19 - f23) * f22;
            f11 = f23;
        }
        int i12 = ((int) (f20 / f11)) + 1;
        int i13 = 0;
        int max = Math.max(0, (this.G - i12) - 2);
        int min = Math.min(((ng.d) this.f19346i0).f20374b.length - 1, this.H + i12 + 2);
        int i14 = 0;
        while (true) {
            arrayList = this.d;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((og.f) arrayList.get(i14)).f21092j = 0;
            i14++;
        }
        canvas2.save();
        int i15 = this.f19370z0;
        float f24 = 0.0f;
        if (i15 == 2) {
            this.f19342g0 = true;
            this.f19365w0 = 0.0f;
            og.j jVar2 = this.A0;
            float f25 = jVar2.f21106f;
            f13 = 1.0f - f25;
            f12 = 2.0f;
            canvas2.scale((f25 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.f21105e);
        } else {
            f12 = 2.0f;
            if (i15 == 1) {
                og.j jVar3 = this.A0;
                float f26 = jVar3.f21106f;
                canvas2.scale(f26, 1.0f, jVar3.d, jVar3.f21105e);
                f13 = f26;
            } else if (i15 == 3) {
                f13 = this.A0.f21106f;
            } else {
                f13 = 1.0f;
            }
        }
        z10 = (this.f19361t0 < 0 || !this.f19363v0) ? false : false;
        while (true) {
            i3 = g.f19313o1;
            if (max > min) {
                break;
            }
            if (this.f19361t0 == max && z10) {
                f15 = f24;
            } else {
                int i16 = i13;
                float f27 = f24;
                f15 = f27;
                while (i16 < arrayList.size()) {
                    og.f fVar = (og.f) arrayList.get(i16);
                    if (!fVar.f21096n && fVar.f21097o == f15) {
                        i10 = min;
                        i11 = max;
                    } else {
                        long[] jArr = fVar.f21085a.f20366a;
                        float f28 = (((f19 - f11) * ((ng.d) this.f19346i0).f20374b[max]) + (f11 / f12)) - f21;
                        i10 = min;
                        i11 = max;
                        float measuredHeight = (((float) jArr[i11]) / this.f19364w) * ((getMeasuredHeight() - this.f19359s) - i3) * fVar.f21097o;
                        float measuredHeight2 = (getMeasuredHeight() - this.f19359s) - measuredHeight;
                        float[] fArr2 = fVar.f21093k;
                        int i17 = fVar.f21092j;
                        int i18 = i17 + 1;
                        fVar.f21092j = i18;
                        fArr2[i17] = f28;
                        int i19 = i17 + 2;
                        fVar.f21092j = i19;
                        fArr2[i18] = measuredHeight2 - f27;
                        int i20 = i17 + 3;
                        fVar.f21092j = i20;
                        fArr2[i19] = f28;
                        fVar.f21092j = i17 + 4;
                        fArr2[i20] = (getMeasuredHeight() - this.f19359s) - f27;
                        f27 += measuredHeight;
                    }
                    i16++;
                    min = i10;
                    max = i11;
                }
            }
            max++;
            min = min;
            f24 = f15;
            i13 = 0;
        }
        float f29 = f24;
        for (int i21 = 0; i21 < arrayList.size(); i21++) {
            og.h hVar = (og.h) arrayList.get(i21);
            if (!z10 && !this.f19342g0) {
                paint = hVar.f21087c;
            } else {
                paint = hVar.f21099q;
            }
            if (z10) {
                f14 = 255.0f;
                hVar.f21099q.setColor(i0.a.f(this.f19365w0, hVar.f21095m, hVar.f21100r));
            } else {
                f14 = 255.0f;
            }
            if (this.f19342g0) {
                hVar.f21099q.setColor(i0.a.f(1.0f, hVar.f21095m, hVar.f21100r));
            }
            paint.setAlpha((int) (f13 * f14));
            paint.setStrokeWidth(f10);
            canvas2.drawLines(hVar.f21093k, 0, hVar.f21092j, paint);
        }
        if (z10) {
            int i22 = 0;
            float f30 = f29;
            while (i22 < arrayList.size()) {
                og.f fVar2 = (og.f) arrayList.get(i22);
                boolean z11 = fVar2.f21096n;
                Paint paint2 = fVar2.f21087c;
                if (z11 || fVar2.f21097o != f29) {
                    long[] jArr2 = fVar2.f21085a.f20366a;
                    float[] fArr3 = ((ng.d) this.f19346i0).f20374b;
                    int i23 = this.f19361t0;
                    float f31 = (((f19 - f11) * fArr3[i23]) + (f11 / f12)) - f21;
                    float measuredHeight3 = (((float) jArr2[i23]) / this.f19364w) * ((getMeasuredHeight() - this.f19359s) - i3) * fVar2.f21097o;
                    paint2.setStrokeWidth(f10);
                    paint2.setAlpha((int) (f13 * 255.0f));
                    canvas2.drawLine(f31, ((getMeasuredHeight() - this.f19359s) - measuredHeight3) - f30, f31, (getMeasuredHeight() - this.f19359s) - f30, paint2);
                    f30 += measuredHeight3;
                }
                i22++;
                canvas2 = canvas;
            }
        }
        canvas.restore();
    }

    @Override
    public final void n(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        int i3;
        char c2;
        int i10;
        ng.b bVar = this.f19346i0;
        if (bVar != null) {
            int length = ((ng.d) bVar).f20374b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((og.f) arrayList.get(i12)).f21092j = 0;
            }
            char c10 = 1;
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.E1;
            if (jArr == null || jArr.length < size) {
                this.E1 = new long[size];
            }
            int i13 = 0;
            while (i13 < length) {
                float f13 = ((ng.d) this.f19346i0).f20374b[i13] * this.D0;
                int i14 = i11;
                while (true) {
                    f11 = 0.0f;
                    if (i14 >= size) {
                        break;
                    }
                    og.f fVar = (og.f) arrayList.get(i14);
                    if (fVar.f21096n || fVar.f21097o != 0.0f) {
                        long j10 = fVar.f21085a.f20366a[i13];
                        long[] jArr2 = this.E1;
                        if (j10 > jArr2[i14]) {
                            jArr2[i14] = j10;
                        }
                    }
                    i14++;
                }
                if (i13 % max == 0) {
                    int i15 = i11;
                    float f14 = 0.0f;
                    while (i15 < size) {
                        og.f fVar2 = (og.f) arrayList.get(i15);
                        if (!fVar2.f21096n && fVar2.f21097o == f11) {
                            i10 = length;
                            c2 = c10;
                            i3 = i13;
                        } else {
                            if (g.C1) {
                                f12 = this.f19350k0;
                            } else {
                                f12 = (float) ((ng.d) this.f19346i0).f20376e;
                            }
                            long[] jArr3 = this.E1;
                            char c11 = c10;
                            i3 = i13;
                            float f15 = (((float) jArr3[i15]) / f12) * fVar2.f21097o;
                            int i16 = this.C0;
                            float f16 = f15 * i16;
                            float[] fArr = fVar2.f21093k;
                            int i17 = fVar2.f21092j;
                            c2 = c11;
                            int i18 = i17 + 1;
                            fVar2.f21092j = i18;
                            fArr[i17] = f13;
                            int i19 = i17 + 2;
                            fVar2.f21092j = i19;
                            i10 = length;
                            fArr[i18] = (i16 - f16) - f14;
                            int i20 = i17 + 3;
                            fVar2.f21092j = i20;
                            fArr[i19] = f13;
                            fVar2.f21092j = i17 + 4;
                            fArr[i20] = i16 - f14;
                            f14 += f16;
                            jArr3[i15] = 0;
                        }
                        i15++;
                        i13 = i3;
                        c10 = c2;
                        length = i10;
                        f11 = 0.0f;
                    }
                }
                i13++;
                c10 = c10;
                length = length;
                i11 = 0;
            }
            char c12 = c10;
            ng.b bVar2 = this.f19346i0;
            if (((ng.d) bVar2).f20374b.length < 2) {
                f10 = 1.0f;
            } else {
                f10 = ((ng.d) bVar2).f20374b[c12] * this.D0;
            }
            for (int i21 = 0; i21 < size; i21++) {
                og.f fVar3 = (og.f) arrayList.get(i21);
                Paint paint = fVar3.f21087c;
                Paint paint2 = fVar3.f21087c;
                paint.setStrokeWidth(max * f10);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.f21093k, 0, fVar3.f21092j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f19328b;
        this.f19353n0 = arrayList.size();
        int i3 = 0;
        while (true) {
            this.f19354o0 = i3;
            int i10 = this.f19354o0;
            if (i10 < this.f19353n0) {
                l(canvas, (og.d) arrayList.get(i10));
                p(canvas, (og.d) arrayList.get(this.f19354o0));
                i3 = this.f19354o0 + 1;
            } else {
                j(canvas);
                m(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override
    public final long r(int i3, int i10) {
        return ((ng.d) this.f19346i0).f20384m.I0(i3, i10);
    }

    @Override
    public final void u() {
        super.u();
        this.f19350k0 = 0.0f;
        int length = ((ng.d) this.f19346i0).f20373a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i3 = 0; i3 < length; i3++) {
            long j10 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                og.h hVar = (og.h) arrayList.get(i10);
                if (hVar.f21096n) {
                    j10 += hVar.f21085a.f20366a[i3];
                }
            }
            float f10 = (float) j10;
            if (f10 > this.f19350k0) {
                this.f19350k0 = f10;
            }
        }
    }

    @Override
    public final void z() {
        int length = ((ng.a) ((ng.d) this.f19346i0).d.get(0)).f20366a.length;
        int size = ((ng.d) this.f19346i0).d.size();
        ((ng.d) this.f19346i0).f20383l = new long[length];
        for (int i3 = 0; i3 < length; i3++) {
            ((ng.d) this.f19346i0).f20383l[i3] = 0;
            for (int i10 = 0; i10 < size; i10++) {
                if (((og.h) this.d.get(i10)).f21096n) {
                    ng.b bVar = this.f19346i0;
                    long[] jArr = ((ng.d) bVar).f20383l;
                    jArr[i3] = jArr[i3] + ((ng.a) ((ng.d) bVar).d.get(i10)).f20366a[i3];
                }
            }
        }
        ng.b bVar2 = this.f19346i0;
        ((ng.d) bVar2).f20384m = new t(((ng.d) bVar2).f20383l);
        super.z();
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
