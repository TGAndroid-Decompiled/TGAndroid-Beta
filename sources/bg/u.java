package bg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.e61;
import org.telegram.ui.tj0;
public final class u extends i {
    public long[] D1;

    public u(Context context, p6 p6Var) {
        super(context, p6Var);
        this.f2743w0 = true;
        this.f2745x0 = true;
    }

    @Override
    public final void C(int i10, int i11) {
        float f7;
        cg.b bVar = this.f2722h0;
        if (bVar != null) {
            int i12 = this.f2738s0;
            float f10 = this.G0;
            float f11 = (this.f2720g0.f2767k * f10) - i.f2689k1;
            cg.d dVar = (cg.d) bVar;
            float[] fArr = dVar.f4165b;
            if (fArr.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = fArr[1] * f10;
            }
            float f12 = (i10 + f11) / (f10 - f7);
            if (f12 < 0.0f) {
                this.f2738s0 = 0;
            } else if (f12 > 1.0f) {
                this.f2738s0 = dVar.f4164a.length - 1;
            } else {
                int b10 = dVar.b(f12, this.F, this.G);
                this.f2738s0 = b10;
                int i13 = this.G;
                if (b10 > i13) {
                    this.f2738s0 = i13;
                }
                int i14 = this.f2738s0;
                int i15 = this.F;
                if (i14 < i15) {
                    this.f2738s0 = i15;
                }
            }
            if (i12 != this.f2738s0) {
                this.f2740u0 = true;
                c(true);
                x(f11);
                g gVar = this.Q0;
                if (gVar != null) {
                    getSelectedDate();
                    e61 e61Var = (e61) ((tj0) gVar).f41852b;
                    e61Var.f();
                    e61Var.f36960b.f2739t0.d(false, false);
                }
                invalidate();
                B();
            }
        }
    }

