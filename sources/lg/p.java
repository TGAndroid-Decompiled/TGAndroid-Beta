package lg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import fi.d4;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.m41;
import org.telegram.ui.qi0;
public final class p extends g {
    public long[] E1;

    public p(Context context, h6 h6Var) {
        super(context, h6Var);
        this.f19856x0 = true;
        this.f19858y0 = true;
    }

    @Override
    public final void C(int i7, int i10) {
        float f10;
        mg.b bVar = this.f19834i0;
        if (bVar != null) {
            int i11 = this.f19850t0;
            float f11 = this.H0;
            float f12 = (this.f19832h0.f19874k * f11) - g.l1;
            mg.d dVar = (mg.d) bVar;
            float[] fArr = dVar.f21013b;
            if (fArr.length < 2) {
                f10 = 1.0f;
            } else {
                f10 = fArr[1] * f11;
            }
            float f13 = (i7 + f12) / (f11 - f10);
            if (f13 < 0.0f) {
                this.f19850t0 = 0;
            } else if (f13 > 1.0f) {
                this.f19850t0 = dVar.f21012a.length - 1;
            } else {
                int b10 = dVar.b(f13, this.G, this.H);
                this.f19850t0 = b10;
                int i12 = this.H;
                if (b10 > i12) {
                    this.f19850t0 = i12;
                }
                int i13 = this.f19850t0;
                int i14 = this.G;
                if (i13 < i14) {
                    this.f19850t0 = i14;
                }
            }
            if (i11 != this.f19850t0) {
                this.f19852v0 = true;
                c(true);
                x(f12);
                e eVar = this.R0;
                if (eVar != null) {
                    getSelectedDate();
                    m41 m41Var = (m41) ((qi0) eVar).f51292b;
                    m41Var.f();
                    m41Var.f49759b.f19851u0.d(false, false);
                }
                invalidate();
                B();
            }
        }
    }

