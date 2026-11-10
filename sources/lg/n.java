package lg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.de;
import java.util.ArrayList;
import org.telegram.messenger.g0;
public final class n extends q {
    public float[] I1;
    public float[] J1;
    public float K1;
    public boolean L1;
    public int M1;
    public RectF N1;
    public TextPaint O1;
    public float P1;
    public float Q1;
    public String[] R1;
    public ng.g S1;
    public float T1;
    public int U1;
    public int V1;
    public int W1;

    @Override
    public final void A(boolean z9, boolean z10, boolean z11) {
        super.A(z9, z10, z11);
        mg.b bVar = this.f18308h0;
        if (bVar != null && ((mg.e) bVar).f20029b != null) {
            j jVar = this.f18306g0;
            N(jVar.f18349k, jVar.f18350l, z10);
        }
    }

    @Override
    public final void C(int i7, int i10) {
        ArrayList arrayList;
        double d;
        double d2;
        RectF rectF = this.N1;
        if (this.f18308h0 != null && !this.L1) {
            RectF rectF2 = this.H0;
            float degrees = (float) (Math.toDegrees(Math.atan2((rectF2.centerY() + g0.L(16.0f)) - i10, rectF2.centerX() - i7)) - 90.0d);
            float f10 = 0.0f;
            if (degrees < 0.0f) {
                degrees = (float) (degrees + 360.0d);
            }
            float f11 = degrees / 360.0f;
            int i11 = 0;
            float f12 = 0.0f;
            int i12 = 0;
            while (true) {
                arrayList = this.d;
                if (i12 < arrayList.size()) {
                    if (((o) arrayList.get(i12)).f20584n || ((o) arrayList.get(i12)).f20585o != 0.0f) {
                        if (f11 > f12) {
                            float f13 = this.J1[i12] + f12;
                            if (f11 < f13) {
                                f10 = f13;
                                break;
                            }
                        }
                        f12 += this.J1[i12];
                    }
                    i12++;
                } else {
                    i12 = -1;
                    f12 = 0.0f;
                    break;
                }
            }
            if (this.M1 != i12 && i12 >= 0) {
                this.M1 = i12;
                invalidate();
                this.S1.setVisibility(0);
                ng.f fVar = (ng.f) arrayList.get(i12);
                ng.g gVar = this.S1;
                String str = fVar.f20573a.d;
                int i13 = fVar.f20583m;
                gVar.M.setText(str);
                TextView textView = gVar.N;
                textView.setText(Integer.toString((int) this.I1[this.M1]));
                textView.setTextColor(i13);
                this.S1.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                double width = rectF.width() / 2.0f;
                int min = (int) Math.min(rectF.centerX() + (Math.cos(Math.toRadians((f10 * 360.0f) - 90.0f)) * width), rectF.centerX() + (Math.cos(Math.toRadians((f12 * 360.0f) - 90.0f)) * width));
                if (min >= 0) {
                    i11 = min;
                }
                if (this.S1.getMeasuredWidth() + i11 > getMeasuredWidth() - g0.L(16.0f)) {
                    i11 -= (this.S1.getMeasuredWidth() + i11) - (getMeasuredWidth() - g0.L(16.0f));
                }
                int min2 = ((int) Math.min(rectF.centerY(), (int) Math.min((Math.sin(Math.toRadians(d2)) * width) + rectF.centerY(), (Math.sin(Math.toRadians(d)) * width) + rectF.centerY()))) - g0.L(50.0f);
                this.S1.setTranslationX(i11);
                this.S1.setTranslationY(min2);
                g0.c4(this);
            }
            x((this.G0 * this.f18306g0.f18349k) - g.f18275k1);
        }
    }

    @Override
    public final boolean D(mg.b bVar) {
        mg.e eVar = (mg.e) bVar;
        boolean D = super.D(eVar);
        if (eVar != null) {
            this.I1 = new float[eVar.d.size()];
            this.J1 = new float[eVar.d.size()];
            A(false, true, false);
        }
        return D;
    }

