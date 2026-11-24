package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
public final class ej6 extends on implements zt5 {
    public static final float[] T = {12.0f, 12.0f, 10.0f};
    public static final int[] U = {16, 8, 4};
    public int[] E;
    public int[] F;
    public int[] G;
    public int H;
    public final pg6 I;
    public boolean J;
    public final Paint K;
    public final zna L;
    public final zna M;
    public float N;
    public float O;
    public View P;
    public final HashSet Q;
    public final fn0 R;
    public final vj2 S;
    public final ylb s;
    public int w;
    public float[] x;
    public float[] y;

    public ej6(Context context, ylb ylbVar) {
        super(context);
        this.I = new pg6(this, (byte) 3);
        this.K = new Paint(1);
        new aoa(1.0f);
        new aoa(1.0f);
        zna znaVar = new zna(this, new s21((byte) 1));
        this.L = znaVar;
        zna znaVar2 = new zna(this, new s21((byte) 2));
        this.M = znaVar2;
        znaVar.m = aq1.j(1.0f, 1500.0f, 0.75f);
        aoa aoaVar = new aoa(1.0f);
        aoaVar.b(250.0f);
        aoaVar.a(0.25f);
        aoa aoaVar2 = new aoa(1.0f);
        aoaVar2.b(250.0f);
        aoaVar2.a(0.25f);
        aoa aoaVar3 = new aoa(1.0f);
        aoaVar3.b(1500.0f);
        aoaVar3.a(0.75f);
        znaVar2.m = aoaVar3;
        this.Q = new HashSet();
        this.R = new fn0(0, new cj6(this, (byte) 0), d53.h, 380L, false);
        this.S = new vj2(new k44(this, (byte) 14));
        this.s = ylbVar;
    }

