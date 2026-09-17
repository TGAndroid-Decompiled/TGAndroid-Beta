package ig;

import ai.l6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ka1;
import org.telegram.ui.nl0;
public final class p extends g {
    public long[] D1;

    public p(Context context, f6 f6Var) {
        super(context, f6Var);
        this.f11169w0 = true;
        this.f11171x0 = true;
    }

    @Override
    public final void C(int i10, int i11) {
        float f7;
        jg.b bVar = this.f11148h0;
        if (bVar != null) {
            int i12 = this.f11164s0;
            float f10 = this.G0;
            float f11 = (this.f11146g0.f11187k * f10) - g.f11115k1;
            jg.d dVar = (jg.d) bVar;
            float[] fArr = dVar.f13002b;
            if (fArr.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = fArr[1] * f10;
            }
            float f12 = (i10 + f11) / (f10 - f7);
            if (f12 < 0.0f) {
                this.f11164s0 = 0;
            } else if (f12 > 1.0f) {
                this.f11164s0 = dVar.f13001a.length - 1;
            } else {
                int b10 = dVar.b(f12, this.F, this.G);
                this.f11164s0 = b10;
                int i13 = this.G;
                if (b10 > i13) {
                    this.f11164s0 = i13;
                }
                int i14 = this.f11164s0;
                int i15 = this.F;
                if (i14 < i15) {
                    this.f11164s0 = i15;
                }
            }
            if (i12 != this.f11164s0) {
                this.f11166u0 = true;
                c(true);
                x(f11);
                e eVar = this.Q0;
                if (eVar != null) {
                    getSelectedDate();
                    ka1 ka1Var = (ka1) ((nl0) eVar).f36126b;
                    ka1Var.f();
                    ka1Var.f35174b.f11165t0.d(false, false);
                }
                invalidate();
                B();
            }
        }
    }

