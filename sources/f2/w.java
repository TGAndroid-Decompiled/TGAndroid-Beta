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
import java.util.WeakHashMap;
public class w extends j0 {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public v O;
    public final Rect P;

    public w(int i10) {
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new t(0);
        this.P = new Rect();
        y1(i10);
    }

    @Override
    public final void A0(j1 j1Var, h0 h0Var, androidx.datastore.preferences.protobuf.i iVar) {
        int i10 = this.J;
        for (int i11 = 0; i11 < this.J && h0Var.b(j1Var) && i10 > 0; i11++) {
            int i12 = h0Var.d;
            iVar.a(i12, Math.max(0, h0Var.f5787g));
            i10 -= this.O.i(i12);
            h0Var.d += h0Var.f5785e;
        }
    }

    public final void A1() {
        int C;
        int F;
        if (this.f5816o == 1) {
            C = this.f5950m - E();
            F = D();
        } else {
            C = this.f5951n - C();
            F = F();
        }
        int i10 = C - F;
        this.K = q1(this.J, i10, this.K);
    }

    @Override
    public int I(bf.f fVar, j1 j1Var) {
        if (this.f5816o == 0) {
            return this.J;
        }
        if (j1Var.b() < 1) {
            return 0;
        }
        return t1(j1Var.b() - 1, fVar, j1Var) + 1;
    }

