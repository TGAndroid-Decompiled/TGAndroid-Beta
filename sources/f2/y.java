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
public class y extends m0 {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public x O;
    public final Rect P;

    public y(int i9) {
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new v(0);
        this.P = new Rect();
        y1(i9);
    }

    @Override
    public final void A0(n1 n1Var, k0 k0Var, androidx.datastore.preferences.protobuf.i iVar) {
        int i9 = this.J;
        for (int i10 = 0; i10 < this.J && k0Var.b(n1Var) && i9 > 0; i10++) {
            int i11 = k0Var.d;
            iVar.a(i11, Math.max(0, k0Var.f5408g));
            i9 -= this.O.i(i11);
            k0Var.d += k0Var.f5406e;
        }
    }

    public final void A1() {
        int C;
        int F;
        if (this.f5432o == 1) {
            C = this.f5572m - E();
            F = D();
        } else {
            C = this.f5573n - C();
            F = F();
        }
        int i9 = C - F;
        this.K = q1(this.J, i9, this.K);
    }

    @Override
    public int I(g1 g1Var, n1 n1Var) {
        if (this.f5432o == 0) {
            return this.J;
        }
        if (n1Var.b() < 1) {
            return 0;
        }
        return t1(n1Var.b() - 1, g1Var, n1Var) + 1;
    }