    @Override
    public final void K() {
        if (g.B1) {
            int length = ((jg.d) this.f11148h0).f13001a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j3 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    kg.h hVar = (kg.h) arrayList.get(i11);
                    if (hVar.f13631n) {
                        j10 += hVar.f13621a.f12995a[i10];
                    }
                }
                if (j10 > j3) {
                    j3 = j10;
                }
            }
            if (j3 > 0) {
                float f7 = (float) j3;
                if (f7 != this.f11155l0) {
                    this.f11155l0 = f7;
                    Animator animator = this.f11139d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = g.e(this.f11152j0, this.f11155l0, new l6(this, 5));
                    this.f11139d0 = e;
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
    public final kg.f h(jg.a aVar) {
        return new kg.h(aVar, this.W0);
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
        jg.b bVar = this.f11148h0;
        if (bVar == null) {
            return;
        }
        float f14 = this.F0;
        j jVar = this.f11146g0;
        float f15 = jVar.f11188l;
        float f16 = jVar.f11187k;
        float f17 = f14 / (f15 - f16);
        float f18 = g.f11115k1;
        float f19 = (f16 * f17) - f18;
        float[] fArr = ((jg.d) bVar).f13002b;
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
        int min = Math.min(((jg.d) this.f11148h0).f13002b.length - 1, this.G + i13 + 2);
        int i14 = 0;
        while (true) {
            arrayList = this.d;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((kg.f) arrayList.get(i14)).f13627j = 0;
            i14++;
        }
        canvas2.save();
        int i15 = this.f11173y0;
        if (i15 == 2) {
            this.f11144f0 = true;
            this.f11167v0 = 0.0f;
            kg.j jVar2 = this.f11174z0;
            float f22 = jVar2.f13640f;
            f12 = 1.0f - f22;
            f11 = 2.0f;
            canvas2.scale((f22 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else {
            f11 = 2.0f;
            if (i15 == 1) {
                kg.j jVar3 = this.f11174z0;
                float f23 = jVar3.f13640f;
                canvas2.scale(f23, 1.0f, jVar3.d, jVar3.e);
                f12 = f23;
            } else if (i15 == 3) {
                f12 = this.f11174z0.f13640f;
            } else {
                f12 = 1.0f;
            }
        }
        z10 = (this.f11164s0 < 0 || !this.f11166u0) ? false : false;
        while (true) {
            i10 = g.f11117n1;
            if (max > min) {
                break;
            }
            if (this.f11164s0 != max || !z10) {
                int i16 = 0;
                float f24 = 0.0f;
                while (i16 < arrayList.size()) {
                    kg.f fVar = (kg.f) arrayList.get(i16);
                    if (!fVar.f13631n && fVar.f13632o == 0.0f) {
                        i11 = min;
                        i12 = max;
                    } else {
                        long[] jArr = fVar.f13621a.f12995a;
                        float f25 = (((f17 - f10) * ((jg.d) this.f11148h0).f13002b[max]) + (f10 / f11)) - f19;
                        i11 = min;
                        i12 = max;
                        float measuredHeight = (((float) jArr[i12]) / this.v) * ((getMeasuredHeight() - this.f11163s) - i10) * fVar.f13632o;
                        float measuredHeight2 = (getMeasuredHeight() - this.f11163s) - measuredHeight;
                        float[] fArr2 = fVar.f13628k;
                        int i17 = fVar.f13627j;
                        int i18 = i17 + 1;
                        fVar.f13627j = i18;
                        fArr2[i17] = f25;
                        int i19 = i17 + 2;
                        fVar.f13627j = i19;
                        fArr2[i18] = measuredHeight2 - f24;
                        int i20 = i17 + 3;
                        fVar.f13627j = i20;
                        fArr2[i19] = f25;
                        fVar.f13627j = i17 + 4;
                        fArr2[i20] = (getMeasuredHeight() - this.f11163s) - f24;
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
            kg.h hVar = (kg.h) arrayList.get(i21);
            if (!z10 && !this.f11144f0) {
                paint = hVar.f13623c;
            } else {
                paint = hVar.f13634q;
            }
            if (z10) {
                f13 = 255.0f;
                hVar.f13634q.setColor(i0.a.d(this.f11167v0, hVar.f13630m, hVar.f13635r));
            } else {
                f13 = 255.0f;
            }
            if (this.f11144f0) {
                hVar.f13634q.setColor(i0.a.d(1.0f, hVar.f13630m, hVar.f13635r));
            }
            paint.setAlpha((int) (f12 * f13));
            paint.setStrokeWidth(f7);
            canvas2.drawLines(hVar.f13628k, 0, hVar.f13627j, paint);
        }
        if (z10) {
            int i22 = 0;
            float f26 = 0.0f;
            while (i22 < arrayList.size()) {
                kg.f fVar2 = (kg.f) arrayList.get(i22);
                boolean z11 = fVar2.f13631n;
                Paint paint2 = fVar2.f13623c;
                if (z11 || fVar2.f13632o != 0.0f) {
                    long[] jArr2 = fVar2.f13621a.f12995a;
                    float[] fArr3 = ((jg.d) this.f11148h0).f13002b;
                    int i23 = this.f11164s0;
                    float f27 = (((f17 - f10) * fArr3[i23]) + (f10 / f11)) - f19;
                    float measuredHeight3 = (((float) jArr2[i23]) / this.v) * ((getMeasuredHeight() - this.f11163s) - i10) * fVar2.f13632o;
                    paint2.setStrokeWidth(f7);
                    paint2.setAlpha((int) (f12 * 255.0f));
                    canvas2.drawLine(f27, ((getMeasuredHeight() - this.f11163s) - measuredHeight3) - f26, f27, (getMeasuredHeight() - this.f11163s) - f26, paint2);
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
        jg.b bVar = this.f11148h0;
        if (bVar != null) {
            int length = ((jg.d) bVar).f13002b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((kg.f) arrayList.get(i12)).f13627j = 0;
            }
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.D1;
            if (jArr == null || jArr.length < size) {
                this.D1 = new long[size];
            }
            int i13 = 0;
            while (i13 < length) {
                float f12 = ((jg.d) this.f11148h0).f13002b[i13] * this.C0;
                int i14 = 0;
                while (true) {
                    f10 = 0.0f;
                    if (i14 >= size) {
                        break;
                    }
                    kg.f fVar = (kg.f) arrayList.get(i14);
                    if (fVar.f13631n || fVar.f13632o != 0.0f) {
                        long j3 = fVar.f13621a.f12995a[i13];
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
                        kg.f fVar2 = (kg.f) arrayList.get(i15);
                        if (!fVar2.f13631n && fVar2.f13632o == f10) {
                            i11 = length;
                            i10 = i13;
                        } else {
                            if (g.B1) {
                                f11 = this.f11152j0;
                            } else {
                                f11 = (float) ((jg.d) this.f11148h0).e;
                            }
                            long[] jArr3 = this.D1;
                            i10 = i13;
                            float f14 = (((float) jArr3[i15]) / f11) * fVar2.f13632o;
                            int i16 = this.B0;
                            float f15 = f14 * i16;
                            float[] fArr = fVar2.f13628k;
                            int i17 = fVar2.f13627j;
                            int i18 = i17 + 1;
                            fVar2.f13627j = i18;
                            fArr[i17] = f12;
                            int i19 = i17 + 2;
                            fVar2.f13627j = i19;
                            i11 = length;
                            fArr[i18] = (i16 - f15) - f13;
                            int i20 = i17 + 3;
                            fVar2.f13627j = i20;
                            fArr[i19] = f12;
                            fVar2.f13627j = i17 + 4;
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
            jg.b bVar2 = this.f11148h0;
            if (((jg.d) bVar2).f13002b.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = ((jg.d) bVar2).f13002b[1] * this.C0;
            }
            for (int i21 = 0; i21 < size; i21++) {
                kg.f fVar3 = (kg.f) arrayList.get(i21);
                Paint paint = fVar3.f13623c;
                Paint paint2 = fVar3.f13623c;
                paint.setStrokeWidth(max * f7);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.f13628k, 0, fVar3.f13627j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f11133b;
        this.m0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f11157n0 = i10;
            int i11 = this.f11157n0;
            if (i11 < this.m0) {
                l(canvas, (kg.d) arrayList.get(i11));
                p(canvas, (kg.d) arrayList.get(this.f11157n0));
                i10 = this.f11157n0 + 1;
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
        return ((jg.d) this.f11148h0).f13011m.rMaxQ(i10, i11);
    }

    @Override
    public final void u() {
        super.u();
        this.f11152j0 = 0.0f;
        int length = ((jg.d) this.f11148h0).f13001a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j3 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                kg.h hVar = (kg.h) arrayList.get(i11);
                if (hVar.f13631n) {
                    j3 += hVar.f13621a.f12995a[i10];
                }
            }
            float f7 = (float) j3;
            if (f7 > this.f11152j0) {
                this.f11152j0 = f7;
            }
        }
    }

    @Override
    public final void z() {
        int length = ((jg.a) ((jg.d) this.f11148h0).d.get(0)).f12995a.length;
        int size = ((jg.d) this.f11148h0).d.size();
        ((jg.d) this.f11148h0).f13010l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((jg.d) this.f11148h0).f13010l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((kg.h) this.d.get(i11)).f13631n) {
                    jg.b bVar = this.f11148h0;
                    long[] jArr = ((jg.d) bVar).f13010l;
                    jArr[i10] = jArr[i10] + ((jg.a) ((jg.d) bVar).d.get(i11)).f12995a[i10];
                }
            }
        }
        jg.b bVar2 = this.f11148h0;
        ((jg.d) bVar2).f13011m = new SegmentTree(((jg.d) bVar2).f13010l);
        super.z();
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
