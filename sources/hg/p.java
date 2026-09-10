package hg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.pa1;
import org.telegram.ui.ul0;
public final class p extends g {
    public long[] D1;

    public p(Context context, f6 f6Var) {
        super(context, f6Var);
        this.f9386w0 = true;
        this.f9388x0 = true;
    }

    @Override
    public final void C(int i10, int i11) {
        float f7;
        ig.b bVar = this.f9365h0;
        if (bVar != null) {
            int i12 = this.f9381s0;
            float f10 = this.G0;
            float f11 = (this.f9363g0.f9404k * f10) - g.f9332k1;
            ig.d dVar = (ig.d) bVar;
            float[] fArr = dVar.f10591b;
            if (fArr.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = fArr[1] * f10;
            }
            float f12 = (i10 + f11) / (f10 - f7);
            if (f12 < 0.0f) {
                this.f9381s0 = 0;
            } else if (f12 > 1.0f) {
                this.f9381s0 = dVar.f10590a.length - 1;
            } else {
                int b10 = dVar.b(f12, this.F, this.G);
                this.f9381s0 = b10;
                int i13 = this.G;
                if (b10 > i13) {
                    this.f9381s0 = i13;
                }
                int i14 = this.f9381s0;
                int i15 = this.F;
                if (i14 < i15) {
                    this.f9381s0 = i15;
                }
            }
            if (i12 != this.f9381s0) {
                this.f9383u0 = true;
                c(true);
                x(f11);
                e eVar = this.Q0;
                if (eVar != null) {
                    getSelectedDate();
                    pa1 pa1Var = (pa1) ((ul0) eVar).f37294b;
                    pa1Var.f();
                    pa1Var.f35753b.f9382t0.d(false, false);
                }
                invalidate();
                B();
            }
        }
    }

