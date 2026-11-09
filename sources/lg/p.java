package lg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import di.n4;
import java.util.ArrayList;
import m4.d0;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.m41;
import org.telegram.ui.ni0;
public final class p extends g {
    public long[] D1;

    public p(Context context, g6 g6Var) {
        super(context, g6Var);
        this.f18326w0 = true;
        this.f18328x0 = true;
    }

    @Override
    public final void C(int i7, int i10) {
        float f10;
        mg.b bVar = this.f18305h0;
        if (bVar != null) {
            int i11 = this.f18321s0;
            float f11 = this.G0;
            float f12 = (this.f18303g0.f18346k * f11) - g.f18272k1;
            mg.d dVar = (mg.d) bVar;
            float[] fArr = dVar.f20024b;
            if (fArr.length < 2) {
                f10 = 1.0f;
            } else {
                f10 = fArr[1] * f11;
            }
            float f13 = (i7 + f12) / (f11 - f10);
            if (f13 < 0.0f) {
                this.f18321s0 = 0;
            } else if (f13 > 1.0f) {
                this.f18321s0 = dVar.f20023a.length - 1;
            } else {
                int b10 = dVar.b(f13, this.F, this.G);
                this.f18321s0 = b10;
                int i12 = this.G;
                if (b10 > i12) {
                    this.f18321s0 = i12;
                }
                int i13 = this.f18321s0;
                int i14 = this.F;
                if (i13 < i14) {
                    this.f18321s0 = i14;
                }
            }
            if (i11 != this.f18321s0) {
                this.f18323u0 = true;
                c(true);
                x(f12);
                e eVar = this.Q0;
                if (eVar != null) {
                    getSelectedDate();
                    m41 m41Var = (m41) ((ni0) eVar).f48197b;
                    m41Var.f();
                    m41Var.f47744b.f18322t0.d(false, false);
                }
                invalidate();
                B();
            }
        }
    }