    public static void n(View view, float f, float f2) {
        float f3;
        float f4;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f5 = width * 0.5f;
            float f6 = height * 0.5f;
            float f7 = f - f5;
            float f8 = f2 - f6;
            float f9 = f7 / f5;
            float f10 = f8 / f6;
            float sqrt = (float) Math.sqrt((f10 * f10) + (f9 * f9));
            if (sqrt > 1.0E-4f) {
                float f11 = ((1.5f * sqrt) / (0.5f + sqrt)) / sqrt;
                f3 = (f7 * f11) + f5;
                f4 = (f8 * f11) + f6;
            } else {
                f3 = f5;
                f4 = f6;
            }
            float R1 = gm.R1(f5, f3, 1.0f);
            float R12 = gm.R1(f6, f4, 3.0f);
            view.setPivotX(R1);
            view.setPivotY(R12);
        }
    }

    public static float p(View view) {
        return (view.getWidth() * 0.5f) + view.getX();
    }

    public void setSkipDrawSelector(boolean z) {
        this.J = z;
        if (z) {
            this.K.setColor(cmb.p1(0.09f, cmb.v0(cmb.Ql, this.s)));
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (childAt instanceof qz4)) {
                ((qz4) childAt).setSkipDrawSelector(z);
            }
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int width;
        if (this.J) {
            float f = this.N + this.O;
            float f2 = 0.0f;
            if (getChildCount() != 0) {
                View view = null;
                View view2 = null;
                for (int i = 0; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    if (childAt != null && childAt.getVisibility() == 0) {
                        float width2 = (childAt.getWidth() * 0.5f) + childAt.getX();
                        if (width2 <= f && (view == null || width2 > p(view))) {
                            view = childAt;
                        }
                        if (width2 >= f && (view2 == null || width2 < p(view2))) {
                            view2 = childAt;
                        }
                    }
                }
                if (view == null) {
                    if (view2 != null) {
                        width = view2.getWidth();
                    }
                } else if (view2 == null) {
                    width = view.getWidth();
                } else {
                    float p = p(view);
                    float p2 = p(view2);
                    if (view != view2 && p != p2) {
                        width = gm.U1((f - p) / (p2 - p), view.getWidth(), view2.getWidth());
                    } else {
                        width = view.getWidth();
                    }
                }
                f2 = width;
            }
            float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float f3 = f2 / 2.0f;
            float f4 = height / 2.0f;
            canvas2 = canvas;
            canvas2.drawRoundRect(f - f3, (getHeight() - height) / 2.0f, f + f3, (getHeight() + height) / 2.0f, f4, f4, this.K);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.S.a(this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e(xt5 xt5Var) {
        if (getBackground() instanceof im0) {
            xt5Var.a(((im0) getBackground()).S.k);
        }
    }

    @Override
    public final void f() {
        o();
    }

    @Override
    public final void g(View view, float f) {
        float R1 = gm.R1(0.7f, 1.0f, f);
        view.setAlpha(f);
        view.setScaleX(R1);
        view.setScaleY(R1);
    }

    public final void l() {
        int i;
        if (Math.abs(getScaleX() - 1.0f) < 1.0E-4f && Math.abs(getScaleY() - 1.0f) < 1.0E-4f) {
            i = 0;
        } else {
            i = 2;
        }
        if (getLayerType() != i) {
            setLayerType(i, null);
            invalidate();
        }
    }

    public final void m(boolean z, boolean z2, float f) {
        View view;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        if (getChildCount() != 0) {
            float f3 = -3.4028235E38f;
            float f4 = Float.MAX_VALUE;
            boolean z3 = false;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() == 0) {
                    float width = (childAt.getWidth() * 0.5f) + childAt.getX();
                    if (width < f4) {
                        f4 = width;
                    }
                    if (width > f3) {
                        f3 = width;
                    }
                    z3 = true;
                }
            }
            if (z3) {
                if (f < f4) {
                    f = f4;
                } else if (f > f3) {
                    f = f3;
                }
            }
        }
        View view2 = null;
        if (getChildCount() == 0) {
            view = null;
        } else {
            view = null;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2 != null && childAt2.getVisibility() == 0) {
                    float abs = Math.abs(((childAt2.getWidth() * 0.5f) + childAt2.getX()) - f);
                    if (abs < f2) {
                        view = childAt2;
                        f2 = abs;
                    }
                }
            }
        }
        zna znaVar = this.M;
        if (z) {
            int childCount = getChildCount();
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt3 = getChildAt(i);
                if (childAt3.getVisibility() == 0 && (childAt3 instanceof qz4) && ((qz4) childAt3).h.f) {
                    view2 = childAt3;
                    break;
                }
                i++;
            }
            if (view2 != null) {
                float width2 = (view2.getWidth() / 2.0f) + view2.getX();
                this.N = width2;
                this.O = width2 - f;
                this.L.c(0.0f);
                if (view2 != view && view != null) {
                    view.performClick();
                }
            }
            znaVar.d();
        }
        if (!z2) {
            this.N = f;
            invalidate();
        }
        if (view != null) {
            this.P = view;
            r(view, true);
            if (z2) {
                float width3 = view.getWidth();
                float x = (width3 / 2.0f) + view.getX();
                if (0.0f != width3 || 0.0f != x) {
                    znaVar.c(x);
                }
            }
        }
    }

    public final void o() {
        int entriesCount = getEntriesCount();
        for (int i = 0; i < entriesCount; i++) {
            u66 i2 = this.c.i(i);
            ((qz4) ((nn) i2.a).a).setVisualWidth(i2.b().width());
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        o();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int[] iArr;
        float[] fArr;
        int i3;
        float f;
        int i4;
        int i5;
        float f2;
        float f3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i6 = this.w;
        if (i6 > 0 && size > i6) {
            size = i6;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int min = Math.min(gm.L(320.0f), paddingLeft);
        int i7 = 0;
        float f4 = -1.0f;
        while (true) {
            iArr = U;
            fArr = T;
            if (i7 < 3) {
                if (fArr[i7] != f4) {
                    int childCount = getChildCount();
                    float[] fArr2 = this.x;
                    if (fArr2 == null || fArr2.length < childCount) {
                        this.x = new float[childCount];
                        this.y = new float[childCount];
                        this.E = new int[childCount];
                        this.G = new int[childCount];
                        this.F = new int[childCount];
                    }
                    int i8 = 0;
                    for (int i9 = 0; i9 < childCount; i9++) {
                        View childAt = getChildAt(i9);
                        if (!d(childAt)) {
                            this.x[i9] = -1.0f;
                        } else {
                            if (childAt instanceof dj6) {
                                qz4 qz4Var = (qz4) ((dj6) childAt);
                                TextPaint textPaint = qz4Var.U;
                                if (textPaint == null) {
                                    textPaint = new TextPaint(qz4Var.G);
                                    qz4Var.U = textPaint;
                                }
                                textPaint.setTextSize(gm.L(f2));
                                f3 = qz4Var.U.measureText(qz4Var.a.getText().toString());
                            } else {
                                f3 = 0.0f;
                            }
                            this.x[i9] = f3;
                            i8++;
                        }
                    }
                    i3 = 0;
                    f = 0.0f;
                    i4 = 1;
                    this.H = i8;
                    f4 = fArr[i7];
                } else {
                    i3 = 0;
                    f = 0.0f;
                    i4 = 1;
                }
                int L = gm.L(iArr[i7]);
                int childCount2 = getChildCount();
                float f5 = f;
                for (int i10 = i3; i10 < childCount2; i10++) {
                    if (d(getChildAt(i10))) {
                        f5 += this.x[i10] + (L << 1);
                    }
                }
                if (f5 <= paddingLeft || i7 == 2) {
                    break;
                }
                i7++;
            } else {
                i3 = 0;
                f = 0.0f;
                i4 = 1;
                i7 = 2;
                break;
            }
        }
        float f6 = fArr[i7];
        int childCount3 = getChildCount();
        for (int i11 = i3; i11 < childCount3; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2 instanceof dj6) {
                ((qz4) ((dj6) childAt2)).setTextSizeDp(f6);
            }
        }
        int L2 = gm.L(iArr[i7]);
        int i12 = i4;
        int i13 = L2 << i12;
        int max = (paddingLeft / Math.max(i12, this.H)) - i13;
        int childCount4 = getChildCount();
        int i14 = i3;
        int i15 = i14;
        float f7 = f;
        while (i14 < childCount4) {
            if (!d(getChildAt(i14))) {
                float[] fArr3 = this.x;
                this.y[i14] = f;
                fArr3[i14] = f;
                this.E[i14] = i3;
            } else {
                float[] fArr4 = this.y;
                float f8 = this.x[i14] + i13;
                fArr4[i14] = f8;
                int[] iArr2 = this.E;
                if (f8 > max + i13) {
                    i5 = i3;
                } else {
                    i5 = i12;
                }
                iArr2[i14] = i5;
                f7 += f8;
                i15 += i5;
            }
            i14++;
        }
        if (i15 == 0) {
            int childCount5 = getChildCount();
            for (int i16 = i3; i16 < childCount5; i16++) {
                this.E[i16] = d(getChildAt(i16)) ? 1 : 0;
            }
            i15 = this.H;
        }
        float f9 = paddingLeft;
        if (f7 > f9) {
            float f10 = f9 / f7;
            int childCount6 = getChildCount();
            for (int i17 = i3; i17 < childCount6; i17++) {
                float[] fArr5 = this.y;
                fArr5[i17] = fArr5[i17] * f10;
            }
        } else {
            float f11 = min;
            if (f7 < f11) {
                float f12 = (f11 - f7) / i15;
                int childCount7 = getChildCount();
                for (int i18 = i3; i18 < childCount7; i18++) {
                    float[] fArr6 = this.y;
                    fArr6[i18] = (this.E[i18] * f12) + fArr6[i18];
                }
            }
        }
        int childCount8 = getChildCount();
        int i19 = i3;
        int i20 = i19;
        while (i19 < childCount8) {
            if (d(getChildAt(i19))) {
                this.F[i19] = Math.round(this.y[i19]);
                this.G[i19] = i20;
                i20 += this.F[i19];
            }
            i19++;
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i20, size2);
        int childCount9 = getChildCount();
        for (int i21 = i3; i21 < childCount9; i21++) {
            getChildAt(i21).measure(View.MeasureSpec.makeMeasureSpec(this.F[i21], 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
        }
        a();
    }

    public final void q() {
        setSkipDrawSelector(false);
    }

    public final void r(View view, boolean z) {
        boolean z2;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof qz4) {
                qz4 qz4Var = (qz4) childAt;
                if (childAt == view) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                qz4Var.f(z2, z);
            }
        }
    }

    public void setMaxWidth(int i) {
        if (this.w != i) {
            this.w = i;
            requestLayout();
        }
    }

    @Override
    public void setScaleX(float f) {
        super.setScaleX(f);
        l();
    }

    @Override
    public void setScaleY(float f) {
        super.setScaleY(f);
        l();
    }
}
