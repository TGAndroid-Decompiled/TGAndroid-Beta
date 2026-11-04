package mg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.uc;
import java.util.ArrayList;
import org.telegram.messenger.g0;
public final class n extends q {
    public float[] J1;
    public float[] K1;
    public float L1;
    public boolean M1;
    public int N1;
    public RectF O1;
    public TextPaint P1;
    public float Q1;
    public float R1;
    public String[] S1;
    public og.g T1;
    public float U1;
    public int V1;
    public int W1;
    public int X1;

    @Override
    public final void A(boolean z10, boolean z11, boolean z12) {
        super.A(z10, z11, z12);
        ng.b bVar = this.f19346i0;
        if (bVar != null && ((ng.e) bVar).f20374b != null) {
            j jVar = this.f19344h0;
            N(jVar.f19385k, jVar.f19386l, z11);
        }
    }

    @Override
    public final void C(int i3, int i10) {
        ArrayList arrayList;
        double d;
        double d10;
        RectF rectF = this.O1;
        if (this.f19346i0 != null && !this.M1) {
            RectF rectF2 = this.I0;
            float degrees = (float) (Math.toDegrees(Math.atan2((rectF2.centerY() + g0.L(16.0f)) - i10, rectF2.centerX() - i3)) - 90.0d);
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
                    if (((o) arrayList.get(i12)).f21096n || ((o) arrayList.get(i12)).f21097o != 0.0f) {
                        if (f11 > f12) {
                            float f13 = this.K1[i12] + f12;
                            if (f11 < f13) {
                                f10 = f13;
                                break;
                            }
                        }
                        f12 += this.K1[i12];
                    }
                    i12++;
                } else {
                    i12 = -1;
                    f12 = 0.0f;
                    break;
                }
            }
            if (this.N1 != i12 && i12 >= 0) {
                this.N1 = i12;
                invalidate();
                this.T1.setVisibility(0);
                og.f fVar = (og.f) arrayList.get(i12);
                og.g gVar = this.T1;
                String str = fVar.f21085a.d;
                int i13 = fVar.f21095m;
                gVar.N.setText(str);
                TextView textView = gVar.O;
                textView.setText(Integer.toString((int) this.J1[this.N1]));
                textView.setTextColor(i13);
                this.T1.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                double width = rectF.width() / 2.0f;
                int min = (int) Math.min(rectF.centerX() + (Math.cos(Math.toRadians((f10 * 360.0f) - 90.0f)) * width), rectF.centerX() + (Math.cos(Math.toRadians((f12 * 360.0f) - 90.0f)) * width));
                if (min >= 0) {
                    i11 = min;
                }
                if (this.T1.getMeasuredWidth() + i11 > getMeasuredWidth() - g0.L(16.0f)) {
                    i11 -= (this.T1.getMeasuredWidth() + i11) - (getMeasuredWidth() - g0.L(16.0f));
                }
                int min2 = ((int) Math.min(rectF.centerY(), (int) Math.min((Math.sin(Math.toRadians(d10)) * width) + rectF.centerY(), (Math.sin(Math.toRadians(d)) * width) + rectF.centerY()))) - g0.L(50.0f);
                this.T1.setTranslationX(i11);
                this.T1.setTranslationY(min2);
                g0.c4(this);
            }
            x((this.H0 * this.f19344h0.f19385k) - g.f19311l1);
        }
    }

    @Override
    public final boolean D(ng.b bVar) {
        ng.e eVar = (ng.e) bVar;
        boolean D = super.D(eVar);
        if (eVar != null) {
            this.J1 = new float[eVar.d.size()];
            this.K1 = new float[eVar.d.size()];
            A(false, true, false);
        }
        return D;
    }

    @Override
    public final void J(ng.b bVar, long j10) {
        float length;
        int length2 = bVar.f20373a.length;
        long j11 = j10 - (j10 % 86400000);
        int i3 = 0;
        for (int i10 = 0; i10 < length2; i10++) {
            if (j11 >= bVar.f20373a[i10]) {
                i3 = i10;
            }
        }
        if (bVar.f20374b.length < 2) {
            length = 0.5f;
        } else {
            length = 1.0f / bVar.f20373a.length;
        }
        j jVar = this.f19344h0;
        if (i3 == 0) {
            jVar.f19385k = 0.0f;
            jVar.f19386l = length;
        } else if (i3 >= bVar.f20373a.length - 1) {
            jVar.f19385k = 1.0f - length;
            jVar.f19386l = 1.0f;
        } else {
            float f10 = i3 * length;
            jVar.f19385k = f10;
            float f11 = f10 + length;
            jVar.f19386l = f11;
            if (f11 > 1.0f) {
                jVar.f19386l = 1.0f;
            }
            A(true, true, false);
        }
    }

    @Override
    public final og.i L(ng.a aVar) {
        return new og.i(aVar);
    }

    public final void N(float f10, float f11, boolean z10) {
        float f12;
        if (this.J1 != null) {
            int length = ((ng.e) this.f19346i0).f20374b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i3 = 0;
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < length; i12++) {
                float f13 = ((ng.e) this.f19346i0).f20374b[i12];
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
            if (z10 || this.X1 != i10 || this.W1 != i11) {
                this.X1 = i10;
                this.W1 = i11;
                this.M1 = true;
                this.L1 = 0.0f;
                for (int i13 = 0; i13 < size; i13++) {
                    this.J1[i13] = 0.0f;
                }
                while (i11 <= i10) {
                    for (int i14 = 0; i14 < size; i14++) {
                        float[] fArr = this.J1;
                        fArr[i14] = fArr[i14] + ((float) ((ng.a) ((ng.e) this.f19346i0).d.get(i14)).f20366a[i11]);
                        this.L1 += (float) ((ng.a) ((ng.e) this.f19346i0).d.get(i14)).f20366a[i11];
                        if (this.M1 && ((o) arrayList.get(i14)).f21096n && ((ng.a) ((ng.e) this.f19346i0).d.get(i14)).f20366a[i11] > 0) {
                            this.M1 = false;
                        }
                    }
                    i11++;
                }
                if (!z10) {
                    while (i3 < size) {
                        o oVar = (o) arrayList.get(i3);
                        ValueAnimator valueAnimator = oVar.f19391s;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float f14 = this.L1;
                        if (f14 == 0.0f) {
                            f12 = 0.0f;
                        } else {
                            f12 = this.J1[i3] / f14;
                        }
                        ValueAnimator e10 = g.e(oVar.f19390r, f12, new uc(7, this, oVar));
                        oVar.f19391s = e10;
                        e10.start();
                        i3++;
                    }
                    return;
                }
                while (i3 < size) {
                    if (this.L1 == 0.0f) {
                        ((o) arrayList.get(i3)).f19390r = 0.0f;
                    } else {
                        ((o) arrayList.get(i3)).f19390r = this.J1[i3] / this.L1;
                    }
                    i3++;
                }
            }
        }
    }

    @Override
    public final void a(float f10, float f11, boolean z10) {
        if (this.f19346i0 == null) {
            return;
        }
        if (z10) {
            N(f10, f11, false);
            return;
        }
        H();
        invalidate();
    }

    @Override
    public final og.e g() {
        ?? eVar = new og.e(getContext(), null);
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        linearLayout.setPadding(g0.L(4.0f), g0.L(2.0f), g0.L(4.0f), g0.L(2.0f));
        TextView textView = new TextView(eVar.getContext());
        eVar.N = textView;
        linearLayout.addView(textView);
        textView.getLayoutParams().width = g0.L(96.0f);
        TextView textView2 = new TextView(eVar.getContext());
        eVar.O = textView2;
        linearLayout.addView(textView2);
        eVar.addView(linearLayout);
        textView2.setTypeface(Typeface.create("sans-serif-medium", 0));
        eVar.setPadding(g0.L(12.0f), g0.L(12.0f), g0.L(12.0f), g0.L(12.0f));
        eVar.f21078f.setVisibility(8);
        eVar.G = false;
        this.T1 = eVar;
        return eVar;
    }

    @Override
    public final og.f h(ng.a aVar) {
        return new og.i(aVar);
    }

    @Override
    public final void k(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: mg.n.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        int i3;
        n nVar = this;
        ng.b bVar = nVar.f19346i0;
        if (bVar != null) {
            int length = ((ng.e) bVar).f20374b.length;
            ArrayList arrayList = nVar.d;
            int size = arrayList.size();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((og.f) arrayList.get(i11)).f21092j = 0;
            }
            float length2 = (1.0f / ((ng.e) nVar.f19346i0).f20374b.length) * nVar.D0;
            int i12 = 0;
            while (i12 < length) {
                float y9 = com.google.android.recaptcha.internal.a.y(nVar.D0, length2, ((ng.e) nVar.f19346i0).f20374b[i12], length2 / 2.0f);
                int i13 = 1;
                int i14 = i10;
                int i15 = i14;
                boolean z10 = true;
                float f13 = 0.0f;
                while (i14 < size) {
                    og.f fVar = (og.f) arrayList.get(i14);
                    boolean z11 = fVar.f21096n;
                    if (!z11 && fVar.f21097o == 0.0f) {
                        i3 = i12;
                    } else {
                        i3 = i12;
                        float f14 = ((float) fVar.f21085a.f20366a[i3]) * fVar.f21097o;
                        f13 += f14;
                        if (f14 > 0.0f) {
                            i15++;
                            if (z11) {
                                z10 = false;
                            }
                        }
                    }
                    i14++;
                    i12 = i3;
                }
                int i16 = i12;
                float f15 = 0.0f;
                int i17 = 0;
                while (i17 < size) {
                    og.f fVar2 = (og.f) arrayList.get(i17);
                    if (fVar2.f21096n || fVar2.f21097o != 0.0f) {
                        long[] jArr = fVar2.f21085a.f20366a;
                        if (i15 == i13) {
                            if (jArr[i16] != 0) {
                                f12 = fVar2.f21097o;
                                int i18 = nVar.C0;
                                float f16 = f12 * i18;
                                float[] fArr = fVar2.f21093k;
                                int i19 = fVar2.f21092j;
                                int i20 = i19 + 1;
                                fVar2.f21092j = i20;
                                fArr[i19] = y9;
                                int i21 = i19 + 2;
                                fVar2.f21092j = i21;
                                fArr[i20] = (i18 - f16) - f15;
                                int i22 = i19 + 3;
                                fVar2.f21092j = i22;
                                fArr[i21] = y9;
                                fVar2.f21092j = i19 + 4;
                                fArr[i22] = i18 - f15;
                                f15 += f16;
                            }
                            f12 = 0.0f;
                            int i182 = nVar.C0;
                            float f162 = f12 * i182;
                            float[] fArr2 = fVar2.f21093k;
                            int i192 = fVar2.f21092j;
                            int i202 = i192 + 1;
                            fVar2.f21092j = i202;
                            fArr2[i192] = y9;
                            int i212 = i192 + 2;
                            fVar2.f21092j = i212;
                            fArr2[i202] = (i182 - f162) - f15;
                            int i222 = i192 + 3;
                            fVar2.f21092j = i222;
                            fArr2[i212] = y9;
                            fVar2.f21092j = i192 + 4;
                            fArr2[i222] = i182 - f15;
                            f15 += f162;
                        } else {
                            if (f13 != 0.0f) {
                                if (z10) {
                                    f11 = fVar2.f21097o;
                                    f10 = (((float) jArr[i16]) / f13) * f11;
                                } else {
                                    f10 = ((float) jArr[i16]) / f13;
                                    f11 = fVar2.f21097o;
                                }
                                f12 = f10 * f11;
                                int i1822 = nVar.C0;
                                float f1622 = f12 * i1822;
                                float[] fArr22 = fVar2.f21093k;
                                int i1922 = fVar2.f21092j;
                                int i2022 = i1922 + 1;
                                fVar2.f21092j = i2022;
                                fArr22[i1922] = y9;
                                int i2122 = i1922 + 2;
                                fVar2.f21092j = i2122;
                                fArr22[i2022] = (i1822 - f1622) - f15;
                                int i2222 = i1922 + 3;
                                fVar2.f21092j = i2222;
                                fArr22[i2122] = y9;
                                fVar2.f21092j = i1922 + 4;
                                fArr22[i2222] = i1822 - f15;
                                f15 += f1622;
                            }
                            f12 = 0.0f;
                            int i18222 = nVar.C0;
                            float f16222 = f12 * i18222;
                            float[] fArr222 = fVar2.f21093k;
                            int i19222 = fVar2.f21092j;
                            int i20222 = i19222 + 1;
                            fVar2.f21092j = i20222;
                            fArr222[i19222] = y9;
                            int i21222 = i19222 + 2;
                            fVar2.f21092j = i21222;
                            fArr222[i20222] = (i18222 - f16222) - f15;
                            int i22222 = i19222 + 3;
                            fVar2.f21092j = i22222;
                            fArr222[i21222] = y9;
                            fVar2.f21092j = i19222 + 4;
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
                og.f fVar3 = (og.f) arrayList.get(i23);
                Paint paint = fVar3.f21087c;
                Paint paint2 = fVar3.f21087c;
                paint.setStrokeWidth(length2);
                paint2.setAlpha(255);
                paint2.setAntiAlias(false);
                canvas.drawLines(fVar3.f21093k, 0, fVar3.f21092j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f19346i0 != null) {
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i3 >= arrayList.size()) {
                    break;
                }
                if (i3 == this.N1) {
                    if (((o) arrayList.get(i3)).f19389q < 1.0f) {
                        ((o) arrayList.get(i3)).f19389q += 0.1f;
                        if (((o) arrayList.get(i3)).f19389q > 1.0f) {
                            ((o) arrayList.get(i3)).f19389q = 1.0f;
                        }
                        invalidate();
                    }
                } else if (((o) arrayList.get(i3)).f19389q > 0.0f) {
                    ((o) arrayList.get(i3)).f19389q -= 0.1f;
                    if (((o) arrayList.get(i3)).f19389q < 0.0f) {
                        ((o) arrayList.get(i3)).f19389q = 0.0f;
                    }
                    invalidate();
                }
                i3++;
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float width;
        super.onMeasure(i3, i10);
        if (getMeasuredWidth() != this.V1) {
            this.V1 = getMeasuredWidth();
            RectF rectF = this.I0;
            if (rectF.width() > rectF.height()) {
                width = rectF.height();
            } else {
                width = rectF.width();
            }
            int i11 = (int) (width * 0.45f);
            this.Q1 = i11 / 13;
            this.R1 = i11 / 7;
        }
    }

    @Override
    public final void q(og.j jVar) {
        k(null);
        float f10 = 0.0f;
        int i3 = 0;
        while (true) {
            float[] fArr = this.K1;
            if (i3 < fArr.length) {
                f10 += fArr[i3];
                jVar.f21110k[i3] = (360.0f * f10) - 180.0f;
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void y() {
        this.N1 = -1;
        this.T1.setVisibility(8);
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
    public final void l(Canvas canvas, og.d dVar) {
    }

    @Override
    public final void p(Canvas canvas, og.d dVar) {
    }
}
