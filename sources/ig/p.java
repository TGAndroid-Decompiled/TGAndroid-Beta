package ig;

import ai.l6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.hq0;
import org.telegram.ui.la1;
public final class p extends g {
    public long[] D1;

    public p(Context context, e6 e6Var) {
        super(context, e6Var);
        this.f12196w0 = true;
        this.f12198x0 = true;
    }

    @Override
    public final void C(int i10, int i11) {
        float f7;
        jg.b bVar = this.f12175h0;
        if (bVar != null) {
            int i12 = this.f12191s0;
            float f10 = this.G0;
            float f11 = (this.f12173g0.f12216k * f10) - g.f12141k1;
            jg.d dVar = (jg.d) bVar;
            float[] fArr = dVar.f14159b;
            if (fArr.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = fArr[1] * f10;
            }
            float f12 = (i10 + f11) / (f10 - f7);
            if (f12 < 0.0f) {
                this.f12191s0 = 0;
            } else if (f12 > 1.0f) {
                this.f12191s0 = dVar.f14158a.length - 1;
            } else {
                int b10 = dVar.b(f12, this.F, this.G);
                this.f12191s0 = b10;
                int i13 = this.G;
                if (b10 > i13) {
                    this.f12191s0 = i13;
                }
                int i14 = this.f12191s0;
                int i15 = this.F;
                if (i14 < i15) {
                    this.f12191s0 = i15;
                }
            }
            if (i12 != this.f12191s0) {
                this.f12193u0 = true;
                c(true);
                x(f11);
                e eVar = this.Q0;
                if (eVar != null) {
                    getSelectedDate();
                    la1 la1Var = (la1) ((hq0) eVar).f38435b;
                    la1Var.f();
                    la1Var.f39533b.f12192t0.d(false, false);
                }
                invalidate();
                B();
            }
        }
    }

