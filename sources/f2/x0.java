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

public abstract class x0 {

    public a5.n f5852a;

    public RecyclerView f5853b;

    public final xe.b f5854c;
    public final xe.b d;

    public k1 f5855e;

    public boolean f5856f;

    public final boolean f5857g;
    public final boolean h;

    public int f5858i;

    public boolean f5859j;

    public int f5860k;

    public int f5861l;

    public int f5862m;

    public int f5863n;

    public x0() {
        k5.i iVar = new k5.i(this, 13);
        a9.i iVar2 = new a9.i(this, 14);
        this.f5854c = new xe.b(iVar);
        this.d = new xe.b(iVar2);
        this.f5856f = false;
        this.f5857g = true;
        this.h = true;
    }

    public static int H(View view) {
        return ((y0) view.getLayoutParams()).b();
    }

    public static boolean N(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i10;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i10;
        }
        return true;
    }

    public static void O(View view, int i10, int i11, int i12, int i13) {
        y0 y0Var = (y0) view.getLayoutParams();
        Rect rect = y0Var.f5865b;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) y0Var).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) y0Var).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) y0Var).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin);
    }

    public static int g(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i11, i12) : size;
        }
        return Math.min(size, Math.max(i11, i12));
    }

    public static int s(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, i10 - i12);
        if (z10) {
            if (i13 >= 0) {
                i11 = 1073741824;
            } else if (i13 != -1 || (i11 != Integer.MIN_VALUE && (i11 == 0 || i11 != 1073741824))) {
                i11 = 0;
                i13 = 0;
            } else {
                i13 = iMax;
            }
        } else if (i13 >= 0) {
            i11 = 1073741824;
        } else if (i13 == -1) {
            i13 = iMax;
        } else if (i13 != -2) {
            i11 = 0;
            i13 = 0;
        } else if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
            i13 = iMax;
            i11 = Integer.MIN_VALUE;
        } else {
            i13 = iMax;
            i11 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i13, i11);
    }

    public static int v(View view) {
        return view.getBottom() + ((y0) view.getLayoutParams()).f5865b.bottom;
    }

    public static void w(View view, Rect rect) {
        int[] iArr = RecyclerView.L0;
        y0 y0Var = (y0) view.getLayoutParams();
        Rect rect2 = y0Var.f5865b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) y0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) y0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) y0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin);
    }

    public static int x(View view) {
        return view.getLeft() - ((y0) view.getLayoutParams()).f5865b.left;
    }

    public static void x0(View view) {
        o1 o1VarU = RecyclerView.U(view);
        o1VarU.f5798l &= -129;
        o1VarU.o();
        o1VarU.a(4);
    }

    public static int y(View view) {
        return view.getRight() + ((y0) view.getLayoutParams()).f5865b.right;
    }

    public static int z(View view) {
        return view.getTop() - ((y0) view.getLayoutParams()).f5865b.top;
    }

    public int A() {
        return B();
    }

    public final int B() {
        RecyclerView recyclerView = this.f5853b;
        q0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.h();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f5853b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f5853b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f5853b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f5853b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int G() {
        return F();
    }

    public int I(e1 e1Var, l1 l1Var) {
        RecyclerView recyclerView = this.f5853b;
        if (recyclerView == null || recyclerView.f1862w == null || !e()) {
            return 1;
        }
        return this.f5853b.f1862w.h();
    }

    public int J() {
        return F();
    }

    public int K() {
        return (this.f5863n - F()) - C();
    }

    public final void L(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((y0) view.getLayoutParams()).f5865b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f5853b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f5853b.v;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void M(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.f5853b;
        if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
            throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f5853b.C());
        }
        o1 o1VarU = RecyclerView.U(view);
        o1VarU.a(128);
        this.f5853b.f1842f.O(o1VarU);
    }

    public void P(View view) {
        y0 y0Var = (y0) view.getLayoutParams();
        Rect rectW = this.f5853b.W(view);
        int i10 = rectW.left + rectW.right;
        int i11 = rectW.top + rectW.bottom;
        int iS = s(d(), this.f5862m, this.f5860k, E() + D() + ((ViewGroup.MarginLayoutParams) y0Var).leftMargin + ((ViewGroup.MarginLayoutParams) y0Var).rightMargin + i10, ((ViewGroup.MarginLayoutParams) y0Var).width);
        int iS2 = s(e(), this.f5863n, this.f5861l, C() + F() + ((ViewGroup.MarginLayoutParams) y0Var).topMargin + ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin + i11, ((ViewGroup.MarginLayoutParams) y0Var).height);
        if (u0(view, iS, iS2, y0Var)) {
            view.measure(iS, iS2);
        }
    }

    public abstract View R(View view, int i10, e1 e1Var, l1 l1Var);

    public void S(e1 e1Var, l1 l1Var, s0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f47656a;
        if (this.f5853b.canScrollVertically(-1) || this.f5853b.canScrollHorizontally(-1)) {
            cVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f5853b.canScrollVertically(1) || this.f5853b.canScrollHorizontally(1)) {
            cVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(e1Var, l1Var), u(e1Var, l1Var), false, 0));
    }

    public final void T(View view, s0.c cVar) {
        o1 o1VarU = RecyclerView.U(view);
        if (o1VarU == null || o1VarU.j()) {
            return;
        }
        a5.n nVar = this.f5852a;
        if (((ArrayList) nVar.d).contains(o1VarU.f5789a)) {
            return;
        }
        RecyclerView recyclerView = this.f5853b;
        U(recyclerView.f1835b, recyclerView.f1853p0, view, cVar);
    }

    public void U(e1 e1Var, l1 l1Var, View view, s0.c cVar) {
        cVar.f47656a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(e() ? H(view) : 0, 1, d() ? H(view) : 0, 1, false, false));
    }

    public final void a(View view, int i10, boolean z10) {
        o1 o1VarU = RecyclerView.U(view);
        if (z10 || o1VarU.j()) {
            a0.f fVar = (a0.f) this.f5853b.f1842f.f49392b;
            u1 u1VarA = (u1) fVar.get(o1VarU);
            if (u1VarA == null) {
                u1VarA = u1.a();
                fVar.put(o1VarU, u1VarA);
            }
            u1VarA.f5835a |= 1;
        } else {
            this.f5853b.f1842f.N(o1VarU);
        }
        y0 y0Var = (y0) view.getLayoutParams();
        if (o1VarU.s() || o1VarU.k()) {
            if (o1VarU.k()) {
                o1VarU.f5802p.k(o1VarU);
            } else {
                o1VarU.f5798l &= -33;
            }
            this.f5852a.b(view, i10, view.getLayoutParams(), false);
        } else if (view.getParent() == this.f5853b) {
            a5.n nVar = this.f5852a;
            c cVar = (c) nVar.f101c;
            int iIndexOfChild = ((RecyclerView) ((a9.i) nVar.f100b).f181b).indexOfChild(view);
            int iZ = (iIndexOfChild == -1 || cVar.I(iIndexOfChild)) ? -1 : iIndexOfChild - cVar.z(iIndexOfChild);
            if (i10 == -1) {
                i10 = this.f5852a.o();
            }
            if (iZ == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f5853b.indexOfChild(view) + this.f5853b.C());
            }
            if (iZ != i10) {
                x0 x0Var = this.f5853b.f1864x;
                View viewQ = x0Var.q(iZ);
                if (viewQ == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iZ + x0Var.f5853b.toString());
                }
                x0Var.q(iZ);
                x0Var.f5852a.k(iZ);
                y0 y0Var2 = (y0) viewQ.getLayoutParams();
                o1 o1VarU2 = RecyclerView.U(viewQ);
                if (o1VarU2.j()) {
                    a0.f fVar2 = (a0.f) x0Var.f5853b.f1842f.f49392b;
                    u1 u1VarA2 = (u1) fVar2.get(o1VarU2);
                    if (u1VarA2 == null) {
                        u1VarA2 = u1.a();
                        fVar2.put(o1VarU2, u1VarA2);
                    }
                    u1VarA2.f5835a = 1 | u1VarA2.f5835a;
                } else {
                    x0Var.f5853b.f1842f.N(o1VarU2);
                }
                x0Var.f5852a.b(viewQ, i10, y0Var2, o1VarU2.j());
            }
        } else {
            this.f5852a.a(view, i10, false);
            y0Var.f5866c = true;
            k1 k1Var = this.f5855e;
            if (k1Var != null && k1Var.f5734e) {
                k1Var.f5732b.getClass();
                if (RecyclerView.S(view) == k1Var.f5731a) {
                    k1Var.f5735f = view;
                }
            }
        }
        if (y0Var.d) {
            o1VarU.f5789a.invalidate();
            y0Var.d = false;
        }
    }

    public void a0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        Z();
    }

    public abstract void b(String str);

    public abstract void b0(e1 e1Var, l1 l1Var);

    public final void c(View view, Rect rect) {
        RecyclerView recyclerView = this.f5853b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public abstract void c0(l1 l1Var);

    public abstract boolean d();

    public void d0(e1 e1Var, l1 l1Var, int i10, int i11) {
        this.f5853b.q(i10, i11);
    }

    public abstract boolean e();

    public abstract j0 e0();

    public boolean f(y0 y0Var) {
        return y0Var != null;
    }

    public final void g0(e1 e1Var) {
        for (int iR = r() - 1; iR >= 0; iR--) {
            if (!RecyclerView.U(q(iR)).r()) {
                i0(iR, e1Var);
            }
        }
    }

    public abstract int h(l1 l1Var);

    public final void h0(e1 e1Var) {
        ArrayList arrayList = (ArrayList) e1Var.f5649c;
        ArrayList arrayList2 = (ArrayList) e1Var.f5649c;
        int size = arrayList.size();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            View view = ((o1) arrayList2.get(i10)).f5789a;
            o1 o1VarU = RecyclerView.U(view);
            if (!o1VarU.r()) {
                o1VarU.q(false);
                if (o1VarU.l()) {
                    this.f5853b.removeDetachedView(view, false);
                }
                v0 v0Var = this.f5853b.V;
                if (v0Var != null) {
                    v0Var.f(o1VarU);
                }
                o1VarU.q(true);
                o1 o1VarU2 = RecyclerView.U(view);
                o1VarU2.f5802p = null;
                o1VarU2.f5803q = false;
                o1VarU2.f5798l &= -33;
                e1Var.h(o1VarU2);
            }
        }
        arrayList2.clear();
        ArrayList arrayList3 = (ArrayList) e1Var.d;
        if (arrayList3 != null) {
            arrayList3.clear();
        }
        if (size > 0) {
            this.f5853b.invalidate();
        }
    }

    public abstract int i(l1 l1Var);

    public final void i0(int i10, e1 e1Var) {
        View viewQ = q(i10);
        if (RecyclerView.U(viewQ).r()) {
            return;
        }
        j0(i10);
        e1Var.g(viewQ);
    }

    public abstract int j(l1 l1Var);

    public final void j0(int i10) {
        if (q(i10) != null) {
            a5.n nVar = this.f5852a;
            int iR = nVar.r(i10);
            a9.i iVar = (a9.i) nVar.f100b;
            View childAt = ((RecyclerView) iVar.f181b).getChildAt(iR);
            if (childAt == null) {
                return;
            }
            if (((c) nVar.f101c).K(iR)) {
                nVar.z(childAt);
            }
            iVar.P(iR);
        }
    }

    public abstract int k(l1 l1Var);

    public final boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int[] iArrT = t(view, rect);
        int i10 = iArrT[0];
        int i11 = iArrT[1];
        if (z11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iD = D();
                int iF = F();
                int iE = this.f5862m - E();
                int iC = this.f5863n - C();
                Rect rect2 = this.f5853b.f1855r;
                w(focusedChild, rect2);
                if (rect2.left - i10 < iE && rect2.right - i10 > iD && rect2.top - i11 < iC && rect2.bottom - i11 > iF) {
                    if (i10 == 0) {
                    }
                    if (z10) {
                        recyclerView.scrollBy(i10, i11);
                        return true;
                    }
                    recyclerView.v0(i10, i11, null);
                    return true;
                }
            }
        } else if (i10 == 0 || i11 != 0) {
            if (z10) {
                recyclerView.scrollBy(i10, i11);
                return true;
            }
            recyclerView.v0(i10, i11, null);
            return true;
        }
        return false;
    }

    public abstract int l(l1 l1Var);

    public final void l0() {
        RecyclerView recyclerView = this.f5853b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract View m(int i10);

    public abstract int m0(int i10, e1 e1Var, l1 l1Var);

    public abstract y0 n();

    public abstract void n0(int i10);

    public y0 o(Context context, AttributeSet attributeSet) {
        return new y0(context, attributeSet);
    }

    public abstract int o0(int i10, e1 e1Var, l1 l1Var);

    public y0 p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof y0) {
            return new y0((y0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new y0((ViewGroup.MarginLayoutParams) layoutParams) : new y0(layoutParams);
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final View q(int i10) {
        a5.n nVar = this.f5852a;
        if (nVar != null) {
            return nVar.n(i10);
        }
        return null;
    }

    public final void q0(int i10, int i11) {
        this.f5862m = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.f5860k = mode;
        if (mode == 0 && !RecyclerView.M0) {
            this.f5862m = 0;
        }
        this.f5863n = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f5861l = mode2;
        if (mode2 != 0 || RecyclerView.M0) {
            return;
        }
        this.f5863n = 0;
    }

    public final int r() {
        a5.n nVar = this.f5852a;
        if (nVar != null) {
            return nVar.o();
        }
        return 0;
    }

    public void r0(Rect rect, int i10, int i11) {
        int iE = E() + D() + rect.width();
        int iC = C() + F() + rect.height();
        RecyclerView recyclerView = this.f5853b;
        WeakHashMap weakHashMap = r0.j0.f46605a;
        this.f5853b.setMeasuredDimension(g(i10, iE, recyclerView.getMinimumWidth()), g(i11, iC, this.f5853b.getMinimumHeight()));
    }

    public final void s0(int i10, int i11) {
        int iR = r();
        if (iR == 0) {
            this.f5853b.q(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < iR; i16++) {
            View viewQ = q(i16);
            Rect rect = this.f5853b.f1855r;
            w(viewQ, rect);
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
        this.f5853b.f1855r.set(i14, i15, i12, i13);
        r0(this.f5853b.f1855r, i10, i11);
    }

    public int[] t(View view, Rect rect) {
        int iD = D();
        int iF = F();
        int iE = this.f5862m - E();
        int iC = this.f5863n - C();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i10 = left - iD;
        int iMin = Math.min(0, i10);
        int i11 = top - iF;
        int iMin2 = Math.min(0, i11);
        int i12 = iWidth - iE;
        int iMax = Math.max(0, i12);
        int iMax2 = Math.max(0, iHeight - iC);
        RecyclerView recyclerView = this.f5853b;
        WeakHashMap weakHashMap = r0.j0.f46605a;
        if (recyclerView.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i10, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i12);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i11, iMax2);
        }
        return new int[]{iMax, iMin2};
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f5853b = null;
            this.f5852a = null;
            this.f5862m = 0;
            this.f5863n = 0;
        } else {
            this.f5853b = recyclerView;
            this.f5852a = recyclerView.f1840e;
            this.f5862m = recyclerView.getWidth();
            this.f5863n = recyclerView.getHeight();
        }
        this.f5860k = 1073741824;
        this.f5861l = 1073741824;
    }

    public int u(e1 e1Var, l1 l1Var) {
        RecyclerView recyclerView = this.f5853b;
        if (recyclerView == null || recyclerView.f1862w == null || !d()) {
            return 1;
        }
        return this.f5853b.f1862w.h();
    }

    public final boolean u0(View view, int i10, int i11, y0 y0Var) {
        return (!view.isLayoutRequested() && this.f5857g && N(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) y0Var).width) && N(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) y0Var).height)) ? false : true;
    }

    public abstract void v0(RecyclerView recyclerView, l1 l1Var, int i10);

    public final void w0(k1 k1Var) {
        k1 k1Var2 = this.f5855e;
        if (k1Var2 != null && k1Var != k1Var2 && k1Var2.f5734e) {
            k1Var2.h();
        }
        this.f5855e = k1Var;
        RecyclerView recyclerView = this.f5853b;
        k1Var.getClass();
        recyclerView.J0 = true;
        n1 n1Var = recyclerView.m0;
        RecyclerView recyclerView2 = n1Var.h;
        if (recyclerView2.J0) {
            recyclerView2.removeCallbacks(n1Var);
            n1Var.f5780c.abortAnimation();
        }
        if (k1Var.h) {
            Log.w("RecyclerView", "An instance of " + k1Var.getClass().getSimpleName() + " was started more than once. Each instance of" + k1Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        k1Var.f5732b = recyclerView;
        k1Var.f5733c = this;
        int i10 = k1Var.f5731a;
        if (i10 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f1853p0.f5757a = i10;
        k1Var.f5734e = true;
        k1Var.d = true;
        k1Var.f5735f = recyclerView.f1864x.m(i10);
        k1Var.e();
        k1Var.f5732b.m0.a();
        k1Var.h = true;
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
