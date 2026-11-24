package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class da8 extends mma {
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
    public fa8 T1;
    public float U1;
    public int V1;
    public int W1;
    public int X1;

    @Override
    public final void A(boolean z, boolean z2, boolean z3) {
        super.A(z, z2, z3);
        fk1 fk1Var = this.i0;
        if (fk1Var != null && ((lma) fk1Var).b != null) {
            lk1 lk1Var = this.h0;
            N(lk1Var.k, lk1Var.l, z2);
        }
    }

    @Override
    public final void C(int i, int i2) {
        ArrayList arrayList;
        double d;
        double d2;
        RectF rectF = this.O1;
        if (this.i0 != null && !this.M1) {
            RectF rectF2 = this.I0;
            float degrees = (float) (Math.toDegrees(Math.atan2((rectF2.centerY() + gl.L(16.0f)) - i2, rectF2.centerX() - i)) - 90.0d);
            float f = 0.0f;
            if (degrees < 0.0f) {
                degrees = (float) (degrees + 360.0d);
            }
            float f2 = degrees / 360.0f;
            int i3 = 0;
            float f3 = 0.0f;
            int i4 = 0;
            while (true) {
                arrayList = this.d;
                if (i4 < arrayList.size()) {
                    if (((ea8) arrayList.get(i4)).n || ((ea8) arrayList.get(i4)).o != 0.0f) {
                        if (f2 > f3) {
                            float f4 = this.K1[i4] + f3;
                            if (f2 < f4) {
                                f = f4;
                                break;
                            }
                        }
                        f3 += this.K1[i4];
                    }
                    i4++;
                } else {
                    i4 = -1;
                    f3 = 0.0f;
                    break;
                }
            }
            if (this.N1 != i4 && i4 >= 0) {
                this.N1 = i4;
                invalidate();
                this.T1.setVisibility(0);
                k26 k26Var = (k26) arrayList.get(i4);
                fa8 fa8Var = this.T1;
                String str = k26Var.a.d;
                int i5 = k26Var.m;
                fa8Var.N.setText(str);
                TextView textView = fa8Var.O;
                textView.setText(Integer.toString((int) this.J1[this.N1]));
                textView.setTextColor(i5);
                this.T1.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
                double width = rectF.width() / 2.0f;
                int min = (int) Math.min(rectF.centerX() + (Math.cos(Math.toRadians((f * 360.0f) - 90.0f)) * width), rectF.centerX() + (Math.cos(Math.toRadians((f3 * 360.0f) - 90.0f)) * width));
                if (min >= 0) {
                    i3 = min;
                }
                if (this.T1.getMeasuredWidth() + i3 > getMeasuredWidth() - gl.L(16.0f)) {
                    i3 -= (this.T1.getMeasuredWidth() + i3) - (getMeasuredWidth() - gl.L(16.0f));
                }
                int min2 = ((int) Math.min(rectF.centerY(), (int) Math.min((Math.sin(Math.toRadians(d2)) * width) + rectF.centerY(), (Math.sin(Math.toRadians(d)) * width) + rectF.centerY()))) - gl.L(50.0f);
                this.T1.setTranslationX(i3);
                this.T1.setTranslationY(min2);
                gl.W3(this);
            }
            x((this.H0 * this.h0.k) - nf0.l1);
        }
    }

    @Override
    public final boolean D(fk1 fk1Var) {
        lma lmaVar = (lma) fk1Var;
        boolean D = super.D(lmaVar);
        if (lmaVar != null) {
            this.J1 = new float[lmaVar.d.size()];
            this.K1 = new float[lmaVar.d.size()];
            A(false, true, false);
        }
        return D;
    }

    @Override
    public final void J(fk1 fk1Var, long j) {
        float length;
        int length2 = fk1Var.a.length;
        long j2 = j - (j % 86400000);
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            if (j2 >= fk1Var.a[i2]) {
                i = i2;
            }
        }
        if (fk1Var.b.length < 2) {
            length = 0.5f;
        } else {
            length = 1.0f / fk1Var.a.length;
        }
        lk1 lk1Var = this.h0;
        if (i == 0) {
            lk1Var.k = 0.0f;
            lk1Var.l = length;
        } else if (i >= fk1Var.a.length - 1) {
            lk1Var.k = 1.0f - length;
            lk1Var.l = 1.0f;
        } else {
            float f = i * length;
            lk1Var.k = f;
            float f2 = f + length;
            lk1Var.l = f2;
            if (f2 > 1.0f) {
                lk1Var.l = 1.0f;
            }
            A(true, true, false);
        }
    }

    @Override
    public final nma L(ek1 ek1Var) {
        return new nma(ek1Var);
    }

    public final void N(float f, float f2, boolean z) {
        float f3;
        if (this.J1 != null) {
            int length = ((lma) this.i0).b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            for (int i4 = 0; i4 < length; i4++) {
                float f4 = ((lma) this.i0).b[i4];
                if (f4 >= f && i3 == -1) {
                    i3 = i4;
                }
                if (f4 <= f2) {
                    i2 = i4;
                }
            }
            if (i2 < i3) {
                i3 = i2;
            }
            if (z || this.X1 != i2 || this.W1 != i3) {
                this.X1 = i2;
                this.W1 = i3;
                this.M1 = true;
                this.L1 = 0.0f;
                for (int i5 = 0; i5 < size; i5++) {
                    this.J1[i5] = 0.0f;
                }
                while (i3 <= i2) {
                    for (int i6 = 0; i6 < size; i6++) {
                        float[] fArr = this.J1;
                        fArr[i6] = fArr[i6] + ((float) ((ek1) ((lma) this.i0).d.get(i6)).a[i3]);
                        this.L1 += (float) ((ek1) ((lma) this.i0).d.get(i6)).a[i3];
                        if (this.M1 && ((ea8) arrayList.get(i6)).n && ((ek1) ((lma) this.i0).d.get(i6)).a[i3] > 0) {
                            this.M1 = false;
                        }
                    }
                    i3++;
                }
                if (!z) {
                    while (i < size) {
                        ea8 ea8Var = (ea8) arrayList.get(i);
                        ValueAnimator valueAnimator = ea8Var.s;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float f5 = this.L1;
                        if (f5 == 0.0f) {
                            f3 = 0.0f;
                        } else {
                            f3 = this.J1[i] / f5;
                        }
                        ValueAnimator e = nf0.e(ea8Var.r, f3, new pk(this, ea8Var, (byte) 19));
                        ea8Var.s = e;
                        e.start();
                        i++;
                    }
                    return;
                }
                while (i < size) {
                    if (this.L1 == 0.0f) {
                        ((ea8) arrayList.get(i)).r = 0.0f;
                    } else {
                        ((ea8) arrayList.get(i)).r = this.J1[i] / this.L1;
                    }
                    i++;
                }
            }
        }
    }

    @Override
    public final void a(float f, float f2, boolean z) {
        if (this.i0 == null) {
            return;
        }
        if (z) {
            N(f, f2, false);
            return;
        }
        H();
        invalidate();
    }

    @Override
    public final m06 g() {
        ?? m06Var = new m06(getContext(), null);
        LinearLayout linearLayout = new LinearLayout(m06Var.getContext());
        linearLayout.setPadding(gl.L(4.0f), gl.L(2.0f), gl.L(4.0f), gl.L(2.0f));
        TextView textView = new TextView(m06Var.getContext());
        m06Var.N = textView;
        linearLayout.addView(textView);
        textView.getLayoutParams().width = gl.L(96.0f);
        TextView textView2 = new TextView(m06Var.getContext());
        m06Var.O = textView2;
        linearLayout.addView(textView2);
        m06Var.addView(linearLayout);
        textView2.setTypeface(Typeface.create("sans-serif-medium", 0));
        m06Var.setPadding(gl.L(12.0f), gl.L(12.0f), gl.L(12.0f), gl.L(12.0f));
        m06Var.f.setVisibility(8);
        m06Var.G = false;
        this.T1 = m06Var;
        return m06Var;
    }

    @Override
    public final k26 h(ek1 ek1Var) {
        return new nma(ek1Var);
    }

    @Override
    public final void k(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da8.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        da8 da8Var = this;
        fk1 fk1Var = da8Var.i0;
        if (fk1Var != null) {
            int length = ((lma) fk1Var).b.length;
            ArrayList arrayList = da8Var.d;
            int size = arrayList.size();
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((k26) arrayList.get(i3)).j = 0;
            }
            float length2 = (1.0f / ((lma) da8Var.i0).b.length) * da8Var.D0;
            int i4 = 0;
            while (i4 < length) {
                float A = tb4.A(da8Var.D0, length2, ((lma) da8Var.i0).b[i4], length2 / 2.0f);
                int i5 = 1;
                int i6 = i2;
                int i7 = i6;
                boolean z = true;
                float f4 = 0.0f;
                while (i6 < size) {
                    k26 k26Var = (k26) arrayList.get(i6);
                    boolean z2 = k26Var.n;
                    if (!z2 && k26Var.o == 0.0f) {
                        i = i4;
                    } else {
                        i = i4;
                        float f5 = ((float) k26Var.a.a[i]) * k26Var.o;
                        f4 += f5;
                        if (f5 > 0.0f) {
                            i7++;
                            if (z2) {
                                z = false;
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                }
                int i8 = i4;
                float f6 = 0.0f;
                int i9 = 0;
                while (i9 < size) {
                    k26 k26Var2 = (k26) arrayList.get(i9);
                    if (k26Var2.n || k26Var2.o != 0.0f) {
                        long[] jArr = k26Var2.a.a;
                        if (i7 == i5) {
                            if (jArr[i8] != 0) {
                                f3 = k26Var2.o;
                                int i10 = da8Var.C0;
                                float f7 = f3 * i10;
                                float[] fArr = k26Var2.k;
                                int i11 = k26Var2.j;
                                int i12 = i11 + 1;
                                k26Var2.j = i12;
                                fArr[i11] = A;
                                int i13 = i11 + 2;
                                k26Var2.j = i13;
                                fArr[i12] = (i10 - f7) - f6;
                                int i14 = i11 + 3;
                                k26Var2.j = i14;
                                fArr[i13] = A;
                                k26Var2.j = i11 + 4;
                                fArr[i14] = i10 - f6;
                                f6 += f7;
                            }
                            f3 = 0.0f;
                            int i102 = da8Var.C0;
                            float f72 = f3 * i102;
                            float[] fArr2 = k26Var2.k;
                            int i112 = k26Var2.j;
                            int i122 = i112 + 1;
                            k26Var2.j = i122;
                            fArr2[i112] = A;
                            int i132 = i112 + 2;
                            k26Var2.j = i132;
                            fArr2[i122] = (i102 - f72) - f6;
                            int i142 = i112 + 3;
                            k26Var2.j = i142;
                            fArr2[i132] = A;
                            k26Var2.j = i112 + 4;
                            fArr2[i142] = i102 - f6;
                            f6 += f72;
                        } else {
                            if (f4 != 0.0f) {
                                if (z) {
                                    f2 = k26Var2.o;
                                    f = (((float) jArr[i8]) / f4) * f2;
                                } else {
                                    f = ((float) jArr[i8]) / f4;
                                    f2 = k26Var2.o;
                                }
                                f3 = f * f2;
                                int i1022 = da8Var.C0;
                                float f722 = f3 * i1022;
                                float[] fArr22 = k26Var2.k;
                                int i1122 = k26Var2.j;
                                int i1222 = i1122 + 1;
                                k26Var2.j = i1222;
                                fArr22[i1122] = A;
                                int i1322 = i1122 + 2;
                                k26Var2.j = i1322;
                                fArr22[i1222] = (i1022 - f722) - f6;
                                int i1422 = i1122 + 3;
                                k26Var2.j = i1422;
                                fArr22[i1322] = A;
                                k26Var2.j = i1122 + 4;
                                fArr22[i1422] = i1022 - f6;
                                f6 += f722;
                            }
                            f3 = 0.0f;
                            int i10222 = da8Var.C0;
                            float f7222 = f3 * i10222;
                            float[] fArr222 = k26Var2.k;
                            int i11222 = k26Var2.j;
                            int i12222 = i11222 + 1;
                            k26Var2.j = i12222;
                            fArr222[i11222] = A;
                            int i13222 = i11222 + 2;
                            k26Var2.j = i13222;
                            fArr222[i12222] = (i10222 - f7222) - f6;
                            int i14222 = i11222 + 3;
                            k26Var2.j = i14222;
                            fArr222[i13222] = A;
                            k26Var2.j = i11222 + 4;
                            fArr222[i14222] = i10222 - f6;
                            f6 += f7222;
                        }
                    }
                    i9++;
                    i5 = 1;
                    da8Var = this;
                }
                i4 = i8 + 1;
                da8Var = this;
                i2 = 0;
            }
            for (int i15 = 0; i15 < size; i15++) {
                k26 k26Var3 = (k26) arrayList.get(i15);
                Paint paint = k26Var3.c;
                Paint paint2 = k26Var3.c;
                paint.setStrokeWidth(length2);
                paint2.setAlpha(255);
                paint2.setAntiAlias(false);
                canvas.drawLines(k26Var3.k, 0, k26Var3.j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.i0 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i >= arrayList.size()) {
                    break;
                }
                if (i == this.N1) {
                    if (((ea8) arrayList.get(i)).q < 1.0f) {
                        ((ea8) arrayList.get(i)).q += 0.1f;
                        if (((ea8) arrayList.get(i)).q > 1.0f) {
                            ((ea8) arrayList.get(i)).q = 1.0f;
                        }
                        invalidate();
                    }
                } else if (((ea8) arrayList.get(i)).q > 0.0f) {
                    ((ea8) arrayList.get(i)).q -= 0.1f;
                    if (((ea8) arrayList.get(i)).q < 0.0f) {
                        ((ea8) arrayList.get(i)).q = 0.0f;
                    }
                    invalidate();
                }
                i++;
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float width;
        super.onMeasure(i, i2);
        if (getMeasuredWidth() != this.V1) {
            this.V1 = getMeasuredWidth();
            RectF rectF = this.I0;
            if (rectF.width() > rectF.height()) {
                width = rectF.height();
            } else {
                width = rectF.width();
            }
            int i3 = (int) (width * 0.45f);
            this.Q1 = i3 / 13;
            this.R1 = i3 / 7;
        }
    }

    @Override
    public final void q(zyb zybVar) {
        k(null);
        float f = 0.0f;
        int i = 0;
        while (true) {
            float[] fArr = this.K1;
            if (i < fArr.length) {
                f += fArr[i];
                zybVar.k[i] = (360.0f * f) - 180.0f;
                i++;
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
    public final void l(Canvas canvas, ik1 ik1Var) {
    }

    @Override
    public final void p(Canvas canvas, ik1 ik1Var) {
    }
}
