package kg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bh.b0;
import c3.h0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class o extends r {
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
    public mg.g S1;
    public float T1;
    public int U1;
    public int V1;
    public int W1;

    @Override
    public final void A(boolean z10, boolean z11, boolean z12) {
        super.A(z10, z11, z12);
        lg.b bVar = this.f16601h0;
        if (bVar != null && ((lg.e) bVar).f17012b != null) {
            k kVar = this.f16599g0;
            N(kVar.f16640k, kVar.f16641l, z11);
        }
    }

    @Override
    public final void C(int i10, int i11) {
        ArrayList arrayList;
        double d;
        double d10;
        RectF rectF = this.N1;
        if (this.f16601h0 != null && !this.L1) {
            RectF rectF2 = this.H0;
            float degrees = (float) (Math.toDegrees(Math.atan2((rectF2.centerY() + AndroidUtilities.dp(16.0f)) - i11, rectF2.centerX() - i10)) - 90.0d);
            float f7 = 0.0f;
            if (degrees < 0.0f) {
                degrees = (float) (degrees + 360.0d);
            }
            float f10 = degrees / 360.0f;
            int i12 = 0;
            float f11 = 0.0f;
            int i13 = 0;
            while (true) {
                arrayList = this.d;
                if (i13 < arrayList.size()) {
                    if (((p) arrayList.get(i13)).f18475n || ((p) arrayList.get(i13)).f18476o != 0.0f) {
                        if (f10 > f11) {
                            float f12 = this.J1[i13] + f11;
                            if (f10 < f12) {
                                f7 = f12;
                                break;
                            }
                        }
                        f11 += this.J1[i13];
                    }
                    i13++;
                } else {
                    i13 = -1;
                    f11 = 0.0f;
                    break;
                }
            }
            if (this.M1 != i13 && i13 >= 0) {
                this.M1 = i13;
                invalidate();
                this.S1.setVisibility(0);
                mg.f fVar = (mg.f) arrayList.get(i13);
                mg.g gVar = this.S1;
                String str = fVar.f18465a.d;
                int i14 = fVar.f18474m;
                gVar.M.setText(str);
                TextView textView = gVar.N;
                textView.setText(Integer.toString((int) this.I1[this.M1]));
                textView.setTextColor(i14);
                this.S1.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                double width = rectF.width() / 2.0f;
                int min = (int) Math.min(rectF.centerX() + (Math.cos(Math.toRadians((f7 * 360.0f) - 90.0f)) * width), rectF.centerX() + (Math.cos(Math.toRadians((f11 * 360.0f) - 90.0f)) * width));
                if (min >= 0) {
                    i12 = min;
                }
                if (this.S1.getMeasuredWidth() + i12 > getMeasuredWidth() - AndroidUtilities.dp(16.0f)) {
                    i12 -= (this.S1.getMeasuredWidth() + i12) - (getMeasuredWidth() - AndroidUtilities.dp(16.0f));
                }
                int min2 = ((int) Math.min(rectF.centerY(), (int) Math.min((Math.sin(Math.toRadians(d10)) * width) + rectF.centerY(), (Math.sin(Math.toRadians(d)) * width) + rectF.centerY()))) - AndroidUtilities.dp(50.0f);
                this.S1.setTranslationX(i12);
                this.S1.setTranslationY(min2);
                AndroidUtilities.vibrateCursor(this);
            }
            x((this.G0 * this.f16599g0.f16640k) - h.f16568k1);
        }
    }

    @Override
    public final boolean D(lg.b bVar) {
        lg.e eVar = (lg.e) bVar;
        boolean D = super.D(eVar);
        if (eVar != null) {
            this.I1 = new float[eVar.d.size()];
            this.J1 = new float[eVar.d.size()];
            A(false, true, false);
        }
        return D;
    }

    @Override
    public final void J(lg.b bVar, long j10) {
        float length;
        int length2 = bVar.f17011a.length;
        long j11 = j10 - (j10 % 86400000);
        int i10 = 0;
        for (int i11 = 0; i11 < length2; i11++) {
            if (j11 >= bVar.f17011a[i11]) {
                i10 = i11;
            }
        }
        if (bVar.f17012b.length < 2) {
            length = 0.5f;
        } else {
            length = 1.0f / bVar.f17011a.length;
        }
        k kVar = this.f16599g0;
        if (i10 == 0) {
            kVar.f16640k = 0.0f;
            kVar.f16641l = length;
        } else if (i10 >= bVar.f17011a.length - 1) {
            kVar.f16640k = 1.0f - length;
            kVar.f16641l = 1.0f;
        } else {
            float f7 = i10 * length;
            kVar.f16640k = f7;
            float f10 = f7 + length;
            kVar.f16641l = f10;
            if (f10 > 1.0f) {
                kVar.f16641l = 1.0f;
            }
            A(true, true, false);
        }
    }

    @Override
    public final mg.i L(lg.a aVar) {
        return new mg.i(aVar);
    }

    public final void N(float f7, float f10, boolean z10) {
        float f11;
        if (this.I1 != null) {
            int length = ((lg.e) this.f16601h0).f17012b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            for (int i13 = 0; i13 < length; i13++) {
                float f12 = ((lg.e) this.f16601h0).f17012b[i13];
                if (f12 >= f7 && i12 == -1) {
                    i12 = i13;
                }
                if (f12 <= f10) {
                    i11 = i13;
                }
            }
            if (i11 < i12) {
                i12 = i11;
            }
            if (z10 || this.W1 != i11 || this.V1 != i12) {
                this.W1 = i11;
                this.V1 = i12;
                this.L1 = true;
                this.K1 = 0.0f;
                for (int i14 = 0; i14 < size; i14++) {
                    this.I1[i14] = 0.0f;
                }
                while (i12 <= i11) {
                    for (int i15 = 0; i15 < size; i15++) {
                        float[] fArr = this.I1;
                        fArr[i15] = fArr[i15] + ((float) ((lg.a) ((lg.e) this.f16601h0).d.get(i15)).f17005a[i12]);
                        this.K1 += (float) ((lg.a) ((lg.e) this.f16601h0).d.get(i15)).f17005a[i12];
                        if (this.L1 && ((p) arrayList.get(i15)).f18475n && ((lg.a) ((lg.e) this.f16601h0).d.get(i15)).f17005a[i12] > 0) {
                            this.L1 = false;
                        }
                    }
                    i12++;
                }
                if (!z10) {
                    while (i10 < size) {
                        p pVar = (p) arrayList.get(i10);
                        ValueAnimator valueAnimator = pVar.f16646s;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float f13 = this.K1;
                        if (f13 == 0.0f) {
                            f11 = 0.0f;
                        } else {
                            f11 = this.I1[i10] / f13;
                        }
                        ValueAnimator e = h.e(pVar.f16645r, f11, new b0(7, this, pVar));
                        pVar.f16646s = e;
                        e.start();
                        i10++;
                    }
                    return;
                }
                while (i10 < size) {
                    if (this.K1 == 0.0f) {
                        ((p) arrayList.get(i10)).f16645r = 0.0f;
                    } else {
                        ((p) arrayList.get(i10)).f16645r = this.I1[i10] / this.K1;
                    }
                    i10++;
                }
            }
        }
    }

    @Override
    public final void a(float f7, float f10, boolean z10) {
        if (this.f16601h0 == null) {
            return;
        }
        if (z10) {
            N(f7, f10, false);
            return;
        }
        H();
        invalidate();
    }

    @Override
    public final mg.e g() {
        ?? eVar = new mg.e(getContext(), null);
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(eVar.getContext());
        eVar.M = textView;
        linearLayout.addView(textView);
        textView.getLayoutParams().width = AndroidUtilities.dp(96.0f);
        TextView textView2 = new TextView(eVar.getContext());
        eVar.N = textView2;
        linearLayout.addView(textView2);
        eVar.addView(linearLayout);
        textView2.setTypeface(Typeface.create("sans-serif-medium", 0));
        eVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        eVar.f18458f.setVisibility(8);
        eVar.F = false;
        this.S1 = eVar;
        return eVar;
    }

    @Override
    public final mg.f h(lg.a aVar) {
        return new mg.i(aVar);
    }

    @Override
    public final void k(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: kg.o.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        int i10;
        o oVar = this;
        lg.b bVar = oVar.f16601h0;
        if (bVar != null) {
            int length = ((lg.e) bVar).f17012b.length;
            ArrayList arrayList = oVar.d;
            int size = arrayList.size();
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((mg.f) arrayList.get(i12)).f18471j = 0;
            }
            float length2 = (1.0f / ((lg.e) oVar.f16601h0).f17012b.length) * oVar.C0;
            int i13 = 0;
            while (i13 < length) {
                float z10 = h0.z(oVar.C0, length2, ((lg.e) oVar.f16601h0).f17012b[i13], length2 / 2.0f);
                int i14 = 1;
                int i15 = i11;
                int i16 = i15;
                boolean z11 = true;
                float f12 = 0.0f;
                while (i15 < size) {
                    mg.f fVar = (mg.f) arrayList.get(i15);
                    boolean z12 = fVar.f18475n;
                    if (!z12 && fVar.f18476o == 0.0f) {
                        i10 = i13;
                    } else {
                        i10 = i13;
                        float f13 = ((float) fVar.f18465a.f17005a[i10]) * fVar.f18476o;
                        f12 += f13;
                        if (f13 > 0.0f) {
                            i16++;
                            if (z12) {
                                z11 = false;
                            }
                        }
                    }
                    i15++;
                    i13 = i10;
                }
                int i17 = i13;
                float f14 = 0.0f;
                int i18 = 0;
                while (i18 < size) {
                    mg.f fVar2 = (mg.f) arrayList.get(i18);
                    if (fVar2.f18475n || fVar2.f18476o != 0.0f) {
                        long[] jArr = fVar2.f18465a.f17005a;
                        if (i16 == i14) {
                            if (jArr[i17] != 0) {
                                f11 = fVar2.f18476o;
                                int i19 = oVar.B0;
                                float f15 = f11 * i19;
                                float[] fArr = fVar2.f18472k;
                                int i20 = fVar2.f18471j;
                                int i21 = i20 + 1;
                                fVar2.f18471j = i21;
                                fArr[i20] = z10;
                                int i22 = i20 + 2;
                                fVar2.f18471j = i22;
                                fArr[i21] = (i19 - f15) - f14;
                                int i23 = i20 + 3;
                                fVar2.f18471j = i23;
                                fArr[i22] = z10;
                                fVar2.f18471j = i20 + 4;
                                fArr[i23] = i19 - f14;
                                f14 += f15;
                            }
                            f11 = 0.0f;
                            int i192 = oVar.B0;
                            float f152 = f11 * i192;
                            float[] fArr2 = fVar2.f18472k;
                            int i202 = fVar2.f18471j;
                            int i212 = i202 + 1;
                            fVar2.f18471j = i212;
                            fArr2[i202] = z10;
                            int i222 = i202 + 2;
                            fVar2.f18471j = i222;
                            fArr2[i212] = (i192 - f152) - f14;
                            int i232 = i202 + 3;
                            fVar2.f18471j = i232;
                            fArr2[i222] = z10;
                            fVar2.f18471j = i202 + 4;
                            fArr2[i232] = i192 - f14;
                            f14 += f152;
                        } else {
                            if (f12 != 0.0f) {
                                if (z11) {
                                    f10 = fVar2.f18476o;
                                    f7 = (((float) jArr[i17]) / f12) * f10;
                                } else {
                                    f7 = ((float) jArr[i17]) / f12;
                                    f10 = fVar2.f18476o;
                                }
                                f11 = f7 * f10;
                                int i1922 = oVar.B0;
                                float f1522 = f11 * i1922;
                                float[] fArr22 = fVar2.f18472k;
                                int i2022 = fVar2.f18471j;
                                int i2122 = i2022 + 1;
                                fVar2.f18471j = i2122;
                                fArr22[i2022] = z10;
                                int i2222 = i2022 + 2;
                                fVar2.f18471j = i2222;
                                fArr22[i2122] = (i1922 - f1522) - f14;
                                int i2322 = i2022 + 3;
                                fVar2.f18471j = i2322;
                                fArr22[i2222] = z10;
                                fVar2.f18471j = i2022 + 4;
                                fArr22[i2322] = i1922 - f14;
                                f14 += f1522;
                            }
                            f11 = 0.0f;
                            int i19222 = oVar.B0;
                            float f15222 = f11 * i19222;
                            float[] fArr222 = fVar2.f18472k;
                            int i20222 = fVar2.f18471j;
                            int i21222 = i20222 + 1;
                            fVar2.f18471j = i21222;
                            fArr222[i20222] = z10;
                            int i22222 = i20222 + 2;
                            fVar2.f18471j = i22222;
                            fArr222[i21222] = (i19222 - f15222) - f14;
                            int i23222 = i20222 + 3;
                            fVar2.f18471j = i23222;
                            fArr222[i22222] = z10;
                            fVar2.f18471j = i20222 + 4;
                            fArr222[i23222] = i19222 - f14;
                            f14 += f15222;
                        }
                    }
                    i18++;
                    i14 = 1;
                    oVar = this;
                }
                i13 = i17 + 1;
                oVar = this;
                i11 = 0;
            }
            for (int i24 = 0; i24 < size; i24++) {
                mg.f fVar3 = (mg.f) arrayList.get(i24);
                Paint paint = fVar3.f18467c;
                Paint paint2 = fVar3.f18467c;
                paint.setStrokeWidth(length2);
                paint2.setAlpha(255);
                paint2.setAntiAlias(false);
                canvas.drawLines(fVar3.f18472k, 0, fVar3.f18471j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f16601h0 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (i10 == this.M1) {
                    if (((p) arrayList.get(i10)).f16644q < 1.0f) {
                        ((p) arrayList.get(i10)).f16644q += 0.1f;
                        if (((p) arrayList.get(i10)).f16644q > 1.0f) {
                            ((p) arrayList.get(i10)).f16644q = 1.0f;
                        }
                        invalidate();
                    }
                } else if (((p) arrayList.get(i10)).f16644q > 0.0f) {
                    ((p) arrayList.get(i10)).f16644q -= 0.1f;
                    if (((p) arrayList.get(i10)).f16644q < 0.0f) {
                        ((p) arrayList.get(i10)).f16644q = 0.0f;
                    }
                    invalidate();
                }
                i10++;
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float width;
        super.onMeasure(i10, i11);
        if (getMeasuredWidth() != this.U1) {
            this.U1 = getMeasuredWidth();
            RectF rectF = this.H0;
            if (rectF.width() > rectF.height()) {
                width = rectF.height();
            } else {
                width = rectF.width();
            }
            int i12 = (int) (width * 0.45f);
            this.P1 = i12 / 13;
            this.Q1 = i12 / 7;
        }
    }

    @Override
    public final void q(mg.j jVar) {
        k(null);
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            float[] fArr = this.J1;
            if (i10 < fArr.length) {
                f7 += fArr[i10];
                jVar.f18488k[i10] = (360.0f * f7) - 180.0f;
                i10++;
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
    public final void l(Canvas canvas, mg.d dVar) {
    }

    @Override
    public final void p(Canvas canvas, mg.d dVar) {
    }
}
