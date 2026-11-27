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
public class wka extends FrameLayout implements cl7 {
    public final g79 E;
    public d79 F;
    public RecyclerView G;
    public RecyclerView H;
    public vic I;
    public View J;
    public View K;
    public View L;
    public View M;
    public tka N;
    public ska O;
    public uka P;
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
    public final j09 j0;
    public final e98 k0;
    public final es1 l0;
    public int n;
    public int r;
    public final RectF s;
    public final d26 w;
    public final m09 x;
    public final int[] y;

    public wka(Context context) {
        super(context);
        this.s = new RectF();
        this.x = new m09((byte) 3);
        this.y = new int[2];
        this.E = new Object();
        this.j0 = new j09(this, (byte) 13);
        this.k0 = new e98(this, (byte) 22);
        this.l0 = new es1(this, (byte) 5);
        setClipChildren(false);
        setClipToPadding(false);
        d26 d26Var = new d26(this, context);
        this.w = d26Var;
        addView(d26Var, new FrameLayout.LayoutParams(-1, -1));
    }

    public static String h(View view) {
        int b;
        if (view == null) {
            return "null";
        }
        String str = view.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(view)) + "(x=" + view.getTranslationX() + ",y=" + view.getTranslationY() + ",w=" + view.getWidth() + ",visibility=" + view.getVisibility() + ",attached=" + view.isAttachedToWindow() + ",top=" + view.getTop() + ",height=" + view.getHeight() + ",layoutRequested=" + view.isLayoutRequested();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            StringBuilder l = c00.l(str, ",scrollState=");
            l.append(recyclerView.getScrollState());
            l.append(",up=");
            l.append(recyclerView.canScrollVertically(-1));
            l.append(",down=");
            l.append(recyclerView.canScrollVertically(1));
            l.append(",layout=");
            l.append(recyclerView.e0());
            l.append(",pendingUpdates=");
            l.append(recyclerView.b0());
            l.append(",animating=");
            l.append(recyclerView.d0());
            l.append(",paddingTop=");
            l.append(recyclerView.getPaddingTop());
            l.append(",count=");
            if (recyclerView.getAdapter() == null) {
                b = 0;
            } else {
                b = recyclerView.getAdapter().b();
            }
            l.append(b);
            str = l.toString();
        }
        return str.concat(")");
    }

    public static float j(RecyclerView recyclerView) {
        q79 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || !recyclerView.canScrollVertically(-1)) {
            return 0.0f;
        }
        View m = layoutManager.m(0);
        if (m == null) {
            return Float.POSITIVE_INFINITY;
        }
        return Math.max(0.0f, (recyclerView.getPaddingTop() - q79.y(m)) + ((ViewGroup.MarginLayoutParams) ((r79) m.getLayoutParams())).topMargin);
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
            q79 layoutManager = recyclerView.getLayoutManager();
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
                int b = ((r79) view.getLayoutParams()).b();
                int y = (q79.y(view) - recyclerView.getPaddingTop()) - ((ViewGroup.MarginLayoutParams) ((r79) view.getLayoutParams())).topMargin;
                i3 = b;
                i4 = y;
            }
            recyclerView.setPadding(recyclerView.getPaddingLeft(), i, recyclerView.getPaddingRight(), i2);
            if (i3 != -1 && (layoutManager instanceof x46)) {
                ((x46) layoutManager).g1(i3, i4);
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
        d79 d79Var = this.F;
        if (d79Var != null) {
            d79Var.E0();
        }
        vic vicVar = this.I;
        if (vicVar != null && this.P != null) {
            for (View view : vicVar.getViewPages()) {
                if (view != null) {
                    this.P.h(view).E0();
                }
            }
        }
    }

    public final void C() {
        View[] viewPages;
        float b;
        View view;
        g79 g79Var = this.E;
        if (!this.d0 && this.N != null) {
            boolean z = true;
            this.d0 = true;
            try {
                float f = this.b0;
                D();
                d79 d79Var = this.F;
                if (d79Var != null && !this.i0) {
                    setBleed(d79Var);
                    d79 d79Var2 = this.F;
                    int i = this.T;
                    this.N.getClass();
                    w(d79Var2, i, this.U);
                }
                vic vicVar = this.I;
                if (vicVar != null && this.P != null && this.K != null) {
                    for (View view2 : vicVar.getViewPages()) {
                        if (view2 != null && view2.getParent() == this.I) {
                            b(this.P.h(view2));
                        }
                    }
                    t();
                    float p = p();
                    boolean isInfinite = Float.isInfinite(p);
                    d26 d26Var = this.w;
                    float f2 = 0.0f;
                    if (isInfinite) {
                        this.b0 = Float.POSITIVE_INFINITY;
                        this.J.setVisibility(4);
                        this.K.setVisibility(4);
                        d79 d79Var3 = this.F;
                        if (d79Var3 != null) {
                            d79Var3.setTranslationY(0.0f);
                        }
                        setTabsPinned(false);
                        if (f != this.b0) {
                            d26Var.invalidate();
                        }
                    } else {
                        float f3 = this.V;
                        if (p > f3 + 0.5f) {
                            f3 = p;
                        }
                        this.a0 = f3;
                        this.J.setVisibility(0);
                        this.K.setVisibility(0);
                        if (this.e0) {
                            this.b0 = g79Var.b();
                            this.c0 = Math.max(g79Var.d, g79Var.b());
                            View view3 = this.L;
                            float max = Math.max(0.0f, g79Var.a - g79Var.d);
                            if (!g79Var.f) {
                                f2 = g79Var.b() - g79Var.b;
                            }
                            x(view3, max + f2);
                            x(this.M, Math.max(g79Var.d, g79Var.b()) - g79Var.d);
                        } else {
                            RecyclerView recyclerView = this.G;
                            if (recyclerView == null) {
                                b = 0.0f;
                            } else {
                                b = this.P.b(recyclerView);
                            }
                            float max2 = this.a0 - Math.max(0.0f, Math.min(b, Math.max(0.0f, this.V - this.W)));
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
                        if (f != this.b0) {
                            d26Var.invalidate();
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
        tka tkaVar = this.N;
        if (tkaVar == null) {
            return;
        }
        float e0 = tkaVar.e0();
        this.N.getClass();
        if (!Float.isNaN(e0) && !Float.isInfinite(e0) && e0 >= 0.0f) {
            if (this.g0 && (e0 != this.V || 0.0f != this.W)) {
                float p = p();
                if (!Float.isInfinite(p)) {
                    float f = this.V;
                    if (p > 0.5f + f && p >= e0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z && e0 != f) {
                        this.h0 = true;
                    }
                    if (this.e0) {
                        g79 g79Var = this.E;
                        float f2 = g79Var.e;
                        if (z) {
                            p = e0;
                        }
                        uka ukaVar = this.P;
                        g79Var.a(p, ukaVar.b(ukaVar.h(this.L)), e0, 0.0f);
                        g79Var.e = Math.max(0.0f, Math.min(1.0f, f2));
                        this.w.invalidate();
                    }
                }
            }
            this.V = e0;
            this.W = 0.0f;
            this.g0 = true;
            return;
        }
        lq5.j("Require finite 0 <= commonHiddenTop <= tabsPinnedTop");
    }

    public final void a() {
        ska skaVar;
        f("ALIGN_BOUNDARY", this.F, 0, 0, true);
        if (this.F != null && (skaVar = this.O) != null && this.N != null) {
            int c = skaVar.c();
            q79 layoutManager = this.F.getLayoutManager();
            if (c != -1 && (layoutManager instanceof x46)) {
                D();
                ((x46) layoutManager).g1(c, (Math.round(this.V) - this.F.getTop()) - this.F.getPaddingTop());
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
            w(recyclerView, Math.max(0, i) + Math.round(this.V) + this.T, this.N.j0() + this.U);
            if (!recyclerView.isNestedScrollingEnabled()) {
                recyclerView.setNestedScrollingEnabled(true);
            }
        }
    }

    public final boolean c() {
        vic vicVar = this.I;
        if (vicVar != null && vicVar.getCurrentView() != null && !Float.isInfinite(p()) && this.c0 < getHeight()) {
            return true;
        }
        return false;
    }

    public final void d(android.graphics.Canvas r6, android.graphics.RectF r7, defpackage.vka r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wka.d(android.graphics.Canvas, android.graphics.RectF, vka):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        wka wkaVar;
        String str;
        if (motionEvent.getActionMasked() == 0) {
            if (this.a) {
                this.n++;
                this.e = 0L;
                wkaVar = this;
                wkaVar.f("TOUCH_DOWN", null, 0, 0, true);
            } else {
                wkaVar = this;
            }
            wkaVar.B();
        } else {
            wkaVar = this;
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                if (motionEvent.getActionMasked() == 1) {
                    str = "TOUCH_UP";
                } else {
                    str = "TOUCH_CANCEL";
                }
                wkaVar.f(str, null, 0, 0, true);
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
        int c;
        q79 layoutManager;
        int top;
        int height;
        float f;
        uka ukaVar;
        if (this.a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z) {
                if (uptimeMillis - this.d < 250) {
                    return;
                }
                this.d = uptimeMillis;
            }
            vic vicVar = this.I;
            int i3 = 0;
            View view4 = null;
            if (vicVar == null) {
                view2 = null;
            } else {
                view2 = vicVar.getViewPages()[0];
            }
            vic vicVar2 = this.I;
            if (vicVar2 == null) {
                view3 = null;
            } else {
                view3 = vicVar2.getViewPages()[1];
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
            ska skaVar = this.O;
            int i4 = -1;
            if (skaVar == null) {
                c = -1;
            } else {
                c = skaVar.c();
            }
            d79 d79Var = this.F;
            if (d79Var == null) {
                layoutManager = null;
            } else {
                layoutManager = d79Var.getLayoutManager();
            }
            if (layoutManager != null && c != -1) {
                view4 = layoutManager.m(c);
            }
            StringBuilder m = uh9.m(c, " row=", " anchor=");
            m.append(h(view4));
            m.append(" anchorTop=");
            if (view4 == null) {
                top = 0;
            } else {
                top = view4.getTop();
            }
            m.append(top);
            m.append(" anchorHeight=");
            if (view4 == null) {
                height = 0;
            } else {
                height = view4.getHeight();
            }
            m.append(height);
            m.append(" decoratedTop=");
            if (view4 != null) {
                layoutManager.getClass();
                i3 = q79.y(view4);
            }
            m.append(i3);
            m.append(" adapterPosition=");
            if (view4 != null) {
                this.F.getClass();
                i4 = RecyclerView.S(view4);
            }
            m.append(i4);
            m.append(" pageOffset=");
            RecyclerView recyclerView = this.G;
            if (recyclerView != null && (ukaVar = this.P) != null) {
                f = ukaVar.b(recyclerView);
            } else {
                f = 0.0f;
            }
            m.append(f);
            m.append(" tabsTop=");
            m.append(this.c0);
            m.append(" draw=");
            m.append(this.c);
            sb.append(m.toString());
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
        wka wkaVar;
        if (this.a) {
            wkaVar = this;
            wkaVar.f("TRANSITION_END_".concat(str), null, 0, 0, true);
        } else {
            wkaVar = this;
        }
        wkaVar.e0 = false;
        wkaVar.M = null;
        wkaVar.L = null;
        wkaVar.w.invalidate();
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
        m09 m09Var = this.x;
        if (i == 1) {
            m09Var.c = 0;
        } else {
            m09Var.b = 0;
        }
    }

    @Override
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        d79 d79Var;
        boolean z;
        if (this.R == 0 && (view == (d79Var = this.F) || view == this.G)) {
            if (this.e0) {
                e("POST_BLOCKED", view, i4, i5);
                iArr[1] = iArr[1] + i4;
                return;
            }
            this.Q = view;
            try {
                j09 j09Var = this.j0;
                int i6 = 0;
                if (view == d79Var) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && i2 > 0 && i4 > 0) {
                    wka wkaVar = (wka) j09Var.b;
                    ska skaVar = wkaVar.O;
                    if (skaVar != null && skaVar.c() != -1) {
                        i6 = wkaVar.u(wkaVar.G, i4);
                    }
                } else if (!z && i4 < 0) {
                    wka wkaVar2 = (wka) j09Var.b;
                    i6 = wkaVar2.u(wkaVar2.F, i4);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wka.o(float, float):boolean");
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
        d79 d79Var = this.F;
        if (d79Var != null && this.O != null && d79Var.getLayoutManager() != null) {
            q79 layoutManager = this.F.getLayoutManager();
            int c = this.O.c();
            if (c != -1 && (m = layoutManager.m(c)) != null) {
                return (q79.y(m) + this.F.getTop()) - ((ViewGroup.MarginLayoutParams) ((r79) m.getLayoutParams())).topMargin;
            }
            return Float.POSITIVE_INFINITY;
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override
    public final void q(View view, View view2, int i, int i2) {
        m09 m09Var = this.x;
        if (i2 == 1) {
            m09Var.c = i;
        } else {
            m09Var.b = i;
        }
    }

    @Override
    public final void r(android.view.View r12, int r13, int r14, int[] r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wka.r(android.view.View, int, int, int[], int):void");
    }

    public final void s() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wka.s():void");
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

    public void setGeometry(tka tkaVar) {
        this.N = tkaVar;
        requestLayout();
        C();
    }

    public final void t() {
        RecyclerView recyclerView;
        vic vicVar = this.I;
        if (vicVar != null && this.P != null && vicVar.getCurrentView() != null) {
            recyclerView = this.P.h(this.I.getCurrentView());
        } else {
            recyclerView = null;
        }
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView2 != this.G) {
            f("ACTIVE_CHANGE", recyclerView2, 0, 0, true);
            RecyclerView recyclerView3 = this.G;
            e98 e98Var = this.k0;
            if (recyclerView3 != null) {
                recyclerView3.E0();
                ArrayList arrayList = this.G.x0;
                if (arrayList != null) {
                    arrayList.remove(e98Var);
                }
            }
            this.G = recyclerView2;
            if (recyclerView2 != null) {
                recyclerView2.j(e98Var);
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
            grb.i("Reentrant scrollBy on nested source");
            return 0;
        }
        if (i != 0) {
            f("TRANSFER_NO_TARGET", recyclerView, i, 0, false);
        }
        return 0;
    }

    public final void v(d79 d79Var, ska skaVar) {
        d79 d79Var2 = this.F;
        d26 d26Var = this.w;
        e98 e98Var = this.k0;
        if (d79Var2 != null) {
            d79Var2.E0();
            ArrayList arrayList = this.F.x0;
            if (arrayList != null) {
                arrayList.remove(e98Var);
            }
            d26Var.removeView(this.F);
        }
        this.F = d79Var;
        this.O = skaVar;
        d26Var.addView(d79Var, new FrameLayout.LayoutParams(-1, -1));
        d79Var.j(e98Var);
        d79Var.setNestedScrollingEnabled(true);
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

    public final void y(View view, vic vicVar, uka ukaVar) {
        View view2 = this.J;
        if (view2 != null) {
            removeView(view2);
        }
        this.J = view;
        this.I = vicVar;
        this.P = ukaVar;
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
