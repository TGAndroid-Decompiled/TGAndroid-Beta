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
public abstract class z0 {
    public a5.m f5562a;
    public RecyclerView f5563b;
    public final we.b f5564c;
    public final we.b d;
    public m1 f5565e;
    public boolean f5566f;
    public final boolean f5567g;
    public final boolean h;
    public int f5568i;
    public boolean f5569j;
    public int f5570k;
    public int f5571l;
    public int f5572m;
    public int f5573n;

    public z0() {
        fa.c cVar = new fa.c(this, 15);
        k5.i iVar = new k5.i(this, 13);
        this.f5564c = new we.b(cVar);
        this.d = new we.b(iVar);
        this.f5566f = false;
        this.f5567g = true;
        this.h = true;
    }

    public static int H(View view) {
        return ((a1) view.getLayoutParams()).b();
    }

    public static boolean N(int i9, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i9 != i11) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i9) {
                return false;
            }
            return true;
        } else if (size < i9) {
            return false;
        } else {
            return true;
        }
    }

    public static void O(View view, int i9, int i10, int i11, int i12) {
        a1 a1Var = (a1) view.getLayoutParams();
        Rect rect = a1Var.f5312b;
        view.layout(i9 + rect.left + ((ViewGroup.MarginLayoutParams) a1Var).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) a1Var).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) a1Var).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin);
    }

    public static int g(int i9, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i10, i11);
            }
            return size;
        }
        return Math.min(size, Math.max(i10, i11));
    }

    public static int s(boolean r4, int r5, int r6, int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: f2.z0.s(boolean, int, int, int, int):int");
    }

    public static int v(View view) {
        return view.getBottom() + ((a1) view.getLayoutParams()).f5312b.bottom;
    }

    public static void w(View view, Rect rect) {
        int[] iArr = RecyclerView.L0;
        a1 a1Var = (a1) view.getLayoutParams();
        Rect rect2 = a1Var.f5312b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) a1Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) a1Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) a1Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin);
    }

    public static int x(View view) {
        return view.getLeft() - ((a1) view.getLayoutParams()).f5312b.left;
    }

    public static void x0(View view) {
        q1 U = RecyclerView.U(view);
        U.f5510l &= -129;
        U.o();
        U.a(4);
    }

    public static int y(View view) {
        return view.getRight() + ((a1) view.getLayoutParams()).f5312b.right;
    }

    public static int z(View view) {
        return view.getTop() - ((a1) view.getLayoutParams()).f5312b.top;
    }

    public int A() {
        return B();
    }

    public final int B() {
        r0 r0Var;
        RecyclerView recyclerView = this.f5563b;
        if (recyclerView != null) {
            r0Var = recyclerView.getAdapter();
        } else {
            r0Var = null;
        }
        if (r0Var != null) {
            return r0Var.h();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f5563b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f5563b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f5563b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f5563b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int G() {
        return F();
    }

    public int I(g1 g1Var, n1 n1Var) {
        RecyclerView recyclerView = this.f5563b;
        if (recyclerView != null && recyclerView.f1366w != null && e()) {
            return this.f5563b.f1366w.h();
        }
        return 1;
    }

    public int J() {
        return F();
    }

    public int K() {
        return (this.f5573n - F()) - C();
    }

    public final void L(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((a1) view.getLayoutParams()).f5312b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f5563b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f5563b.v;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void M(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.f5563b;
        if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
            q1 U = RecyclerView.U(view);
            U.a(128);
            this.f5563b.f1346f.L(U);
            return;
        }
        throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f5563b.C());
    }

    public void P(View view) {
        a1 a1Var = (a1) view.getLayoutParams();
        Rect W = this.f5563b.W(view);
        int i9 = W.left + W.right;
        int i10 = W.top + W.bottom;
        int s10 = s(d(), this.f5572m, this.f5570k, E() + D() + ((ViewGroup.MarginLayoutParams) a1Var).leftMargin + ((ViewGroup.MarginLayoutParams) a1Var).rightMargin + i9, ((ViewGroup.MarginLayoutParams) a1Var).width);
        int s11 = s(e(), this.f5573n, this.f5571l, C() + F() + ((ViewGroup.MarginLayoutParams) a1Var).topMargin + ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin + i10, ((ViewGroup.MarginLayoutParams) a1Var).height);
        if (u0(view, s10, s11, a1Var)) {
            view.measure(s10, s11);
        }
    }

    public abstract View R(View view, int i9, g1 g1Var, n1 n1Var);

    public void S(g1 g1Var, n1 n1Var, s0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47292a;
        if (this.f5563b.canScrollVertically(-1) || this.f5563b.canScrollHorizontally(-1)) {
            dVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f5563b.canScrollVertically(1) || this.f5563b.canScrollHorizontally(1)) {
            dVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(g1Var, n1Var), u(g1Var, n1Var), false, 0));
    }

    public final void T(View view, s0.d dVar) {
        q1 U = RecyclerView.U(view);
        if (U != null && !U.j()) {
            a5.m mVar = this.f5562a;
            if (!((ArrayList) mVar.d).contains(U.f5501a)) {
                RecyclerView recyclerView = this.f5563b;
                U(recyclerView.f1339b, recyclerView.f1357p0, view, dVar);
            }
        }
    }

    public void U(g1 g1Var, n1 n1Var, View view, s0.d dVar) {
        int i9;
        int i10;
        if (e()) {
            i9 = H(view);
        } else {
            i9 = 0;
        }
        if (d()) {
            i10 = H(view);
        } else {
            i10 = 0;
        }
        dVar.f47292a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i9, 1, i10, 1, false, false));
    }

    public final void a(View view, int i9, boolean z10) {
        int E;
        q1 U = RecyclerView.U(view);
        if (!z10 && !U.j()) {
            this.f5563b.f1346f.K(U);
        } else {
            a0.f fVar = (a0.f) this.f5563b.f1346f.f48793b;
            w1 w1Var = (w1) fVar.get(U);
            if (w1Var == null) {
                w1Var = w1.a();
                fVar.put(U, w1Var);
            }
            w1Var.f5556a |= 1;
        }
        a1 a1Var = (a1) view.getLayoutParams();
        if (!U.s() && !U.k()) {
            if (view.getParent() == this.f5563b) {
                a5.m mVar = this.f5562a;
                d dVar = (d) mVar.f99c;
                int indexOfChild = ((RecyclerView) ((k5.i) mVar.f98b).f14659b).indexOfChild(view);
                if (indexOfChild == -1 || dVar.H(indexOfChild)) {
                    E = -1;
                } else {
                    E = indexOfChild - dVar.E(indexOfChild);
                }
                if (i9 == -1) {
                    i9 = this.f5562a.q();
                }
                if (E != -1) {
                    if (E != i9) {
                        z0 z0Var = this.f5563b.f1368x;
                        View q10 = z0Var.q(E);
                        if (q10 != null) {
                            z0Var.q(E);
                            z0Var.f5562a.j(E);
                            a1 a1Var2 = (a1) q10.getLayoutParams();
                            q1 U2 = RecyclerView.U(q10);
                            if (U2.j()) {
                                a0.f fVar2 = (a0.f) z0Var.f5563b.f1346f.f48793b;
                                w1 w1Var2 = (w1) fVar2.get(U2);
                                if (w1Var2 == null) {
                                    w1Var2 = w1.a();
                                    fVar2.put(U2, w1Var2);
                                }
                                w1Var2.f5556a = 1 | w1Var2.f5556a;
                            } else {
                                z0Var.f5563b.f1346f.K(U2);
                            }
                            z0Var.f5562a.c(q10, i9, a1Var2, U2.j());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + E + z0Var.f5563b.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f5563b.indexOfChild(view) + this.f5563b.C());
                }
            } else {
                this.f5562a.a(view, i9, false);
                a1Var.f5313c = true;
                m1 m1Var = this.f5565e;
                if (m1Var != null && m1Var.f5446e) {
                    m1Var.f5444b.getClass();
                    if (RecyclerView.S(view) == m1Var.f5443a) {
                        m1Var.f5447f = view;
                    }
                }
            }
        } else {
            if (U.k()) {
                U.f5514p.k(U);
            } else {
                U.f5510l &= -33;
            }
            this.f5562a.c(view, i9, view.getLayoutParams(), false);
        }
        if (a1Var.d) {
            U.f5501a.invalidate();
            a1Var.d = false;
        }
    }

    public void a0(RecyclerView recyclerView, int i9, int i10, Object obj) {
        Z();
    }

    public abstract void b(String str);

    public abstract void b0(g1 g1Var, n1 n1Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.f5563b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public abstract void c0(n1 n1Var);

    public abstract boolean d();

    public void d0(g1 g1Var, n1 n1Var, int i9, int i10) {
        this.f5563b.q(i9, i10);
    }

    public abstract boolean e();

    public abstract l0 e0();

    public boolean f(a1 a1Var) {
        if (a1Var != null) {
            return true;
        }
        return false;
    }

    public final void g0(g1 g1Var) {
        for (int r10 = r() - 1; r10 >= 0; r10--) {
            if (!RecyclerView.U(q(r10)).r()) {
                i0(r10, g1Var);
            }
        }
    }

    public abstract int h(n1 n1Var);

    public final void h0(g1 g1Var) {
        ArrayList arrayList = (ArrayList) g1Var.f5361c;
        int size = ((ArrayList) g1Var.f5361c).size();
        for (int i9 = size - 1; i9 >= 0; i9--) {
            View view = ((q1) arrayList.get(i9)).f5501a;
            q1 U = RecyclerView.U(view);
            if (!U.r()) {
                U.q(false);
                if (U.l()) {
                    this.f5563b.removeDetachedView(view, false);
                }
                w0 w0Var = this.f5563b.V;
                if (w0Var != null) {
                    w0Var.f(U);
                }
                U.q(true);
                q1 U2 = RecyclerView.U(view);
                U2.f5514p = null;
                U2.f5515q = false;
                U2.f5510l &= -33;
                g1Var.h(U2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) g1Var.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f5563b.invalidate();
        }
    }

    public abstract int i(n1 n1Var);

    public final void i0(int i9, g1 g1Var) {
        View q10 = q(i9);
        if (RecyclerView.U(q10).r()) {
            return;
        }
        j0(i9);
        g1Var.g(q10);
    }

    public abstract int j(n1 n1Var);

    public final void j0(int i9) {
        if (q(i9) != null) {
            a5.m mVar = this.f5562a;
            int t10 = mVar.t(i9);
            k5.i iVar = (k5.i) mVar.f98b;
            View childAt = ((RecyclerView) iVar.f14659b).getChildAt(t10);
            if (childAt != null) {
                if (((d) mVar.f99c).K(t10)) {
                    mVar.B(childAt);
                }
                iVar.O(t10);
            }
        }
    }

    public abstract int k(n1 n1Var);

    public final boolean k0(androidx.recyclerview.widget.RecyclerView r8, android.view.View r9, android.graphics.Rect r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: f2.z0.k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int l(n1 n1Var);

    public final void l0() {
        RecyclerView recyclerView = this.f5563b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract View m(int i9);

    public abstract int m0(int i9, g1 g1Var, n1 n1Var);

    public abstract a1 n();

    public abstract void n0(int i9);

    public a1 o(Context context, AttributeSet attributeSet) {
        return new a1(context, attributeSet);
    }

    public abstract int o0(int i9, g1 g1Var, n1 n1Var);

    public a1 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a1) {
            return new a1((a1) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new a1((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new a1(layoutParams);
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final View q(int i9) {
        a5.m mVar = this.f5562a;
        if (mVar != null) {
            return mVar.p(i9);
        }
        return null;
    }

    public final void q0(int i9, int i10) {
        this.f5572m = View.MeasureSpec.getSize(i9);
        int mode = View.MeasureSpec.getMode(i9);
        this.f5570k = mode;
        if (mode == 0 && !RecyclerView.M0) {
            this.f5572m = 0;
        }
        this.f5573n = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.f5571l = mode2;
        if (mode2 == 0 && !RecyclerView.M0) {
            this.f5573n = 0;
        }
    }

    public final int r() {
        a5.m mVar = this.f5562a;
        if (mVar != null) {
            return mVar.q();
        }
        return 0;
    }

    public void r0(Rect rect, int i9, int i10) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.f5563b;
        WeakHashMap weakHashMap = r0.j0.f46915a;
        this.f5563b.setMeasuredDimension(g(i9, E, recyclerView.getMinimumWidth()), g(i10, C, this.f5563b.getMinimumHeight()));
    }

    public final void s0(int i9, int i10) {
        int r10 = r();
        if (r10 == 0) {
            this.f5563b.q(i9, i10);
            return;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < r10; i15++) {
            View q10 = q(i15);
            Rect rect = this.f5563b.f1359r;
            w(q10, rect);
            int i16 = rect.left;
            if (i16 < i13) {
                i13 = i16;
            }
            int i17 = rect.right;
            if (i17 > i11) {
                i11 = i17;
            }
            int i18 = rect.top;
            if (i18 < i14) {
                i14 = i18;
            }
            int i19 = rect.bottom;
            if (i19 > i12) {
                i12 = i19;
            }
        }
        this.f5563b.f1359r.set(i13, i14, i11, i12);
        r0(this.f5563b.f1359r, i9, i10);
    }

    public int[] t(View view, Rect rect) {
        int D = D();
        int F = F();
        int E = this.f5572m - E();
        int C = this.f5573n - C();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i9 = left - D;
        int min = Math.min(0, i9);
        int i10 = top - F;
        int min2 = Math.min(0, i10);
        int i11 = width - E;
        int max = Math.max(0, i11);
        int max2 = Math.max(0, height - C);
        RecyclerView recyclerView = this.f5563b;
        WeakHashMap weakHashMap = r0.j0.f46915a;
        if (recyclerView.getLayoutDirection() == 1) {
            if (max == 0) {
                max = Math.max(min, i11);
            }
        } else {
            if (min == 0) {
                min = Math.min(i9, max);
            }
            max = min;
        }
        if (min2 == 0) {
            min2 = Math.min(i10, max2);
        }
        return new int[]{max, min2};
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f5563b = null;
            this.f5562a = null;
            this.f5572m = 0;
            this.f5573n = 0;
        } else {
            this.f5563b = recyclerView;
            this.f5562a = recyclerView.f1344e;
            this.f5572m = recyclerView.getWidth();
            this.f5573n = recyclerView.getHeight();
        }
        this.f5570k = 1073741824;
        this.f5571l = 1073741824;
    }

    public int u(g1 g1Var, n1 n1Var) {
        RecyclerView recyclerView = this.f5563b;
        if (recyclerView != null && recyclerView.f1366w != null && d()) {
            return this.f5563b.f1366w.h();
        }
        return 1;
    }

    public final boolean u0(View view, int i9, int i10, a1 a1Var) {
        if (!view.isLayoutRequested() && this.f5567g && N(view.getWidth(), i9, ((ViewGroup.MarginLayoutParams) a1Var).width) && N(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) a1Var).height)) {
            return false;
        }
        return true;
    }

    public abstract void v0(RecyclerView recyclerView, n1 n1Var, int i9);

    public final void w0(m1 m1Var) {
        m1 m1Var2 = this.f5565e;
        if (m1Var2 != null && m1Var != m1Var2 && m1Var2.f5446e) {
            m1Var2.h();
        }
        this.f5565e = m1Var;
        RecyclerView recyclerView = this.f5563b;
        m1Var.getClass();
        recyclerView.J0 = true;
        p1 p1Var = recyclerView.m0;
        RecyclerView recyclerView2 = p1Var.h;
        if (recyclerView2.J0) {
            recyclerView2.removeCallbacks(p1Var);
            p1Var.f5492c.abortAnimation();
        }
        if (m1Var.h) {
            Log.w("RecyclerView", "An instance of " + m1Var.getClass().getSimpleName() + " was started more than once. Each instance of" + m1Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        m1Var.f5444b = recyclerView;
        m1Var.f5445c = this;
        int i9 = m1Var.f5443a;
        if (i9 != -1) {
            recyclerView.f1357p0.f5469a = i9;
            m1Var.f5446e = true;
            m1Var.d = true;
            m1Var.f5447f = recyclerView.f1368x.m(i9);
            m1Var.e();
            m1Var.f5444b.m0.a();
            m1Var.h = true;
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

    public void V(RecyclerView recyclerView, int i9, int i10) {
    }

    public void X(RecyclerView recyclerView, int i9, int i10) {
    }

    public void Y(RecyclerView recyclerView, int i9, int i10) {
    }
}
