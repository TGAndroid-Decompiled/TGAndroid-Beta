package f2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

public class x extends k0 {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public w O;
    public final Rect P;

    public x(int i10) {
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new u(0);
        this.P = new Rect();
        y1(i10);
    }

    @Override
    public final void A0(l1 l1Var, i0 i0Var, androidx.datastore.preferences.protobuf.i iVar) {
        int i10 = this.J;
        for (int i11 = 0; i11 < this.J && i0Var.b(l1Var) && i10 > 0; i11++) {
            int i12 = i0Var.d;
            iVar.a(i12, Math.max(0, i0Var.f5696g));
            i10 -= this.O.i(i12);
            i0Var.d += i0Var.f5694e;
        }
    }

    public final void A1() {
        int iC;
        int iF;
        if (this.f5720o == 1) {
            iC = this.f5862m - E();
            iF = D();
        } else {
            iC = this.f5863n - C();
            iF = F();
        }
        int i10 = iC - iF;
        this.K = q1(this.J, i10, this.K);
    }

    @Override
    public int I(e1 e1Var, l1 l1Var) {
        if (this.f5720o == 0) {
            return this.J;
        }
        if (l1Var.b() < 1) {
            return 0;
        }
        return t1(l1Var.b() - 1, e1Var, l1Var) + 1;
    }

