package defpackage;

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
public class u55 extends x46 {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public zo O;
    public final Rect P;

    public u55(int i) {
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new zc3((byte) 1);
        this.P = new Rect();
        x1(i);
    }

    @Override
    public int H(oh2 oh2Var, c89 c89Var) {
        if (!this.o) {
            return this.J;
        }
        if (c89Var.b() < 1) {
            return 0;
        }
        return s1(c89Var.b() - 1, oh2Var, c89Var) + 1;
    }

    @Override
    public final View P0(oh2 oh2Var, c89 c89Var, int i, int i2, int i3) {
        int i4;
        F0();
        int j = this.q.j();
        int f = this.q.f();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View q = q(i);
            int G = q79.G(q);
            if (G >= 0 && G < i3 && t1(G, oh2Var, c89Var) == 0) {
                if (((r79) q.getLayoutParams()).a.j()) {
                    if (view2 == null) {
                        view2 = q;
                    }
                } else if (this.q.d(q) < f && this.q.a(q) >= j) {
                    return q;
                } else {
                    if (view == null) {
                        view = q;
                    }
                }
            }
            i += i4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    @Override
    public final android.view.View Q(android.view.View r23, int r24, defpackage.oh2 r25, defpackage.c89 r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u55.Q(android.view.View, int, oh2, c89):android.view.View");
    }

    @Override
    public void S(oh2 oh2Var, c89 c89Var, View view, v4 v4Var) {
        boolean z;
        boolean z2;
        AccessibilityNodeInfo accessibilityNodeInfo = v4Var.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof t55)) {
            T(view, v4Var);
            return;
        }
        t55 t55Var = (t55) layoutParams;
        int s1 = s1(t55Var.b(), oh2Var, c89Var);
        boolean z3 = this.o;
        int i = t55Var.e;
        int i2 = t55Var.f;
        if (!z3) {
            int i3 = this.J;
            if (i3 > 1 && i2 == i3) {
                z2 = true;
            } else {
                z2 = false;
            }
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, s1, 1, z2, false));
            return;
        }
        int i4 = this.J;
        if (i4 > 1 && i2 == i4) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(s1, 1, i, i2, z, false));
    }

    @Override
    public void U(RecyclerView recyclerView, int i, int i2) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override
    public void V(RecyclerView recyclerView) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override
    public void W(RecyclerView recyclerView, int i, int i2) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override
    public void X(RecyclerView recyclerView, int i, int i2) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override
    public void Y0(defpackage.oh2 r18, defpackage.c89 r19, defpackage.v46 r20, defpackage.u46 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u55.Y0(oh2, c89, v46, u46):void");
    }

    @Override
    public void Z(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override
    public final void Z0(oh2 oh2Var, c89 c89Var, t46 t46Var, int i) {
        boolean z;
        y1();
        if (c89Var.b() > 0 && !c89Var.g) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            int t1 = t1(t46Var.b, oh2Var, c89Var);
            if (z) {
                while (t1 > 0) {
                    int i2 = t46Var.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    t46Var.b = i3;
                    t1 = t1(i3, oh2Var, c89Var);
                }
            } else {
                int b = c89Var.b() - 1;
                int i4 = t46Var.b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int t12 = t1(i5, oh2Var, c89Var);
                    if (t12 <= t1) {
                        break;
                    }
                    i4 = i5;
                    t1 = t12;
                }
                t46Var.b = i4;
            }
        }
        q1();
    }

    @Override
    public void a0(oh2 oh2Var, c89 c89Var) {
        boolean z = c89Var.g;
        SparseIntArray sparseIntArray = this.N;
        SparseIntArray sparseIntArray2 = this.M;
        if (z) {
            int r = r();
            for (int i = 0; i < r; i++) {
                t55 t55Var = (t55) q(i).getLayoutParams();
                int b = t55Var.b();
                sparseIntArray2.put(b, t55Var.f);
                sparseIntArray.put(b, t55Var.e);
            }
        }
        super.a0(oh2Var, c89Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override
    public final void b0(c89 c89Var) {
        super.b0(c89Var);
        this.I = false;
    }

    @Override
    public final boolean f(r79 r79Var) {
        return r79Var instanceof t55;
    }

    @Override
    public final int h(c89 c89Var) {
        return B0(c89Var);
    }

    @Override
    public final int i(c89 c89Var) {
        return C0(c89Var);
    }

    @Override
    public int k(c89 c89Var) {
        return B0(c89Var);
    }

    @Override
    public final void k1(boolean z) {
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override
    public int l(c89 c89Var) {
        return C0(c89Var);
    }

    @Override
    public final int l0(int i, oh2 oh2Var, c89 c89Var) {
        y1();
        q1();
        return super.l0(i, oh2Var, c89Var);
    }

    @Override
    public final r79 n() {
        if (!this.o) {
            return new t55(-2, -1);
        }
        return new t55(-1, -2);
    }

    @Override
    public int n0(int i, oh2 oh2Var, c89 c89Var) {
        y1();
        q1();
        return super.n0(i, oh2Var, c89Var);
    }

    @Override
    public final r79 o(Context context, AttributeSet attributeSet) {
        ?? r79Var = new r79(context, attributeSet);
        r79Var.e = -1;
        r79Var.f = 0;
        return r79Var;
    }

    public final void o1(int i, oh2 oh2Var, c89 c89Var, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i4 = 1;
            i3 = i;
            i2 = 0;
        } else {
            i2 = i - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View view = this.L[i2];
            t55 t55Var = (t55) view.getLayoutParams();
            int u1 = u1(((r79) view.getLayoutParams()).b(), oh2Var, c89Var);
            t55Var.f = u1;
            t55Var.e = i5;
            i5 += u1;
            i2 += i4;
        }
    }

    @Override
    public final r79 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? r79Var = new r79((ViewGroup.MarginLayoutParams) layoutParams);
            r79Var.e = -1;
            r79Var.f = 0;
            return r79Var;
        }
        ?? r79Var2 = new r79(layoutParams);
        r79Var2.e = -1;
        r79Var2.f = 0;
        return r79Var2;
    }

    public int[] p1(int i, int i2, int[] iArr) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 > 0 && i - i4 < i6) {
                i3 = i5 + 1;
                i4 -= i;
            } else {
                i3 = i5;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    @Override
    public final void q0(Rect rect, int i, int i2) {
        int g;
        int g2;
        if (this.K == null) {
            super.q0(rect, i, i2);
        }
        int D = D() + C();
        int B = B() + E();
        if (this.o) {
            int height = rect.height() + B;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = ihc.a;
            g2 = q79.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.K;
            g = q79.g(i, iArr[iArr.length - 1] + D, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + D;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = ihc.a;
            g = q79.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.K;
            g2 = q79.g(i2, iArr2[iArr2.length - 1] + B, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g, g2);
    }

    public final void q1() {
        View[] viewArr = this.L;
        if (viewArr != null && viewArr.length == this.J) {
            return;
        }
        this.L = new View[this.J];
    }

    public final int r1(int i, int i2) {
        if (this.o && X0()) {
            int[] iArr = this.K;
            int i3 = this.J - i;
            return iArr[i3] - iArr[i3 - i2];
        }
        int[] iArr2 = this.K;
        return iArr2[i2 + i] - iArr2[i];
    }

    public final int s1(int i, oh2 oh2Var, c89 c89Var) {
        if (!c89Var.g) {
            return this.O.g(i, this.J);
        }
        int b = oh2Var.b(i);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        return this.O.g(b, this.J);
    }

    public final int t1(int i, oh2 oh2Var, c89 c89Var) {
        if (!c89Var.g) {
            return this.O.h(i, this.J);
        }
        int i2 = this.N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = oh2Var.b(i);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        return this.O.h(b, this.J);
    }

    @Override
    public int u(oh2 oh2Var, c89 c89Var) {
        if (this.o) {
            return this.J;
        }
        if (c89Var.b() < 1) {
            return 0;
        }
        return s1(c89Var.b() - 1, oh2Var, c89Var) + 1;
    }

    public final int u1(int i, oh2 oh2Var, c89 c89Var) {
        if (!c89Var.g) {
            return this.O.i(i);
        }
        int i2 = this.M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = oh2Var.b(i);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        return this.O.i(b);
    }

    public void v1(int i, View view, boolean z) {
        int i2;
        int i3;
        t55 t55Var = (t55) view.getLayoutParams();
        Rect rect = t55Var.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) t55Var).topMargin + ((ViewGroup.MarginLayoutParams) t55Var).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) t55Var).leftMargin + ((ViewGroup.MarginLayoutParams) t55Var).rightMargin;
        int r1 = r1(t55Var.e, t55Var.f);
        if (this.o) {
            i3 = q79.s(false, r1, i, i5, ((ViewGroup.MarginLayoutParams) t55Var).width);
            i2 = q79.s(true, this.q.k(), this.l, i4, ((ViewGroup.MarginLayoutParams) t55Var).height);
        } else {
            int s = q79.s(false, r1, i, i4, ((ViewGroup.MarginLayoutParams) t55Var).height);
            int s2 = q79.s(true, this.q.k(), this.k, i5, ((ViewGroup.MarginLayoutParams) t55Var).width);
            i2 = s;
            i3 = s2;
        }
        w1(i3, i2, view, z);
    }

    public final void w1(int i, int i2, View view, boolean z) {
        boolean t0;
        r79 r79Var = (r79) view.getLayoutParams();
        if (z) {
            if (this.g && q79.M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) r79Var).width) && q79.M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) r79Var).height)) {
                t0 = false;
            } else {
                t0 = true;
            }
        } else {
            t0 = t0(view, i, i2, r79Var);
        }
        if (t0) {
            view.measure(i, i2);
        }
    }

    @Override
    public boolean x0() {
        if (this.B == null && !this.I) {
            return true;
        }
        return false;
    }

    public final void x1(int i) {
        if (i == this.J) {
            return;
        }
        this.I = true;
        if (i >= 1) {
            this.J = i;
            this.O.j();
            k0();
            return;
        }
        lq5.j(uh9.k(i, "Span count should be at least 1. Provided "));
    }

    public final void y1() {
        int B;
        int E;
        if (this.o) {
            B = this.m - D();
            E = C();
        } else {
            B = this.n - B();
            E = E();
        }
        int i = B - E;
        this.K = p1(this.J, i, this.K);
    }

    @Override
    public final void z0(c89 c89Var, v46 v46Var, pn pnVar) {
        int i = this.J;
        for (int i2 = 0; i2 < this.J && v46Var.b(c89Var) && i > 0; i2++) {
            int i3 = v46Var.d;
            pnVar.b(i3, Math.max(0, v46Var.g));
            i -= this.O.i(i3);
            v46Var.d += v46Var.e;
        }
    }

    public u55(int i, boolean z) {
        super(1, z);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new zc3((byte) 1);
        this.P = new Rect();
        x1(i);
    }
}