    @Override
    public final void K() {
        if (g.B1) {
            int length = ((jg.d) this.f12175h0).f14158a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j3 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    kg.h hVar = (kg.h) arrayList.get(i11);
                    if (hVar.f14852n) {
                        j10 += hVar.f14841a.f14151a[i10];
                    }
                }
                if (j10 > j3) {
                    j3 = j10;
                }
            }
            if (j3 > 0) {
                float f7 = (float) j3;
                if (f7 != this.f12182l0) {
                    this.f12182l0 = f7;
                    Animator animator = this.f12165d0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e7 = g.e(this.f12179j0, this.f12182l0, new l6(this, 5));
                    this.f12165d0 = e7;
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
        float f14;
        int i11;
        int i12;
        Canvas canvas2 = canvas;
        jg.b bVar = this.f12175h0;
        if (bVar == null) {
            return;
        }
        float f15 = this.F0;
        j jVar = this.f12173g0;
        float f16 = jVar.f12217l;
        float f17 = jVar.f12216k;
        float f18 = f15 / (f16 - f17);
        float f19 = g.f12141k1;
        float f20 = (f17 * f18) - f19;
        float[] fArr = ((jg.d) bVar).f14159b;
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
        int min = Math.min(((jg.d) this.f12175h0).f14159b.length - 1, this.G + i13 + 2);
        int i15 = 0;
        while (true) {
            arrayList = this.d;
            if (i15 >= arrayList.size()) {
                break;
            }
            ((kg.f) arrayList.get(i15)).f14848j = 0;
            i15++;
        }
        canvas2.save();
        int i16 = this.f12200y0;
        float f23 = 0.0f;
        if (i16 == 2) {
            this.f12171f0 = true;
            this.f12194v0 = 0.0f;
            kg.j jVar2 = this.f12201z0;
            float f24 = jVar2.f14862f;
            f12 = 1.0f - f24;
            f11 = 2.0f;
            canvas2.scale((f24 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.f14861e);
        } else {
            f11 = 2.0f;
            if (i16 == 1) {
                kg.j jVar3 = this.f12201z0;
                float f25 = jVar3.f14862f;
                canvas2.scale(f25, 1.0f, jVar3.d, jVar3.f14861e);
                f12 = f25;
            } else if (i16 == 3) {
                f12 = this.f12201z0.f14862f;
            } else {
                f12 = 1.0f;
            }
        }
        z10 = (this.f12191s0 < 0 || !this.f12193u0) ? false : false;
        while (true) {
            i10 = g.f12143n1;
            if (max > min) {
                break;
            }
            if (this.f12191s0 == max && z10) {
                f14 = f23;
            } else {
                int i17 = i14;
                float f26 = f23;
                f14 = f26;
                while (i17 < arrayList.size()) {
                    kg.f fVar = (kg.f) arrayList.get(i17);
                    if (!fVar.f14852n && fVar.f14853o == f14) {
                        i11 = min;
                        i12 = max;
                    } else {
                        long[] jArr = fVar.f14841a.f14151a;
                        float f27 = (((f18 - f10) * ((jg.d) this.f12175h0).f14159b[max]) + (f10 / f11)) - f20;
                        i11 = min;
                        i12 = max;
                        float measuredHeight = (((float) jArr[i12]) / this.v) * ((getMeasuredHeight() - this.f12190s) - i10) * fVar.f14853o;
                        float measuredHeight2 = (getMeasuredHeight() - this.f12190s) - measuredHeight;
                        float[] fArr2 = fVar.f14849k;
                        int i18 = fVar.f14848j;
                        int i19 = i18 + 1;
                        fVar.f14848j = i19;
                        fArr2[i18] = f27;
                        int i20 = i18 + 2;
                        fVar.f14848j = i20;
                        fArr2[i19] = measuredHeight2 - f26;
                        int i21 = i18 + 3;
                        fVar.f14848j = i21;
                        fArr2[i20] = f27;
                        fVar.f14848j = i18 + 4;
                        fArr2[i21] = (getMeasuredHeight() - this.f12190s) - f26;
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
            kg.h hVar = (kg.h) arrayList.get(i22);
            if (!z10 && !this.f12171f0) {
                paint = hVar.f14843c;
            } else {
                paint = hVar.f14855q;
            }
            if (z10) {
                f13 = 255.0f;
                hVar.f14855q.setColor(i0.a.d(this.f12194v0, hVar.f14851m, hVar.f14856r));
            } else {
                f13 = 255.0f;
            }
            if (this.f12171f0) {
                hVar.f14855q.setColor(i0.a.d(1.0f, hVar.f14851m, hVar.f14856r));
            }
            paint.setAlpha((int) (f12 * f13));
            paint.setStrokeWidth(f7);
            canvas2.drawLines(hVar.f14849k, 0, hVar.f14848j, paint);
        }
        if (z10) {
            int i23 = 0;
            float f29 = f28;
            while (i23 < arrayList.size()) {
                kg.f fVar2 = (kg.f) arrayList.get(i23);
                boolean z11 = fVar2.f14852n;
                Paint paint2 = fVar2.f14843c;
                if (z11 || fVar2.f14853o != f28) {
                    long[] jArr2 = fVar2.f14841a.f14151a;
                    float[] fArr3 = ((jg.d) this.f12175h0).f14159b;
                    int i24 = this.f12191s0;
                    float f30 = (((f18 - f10) * fArr3[i24]) + (f10 / f11)) - f20;
                    float measuredHeight3 = (((float) jArr2[i24]) / this.v) * ((getMeasuredHeight() - this.f12190s) - i10) * fVar2.f14853o;
                    paint2.setStrokeWidth(f7);
                    paint2.setAlpha((int) (f12 * 255.0f));
                    canvas2.drawLine(f30, ((getMeasuredHeight() - this.f12190s) - measuredHeight3) - f29, f30, (getMeasuredHeight() - this.f12190s) - f29, paint2);
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
        jg.b bVar = this.f12175h0;
        if (bVar != null) {
            int length = ((jg.d) bVar).f14159b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((kg.f) arrayList.get(i13)).f14848j = 0;
            }
            char c11 = 1;
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.D1;
            if (jArr == null || jArr.length < size) {
                this.D1 = new long[size];
            }
            int i14 = 0;
            while (i14 < length) {
                float f12 = ((jg.d) this.f12175h0).f14159b[i14] * this.C0;
                int i15 = i12;
                while (true) {
                    f10 = 0.0f;
                    if (i15 >= size) {
                        break;
                    }
                    kg.f fVar = (kg.f) arrayList.get(i15);
                    if (fVar.f14852n || fVar.f14853o != 0.0f) {
                        long j3 = fVar.f14841a.f14151a[i14];
                        long[] jArr2 = this.D1;
                        if (j3 > jArr2[i15]) {
                            jArr2[i15] = j3;
                        }
                    }
                    i15++;
                }
                if (i14 % max == 0) {
                    int i16 = i12;
                    float f13 = 0.0f;
                    while (i16 < size) {
                        kg.f fVar2 = (kg.f) arrayList.get(i16);
                        if (!fVar2.f14852n && fVar2.f14853o == f10) {
                            i11 = length;
                            c10 = c11;
                            i10 = i14;
                        } else {
                            if (g.B1) {
                                f11 = this.f12179j0;
                            } else {
                                f11 = (float) ((jg.d) this.f12175h0).f14161e;
                            }
                            long[] jArr3 = this.D1;
                            char c12 = c11;
                            i10 = i14;
                            float f14 = (((float) jArr3[i16]) / f11) * fVar2.f14853o;
                            int i17 = this.B0;
                            float f15 = f14 * i17;
                            float[] fArr = fVar2.f14849k;
                            int i18 = fVar2.f14848j;
                            c10 = c12;
                            int i19 = i18 + 1;
                            fVar2.f14848j = i19;
                            fArr[i18] = f12;
                            int i20 = i18 + 2;
                            fVar2.f14848j = i20;
                            i11 = length;
                            fArr[i19] = (i17 - f15) - f13;
                            int i21 = i18 + 3;
                            fVar2.f14848j = i21;
                            fArr[i20] = f12;
                            fVar2.f14848j = i18 + 4;
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
            jg.b bVar2 = this.f12175h0;
            if (((jg.d) bVar2).f14159b.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = ((jg.d) bVar2).f14159b[c13] * this.C0;
            }
            for (int i22 = 0; i22 < size; i22++) {
                kg.f fVar3 = (kg.f) arrayList.get(i22);
                Paint paint = fVar3.f14843c;
                Paint paint2 = fVar3.f14843c;
                paint.setStrokeWidth(max * f7);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.f14849k, 0, fVar3.f14848j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f12159b;
        this.m0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f12184n0 = i10;
            int i11 = this.f12184n0;
            if (i11 < this.m0) {
                l(canvas, (kg.d) arrayList.get(i11));
                p(canvas, (kg.d) arrayList.get(this.f12184n0));
                i10 = this.f12184n0 + 1;
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
        return ((jg.d) this.f12175h0).f14169m.rMaxQ(i10, i11);
    }

    @Override
    public final void u() {
        super.u();
        this.f12179j0 = 0.0f;
        int length = ((jg.d) this.f12175h0).f14158a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j3 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                kg.h hVar = (kg.h) arrayList.get(i11);
                if (hVar.f14852n) {
                    j3 += hVar.f14841a.f14151a[i10];
                }
            }
            float f7 = (float) j3;
            if (f7 > this.f12179j0) {
                this.f12179j0 = f7;
            }
        }
    }

    @Override
    public final void z() {
        int length = ((jg.a) ((jg.d) this.f12175h0).d.get(0)).f14151a.length;
        int size = ((jg.d) this.f12175h0).d.size();
        ((jg.d) this.f12175h0).f14168l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((jg.d) this.f12175h0).f14168l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((kg.h) this.d.get(i11)).f14852n) {
                    jg.b bVar = this.f12175h0;
                    long[] jArr = ((jg.d) bVar).f14168l;
                    jArr[i10] = jArr[i10] + ((jg.a) ((jg.d) bVar).d.get(i11)).f14151a[i10];
                }
            }
        }
        jg.b bVar2 = this.f12175h0;
        ((jg.d) bVar2).f14169m = new SegmentTree(((jg.d) bVar2).f14168l);
        super.z();
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