    @Override
    public final View Q0(e1 e1Var, l1 l1Var, int i10, int i11, int i12) {
        G0();
        int iJ = this.f5722q.j();
        int iF = this.f5722q.f();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View viewQ = q(i10);
            int iH = x0.H(viewQ);
            if (iH >= 0 && iH < i12 && u1(iH, e1Var, l1Var) == 0) {
                if (((y0) viewQ.getLayoutParams()).f5864a.j()) {
                    if (view2 == null) {
                        view2 = viewQ;
                    }
                } else {
                    if (this.f5722q.d(viewQ) < iF && this.f5722q.a(viewQ) >= iJ) {
                        return viewQ;
                    }
                    if (view == null) {
                        view = viewQ;
                    }
                }
            }
            i10 += i13;
        }
        return view != null ? view : view2;
    }

    @Override
    public final android.view.View R(android.view.View r23, int r24, f2.e1 r25, f2.l1 r26) {
        throw new UnsupportedOperationException("Method not decompiled: f2.x.R(android.view.View, int, f2.e1, f2.l1):android.view.View");
    }

    @Override
    public void U(e1 e1Var, l1 l1Var, View view, s0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f47656a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof v)) {
            T(view, cVar);
            return;
        }
        v vVar = (v) layoutParams;
        int iT1 = t1(vVar.b(), e1Var, l1Var);
        if (this.f5720o == 0) {
            int i10 = vVar.f5838e;
            int i11 = vVar.f5839f;
            int i12 = this.J;
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, iT1, 1, i12 > 1 && i11 == i12, false));
            return;
        }
        int i13 = vVar.f5838e;
        int i14 = vVar.f5839f;
        int i15 = this.J;
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iT1, 1, i13, i14, i15 > 1 && i14 == i15, false));
    }

    @Override
    public void V(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.f5851b).clear();
    }

    @Override
    public void W(RecyclerView recyclerView) {
        this.O.j();
        ((SparseIntArray) this.O.f5851b).clear();
    }

    @Override
    public void X(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.f5851b).clear();
    }

    @Override
    public void Y(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.f5851b).clear();
    }

    @Override
    public void Z0(e1 e1Var, l1 l1Var, i0 i0Var, h0 h0Var) {
        int i10;
        int i11;
        int iC;
        int i12;
        int iC2;
        int iC3;
        int i13;
        int iS;
        int iS2;
        View viewC;
        int i14 = this.f5722q.i();
        boolean z10 = i14 != 1073741824;
        int i15 = r() > 0 ? this.K[this.J] : 0;
        if (z10) {
            A1();
        }
        boolean z11 = i0Var.f5694e == 1;
        int iU1 = this.J;
        if (!z11) {
            iU1 = u1(i0Var.d, e1Var, l1Var) + v1(i0Var.d, e1Var, l1Var);
        }
        int i16 = 0;
        while (i16 < this.J && i0Var.b(l1Var) && iU1 > 0) {
            int i17 = i0Var.d;
            int iV1 = v1(i17, e1Var, l1Var);
            if (iV1 > this.J) {
                throw new IllegalArgumentException(a9.p.k(this.J, " spans.", com.google.android.recaptcha.internal.a.p("Item at position ", i17, " requires ", iV1, " spans but GridLayoutManager has only ")));
            }
            iU1 -= iV1;
            if (iU1 < 0 || (viewC = i0Var.c(e1Var)) == null) {
                break;
            }
            this.L[i16] = viewC;
            i16++;
        }
        if (i16 == 0) {
            h0Var.f5684b = true;
            return;
        }
        p1(i16, e1Var, l1Var, z11);
        float f10 = 0.0f;
        int i18 = 0;
        for (int i19 = 0; i19 < i16; i19++) {
            View view = this.L[i19];
            if (i0Var.f5699k == null) {
                if (z11) {
                    a(view, -1, false);
                } else {
                    a(view, 0, false);
                }
            } else if (z11) {
                a(view, -1, true);
            } else {
                a(view, 0, true);
            }
            c(view, this.P);
            w1(view, i14, false);
            int iB = this.f5722q.b(view);
            if (iB > i18) {
                i18 = iB;
            }
            float fC = (this.f5722q.c(view) * 1.0f) / ((v) view.getLayoutParams()).f5839f;
            if (fC > f10) {
                f10 = fC;
            }
        }
        if (z10) {
            this.K = q1(this.J, Math.max(Math.round(f10 * this.J), i15), this.K);
            i18 = 0;
            for (int i20 = 0; i20 < i16; i20++) {
                View view2 = this.L[i20];
                w1(view2, 1073741824, true);
                int iB2 = this.f5722q.b(view2);
                if (iB2 > i18) {
                    i18 = iB2;
                }
            }
        }
        for (int i21 = 0; i21 < i16; i21++) {
            View view3 = this.L[i21];
            if (this.f5722q.b(view3) != i18) {
                v vVar = (v) view3.getLayoutParams();
                Rect rect = vVar.f5865b;
                int i22 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) vVar).topMargin + ((ViewGroup.MarginLayoutParams) vVar).bottomMargin;
                int i23 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) vVar).leftMargin + ((ViewGroup.MarginLayoutParams) vVar).rightMargin;
                int iS1 = s1(vVar.f5838e, vVar.f5839f);
                if (this.f5720o == 1) {
                    iS2 = x0.s(false, iS1, 1073741824, i23, ((ViewGroup.MarginLayoutParams) vVar).width);
                    iS = View.MeasureSpec.makeMeasureSpec(i18 - i22, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - i23, 1073741824);
                    iS = x0.s(false, iS1, 1073741824, i22, ((ViewGroup.MarginLayoutParams) vVar).height);
                    iS2 = iMakeMeasureSpec;
                }
                x1(iS2, iS, view3, true);
            }
        }
        h0Var.f5683a = i18;
        if (this.f5720o == 1) {
            if (i0Var.f5695f == -1) {
                iC3 = i0Var.f5692b;
                i13 = iC3 - i18;
            } else {
                i13 = i0Var.f5692b;
                iC3 = i13 + i18;
            }
            i12 = i13;
            iC2 = 0;
            iC = 0;
        } else {
            if (i0Var.f5695f == -1) {
                i11 = i0Var.f5692b;
                i10 = i11 - i18;
            } else {
                i10 = i0Var.f5692b;
                i11 = i10 + i18;
            }
            iC = i10;
            i12 = 0;
            iC2 = i11;
            iC3 = 0;
        }
        for (int i24 = 0; i24 < i16; i24++) {
            View view4 = this.L[i24];
            v vVar2 = (v) view4.getLayoutParams();
            if (this.f5720o != 1) {
                int iF = F() + this.K[vVar2.f5838e];
                i12 = iF;
                iC3 = this.f5722q.c(view4) + iF;
            } else if (Y0()) {
                iC2 = D() + this.K[this.J - vVar2.f5838e];
                iC = iC2 - this.f5722q.c(view4);
            } else {
                int iD = D() + this.K[vVar2.f5838e];
                iC = iD;
                iC2 = this.f5722q.c(view4) + iD;
            }
            x0.O(view4, iC, i12, iC2, iC3);
            if (vVar2.f5864a.j() || vVar2.f5864a.m()) {
                h0Var.f5685c = true;
            }
            h0Var.d = view4.hasFocusable() | h0Var.d;
        }
        Arrays.fill(this.L, (Object) null);
    }

    @Override
    public void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.O.j();
        ((SparseIntArray) this.O.f5851b).clear();
    }

    @Override
    public final void a1(e1 e1Var, l1 l1Var, g0 g0Var, int i10) {
        A1();
        if (l1Var.b() > 0 && !l1Var.f5762g) {
            boolean z10 = i10 == 1;
            int iU1 = u1(g0Var.f5672b, e1Var, l1Var);
            if (z10) {
                while (iU1 > 0) {
                    int i11 = g0Var.f5672b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    g0Var.f5672b = i12;
                    iU1 = u1(i12, e1Var, l1Var);
                }
            } else {
                int iB = l1Var.b() - 1;
                int i13 = g0Var.f5672b;
                while (i13 < iB) {
                    int i14 = i13 + 1;
                    int iU2 = u1(i14, e1Var, l1Var);
                    if (iU2 <= iU1) {
                        break;
                    }
                    i13 = i14;
                    iU1 = iU2;
                }
                g0Var.f5672b = i13;
            }
        }
        r1();
    }

    @Override
    public void b0(e1 e1Var, l1 l1Var) {
        boolean z10 = l1Var.f5762g;
        SparseIntArray sparseIntArray = this.N;
        SparseIntArray sparseIntArray2 = this.M;
        if (z10) {
            int iR = r();
            for (int i10 = 0; i10 < iR; i10++) {
                v vVar = (v) q(i10).getLayoutParams();
                int iB = vVar.b();
                sparseIntArray2.put(iB, vVar.f5839f);
                sparseIntArray.put(iB, vVar.f5838e);
            }
        }
        super.b0(e1Var, l1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override
    public final void c0(l1 l1Var) {
        super.c0(l1Var);
        this.I = false;
    }

    @Override
    public final boolean f(y0 y0Var) {
        return y0Var instanceof v;
    }

    @Override
    public final int h(l1 l1Var) {
        return C0(l1Var);
    }

    @Override
    public final int i(l1 l1Var) {
        return D0(l1Var);
    }

    @Override
    public int k(l1 l1Var) {
        return C0(l1Var);
    }

    @Override
    public int l(l1 l1Var) {
        return D0(l1Var);
    }

    @Override
    public final void l1(boolean z10) {
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override
    public final int m0(int i10, e1 e1Var, l1 l1Var) {
        A1();
        r1();
        return super.m0(i10, e1Var, l1Var);
    }

    @Override
    public final y0 n() {
        return this.f5720o == 0 ? new v(-2, -1) : new v(-1, -2);
    }

    @Override
    public final y0 o(Context context, AttributeSet attributeSet) {
        v vVar = new v(context, attributeSet);
        vVar.f5838e = -1;
        vVar.f5839f = 0;
        return vVar;
    }

    @Override
    public int o0(int i10, e1 e1Var, l1 l1Var) {
        A1();
        r1();
        return super.o0(i10, e1Var, l1Var);
    }

    @Override
    public final y0 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            v vVar = new v((ViewGroup.MarginLayoutParams) layoutParams);
            vVar.f5838e = -1;
            vVar.f5839f = 0;
            return vVar;
        }
        v vVar2 = new v(layoutParams);
        vVar2.f5838e = -1;
        vVar2.f5839f = 0;
        return vVar2;
    }

    public final void p1(int i10, e1 e1Var, l1 l1Var, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i12 = i10;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.L[i11];
            v vVar = (v) view.getLayoutParams();
            int iV1 = v1(((y0) view.getLayoutParams()).b(), e1Var, l1Var);
            vVar.f5839f = iV1;
            vVar.f5838e = i14;
            i14 += iV1;
            i11 += i13;
        }
    }

    public int[] q1(int i10, int i11, int[] iArr) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    @Override
    public final void r0(Rect rect, int i10, int i11) {
        int iG;
        int iG2;
        if (this.K == null) {
            super.r0(rect, i10, i11);
        }
        int iE = E() + D();
        int iC = C() + F();
        if (this.f5720o == 1) {
            int iHeight = rect.height() + iC;
            RecyclerView recyclerView = this.f5853b;
            WeakHashMap weakHashMap = r0.j0.f46605a;
            iG2 = x0.g(i11, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.K;
            iG = x0.g(i10, iArr[iArr.length - 1] + iE, this.f5853b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iE;
            RecyclerView recyclerView2 = this.f5853b;
            WeakHashMap weakHashMap2 = r0.j0.f46605a;
            iG = x0.g(i10, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.K;
            iG2 = x0.g(i11, iArr2[iArr2.length - 1] + iC, this.f5853b.getMinimumHeight());
        }
        this.f5853b.setMeasuredDimension(iG, iG2);
    }

    public final void r1() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    public final int s1(int i10, int i11) {
        if (this.f5720o != 1 || !Y0()) {
            int[] iArr = this.K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.K;
        int i12 = this.J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public final int t1(int i10, e1 e1Var, l1 l1Var) {
        if (!l1Var.f5762g) {
            return this.O.g(i10, this.J);
        }
        int iB = e1Var.b(i10);
        if (iB != -1) {
            return this.O.g(iB, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    @Override
    public int u(e1 e1Var, l1 l1Var) {
        if (this.f5720o == 1) {
            return this.J;
        }
        if (l1Var.b() < 1) {
            return 0;
        }
        return t1(l1Var.b() - 1, e1Var, l1Var) + 1;
    }

    public final int u1(int i10, e1 e1Var, l1 l1Var) {
        if (!l1Var.f5762g) {
            return this.O.h(i10, this.J);
        }
        int i11 = this.N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iB = e1Var.b(i10);
        if (iB != -1) {
            return this.O.h(iB, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    public final int v1(int i10, e1 e1Var, l1 l1Var) {
        if (!l1Var.f5762g) {
            return this.O.i(i10);
        }
        int i11 = this.M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iB = e1Var.b(i10);
        if (iB != -1) {
            return this.O.i(iB);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    public void w1(View view, int i10, boolean z10) {
        int iS;
        int iS2;
        v vVar = (v) view.getLayoutParams();
        Rect rect = vVar.f5865b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) vVar).topMargin + ((ViewGroup.MarginLayoutParams) vVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) vVar).leftMargin + ((ViewGroup.MarginLayoutParams) vVar).rightMargin;
        int iS1 = s1(vVar.f5838e, vVar.f5839f);
        if (this.f5720o == 1) {
            iS2 = x0.s(false, iS1, i10, i12, ((ViewGroup.MarginLayoutParams) vVar).width);
            iS = x0.s(true, this.f5722q.k(), this.f5861l, i11, ((ViewGroup.MarginLayoutParams) vVar).height);
        } else {
            int iS3 = x0.s(false, iS1, i10, i11, ((ViewGroup.MarginLayoutParams) vVar).height);
            int iS4 = x0.s(true, this.f5722q.k(), this.f5860k, i12, ((ViewGroup.MarginLayoutParams) vVar).width);
            iS = iS3;
            iS2 = iS4;
        }
        x1(iS2, iS, view, z10);
    }

    public final void x1(int i10, int i11, View view, boolean z10) {
        boolean zU0;
        y0 y0Var = (y0) view.getLayoutParams();
        if (z10) {
            zU0 = (this.f5857g && x0.N(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) y0Var).width) && x0.N(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) y0Var).height)) ? false : true;
        } else {
            zU0 = u0(view, i10, i11, y0Var);
        }
        if (zU0) {
            view.measure(i10, i11);
        }
    }

    @Override
    public boolean y0() {
        return this.B == null && !this.I;
    }

    public void y1(int i10) {
        if (i10 == this.J) {
            return;
        }
        this.I = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(i0.a.k(i10, "Span count should be at least 1. Provided "));
        }
        this.J = i10;
        this.O.j();
        l0();
    }

    public final void z1(w wVar) {
        this.O = wVar;
    }

    public x(int i10, boolean z10) {
        super(1, z10);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new u(0);
        this.P = new Rect();
        y1(i10);
    }
}
