package jg;

import ah.m0;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
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
        kg.b bVar = this.f13673h0;
        if (bVar != null && ((kg.e) bVar).f14926b != null) {
            j jVar = this.f13671g0;
            N(jVar.f13714k, jVar.f13715l, z11);
        }
    }

    @Override
    public final void C(int i10, int i11) {
        ArrayList arrayList;
        double d;
        double d10;
        RectF rectF = this.N1;
        if (this.f13673h0 != null && !this.L1) {
            RectF rectF2 = this.H0;
            float degrees = (float) (Math.toDegrees(Math.atan2((rectF2.centerY() + AndroidUtilities.dp(16.0f)) - i11, rectF2.centerX() - i10)) - 90.0d);
            float f7 = 0.0f;
            if (degrees < 0.0f) {
                degrees = (float) (degrees + 360.0d);
            }
            float f10 = degrees / 360.0f;
            int i12 = 0;
            int i13 = 0;
            float f11 = 0.0f;
            while (true) {
                arrayList = this.d;
                if (i13 < arrayList.size()) {
                    if (((o) arrayList.get(i13)).f15448n || ((o) arrayList.get(i13)).f15449o != 0.0f) {
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
                String str = fVar.f15437a.d;
                int i14 = fVar.f15447m;
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
            x((this.G0 * this.f13671g0.f13714k) - g.f13639k1);
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
    public final void J(kg.b bVar, long j3) {
        float length;
        int length2 = bVar.f14925a.length;
        long j10 = j3 - (j3 % 86400000);
        int i10 = 0;
        for (int i11 = 0; i11 < length2; i11++) {
            if (j10 >= bVar.f14925a[i11]) {
                i10 = i11;
            }
        }
        if (bVar.f14926b.length < 2) {
            length = 0.5f;
        } else {
            length = 1.0f / bVar.f14925a.length;
        }
        j jVar = this.f13671g0;
        if (i10 == 0) {
            jVar.f13714k = 0.0f;
            jVar.f13715l = length;
        } else if (i10 >= bVar.f14925a.length - 1) {
            jVar.f13714k = 1.0f - length;
            jVar.f13715l = 1.0f;
        } else {
            float f7 = i10 * length;
            jVar.f13714k = f7;
            float f10 = f7 + length;
            jVar.f13715l = f10;
            if (f10 > 1.0f) {
                jVar.f13715l = 1.0f;
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
            int length = ((kg.e) this.f13673h0).f14926b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            for (int i13 = 0; i13 < length; i13++) {
                float f12 = ((kg.e) this.f13673h0).f14926b[i13];
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
                        fArr[i15] = fArr[i15] + ((float) ((kg.a) ((kg.e) this.f13673h0).d.get(i15)).f14918a[i12]);
                        this.K1 += (float) ((kg.a) ((kg.e) this.f13673h0).d.get(i15)).f14918a[i12];
                        if (this.L1 && ((o) arrayList.get(i15)).f15448n && ((kg.a) ((kg.e) this.f13673h0).d.get(i15)).f14918a[i12] > 0) {
                            this.L1 = false;
                        }
                    }
                    i12++;
                }
                if (!z10) {
                    while (i10 < size) {
                        o oVar = (o) arrayList.get(i10);
                        ValueAnimator valueAnimator = oVar.f13720s;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float f13 = this.K1;
                        if (f13 == 0.0f) {
                            f11 = 0.0f;
                        } else {
                            f11 = this.I1[i10] / f13;
                        }
                        ValueAnimator e7 = g.e(oVar.f13719r, f11, new m0(6, this, oVar));
                        oVar.f13720s = e7;
                        e7.start();
                        i10++;
                    }
                    return;
                }
                while (i10 < size) {
                    if (this.K1 == 0.0f) {
                        ((o) arrayList.get(i10)).f13719r = 0.0f;
                    } else {
                        ((o) arrayList.get(i10)).f13719r = this.I1[i10] / this.K1;
                    }
                    i10++;
                }
            }
        }
    }

    @Override
    public final void a(float f7, float f10, boolean z10) {
        if (this.f13673h0 == null) {
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
        eVar.f15430f.setVisibility(8);
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
        kg.b bVar = nVar.f13673h0;
        if (bVar != null) {
            int length = ((kg.e) bVar).f14926b.length;
            ArrayList arrayList = nVar.d;
            int size = arrayList.size();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((lg.f) arrayList.get(i11)).f15444j = 0;
            }
            float length2 = (1.0f / ((kg.e) nVar.f13673h0).f14926b.length) * nVar.C0;
            int i12 = 0;
            while (i12 < length) {
                float f12 = ((kg.e) nVar.f13673h0).f14926b[i12];
                float z10 = e2.z(nVar.C0, length2, f12, length2 / 2.0f);
                int i13 = 1;
                int i14 = 0;
                float f13 = 0.0f;
                int i15 = 0;
                boolean z11 = true;
                while (i14 < size) {
                    lg.f fVar = (lg.f) arrayList.get(i14);
                    boolean z12 = fVar.f15448n;
                    if (!z12 && fVar.f15449o == 0.0f) {
                        i10 = i12;
                    } else {
                        i10 = i12;
                        float f14 = ((float) fVar.f15437a.f14918a[i10]) * fVar.f15449o;
                        f13 += f14;
                        if (f14 > 0.0f) {
                            i15++;
                            if (z12) {
                                z11 = false;
                            }
                        }
                    }
                    i14++;
                    i12 = i10;
                }
                int i16 = i12;
                int i17 = 0;
                float f15 = 0.0f;
                while (i17 < size) {
                    lg.f fVar2 = (lg.f) arrayList.get(i17);
                    if (fVar2.f15448n || fVar2.f15449o != 0.0f) {
                        long[] jArr = fVar2.f15437a.f14918a;
                        if (i15 == i13) {
                            if (jArr[i16] != 0) {
                                f11 = fVar2.f15449o;
                                int i18 = nVar.B0;
                                float f16 = f11 * i18;
                                float[] fArr = fVar2.f15445k;
                                int i19 = fVar2.f15444j;
                                int i20 = i19 + 1;
                                fVar2.f15444j = i20;
                                fArr[i19] = z10;
                                int i21 = i19 + 2;
                                fVar2.f15444j = i21;
                                fArr[i20] = (i18 - f16) - f15;
                                int i22 = i19 + 3;
                                fVar2.f15444j = i22;
                                fArr[i21] = z10;
                                fVar2.f15444j = i19 + 4;
                                fArr[i22] = i18 - f15;
                                f15 += f16;
                            }
                            f11 = 0.0f;
                            int i182 = nVar.B0;
                            float f162 = f11 * i182;
                            float[] fArr2 = fVar2.f15445k;
                            int i192 = fVar2.f15444j;
                            int i202 = i192 + 1;
                            fVar2.f15444j = i202;
                            fArr2[i192] = z10;
                            int i212 = i192 + 2;
                            fVar2.f15444j = i212;
                            fArr2[i202] = (i182 - f162) - f15;
                            int i222 = i192 + 3;
                            fVar2.f15444j = i222;
                            fArr2[i212] = z10;
                            fVar2.f15444j = i192 + 4;
                            fArr2[i222] = i182 - f15;
                            f15 += f162;
                        } else {
                            if (f13 != 0.0f) {
                                if (z11) {
                                    f10 = fVar2.f15449o;
                                    f7 = (((float) jArr[i16]) / f13) * f10;
                                } else {
                                    f7 = ((float) jArr[i16]) / f13;
                                    f10 = fVar2.f15449o;
                                }
                                f11 = f7 * f10;
                                int i1822 = nVar.B0;
                                float f1622 = f11 * i1822;
                                float[] fArr22 = fVar2.f15445k;
                                int i1922 = fVar2.f15444j;
                                int i2022 = i1922 + 1;
                                fVar2.f15444j = i2022;
                                fArr22[i1922] = z10;
                                int i2122 = i1922 + 2;
                                fVar2.f15444j = i2122;
                                fArr22[i2022] = (i1822 - f1622) - f15;
                                int i2222 = i1922 + 3;
                                fVar2.f15444j = i2222;
                                fArr22[i2122] = z10;
                                fVar2.f15444j = i1922 + 4;
                                fArr22[i2222] = i1822 - f15;
                                f15 += f1622;
                            }
                            f11 = 0.0f;
                            int i18222 = nVar.B0;
                            float f16222 = f11 * i18222;
                            float[] fArr222 = fVar2.f15445k;
                            int i19222 = fVar2.f15444j;
                            int i20222 = i19222 + 1;
                            fVar2.f15444j = i20222;
                            fArr222[i19222] = z10;
                            int i21222 = i19222 + 2;
                            fVar2.f15444j = i21222;
                            fArr222[i20222] = (i18222 - f16222) - f15;
                            int i22222 = i19222 + 3;
                            fVar2.f15444j = i22222;
                            fArr222[i21222] = z10;
                            fVar2.f15444j = i19222 + 4;
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
            }
            for (int i23 = 0; i23 < size; i23++) {
                lg.f fVar3 = (lg.f) arrayList.get(i23);
                Paint paint = fVar3.f15439c;
                Paint paint2 = fVar3.f15439c;
                paint.setStrokeWidth(length2);
                paint2.setAlpha(255);
                paint2.setAntiAlias(false);
                canvas.drawLines(fVar3.f15445k, 0, fVar3.f15444j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f13673h0 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (i10 == this.M1) {
                    if (((o) arrayList.get(i10)).f13718q < 1.0f) {
                        ((o) arrayList.get(i10)).f13718q += 0.1f;
                        if (((o) arrayList.get(i10)).f13718q > 1.0f) {
                            ((o) arrayList.get(i10)).f13718q = 1.0f;
                        }
                        invalidate();
                    }
                } else if (((o) arrayList.get(i10)).f13718q > 0.0f) {
                    ((o) arrayList.get(i10)).f13718q -= 0.1f;
                    if (((o) arrayList.get(i10)).f13718q < 0.0f) {
                        ((o) arrayList.get(i10)).f13718q = 0.0f;
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
                jVar.f15462k[i10] = (360.0f * f7) - 180.0f;
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
