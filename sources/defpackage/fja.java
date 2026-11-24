package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class fja extends FrameLayout implements vk7 {
    public final u59 E;
    public r59 F;
    public RecyclerView G;
    public RecyclerView H;
    public wgc I;
    public View J;
    public View K;
    public View L;
    public View M;
    public cja N;
    public bja O;
    public dja P;
    public View Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public float W;
    public boolean a;
    public float a0;
    public int b;
    public float b0;
    public int c;
    public float c0;
    public long d;
    public boolean d0;
    public long e;
    public boolean e0;
    public long f;
    public boolean f0;
    public boolean g0;
    public long h;
    public boolean h0;
    public boolean i0;
    public final cf9 j0;
    public final so7 k0;
    public final cc l0;
    public int n;
    public int r;
    public final RectF s;
    public final ne6 w;
    public final az8 x;
    public final int[] y;

    public fja(Context context) {
        super(context);
        this.s = new RectF();
        this.x = new az8((byte) 3);
        this.y = new int[2];
        this.E = new Object();
        this.j0 = new cf9(this, (byte) 8);
        this.k0 = new so7(this, (byte) 23);
        this.l0 = new cc(this, (byte) 7);
        setClipChildren(false);
        setClipToPadding(false);
        ne6 ne6Var = new ne6(this, context);
        this.w = ne6Var;
        addView(ne6Var, new FrameLayout.LayoutParams(-1, -1));
    }

    public static String h(View view) {
        int b;
        if (view == null) {
            return "null";
        }
        String str = view.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(view)) + "(x=" + view.getTranslationX() + ",y=" + view.getTranslationY() + ",w=" + view.getWidth() + ",visibility=" + view.getVisibility() + ",attached=" + view.isAttachedToWindow() + ",top=" + view.getTop() + ",height=" + view.getHeight() + ",layoutRequested=" + view.isLayoutRequested();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            StringBuilder k = b10.k(str, ",scrollState=");
            k.append(recyclerView.getScrollState());
            k.append(",up=");
            k.append(recyclerView.canScrollVertically(-1));
            k.append(",down=");
            k.append(recyclerView.canScrollVertically(1));
            k.append(",layout=");
            k.append(recyclerView.d0());
            k.append(",pendingUpdates=");
            k.append(recyclerView.a0());
            k.append(",animating=");
            k.append(recyclerView.c0());
            k.append(",paddingTop=");
            k.append(recyclerView.getPaddingTop());
            k.append(",count=");
            if (recyclerView.getAdapter() == null) {
                b = 0;
            } else {
                b = recyclerView.getAdapter().b();
            }
            k.append(b);
            str = k.toString();
        }
        return str.concat(")");
    }

    public static float j(RecyclerView recyclerView) {
        f69 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || !recyclerView.canScrollVertically(-1)) {
            return 0.0f;
        }
        View m = layoutManager.m(0);
        if (m == null) {
            return Float.POSITIVE_INFINITY;
        }
        return Math.max(0.0f, (recyclerView.getPaddingTop() - f69.y(m)) + ((ViewGroup.MarginLayoutParams) ((g69) m.getLayoutParams())).topMargin);
    }

    private void setBleed(RecyclerView recyclerView) {
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = marginLayoutParams.topMargin;
            int i2 = this.T;
            if (i == (-i2) && marginLayoutParams.bottomMargin == (-this.U)) {
                return;
            }
            marginLayoutParams.topMargin = -i2;
            marginLayoutParams.bottomMargin = -this.U;
            recyclerView.setLayoutParams(marginLayoutParams);
        }
    }

    private void setTabsPinned(boolean z) {
        String str;
        if (this.f0 == z) {
            return;
        }
        this.f0 = z;
        if (z) {
            str = "TABS_PINNED";
        } else {
            str = "TABS_UNPINNED";
        }
        f(str, this.F, 0, 0, true);
        this.N.t(z);
    }

    public static void w(RecyclerView recyclerView, int i, int i2) {
        View view;
        int i3;
        if (recyclerView.getPaddingTop() != i || recyclerView.getPaddingBottom() != i2) {
            f69 layoutManager = recyclerView.getLayoutManager();
            int i4 = 0;
            if (layoutManager != null && layoutManager.r() != 0) {
                view = layoutManager.q(0);
            } else {
                view = null;
            }
            if (view == null) {
                i3 = -1;
            } else {
                layoutManager.getClass();
                int b = ((g69) view.getLayoutParams()).b();
                int y = (f69.y(view) - recyclerView.getPaddingTop()) - ((ViewGroup.MarginLayoutParams) ((g69) view.getLayoutParams())).topMargin;
                i3 = b;
                i4 = y;
            }
            recyclerView.setPadding(recyclerView.getPaddingLeft(), i, recyclerView.getPaddingRight(), i2);
            if (i3 != -1 && (layoutManager instanceof u46)) {
                ((u46) layoutManager).g1(i3, i4);
            }
        }
    }

    public final void A(int i, int i2) {
        this.T = Math.max(0, i);
        this.U = Math.max(0, i2);
        requestLayout();
        C();
    }

    public final void B() {
        View[] viewPages;
        f("STOP_SCROLLING", null, 0, 0, true);
        r59 r59Var = this.F;
        if (r59Var != null) {
            r59Var.D0();
        }
        wgc wgcVar = this.I;
        if (wgcVar != null && this.P != null) {
            for (View view : wgcVar.getViewPages()) {
                if (view != null) {
                    this.P.h(view).D0();
                }
            }
        }
    }

    public final void C() {
        View[] viewPages;
        float f;
        View view;
        u59 u59Var = this.E;
        if (!this.d0 && this.N != null) {
            boolean z = true;
            this.d0 = true;
            try {
                float f2 = this.b0;
                D();
                r59 r59Var = this.F;
                if (r59Var != null && !this.i0) {
                    setBleed(r59Var);
                    r59 r59Var2 = this.F;
                    int i = this.T;
                    this.N.getClass();
                    w(r59Var2, i, this.U);
                }
                wgc wgcVar = this.I;
                if (wgcVar != null && this.P != null && this.K != null) {
                    for (View view2 : wgcVar.getViewPages()) {
                        if (view2 != null && view2.getParent() == this.I) {
                            b(this.P.h(view2));
                        }
                    }
                    t();
                    float p = p();
                    boolean isInfinite = Float.isInfinite(p);
                    ne6 ne6Var = this.w;
                    float f3 = 0.0f;
                    if (isInfinite) {
                        this.b0 = Float.POSITIVE_INFINITY;
                        this.J.setVisibility(4);
                        this.K.setVisibility(4);
                        r59 r59Var3 = this.F;
                        if (r59Var3 != null) {
                            r59Var3.setTranslationY(0.0f);
                        }
                        setTabsPinned(false);
                        if (f2 != this.b0) {
                            ne6Var.invalidate();
                        }
                    } else {
                        float f4 = this.V;
                        if (p > f4 + 0.5f) {
                            f4 = p;
                        }
                        this.a0 = f4;
                        this.J.setVisibility(0);
                        this.K.setVisibility(0);
                        if (this.e0) {
                            this.b0 = u59Var.b();
                            this.c0 = Math.max(u59Var.d, u59Var.b());
                            View view3 = this.L;
                            float max = Math.max(0.0f, u59Var.a - u59Var.d);
                            if (!u59Var.f) {
                                f3 = u59Var.b() - u59Var.b;
                            }
                            x(view3, max + f3);
                            x(this.M, Math.max(u59Var.d, u59Var.b()) - u59Var.d);
                        } else {
                            RecyclerView recyclerView = this.G;
                            if (recyclerView == null) {
                                f = 0.0f;
                            } else {
                                f = this.P.f(recyclerView);
                            }
                            float max2 = this.a0 - Math.max(0.0f, Math.min(f, Math.max(0.0f, this.V - this.W)));
                            this.b0 = max2;
                            this.c0 = Math.max(this.V, max2);
                            x(this.I.getCurrentView(), Math.max(0.0f, this.a0 - this.V));
                        }
                        this.F.setTranslationY(this.b0 - p);
                        this.K.setTranslationY(this.c0 - view.getTop());
                        if (this.c0 > this.V + 0.5f) {
                            z = false;
                        }
                        setTabsPinned(z);
                        this.N.getClass();
                        if (f2 != this.b0) {
                            ne6Var.invalidate();
                        }
                    }
                }
            } finally {
                this.d0 = false;
            }
        }
    }

    public final void D() {
        boolean z;
        cja cjaVar = this.N;
        if (cjaVar == null) {
            return;
        }
        float b0 = cjaVar.b0();
        this.N.getClass();
        if (!Float.isNaN(b0) && !Float.isInfinite(b0) && b0 >= 0.0f) {
            if (this.g0 && (b0 != this.V || 0.0f != this.W)) {
                float p = p();
                if (!Float.isInfinite(p)) {
                    float f = this.V;
                    if (p > 0.5f + f && p >= b0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z && b0 != f) {
                        this.h0 = true;
                    }
                    if (this.e0) {
                        u59 u59Var = this.E;
                        float f2 = u59Var.e;
                        if (z) {
                            p = b0;
                        }
                        dja djaVar = this.P;
                        u59Var.a(p, djaVar.f(djaVar.h(this.L)), b0, 0.0f);
                        u59Var.e = Math.max(0.0f, Math.min(1.0f, f2));
                        this.w.invalidate();
                    }
                }
            }
            this.V = b0;
            this.W = 0.0f;
            this.g0 = true;
            return;
        }
        u36.j("Require finite 0 <= commonHiddenTop <= tabsPinnedTop");
    }

    public final void a() {
        bja bjaVar;
        f("ALIGN_BOUNDARY", this.F, 0, 0, true);
        if (this.F != null && (bjaVar = this.O) != null && this.N != null) {
            int b = bjaVar.b();
            f69 layoutManager = this.F.getLayoutManager();
            if (b != -1 && (layoutManager instanceof u46)) {
                D();
                ((u46) layoutManager).g1(b, (Math.round(this.V) - this.F.getTop()) - this.F.getPaddingTop());
                this.h0 = true;
                requestLayout();
            }
        }
    }

    public final void b(RecyclerView recyclerView) {
        int i;
        if (this.N != null && recyclerView != null) {
            D();
            View view = this.K;
            if (view == null) {
                i = 0;
            } else {
                int height = view.getHeight();
                View view2 = this.K;
                if (height > 0) {
                    i = view2.getHeight();
                } else {
                    i = view2.getLayoutParams().height;
                }
            }
            setBleed(recyclerView);
            w(recyclerView, Math.max(0, i) + Math.round(this.V) + this.T, this.N.h0() + this.U);
            if (!recyclerView.isNestedScrollingEnabled()) {
                recyclerView.setNestedScrollingEnabled(true);
            }
        }
    }

    public final boolean c() {
        wgc wgcVar = this.I;
        if (wgcVar != null && wgcVar.getCurrentView() != null && !Float.isInfinite(p()) && this.c0 < getHeight()) {
            return true;
        }
        return false;
    }

    public final void d(android.graphics.Canvas r6, android.graphics.RectF r7, defpackage.eja r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fja.d(android.graphics.Canvas, android.graphics.RectF, eja):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        fja fjaVar;
        String str;
        if (motionEvent.getActionMasked() == 0) {
            if (this.a) {
                this.n++;
                this.e = 0L;
                fjaVar = this;
                fjaVar.f("TOUCH_DOWN", null, 0, 0, true);
            } else {
                fjaVar = this;
            }
            fjaVar.B();
        } else {
            fjaVar = this;
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                if (motionEvent.getActionMasked() == 1) {
                    str = "TOUCH_UP";
                } else {
                    str = "TOUCH_CANCEL";
                }
                fjaVar.f(str, null, 0, 0, true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(String str, View view, int i, int i2) {
        String str2;
        if (this.a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.e < 250) {
                return;
            }
            this.e = uptimeMillis;
            if (i2 == 0) {
                str2 = "_TOUCH";
            } else {
                str2 = "_NON_TOUCH";
            }
            f(str.concat(str2), view, i, i, true);
        }
    }

    public final void f(String str, View view, int i, int i2, boolean z) {
        View view2;
        View view3;
        long j;
        int b;
        f69 layoutManager;
        int top;
        int height;
        float f;
        dja djaVar;
        if (this.a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z) {
                if (uptimeMillis - this.d < 250) {
                    return;
                }
                this.d = uptimeMillis;
            }
            wgc wgcVar = this.I;
            int i3 = 0;
            View view4 = null;
            if (wgcVar == null) {
                view2 = null;
            } else {
                view2 = wgcVar.getViewPages()[0];
            }
            wgc wgcVar2 = this.I;
            if (wgcVar2 == null) {
                view3 = null;
            } else {
                view3 = wgcVar2.getViewPages()[1];
            }
            StringBuilder sb = new StringBuilder("root=");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" gesture=");
            sb.append(this.n);
            sb.append(" transition=");
            sb.append(this.r);
            sb.append(" event=");
            sb.append(str);
            sb.append(" target=");
            sb.append(h(view));
            sb.append(" dy=");
            sb.append(i);
            sb.append(" used=");
            sb.append(i2);
            sb.append(" transitioning=");
            sb.append(this.e0);
            sb.append(" progress=");
            sb.append(this.E.e);
            sb.append(" ageMs=");
            long j2 = 0;
            if (this.e0) {
                j = uptimeMillis - this.f;
            } else {
                j = 0;
            }
            sb.append(j);
            sb.append(" unchangedMs=");
            if (this.e0) {
                j2 = uptimeMillis - this.h;
            }
            sb.append(j2);
            sb.append(" depth=");
            sb.append(this.R);
            sb.append(" updating=");
            sb.append(this.d0);
            sb.append(" callback=");
            sb.append(h(this.Q));
            sb.append(" common=");
            sb.append(h(this.F));
            sb.append(" active=");
            sb.append(h(this.G));
            sb.append(" current=");
            sb.append(h(view2));
            sb.append(" other=");
            sb.append(h(view3));
            sb.append(" source=");
            sb.append(h(this.L));
            sb.append(" incoming=");
            sb.append(h(this.M));
            sb.append(" boundary=");
            sb.append(p());
            sb.append(" pin=");
            sb.append(this.V);
            sb.append(" tail=");
            sb.append(this.b0);
            sb.append(" alignPending=");
            sb.append(this.h0);
            bja bjaVar = this.O;
            int i4 = -1;
            if (bjaVar == null) {
                b = -1;
            } else {
                b = bjaVar.b();
            }
            r59 r59Var = this.F;
            if (r59Var == null) {
                layoutManager = null;
            } else {
                layoutManager = r59Var.getLayoutManager();
            }
            if (layoutManager != null && b != -1) {
                view4 = layoutManager.m(b);
            }
            StringBuilder l = hg9.l(b, " row=", " anchor=");
            l.append(h(view4));
            l.append(" anchorTop=");
            if (view4 == null) {
                top = 0;
            } else {
                top = view4.getTop();
            }
            l.append(top);
            l.append(" anchorHeight=");
            if (view4 == null) {
                height = 0;
            } else {
                height = view4.getHeight();
            }
            l.append(height);
            l.append(" decoratedTop=");
            if (view4 != null) {
                layoutManager.getClass();
                i3 = f69.y(view4);
            }
            l.append(i3);
            l.append(" adapterPosition=");
            if (view4 != null) {
                this.F.getClass();
                i4 = RecyclerView.R(view4);
            }
            l.append(i4);
            l.append(" pageOffset=");
            RecyclerView recyclerView = this.G;
            if (recyclerView != null && (djaVar = this.P) != null) {
                f = djaVar.f(recyclerView);
            } else {
                f = 0.0f;
            }
            l.append(f);
            l.append(" tabsTop=");
            l.append(this.c0);
            l.append(" draw=");
            l.append(this.c);
            sb.append(l.toString());
            Log.d("SiblingScroll", sb.toString());
        }
    }

    public final void g(String str) {
        f(str, this.I, 0, 0, true);
    }

    public int getBottomBleed() {
        return this.U;
    }

    @Override
    public int getNestedScrollAxes() {
        return this.x.b();
    }

    public float getTabsTop() {
        return this.c0;
    }

    public int getTopBleed() {
        return this.T;
    }

    public final void i(String str) {
        fja fjaVar;
        if (this.a) {
            fjaVar = this;
            fjaVar.f("TRANSITION_END_".concat(str), null, 0, 0, true);
        } else {
            fjaVar = this;
        }
        fjaVar.e0 = false;
        fjaVar.M = null;
        fjaVar.L = null;
        fjaVar.w.invalidate();
    }

    @Override
    public final void k(int i, View view) {
        String str;
        if (i == 0) {
            str = "NESTED_STOP_TOUCH";
        } else {
            str = "NESTED_STOP_NON_TOUCH";
        }
        f(str, view, 0, 0, true);
        az8 az8Var = this.x;
        if (i == 1) {
            az8Var.c = 0;
        } else {
            az8Var.b = 0;
        }
    }

    @Override
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        r59 r59Var;
        boolean z;
        if (this.R == 0 && (view == (r59Var = this.F) || view == this.G)) {
            if (this.e0) {
                e("POST_BLOCKED", view, i4, i5);
                iArr[1] = iArr[1] + i4;
                return;
            }
            this.Q = view;
            try {
                cf9 cf9Var = this.j0;
                int i6 = 0;
                if (view == r59Var) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && i2 > 0 && i4 > 0) {
                    fja fjaVar = (fja) cf9Var.b;
                    bja bjaVar = fjaVar.O;
                    if (bjaVar != null && bjaVar.b() != -1) {
                        i6 = fjaVar.u(fjaVar.G, i4);
                    }
                } else if (!z && i4 < 0) {
                    fja fjaVar2 = (fja) cf9Var.b;
                    i6 = fjaVar2.u(fjaVar2.F, i4);
                }
                iArr[1] = iArr[1] + i6;
                f("POST", view, i4, i6, false);
                return;
            } finally {
                this.Q = null;
                C();
            }
        }
        f("POST_IGNORED", view, i4, 0, false);
    }

    @Override
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.y;
        iArr[1] = 0;
        iArr[0] = 0;
        l(view, i, i2, i3, i4, i5, iArr);
    }

    @Override
    public final boolean n(View view, View view2, int i, int i2) {
        boolean z;
        String str;
        boolean z2 = false;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.R == 0 && z && (view2 == this.F || view2 == this.G)) {
            z2 = true;
        }
        if (this.a) {
            if (z2) {
                str = "NESTED_START";
            } else {
                str = "NESTED_REJECT";
            }
            f(str + "_axes=" + i + "_type=" + i2, view2, 0, 0, true);
        }
        return z2;
    }

    public final boolean o(float r4, float r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fja.o(float, float):boolean");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.l0);
    }

    @Override
    public void onDetachedFromWindow() {
        B();
        getViewTreeObserver().removeOnPreDrawListener(this.l0);
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        r(view, i, i2, iArr, 0);
    }

    @Override
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m(view, i, i2, i3, i4, 0);
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        q(view, view2, i, 0);
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return n(view, view2, i, 0);
    }

    @Override
    public final void onStopNestedScroll(View view) {
        k(0, view);
    }

    public final float p() {
        View m;
        r59 r59Var = this.F;
        if (r59Var != null && this.O != null && r59Var.getLayoutManager() != null) {
            f69 layoutManager = this.F.getLayoutManager();
            int b = this.O.b();
            if (b != -1 && (m = layoutManager.m(b)) != null) {
                return (f69.y(m) + this.F.getTop()) - ((ViewGroup.MarginLayoutParams) ((g69) m.getLayoutParams())).topMargin;
            }
            return Float.POSITIVE_INFINITY;
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override
    public final void q(View view, View view2, int i, int i2) {
        az8 az8Var = this.x;
        if (i2 == 1) {
            az8Var.c = i;
        } else {
            az8Var.b = i;
        }
    }

    @Override
    public final void r(android.view.View r12, int r13, int r14, int[] r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fja.r(android.view.View, int, int, int[], int):void");
    }

    public final void s() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fja.s():void");
    }

    public void setCommonInsetsManagedExternally(boolean z) {
        if (this.i0 == z) {
            return;
        }
        this.i0 = z;
        C();
        requestLayout();
    }

    public void setDebugLoggingEnabled(boolean z) {
        this.a = z;
        if (z) {
            this.d = 0L;
            this.e = 0L;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f = uptimeMillis;
            this.h = uptimeMillis;
            f("DEBUG_ENABLED", null, 0, 0, true);
        }
    }

    public void setGeometry(cja cjaVar) {
        this.N = cjaVar;
        requestLayout();
        C();
    }

    public final void t() {
        RecyclerView recyclerView;
        wgc wgcVar = this.I;
        if (wgcVar != null && this.P != null && wgcVar.getCurrentView() != null) {
            recyclerView = this.P.h(this.I.getCurrentView());
        } else {
            recyclerView = null;
        }
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView2 != this.G) {
            f("ACTIVE_CHANGE", recyclerView2, 0, 0, true);
            RecyclerView recyclerView3 = this.G;
            so7 so7Var = this.k0;
            if (recyclerView3 != null) {
                recyclerView3.D0();
                ArrayList arrayList = this.G.x0;
                if (arrayList != null) {
                    arrayList.remove(so7Var);
                }
            }
            this.G = recyclerView2;
            if (recyclerView2 != null) {
                recyclerView2.j(so7Var);
            }
        }
    }

    public final int u(RecyclerView recyclerView, int i) {
        int min;
        String str;
        if (recyclerView != null && i != 0) {
            if (recyclerView != this.Q) {
                RecyclerView recyclerView2 = this.H;
                int i2 = this.S;
                this.H = recyclerView;
                this.S = 0;
                this.R++;
                try {
                    recyclerView.scrollBy(0, i);
                    int i3 = this.S;
                    if (i > 0) {
                        min = Math.max(0, Math.min(i, i3));
                    } else {
                        min = Math.min(0, Math.max(i, i3));
                    }
                    int i4 = min;
                    if (i3 == 0) {
                        str = "TRANSFER_ZERO";
                    } else {
                        str = "TRANSFER";
                    }
                    f(str, recyclerView, i, i4, false);
                    return i4;
                } finally {
                    this.R--;
                    this.H = recyclerView2;
                    this.S = i2;
                }
            }
            f("TRANSFER_REENTRY", recyclerView, i, 0, true);
            dq9.m("Reentrant scrollBy on nested source");
            return 0;
        }
        if (i != 0) {
            f("TRANSFER_NO_TARGET", recyclerView, i, 0, false);
        }
        return 0;
    }

    public final void v(r59 r59Var, bja bjaVar) {
        r59 r59Var2 = this.F;
        ne6 ne6Var = this.w;
        so7 so7Var = this.k0;
        if (r59Var2 != null) {
            r59Var2.D0();
            ArrayList arrayList = this.F.x0;
            if (arrayList != null) {
                arrayList.remove(so7Var);
            }
            ne6Var.removeView(this.F);
        }
        this.F = r59Var;
        this.O = bjaVar;
        ne6Var.addView(r59Var, new FrameLayout.LayoutParams(-1, -1));
        r59Var.j(so7Var);
        r59Var.setNestedScrollingEnabled(true);
        C();
    }

    public final void x(View view, float f) {
        if (view == null) {
            return;
        }
        RecyclerView h = this.P.h(view);
        float f2 = this.V;
        h.setTranslationY((f + f2) - Math.round(f2));
    }

    public final void y(View view, wgc wgcVar, dja djaVar) {
        View view2 = this.J;
        if (view2 != null) {
            removeView(view2);
        }
        this.J = view;
        this.I = wgcVar;
        this.P = djaVar;
        addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
        C();
    }

    public final void z(View view) {
        View view2 = this.K;
        if (view2 != null) {
            removeView(view2);
        }
        this.K = view;
        addView(view, new FrameLayout.LayoutParams(-1, -2, 48));
        C();
    }
}
