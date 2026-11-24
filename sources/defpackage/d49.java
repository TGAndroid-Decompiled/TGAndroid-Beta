package defpackage;

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
public abstract class d49 {
    public mv6 a;
    public RecyclerView b;
    public final sk4 c;
    public final sk4 d;
    public o49 e;
    public boolean f;
    public final boolean g;
    public final boolean h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;

    public d49() {
        u39 u39Var = new u39(this, (byte) 1);
        ln8 ln8Var = new ln8(this, (byte) 4);
        this.c = new sk4(u39Var);
        this.d = new sk4(ln8Var);
        this.f = false;
        this.g = true;
        this.h = true;
    }

    public static int G(View view) {
        return ((e49) view.getLayoutParams()).b();
    }

    public static boolean M(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i) {
                return false;
            }
            return true;
        } else if (size < i) {
            return false;
        } else {
            return true;
        }
    }

    public static void N(View view, int i, int i2, int i3, int i4) {
        e49 e49Var = (e49) view.getLayoutParams();
        Rect rect = e49Var.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) e49Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) e49Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) e49Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) e49Var).bottomMargin);
    }

    public static int g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    public static int s(boolean r4, int r5, int r6, int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d49.s(boolean, int, int, int, int):int");
    }

    public static int v(View view) {
        return view.getBottom() + ((e49) view.getLayoutParams()).b.bottom;
    }

    public static int w(View view) {
        return view.getLeft() - ((e49) view.getLayoutParams()).b.left;
    }

    public static void w0(View view) {
        s49 U = RecyclerView.U(view);
        U.l &= -129;
        U.o();
        U.a(4);
    }

    public static int x(View view) {
        return view.getRight() + ((e49) view.getLayoutParams()).b.right;
    }

    public static int y(View view) {
        return view.getTop() - ((e49) view.getLayoutParams()).b.top;
    }

    public final int A() {
        w39 w39Var;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            w39Var = recyclerView.getAdapter();
        } else {
            w39Var = null;
        }
        if (w39Var != null) {
            return w39Var.b();
        }
        return 0;
    }

    public final int B() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int F() {
        return E();
    }

    public int H(wg2 wg2Var, p49 p49Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.x != null && e()) {
            return this.b.x.b();
        }
        return 1;
    }

    public int I() {
        return E();
    }

    public int J() {
        return (this.n - E()) - B();
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((e49) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.w;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void L(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.b;
        if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
            s49 U = RecyclerView.U(view);
            U.a(128);
            this.b.f.o(U);
            return;
        }
        w26.j("View should be fully attached to be ignored".concat(this.b.C()));
    }

    public void O(View view) {
        e49 e49Var = (e49) view.getLayoutParams();
        Rect X = this.b.X(view);
        int i = X.left + X.right;
        int i2 = X.top + X.bottom;
        int s = s(d(), this.m, this.k, D() + C() + ((ViewGroup.MarginLayoutParams) e49Var).leftMargin + ((ViewGroup.MarginLayoutParams) e49Var).rightMargin + i, ((ViewGroup.MarginLayoutParams) e49Var).width);
        int s2 = s(e(), this.n, this.l, B() + E() + ((ViewGroup.MarginLayoutParams) e49Var).topMargin + ((ViewGroup.MarginLayoutParams) e49Var).bottomMargin + i2, ((ViewGroup.MarginLayoutParams) e49Var).height);
        if (t0(view, s, s2, e49Var)) {
            view.measure(s, s2);
        }
    }

    public abstract View Q(View view, int i, wg2 wg2Var, p49 p49Var);

    public void R(wg2 wg2Var, p49 p49Var, u4 u4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = u4Var.a;
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            u4Var.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            u4Var.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(H(wg2Var, p49Var), u(wg2Var, p49Var), false, 0));
    }

    public void S(wg2 wg2Var, p49 p49Var, View view, u4 u4Var) {
        int i;
        int i2 = 0;
        if (e()) {
            i = G(view);
        } else {
            i = 0;
        }
        if (d()) {
            i2 = G(view);
        }
        u4Var.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, 1, i2, 1, false, false));
    }

    public final void T(View view, u4 u4Var) {
        s49 U = RecyclerView.U(view);
        if (U != null && !U.j()) {
            mv6 mv6Var = this.a;
            if (!((ArrayList) mv6Var.d).contains(U.a)) {
                RecyclerView recyclerView = this.b;
                S(recyclerView.b, recyclerView.v0, view, u4Var);
            }
        }
    }

    public void Z(RecyclerView recyclerView, int i, int i2, Object obj) {
        Y();
    }

    public final void a(int i, View view, boolean z) {
        int i2;
        s49 U = RecyclerView.U(view);
        if (!z && !U.j()) {
            this.b.f.n(U);
        } else {
            ps psVar = (ps) this.b.f.b;
            ndc ndcVar = (ndc) psVar.get(U);
            if (ndcVar == null) {
                ndcVar = ndc.a();
                psVar.put(U, ndcVar);
            }
            ndcVar.a |= 1;
        }
        e49 e49Var = (e49) view.getLayoutParams();
        if (!U.s() && !U.k()) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            mv6 mv6Var = this.a;
            if (parent == recyclerView) {
                hg2 hg2Var = (hg2) mv6Var.c;
                int indexOfChild = ((RecyclerView) ((ln8) mv6Var.b).b).indexOfChild(view);
                if (indexOfChild == -1 || hg2Var.x(indexOfChild)) {
                    i2 = -1;
                } else {
                    i2 = indexOfChild - hg2Var.s(indexOfChild);
                }
                if (i == -1) {
                    i = this.a.J();
                }
                if (i2 != -1) {
                    if (i2 != i) {
                        d49 d49Var = this.b.y;
                        View q = d49Var.q(i2);
                        if (q != null) {
                            d49Var.q(i2);
                            d49Var.a.w(i2);
                            e49 e49Var2 = (e49) q.getLayoutParams();
                            s49 U2 = RecyclerView.U(q);
                            boolean j = U2.j();
                            RecyclerView recyclerView2 = d49Var.b;
                            if (j) {
                                ps psVar2 = (ps) recyclerView2.f.b;
                                ndc ndcVar2 = (ndc) psVar2.get(U2);
                                if (ndcVar2 == null) {
                                    ndcVar2 = ndc.a();
                                    psVar2.put(U2, ndcVar2);
                                }
                                ndcVar2.a |= 1;
                            } else {
                                recyclerView2.f.n(U2);
                            }
                            d49Var.a.n(q, i, e49Var2, U2.j());
                        } else {
                            RecyclerView recyclerView3 = d49Var.b;
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + recyclerView3.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.C());
                }
            } else {
                mv6Var.m(i, view, false);
                e49Var.c = true;
                o49 o49Var = this.e;
                if (o49Var != null && o49Var.e) {
                    o49Var.b.getClass();
                    if (RecyclerView.S(view) == o49Var.a) {
                        o49Var.f = view;
                    }
                }
            }
        } else {
            if (U.k()) {
                U.p.l(U);
            } else {
                U.l &= -33;
            }
            this.a.n(view, i, view.getLayoutParams(), false);
        }
        if (e49Var.d) {
            U.a.invalidate();
            e49Var.d = false;
        }
    }

    public abstract void a0(wg2 wg2Var, p49 p49Var);

    public abstract void b(String str);

    public abstract void b0(p49 p49Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.X(view));
        }
    }

    public void c0(wg2 wg2Var, p49 p49Var, int i, int i2) {
        this.b.q(i, i2);
    }

    public abstract boolean d();

    public abstract s26 d0();

    public abstract boolean e();

    public boolean f(e49 e49Var) {
        return true;
    }

    public final void f0(wg2 wg2Var) {
        for (int r = r() - 1; r >= 0; r--) {
            if (!RecyclerView.U(q(r)).r()) {
                h0(r, wg2Var);
            }
        }
    }

    public final void g0(wg2 wg2Var) {
        ArrayList arrayList;
        int size = ((ArrayList) wg2Var.c).size();
        int i = size - 1;
        while (true) {
            arrayList = (ArrayList) wg2Var.c;
            if (i < 0) {
                break;
            }
            View view = ((s49) arrayList.get(i)).a;
            s49 U = RecyclerView.U(view);
            if (!U.r()) {
                U.q(false);
                if (U.l()) {
                    this.b.removeDetachedView(view, false);
                }
                b49 b49Var = this.b.d0;
                if (b49Var != null) {
                    b49Var.f(U);
                }
                U.q(true);
                s49 U2 = RecyclerView.U(view);
                U2.p = null;
                U2.q = false;
                U2.l &= -33;
                wg2Var.i(U2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) wg2Var.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int h(p49 p49Var);

    public final void h0(int i, wg2 wg2Var) {
        View q = q(i);
        if (RecyclerView.U(q).r()) {
            return;
        }
        i0(i);
        wg2Var.h(q);
    }

    public abstract int i(p49 p49Var);

    public final void i0(int i) {
        if (q(i) != null) {
            mv6 mv6Var = this.a;
            int O = mv6Var.O(i);
            ln8 ln8Var = (ln8) mv6Var.b;
            View childAt = ((RecyclerView) ln8Var.b).getChildAt(O);
            if (childAt != null) {
                if (((hg2) mv6Var.c).z(O)) {
                    mv6Var.u0(childAt);
                }
                ln8Var.J(O);
            }
        }
    }

    public abstract int j(p49 p49Var);

    public final boolean j0(androidx.recyclerview.widget.RecyclerView r8, android.view.View r9, android.graphics.Rect r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d49.j0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int k(p49 p49Var);

    public final void k0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int l(p49 p49Var);

    public abstract int l0(int i, wg2 wg2Var, p49 p49Var);

    public final View m(int i) {
        int r = r();
        if (r != 0) {
            int G = i - G(q(0));
            if (G >= 0 && G < r) {
                View q = q(G);
                if (G(q) == i) {
                    return q;
                }
            }
            int r2 = r();
            for (int i2 = 0; i2 < r2; i2++) {
                View q2 = q(i2);
                s49 U = RecyclerView.U(q2);
                if (U != null && U.c() == i && !U.r() && (this.b.v0.g || !U.j())) {
                    return q2;
                }
            }
            return null;
        }
        return null;
    }

    public abstract void m0(int i);

    public e49 n() {
        return new e49(-2, -2);
    }

    public abstract int n0(int i, wg2 wg2Var, p49 p49Var);

    public e49 o(Context context, AttributeSet attributeSet) {
        return new e49(context, attributeSet);
    }

    public final void o0(RecyclerView recyclerView) {
        p0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public e49 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e49) {
            return new e49((e49) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e49((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e49(layoutParams);
    }

    public final void p0(int i, int i2) {
        this.m = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.k = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.R0;
        }
        this.n = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.l = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.R0;
        }
    }

    public final View q(int i) {
        mv6 mv6Var = this.a;
        if (mv6Var != null) {
            return mv6Var.I(i);
        }
        return null;
    }

    public void q0(Rect rect, int i, int i2) {
        int D = D() + C() + rect.width();
        int B = B() + E() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = jdc.a;
        this.b.setMeasuredDimension(g(i, D, recyclerView.getMinimumWidth()), g(i2, B, this.b.getMinimumHeight()));
    }

    public final int r() {
        mv6 mv6Var = this.a;
        if (mv6Var != null) {
            return mv6Var.J();
        }
        return 0;
    }

    public final void r0(int i, int i2) {
        int r = r();
        if (r == 0) {
            this.b.q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < r; i7++) {
            View q = q(i7);
            Rect rect = this.b.r;
            RecyclerView.V(q, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.r.set(i6, i4, i3, i5);
        q0(this.b.r, i, i2);
    }

    public final void s0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.m = 0;
            this.n = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.e;
            this.m = recyclerView.getWidth();
            this.n = recyclerView.getHeight();
        }
        this.k = 1073741824;
        this.l = 1073741824;
    }

    public int[] t(View view, Rect rect) {
        int C = C();
        int E = E();
        int D = this.m - D();
        int B = this.n - B();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - C;
        int min = Math.min(0, i);
        int i2 = top - E;
        int min2 = Math.min(0, i2);
        int i3 = width - D;
        int max = Math.max(0, i3);
        int max2 = Math.max(0, height - B);
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = jdc.a;
        if (recyclerView.getLayoutDirection() == 1) {
            if (max == 0) {
                max = Math.max(min, i3);
            }
        } else {
            if (min == 0) {
                min = Math.min(i, max);
            }
            max = min;
        }
        if (min2 == 0) {
            min2 = Math.min(i2, max2);
        }
        return new int[]{max, min2};
    }

    public final boolean t0(View view, int i, int i2, e49 e49Var) {
        if (!view.isLayoutRequested() && this.g && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) e49Var).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) e49Var).height)) {
            return false;
        }
        return true;
    }

    public int u(wg2 wg2Var, p49 p49Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.x != null && d()) {
            return this.b.x.b();
        }
        return 1;
    }

    public void u0(RecyclerView recyclerView, p49 p49Var, int i) {
        u26 u26Var = new u26(recyclerView.getContext());
        u26Var.a = i;
        v0(u26Var);
    }

    public final void v0(o49 o49Var) {
        o49 o49Var2 = this.e;
        if (o49Var2 != null && o49Var != o49Var2 && o49Var2.e) {
            o49Var2.h();
        }
        this.e = o49Var;
        RecyclerView recyclerView = this.b;
        o49Var.getClass();
        recyclerView.P0 = true;
        r49 r49Var = recyclerView.s0;
        RecyclerView recyclerView2 = r49Var.h;
        if (recyclerView2.P0) {
            recyclerView2.removeCallbacks(r49Var);
            r49Var.c.abortAnimation();
        }
        if (o49Var.h) {
            Log.w("RecyclerView", "An instance of " + o49Var.getClass().getSimpleName() + " was started more than once. Each instance of" + o49Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        o49Var.b = recyclerView;
        o49Var.c = this;
        int i = o49Var.a;
        if (i != -1) {
            recyclerView.v0.a = i;
            o49Var.e = true;
            o49Var.d = true;
            o49Var.f = recyclerView.y.m(i);
            o49Var.e();
            o49Var.b.s0.a();
            o49Var.h = true;
            return;
        }
        w26.j("Invalid target position");
    }

    public abstract boolean x0();

    public int z() {
        return A();
    }

    public void P() {
    }

    public void Y() {
    }

    public void e0() {
    }

    public void V(RecyclerView recyclerView) {
    }

    public void U(RecyclerView recyclerView, int i, int i2) {
    }

    public void W(RecyclerView recyclerView, int i, int i2) {
    }

    public void X(RecyclerView recyclerView, int i, int i2) {
    }
}
