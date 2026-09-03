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
    public androidx.biometric.e f5940a;
    public RecyclerView f5941b;
    public final bf.b f5942c;
    public final bf.b d;
    public i1 f5943e;
    public boolean f5944f;
    public final boolean f5945g;
    public final boolean h;
    public int f5946i;
    public boolean f5947j;
    public int f5948k;
    public int f5949l;
    public int f5950m;
    public int f5951n;

    public w0() {
        androidx.biometric.f0 f0Var = new androidx.biometric.f0(this, 11);
        ja.c cVar = new ja.c(this);
        this.f5942c = new bf.b((q1) f0Var);
        this.d = new bf.b((q1) cVar);
        this.f5944f = false;
        this.f5945g = true;
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
        Rect rect = x0Var.f5953b;
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
        return view.getBottom() + ((x0) view.getLayoutParams()).f5953b.bottom;
    }

    public static void w(View view, Rect rect) {
        int[] iArr = RecyclerView.M0;
        x0 x0Var = (x0) view.getLayoutParams();
        Rect rect2 = x0Var.f5953b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) x0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) x0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) x0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin);
    }

    public static int x(View view) {
        return view.getLeft() - ((x0) view.getLayoutParams()).f5953b.left;
    }

    public static void x0(View view) {
        m1 U = RecyclerView.U(view);
        U.f5884l &= -129;
        U.o();
        U.a(4);
    }

    public static int y(View view) {
        return view.getRight() + ((x0) view.getLayoutParams()).f5953b.right;
    }

    public static int z(View view) {
        return view.getTop() - ((x0) view.getLayoutParams()).f5953b.top;
    }

    public int A() {
        return B();
    }

    public final int B() {
        p0 p0Var;
        RecyclerView recyclerView = this.f5941b;
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
        RecyclerView recyclerView = this.f5941b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f5941b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f5941b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f5941b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int G() {
        return F();
    }

    public int I(bf.f fVar, j1 j1Var) {
        RecyclerView recyclerView = this.f5941b;
        if (recyclerView != null && recyclerView.f1347w != null && e()) {
            return this.f5941b.f1347w.h();
        }
        return 1;
    }

    public int J() {
        return F();
    }

    public int K() {
        return (this.f5951n - F()) - C();
    }

    public final void L(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((x0) view.getLayoutParams()).f5953b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f5941b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f5941b.v;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void M(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.f5941b;
        if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
            m1 U = RecyclerView.U(view);
            U.a(128);
            this.f5941b.f1327f.b0(U);
            return;
        }
        throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f5941b.C());
    }

    public void P(View view) {
        x0 x0Var = (x0) view.getLayoutParams();
        Rect W = this.f5941b.W(view);
        int i10 = W.left + W.right;
        int i11 = W.top + W.bottom;
        int s6 = s(d(), this.f5950m, this.f5948k, E() + D() + ((ViewGroup.MarginLayoutParams) x0Var).leftMargin + ((ViewGroup.MarginLayoutParams) x0Var).rightMargin + i10, ((ViewGroup.MarginLayoutParams) x0Var).width);
        int s9 = s(e(), this.f5951n, this.f5949l, C() + F() + ((ViewGroup.MarginLayoutParams) x0Var).topMargin + ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin + i11, ((ViewGroup.MarginLayoutParams) x0Var).height);
        if (u0(view, s6, s9, x0Var)) {
            view.measure(s6, s9);
        }
    }

    public abstract View R(View view, int i10, bf.f fVar, j1 j1Var);

    public void S(bf.f fVar, j1 j1Var, s0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f46881a;
        if (this.f5941b.canScrollVertically(-1) || this.f5941b.canScrollHorizontally(-1)) {
            dVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f5941b.canScrollVertically(1) || this.f5941b.canScrollHorizontally(1)) {
            dVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(fVar, j1Var), u(fVar, j1Var), false, 0));
    }

    public final void T(View view, s0.d dVar) {
        m1 U = RecyclerView.U(view);
        if (U != null && !U.j()) {
            androidx.biometric.e eVar = this.f5940a;
            if (!((ArrayList) eVar.d).contains(U.f5875a)) {
                RecyclerView recyclerView = this.f5941b;
                U(recyclerView.f1320b, recyclerView.f1339q0, view, dVar);
            }
        }
    }

    public void U(bf.f fVar, j1 j1Var, View view, s0.d dVar) {
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
        dVar.f46881a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, 1, i11, 1, false, false));
    }

    public final void a(View view, int i10, boolean z4) {
        int y10;
        m1 U = RecyclerView.U(view);
        if (!z4 && !U.j()) {
            this.f5941b.f1327f.a0(U);
        } else {
            a0.f fVar = (a0.f) this.f5941b.f1327f.f1935b;
            r1 r1Var = (r1) fVar.get(U);
            if (r1Var == null) {
                r1Var = r1.a();
                fVar.put(U, r1Var);
            }
            r1Var.f5917a |= 1;
        }
        x0 x0Var = (x0) view.getLayoutParams();
        if (!U.s() && !U.k()) {
            if (view.getParent() == this.f5941b) {
                androidx.biometric.e eVar = this.f5940a;
                c cVar = (c) eVar.f528c;
                int indexOfChild = ((RecyclerView) ((ja.c) eVar.f527b).f9988a).indexOfChild(view);
                if (indexOfChild == -1 || cVar.D(indexOfChild)) {
                    y10 = -1;
                } else {
                    y10 = indexOfChild - cVar.y(indexOfChild);
                }
                if (i10 == -1) {
                    i10 = this.f5940a.p();
                }
                if (y10 != -1) {
                    if (y10 != i10) {
                        w0 w0Var = this.f5941b.f1349x;
                        View q10 = w0Var.q(y10);
                        if (q10 != null) {
                            w0Var.q(y10);
                            w0Var.f5940a.k(y10);
                            x0 x0Var2 = (x0) q10.getLayoutParams();
                            m1 U2 = RecyclerView.U(q10);
                            if (U2.j()) {
                                a0.f fVar2 = (a0.f) w0Var.f5941b.f1327f.f1935b;
                                r1 r1Var2 = (r1) fVar2.get(U2);
                                if (r1Var2 == null) {
                                    r1Var2 = r1.a();
                                    fVar2.put(U2, r1Var2);
                                }
                                r1Var2.f5917a = 1 | r1Var2.f5917a;
                            } else {
                                w0Var.f5941b.f1327f.a0(U2);
                            }
                            w0Var.f5940a.g(q10, i10, x0Var2, U2.j());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + y10 + w0Var.f5941b.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f5941b.indexOfChild(view) + this.f5941b.C());
                }
            } else {
                this.f5940a.f(view, i10, false);
                x0Var.f5954c = true;
                i1 i1Var = this.f5943e;
                if (i1Var != null && i1Var.f5808e) {
                    i1Var.f5806b.getClass();
                    if (RecyclerView.S(view) == i1Var.f5805a) {
                        i1Var.f5809f = view;
                    }
                }
            }
        } else {
            if (U.k()) {
                U.f5888p.k(U);
            } else {
                U.f5884l &= -33;
            }
            this.f5940a.g(view, i10, view.getLayoutParams(), false);
        }
        if (x0Var.d) {
            U.f5875a.invalidate();
            x0Var.d = false;
        }
    }

    public void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        Z();
    }

    public abstract void b(String str);

    public abstract void b0(bf.f fVar, j1 j1Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.f5941b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public abstract void c0(j1 j1Var);

    public abstract boolean d();

    public void d0(bf.f fVar, j1 j1Var, int i10, int i11) {
        this.f5941b.q(i10, i11);
    }

    public abstract boolean e();

    public abstract i0 e0();

    public boolean f(x0 x0Var) {
        if (x0Var != null) {
            return true;
        }
        return false;
    }

    public final void g0(bf.f fVar) {
        for (int r10 = r() - 1; r10 >= 0; r10--) {
            if (!RecyclerView.U(q(r10)).r()) {
                i0(r10, fVar);
            }
        }
    }

    public abstract int h(j1 j1Var);

    public final void h0(bf.f fVar) {
        ArrayList arrayList = (ArrayList) fVar.f1952c;
        int size = ((ArrayList) fVar.f1952c).size();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            View view = ((m1) arrayList.get(i10)).f5875a;
            m1 U = RecyclerView.U(view);
            if (!U.r()) {
                U.q(false);
                if (U.l()) {
                    this.f5941b.removeDetachedView(view, false);
                }
                u0 u0Var = this.f5941b.W;
                if (u0Var != null) {
                    u0Var.f(U);
                }
                U.q(true);
                m1 U2 = RecyclerView.U(view);
                U2.f5888p = null;
                U2.f5889q = false;
                U2.f5884l &= -33;
                fVar.h(U2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) fVar.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f5941b.invalidate();
        }
    }

    public abstract int i(j1 j1Var);

    public final void i0(int i10, bf.f fVar) {
        View q10 = q(i10);
        if (RecyclerView.U(q10).r()) {
            return;
        }
        j0(i10);
        fVar.g(q10);
    }

    public abstract int j(j1 j1Var);

    public final void j0(int i10) {
        if (q(i10) != null) {
            androidx.biometric.e eVar = this.f5940a;
            int s6 = eVar.s(i10);
            ja.c cVar = (ja.c) eVar.f527b;
            View childAt = ((RecyclerView) cVar.f9988a).getChildAt(s6);
            if (childAt != null) {
                if (((c) eVar.f528c).G(s6)) {
                    eVar.C(childAt);
                }
                cVar.D(s6);
            }
        }
    }

    public abstract int k(j1 j1Var);

    public final boolean k0(androidx.recyclerview.widget.RecyclerView r8, android.view.View r9, android.graphics.Rect r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: f2.w0.k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int l(j1 j1Var);

    public final void l0() {
        RecyclerView recyclerView = this.f5941b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract View m(int i10);

    public abstract int m0(int i10, bf.f fVar, j1 j1Var);

    public abstract x0 n();

    public abstract void n0(int i10);

    public x0 o(Context context, AttributeSet attributeSet) {
        return new x0(context, attributeSet);
    }

    public abstract int o0(int i10, bf.f fVar, j1 j1Var);

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
        androidx.biometric.e eVar = this.f5940a;
        if (eVar != null) {
            return eVar.o(i10);
        }
        return null;
    }

    public final void q0(int i10, int i11) {
        this.f5950m = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.f5948k = mode;
        if (mode == 0 && !RecyclerView.N0) {
            this.f5950m = 0;
        }
        this.f5951n = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f5949l = mode2;
        if (mode2 == 0 && !RecyclerView.N0) {
            this.f5951n = 0;
        }
    }

    public final int r() {
        androidx.biometric.e eVar = this.f5940a;
        if (eVar != null) {
            return eVar.p();
        }
        return 0;
    }

    public void r0(Rect rect, int i10, int i11) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.f5941b;
        WeakHashMap weakHashMap = r0.j0.f46469a;
        this.f5941b.setMeasuredDimension(g(i10, E, recyclerView.getMinimumWidth()), g(i11, C, this.f5941b.getMinimumHeight()));
    }

    public final void s0(int i10, int i11) {
        int r10 = r();
        if (r10 == 0) {
            this.f5941b.q(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < r10; i16++) {
            View q10 = q(i16);
            Rect rect = this.f5941b.f1340r;
            w(q10, rect);
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
        this.f5941b.f1340r.set(i14, i15, i12, i13);
        r0(this.f5941b.f1340r, i10, i11);
    }

    public int[] t(View view, Rect rect) {
        int D = D();
        int F = F();
        int E = this.f5950m - E();
        int C = this.f5951n - C();
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
        RecyclerView recyclerView = this.f5941b;
        WeakHashMap weakHashMap = r0.j0.f46469a;
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
            this.f5941b = null;
            this.f5940a = null;
            this.f5950m = 0;
            this.f5951n = 0;
        } else {
            this.f5941b = recyclerView;
            this.f5940a = recyclerView.f1325e;
            this.f5950m = recyclerView.getWidth();
            this.f5951n = recyclerView.getHeight();
        }
        this.f5948k = 1073741824;
        this.f5949l = 1073741824;
    }

    public int u(bf.f fVar, j1 j1Var) {
        RecyclerView recyclerView = this.f5941b;
        if (recyclerView != null && recyclerView.f1347w != null && d()) {
            return this.f5941b.f1347w.h();
        }
        return 1;
    }

    public final boolean u0(View view, int i10, int i11, x0 x0Var) {
        if (!view.isLayoutRequested() && this.f5945g && N(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) x0Var).width) && N(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) x0Var).height)) {
            return false;
        }
        return true;
    }

    public abstract void v0(RecyclerView recyclerView, j1 j1Var, int i10);

    public final void w0(i1 i1Var) {
        i1 i1Var2 = this.f5943e;
        if (i1Var2 != null && i1Var != i1Var2 && i1Var2.f5808e) {
            i1Var2.h();
        }
        this.f5943e = i1Var;
        RecyclerView recyclerView = this.f5941b;
        i1Var.getClass();
        recyclerView.K0 = true;
        l1 l1Var = recyclerView.f1336n0;
        RecyclerView recyclerView2 = l1Var.h;
        if (recyclerView2.K0) {
            recyclerView2.removeCallbacks(l1Var);
            l1Var.f5865c.abortAnimation();
        }
        if (i1Var.h) {
            Log.w("RecyclerView", "An instance of " + i1Var.getClass().getSimpleName() + " was started more than once. Each instance of" + i1Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        i1Var.f5806b = recyclerView;
        i1Var.f5807c = this;
        int i10 = i1Var.f5805a;
        if (i10 != -1) {
            recyclerView.f1339q0.f5827a = i10;
            i1Var.f5808e = true;
            i1Var.d = true;
            i1Var.f5809f = recyclerView.f1349x.m(i10);
            i1Var.e();
            i1Var.f5806b.f1336n0.a();
            i1Var.h = true;
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