    @Override
    public final void K() {
        if (i.B1) {
            int length = ((cg.d) this.f2722h0).f4164a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    dg.i iVar = (dg.i) arrayList.get(i11);
                    if (iVar.f5919n) {
                        j11 += iVar.f5909a.f4158a[i10];
                    }
                }
                if (j11 > j10) {
                    j10 = j11;
                }
            }
            if (j10 > 0) {
                float f7 = (float) j10;
                if (f7 != this.f2729l0) {
                    this.f2729l0 = f7;
                    Animator animator = this.f2713d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = i.e(this.f2726j0, this.f2729l0, new o(this, 1));
                    this.f2713d0 = e;
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
    public final dg.g h(cg.a aVar) {
        return new dg.i(aVar, this.W0);
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
        cg.b bVar = this.f2722h0;
        if (bVar == null) {
            return;
        }
        float f15 = this.F0;
        n nVar = this.f2720g0;
        float f16 = nVar.f2768l;
        float f17 = nVar.f2767k;
        float f18 = f15 / (f16 - f17);
        float f19 = i.f2689k1;
        float f20 = (f17 * f18) - f19;
        float[] fArr = ((cg.d) bVar).f4165b;
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
        int min = Math.min(((cg.d) this.f2722h0).f4165b.length - 1, this.G + i13 + 2);
        int i15 = 0;
        while (true) {
            arrayList = this.d;
            if (i15 >= arrayList.size()) {
                break;
            }
            ((dg.g) arrayList.get(i15)).f5915j = 0;
            i15++;
        }
        canvas2.save();
        int i16 = this.f2747y0;
        float f23 = 0.0f;
        if (i16 == 2) {
            this.f2718f0 = true;
            this.f2741v0 = 0.0f;
            dg.k kVar = this.f2748z0;
            float f24 = kVar.f5928f;
            f12 = 1.0f - f24;
            f11 = 2.0f;
            canvas2.scale((f24 * 2.0f) + 1.0f, 1.0f, kVar.d, kVar.e);
        } else {
            f11 = 2.0f;
            if (i16 == 1) {
                dg.k kVar2 = this.f2748z0;
                float f25 = kVar2.f5928f;
                canvas2.scale(f25, 1.0f, kVar2.d, kVar2.e);
                f12 = f25;
            } else if (i16 == 3) {
                f12 = this.f2748z0.f5928f;
            } else {
                f12 = 1.0f;
            }
        }
        z10 = (this.f2738s0 < 0 || !this.f2740u0) ? false : false;
        while (true) {
            i10 = i.f2691n1;
            if (max > min) {
                break;
            }
            if (this.f2738s0 == max && z10) {
                f14 = f23;
            } else {
                int i17 = i14;
                float f26 = f23;
                f14 = f26;
                while (i17 < arrayList.size()) {
                    dg.g gVar = (dg.g) arrayList.get(i17);
                    if (!gVar.f5919n && gVar.f5920o == f14) {
                        i11 = min;
                        i12 = max;
                    } else {
                        long[] jArr = gVar.f5909a.f4158a;
                        float f27 = (((f18 - f10) * ((cg.d) this.f2722h0).f4165b[max]) + (f10 / f11)) - f20;
                        i11 = min;
                        i12 = max;
                        float measuredHeight = (((float) jArr[i12]) / this.f2742w) * ((getMeasuredHeight() - this.f2737s) - i10) * gVar.f5920o;
                        float measuredHeight2 = (getMeasuredHeight() - this.f2737s) - measuredHeight;
                        float[] fArr2 = gVar.f5916k;
                        int i18 = gVar.f5915j;
                        int i19 = i18 + 1;
                        gVar.f5915j = i19;
                        fArr2[i18] = f27;
                        int i20 = i18 + 2;
                        gVar.f5915j = i20;
                        fArr2[i19] = measuredHeight2 - f26;
                        int i21 = i18 + 3;
                        gVar.f5915j = i21;
                        fArr2[i20] = f27;
                        gVar.f5915j = i18 + 4;
                        fArr2[i21] = (getMeasuredHeight() - this.f2737s) - f26;
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
            dg.i iVar = (dg.i) arrayList.get(i22);
            if (!z10 && !this.f2718f0) {
                paint = iVar.f5911c;
            } else {
                paint = iVar.f5922q;
            }
            if (z10) {
                f13 = 255.0f;
                iVar.f5922q.setColor(i0.b.f(this.f2741v0, iVar.f5918m, iVar.f5923r));
            } else {
                f13 = 255.0f;
            }
            if (this.f2718f0) {
                iVar.f5922q.setColor(i0.b.f(1.0f, iVar.f5918m, iVar.f5923r));
            }
            paint.setAlpha((int) (f12 * f13));
            paint.setStrokeWidth(f7);
            canvas2.drawLines(iVar.f5916k, 0, iVar.f5915j, paint);
        }
        if (z10) {
            int i23 = 0;
            float f29 = f28;
            while (i23 < arrayList.size()) {
                dg.g gVar2 = (dg.g) arrayList.get(i23);
                boolean z11 = gVar2.f5919n;
                Paint paint2 = gVar2.f5911c;
                if (z11 || gVar2.f5920o != f28) {
                    long[] jArr2 = gVar2.f5909a.f4158a;
                    float[] fArr3 = ((cg.d) this.f2722h0).f4165b;
                    int i24 = this.f2738s0;
                    float f30 = (((f18 - f10) * fArr3[i24]) + (f10 / f11)) - f20;
                    float measuredHeight3 = (((float) jArr2[i24]) / this.f2742w) * ((getMeasuredHeight() - this.f2737s) - i10) * gVar2.f5920o;
                    paint2.setStrokeWidth(f7);
                    paint2.setAlpha((int) (f12 * 255.0f));
                    canvas2.drawLine(f30, ((getMeasuredHeight() - this.f2737s) - measuredHeight3) - f29, f30, (getMeasuredHeight() - this.f2737s) - f29, paint2);
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
        cg.b bVar = this.f2722h0;
        if (bVar != null) {
            int length = ((cg.d) bVar).f4165b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((dg.g) arrayList.get(i13)).f5915j = 0;
            }
            char c11 = 1;
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.D1;
            if (jArr == null || jArr.length < size) {
                this.D1 = new long[size];
            }
            int i14 = 0;
            while (i14 < length) {
                float f12 = ((cg.d) this.f2722h0).f4165b[i14] * this.C0;
                int i15 = i12;
                while (true) {
                    f10 = 0.0f;
                    if (i15 >= size) {
                        break;
                    }
                    dg.g gVar = (dg.g) arrayList.get(i15);
                    if (gVar.f5919n || gVar.f5920o != 0.0f) {
                        long j10 = gVar.f5909a.f4158a[i14];
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
                        dg.g gVar2 = (dg.g) arrayList.get(i16);
                        if (!gVar2.f5919n && gVar2.f5920o == f10) {
                            i11 = length;
                            c10 = c11;
                            i10 = i14;
                        } else {
                            if (i.B1) {
                                f11 = this.f2726j0;
                            } else {
                                f11 = (float) ((cg.d) this.f2722h0).e;
                            }
                            long[] jArr3 = this.D1;
                            char c12 = c11;
                            i10 = i14;
                            float f14 = (((float) jArr3[i16]) / f11) * gVar2.f5920o;
                            int i17 = this.B0;
                            float f15 = f14 * i17;
                            float[] fArr = gVar2.f5916k;
                            int i18 = gVar2.f5915j;
                            c10 = c12;
                            int i19 = i18 + 1;
                            gVar2.f5915j = i19;
                            fArr[i18] = f12;
                            int i20 = i18 + 2;
                            gVar2.f5915j = i20;
                            i11 = length;
                            fArr[i19] = (i17 - f15) - f13;
                            int i21 = i18 + 3;
                            gVar2.f5915j = i21;
                            fArr[i20] = f12;
                            gVar2.f5915j = i18 + 4;
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
            cg.b bVar2 = this.f2722h0;
            if (((cg.d) bVar2).f4165b.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = ((cg.d) bVar2).f4165b[c13] * this.C0;
            }
            for (int i22 = 0; i22 < size; i22++) {
                dg.g gVar3 = (dg.g) arrayList.get(i22);
                Paint paint = gVar3.f5911c;
                Paint paint2 = gVar3.f5911c;
                paint.setStrokeWidth(max * f7);
                paint2.setAlpha(255);
                canvas.drawLines(gVar3.f5916k, 0, gVar3.f5915j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f2707b;
        this.m0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f2731n0 = i10;
            int i11 = this.f2731n0;
            if (i11 < this.m0) {
                l(canvas, (dg.e) arrayList.get(i11));
                p(canvas, (dg.e) arrayList.get(this.f2731n0));
                i10 = this.f2731n0 + 1;
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
        return ((cg.d) this.f2722h0).f4174m.j0(i10, i11);
    }

    @Override
    public final void u() {
        super.u();
        this.f2726j0 = 0.0f;
        int length = ((cg.d) this.f2722h0).f4164a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                dg.i iVar = (dg.i) arrayList.get(i11);
                if (iVar.f5919n) {
                    j10 += iVar.f5909a.f4158a[i10];
                }
            }
            float f7 = (float) j10;
            if (f7 > this.f2726j0) {
                this.f2726j0 = f7;
            }
        }
    }

    @Override
    public final void z() {
        int length = ((cg.a) ((cg.d) this.f2722h0).d.get(0)).f4158a.length;
        int size = ((cg.d) this.f2722h0).d.size();
        ((cg.d) this.f2722h0).f4173l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((cg.d) this.f2722h0).f4173l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((dg.i) this.d.get(i11)).f5919n) {
                    cg.b bVar = this.f2722h0;
                    long[] jArr = ((cg.d) bVar).f4173l;
                    jArr[i10] = jArr[i10] + ((cg.a) ((cg.d) bVar).d.get(i11)).f4158a[i10];
                }
            }
        }
        cg.b bVar2 = this.f2722h0;
        ((cg.d) bVar2).f4174m = new m4.c(((cg.d) bVar2).f4173l);
        super.z();
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
