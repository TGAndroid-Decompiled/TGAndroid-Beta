package f2;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class w0 {
    public androidx.biometric.e f6496a;
    public RecyclerView f6497b;
    public final ze.b f6498c;
    public final ze.b d;
    public j1 f6499e;
    public boolean f6500f;
    public final boolean f6501g;
    public final boolean h;
    public int f6502i;
    public boolean f6503j;
    public int f6504k;
    public int f6505l;
    public int f6506m;
    public int f6507n;

    public w0() {
        m5.i iVar = new m5.i(this, 12);
        ag.o1 o1Var = new ag.o1(this, 13);
        this.f6498c = new ze.b((s1) iVar);
        this.d = new ze.b((s1) o1Var);
        this.f6500f = false;
        this.f6501g = true;
        this.h = true;
    }

    public static int H(View view) {
        return ((x0) view.getLayoutParams()).b();
    }

    public static boolean N(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i10) {
                return false;
            }
            return true;
        } else if (size < i10) {
            return false;
        } else {
            return true;
        }
    }

    public static void O(View view, int i10, int i11, int i12, int i13) {
        x0 x0Var = (x0) view.getLayoutParams();
        Rect rect = x0Var.f6509b;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) x0Var).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) x0Var).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) x0Var).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin);
    }

    public static int g(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i11, i12);
            }
            return size;
        }
        return Math.min(size, Math.max(i11, i12));
    }

    public static int s(boolean r4, int r5, int r6, int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: f2.w0.s(boolean, int, int, int, int):int");
    }

    public static int v(View view) {
        return view.getBottom() + ((x0) view.getLayoutParams()).f6509b.bottom;
    }

    public static void w(View view, Rect rect) {
        int[] iArr = RecyclerView.L0;
        x0 x0Var = (x0) view.getLayoutParams();
        Rect rect2 = x0Var.f6509b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) x0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) x0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) x0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin);
    }

    public static int x(View view) {
        return view.getLeft() - ((x0) view.getLayoutParams()).f6509b.left;
    }

    public static void x0(View view) {
        n1 U = RecyclerView.U(view);
        U.f6441l &= -129;
        U.o();
        U.a(4);
    }

    public static int y(View view) {
        return view.getRight() + ((x0) view.getLayoutParams()).f6509b.right;
    }

    public static int z(View view) {
        return view.getTop() - ((x0) view.getLayoutParams()).f6509b.top;
    }

    public int A() {
        return B();
    }

    public final int B() {
        p0 p0Var;
        RecyclerView recyclerView = this.f6497b;
        if (recyclerView != null) {
            p0Var = recyclerView.getAdapter();
        } else {
            p0Var = null;
        }
        if (p0Var != null) {
            return p0Var.h();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f6497b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f6497b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f6497b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f6497b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int G() {
        return F();
    }

    public int I(d1 d1Var, k1 k1Var) {
        RecyclerView recyclerView = this.f6497b;
        if (recyclerView != null && recyclerView.f1856w != null && e()) {
            return this.f6497b.f1856w.h();
        }
        return 1;
    }

    public int J() {
        return F();
    }

    public int K() {
        return (this.f6507n - F()) - C();
    }

    public final void L(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((x0) view.getLayoutParams()).f6509b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f6497b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f6497b.v;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void M(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.f6497b;
        if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
            n1 U = RecyclerView.U(view);
            U.a(128);
            this.f6497b.f1836f.U(U);
            return;
        }
        throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f6497b.C());
    }

    public void P(View view) {
        x0 x0Var = (x0) view.getLayoutParams();
        Rect W = this.f6497b.W(view);
        int i10 = W.left + W.right;
        int i11 = W.top + W.bottom;
        int s10 = s(d(), this.f6506m, this.f6504k, E() + D() + ((ViewGroup.MarginLayoutParams) x0Var).leftMargin + ((ViewGroup.MarginLayoutParams) x0Var).rightMargin + i10, ((ViewGroup.MarginLayoutParams) x0Var).width);
        int s11 = s(e(), this.f6507n, this.f6505l, C() + F() + ((ViewGroup.MarginLayoutParams) x0Var).topMargin + ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin + i11, ((ViewGroup.MarginLayoutParams) x0Var).height);
        if (u0(view, s10, s11, x0Var)) {
            view.measure(s10, s11);
        }
    }

    public abstract View R(View view, int i10, d1 d1Var, k1 k1Var);

    public void S(d1 d1Var, k1 k1Var, s0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f47482a;
        if (this.f6497b.canScrollVertically(-1) || this.f6497b.canScrollHorizontally(-1)) {
            cVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f6497b.canScrollVertically(1) || this.f6497b.canScrollHorizontally(1)) {
            cVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(d1Var, k1Var), u(d1Var, k1Var), false, 0));
    }

    public final void T(View view, s0.c cVar) {
        n1 U = RecyclerView.U(view);
        if (U != null && !U.j()) {
            androidx.biometric.e eVar = this.f6496a;
            if (!((ArrayList) eVar.d).contains(U.f6432a)) {
                RecyclerView recyclerView = this.f6497b;
                U(recyclerView.f1829b, recyclerView.f1847p0, view, cVar);
            }
        }
    }

    public void U(d1 d1Var, k1 k1Var, View view, s0.c cVar) {
        int i10;
        int i11;
        if (e()) {
            i10 = H(view);
        } else {
            i10 = 0;
        }
        if (d()) {
            i11 = H(view);
        } else {
            i11 = 0;
        }
        cVar.f47482a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, 1, i11, 1, false, false));
    }

    public final void a(View view, int i10, boolean z10) {
        int A;
        n1 U = RecyclerView.U(view);
        if (!z10 && !U.j()) {
            this.f6497b.f1836f.T(U);
        } else {
            a0.f fVar = (a0.f) this.f6497b.f1836f.f50824a;
            t1 t1Var = (t1) fVar.get(U);
            if (t1Var == null) {
                t1Var = t1.a();
                fVar.put(U, t1Var);
            }
            t1Var.f6479a |= 1;
        }
        x0 x0Var = (x0) view.getLayoutParams();
        if (!U.s() && !U.k()) {
            if (view.getParent() == this.f6497b) {
                androidx.biometric.e eVar = this.f6496a;
                c cVar = (c) eVar.f1031c;
                int indexOfChild = ((RecyclerView) ((ag.o1) eVar.f1030b).f624b).indexOfChild(view);
                if (indexOfChild == -1 || cVar.D(indexOfChild)) {
                    A = -1;
                } else {
                    A = indexOfChild - cVar.A(indexOfChild);
                }
                if (i10 == -1) {
                    i10 = this.f6496a.p();
                }
                if (A != -1) {
                    if (A != i10) {
                        w0 w0Var = this.f6497b.f1858x;
                        View q6 = w0Var.q(A);
                        if (q6 != null) {
                            w0Var.q(A);
                            w0Var.f6496a.j(A);
                            x0 x0Var2 = (x0) q6.getLayoutParams();
                            n1 U2 = RecyclerView.U(q6);
                            if (U2.j()) {
                                a0.f fVar2 = (a0.f) w0Var.f6497b.f1836f.f50824a;
                                t1 t1Var2 = (t1) fVar2.get(U2);
                                if (t1Var2 == null) {
                                    t1Var2 = t1.a();
                                    fVar2.put(U2, t1Var2);
                                }
                                t1Var2.f6479a = 1 | t1Var2.f6479a;
                            } else {
                                w0Var.f6497b.f1836f.T(U2);
                            }
                            w0Var.f6496a.b(q6, i10, x0Var2, U2.j());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + A + w0Var.f6497b.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f6497b.indexOfChild(view) + this.f6497b.C());
                }
            } else {
                this.f6496a.a(view, i10, false);
                x0Var.f6510c = true;
                j1 j1Var = this.f6499e;
                if (j1Var != null && j1Var.f6376e) {
                    j1Var.f6374b.getClass();
                    if (RecyclerView.S(view) == j1Var.f6373a) {
                        j1Var.f6377f = view;
                    }
                }
            }
        } else {
            if (U.k()) {
                U.f6445p.k(U);
            } else {
                U.f6441l &= -33;
            }
            this.f6496a.b(view, i10, view.getLayoutParams(), false);
        }
        if (x0Var.d) {
            U.f6432a.invalidate();
            x0Var.d = false;
        }
    }

    public void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        Z();
    }

    public abstract void b(String str);

    public abstract void b0(d1 d1Var, k1 k1Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.f6497b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public abstract void c0(k1 k1Var);

    public abstract boolean d();

    public void d0(d1 d1Var, k1 k1Var, int i10, int i11) {
        this.f6497b.q(i10, i11);
    }

    public abstract boolean e();

    public abstract i0 e0();

    public boolean f(x0 x0Var) {
        if (x0Var != null) {
            return true;
        }
        return false;
    }

    public final void g0(d1 d1Var) {
        for (int r6 = r() - 1; r6 >= 0; r6--) {
            if (!RecyclerView.U(q(r6)).r()) {
                i0(r6, d1Var);
            }
        }
    }

    public abstract int h(k1 k1Var);

    public final void h0(d1 d1Var) {
        ArrayList arrayList = (ArrayList) d1Var.f6292c;
        int size = ((ArrayList) d1Var.f6292c).size();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            View view = ((n1) arrayList.get(i10)).f6432a;
            n1 U = RecyclerView.U(view);
            if (!U.r()) {
                U.q(false);
                if (U.l()) {
                    this.f6497b.removeDetachedView(view, false);
                }
                u0 u0Var = this.f6497b.V;
                if (u0Var != null) {
                    u0Var.f(U);
                }
                U.q(true);
                n1 U2 = RecyclerView.U(view);
                U2.f6445p = null;
                U2.f6446q = false;
                U2.f6441l &= -33;
                d1Var.h(U2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) d1Var.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f6497b.invalidate();
        }
    }

    public abstract int i(k1 k1Var);

    public final void i0(int i10, d1 d1Var) {
        View q6 = q(i10);
        if (RecyclerView.U(q6).r()) {
            return;
        }
        j0(i10);
        d1Var.g(q6);
    }

    public abstract int j(k1 k1Var);

    public final void j0(int i10) {
        if (q(i10) != null) {
            androidx.biometric.e eVar = this.f6496a;
            int s10 = eVar.s(i10);
            ag.o1 o1Var = (ag.o1) eVar.f1030b;
            View childAt = ((RecyclerView) o1Var.f624b).getChildAt(s10);
            if (childAt != null) {
                if (((c) eVar.f1031c).G(s10)) {
                    eVar.B(childAt);
                }
                o1Var.k(s10);
            }
        }
    }

    public abstract int k(k1 k1Var);

    public final boolean k0(androidx.recyclerview.widget.RecyclerView r8, android.view.View r9, android.graphics.Rect r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: f2.w0.k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int l(k1 k1Var);

    public final void l0() {
        RecyclerView recyclerView = this.f6497b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract View m(int i10);

    public abstract int m0(int i10, d1 d1Var, k1 k1Var);

    public abstract x0 n();

    public abstract void n0(int i10);

    public x0 o(Context context, AttributeSet attributeSet) {
        return new x0(context, attributeSet);
    }

    public abstract int o0(int i10, d1 d1Var, k1 k1Var);

    public x0 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof x0) {
            return new x0((x0) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new x0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new x0(layoutParams);
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final View q(int i10) {
        androidx.biometric.e eVar = this.f6496a;
        if (eVar != null) {
            return eVar.o(i10);
        }
        return null;
    }

    public final void q0(int i10, int i11) {
        this.f6506m = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.f6504k = mode;
        if (mode == 0 && !RecyclerView.M0) {
            this.f6506m = 0;
        }
        this.f6507n = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f6505l = mode2;
        if (mode2 == 0 && !RecyclerView.M0) {
            this.f6507n = 0;
        }
    }

    public final int r() {
        androidx.biometric.e eVar = this.f6496a;
        if (eVar != null) {
            return eVar.p();
        }
        return 0;
    }

    public void r0(Rect rect, int i10, int i11) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.f6497b;
        WeakHashMap weakHashMap = r0.j0.f46829a;
        this.f6497b.setMeasuredDimension(g(i10, E, recyclerView.getMinimumWidth()), g(i11, C, this.f6497b.getMinimumHeight()));
    }

    public final void s0(int i10, int i11) {
        int r6 = r();
        if (r6 == 0) {
            this.f6497b.q(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < r6; i16++) {
            View q6 = q(i16);
            Rect rect = this.f6497b.f1849r;
            w(q6, rect);
            int i17 = rect.left;
            if (i17 < i14) {
                i14 = i17;
            }
            int i18 = rect.right;
            if (i18 > i12) {
                i12 = i18;
            }
            int i19 = rect.top;
            if (i19 < i15) {
                i15 = i19;
            }
            int i20 = rect.bottom;
            if (i20 > i13) {
                i13 = i20;
            }
        }
        this.f6497b.f1849r.set(i14, i15, i12, i13);
        r0(this.f6497b.f1849r, i10, i11);
    }

    public int[] t(View view, Rect rect) {
        int D = D();
        int F = F();
        int E = this.f6506m - E();
        int C = this.f6507n - C();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i10 = left - D;
        int min = Math.min(0, i10);
        int i11 = top - F;
        int min2 = Math.min(0, i11);
        int i12 = width - E;
        int max = Math.max(0, i12);
        int max2 = Math.max(0, height - C);
        RecyclerView recyclerView = this.f6497b;
        WeakHashMap weakHashMap = r0.j0.f46829a;
        if (recyclerView.getLayoutDirection() == 1) {
            if (max == 0) {
                max = Math.max(min, i12);
            }
        } else {
            if (min == 0) {
                min = Math.min(i10, max);
            }
            max = min;
        }
        if (min2 == 0) {
            min2 = Math.min(i11, max2);
        }
        return new int[]{max, min2};
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f6497b = null;
            this.f6496a = null;
            this.f6506m = 0;
            this.f6507n = 0;
        } else {
            this.f6497b = recyclerView;
            this.f6496a = recyclerView.f1834e;
            this.f6506m = recyclerView.getWidth();
            this.f6507n = recyclerView.getHeight();
        }
        this.f6504k = 1073741824;
        this.f6505l = 1073741824;
    }

    public int u(d1 d1Var, k1 k1Var) {
        RecyclerView recyclerView = this.f6497b;
        if (recyclerView != null && recyclerView.f1856w != null && d()) {
            return this.f6497b.f1856w.h();
        }
        return 1;
    }

    public final boolean u0(View view, int i10, int i11, x0 x0Var) {
        if (!view.isLayoutRequested() && this.f6501g && N(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) x0Var).width) && N(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) x0Var).height)) {
            return false;
        }
        return true;
    }

    public abstract void v0(RecyclerView recyclerView, k1 k1Var, int i10);

    public final void w0(j1 j1Var) {
        j1 j1Var2 = this.f6499e;
        if (j1Var2 != null && j1Var != j1Var2 && j1Var2.f6376e) {
            j1Var2.h();
        }
        this.f6499e = j1Var;
        RecyclerView recyclerView = this.f6497b;
        j1Var.getClass();
        recyclerView.J0 = true;
        m1 m1Var = recyclerView.m0;
        RecyclerView recyclerView2 = m1Var.h;
        if (recyclerView2.J0) {
            recyclerView2.removeCallbacks(m1Var);
            m1Var.f6423c.abortAnimation();
        }
        if (j1Var.h) {
            Log.w("RecyclerView", "An instance of " + j1Var.getClass().getSimpleName() + " was started more than once. Each instance of" + j1Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        j1Var.f6374b = recyclerView;
        j1Var.f6375c = this;
        int i10 = j1Var.f6373a;
        if (i10 != -1) {
            recyclerView.f1847p0.f6392a = i10;
            j1Var.f6376e = true;
            j1Var.d = true;
            j1Var.f6377f = recyclerView.f1858x.m(i10);
            j1Var.e();
            j1Var.f6374b.m0.a();
            j1Var.h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public abstract boolean y0();

    public void Q() {
    }

    public void Z() {
    }

    public void f0() {
    }

    public void W(RecyclerView recyclerView) {
    }

    public void V(RecyclerView recyclerView, int i10, int i11) {
    }

    public void X(RecyclerView recyclerView, int i10, int i11) {
    }

    public void Y(RecyclerView recyclerView, int i10, int i11) {
    }
}
