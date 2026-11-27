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
public abstract class q79 {
    public rx6 a;
    public RecyclerView b;
    public final ym4 c;
    public final ym4 d;
    public b89 e;
    public boolean f;
    public final boolean g;
    public final boolean h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;

    public q79() {
        xh4 xh4Var = new xh4(this, (byte) 28);
        i09 i09Var = new i09(this, (byte) 2);
        this.c = new ym4(xh4Var);
        this.d = new ym4(i09Var);
        this.f = false;
        this.g = true;
        this.h = true;
    }

    public static int G(View view) {
        return ((r79) view.getLayoutParams()).b();
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
        r79 r79Var = (r79) view.getLayoutParams();
        Rect rect = r79Var.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) r79Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) r79Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) r79Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) r79Var).bottomMargin);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q79.s(boolean, int, int, int, int):int");
    }

    public static int v(View view) {
        return view.getBottom() + ((r79) view.getLayoutParams()).b.bottom;
    }

    public static int w(View view) {
        return view.getLeft() - ((r79) view.getLayoutParams()).b.left;
    }

    public static void w0(View view) {
        f89 V = RecyclerView.V(view);
        V.l &= -129;
        V.o();
        V.a(4);
    }

    public static int x(View view) {
        return view.getRight() + ((r79) view.getLayoutParams()).b.right;
    }

    public static int y(View view) {
        return view.getTop() - ((r79) view.getLayoutParams()).b.top;
    }

    public final int A() {
        j79 j79Var;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            j79Var = recyclerView.getAdapter();
        } else {
            j79Var = null;
        }
        if (j79Var != null) {
            return j79Var.b();
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

    public int H(oh2 oh2Var, c89 c89Var) {
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
        Rect rect2 = ((r79) view.getLayoutParams()).b;
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
            f89 V = RecyclerView.V(view);
            V.a(128);
            this.b.f.r(V);
            return;
        }
        lq5.j("View should be fully attached to be ignored".concat(this.b.D()));
    }

    public void O(View view) {
        r79 r79Var = (r79) view.getLayoutParams();
        Rect Y = this.b.Y(view);
        int i = Y.left + Y.right;
        int i2 = Y.top + Y.bottom;
        int s = s(d(), this.m, this.k, D() + C() + ((ViewGroup.MarginLayoutParams) r79Var).leftMargin + ((ViewGroup.MarginLayoutParams) r79Var).rightMargin + i, ((ViewGroup.MarginLayoutParams) r79Var).width);
        int s2 = s(e(), this.n, this.l, B() + E() + ((ViewGroup.MarginLayoutParams) r79Var).topMargin + ((ViewGroup.MarginLayoutParams) r79Var).bottomMargin + i2, ((ViewGroup.MarginLayoutParams) r79Var).height);
        if (t0(view, s, s2, r79Var)) {
            view.measure(s, s2);
        }
    }

    public abstract View Q(View view, int i, oh2 oh2Var, c89 c89Var);

    public void R(oh2 oh2Var, c89 c89Var, v4 v4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = v4Var.a;
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            v4Var.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            v4Var.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(H(oh2Var, c89Var), u(oh2Var, c89Var), false, 0));
    }

    public void S(oh2 oh2Var, c89 c89Var, View view, v4 v4Var) {
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
        v4Var.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, 1, i2, 1, false, false));
    }

    public final void T(View view, v4 v4Var) {
        f89 V = RecyclerView.V(view);
        if (V != null && !V.j()) {
            rx6 rx6Var = this.a;
            if (!((ArrayList) rx6Var.d).contains(V.a)) {
                RecyclerView recyclerView = this.b;
                S(recyclerView.b, recyclerView.v0, view, v4Var);
            }
        }
    }

    public void Z(RecyclerView recyclerView, int i, int i2, Object obj) {
        Y();
    }

    public final void a(int i, View view, boolean z) {
        int i2;
        f89 V = RecyclerView.V(view);
        if (!z && !V.j()) {
            this.b.f.q(V);
        } else {
            qs qsVar = (qs) this.b.f.b;
            mhc mhcVar = (mhc) qsVar.get(V);
            if (mhcVar == null) {
                mhcVar = mhc.a();
                qsVar.put(V, mhcVar);
            }
            mhcVar.a |= 1;
        }
        r79 r79Var = (r79) view.getLayoutParams();
        if (!V.s() && !V.k()) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            rx6 rx6Var = this.a;
            if (parent == recyclerView) {
                zg2 zg2Var = (zg2) rx6Var.c;
                int indexOfChild = ((RecyclerView) ((i09) rx6Var.b).b).indexOfChild(view);
                if (indexOfChild == -1 || zg2Var.w(indexOfChild)) {
                    i2 = -1;
                } else {
                    i2 = indexOfChild - zg2Var.s(indexOfChild);
                }
                if (i == -1) {
                    i = this.a.K();
                }
                if (i2 != -1) {
                    if (i2 != i) {
                        q79 q79Var = this.b.y;
                        View q = q79Var.q(i2);
                        if (q != null) {
                            q79Var.q(i2);
                            q79Var.a.z(i2);
                            r79 r79Var2 = (r79) q.getLayoutParams();
                            f89 V2 = RecyclerView.V(q);
                            boolean j = V2.j();
                            RecyclerView recyclerView2 = q79Var.b;
                            if (j) {
                                qs qsVar2 = (qs) recyclerView2.f.b;
                                mhc mhcVar2 = (mhc) qsVar2.get(V2);
                                if (mhcVar2 == null) {
                                    mhcVar2 = mhc.a();
                                    qsVar2.put(V2, mhcVar2);
                                }
                                mhcVar2.a |= 1;
                            } else {
                                recyclerView2.f.q(V2);
                            }
                            q79Var.a.s(q, i, r79Var2, V2.j());
                        } else {
                            RecyclerView recyclerView3 = q79Var.b;
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + recyclerView3.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.D());
                }
            } else {
                rx6Var.r(i, view, false);
                r79Var.c = true;
                b89 b89Var = this.e;
                if (b89Var != null && b89Var.e) {
                    b89Var.b.getClass();
                    if (RecyclerView.T(view) == b89Var.a) {
                        b89Var.f = view;
                    }
                }
            }
        } else {
            if (V.k()) {
                V.p.l(V);
            } else {
                V.l &= -33;
            }
            this.a.s(view, i, view.getLayoutParams(), false);
        }
        if (r79Var.d) {
            V.a.invalidate();
            r79Var.d = false;
        }
    }

    public abstract void a0(oh2 oh2Var, c89 c89Var);

    public abstract void b(String str);

    public abstract void b0(c89 c89Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.Y(view));
        }
    }

    public void c0(oh2 oh2Var, c89 c89Var, int i, int i2) {
        this.b.r(i, i2);
    }

    public abstract boolean d();

    public abstract w46 d0();

    public abstract boolean e();

    public boolean f(r79 r79Var) {
        return true;
    }

    public final void f0(oh2 oh2Var) {
        for (int r = r() - 1; r >= 0; r--) {
            if (!RecyclerView.V(q(r)).r()) {
                h0(r, oh2Var);
            }
        }
    }

    public final void g0(oh2 oh2Var) {
        ArrayList arrayList;
        int size = ((ArrayList) oh2Var.c).size();
        int i = size - 1;
        while (true) {
            arrayList = (ArrayList) oh2Var.c;
            if (i < 0) {
                break;
            }
            View view = ((f89) arrayList.get(i)).a;
            f89 V = RecyclerView.V(view);
            if (!V.r()) {
                V.q(false);
                if (V.l()) {
                    this.b.removeDetachedView(view, false);
                }
                o79 o79Var = this.b.d0;
                if (o79Var != null) {
                    o79Var.f(V);
                }
                V.q(true);
                f89 V2 = RecyclerView.V(view);
                V2.p = null;
                V2.q = false;
                V2.l &= -33;
                oh2Var.i(V2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) oh2Var.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int h(c89 c89Var);

    public final void h0(int i, oh2 oh2Var) {
        View q = q(i);
        if (RecyclerView.V(q).r()) {
            return;
        }
        i0(i);
        oh2Var.h(q);
    }

    public abstract int i(c89 c89Var);

    public final void i0(int i) {
        if (q(i) != null) {
            rx6 rx6Var = this.a;
            int P = rx6Var.P(i);
            i09 i09Var = (i09) rx6Var.b;
            View childAt = ((RecyclerView) i09Var.b).getChildAt(P);
            if (childAt != null) {
                if (((zg2) rx6Var.c).y(P)) {
                    rx6Var.A0(childAt);
                }
                i09Var.N(P);
            }
        }
    }

    public abstract int j(c89 c89Var);

    public final boolean j0(androidx.recyclerview.widget.RecyclerView r8, android.view.View r9, android.graphics.Rect r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q79.j0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int k(c89 c89Var);

    public final void k0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int l(c89 c89Var);

    public abstract int l0(int i, oh2 oh2Var, c89 c89Var);

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
                f89 V = RecyclerView.V(q2);
                if (V != null && V.c() == i && !V.r() && (this.b.v0.g || !V.j())) {
                    return q2;
                }
            }
            return null;
        }
        return null;
    }

    public abstract void m0(int i);

    public r79 n() {
        return new r79(-2, -2);
    }

    public abstract int n0(int i, oh2 oh2Var, c89 c89Var);

    public r79 o(Context context, AttributeSet attributeSet) {
        return new r79(context, attributeSet);
    }

    public final void o0(RecyclerView recyclerView) {
        p0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public r79 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof r79) {
            return new r79((r79) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new r79((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new r79(layoutParams);
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
        rx6 rx6Var = this.a;
        if (rx6Var != null) {
            return rx6Var.J(i);
        }
        return null;
    }

    public void q0(Rect rect, int i, int i2) {
        int D = D() + C() + rect.width();
        int B = B() + E() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = ihc.a;
        this.b.setMeasuredDimension(g(i, D, recyclerView.getMinimumWidth()), g(i2, B, this.b.getMinimumHeight()));
    }

    public final int r() {
        rx6 rx6Var = this.a;
        if (rx6Var != null) {
            return rx6Var.K();
        }
        return 0;
    }

    public final void r0(int i, int i2) {
        int r = r();
        if (r == 0) {
            this.b.r(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < r; i7++) {
            View q = q(i7);
            Rect rect = this.b.r;
            RecyclerView.W(q, rect);
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
        WeakHashMap weakHashMap = ihc.a;
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

    public final boolean t0(View view, int i, int i2, r79 r79Var) {
        if (!view.isLayoutRequested() && this.g && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) r79Var).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) r79Var).height)) {
            return false;
        }
        return true;
    }

    public int u(oh2 oh2Var, c89 c89Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.x != null && d()) {
            return this.b.x.b();
        }
        return 1;
    }

    public void u0(RecyclerView recyclerView, c89 c89Var, int i) {
        y46 y46Var = new y46(recyclerView.getContext());
        y46Var.a = i;
        v0(y46Var);
    }

    public final void v0(b89 b89Var) {
        b89 b89Var2 = this.e;
        if (b89Var2 != null && b89Var != b89Var2 && b89Var2.e) {
            b89Var2.h();
        }
        this.e = b89Var;
        RecyclerView recyclerView = this.b;
        b89Var.getClass();
        recyclerView.P0 = true;
        e89 e89Var = recyclerView.s0;
        RecyclerView recyclerView2 = e89Var.h;
        if (recyclerView2.P0) {
            recyclerView2.removeCallbacks(e89Var);
            e89Var.c.abortAnimation();
        }
        if (b89Var.h) {
            Log.w("RecyclerView", "An instance of " + b89Var.getClass().getSimpleName() + " was started more than once. Each instance of" + b89Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        b89Var.b = recyclerView;
        b89Var.c = this;
        int i = b89Var.a;
        if (i != -1) {
            recyclerView.v0.a = i;
            b89Var.e = true;
            b89Var.d = true;
            b89Var.f = recyclerView.y.m(i);
            b89Var.e();
            b89Var.b.s0.a();
            b89Var.h = true;
            return;
        }
        lq5.j("Invalid target position");
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