    @Override
    public final void K() {
        if (g.C1) {
            int length = ((mg.d) this.f19834i0).f21012a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j3 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    ng.h hVar = (ng.h) arrayList.get(i10);
                    if (hVar.f21541n) {
                        j10 += hVar.f21530a.f21005a[i7];
                    }
                }
                if (j10 > j3) {
                    j3 = j10;
                }
            }
            if (j3 > 0) {
                float f10 = (float) j3;
                if (f10 != this.m0) {
                    this.m0 = f10;
                    Animator animator = this.f19825e0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e10 = g.e(this.f19838k0, this.m0, new d4(this, 5));
                    this.f19825e0 = e10;
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
    public final ng.f h(mg.a aVar) {
        return new ng.h(aVar, this.X0);
    }

    @Override
    public final void k(Canvas canvas) {
        float f10;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        int i7;
        Paint paint;
        float f14;
        float f15;
        int i10;
        int i11;
        Canvas canvas2 = canvas;
        mg.b bVar = this.f19834i0;
        if (bVar == null) {
            return;
        }
        float f16 = this.G0;
        j jVar = this.f19832h0;
        float f17 = jVar.f19875l;
        float f18 = jVar.f19874k;
        float f19 = f16 / (f17 - f18);
        float f20 = g.l1;
        float f21 = (f18 * f19) - f20;
        float[] fArr = ((mg.d) bVar).f21013b;
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
        int min = Math.min(((mg.d) this.f19834i0).f21013b.length - 1, this.H + i12 + 2);
        int i14 = 0;
        while (true) {
            arrayList = this.d;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((ng.f) arrayList.get(i14)).f21537j = 0;
            i14++;
        }
        canvas2.save();
        int i15 = this.f19859z0;
        float f24 = 0.0f;
        if (i15 == 2) {
            this.f19830g0 = true;
            this.f19854w0 = 0.0f;
            ng.j jVar2 = this.A0;
            float f25 = jVar2.f21551f;
            f13 = 1.0f - f25;
            f12 = 2.0f;
            canvas2.scale((f25 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.f21550e);
        } else {
            f12 = 2.0f;
            if (i15 == 1) {
                ng.j jVar3 = this.A0;
                float f26 = jVar3.f21551f;
                canvas2.scale(f26, 1.0f, jVar3.d, jVar3.f21550e);
                f13 = f26;
            } else if (i15 == 3) {
                f13 = this.A0.f21551f;
            } else {
                f13 = 1.0f;
            }
        }
        z10 = (this.f19850t0 < 0 || !this.f19852v0) ? false : false;
        while (true) {
            i7 = g.f19801o1;
            if (max > min) {
                break;
            }
            if (this.f19850t0 == max && z10) {
                f15 = f24;
            } else {
                int i16 = i13;
                float f27 = f24;
                f15 = f27;
                while (i16 < arrayList.size()) {
                    ng.f fVar = (ng.f) arrayList.get(i16);
                    if (!fVar.f21541n && fVar.f21542o == f15) {
                        i10 = min;
                        i11 = max;
                    } else {
                        long[] jArr = fVar.f21530a.f21005a;
                        float f28 = (((f19 - f11) * ((mg.d) this.f19834i0).f21013b[max]) + (f11 / f12)) - f21;
                        i10 = min;
                        i11 = max;
                        float measuredHeight = (((float) jArr[i11]) / this.f19853w) * ((getMeasuredHeight() - this.f19848s) - i7) * fVar.f21542o;
                        float measuredHeight2 = (getMeasuredHeight() - this.f19848s) - measuredHeight;
                        float[] fArr2 = fVar.f21538k;
                        int i17 = fVar.f21537j;
                        int i18 = i17 + 1;
                        fVar.f21537j = i18;
                        fArr2[i17] = f28;
                        int i19 = i17 + 2;
                        fVar.f21537j = i19;
                        fArr2[i18] = measuredHeight2 - f27;
                        int i20 = i17 + 3;
                        fVar.f21537j = i20;
                        fArr2[i19] = f28;
                        fVar.f21537j = i17 + 4;
                        fArr2[i20] = (getMeasuredHeight() - this.f19848s) - f27;
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
            ng.h hVar = (ng.h) arrayList.get(i21);
            if (!z10 && !this.f19830g0) {
                paint = hVar.f21532c;
            } else {
                paint = hVar.f21544q;
            }
            if (z10) {
                f14 = 255.0f;
                hVar.f21544q.setColor(i0.a.f(this.f19854w0, hVar.f21540m, hVar.f21545r));
            } else {
                f14 = 255.0f;
            }
            if (this.f19830g0) {
                hVar.f21544q.setColor(i0.a.f(1.0f, hVar.f21540m, hVar.f21545r));
            }
            paint.setAlpha((int) (f13 * f14));
            paint.setStrokeWidth(f10);
            canvas2.drawLines(hVar.f21538k, 0, hVar.f21537j, paint);
        }
        if (z10) {
            int i22 = 0;
            float f30 = f29;
            while (i22 < arrayList.size()) {
                ng.f fVar2 = (ng.f) arrayList.get(i22);
                boolean z11 = fVar2.f21541n;
                Paint paint2 = fVar2.f21532c;
                if (z11 || fVar2.f21542o != f29) {
                    long[] jArr2 = fVar2.f21530a.f21005a;
                    float[] fArr3 = ((mg.d) this.f19834i0).f21013b;
                    int i23 = this.f19850t0;
                    float f31 = (((f19 - f11) * fArr3[i23]) + (f11 / f12)) - f21;
                    float measuredHeight3 = (((float) jArr2[i23]) / this.f19853w) * ((getMeasuredHeight() - this.f19848s) - i7) * fVar2.f21542o;
                    paint2.setStrokeWidth(f10);
                    paint2.setAlpha((int) (f13 * 255.0f));
                    canvas2.drawLine(f31, ((getMeasuredHeight() - this.f19848s) - measuredHeight3) - f30, f31, (getMeasuredHeight() - this.f19848s) - f30, paint2);
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
        int i7;
        char c10;
        int i10;
        mg.b bVar = this.f19834i0;
        if (bVar != null) {
            int length = ((mg.d) bVar).f21013b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((ng.f) arrayList.get(i12)).f21537j = 0;
            }
            char c11 = 1;
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.E1;
            if (jArr == null || jArr.length < size) {
                this.E1 = new long[size];
            }
            int i13 = 0;
            while (i13 < length) {
                float f13 = ((mg.d) this.f19834i0).f21013b[i13] * this.D0;
                int i14 = i11;
                while (true) {
                    f11 = 0.0f;
                    if (i14 >= size) {
                        break;
                    }
                    ng.f fVar = (ng.f) arrayList.get(i14);
                    if (fVar.f21541n || fVar.f21542o != 0.0f) {
                        long j3 = fVar.f21530a.f21005a[i13];
                        long[] jArr2 = this.E1;
                        if (j3 > jArr2[i14]) {
                            jArr2[i14] = j3;
                        }
                    }
                    i14++;
                }
                if (i13 % max == 0) {
                    int i15 = i11;
                    float f14 = 0.0f;
                    while (i15 < size) {
                        ng.f fVar2 = (ng.f) arrayList.get(i15);
                        if (!fVar2.f21541n && fVar2.f21542o == f11) {
                            i10 = length;
                            c10 = c11;
                            i7 = i13;
                        } else {
                            if (g.C1) {
                                f12 = this.f19838k0;
                            } else {
                                f12 = (float) ((mg.d) this.f19834i0).f21015e;
                            }
                            long[] jArr3 = this.E1;
                            char c12 = c11;
                            i7 = i13;
                            float f15 = (((float) jArr3[i15]) / f12) * fVar2.f21542o;
                            int i16 = this.C0;
                            float f16 = f15 * i16;
                            float[] fArr = fVar2.f21538k;
                            int i17 = fVar2.f21537j;
                            c10 = c12;
                            int i18 = i17 + 1;
                            fVar2.f21537j = i18;
                            fArr[i17] = f13;
                            int i19 = i17 + 2;
                            fVar2.f21537j = i19;
                            i10 = length;
                            fArr[i18] = (i16 - f16) - f14;
                            int i20 = i17 + 3;
                            fVar2.f21537j = i20;
                            fArr[i19] = f13;
                            fVar2.f21537j = i17 + 4;
                            fArr[i20] = i16 - f14;
                            f14 += f16;
                            jArr3[i15] = 0;
                        }
                        i15++;
                        i13 = i7;
                        c11 = c10;
                        length = i10;
                        f11 = 0.0f;
                    }
                }
                i13++;
                c11 = c11;
                length = length;
                i11 = 0;
            }
            char c13 = c11;
            mg.b bVar2 = this.f19834i0;
            if (((mg.d) bVar2).f21013b.length < 2) {
                f10 = 1.0f;
            } else {
                f10 = ((mg.d) bVar2).f21013b[c13] * this.D0;
            }
            for (int i21 = 0; i21 < size; i21++) {
                ng.f fVar3 = (ng.f) arrayList.get(i21);
                Paint paint = fVar3.f21532c;
                Paint paint2 = fVar3.f21532c;
                paint.setStrokeWidth(max * f10);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.f21538k, 0, fVar3.f21537j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f19816b;
        this.f19842n0 = arrayList.size();
        int i7 = 0;
        while (true) {
            this.f19843o0 = i7;
            int i10 = this.f19843o0;
            if (i10 < this.f19842n0) {
                l(canvas, (ng.d) arrayList.get(i10));
                p(canvas, (ng.d) arrayList.get(this.f19843o0));
                i7 = this.f19843o0 + 1;
            } else {
                j(canvas);
                m(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override
    public final long r(int i7, int i10) {
        return ((mg.d) this.f19834i0).f21023m.U0(i7, i10);
    }

    @Override
    public final void u() {
        super.u();
        this.f19838k0 = 0.0f;
        int length = ((mg.d) this.f19834i0).f21012a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < length; i7++) {
            long j3 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                ng.h hVar = (ng.h) arrayList.get(i10);
                if (hVar.f21541n) {
                    j3 += hVar.f21530a.f21005a[i7];
                }
            }
            float f10 = (float) j3;
            if (f10 > this.f19838k0) {
                this.f19838k0 = f10;
            }
        }
    }

    @Override
    public final void z() {
        int length = ((mg.a) ((mg.d) this.f19834i0).d.get(0)).f21005a.length;
        int size = ((mg.d) this.f19834i0).d.size();
        ((mg.d) this.f19834i0).f21022l = new long[length];
        for (int i7 = 0; i7 < length; i7++) {
            ((mg.d) this.f19834i0).f21022l[i7] = 0;
            for (int i10 = 0; i10 < size; i10++) {
                if (((ng.h) this.d.get(i10)).f21541n) {
                    mg.b bVar = this.f19834i0;
                    long[] jArr = ((mg.d) bVar).f21022l;
                    jArr[i7] = jArr[i7] + ((mg.a) ((mg.d) bVar).d.get(i10)).f21005a[i7];
                }
            }
        }
        mg.b bVar2 = this.f19834i0;
        ((mg.d) bVar2).f21023m = new k8.a(((mg.d) bVar2).f21022l);
        super.z();
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