    @Override
    public final View Q0(bf.f fVar, j1 j1Var, int i10, int i11, int i12) {
        int i13;
        G0();
        int j10 = this.f5818q.j();
        int f10 = this.f5818q.f();
        if (i11 > i10) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View q10 = q(i10);
            int H = w0.H(q10);
            if (H >= 0 && H < i12 && u1(H, fVar, j1Var) == 0) {
                if (((x0) q10.getLayoutParams()).f5952a.j()) {
                    if (view2 == null) {
                        view2 = q10;
                    }
                } else if (this.f5818q.d(q10) < f10 && this.f5818q.a(q10) >= j10) {
                    return q10;
                } else {
                    if (view == null) {
                        view = q10;
                    }
                }
            }
            i10 += i13;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    @Override
    public final android.view.View R(android.view.View r23, int r24, bf.f r25, f2.j1 r26) {
        throw new UnsupportedOperationException("Method not decompiled: f2.w.R(android.view.View, int, bf.f, f2.j1):android.view.View");
    }

    @Override
    public void U(bf.f fVar, j1 j1Var, View view, s0.d dVar) {
        boolean z4;
        boolean z10;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f46881a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof u)) {
            T(view, dVar);
            return;
        }
        u uVar = (u) layoutParams;
        int t12 = t1(uVar.b(), fVar, j1Var);
        if (this.f5816o == 0) {
            int i10 = uVar.f5926e;
            int i11 = uVar.f5927f;
            int i12 = this.J;
            if (i12 > 1 && i11 == i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, t12, 1, z10, false));
            return;
        }
        int i13 = uVar.f5926e;
        int i14 = uVar.f5927f;
        int i15 = this.J;
        if (i15 > 1 && i14 == i15) {
            z4 = true;
        } else {
            z4 = false;
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(t12, 1, i13, i14, z4, false));
    }

    @Override
    public void V(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.f5939b).clear();
    }

    @Override
    public void W(RecyclerView recyclerView) {
        this.O.j();
        ((SparseIntArray) this.O.f5939b).clear();
    }

    @Override
    public void X(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.f5939b).clear();
    }

    @Override
    public void Y(RecyclerView recyclerView, int i10, int i11) {
        this.O.j();
        ((SparseIntArray) this.O.f5939b).clear();
    }

    @Override
    public void Z0(bf.f r18, f2.j1 r19, f2.h0 r20, f2.g0 r21) {
        throw new UnsupportedOperationException("Method not decompiled: f2.w.Z0(bf.f, f2.j1, f2.h0, f2.g0):void");
    }

    @Override
    public void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.O.j();
        ((SparseIntArray) this.O.f5939b).clear();
    }

    @Override
    public final void a1(bf.f fVar, j1 j1Var, b4.v vVar, int i10) {
        boolean z4;
        A1();
        if (j1Var.b() > 0 && !j1Var.f5832g) {
            if (i10 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            int u12 = u1(vVar.f1651b, fVar, j1Var);
            if (z4) {
                while (u12 > 0) {
                    int i11 = vVar.f1651b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    vVar.f1651b = i12;
                    u12 = u1(i12, fVar, j1Var);
                }
            } else {
                int b10 = j1Var.b() - 1;
                int i13 = vVar.f1651b;
                while (i13 < b10) {
                    int i14 = i13 + 1;
                    int u13 = u1(i14, fVar, j1Var);
                    if (u13 <= u12) {
                        break;
                    }
                    i13 = i14;
                    u12 = u13;
                }
                vVar.f1651b = i13;
            }
        }
        r1();
    }

    @Override
    public void b0(bf.f fVar, j1 j1Var) {
        boolean z4 = j1Var.f5832g;
        SparseIntArray sparseIntArray = this.N;
        SparseIntArray sparseIntArray2 = this.M;
        if (z4) {
            int r10 = r();
            for (int i10 = 0; i10 < r10; i10++) {
                u uVar = (u) q(i10).getLayoutParams();
                int b10 = uVar.b();
                sparseIntArray2.put(b10, uVar.f5927f);
                sparseIntArray.put(b10, uVar.f5926e);
            }
        }
        super.b0(fVar, j1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override
    public final void c0(j1 j1Var) {
        super.c0(j1Var);
        this.I = false;
    }

    @Override
    public final boolean f(x0 x0Var) {
        return x0Var instanceof u;
    }

    @Override
    public final int h(j1 j1Var) {
        return C0(j1Var);
    }

    @Override
    public final int i(j1 j1Var) {
        return D0(j1Var);
    }

    @Override
    public int k(j1 j1Var) {
        return C0(j1Var);
    }

    @Override
    public int l(j1 j1Var) {
        return D0(j1Var);
    }

    @Override
    public final void l1(boolean z4) {
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override
    public final int m0(int i10, bf.f fVar, j1 j1Var) {
        A1();
        r1();
        return super.m0(i10, fVar, j1Var);
    }

    @Override
    public final x0 n() {
        if (this.f5816o == 0) {
            return new u(-2, -1);
        }
        return new u(-1, -2);
    }

    @Override
    public final x0 o(Context context, AttributeSet attributeSet) {
        ?? x0Var = new x0(context, attributeSet);
        x0Var.f5926e = -1;
        x0Var.f5927f = 0;
        return x0Var;
    }

    @Override
    public int o0(int i10, bf.f fVar, j1 j1Var) {
        A1();
        r1();
        return super.o0(i10, fVar, j1Var);
    }

    @Override
    public final x0 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? x0Var = new x0((ViewGroup.MarginLayoutParams) layoutParams);
            x0Var.f5926e = -1;
            x0Var.f5927f = 0;
            return x0Var;
        }
        ?? x0Var2 = new x0(layoutParams);
        x0Var2.f5926e = -1;
        x0Var2.f5927f = 0;
        return x0Var2;
    }

    public final void p1(int i10, bf.f fVar, j1 j1Var, boolean z4) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z4) {
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
            u uVar = (u) view.getLayoutParams();
            int v12 = v1(((x0) view.getLayoutParams()).b(), fVar, j1Var);
            uVar.f5927f = v12;
            uVar.f5926e = i14;
            i14 += v12;
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
            if (i13 > 0 && i10 - i13 < i15) {
                i12 = i14 + 1;
                i13 -= i10;
            } else {
                i12 = i14;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    @Override
    public final void r0(Rect rect, int i10, int i11) {
        int g10;
        int g11;
        if (this.K == null) {
            super.r0(rect, i10, i11);
        }
        int E = E() + D();
        int C = C() + F();
        if (this.f5816o == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.f5941b;
            WeakHashMap weakHashMap = r0.j0.f46469a;
            g11 = w0.g(i11, height, recyclerView.getMinimumHeight());
            int[] iArr = this.K;
            g10 = w0.g(i10, iArr[iArr.length - 1] + E, this.f5941b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.f5941b;
            WeakHashMap weakHashMap2 = r0.j0.f46469a;
            g10 = w0.g(i10, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.K;
            g11 = w0.g(i11, iArr2[iArr2.length - 1] + C, this.f5941b.getMinimumHeight());
        }
        this.f5941b.setMeasuredDimension(g10, g11);
    }

    public final void r1() {
        View[] viewArr = this.L;
        if (viewArr != null && viewArr.length == this.J) {
            return;
        }
        this.L = new View[this.J];
    }

    public final int s1(int i10, int i11) {
        if (this.f5816o == 1 && Y0()) {
            int[] iArr = this.K;
            int i12 = this.J;
            return iArr[i12 - i10] - iArr[(i12 - i10) - i11];
        }
        int[] iArr2 = this.K;
        return iArr2[i11 + i10] - iArr2[i10];
    }

    public final int t1(int i10, bf.f fVar, j1 j1Var) {
        if (!j1Var.f5832g) {
            return this.O.g(i10, this.J);
        }
        int b10 = fVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
            return 0;
        }
        return this.O.g(b10, this.J);
    }

    @Override
    public int u(bf.f fVar, j1 j1Var) {
        if (this.f5816o == 1) {
            return this.J;
        }
        if (j1Var.b() < 1) {
            return 0;
        }
        return t1(j1Var.b() - 1, fVar, j1Var) + 1;
    }

    public final int u1(int i10, bf.f fVar, j1 j1Var) {
        if (!j1Var.f5832g) {
            return this.O.h(i10, this.J);
        }
        int i11 = this.N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = fVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 0;
        }
        return this.O.h(b10, this.J);
    }

    public final int v1(int i10, bf.f fVar, j1 j1Var) {
        if (!j1Var.f5832g) {
            return this.O.i(i10);
        }
        int i11 = this.M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = fVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 1;
        }
        return this.O.i(b10);
    }

    public void w1(View view, int i10, boolean z4) {
        int i11;
        int i12;
        u uVar = (u) view.getLayoutParams();
        Rect rect = uVar.f5953b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) uVar).topMargin + ((ViewGroup.MarginLayoutParams) uVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) uVar).leftMargin + ((ViewGroup.MarginLayoutParams) uVar).rightMargin;
        int s12 = s1(uVar.f5926e, uVar.f5927f);
        if (this.f5816o == 1) {
            i12 = w0.s(false, s12, i10, i14, ((ViewGroup.MarginLayoutParams) uVar).width);
            i11 = w0.s(true, this.f5818q.k(), this.f5949l, i13, ((ViewGroup.MarginLayoutParams) uVar).height);
        } else {
            int s6 = w0.s(false, s12, i10, i13, ((ViewGroup.MarginLayoutParams) uVar).height);
            int s9 = w0.s(true, this.f5818q.k(), this.f5948k, i14, ((ViewGroup.MarginLayoutParams) uVar).width);
            i11 = s6;
            i12 = s9;
        }
        x1(i12, i11, view, z4);
    }

    public final void x1(int i10, int i11, View view, boolean z4) {
        boolean u02;
        x0 x0Var = (x0) view.getLayoutParams();
        if (z4) {
            if (this.f5945g && w0.N(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) x0Var).width) && w0.N(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) x0Var).height)) {
                u02 = false;
            } else {
                u02 = true;
            }
        } else {
            u02 = u0(view, i10, i11, x0Var);
        }
        if (u02) {
            view.measure(i10, i11);
        }
    }

    @Override
    public boolean y0() {
        if (this.B == null && !this.I) {
            return true;
        }
        return false;
    }

    public void y1(int i10) {
        if (i10 == this.J) {
            return;
        }
        this.I = true;
        if (i10 >= 1) {
            this.J = i10;
            this.O.j();
            l0();
            return;
        }
        throw new IllegalArgumentException(l.d.j(i10, "Span count should be at least 1. Provided "));
    }

    public final void z1(v vVar) {
        this.O = vVar;
    }

    public w(int i10, boolean z4) {
        super(1, z4);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new t(0);
        this.P = new Rect();
        y1(i10);
    }
}