    @Override
    public final void J(mg.b bVar, long j3) {
        float length;
        int length2 = bVar.f20028a.length;
        long j10 = j3 - (j3 % 86400000);
        int i7 = 0;
        for (int i10 = 0; i10 < length2; i10++) {
            if (j10 >= bVar.f20028a[i10]) {
                i7 = i10;
            }
        }
        if (bVar.f20029b.length < 2) {
            length = 0.5f;
        } else {
            length = 1.0f / bVar.f20028a.length;
        }
        j jVar = this.f18306g0;
        if (i7 == 0) {
            jVar.f18349k = 0.0f;
            jVar.f18350l = length;
        } else if (i7 >= bVar.f20028a.length - 1) {
            jVar.f18349k = 1.0f - length;
            jVar.f18350l = 1.0f;
        } else {
            float f10 = i7 * length;
            jVar.f18349k = f10;
            float f11 = f10 + length;
            jVar.f18350l = f11;
            if (f11 > 1.0f) {
                jVar.f18350l = 1.0f;
            }
            A(true, true, false);
        }
    }

    @Override
    public final ng.i L(mg.a aVar) {
        return new ng.i(aVar);
    }

    public final void N(float f10, float f11, boolean z9) {
        float f12;
        if (this.I1 != null) {
            int length = ((mg.e) this.f18308h0).f20029b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i7 = 0;
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < length; i12++) {
                float f13 = ((mg.e) this.f18308h0).f20029b[i12];
                if (f13 >= f10 && i11 == -1) {
                    i11 = i12;
                }
                if (f13 <= f11) {
                    i10 = i12;
                }
            }
            if (i10 < i11) {
                i11 = i10;
            }
            if (z9 || this.W1 != i10 || this.V1 != i11) {
                this.W1 = i10;
                this.V1 = i11;
                this.L1 = true;
                this.K1 = 0.0f;
                for (int i13 = 0; i13 < size; i13++) {
                    this.I1[i13] = 0.0f;
                }
                while (i11 <= i10) {
                    for (int i14 = 0; i14 < size; i14++) {
                        float[] fArr = this.I1;
                        fArr[i14] = fArr[i14] + ((float) ((mg.a) ((mg.e) this.f18308h0).d.get(i14)).f20021a[i11]);
                        this.K1 += (float) ((mg.a) ((mg.e) this.f18308h0).d.get(i14)).f20021a[i11];
                        if (this.L1 && ((o) arrayList.get(i14)).f20584n && ((mg.a) ((mg.e) this.f18308h0).d.get(i14)).f20021a[i11] > 0) {
                            this.L1 = false;
                        }
                    }
                    i11++;
                }
                if (!z9) {
                    while (i7 < size) {
                        o oVar = (o) arrayList.get(i7);
                        ValueAnimator valueAnimator = oVar.f18355s;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float f14 = this.K1;
                        if (f14 == 0.0f) {
                            f12 = 0.0f;
                        } else {
                            f12 = this.I1[i7] / f14;
                        }
                        ValueAnimator e10 = g.e(oVar.f18354r, f12, new de(7, this, oVar));
                        oVar.f18355s = e10;
                        e10.start();
                        i7++;
                    }
                    return;
                }
                while (i7 < size) {
                    if (this.K1 == 0.0f) {
                        ((o) arrayList.get(i7)).f18354r = 0.0f;
                    } else {
                        ((o) arrayList.get(i7)).f18354r = this.I1[i7] / this.K1;
                    }
                    i7++;
                }
            }
        }
    }

    @Override
    public final void a(float f10, float f11, boolean z9) {
        if (this.f18308h0 == null) {
            return;
        }
        if (z9) {
            N(f10, f11, false);
            return;
        }
        H();
        invalidate();
    }

    @Override
    public final ng.e g() {
        ?? eVar = new ng.e(getContext(), null);
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        linearLayout.setPadding(g0.L(4.0f), g0.L(2.0f), g0.L(4.0f), g0.L(2.0f));
        TextView textView = new TextView(eVar.getContext());
        eVar.M = textView;
        linearLayout.addView(textView);
        textView.getLayoutParams().width = g0.L(96.0f);
        TextView textView2 = new TextView(eVar.getContext());
        eVar.N = textView2;
        linearLayout.addView(textView2);
        eVar.addView(linearLayout);
        textView2.setTypeface(Typeface.create("sans-serif-medium", 0));
        eVar.setPadding(g0.L(12.0f), g0.L(12.0f), g0.L(12.0f), g0.L(12.0f));
        eVar.f20566f.setVisibility(8);
        eVar.F = false;
        this.S1 = eVar;
        return eVar;
    }

    @Override
    public final ng.f h(mg.a aVar) {
        return new ng.i(aVar);
    }

    @Override
    public final void k(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: lg.n.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        int i7;
        n nVar = this;
        mg.b bVar = nVar.f18308h0;
        if (bVar != null) {
            int length = ((mg.e) bVar).f20029b.length;
            ArrayList arrayList = nVar.d;
            int size = arrayList.size();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((ng.f) arrayList.get(i11)).f20580j = 0;
            }
            float length2 = (1.0f / ((mg.e) nVar.f18308h0).f20029b.length) * nVar.C0;
            int i12 = 0;
            while (i12 < length) {
                float z9 = com.google.android.recaptcha.internal.a.z(nVar.C0, length2, ((mg.e) nVar.f18308h0).f20029b[i12], length2 / 2.0f);
                int i13 = 1;
                int i14 = i10;
                int i15 = i14;
                boolean z10 = true;
                float f13 = 0.0f;
                while (i14 < size) {
                    ng.f fVar = (ng.f) arrayList.get(i14);
                    boolean z11 = fVar.f20584n;
                    if (!z11 && fVar.f20585o == 0.0f) {
                        i7 = i12;
                    } else {
                        i7 = i12;
                        float f14 = ((float) fVar.f20573a.f20021a[i7]) * fVar.f20585o;
                        f13 += f14;
                        if (f14 > 0.0f) {
                            i15++;
                            if (z11) {
                                z10 = false;
                            }
                        }
                    }
                    i14++;
                    i12 = i7;
                }
                int i16 = i12;
                float f15 = 0.0f;
                int i17 = 0;
                while (i17 < size) {
                    ng.f fVar2 = (ng.f) arrayList.get(i17);
                    if (fVar2.f20584n || fVar2.f20585o != 0.0f) {
                        long[] jArr = fVar2.f20573a.f20021a;
                        if (i15 == i13) {
                            if (jArr[i16] != 0) {
                                f12 = fVar2.f20585o;
                                int i18 = nVar.B0;
                                float f16 = f12 * i18;
                                float[] fArr = fVar2.f20581k;
                                int i19 = fVar2.f20580j;
                                int i20 = i19 + 1;
                                fVar2.f20580j = i20;
                                fArr[i19] = z9;
                                int i21 = i19 + 2;
                                fVar2.f20580j = i21;
                                fArr[i20] = (i18 - f16) - f15;
                                int i22 = i19 + 3;
                                fVar2.f20580j = i22;
                                fArr[i21] = z9;
                                fVar2.f20580j = i19 + 4;
                                fArr[i22] = i18 - f15;
                                f15 += f16;
                            }
                            f12 = 0.0f;
                            int i182 = nVar.B0;
                            float f162 = f12 * i182;
                            float[] fArr2 = fVar2.f20581k;
                            int i192 = fVar2.f20580j;
                            int i202 = i192 + 1;
                            fVar2.f20580j = i202;
                            fArr2[i192] = z9;
                            int i212 = i192 + 2;
                            fVar2.f20580j = i212;
                            fArr2[i202] = (i182 - f162) - f15;
                            int i222 = i192 + 3;
                            fVar2.f20580j = i222;
                            fArr2[i212] = z9;
                            fVar2.f20580j = i192 + 4;
                            fArr2[i222] = i182 - f15;
                            f15 += f162;
                        } else {
                            if (f13 != 0.0f) {
                                if (z10) {
                                    f11 = fVar2.f20585o;
                                    f10 = (((float) jArr[i16]) / f13) * f11;
                                } else {
                                    f10 = ((float) jArr[i16]) / f13;
                                    f11 = fVar2.f20585o;
                                }
                                f12 = f10 * f11;
                                int i1822 = nVar.B0;
                                float f1622 = f12 * i1822;
                                float[] fArr22 = fVar2.f20581k;
                                int i1922 = fVar2.f20580j;
                                int i2022 = i1922 + 1;
                                fVar2.f20580j = i2022;
                                fArr22[i1922] = z9;
                                int i2122 = i1922 + 2;
                                fVar2.f20580j = i2122;
                                fArr22[i2022] = (i1822 - f1622) - f15;
                                int i2222 = i1922 + 3;
                                fVar2.f20580j = i2222;
                                fArr22[i2122] = z9;
                                fVar2.f20580j = i1922 + 4;
                                fArr22[i2222] = i1822 - f15;
                                f15 += f1622;
                            }
                            f12 = 0.0f;
                            int i18222 = nVar.B0;
                            float f16222 = f12 * i18222;
                            float[] fArr222 = fVar2.f20581k;
                            int i19222 = fVar2.f20580j;
                            int i20222 = i19222 + 1;
                            fVar2.f20580j = i20222;
                            fArr222[i19222] = z9;
                            int i21222 = i19222 + 2;
                            fVar2.f20580j = i21222;
                            fArr222[i20222] = (i18222 - f16222) - f15;
                            int i22222 = i19222 + 3;
                            fVar2.f20580j = i22222;
                            fArr222[i21222] = z9;
                            fVar2.f20580j = i19222 + 4;
                            fArr222[i22222] = i18222 - f15;
                            f15 += f16222;
                        }
                    }
                    i17++;
                    i13 = 1;
                    nVar = this;
                }
                i12 = i16 + 1;
                nVar = this;
                i10 = 0;
            }
            for (int i23 = 0; i23 < size; i23++) {
                ng.f fVar3 = (ng.f) arrayList.get(i23);
                Paint paint = fVar3.f20575c;
                Paint paint2 = fVar3.f20575c;
                paint.setStrokeWidth(length2);
                paint2.setAlpha(255);
                paint2.setAntiAlias(false);
                canvas.drawLines(fVar3.f20581k, 0, fVar3.f20580j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f18308h0 != null) {
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i7 >= arrayList.size()) {
                    break;
                }
                if (i7 == this.M1) {
                    if (((o) arrayList.get(i7)).f18353q < 1.0f) {
                        ((o) arrayList.get(i7)).f18353q += 0.1f;
                        if (((o) arrayList.get(i7)).f18353q > 1.0f) {
                            ((o) arrayList.get(i7)).f18353q = 1.0f;
                        }
                        invalidate();
                    }
                } else if (((o) arrayList.get(i7)).f18353q > 0.0f) {
                    ((o) arrayList.get(i7)).f18353q -= 0.1f;
                    if (((o) arrayList.get(i7)).f18353q < 0.0f) {
                        ((o) arrayList.get(i7)).f18353q = 0.0f;
                    }
                    invalidate();
                }
                i7++;
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float width;
        super.onMeasure(i7, i10);
        if (getMeasuredWidth() != this.U1) {
            this.U1 = getMeasuredWidth();
            RectF rectF = this.H0;
            if (rectF.width() > rectF.height()) {
                width = rectF.height();
            } else {
                width = rectF.width();
            }
            int i11 = (int) (width * 0.45f);
            this.P1 = i11 / 13;
            this.Q1 = i11 / 7;
        }
    }

    @Override
    public final void q(ng.j jVar) {
        k(null);
        float f10 = 0.0f;
        int i7 = 0;
        while (true) {
            float[] fArr = this.J1;
            if (i7 < fArr.length) {
                f10 += fArr[i7];
                jVar.f20598k[i7] = (360.0f * f10) - 180.0f;
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void y() {
        this.M1 = -1;
        this.S1.setVisibility(8);
        invalidate();
    }

    @Override
    public final void i(Canvas canvas) {
    }

    @Override
    public final void j(Canvas canvas) {
    }

    @Override
    public final void o(Canvas canvas) {
    }

    @Override
    public final void l(Canvas canvas, ng.d dVar) {
    }

    @Override
    public final void p(Canvas canvas, ng.d dVar) {
    }
}