    @Override
    public final void K() {
        if (g.B1) {
            int length = ((mg.d) this.f18305h0).f20023a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j3 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    ng.h hVar = (ng.h) arrayList.get(i10);
                    if (hVar.f20579n) {
                        j10 += hVar.f20568a.f20016a[i7];
                    }
                }
                if (j10 > j3) {
                    j3 = j10;
                }
            }
            if (j3 > 0) {
                float f10 = (float) j3;
                if (f10 != this.f18312l0) {
                    this.f18312l0 = f10;
                    Animator animator = this.f18295d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e10 = g.e(this.f18309j0, this.f18312l0, new n4(this, 5));
                    this.f18295d0 = e10;
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
        return new ng.h(aVar, this.W0);
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
        mg.b bVar = this.f18305h0;
        if (bVar == null) {
            return;
        }
        float f16 = this.F0;
        j jVar = this.f18303g0;
        float f17 = jVar.f18347l;
        float f18 = jVar.f18346k;
        float f19 = f16 / (f17 - f18);
        float f20 = g.f18272k1;
        float f21 = (f18 * f19) - f20;
        float[] fArr = ((mg.d) bVar).f20024b;
        boolean z9 = true;
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
        int max = Math.max(0, (this.F - i12) - 2);
        int min = Math.min(((mg.d) this.f18305h0).f20024b.length - 1, this.G + i12 + 2);
        int i14 = 0;
        while (true) {
            arrayList = this.d;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((ng.f) arrayList.get(i14)).f20575j = 0;
            i14++;
        }
        canvas2.save();
        int i15 = this.f18330y0;
        float f24 = 0.0f;
        if (i15 == 2) {
            this.f18301f0 = true;
            this.f18324v0 = 0.0f;
            ng.j jVar2 = this.f18331z0;
            float f25 = jVar2.f20589f;
            f13 = 1.0f - f25;
            f12 = 2.0f;
            canvas2.scale((f25 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.f20588e);
        } else {
            f12 = 2.0f;
            if (i15 == 1) {
                ng.j jVar3 = this.f18331z0;
                float f26 = jVar3.f20589f;
                canvas2.scale(f26, 1.0f, jVar3.d, jVar3.f20588e);
                f13 = f26;
            } else if (i15 == 3) {
                f13 = this.f18331z0.f20589f;
            } else {
                f13 = 1.0f;
            }
        }
        z9 = (this.f18321s0 < 0 || !this.f18323u0) ? false : false;
        while (true) {
            i7 = g.n1;
            if (max > min) {
                break;
            }
            if (this.f18321s0 == max && z9) {
                f15 = f24;
            } else {
                int i16 = i13;
                float f27 = f24;
                f15 = f27;
                while (i16 < arrayList.size()) {
                    ng.f fVar = (ng.f) arrayList.get(i16);
                    if (!fVar.f20579n && fVar.f20580o == f15) {
                        i10 = min;
                        i11 = max;
                    } else {
                        long[] jArr = fVar.f20568a.f20016a;
                        float f28 = (((f19 - f11) * ((mg.d) this.f18305h0).f20024b[max]) + (f11 / f12)) - f21;
                        i10 = min;
                        i11 = max;
                        float measuredHeight = (((float) jArr[i11]) / this.f18325w) * ((getMeasuredHeight() - this.f18320s) - i7) * fVar.f20580o;
                        float measuredHeight2 = (getMeasuredHeight() - this.f18320s) - measuredHeight;
                        float[] fArr2 = fVar.f20576k;
                        int i17 = fVar.f20575j;
                        int i18 = i17 + 1;
                        fVar.f20575j = i18;
                        fArr2[i17] = f28;
                        int i19 = i17 + 2;
                        fVar.f20575j = i19;
                        fArr2[i18] = measuredHeight2 - f27;
                        int i20 = i17 + 3;
                        fVar.f20575j = i20;
                        fArr2[i19] = f28;
                        fVar.f20575j = i17 + 4;
                        fArr2[i20] = (getMeasuredHeight() - this.f18320s) - f27;
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
            if (!z9 && !this.f18301f0) {
                paint = hVar.f20570c;
            } else {
                paint = hVar.f20582q;
            }
            if (z9) {
                f14 = 255.0f;
                hVar.f20582q.setColor(i0.a.f(this.f18324v0, hVar.f20578m, hVar.f20583r));
            } else {
                f14 = 255.0f;
            }
            if (this.f18301f0) {
                hVar.f20582q.setColor(i0.a.f(1.0f, hVar.f20578m, hVar.f20583r));
            }
            paint.setAlpha((int) (f13 * f14));
            paint.setStrokeWidth(f10);
            canvas2.drawLines(hVar.f20576k, 0, hVar.f20575j, paint);
        }
        if (z9) {
            int i22 = 0;
            float f30 = f29;
            while (i22 < arrayList.size()) {
                ng.f fVar2 = (ng.f) arrayList.get(i22);
                boolean z10 = fVar2.f20579n;
                Paint paint2 = fVar2.f20570c;
                if (z10 || fVar2.f20580o != f29) {
                    long[] jArr2 = fVar2.f20568a.f20016a;
                    float[] fArr3 = ((mg.d) this.f18305h0).f20024b;
                    int i23 = this.f18321s0;
                    float f31 = (((f19 - f11) * fArr3[i23]) + (f11 / f12)) - f21;
                    float measuredHeight3 = (((float) jArr2[i23]) / this.f18325w) * ((getMeasuredHeight() - this.f18320s) - i7) * fVar2.f20580o;
                    paint2.setStrokeWidth(f10);
                    paint2.setAlpha((int) (f13 * 255.0f));
                    canvas2.drawLine(f31, ((getMeasuredHeight() - this.f18320s) - measuredHeight3) - f30, f31, (getMeasuredHeight() - this.f18320s) - f30, paint2);
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
        mg.b bVar = this.f18305h0;
        if (bVar != null) {
            int length = ((mg.d) bVar).f20024b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((ng.f) arrayList.get(i12)).f20575j = 0;
            }
            char c11 = 1;
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.D1;
            if (jArr == null || jArr.length < size) {
                this.D1 = new long[size];
            }
            int i13 = 0;
            while (i13 < length) {
                float f13 = ((mg.d) this.f18305h0).f20024b[i13] * this.C0;
                int i14 = i11;
                while (true) {
                    f11 = 0.0f;
                    if (i14 >= size) {
                        break;
                    }
                    ng.f fVar = (ng.f) arrayList.get(i14);
                    if (fVar.f20579n || fVar.f20580o != 0.0f) {
                        long j3 = fVar.f20568a.f20016a[i13];
                        long[] jArr2 = this.D1;
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
                        if (!fVar2.f20579n && fVar2.f20580o == f11) {
                            i10 = length;
                            c10 = c11;
                            i7 = i13;
                        } else {
                            if (g.B1) {
                                f12 = this.f18309j0;
                            } else {
                                f12 = (float) ((mg.d) this.f18305h0).f20026e;
                            }
                            long[] jArr3 = this.D1;
                            char c12 = c11;
                            i7 = i13;
                            float f15 = (((float) jArr3[i15]) / f12) * fVar2.f20580o;
                            int i16 = this.B0;
                            float f16 = f15 * i16;
                            float[] fArr = fVar2.f20576k;
                            int i17 = fVar2.f20575j;
                            c10 = c12;
                            int i18 = i17 + 1;
                            fVar2.f20575j = i18;
                            fArr[i17] = f13;
                            int i19 = i17 + 2;
                            fVar2.f20575j = i19;
                            i10 = length;
                            fArr[i18] = (i16 - f16) - f14;
                            int i20 = i17 + 3;
                            fVar2.f20575j = i20;
                            fArr[i19] = f13;
                            fVar2.f20575j = i17 + 4;
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
            mg.b bVar2 = this.f18305h0;
            if (((mg.d) bVar2).f20024b.length < 2) {
                f10 = 1.0f;
            } else {
                f10 = ((mg.d) bVar2).f20024b[c13] * this.C0;
            }
            for (int i21 = 0; i21 < size; i21++) {
                ng.f fVar3 = (ng.f) arrayList.get(i21);
                Paint paint = fVar3.f20570c;
                Paint paint2 = fVar3.f20570c;
                paint.setStrokeWidth(max * f10);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.f20576k, 0, fVar3.f20575j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f18289b;
        this.m0 = arrayList.size();
        int i7 = 0;
        while (true) {
            this.f18314n0 = i7;
            int i10 = this.f18314n0;
            if (i10 < this.m0) {
                l(canvas, (ng.d) arrayList.get(i10));
                p(canvas, (ng.d) arrayList.get(this.f18314n0));
                i7 = this.f18314n0 + 1;
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
        return ((mg.d) this.f18305h0).f20034m.w0(i7, i10);
    }

    @Override
    public final void u() {
        super.u();
        this.f18309j0 = 0.0f;
        int length = ((mg.d) this.f18305h0).f20023a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < length; i7++) {
            long j3 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                ng.h hVar = (ng.h) arrayList.get(i10);
                if (hVar.f20579n) {
                    j3 += hVar.f20568a.f20016a[i7];
                }
            }
            float f10 = (float) j3;
            if (f10 > this.f18309j0) {
                this.f18309j0 = f10;
            }
        }
    }

    @Override
    public final void z() {
        int length = ((mg.a) ((mg.d) this.f18305h0).d.get(0)).f20016a.length;
        int size = ((mg.d) this.f18305h0).d.size();
        ((mg.d) this.f18305h0).f20033l = new long[length];
        for (int i7 = 0; i7 < length; i7++) {
            ((mg.d) this.f18305h0).f20033l[i7] = 0;
            for (int i10 = 0; i10 < size; i10++) {
                if (((ng.h) this.d.get(i10)).f20579n) {
                    mg.b bVar = this.f18305h0;
                    long[] jArr = ((mg.d) bVar).f20033l;
                    jArr[i7] = jArr[i7] + ((mg.a) ((mg.d) bVar).d.get(i10)).f20016a[i7];
                }
            }
        }
        mg.b bVar2 = this.f18305h0;
        ((mg.d) bVar2).f20034m = new d0(((mg.d) bVar2).f20033l);
        super.z();
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