    @Override
    public final View Q0(g1 g1Var, n1 n1Var, int i9, int i10, int i11) {
        int i12;
        G0();
        int j10 = this.f5434q.j();
        int f10 = this.f5434q.f();
        if (i10 > i9) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        View view = null;
        View view2 = null;
        while (i9 != i10) {
            View q10 = q(i9);
            int H = z0.H(q10);
            if (H >= 0 && H < i11 && u1(H, g1Var, n1Var) == 0) {
                if (((a1) q10.getLayoutParams()).f5311a.j()) {
                    if (view2 == null) {
                        view2 = q10;
                    }
                } else if (this.f5434q.d(q10) < f10 && this.f5434q.a(q10) >= j10) {
                    return q10;
                } else {
                    if (view == null) {
                        view = q10;
                    }
                }
            }
            i9 += i12;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    @Override
    public final android.view.View R(android.view.View r23, int r24, f2.g1 r25, f2.n1 r26) {
        throw new UnsupportedOperationException("Method not decompiled: f2.y.R(android.view.View, int, f2.g1, f2.n1):android.view.View");
    }

    @Override
    public void U(g1 g1Var, n1 n1Var, View view, s0.d dVar) {
        boolean z10;
        boolean z11;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47292a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof w)) {
            T(view, dVar);
            return;
        }
        w wVar = (w) layoutParams;
        int t12 = t1(wVar.b(), g1Var, n1Var);
        if (this.f5432o == 0) {
            int i9 = wVar.f5544e;
            int i10 = wVar.f5545f;
            int i11 = this.J;
            if (i11 > 1 && i10 == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i9, i10, t12, 1, z11, false));
            return;
        }
        int i12 = wVar.f5544e;
        int i13 = wVar.f5545f;
        int i14 = this.J;
        if (i14 > 1 && i13 == i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(t12, 1, i12, i13, z10, false));
    }

    @Override
    public void V(RecyclerView recyclerView, int i9, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.f5560b).clear();
    }

    @Override
    public void W(RecyclerView recyclerView) {
        this.O.j();
        ((SparseIntArray) this.O.f5560b).clear();
    }

    @Override
    public void X(RecyclerView recyclerView, int i9, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.f5560b).clear();
    }

    @Override
    public void Y(RecyclerView recyclerView, int i9, int i10) {
        this.O.j();
        ((SparseIntArray) this.O.f5560b).clear();
    }

    @Override
    public void Z0(f2.g1 r18, f2.n1 r19, f2.k0 r20, f2.j0 r21) {
        throw new UnsupportedOperationException("Method not decompiled: f2.y.Z0(f2.g1, f2.n1, f2.k0, f2.j0):void");
    }

    @Override
    public void a0(RecyclerView recyclerView, int i9, int i10, Object obj) {
        this.O.j();
        ((SparseIntArray) this.O.f5560b).clear();
    }

    @Override
    public final void a1(g1 g1Var, n1 n1Var, i0 i0Var, int i9) {
        boolean z10;
        A1();
        if (n1Var.b() > 0 && !n1Var.f5474g) {
            if (i9 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int u12 = u1(i0Var.f5384b, g1Var, n1Var);
            if (z10) {
                while (u12 > 0) {
                    int i10 = i0Var.f5384b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    i0Var.f5384b = i11;
                    u12 = u1(i11, g1Var, n1Var);
                }
            } else {
                int b10 = n1Var.b() - 1;
                int i12 = i0Var.f5384b;
                while (i12 < b10) {
                    int i13 = i12 + 1;
                    int u13 = u1(i13, g1Var, n1Var);
                    if (u13 <= u12) {
                        break;
                    }
                    i12 = i13;
                    u12 = u13;
                }
                i0Var.f5384b = i12;
            }
        }
        r1();
    }

    @Override
    public void b0(g1 g1Var, n1 n1Var) {
        boolean z10 = n1Var.f5474g;
        SparseIntArray sparseIntArray = this.N;
        SparseIntArray sparseIntArray2 = this.M;
        if (z10) {
            int r10 = r();
            for (int i9 = 0; i9 < r10; i9++) {
                w wVar = (w) q(i9).getLayoutParams();
                int b10 = wVar.b();
                sparseIntArray2.put(b10, wVar.f5545f);
                sparseIntArray.put(b10, wVar.f5544e);
            }
        }
        super.b0(g1Var, n1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override
    public final void c0(n1 n1Var) {
        super.c0(n1Var);
        this.I = false;
    }

    @Override
    public final boolean f(a1 a1Var) {
        return a1Var instanceof w;
    }

    @Override
    public final int h(n1 n1Var) {
        return C0(n1Var);
    }

    @Override
    public final int i(n1 n1Var) {
        return D0(n1Var);
    }

    @Override
    public int k(n1 n1Var) {
        return C0(n1Var);
    }

    @Override
    public int l(n1 n1Var) {
        return D0(n1Var);
    }

    @Override
    public final void l1(boolean z10) {
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override
    public final int m0(int i9, g1 g1Var, n1 n1Var) {
        A1();
        r1();
        return super.m0(i9, g1Var, n1Var);
    }

    @Override
    public final a1 n() {
        if (this.f5432o == 0) {
            return new w(-2, -1);
        }
        return new w(-1, -2);
    }

    @Override
    public final a1 o(Context context, AttributeSet attributeSet) {
        ?? a1Var = new a1(context, attributeSet);
        a1Var.f5544e = -1;
        a1Var.f5545f = 0;
        return a1Var;
    }

    @Override
    public int o0(int i9, g1 g1Var, n1 n1Var) {
        A1();
        r1();
        return super.o0(i9, g1Var, n1Var);
    }

    @Override
    public final a1 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? a1Var = new a1((ViewGroup.MarginLayoutParams) layoutParams);
            a1Var.f5544e = -1;
            a1Var.f5545f = 0;
            return a1Var;
        }
        ?? a1Var2 = new a1(layoutParams);
        a1Var2.f5544e = -1;
        a1Var2.f5545f = 0;
        return a1Var2;
    }

    public final void p1(int i9, g1 g1Var, n1 n1Var, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (z10) {
            i11 = i9;
            i10 = 0;
            i12 = 1;
        } else {
            i10 = i9 - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View view = this.L[i10];
            w wVar = (w) view.getLayoutParams();
            int v12 = v1(((a1) view.getLayoutParams()).b(), g1Var, n1Var);
            wVar.f5545f = v12;
            wVar.f5544e = i13;
            i13 += v12;
            i10 += i12;
        }
    }

    public int[] q1(int i9, int i10, int[] iArr) {
        int i11;
        if (iArr == null || iArr.length != i9 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i9 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i10 / i9;
        int i14 = i10 % i9;
        int i15 = 0;
        for (int i16 = 1; i16 <= i9; i16++) {
            i12 += i14;
            if (i12 > 0 && i9 - i12 < i14) {
                i11 = i13 + 1;
                i12 -= i9;
            } else {
                i11 = i13;
            }
            i15 += i11;
            iArr[i16] = i15;
        }
        return iArr;
    }

    @Override
    public final void r0(Rect rect, int i9, int i10) {
        int g10;
        int g11;
        if (this.K == null) {
            super.r0(rect, i9, i10);
        }
        int E = E() + D();
        int C = C() + F();
        if (this.f5432o == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.f5563b;
            WeakHashMap weakHashMap = r0.j0.f46915a;
            g11 = z0.g(i10, height, recyclerView.getMinimumHeight());
            int[] iArr = this.K;
            g10 = z0.g(i9, iArr[iArr.length - 1] + E, this.f5563b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.f5563b;
            WeakHashMap weakHashMap2 = r0.j0.f46915a;
            g10 = z0.g(i9, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.K;
            g11 = z0.g(i10, iArr2[iArr2.length - 1] + C, this.f5563b.getMinimumHeight());
        }
        this.f5563b.setMeasuredDimension(g10, g11);
    }

    public final void r1() {
        View[] viewArr = this.L;
        if (viewArr != null && viewArr.length == this.J) {
            return;
        }
        this.L = new View[this.J];
    }

    public final int s1(int i9, int i10) {
        if (this.f5432o == 1 && Y0()) {
            int[] iArr = this.K;
            int i11 = this.J;
            return iArr[i11 - i9] - iArr[(i11 - i9) - i10];
        }
        int[] iArr2 = this.K;
        return iArr2[i10 + i9] - iArr2[i9];
    }

    public final int t1(int i9, g1 g1Var, n1 n1Var) {
        if (!n1Var.f5474g) {
            return this.O.g(i9, this.J);
        }
        int b10 = g1Var.b(i9);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i9);
            return 0;
        }
        return this.O.g(b10, this.J);
    }

    @Override
    public int u(g1 g1Var, n1 n1Var) {
        if (this.f5432o == 1) {
            return this.J;
        }
        if (n1Var.b() < 1) {
            return 0;
        }
        return t1(n1Var.b() - 1, g1Var, n1Var) + 1;
    }

    public final int u1(int i9, g1 g1Var, n1 n1Var) {
        if (!n1Var.f5474g) {
            return this.O.h(i9, this.J);
        }
        int i10 = this.N.get(i9, -1);
        if (i10 != -1) {
            return i10;
        }
        int b10 = g1Var.b(i9);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i9);
            return 0;
        }
        return this.O.h(b10, this.J);
    }

    public final int v1(int i9, g1 g1Var, n1 n1Var) {
        if (!n1Var.f5474g) {
            return this.O.i(i9);
        }
        int i10 = this.M.get(i9, -1);
        if (i10 != -1) {
            return i10;
        }
        int b10 = g1Var.b(i9);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i9);
            return 1;
        }
        return this.O.i(b10);
    }

    public void w1(View view, int i9, boolean z10) {
        int i10;
        int i11;
        w wVar = (w) view.getLayoutParams();
        Rect rect = wVar.f5312b;
        int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) wVar).topMargin + ((ViewGroup.MarginLayoutParams) wVar).bottomMargin;
        int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) wVar).leftMargin + ((ViewGroup.MarginLayoutParams) wVar).rightMargin;
        int s12 = s1(wVar.f5544e, wVar.f5545f);
        if (this.f5432o == 1) {
            i11 = z0.s(false, s12, i9, i13, ((ViewGroup.MarginLayoutParams) wVar).width);
            i10 = z0.s(true, this.f5434q.k(), this.f5571l, i12, ((ViewGroup.MarginLayoutParams) wVar).height);
        } else {
            int s10 = z0.s(false, s12, i9, i12, ((ViewGroup.MarginLayoutParams) wVar).height);
            int s11 = z0.s(true, this.f5434q.k(), this.f5570k, i13, ((ViewGroup.MarginLayoutParams) wVar).width);
            i10 = s10;
            i11 = s11;
        }
        x1(i11, i10, view, z10);
    }

    public final void x1(int i9, int i10, View view, boolean z10) {
        boolean u02;
        a1 a1Var = (a1) view.getLayoutParams();
        if (z10) {
            if (this.f5567g && z0.N(view.getMeasuredWidth(), i9, ((ViewGroup.MarginLayoutParams) a1Var).width) && z0.N(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) a1Var).height)) {
                u02 = false;
            } else {
                u02 = true;
            }
        } else {
            u02 = u0(view, i9, i10, a1Var);
        }
        if (u02) {
            view.measure(i9, i10);
        }
    }

    @Override
    public boolean y0() {
        if (this.B == null && !this.I) {
            return true;
        }
        return false;
    }

    public void y1(int i9) {
        if (i9 == this.J) {
            return;
        }
        this.I = true;
        if (i9 >= 1) {
            this.J = i9;
            this.O.j();
            l0();
            return;
        }
        throw new IllegalArgumentException(j3.r0.l(i9, "Span count should be at least 1. Provided "));
    }

    public final void z1(x xVar) {
        this.O = xVar;
    }

    public y(int i9, boolean z10) {
        super(1, z10);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new v(0);
        this.P = new Rect();
        y1(i9);
    }
}