    @Override
    public final void K() {
        if (g.B1) {
            int length = ((ig.d) this.f9365h0).f10590a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j3 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    jg.h hVar = (jg.h) arrayList.get(i11);
                    if (hVar.f11924n) {
                        j10 += hVar.f11914a.f10584a[i10];
                    }
                }
                if (j10 > j3) {
                    j3 = j10;
                }
            }
            if (j3 > 0) {
                float f7 = (float) j3;
                if (f7 != this.f9372l0) {
                    this.f9372l0 = f7;
                    Animator animator = this.f9356d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = g.e(this.f9369j0, this.f9372l0, new ai.m(this, 4));
                    this.f9356d0 = e;
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
    public final jg.f h(ig.a aVar) {
        return new jg.h(aVar, this.W0);
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
        ig.b bVar = this.f9365h0;
        if (bVar == null) {
            return;
        }
        float f14 = this.F0;
        j jVar = this.f9363g0;
        float f15 = jVar.f9405l;
        float f16 = jVar.f9404k;
        float f17 = f14 / (f15 - f16);
        float f18 = g.f9332k1;
        float f19 = (f16 * f17) - f18;
        float[] fArr = ((ig.d) bVar).f10591b;
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
        int min = Math.min(((ig.d) this.f9365h0).f10591b.length - 1, this.G + i13 + 2);
        int i14 = 0;
        while (true) {
            arrayList = this.d;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((jg.f) arrayList.get(i14)).f11920j = 0;
            i14++;
        }
        canvas2.save();
        int i15 = this.f9390y0;
        if (i15 == 2) {
            this.f9361f0 = true;
            this.f9384v0 = 0.0f;
            jg.j jVar2 = this.f9391z0;
            float f22 = jVar2.f11933f;
            f12 = 1.0f - f22;
            f11 = 2.0f;
            canvas2.scale((f22 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else {
            f11 = 2.0f;
            if (i15 == 1) {
                jg.j jVar3 = this.f9391z0;
                float f23 = jVar3.f11933f;
                canvas2.scale(f23, 1.0f, jVar3.d, jVar3.e);
                f12 = f23;
            } else if (i15 == 3) {
                f12 = this.f9391z0.f11933f;
            } else {
                f12 = 1.0f;
            }
        }
        z10 = (this.f9381s0 < 0 || !this.f9383u0) ? false : false;
        while (true) {
            i10 = g.f9334n1;
            if (max > min) {
                break;
            }
            if (this.f9381s0 != max || !z10) {
                int i16 = 0;
                float f24 = 0.0f;
                while (i16 < arrayList.size()) {
                    jg.f fVar = (jg.f) arrayList.get(i16);
                    if (!fVar.f11924n && fVar.f11925o == 0.0f) {
                        i11 = min;
                        i12 = max;
                    } else {
                        long[] jArr = fVar.f11914a.f10584a;
                        float f25 = (((f17 - f10) * ((ig.d) this.f9365h0).f10591b[max]) + (f10 / f11)) - f19;
                        i11 = min;
                        i12 = max;
                        float measuredHeight = (((float) jArr[i12]) / this.v) * ((getMeasuredHeight() - this.f9380s) - i10) * fVar.f11925o;
                        float measuredHeight2 = (getMeasuredHeight() - this.f9380s) - measuredHeight;
                        float[] fArr2 = fVar.f11921k;
                        int i17 = fVar.f11920j;
                        int i18 = i17 + 1;
                        fVar.f11920j = i18;
                        fArr2[i17] = f25;
                        int i19 = i17 + 2;
                        fVar.f11920j = i19;
                        fArr2[i18] = measuredHeight2 - f24;
                        int i20 = i17 + 3;
                        fVar.f11920j = i20;
                        fArr2[i19] = f25;
                        fVar.f11920j = i17 + 4;
                        fArr2[i20] = (getMeasuredHeight() - this.f9380s) - f24;
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
            jg.h hVar = (jg.h) arrayList.get(i21);
            if (!z10 && !this.f9361f0) {
                paint = hVar.f11916c;
            } else {
                paint = hVar.f11927q;
            }
            if (z10) {
                f13 = 255.0f;
                hVar.f11927q.setColor(i0.a.d(this.f9384v0, hVar.f11923m, hVar.f11928r));
            } else {
                f13 = 255.0f;
            }
            if (this.f9361f0) {
                hVar.f11927q.setColor(i0.a.d(1.0f, hVar.f11923m, hVar.f11928r));
            }
            paint.setAlpha((int) (f12 * f13));
            paint.setStrokeWidth(f7);
            canvas2.drawLines(hVar.f11921k, 0, hVar.f11920j, paint);
        }
        if (z10) {
            int i22 = 0;
            float f26 = 0.0f;
            while (i22 < arrayList.size()) {
                jg.f fVar2 = (jg.f) arrayList.get(i22);
                boolean z11 = fVar2.f11924n;
                Paint paint2 = fVar2.f11916c;
                if (z11 || fVar2.f11925o != 0.0f) {
                    long[] jArr2 = fVar2.f11914a.f10584a;
                    float[] fArr3 = ((ig.d) this.f9365h0).f10591b;
                    int i23 = this.f9381s0;
                    float f27 = (((f17 - f10) * fArr3[i23]) + (f10 / f11)) - f19;
                    float measuredHeight3 = (((float) jArr2[i23]) / this.v) * ((getMeasuredHeight() - this.f9380s) - i10) * fVar2.f11925o;
                    paint2.setStrokeWidth(f7);
                    paint2.setAlpha((int) (f12 * 255.0f));
                    canvas2.drawLine(f27, ((getMeasuredHeight() - this.f9380s) - measuredHeight3) - f26, f27, (getMeasuredHeight() - this.f9380s) - f26, paint2);
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
        ig.b bVar = this.f9365h0;
        if (bVar != null) {
            int length = ((ig.d) bVar).f10591b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((jg.f) arrayList.get(i12)).f11920j = 0;
            }
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.D1;
            if (jArr == null || jArr.length < size) {
                this.D1 = new long[size];
            }
            int i13 = 0;
            while (i13 < length) {
                float f12 = ((ig.d) this.f9365h0).f10591b[i13] * this.C0;
                int i14 = 0;
                while (true) {
                    f10 = 0.0f;
                    if (i14 >= size) {
                        break;
                    }
                    jg.f fVar = (jg.f) arrayList.get(i14);
                    if (fVar.f11924n || fVar.f11925o != 0.0f) {
                        long j3 = fVar.f11914a.f10584a[i13];
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
                        jg.f fVar2 = (jg.f) arrayList.get(i15);
                        if (!fVar2.f11924n && fVar2.f11925o == f10) {
                            i11 = length;
                            i10 = i13;
                        } else {
                            if (g.B1) {
                                f11 = this.f9369j0;
                            } else {
                                f11 = (float) ((ig.d) this.f9365h0).e;
                            }
                            long[] jArr3 = this.D1;
                            i10 = i13;
                            float f14 = (((float) jArr3[i15]) / f11) * fVar2.f11925o;
                            int i16 = this.B0;
                            float f15 = f14 * i16;
                            float[] fArr = fVar2.f11921k;
                            int i17 = fVar2.f11920j;
                            int i18 = i17 + 1;
                            fVar2.f11920j = i18;
                            fArr[i17] = f12;
                            int i19 = i17 + 2;
                            fVar2.f11920j = i19;
                            i11 = length;
                            fArr[i18] = (i16 - f15) - f13;
                            int i20 = i17 + 3;
                            fVar2.f11920j = i20;
                            fArr[i19] = f12;
                            fVar2.f11920j = i17 + 4;
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
            ig.b bVar2 = this.f9365h0;
            if (((ig.d) bVar2).f10591b.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = ((ig.d) bVar2).f10591b[1] * this.C0;
            }
            for (int i21 = 0; i21 < size; i21++) {
                jg.f fVar3 = (jg.f) arrayList.get(i21);
                Paint paint = fVar3.f11916c;
                Paint paint2 = fVar3.f11916c;
                paint.setStrokeWidth(max * f7);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.f11921k, 0, fVar3.f11920j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f9350b;
        this.m0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f9374n0 = i10;
            int i11 = this.f9374n0;
            if (i11 < this.m0) {
                l(canvas, (jg.d) arrayList.get(i11));
                p(canvas, (jg.d) arrayList.get(this.f9374n0));
                i10 = this.f9374n0 + 1;
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
        return ((ig.d) this.f9365h0).f10600m.rMaxQ(i10, i11);
    }

    @Override
    public final void u() {
        super.u();
        this.f9369j0 = 0.0f;
        int length = ((ig.d) this.f9365h0).f10590a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j3 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                jg.h hVar = (jg.h) arrayList.get(i11);
                if (hVar.f11924n) {
                    j3 += hVar.f11914a.f10584a[i10];
                }
            }
            float f7 = (float) j3;
            if (f7 > this.f9369j0) {
                this.f9369j0 = f7;
            }
        }
    }

    @Override
    public final void z() {
        int length = ((ig.a) ((ig.d) this.f9365h0).d.get(0)).f10584a.length;
        int size = ((ig.d) this.f9365h0).d.size();
        ((ig.d) this.f9365h0).f10599l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((ig.d) this.f9365h0).f10599l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((jg.h) this.d.get(i11)).f11924n) {
                    ig.b bVar = this.f9365h0;
                    long[] jArr = ((ig.d) bVar).f10599l;
                    jArr[i10] = jArr[i10] + ((ig.a) ((ig.d) bVar).d.get(i11)).f10584a[i10];
                }
            }
        }
        ig.b bVar2 = this.f9365h0;
        ((ig.d) bVar2).f10600m = new SegmentTree(((ig.d) bVar2).f10599l);
        super.z();
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
