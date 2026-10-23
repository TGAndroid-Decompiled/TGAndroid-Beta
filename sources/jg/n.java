package jg;

import ah.l0;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
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
    public lg.g S1;
    public float T1;
    public int U1;
    public int V1;
    public int W1;

    @Override
    public final void A(boolean z10, boolean z11, boolean z12) {
        super.A(z10, z11, z12);
        kg.b bVar = this.f14508h0;
        if (bVar != null && ((kg.e) bVar).f15099b != null) {
            j jVar = this.f14506g0;
            N(jVar.f14547k, jVar.f14548l, z11);
        }
    }

    @Override
    public final void C(int i10, int i11) {
        ArrayList arrayList;
        double d;
        double d10;
        RectF rectF = this.N1;
        if (this.f14508h0 != null && !this.L1) {
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
                    if (((o) arrayList.get(i13)).f16126n || ((o) arrayList.get(i13)).f16127o != 0.0f) {
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
                lg.f fVar = (lg.f) arrayList.get(i13);
                lg.g gVar = this.S1;
                String str = fVar.f16116a.d;
                int i14 = fVar.f16125m;
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
            x((this.G0 * this.f14506g0.f14547k) - g.f14475k1);
        }
    }

    @Override
    public final boolean D(kg.b bVar) {
        kg.e eVar = (kg.e) bVar;
        boolean D = super.D(eVar);
        if (eVar != null) {
            this.I1 = new float[eVar.d.size()];
            this.J1 = new float[eVar.d.size()];
            A(false, true, false);
        }
        return D;
    }

    @Override
    public final void J(kg.b bVar, long j10) {
        float length;
        int length2 = bVar.f15098a.length;
        long j11 = j10 - (j10 % 86400000);
        int i10 = 0;
        for (int i11 = 0; i11 < length2; i11++) {
            if (j11 >= bVar.f15098a[i11]) {
                i10 = i11;
            }
        }
        if (bVar.f15099b.length < 2) {
            length = 0.5f;
        } else {
            length = 1.0f / bVar.f15098a.length;
        }
        j jVar = this.f14506g0;
        if (i10 == 0) {
            jVar.f14547k = 0.0f;
            jVar.f14548l = length;
        } else if (i10 >= bVar.f15098a.length - 1) {
            jVar.f14547k = 1.0f - length;
            jVar.f14548l = 1.0f;
        } else {
            float f7 = i10 * length;
            jVar.f14547k = f7;
            float f10 = f7 + length;
            jVar.f14548l = f10;
            if (f10 > 1.0f) {
                jVar.f14548l = 1.0f;
            }
            A(true, true, false);
        }
    }

    @Override
    public final lg.i L(kg.a aVar) {
        return new lg.i(aVar);
    }

    public final void N(float f7, float f10, boolean z10) {
        float f11;
        if (this.I1 != null) {
            int length = ((kg.e) this.f14508h0).f15099b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            for (int i13 = 0; i13 < length; i13++) {
                float f12 = ((kg.e) this.f14508h0).f15099b[i13];
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
                        fArr[i15] = fArr[i15] + ((float) ((kg.a) ((kg.e) this.f14508h0).d.get(i15)).f15092a[i12]);
                        this.K1 += (float) ((kg.a) ((kg.e) this.f14508h0).d.get(i15)).f15092a[i12];
                        if (this.L1 && ((o) arrayList.get(i15)).f16126n && ((kg.a) ((kg.e) this.f14508h0).d.get(i15)).f15092a[i12] > 0) {
                            this.L1 = false;
                        }
                    }
                    i12++;
                }
                if (!z10) {
                    while (i10 < size) {
                        o oVar = (o) arrayList.get(i10);
                        ValueAnimator valueAnimator = oVar.f14553s;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float f13 = this.K1;
                        if (f13 == 0.0f) {
                            f11 = 0.0f;
                        } else {
                            f11 = this.I1[i10] / f13;
                        }
                        ValueAnimator e = g.e(oVar.f14552r, f11, new l0(7, this, oVar));
                        oVar.f14553s = e;
                        e.start();
                        i10++;
                    }
                    return;
                }
                while (i10 < size) {
                    if (this.K1 == 0.0f) {
                        ((o) arrayList.get(i10)).f14552r = 0.0f;
                    } else {
                        ((o) arrayList.get(i10)).f14552r = this.I1[i10] / this.K1;
                    }
                    i10++;
                }
            }
        }
    }

    @Override
    public final void a(float f7, float f10, boolean z10) {
        if (this.f14508h0 == null) {
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
    public final lg.e g() {
        ?? eVar = new lg.e(getContext(), null);
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
        eVar.f16109f.setVisibility(8);
        eVar.F = false;
        this.S1 = eVar;
        return eVar;
    }

    @Override
    public final lg.f h(kg.a aVar) {
        return new lg.i(aVar);
    }

    @Override
    public final void k(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: jg.n.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        int i10;
        n nVar = this;
        kg.b bVar = nVar.f14508h0;
        if (bVar != null) {
            int length = ((kg.e) bVar).f15099b.length;
            ArrayList arrayList = nVar.d;
            int size = arrayList.size();
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((lg.f) arrayList.get(i12)).f16122j = 0;
            }
            float length2 = (1.0f / ((kg.e) nVar.f14508h0).f15099b.length) * nVar.C0;
            int i13 = 0;
            while (i13 < length) {
                float y3 = k3.y(nVar.C0, length2, ((kg.e) nVar.f14508h0).f15099b[i13], length2 / 2.0f);
                int i14 = 1;
                int i15 = i11;
                int i16 = i15;
                boolean z10 = true;
                float f12 = 0.0f;
                while (i15 < size) {
                    lg.f fVar = (lg.f) arrayList.get(i15);
                    boolean z11 = fVar.f16126n;
                    if (!z11 && fVar.f16127o == 0.0f) {
                        i10 = i13;
                    } else {
                        i10 = i13;
                        float f13 = ((float) fVar.f16116a.f15092a[i10]) * fVar.f16127o;
                        f12 += f13;
                        if (f13 > 0.0f) {
                            i16++;
                            if (z11) {
                                z10 = false;
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
                    lg.f fVar2 = (lg.f) arrayList.get(i18);
                    if (fVar2.f16126n || fVar2.f16127o != 0.0f) {
                        long[] jArr = fVar2.f16116a.f15092a;
                        if (i16 == i14) {
                            if (jArr[i17] != 0) {
                                f11 = fVar2.f16127o;
                                int i19 = nVar.B0;
                                float f15 = f11 * i19;
                                float[] fArr = fVar2.f16123k;
                                int i20 = fVar2.f16122j;
                                int i21 = i20 + 1;
                                fVar2.f16122j = i21;
                                fArr[i20] = y3;
                                int i22 = i20 + 2;
                                fVar2.f16122j = i22;
                                fArr[i21] = (i19 - f15) - f14;
                                int i23 = i20 + 3;
                                fVar2.f16122j = i23;
                                fArr[i22] = y3;
                                fVar2.f16122j = i20 + 4;
                                fArr[i23] = i19 - f14;
                                f14 += f15;
                            }
                            f11 = 0.0f;
                            int i192 = nVar.B0;
                            float f152 = f11 * i192;
                            float[] fArr2 = fVar2.f16123k;
                            int i202 = fVar2.f16122j;
                            int i212 = i202 + 1;
                            fVar2.f16122j = i212;
                            fArr2[i202] = y3;
                            int i222 = i202 + 2;
                            fVar2.f16122j = i222;
                            fArr2[i212] = (i192 - f152) - f14;
                            int i232 = i202 + 3;
                            fVar2.f16122j = i232;
                            fArr2[i222] = y3;
                            fVar2.f16122j = i202 + 4;
                            fArr2[i232] = i192 - f14;
                            f14 += f152;
                        } else {
                            if (f12 != 0.0f) {
                                if (z10) {
                                    f10 = fVar2.f16127o;
                                    f7 = (((float) jArr[i17]) / f12) * f10;
                                } else {
                                    f7 = ((float) jArr[i17]) / f12;
                                    f10 = fVar2.f16127o;
                                }
                                f11 = f7 * f10;
                                int i1922 = nVar.B0;
                                float f1522 = f11 * i1922;
                                float[] fArr22 = fVar2.f16123k;
                                int i2022 = fVar2.f16122j;
                                int i2122 = i2022 + 1;
                                fVar2.f16122j = i2122;
                                fArr22[i2022] = y3;
                                int i2222 = i2022 + 2;
                                fVar2.f16122j = i2222;
                                fArr22[i2122] = (i1922 - f1522) - f14;
                                int i2322 = i2022 + 3;
                                fVar2.f16122j = i2322;
                                fArr22[i2222] = y3;
                                fVar2.f16122j = i2022 + 4;
                                fArr22[i2322] = i1922 - f14;
                                f14 += f1522;
                            }
                            f11 = 0.0f;
                            int i19222 = nVar.B0;
                            float f15222 = f11 * i19222;
                            float[] fArr222 = fVar2.f16123k;
                            int i20222 = fVar2.f16122j;
                            int i21222 = i20222 + 1;
                            fVar2.f16122j = i21222;
                            fArr222[i20222] = y3;
                            int i22222 = i20222 + 2;
                            fVar2.f16122j = i22222;
                            fArr222[i21222] = (i19222 - f15222) - f14;
                            int i23222 = i20222 + 3;
                            fVar2.f16122j = i23222;
                            fArr222[i22222] = y3;
                            fVar2.f16122j = i20222 + 4;
                            fArr222[i23222] = i19222 - f14;
                            f14 += f15222;
                        }
                    }
                    i18++;
                    i14 = 1;
                    nVar = this;
                }
                i13 = i17 + 1;
                nVar = this;
                i11 = 0;
            }
            for (int i24 = 0; i24 < size; i24++) {
                lg.f fVar3 = (lg.f) arrayList.get(i24);
                Paint paint = fVar3.f16118c;
                Paint paint2 = fVar3.f16118c;
                paint.setStrokeWidth(length2);
                paint2.setAlpha(255);
                paint2.setAntiAlias(false);
                canvas.drawLines(fVar3.f16123k, 0, fVar3.f16122j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f14508h0 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (i10 == this.M1) {
                    if (((o) arrayList.get(i10)).f14551q < 1.0f) {
                        ((o) arrayList.get(i10)).f14551q += 0.1f;
                        if (((o) arrayList.get(i10)).f14551q > 1.0f) {
                            ((o) arrayList.get(i10)).f14551q = 1.0f;
                        }
                        invalidate();
                    }
                } else if (((o) arrayList.get(i10)).f14551q > 0.0f) {
                    ((o) arrayList.get(i10)).f14551q -= 0.1f;
                    if (((o) arrayList.get(i10)).f14551q < 0.0f) {
                        ((o) arrayList.get(i10)).f14551q = 0.0f;
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
    public final void q(lg.j jVar) {
        k(null);
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            float[] fArr = this.J1;
            if (i10 < fArr.length) {
                f7 += fArr[i10];
                jVar.f16139k[i10] = (360.0f * f7) - 180.0f;
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
    public final void l(Canvas canvas, lg.d dVar) {
    }

    @Override
    public final void p(Canvas canvas, lg.d dVar) {
    }
}
