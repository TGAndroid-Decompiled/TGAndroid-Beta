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
public abstract class f69 {
    public mx6 a;
    public RecyclerView b;
    public final rhb c;
    public final rhb d;
    public q69 e;
    public boolean f;
    public final boolean g;
    public final boolean h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;

    public f69() {
        x59 x59Var = new x59(this, (byte) 1);
        ai4 ai4Var = new ai4(this, (byte) 27);
        this.c = new rhb(x59Var);
        this.d = new rhb(ai4Var);
        this.f = false;
        this.g = true;
        this.h = true;
    }

    public static int G(View view) {
        return ((g69) view.getLayoutParams()).b();
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
        g69 g69Var = (g69) view.getLayoutParams();
        Rect rect = g69Var.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) g69Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) g69Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) g69Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) g69Var).bottomMargin);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f69.s(boolean, int, int, int, int):int");
    }

    public static int v(View view) {
        return view.getBottom() + ((g69) view.getLayoutParams()).b.bottom;
    }

    public static int w(View view) {
        return view.getLeft() - ((g69) view.getLayoutParams()).b.left;
    }

    public static void w0(View view) {
        u69 U = RecyclerView.U(view);
        U.l &= -129;
        U.o();
        U.a(4);
    }

    public static int x(View view) {
        return view.getRight() + ((g69) view.getLayoutParams()).b.right;
    }

    public static int y(View view) {
        return view.getTop() - ((g69) view.getLayoutParams()).b.top;
    }

    public final int A() {
        y59 y59Var;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            y59Var = recyclerView.getAdapter();
        } else {
            y59Var = null;
        }
        if (y59Var != null) {
            return y59Var.b();
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

    public int H(ki2 ki2Var, r69 r69Var) {
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
        Rect rect2 = ((g69) view.getLayoutParams()).b;
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
            u69 U = RecyclerView.U(view);
            U.a(128);
            this.b.f.o(U);
            return;
        }
        u36.j("View should be fully attached to be ignored".concat(this.b.C()));
    }

    public void O(View view) {
        g69 g69Var = (g69) view.getLayoutParams();
        Rect X = this.b.X(view);
        int i = X.left + X.right;
        int i2 = X.top + X.bottom;
        int s = s(d(), this.m, this.k, D() + C() + ((ViewGroup.MarginLayoutParams) g69Var).leftMargin + ((ViewGroup.MarginLayoutParams) g69Var).rightMargin + i, ((ViewGroup.MarginLayoutParams) g69Var).width);
        int s2 = s(e(), this.n, this.l, B() + E() + ((ViewGroup.MarginLayoutParams) g69Var).topMargin + ((ViewGroup.MarginLayoutParams) g69Var).bottomMargin + i2, ((ViewGroup.MarginLayoutParams) g69Var).height);
        if (t0(view, s, s2, g69Var)) {
            view.measure(s, s2);
        }
    }

    public abstract View Q(View view, int i, ki2 ki2Var, r69 r69Var);

    public void R(ki2 ki2Var, r69 r69Var, u4 u4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = u4Var.a;
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            u4Var.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            u4Var.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(H(ki2Var, r69Var), u(ki2Var, r69Var), false, 0));
    }

    public void S(ki2 ki2Var, r69 r69Var, View view, u4 u4Var) {
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
        u69 U = RecyclerView.U(view);
        if (U != null && !U.j()) {
            mx6 mx6Var = this.a;
            if (!((ArrayList) mx6Var.d).contains(U.a)) {
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
        u69 U = RecyclerView.U(view);
        if (!z && !U.j()) {
            this.b.f.n(U);
        } else {
            qt qtVar = (qt) this.b.f.b;
            ofc ofcVar = (ofc) qtVar.get(U);
            if (ofcVar == null) {
                ofcVar = ofc.a();
                qtVar.put(U, ofcVar);
            }
            ofcVar.a |= 1;
        }
        g69 g69Var = (g69) view.getLayoutParams();
        if (!U.s() && !U.k()) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            mx6 mx6Var = this.a;
            if (parent == recyclerView) {
                vh2 vh2Var = (vh2) mx6Var.c;
                int indexOfChild = ((RecyclerView) ((ai4) mx6Var.b).b).indexOfChild(view);
                if (indexOfChild == -1 || vh2Var.x(indexOfChild)) {
                    i2 = -1;
                } else {
                    i2 = indexOfChild - vh2Var.n(indexOfChild);
                }
                if (i == -1) {
                    i = this.a.L();
                }
                if (i2 != -1) {
                    if (i2 != i) {
                        f69 f69Var = this.b.y;
                        View q = f69Var.q(i2);
                        if (q != null) {
                            f69Var.q(i2);
                            f69Var.a.z(i2);
                            g69 g69Var2 = (g69) q.getLayoutParams();
                            u69 U2 = RecyclerView.U(q);
                            boolean j = U2.j();
                            RecyclerView recyclerView2 = f69Var.b;
                            if (j) {
                                qt qtVar2 = (qt) recyclerView2.f.b;
                                ofc ofcVar2 = (ofc) qtVar2.get(U2);
                                if (ofcVar2 == null) {
                                    ofcVar2 = ofc.a();
                                    qtVar2.put(U2, ofcVar2);
                                }
                                ofcVar2.a |= 1;
                            } else {
                                recyclerView2.f.n(U2);
                            }
                            f69Var.a.t(q, i, g69Var2, U2.j());
                        } else {
                            RecyclerView recyclerView3 = f69Var.b;
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + recyclerView3.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.C());
                }
            } else {
                mx6Var.r(i, view, false);
                g69Var.c = true;
                q69 q69Var = this.e;
                if (q69Var != null && q69Var.e) {
                    q69Var.b.getClass();
                    if (RecyclerView.S(view) == q69Var.a) {
                        q69Var.f = view;
                    }
                }
            }
        } else {
            if (U.k()) {
                U.p.l(U);
            } else {
                U.l &= -33;
            }
            this.a.t(view, i, view.getLayoutParams(), false);
        }
        if (g69Var.d) {
            U.a.invalidate();
            g69Var.d = false;
        }
    }

    public abstract void a0(ki2 ki2Var, r69 r69Var);

    public abstract void b(String str);

    public abstract void b0(r69 r69Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.X(view));
        }
    }

    public void c0(ki2 ki2Var, r69 r69Var, int i, int i2) {
        this.b.q(i, i2);
    }

    public abstract boolean d();

    public abstract t46 d0();

    public abstract boolean e();

    public boolean f(g69 g69Var) {
        return true;
    }

    public final void f0(ki2 ki2Var) {
        for (int r = r() - 1; r >= 0; r--) {
            if (!RecyclerView.U(q(r)).r()) {
                h0(r, ki2Var);
            }
        }
    }

    public final void g0(ki2 ki2Var) {
        ArrayList arrayList;
        int size = ((ArrayList) ki2Var.c).size();
        int i = size - 1;
        while (true) {
            arrayList = (ArrayList) ki2Var.c;
            if (i < 0) {
                break;
            }
            View view = ((u69) arrayList.get(i)).a;
            u69 U = RecyclerView.U(view);
            if (!U.r()) {
                U.q(false);
                if (U.l()) {
                    this.b.removeDetachedView(view, false);
                }
                d69 d69Var = this.b.d0;
                if (d69Var != null) {
                    d69Var.f(U);
                }
                U.q(true);
                u69 U2 = RecyclerView.U(view);
                U2.p = null;
                U2.q = false;
                U2.l &= -33;
                ki2Var.i(U2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) ki2Var.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int h(r69 r69Var);

    public final void h0(int i, ki2 ki2Var) {
        View q = q(i);
        if (RecyclerView.U(q).r()) {
            return;
        }
        i0(i);
        ki2Var.h(q);
    }

    public abstract int i(r69 r69Var);

    public final void i0(int i) {
        if (q(i) != null) {
            mx6 mx6Var = this.a;
            int Q = mx6Var.Q(i);
            ai4 ai4Var = (ai4) mx6Var.b;
            View childAt = ((RecyclerView) ai4Var.b).getChildAt(Q);
            if (childAt != null) {
                if (((vh2) mx6Var.c).z(Q)) {
                    mx6Var.y0(childAt);
                }
                ai4Var.S(Q);
            }
        }
    }

    public abstract int j(r69 r69Var);

    public final boolean j0(androidx.recyclerview.widget.RecyclerView r8, android.view.View r9, android.graphics.Rect r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f69.j0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int k(r69 r69Var);

    public final void k0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int l(r69 r69Var);

    public abstract int l0(int i, ki2 ki2Var, r69 r69Var);

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
                u69 U = RecyclerView.U(q2);
                if (U != null && U.c() == i && !U.r() && (this.b.v0.g || !U.j())) {
                    return q2;
                }
            }
            return null;
        }
        return null;
    }

    public abstract void m0(int i);

    public g69 n() {
        return new g69(-2, -2);
    }

    public abstract int n0(int i, ki2 ki2Var, r69 r69Var);

    public g69 o(Context context, AttributeSet attributeSet) {
        return new g69(context, attributeSet);
    }

    public final void o0(RecyclerView recyclerView) {
        p0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public g69 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g69) {
            return new g69((g69) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g69((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new g69(layoutParams);
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
        mx6 mx6Var = this.a;
        if (mx6Var != null) {
            return mx6Var.K(i);
        }
        return null;
    }

    public void q0(Rect rect, int i, int i2) {
        int D = D() + C() + rect.width();
        int B = B() + E() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = kfc.a;
        this.b.setMeasuredDimension(g(i, D, recyclerView.getMinimumWidth()), g(i2, B, this.b.getMinimumHeight()));
    }

    public final int r() {
        mx6 mx6Var = this.a;
        if (mx6Var != null) {
            return mx6Var.L();
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
        WeakHashMap weakHashMap = kfc.a;
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

    public final boolean t0(View view, int i, int i2, g69 g69Var) {
        if (!view.isLayoutRequested() && this.g && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) g69Var).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) g69Var).height)) {
            return false;
        }
        return true;
    }

    public int u(ki2 ki2Var, r69 r69Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.x != null && d()) {
            return this.b.x.b();
        }
        return 1;
    }

    public void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        v46 v46Var = new v46(recyclerView.getContext());
        v46Var.a = i;
        v0(v46Var);
    }

    public final void v0(q69 q69Var) {
        q69 q69Var2 = this.e;
        if (q69Var2 != null && q69Var != q69Var2 && q69Var2.e) {
            q69Var2.h();
        }
        this.e = q69Var;
        RecyclerView recyclerView = this.b;
        q69Var.getClass();
        recyclerView.P0 = true;
        t69 t69Var = recyclerView.s0;
        RecyclerView recyclerView2 = t69Var.h;
        if (recyclerView2.P0) {
            recyclerView2.removeCallbacks(t69Var);
            t69Var.c.abortAnimation();
        }
        if (q69Var.h) {
            Log.w("RecyclerView", "An instance of " + q69Var.getClass().getSimpleName() + " was started more than once. Each instance of" + q69Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        q69Var.b = recyclerView;
        q69Var.c = this;
        int i = q69Var.a;
        if (i != -1) {
            recyclerView.v0.a = i;
            q69Var.e = true;
            q69Var.d = true;
            q69Var.f = recyclerView.y.m(i);
            q69Var.e();
            q69Var.b.s0.a();
            q69Var.h = true;
            return;
        }
        u36.j("Invalid target position");
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
