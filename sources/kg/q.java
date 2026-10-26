package kg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import di.u4;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.g91;
import org.telegram.ui.hl0;
public final class q extends h {
    public long[] D1;

    public q(Context context, u6 u6Var) {
        super(context, u6Var);
        this.f16622w0 = true;
        this.f16624x0 = true;
    }

    @Override
    public final void C(int i10, int i11) {
        float f7;
        lg.b bVar = this.f16601h0;
        if (bVar != null) {
            int i12 = this.f16617s0;
            float f10 = this.G0;
            float f11 = (this.f16599g0.f16640k * f10) - h.f16568k1;
            lg.d dVar = (lg.d) bVar;
            float[] fArr = dVar.f17012b;
            if (fArr.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = fArr[1] * f10;
            }
            float f12 = (i10 + f11) / (f10 - f7);
            if (f12 < 0.0f) {
                this.f16617s0 = 0;
            } else if (f12 > 1.0f) {
                this.f16617s0 = dVar.f17011a.length - 1;
            } else {
                int b10 = dVar.b(f12, this.F, this.G);
                this.f16617s0 = b10;
                int i13 = this.G;
                if (b10 > i13) {
                    this.f16617s0 = i13;
                }
                int i14 = this.f16617s0;
                int i15 = this.F;
                if (i14 < i15) {
                    this.f16617s0 = i15;
                }
            }
            if (i12 != this.f16617s0) {
                this.f16619u0 = true;
                c(true);
                x(f11);
                f fVar = this.Q0;
                if (fVar != null) {
                    getSelectedDate();
                    g91 g91Var = (g91) ((hl0) fVar).f40035b;
                    g91Var.f();
                    g91Var.f39572b.f16618t0.d(false, false);
                }
                invalidate();
                B();
            }
        }
    }

