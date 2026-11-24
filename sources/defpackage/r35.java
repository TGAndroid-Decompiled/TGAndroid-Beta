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
public class r35 extends t26 {
    public boolean I;
    public int J;
    public int[] K;
    public View[] L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public yo O;
    public final Rect P;

    public r35(int i) {
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new gc3((byte) 1);
        this.P = new Rect();
        x1(i);
    }

    @Override
    public int H(wg2 wg2Var, p49 p49Var) {
        if (!this.o) {
            return this.J;
        }
        if (p49Var.b() < 1) {
            return 0;
        }
        return s1(p49Var.b() - 1, wg2Var, p49Var) + 1;
    }

    @Override
    public final View P0(wg2 wg2Var, p49 p49Var, int i, int i2, int i3) {
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
            int G = d49.G(q);
            if (G >= 0 && G < i3 && t1(G, wg2Var, p49Var) == 0) {
                if (((e49) q.getLayoutParams()).a.j()) {
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
    public final android.view.View Q(android.view.View r23, int r24, defpackage.wg2 r25, defpackage.p49 r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r35.Q(android.view.View, int, wg2, p49):android.view.View");
    }

    @Override
    public void S(wg2 wg2Var, p49 p49Var, View view, u4 u4Var) {
        boolean z;
        boolean z2;
        AccessibilityNodeInfo accessibilityNodeInfo = u4Var.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof q35)) {
            T(view, u4Var);
            return;
        }
        q35 q35Var = (q35) layoutParams;
        int s1 = s1(q35Var.b(), wg2Var, p49Var);
        boolean z3 = this.o;
        int i = q35Var.e;
        int i2 = q35Var.f;
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
    public void Y0(defpackage.wg2 r18, defpackage.p49 r19, defpackage.r26 r20, defpackage.q26 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r35.Y0(wg2, p49, r26, q26):void");
    }

    @Override
    public void Z(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.O.j();
        ((SparseIntArray) this.O.b).clear();
    }

    @Override
    public final void Z0(wg2 wg2Var, p49 p49Var, p26 p26Var, int i) {
        boolean z;
        y1();
        if (p49Var.b() > 0 && !p49Var.g) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            int t1 = t1(p26Var.b, wg2Var, p49Var);
            if (z) {
                while (t1 > 0) {
                    int i2 = p26Var.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    p26Var.b = i3;
                    t1 = t1(i3, wg2Var, p49Var);
                }
            } else {
                int b = p49Var.b() - 1;
                int i4 = p26Var.b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int t12 = t1(i5, wg2Var, p49Var);
                    if (t12 <= t1) {
                        break;
                    }
                    i4 = i5;
                    t1 = t12;
                }
                p26Var.b = i4;
            }
        }
        q1();
    }

