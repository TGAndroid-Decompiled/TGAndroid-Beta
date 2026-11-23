package ch;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import bi.j7;
import c8.na;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.cz;
import org.telegram.messenger.fc;
import org.telegram.messenger.ls;
import org.telegram.messenger.qc;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.nv;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.b11;
import org.telegram.ui.bn;
import org.telegram.ui.f01;
import org.telegram.ui.m01;
import org.telegram.ui.p01;
import org.telegram.ui.t01;
public final class b0 {
    public final int[] A;
    public final h2.f B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final a0 f5289a;
    public final WindowManager f5290b;
    public final ai.g0 f5291c;
    public final boolean d;
    public float f5292e;
    public float f5294g;
    public float h;
    public float f5296j;
    public boolean f5297k;
    public boolean f5298l;
    public final x f5299m;
    public final xi0 f5300n;
    public final List f5301o;
    public hb0 f5302p;
    public boolean f5303q;
    public final g2 f5304r;
    public final h6 f5305s;
    public float f5306t;
    public float f5307u;
    public boolean v;
    public boolean f5308w;
    public ValueAnimator f5309x;
    public final int f5310y;
    public fh.g f5311z;
    public final RectF f5293f = new RectF();
    public final RectF f5295i = new RectF();

    public b0(int i7, g2 g2Var, ArrayList arrayList, HashSet hashSet, xi0 xi0Var, h6 h6Var, boolean z10) {
        Context context;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        new Path();
        this.A = new int[2];
        this.B = new h2.f((int[]) null);
        this.D = new HashSet();
        this.E = new ArrayList();
        this.F = 0;
        this.f5310y = i7;
        this.f5301o = arrayList;
        this.f5304r = g2Var;
        this.f5305s = h6Var;
        if (g2Var != null) {
            context = g2Var.getContext();
        } else {
            context = xi0Var.getContext();
        }
        Context context2 = context;
        ai.g0 g0Var = new ai.g0(this, context2);
        this.f5291c = g0Var;
        g0Var.setOnClickListener(new ah.d(this, 8));
        if (i7 != 2 && i7 != 4 && i7 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        a0 a0Var = new a0(this, context2);
        this.f5289a = a0Var;
        int windowType = xi0Var.getWindowType();
        boolean z13 = z11;
        if (i7 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        x xVar = new x(this, g2Var, context2, windowType, z12, h6Var, xi0Var, g2Var);
        this.f5299m = xVar;
        xVar.setOutlineProvider(new y(this));
        xVar.setClipToOutline(true);
        boolean z14 = xi0Var.f42076h1;
        boolean z15 = xi0Var.f42078i1;
        if (xVar.M1 != z14) {
            xVar.M1 = z14;
            xVar.N1 = z15;
            p01 p01Var = xVar.f51422i0;
            if (p01Var != null) {
                p01Var.invalidate();
            }
            f01 f01Var = xVar.f51424j0;
            if (f01Var != null) {
                f01Var.invalidate();
            }
        }
        xVar.setOnLongPressedListener(new cb.c(xi0Var, 11));
        xVar.setOnRecentClearedListener(new sa.d(6));
        xVar.setRecentReactions(arrayList);
        xVar.setSelectedReactions(hashSet);
        xVar.setDrawBackground(false);
        xVar.s(null);
        a0Var.addView(xVar, na.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        if (i7 == 5) {
            i10 = 2;
        } else {
            i10 = 16;
        }
        if (i7 == 5) {
            a0Var.setClipChildren(false);
            a0Var.setClipToPadding(false);
            g0Var.setClipChildren(false);
            g0Var.setClipToPadding(false);
        }
        if (i7 == 5) {
            i11 = 85;
        } else {
            i11 = 48;
        }
        int i12 = i11;
        float f10 = i10;
        g0Var.addView(a0Var, na.d(-1, -1.0f, i12, f10, f10, f10, 16.0f));
        g0Var.setClipChildren(false);
        if (i7 == 1 || (xi0Var.getDelegate() != null && xi0Var.getDelegate().E())) {
            xVar.setBackgroundDelegate(new ab.g(9, this, xi0Var));
        }
        if (z13) {
            ((ViewGroup) xi0Var.getParent()).addView(g0Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = org.telegram.messenger.g0.W(context2).getWindowManager();
            this.f5290b = windowManager;
            org.telegram.messenger.g0.w3(windowManager, g0Var, b10);
            windowManager.addView(g0Var, b10);
        }
        this.f5300n = xi0Var;
        xi0Var.setOnSwitchedToLoopView(new t(this, 0));
        xi0Var.f42066d1 = true;
        xi0Var.invalidate();
        org.telegram.messenger.g0.h3(new c1.c(4, this, xi0Var), 50L);
        if (i7 != 5) {
            ls.e().k(ls.f25293j1, 7);
        }
    }

    public static void a(b0 b0Var, boolean z10) {
        View view;
        xi0 xi0Var = b0Var.f5300n;
        x xVar = b0Var.f5299m;
        if (b0Var.E.isEmpty()) {
            b0Var.h(false);
            f0.a();
            b0Var.B.e();
            xVar.setEnterAnimationInProgress(false);
            p01 p01Var = xVar.f51422i0;
            if (z10) {
                xVar.f51413e0.m(false);
                p01Var.invalidate();
                ArrayList arrayList = p01Var.f52408i3;
                p01Var.g1();
                xVar.f51418g0.b();
                xVar.sendAccessibilityEvent(32);
                xi0Var.setImportantForAccessibility(4);
                int i7 = 0;
                while (true) {
                    if (i7 < p01Var.getChildCount()) {
                        if (p01Var.getChildAt(i7) instanceof b11) {
                            view = p01Var.getChildAt(i7);
                            break;
                        }
                        i7++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    view.performAccessibilityAction(64, null);
                } else {
                    xVar.performAccessibilityAction(64, null);
                }
                if (xi0Var.getPullingLeftProgress() > 0.0f) {
                    xi0Var.P0 = false;
                    ValueAnimator valueAnimator = xi0Var.f42102z0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    xi0Var.C0 = 0.0f;
                    ai.g0 g0Var = xi0Var.T;
                    if (g0Var != null) {
                        g0Var.invalidate();
                    }
                    xi0Var.invalidate();
                } else {
                    xi0Var.P0 = true;
                    ValueAnimator valueAnimator2 = xi0Var.f42102z0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    xi0Var.C0 = 0.0f;
                    ai.g0 g0Var2 = xi0Var.T;
                    if (g0Var2 != null) {
                        g0Var2.invalidate();
                    }
                    xi0Var.invalidate();
                }
                f01 f01Var = xVar.f51424j0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    t01 t01Var = (t01) arrayList.get(i10);
                    for (int i11 = 0; i11 < t01Var.P.size(); i11++) {
                        if (((b11) t01Var.P.get(i11)).f45696b) {
                            ((b11) t01Var.P.get(i11)).f45696b = false;
                            ((b11) t01Var.P.get(i11)).invalidate();
                            t01Var.k();
                        }
                    }
                }
                p01Var.invalidate();
                for (int i12 = 0; i12 < f01Var.f52408i3.size(); i12++) {
                    t01 t01Var2 = (t01) f01Var.f52408i3.get(i12);
                    for (int i13 = 0; i13 < t01Var2.P.size(); i13++) {
                        if (((b11) t01Var2.P.get(i13)).f45696b) {
                            ((b11) t01Var2.P.get(i13)).f45696b = false;
                            ((b11) t01Var2.P.get(i13)).invalidate();
                            t01Var2.k();
                        }
                    }
                }
                f01Var.invalidate();
                b0Var.i();
                b0Var.f5289a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof b11) {
            ((b11) view).setAnimatedScale(f10);
        } else if (view instanceof jv) {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i7;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i10 = this.f5310y;
        if (i10 != 0 && i10 != 3) {
            i7 = 99;
        } else {
            i7 = 1000;
        }
        layoutParams.type = i7;
        layoutParams.softInputMode = 16;
        if (z10) {
            layoutParams.flags = 65792;
        } else {
            layoutParams.flags = 65800;
        }
        layoutParams.format = -3;
        return layoutParams;
    }

    public final void c(boolean z10) {
        int i7;
        ?? r18;
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        boolean z13;
        boolean z14;
        x xVar = this.f5299m;
        int i10 = this.f5310y;
        ai.g0 g0Var = this.f5291c;
        int[] iArr = this.A;
        a0 a0Var = this.f5289a;
        RectF rectF = this.f5293f;
        xi0 xi0Var = this.f5300n;
        rectF.set(xi0Var.f42098x);
        this.f5292e = xi0Var.E;
        int[] iArr2 = new int[2];
        if (z10) {
            xi0Var.getLocationOnScreen(iArr);
        }
        g0Var.getLocationOnScreen(iArr2);
        int L = ((iArr[1] - iArr2[1]) - org.telegram.messenger.g0.L(44.0f)) - org.telegram.messenger.g0.L(52.0f);
        if (xVar.P0) {
            i7 = org.telegram.messenger.g0.L(26.0f);
        } else {
            i7 = 0;
        }
        float topOffset = xi0Var.getTopOffset() + (L - i7);
        if (xi0Var.G0) {
            topOffset = (iArr[1] - iArr2[1]) - org.telegram.messenger.g0.L(12.0f);
        }
        if (a0Var.getMeasuredHeight() + topOffset > g0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) {
            topOffset = (g0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) - a0Var.getMeasuredHeight();
        }
        if (topOffset < org.telegram.messenger.g0.L(16.0f)) {
            topOffset = org.telegram.messenger.g0.L(16.0f);
        }
        float f10 = 0.0f;
        if (i10 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i10 == 1) {
            r18 = 1;
            a0Var.setTranslationX(((g0Var.getMeasuredWidth() - a0Var.getMeasuredWidth()) / 2.0f) - org.telegram.messenger.g0.L(16.0f));
        } else {
            boolean z15 = true;
            if (i10 != 2 && i10 != 4) {
                a0Var.setTranslationX((iArr[0] - iArr2[0]) - org.telegram.messenger.g0.L(2.0f));
                r18 = z15;
            } else {
                a0Var.setTranslationX((iArr[0] - iArr2[0]) - org.telegram.messenger.g0.L(18.0f));
                r18 = z15;
            }
        }
        if (!z10) {
            this.f5306t = a0Var.getTranslationY();
        } else {
            this.f5306t = topOffset;
            a0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - a0Var.getX();
        this.f5294g = x10;
        float y10 = (iArr[r18] - iArr2[r18]) - a0Var.getY();
        this.h = y10;
        rectF.offset(x10, y10);
        xi0Var.setCustomEmojiEnterProgress(this.f5296j);
        if (z10) {
            if (cz.o() >= 2 && qc.e(8200)) {
                z14 = r18;
            } else {
                z14 = false;
            }
            this.f5308w = z14;
            this.f5297k = false;
        } else {
            this.f5308w = false;
        }
        if (this.f5308w) {
            z11 = r18;
            j(z11, 0.0f);
        } else {
            z11 = r18;
        }
        k();
        xVar.setEnterAnimationInProgress(z11);
        nv nvVar = xVar.f51413e0;
        if (z10 && this.f5308w) {
            z12 = true;
        } else {
            z12 = false;
        }
        nvVar.m(z12);
        this.B.d();
        ValueAnimator valueAnimator2 = this.f5309x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f11 = this.f5296j;
        if (i10 == 4) {
            if (z10) {
                f10 = 1.0f;
            }
            valueAnimator = ValueAnimator.ofFloat(f11, f10);
        } else {
            if (z10) {
                f10 = 1.0f;
            }
            ?? timeAnimator = new TimeAnimator();
            timeAnimator.f39645a = 0;
            timeAnimator.f39646b = 0;
            timeAnimator.setFloatValues(new float[]{f11, f10});
            valueAnimator = timeAnimator;
        }
        this.f5309x = valueAnimator;
        valueAnimator.addUpdateListener(new v(0, this, z10));
        if (!z10) {
            i();
        }
        this.f5309x.addListener(new j7(1, this, z10));
        if (i10 == 4) {
            this.f5309x.setDuration(420L);
            this.f5309x.setInterpolator(nr.h);
        } else if (this.f5308w) {
            this.f5309x.setDuration(450L);
            org.telegram.ui.Cells.c0.q(0.5f, this.f5309x);
        } else {
            this.f5309x.setDuration(350L);
            this.f5309x.setInterpolator(nr.f37917f);
        }
        a0Var.invalidate();
        h(true);
        if (!z10) {
            xi0Var.P0 = true;
            xi0Var.invalidate();
            this.f5309x.setStartDelay(30L);
            this.f5309x.start();
        } else {
            xi0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f5309x;
            Objects.requireNonNull(valueAnimator3);
            ca.r rVar = new ca.r(valueAnimator3, 2);
            f0.f5349f = this.f5308w;
            f0.f5348e = true;
            f0.f5350g = false;
            if (f0.d) {
                f0.d = false;
            }
            f0.f5347c = rVar;
        }
        HashSet hashSet = f0.f5345a;
        com.google.android.gms.internal.cast.b0 b0Var = fc.D().f23862p;
        if (((CountDownLatch) b0Var.f6482c) == null) {
            z13 = true;
            b0Var.f6482c = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        f0.f5346b = z13;
        f0.f5348e = false;
        f0.f5350g = false;
    }

    public final void d() {
        if (!this.f5303q) {
            xi0 xi0Var = this.f5300n;
            if (xi0Var != null) {
                ValueAnimator valueAnimator = xi0Var.f42102z0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                xi0Var.C0 = 0.0f;
                ai.g0 g0Var = xi0Var.T;
                if (g0Var != null) {
                    g0Var.invalidate();
                }
                xi0Var.invalidate();
            }
            gc.e();
            this.f5303q = true;
            org.telegram.messenger.g0.v1(this.f5291c);
            c(false);
            if (this.v) {
                g2 g2Var = this.f5304r;
                if (g2Var instanceof bn) {
                    ((bn) g2Var).wa(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f5303q) {
            gc.e();
            this.f5303q = true;
            ai.g0 g0Var = this.f5291c;
            org.telegram.messenger.g0.v1(g0Var);
            g0Var.animate().alpha(0.0f).setDuration(150L).setListener(new z(this, 1));
            if (this.v) {
                g2 g2Var = this.f5304r;
                if (g2Var instanceof bn) {
                    ((bn) g2Var).wa(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f5310y != 5) {
            ls.e().k(ls.f25298k1, 7);
        }
        org.telegram.messenger.g0.g3(new t(this, 1));
    }

    public final void h(boolean z10) {
        int i7;
        if (z10) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        x xVar = this.f5299m;
        xVar.f51422i0.setLayerType(i7, null);
        xVar.f51418g0.setLayerType(i7, null);
        if (this.f5308w) {
            for (int i10 = 0; i10 < Math.min(xVar.f51413e0.f36895b.getChildCount(), 16); i10++) {
                xVar.f51413e0.f36895b.getChildAt(i10).setLayerType(i7, null);
            }
            return;
        }
        xVar.f51416f0.setLayerType(i7, null);
        xVar.f51413e0.setLayerType(i7, null);
    }

    public final void i() {
        int i7 = 0;
        while (true) {
            x xVar = this.f5299m;
            p01 p01Var = xVar.f51422i0;
            p01 p01Var2 = xVar.f51422i0;
            if (i7 < p01Var.getChildCount()) {
                if (p01Var2.getChildAt(i7) instanceof b11) {
                    b11 b11Var = (b11) p01Var2.getChildAt(i7);
                    if (b11Var.f45705y != null) {
                        b11Var.f45696b = false;
                        b11Var.invalidate();
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void j(boolean z10, float f10) {
        RectF rectF;
        HashSet hashSet;
        x xVar = this.f5299m;
        float y10 = xVar.getY();
        m01 m01Var = xVar.f51405b0;
        float y11 = m01Var.getY() + y10;
        p01 p01Var = xVar.f51422i0;
        int y12 = (int) (p01Var.getY() + y11);
        ArrayList arrayList = null;
        int i7 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = p01Var.getChildCount();
            rectF = this.f5295i;
            hashSet = this.D;
            if (i7 >= childCount) {
                break;
            }
            View childAt = p01Var.getChildAt(i7);
            if (!hashSet.contains(childAt)) {
                float measuredHeight = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop() + y12;
                if (measuredHeight < rectF.bottom && measuredHeight > rectF.top && f10 != 0.0f) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt);
                    hashSet.add(childAt);
                } else {
                    g(childAt, 0.0f);
                    z11 = true;
                }
            }
            i7++;
        }
        int y13 = (int) (xVar.f51413e0.getY() + m01Var.getY() + xVar.getY());
        for (int i10 = 0; i10 < xVar.f51413e0.f36895b.getChildCount(); i10++) {
            View childAt2 = xVar.f51413e0.f36895b.getChildAt(i10);
            if (!hashSet.contains(childAt2)) {
                float measuredHeight2 = (childAt2.getMeasuredHeight() / 2.0f) + childAt2.getTop() + y13;
                if (measuredHeight2 < rectF.bottom && measuredHeight2 > rectF.top && f10 != 0.0f) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt2);
                    hashSet.add(childAt2);
                } else {
                    g(childAt2, 0.0f);
                    z11 = true;
                }
            }
        }
        if (z11) {
            xVar.f51428l0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new w(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 1));
            if (this.f5310y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(nr.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f5308w) {
            x xVar = this.f5299m;
            xVar.f51418g0.setAlpha(this.f5296j);
            xVar.f51422i0.setAlpha(this.f5296j);
            xVar.f51424j0.setAlpha(this.f5296j);
            xVar.f51413e0.setAlpha(this.f5296j);
            xVar.f51416f0.setAlpha(this.f5296j);
        }
    }

    public final void l() {
        float f10;
        x xVar = this.f5299m;
        m01 m01Var = xVar.f51405b0;
        m01 m01Var2 = xVar.f51405b0;
        boolean z10 = this.f5308w;
        a0 a0Var = this.f5289a;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = a0Var.f5278f;
        }
        m01Var.setTranslationX(f10);
        m01Var2.setTranslationY(a0Var.h);
        m01Var2.setPivotX(a0Var.f5280r);
        m01Var2.setPivotY(a0Var.f5281s);
        m01Var2.setScaleX(a0Var.f5279n);
        m01Var2.setScaleY(a0Var.f5279n);
    }
}
