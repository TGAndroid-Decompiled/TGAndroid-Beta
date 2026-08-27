package f2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class y extends x {
    public final ArrayList Q;
    public boolean R;

    public y(boolean z10) {
        super(1000, z10);
        this.Q = new ArrayList(4);
        this.R = true;
    }

    public abstract boolean B1(int i10);

    public abstract boolean C1(View view);

    @Override
    public final void Z0(e1 e1Var, l1 l1Var, i0 i0Var, h0 h0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        v vVar;
        int iC;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z10;
        int iB;
        float fC;
        View viewC;
        e1 e1Var2 = e1Var;
        int i22 = this.f5722q.i();
        int i23 = 0;
        boolean z11 = i0Var.f5694e == 1;
        h0Var.f5683a = 0;
        int i24 = i0Var.d;
        boolean z12 = this.v;
        Rect rect = this.P;
        ArrayList arrayList = this.Q;
        int i25 = -1;
        if (z12 && i0Var.f5695f != -1 && B1(i24) && m(i0Var.d + 1) == null) {
            if (B1(i0Var.d + 1)) {
                i0Var.d += 3;
            } else {
                i0Var.d += 2;
            }
            int i26 = i0Var.d;
            for (int i27 = i26; i27 > i24; i27--) {
                View viewC2 = i0Var.c(e1Var2);
                if (viewC2 != null) {
                    arrayList.add(viewC2);
                    if (i27 != i26) {
                        c(viewC2, rect);
                        w1(viewC2, i22, false);
                        int iB2 = this.f5722q.b(viewC2);
                        i0Var.f5692b -= iB2;
                        i0Var.f5693c += iB2;
                    }
                }
            }
            i0Var.d = i26;
        }
        boolean z13 = true;
        while (z13) {
            int iV1 = this.J;
            boolean z14 = !arrayList.isEmpty();
            int i28 = 0;
            while (i28 < this.J && i0Var.b(l1Var) && iV1 > 0) {
                int i29 = i0Var.d;
                iV1 -= v1(i29, e1Var2, l1Var);
                if (iV1 < 0) {
                    break;
                }
                if (arrayList.isEmpty()) {
                    viewC = i0Var.c(e1Var2);
                } else {
                    viewC = (View) arrayList.get(i23);
                    arrayList.remove(i23);
                    i0Var.d--;
                }
                if (viewC == null) {
                    break;
                }
                this.L[i28] = viewC;
                i28++;
                if (i0Var.f5695f == i25 && iV1 <= 0 && B1(i29)) {
                    z14 = true;
                }
                i23 = 0;
            }
            if (i28 == 0) {
                h0Var.f5684b = true;
                return;
            }
            p1(i28, e1Var2, l1Var, z11);
            float f10 = 0.0f;
            int i30 = 0;
            for (int i31 = 0; i31 < i28; i31++) {
                View view = this.L[i31];
                if (i0Var.f5699k != null) {
                    if (z11) {
                        a(view, -1, true);
                    } else {
                        z10 = false;
                        a(view, 0, true);
                    }
                    c(view, rect);
                    w1(view, i22, z10);
                    iB = this.f5722q.b(view);
                    if (iB > i30) {
                        i30 = iB;
                    }
                    fC = (this.f5722q.c(view) * 1.0f) / ((v) view.getLayoutParams()).f5839f;
                    if (fC > f10) {
                        f10 = fC;
                    }
                } else if (z11) {
                    a(view, -1, false);
                } else {
                    a(view, 0, false);
                }
                z10 = false;
                c(view, rect);
                w1(view, i22, z10);
                iB = this.f5722q.b(view);
                if (iB > i30) {
                    i30 = iB;
                }
                fC = (this.f5722q.c(view) * 1.0f) / ((v) view.getLayoutParams()).f5839f;
                if (fC > f10) {
                    f10 = fC;
                }
            }
            int i32 = 0;
            while (i32 < i28) {
                View view2 = this.L[i32];
                if (this.f5722q.b(view2) != i30) {
                    v vVar2 = (v) view2.getLayoutParams();
                    Rect rect2 = vVar2.f5865b;
                    x1(x0.s(false, this.K[vVar2.f5839f], 1073741824, rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) vVar2).leftMargin + ((ViewGroup.MarginLayoutParams) vVar2).rightMargin, ((ViewGroup.MarginLayoutParams) vVar2).width), View.MeasureSpec.makeMeasureSpec(i30 - (((rect2.top + rect2.bottom) + ((ViewGroup.MarginLayoutParams) vVar2).topMargin) + ((ViewGroup.MarginLayoutParams) vVar2).bottomMargin), 1073741824), view2, true);
                }
                i32++;
                i22 = i22;
            }
            int i33 = i22;
            boolean zC1 = C1(this.L[0]);
            if (zC1) {
                i10 = -1;
                if (i0Var.f5695f == -1) {
                    if (i0Var.f5695f == i10) {
                        int i34 = i0Var.f5692b - h0Var.f5683a;
                        i16 = i34 - i30;
                        i14 = i34;
                        i15 = 0;
                    } else {
                        int i35 = h0Var.f5683a + i0Var.f5692b;
                        i14 = i35 + i30;
                        i15 = this.f5862m;
                        i16 = i35;
                    }
                    for (i17 = i28 - 1; i17 >= 0; i17--) {
                        View view3 = this.L[i17];
                        vVar = (v) view3.getLayoutParams();
                        iC = this.f5722q.c(view3);
                        i18 = i15;
                        if (i0Var.f5695f == 1) {
                            i19 = i18 - iC;
                        } else {
                            i19 = i18;
                        }
                        i20 = iC + i19;
                        x0.O(view3, i19, i16, i20, i14);
                        i21 = i19;
                        if (i0Var.f5695f == -1) {
                            i15 = i20;
                        } else {
                            i15 = i21;
                        }
                        if (vVar.f5864a.j() || vVar.f5864a.m()) {
                            h0Var.f5685c = true;
                        }
                        h0Var.d |= view3.hasFocusable();
                    }
                }
                boolean z15 = z11;
                h0Var.f5683a += i30;
                Arrays.fill(this.L, (Object) null);
                e1Var2 = e1Var;
                z13 = z14;
                i22 = i33;
                z11 = z15;
                i23 = 0;
                i25 = -1;
            } else {
                i10 = -1;
            }
            if (zC1 || i0Var.f5695f != 1) {
                if (i0Var.f5695f == -1) {
                    int i36 = i0Var.f5692b - h0Var.f5683a;
                    int i37 = i36 - i30;
                    i12 = i36;
                    i13 = this.f5862m;
                    i11 = i37;
                } else {
                    int i38 = h0Var.f5683a + i0Var.f5692b;
                    i11 = i38;
                    i12 = i38 + i30;
                    i13 = 0;
                }
                int i39 = i13;
                int i40 = 0;
                while (i40 < i28) {
                    View view4 = this.L[i40];
                    v vVar3 = (v) view4.getLayoutParams();
                    int iC2 = this.f5722q.c(view4);
                    int i41 = i40;
                    boolean z16 = z11;
                    if (i0Var.f5695f == -1) {
                        i39 -= iC2;
                    }
                    int i42 = iC2 + i39;
                    x0.O(view4, i39, i11, i42, i12);
                    if (i0Var.f5695f == 1) {
                        i39 = i42;
                    }
                    if (vVar3.f5864a.j() || vVar3.f5864a.m()) {
                        h0Var.f5685c = true;
                    }
                    h0Var.d |= view4.hasFocusable();
                    i40 = i41 + 1;
                    z11 = z16;
                }
            } else {
                if (i0Var.f5695f == i10) {
                    int i310 = i0Var.f5692b - h0Var.f5683a;
                    i16 = i310 - i30;
                    i14 = i310;
                    i15 = 0;
                } else {
                    int i311 = h0Var.f5683a + i0Var.f5692b;
                    i14 = i311 + i30;
                    i15 = this.f5862m;
                    i16 = i311;
                }
                while (i17 >= 0) {
                    View view5 = this.L[i17];
                    vVar = (v) view5.getLayoutParams();
                    iC = this.f5722q.c(view5);
                    i18 = i15;
                    if (i0Var.f5695f == 1) {
                        i19 = i18 - iC;
                    } else {
                        i19 = i18;
                    }
                    i20 = iC + i19;
                    x0.O(view5, i19, i16, i20, i14);
                    i21 = i19;
                    if (i0Var.f5695f == -1) {
                        i15 = i20;
                    } else {
                        i15 = i21;
                    }
                    if (vVar.f5864a.j()) {
                        h0Var.f5685c = true;
                    } else {
                        h0Var.f5685c = true;
                    }
                    h0Var.d |= view5.hasFocusable();
                }
            }
            boolean z17 = z11;
            h0Var.f5683a += i30;
            Arrays.fill(this.L, (Object) null);
            e1Var2 = e1Var;
            z13 = z14;
            i22 = i33;
            z11 = z17;
            i23 = 0;
            i25 = -1;
        }
    }

    @Override
    public final boolean e() {
        return this.R;
    }

    @Override
    public final void e1(e1 e1Var, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int iR = r();
        if (!this.v) {
            for (int i12 = 0; i12 < iR; i12++) {
                View viewQ = q(i12);
                if (viewQ.getBottom() + ((ViewGroup.MarginLayoutParams) ((y0) viewQ.getLayoutParams())).bottomMargin <= i10) {
                    if (viewQ.getHeight() + viewQ.getTop() <= i10) {
                    }
                }
                d1(e1Var, 0, i12);
                return;
            }
            return;
        }
        int i13 = iR - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View viewQ2 = q(i14);
            if (viewQ2.getBottom() + ((ViewGroup.MarginLayoutParams) ((y0) viewQ2.getLayoutParams())).bottomMargin <= i10) {
                if (viewQ2.getHeight() + viewQ2.getTop() <= i10) {
                }
            }
            d1(e1Var, i13, i14);
            return;
        }
    }

    @Override
    public final int[] q1(int i10, int i11, int[] iArr) {
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        iArr[0] = 0;
        for (int i12 = 1; i12 <= i10; i12++) {
            iArr[i12] = (int) Math.ceil((i12 / i10) * i11);
        }
        return iArr;
    }

    @Override
    public final void w1(View view, int i10, boolean z10) {
        v vVar = (v) view.getLayoutParams();
        Rect rect = vVar.f5865b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) vVar).topMargin + ((ViewGroup.MarginLayoutParams) vVar).bottomMargin;
        x1(x0.s(false, this.K[vVar.f5839f], i10, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) vVar).leftMargin + ((ViewGroup.MarginLayoutParams) vVar).rightMargin, ((ViewGroup.MarginLayoutParams) vVar).width), x0.s(true, this.f5722q.k(), this.f5861l, i11, ((ViewGroup.MarginLayoutParams) vVar).height), view, z10);
    }
}