    @Override
    public void a0(wg2 wg2Var, p49 p49Var) {
        boolean z = p49Var.g;
        SparseIntArray sparseIntArray = this.N;
        SparseIntArray sparseIntArray2 = this.M;
        if (z) {
            int r = r();
            for (int i = 0; i < r; i++) {
                q35 q35Var = (q35) q(i).getLayoutParams();
                int b = q35Var.b();
                sparseIntArray2.put(b, q35Var.f);
                sparseIntArray.put(b, q35Var.e);
            }
        }
        super.a0(wg2Var, p49Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override
    public final void b0(p49 p49Var) {
        super.b0(p49Var);
        this.I = false;
    }

    @Override
    public final boolean f(e49 e49Var) {
        return e49Var instanceof q35;
    }

    @Override
    public final int h(p49 p49Var) {
        return B0(p49Var);
    }

    @Override
    public final int i(p49 p49Var) {
        return C0(p49Var);
    }

    @Override
    public int k(p49 p49Var) {
        return B0(p49Var);
    }

    @Override
    public final void k1(boolean z) {
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override
    public int l(p49 p49Var) {
        return C0(p49Var);
    }

    @Override
    public final int l0(int i, wg2 wg2Var, p49 p49Var) {
        y1();
        q1();
        return super.l0(i, wg2Var, p49Var);
    }

    @Override
    public final e49 n() {
        if (!this.o) {
            return new q35(-2, -1);
        }
        return new q35(-1, -2);
    }

    @Override
    public int n0(int i, wg2 wg2Var, p49 p49Var) {
        y1();
        q1();
        return super.n0(i, wg2Var, p49Var);
    }

    @Override
    public final e49 o(Context context, AttributeSet attributeSet) {
        ?? e49Var = new e49(context, attributeSet);
        e49Var.e = -1;
        e49Var.f = 0;
        return e49Var;
    }

    public final void o1(int i, wg2 wg2Var, p49 p49Var, boolean z) {
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
            q35 q35Var = (q35) view.getLayoutParams();
            int u1 = u1(((e49) view.getLayoutParams()).b(), wg2Var, p49Var);
            q35Var.f = u1;
            q35Var.e = i5;
            i5 += u1;
            i2 += i4;
        }
    }

    @Override
    public final e49 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? e49Var = new e49((ViewGroup.MarginLayoutParams) layoutParams);
            e49Var.e = -1;
            e49Var.f = 0;
            return e49Var;
        }
        ?? e49Var2 = new e49(layoutParams);
        e49Var2.e = -1;
        e49Var2.f = 0;
        return e49Var2;
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
            WeakHashMap weakHashMap = jdc.a;
            g2 = d49.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.K;
            g = d49.g(i, iArr[iArr.length - 1] + D, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + D;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = jdc.a;
            g = d49.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.K;
            g2 = d49.g(i2, iArr2[iArr2.length - 1] + B, this.b.getMinimumHeight());
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

    public final int s1(int i, wg2 wg2Var, p49 p49Var) {
        if (!p49Var.g) {
            return this.O.g(i, this.J);
        }
        int b = wg2Var.b(i);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        return this.O.g(b, this.J);
    }

    public final int t1(int i, wg2 wg2Var, p49 p49Var) {
        if (!p49Var.g) {
            return this.O.h(i, this.J);
        }
        int i2 = this.N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = wg2Var.b(i);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        return this.O.h(b, this.J);
    }

    @Override
    public int u(wg2 wg2Var, p49 p49Var) {
        if (this.o) {
            return this.J;
        }
        if (p49Var.b() < 1) {
            return 0;
        }
        return s1(p49Var.b() - 1, wg2Var, p49Var) + 1;
    }

    public final int u1(int i, wg2 wg2Var, p49 p49Var) {
        if (!p49Var.g) {
            return this.O.i(i);
        }
        int i2 = this.M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = wg2Var.b(i);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        return this.O.i(b);
    }

    public void v1(int i, View view, boolean z) {
        int i2;
        int i3;
        q35 q35Var = (q35) view.getLayoutParams();
        Rect rect = q35Var.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) q35Var).topMargin + ((ViewGroup.MarginLayoutParams) q35Var).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) q35Var).leftMargin + ((ViewGroup.MarginLayoutParams) q35Var).rightMargin;
        int r1 = r1(q35Var.e, q35Var.f);
        if (this.o) {
            i3 = d49.s(false, r1, i, i5, ((ViewGroup.MarginLayoutParams) q35Var).width);
            i2 = d49.s(true, this.q.k(), this.l, i4, ((ViewGroup.MarginLayoutParams) q35Var).height);
        } else {
            int s = d49.s(false, r1, i, i4, ((ViewGroup.MarginLayoutParams) q35Var).height);
            int s2 = d49.s(true, this.q.k(), this.k, i5, ((ViewGroup.MarginLayoutParams) q35Var).width);
            i2 = s;
            i3 = s2;
        }
        w1(i3, i2, view, z);
    }

    public final void w1(int i, int i2, View view, boolean z) {
        boolean t0;
        e49 e49Var = (e49) view.getLayoutParams();
        if (z) {
            if (this.g && d49.M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) e49Var).width) && d49.M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) e49Var).height)) {
                t0 = false;
            } else {
                t0 = true;
            }
        } else {
            t0 = t0(view, i, i2, e49Var);
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
        w26.j(de9.k(i, "Span count should be at least 1. Provided "));
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
    public final void z0(p49 p49Var, r26 r26Var, on onVar) {
        int i = this.J;
        for (int i2 = 0; i2 < this.J && r26Var.b(p49Var) && i > 0; i2++) {
            int i3 = r26Var.d;
            onVar.b(i3, Math.max(0, r26Var.g));
            i -= this.O.i(i3);
            r26Var.d += r26Var.e;
        }
    }

    public r35(int i, boolean z) {
        super(1, z);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new gc3((byte) 1);
        this.P = new Rect();
        x1(i);
    }
}