    @Override
    public final void K() {
        if (h.B1) {
            int length = ((lg.d) this.f16601h0).f17011a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    mg.h hVar = (mg.h) arrayList.get(i11);
                    if (hVar.f18475n) {
                        j11 += hVar.f18465a.f17005a[i10];
                    }
                }
                if (j11 > j10) {
                    j10 = j11;
                }
            }
            if (j10 > 0) {
                float f7 = (float) j10;
                if (f7 != this.f16608l0) {
                    this.f16608l0 = f7;
                    Animator animator = this.f16592d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = h.e(this.f16605j0, this.f16608l0, new u4(this, 5));
                    this.f16592d0 = e;
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
    public final mg.f h(lg.a aVar) {
        return new mg.h(aVar, this.W0);
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
        lg.b bVar = this.f16601h0;
        if (bVar == null) {
            return;
        }
        float f15 = this.F0;
        k kVar = this.f16599g0;
        float f16 = kVar.f16641l;
        float f17 = kVar.f16640k;
        float f18 = f15 / (f16 - f17);
        float f19 = h.f16568k1;
        float f20 = (f17 * f18) - f19;
        float[] fArr = ((lg.d) bVar).f17012b;
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
        int min = Math.min(((lg.d) this.f16601h0).f17012b.length - 1, this.G + i13 + 2);
        int i15 = 0;
        while (true) {
            arrayList = this.d;
            if (i15 >= arrayList.size()) {
                break;
            }
            ((mg.f) arrayList.get(i15)).f18471j = 0;
            i15++;
        }
        canvas2.save();
        int i16 = this.f16626y0;
        float f23 = 0.0f;
        if (i16 == 2) {
            this.f16597f0 = true;
            this.f16620v0 = 0.0f;
            mg.j jVar = this.f16627z0;
            float f24 = jVar.f18484f;
            f12 = 1.0f - f24;
            f11 = 2.0f;
            canvas2.scale((f24 * 2.0f) + 1.0f, 1.0f, jVar.d, jVar.e);
        } else {
            f11 = 2.0f;
            if (i16 == 1) {
                mg.j jVar2 = this.f16627z0;
                float f25 = jVar2.f18484f;
                canvas2.scale(f25, 1.0f, jVar2.d, jVar2.e);
                f12 = f25;
            } else if (i16 == 3) {
                f12 = this.f16627z0.f18484f;
            } else {
                f12 = 1.0f;
            }
        }
        z10 = (this.f16617s0 < 0 || !this.f16619u0) ? false : false;
        while (true) {
            i10 = h.f16570n1;
            if (max > min) {
                break;
            }
            if (this.f16617s0 == max && z10) {
                f14 = f23;
            } else {
                int i17 = i14;
                float f26 = f23;
                f14 = f26;
                while (i17 < arrayList.size()) {
                    mg.f fVar = (mg.f) arrayList.get(i17);
                    if (!fVar.f18475n && fVar.f18476o == f14) {
                        i11 = min;
                        i12 = max;
                    } else {
                        long[] jArr = fVar.f18465a.f17005a;
                        float f27 = (((f18 - f10) * ((lg.d) this.f16601h0).f17012b[max]) + (f10 / f11)) - f20;
                        i11 = min;
                        i12 = max;
                        float measuredHeight = (((float) jArr[i12]) / this.v) * ((getMeasuredHeight() - this.f16616s) - i10) * fVar.f18476o;
                        float measuredHeight2 = (getMeasuredHeight() - this.f16616s) - measuredHeight;
                        float[] fArr2 = fVar.f18472k;
                        int i18 = fVar.f18471j;
                        int i19 = i18 + 1;
                        fVar.f18471j = i19;
                        fArr2[i18] = f27;
                        int i20 = i18 + 2;
                        fVar.f18471j = i20;
                        fArr2[i19] = measuredHeight2 - f26;
                        int i21 = i18 + 3;
                        fVar.f18471j = i21;
                        fArr2[i20] = f27;
                        fVar.f18471j = i18 + 4;
                        fArr2[i21] = (getMeasuredHeight() - this.f16616s) - f26;
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
            mg.h hVar = (mg.h) arrayList.get(i22);
            if (!z10 && !this.f16597f0) {
                paint = hVar.f18467c;
            } else {
                paint = hVar.f18478q;
            }
            if (z10) {
                f13 = 255.0f;
                hVar.f18478q.setColor(i0.a.f(this.f16620v0, hVar.f18474m, hVar.f18479r));
            } else {
                f13 = 255.0f;
            }
            if (this.f16597f0) {
                hVar.f18478q.setColor(i0.a.f(1.0f, hVar.f18474m, hVar.f18479r));
            }
            paint.setAlpha((int) (f12 * f13));
            paint.setStrokeWidth(f7);
            canvas2.drawLines(hVar.f18472k, 0, hVar.f18471j, paint);
        }
        if (z10) {
            int i23 = 0;
            float f29 = f28;
            while (i23 < arrayList.size()) {
                mg.f fVar2 = (mg.f) arrayList.get(i23);
                boolean z11 = fVar2.f18475n;
                Paint paint2 = fVar2.f18467c;
                if (z11 || fVar2.f18476o != f28) {
                    long[] jArr2 = fVar2.f18465a.f17005a;
                    float[] fArr3 = ((lg.d) this.f16601h0).f17012b;
                    int i24 = this.f16617s0;
                    float f30 = (((f18 - f10) * fArr3[i24]) + (f10 / f11)) - f20;
                    float measuredHeight3 = (((float) jArr2[i24]) / this.v) * ((getMeasuredHeight() - this.f16616s) - i10) * fVar2.f18476o;
                    paint2.setStrokeWidth(f7);
                    paint2.setAlpha((int) (f12 * 255.0f));
                    canvas2.drawLine(f30, ((getMeasuredHeight() - this.f16616s) - measuredHeight3) - f29, f30, (getMeasuredHeight() - this.f16616s) - f29, paint2);
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
        lg.b bVar = this.f16601h0;
        if (bVar != null) {
            int length = ((lg.d) bVar).f17012b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((mg.f) arrayList.get(i13)).f18471j = 0;
            }
            char c11 = 1;
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.D1;
            if (jArr == null || jArr.length < size) {
                this.D1 = new long[size];
            }
            int i14 = 0;
            while (i14 < length) {
                float f12 = ((lg.d) this.f16601h0).f17012b[i14] * this.C0;
                int i15 = i12;
                while (true) {
                    f10 = 0.0f;
                    if (i15 >= size) {
                        break;
                    }
                    mg.f fVar = (mg.f) arrayList.get(i15);
                    if (fVar.f18475n || fVar.f18476o != 0.0f) {
                        long j10 = fVar.f18465a.f17005a[i14];
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
                        mg.f fVar2 = (mg.f) arrayList.get(i16);
                        if (!fVar2.f18475n && fVar2.f18476o == f10) {
                            i11 = length;
                            c10 = c11;
                            i10 = i14;
                        } else {
                            if (h.B1) {
                                f11 = this.f16605j0;
                            } else {
                                f11 = (float) ((lg.d) this.f16601h0).e;
                            }
                            long[] jArr3 = this.D1;
                            char c12 = c11;
                            i10 = i14;
                            float f14 = (((float) jArr3[i16]) / f11) * fVar2.f18476o;
                            int i17 = this.B0;
                            float f15 = f14 * i17;
                            float[] fArr = fVar2.f18472k;
                            int i18 = fVar2.f18471j;
                            c10 = c12;
                            int i19 = i18 + 1;
                            fVar2.f18471j = i19;
                            fArr[i18] = f12;
                            int i20 = i18 + 2;
                            fVar2.f18471j = i20;
                            i11 = length;
                            fArr[i19] = (i17 - f15) - f13;
                            int i21 = i18 + 3;
                            fVar2.f18471j = i21;
                            fArr[i20] = f12;
                            fVar2.f18471j = i18 + 4;
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
            lg.b bVar2 = this.f16601h0;
            if (((lg.d) bVar2).f17012b.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = ((lg.d) bVar2).f17012b[c13] * this.C0;
            }
            for (int i22 = 0; i22 < size; i22++) {
                mg.f fVar3 = (mg.f) arrayList.get(i22);
                Paint paint = fVar3.f18467c;
                Paint paint2 = fVar3.f18467c;
                paint.setStrokeWidth(max * f7);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.f18472k, 0, fVar3.f18471j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f16586b;
        this.m0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f16610n0 = i10;
            int i11 = this.f16610n0;
            if (i11 < this.m0) {
                l(canvas, (mg.d) arrayList.get(i11));
                p(canvas, (mg.d) arrayList.get(this.f16610n0));
                i10 = this.f16610n0 + 1;
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
        return ((lg.d) this.f16601h0).f17021m.rMaxQ(i10, i11);
    }

    @Override
    public final void u() {
        super.u();
        this.f16605j0 = 0.0f;
        int length = ((lg.d) this.f16601h0).f17011a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                mg.h hVar = (mg.h) arrayList.get(i11);
                if (hVar.f18475n) {
                    j10 += hVar.f18465a.f17005a[i10];
                }
            }
            float f7 = (float) j10;
            if (f7 > this.f16605j0) {
                this.f16605j0 = f7;
            }
        }
    }

    @Override
    public final void z() {
        int length = ((lg.a) ((lg.d) this.f16601h0).d.get(0)).f17005a.length;
        int size = ((lg.d) this.f16601h0).d.size();
        ((lg.d) this.f16601h0).f17020l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((lg.d) this.f16601h0).f17020l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((mg.h) this.d.get(i11)).f18475n) {
                    lg.b bVar = this.f16601h0;
                    long[] jArr = ((lg.d) bVar).f17020l;
                    jArr[i10] = jArr[i10] + ((lg.a) ((lg.d) bVar).d.get(i11)).f17005a[i10];
                }
            }
        }
        lg.b bVar2 = this.f16601h0;
        ((lg.d) bVar2).f17021m = new SegmentTree(((lg.d) bVar2).f17020l);
        super.z();
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
