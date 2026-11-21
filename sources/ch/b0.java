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
import bi.h7;
import c8.ma;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.bz;
import org.telegram.messenger.ec;
import org.telegram.messenger.ks;
import org.telegram.messenger.pc;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.bn;
import org.telegram.ui.c11;
import org.telegram.ui.g01;
import org.telegram.ui.n01;
import org.telegram.ui.q01;
import org.telegram.ui.u01;
public final class b0 {
    public final int[] A;
    public final h2.f B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final a0 f5323a;
    public final WindowManager f5324b;
    public final ai.l0 f5325c;
    public final boolean d;
    public float f5326e;
    public float f5328g;
    public float h;
    public float f5330j;
    public boolean f5331k;
    public boolean f5332l;
    public final x f5333m;
    public final xi0 f5334n;
    public final List f5335o;
    public hb0 f5336p;
    public boolean f5337q;
    public final g2 f5338r;
    public final h6 f5339s;
    public float f5340t;
    public float f5341u;
    public boolean v;
    public boolean f5342w;
    public ValueAnimator f5343x;
    public final int f5344y;
    public fh.g f5345z;
    public final RectF f5327f = new RectF();
    public final RectF f5329i = new RectF();

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
        this.f5344y = i7;
        this.f5335o = arrayList;
        this.f5338r = g2Var;
        this.f5339s = h6Var;
        if (g2Var != null) {
            context = g2Var.getContext();
        } else {
            context = xi0Var.getContext();
        }
        Context context2 = context;
        ai.l0 l0Var = new ai.l0(this, context2);
        this.f5325c = l0Var;
        l0Var.setOnClickListener(new ah.d(this, 8));
        if (i7 != 2 && i7 != 4 && i7 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        a0 a0Var = new a0(this, context2);
        this.f5323a = a0Var;
        boolean z13 = z11;
        int windowType = xi0Var.getWindowType();
        if (i7 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        x xVar = new x(this, g2Var, context2, windowType, z12, h6Var, xi0Var, g2Var);
        this.f5333m = xVar;
        xVar.setOutlineProvider(new y(this));
        xVar.setClipToOutline(true);
        boolean z14 = xi0Var.f42129h1;
        boolean z15 = xi0Var.f42131i1;
        if (xVar.M1 != z14) {
            xVar.M1 = z14;
            xVar.N1 = z15;
            q01 q01Var = xVar.f51840i0;
            if (q01Var != null) {
                q01Var.invalidate();
            }
            g01 g01Var = xVar.f51842j0;
            if (g01Var != null) {
                g01Var.invalidate();
            }
        }
        xVar.setOnLongPressedListener(new cb.c(xi0Var, 11));
        xVar.setOnRecentClearedListener(new sa.d(6));
        xVar.setRecentReactions(arrayList);
        xVar.setSelectedReactions(hashSet);
        xVar.setDrawBackground(false);
        xVar.s(null);
        a0Var.addView(xVar, ma.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        if (i7 == 5) {
            i10 = 2;
        } else {
            i10 = 16;
        }
        if (i7 == 5) {
            a0Var.setClipChildren(false);
            a0Var.setClipToPadding(false);
            l0Var.setClipChildren(false);
            l0Var.setClipToPadding(false);
        }
        if (i7 == 5) {
            i11 = 85;
        } else {
            i11 = 48;
        }
        int i12 = i11;
        float f10 = i10;
        l0Var.addView(a0Var, ma.d(-1, -1.0f, i12, f10, f10, f10, 16.0f));
        l0Var.setClipChildren(false);
        if (i7 == 1 || (xi0Var.getDelegate() != null && xi0Var.getDelegate().E())) {
            xVar.setBackgroundDelegate(new ab.g(9, this, xi0Var));
        }
        if (z13) {
            ((ViewGroup) xi0Var.getParent()).addView(l0Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = org.telegram.messenger.g0.W(context2).getWindowManager();
            this.f5324b = windowManager;
            org.telegram.messenger.g0.w3(windowManager, l0Var, b10);
            windowManager.addView(l0Var, b10);
        }
        this.f5334n = xi0Var;
        xi0Var.setOnSwitchedToLoopView(new t(this, 0));
        xi0Var.f42119d1 = true;
        xi0Var.invalidate();
        org.telegram.messenger.g0.h3(new c1.a(6, this, xi0Var), 50L);
        if (i7 != 5) {
            ks.e().k(ks.f25163j1, 7);
        }
    }

    public static void a(b0 b0Var, boolean z10) {
        View view;
        xi0 xi0Var = b0Var.f5334n;
        x xVar = b0Var.f5333m;
        if (b0Var.E.isEmpty()) {
            b0Var.h(false);
            f0.a();
            b0Var.B.e();
            xVar.setEnterAnimationInProgress(false);
            q01 q01Var = xVar.f51840i0;
            if (z10) {
                xVar.f51831e0.m(false);
                q01Var.invalidate();
                ArrayList arrayList = q01Var.f52680i3;
                q01Var.g1();
                xVar.f51836g0.b();
                xVar.sendAccessibilityEvent(32);
                xi0Var.setImportantForAccessibility(4);
                int i7 = 0;
                while (true) {
                    if (i7 < q01Var.getChildCount()) {
                        if (q01Var.getChildAt(i7) instanceof c11) {
                            view = q01Var.getChildAt(i7);
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
                    ValueAnimator valueAnimator = xi0Var.f42155z0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    xi0Var.C0 = 0.0f;
                    ai.l0 l0Var = xi0Var.T;
                    if (l0Var != null) {
                        l0Var.invalidate();
                    }
                    xi0Var.invalidate();
                } else {
                    xi0Var.P0 = true;
                    ValueAnimator valueAnimator2 = xi0Var.f42155z0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    xi0Var.C0 = 0.0f;
                    ai.l0 l0Var2 = xi0Var.T;
                    if (l0Var2 != null) {
                        l0Var2.invalidate();
                    }
                    xi0Var.invalidate();
                }
                g01 g01Var = xVar.f51842j0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    u01 u01Var = (u01) arrayList.get(i10);
                    for (int i11 = 0; i11 < u01Var.P.size(); i11++) {
                        if (((c11) u01Var.P.get(i11)).f46379b) {
                            ((c11) u01Var.P.get(i11)).f46379b = false;
                            ((c11) u01Var.P.get(i11)).invalidate();
                            u01Var.k();
                        }
                    }
                }
                q01Var.invalidate();
                for (int i12 = 0; i12 < g01Var.f52680i3.size(); i12++) {
                    u01 u01Var2 = (u01) g01Var.f52680i3.get(i12);
                    for (int i13 = 0; i13 < u01Var2.P.size(); i13++) {
                        if (((c11) u01Var2.P.get(i13)).f46379b) {
                            ((c11) u01Var2.P.get(i13)).f46379b = false;
                            ((c11) u01Var2.P.get(i13)).invalidate();
                            u01Var2.k();
                        }
                    }
                }
                g01Var.invalidate();
                b0Var.i();
                b0Var.f5323a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof c11) {
            ((c11) view).setAnimatedScale(f10);
        } else if (view instanceof kv) {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i7;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i10 = this.f5344y;
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
        x xVar = this.f5333m;
        int i10 = this.f5344y;
        ai.l0 l0Var = this.f5325c;
        int[] iArr = this.A;
        a0 a0Var = this.f5323a;
        RectF rectF = this.f5327f;
        xi0 xi0Var = this.f5334n;
        rectF.set(xi0Var.f42151x);
        this.f5326e = xi0Var.E;
        int[] iArr2 = new int[2];
        if (z10) {
            xi0Var.getLocationOnScreen(iArr);
        }
        l0Var.getLocationOnScreen(iArr2);
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
        if (a0Var.getMeasuredHeight() + topOffset > l0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) {
            topOffset = (l0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) - a0Var.getMeasuredHeight();
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
            a0Var.setTranslationX(((l0Var.getMeasuredWidth() - a0Var.getMeasuredWidth()) / 2.0f) - org.telegram.messenger.g0.L(16.0f));
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
            this.f5340t = a0Var.getTranslationY();
        } else {
            this.f5340t = topOffset;
            a0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - a0Var.getX();
        this.f5328g = x10;
        float y10 = (iArr[r18] - iArr2[r18]) - a0Var.getY();
        this.h = y10;
        rectF.offset(x10, y10);
        xi0Var.setCustomEmojiEnterProgress(this.f5330j);
        if (z10) {
            if (bz.o() >= 2 && pc.e(8200)) {
                z14 = r18;
            } else {
                z14 = false;
            }
            this.f5342w = z14;
            this.f5331k = false;
        } else {
            this.f5342w = false;
        }
        if (this.f5342w) {
            z11 = r18;
            j(z11, 0.0f);
        } else {
            z11 = r18;
        }
        k();
        xVar.setEnterAnimationInProgress(z11);
        ov ovVar = xVar.f51831e0;
        if (z10 && this.f5342w) {
            z12 = true;
        } else {
            z12 = false;
        }
        ovVar.m(z12);
        this.B.d();
        ValueAnimator valueAnimator2 = this.f5343x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f11 = this.f5330j;
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
            timeAnimator.f39698a = 0;
            timeAnimator.f39699b = 0;
            timeAnimator.setFloatValues(new float[]{f11, f10});
            valueAnimator = timeAnimator;
        }
        this.f5343x = valueAnimator;
        valueAnimator.addUpdateListener(new v(0, this, z10));
        if (!z10) {
            i();
        }
        this.f5343x.addListener(new h7(1, this, z10));
        if (i10 == 4) {
            this.f5343x.setDuration(420L);
            this.f5343x.setInterpolator(nr.h);
        } else if (this.f5342w) {
            this.f5343x.setDuration(450L);
            org.telegram.ui.Cells.c0.q(0.5f, this.f5343x);
        } else {
            this.f5343x.setDuration(350L);
            this.f5343x.setInterpolator(nr.f37956f);
        }
        a0Var.invalidate();
        h(true);
        if (!z10) {
            xi0Var.P0 = true;
            xi0Var.invalidate();
            this.f5343x.setStartDelay(30L);
            this.f5343x.start();
        } else {
            xi0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f5343x;
            Objects.requireNonNull(valueAnimator3);
            ca.r rVar = new ca.r(valueAnimator3, 3);
            f0.f5383f = this.f5342w;
            f0.f5382e = true;
            f0.f5384g = false;
            if (f0.d) {
                f0.d = false;
            }
            f0.f5381c = rVar;
        }
        HashSet hashSet = f0.f5379a;
        com.google.android.gms.internal.cast.b0 b0Var = ec.D().f23717p;
        if (((CountDownLatch) b0Var.f6516c) == null) {
            z13 = true;
            b0Var.f6516c = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        f0.f5380b = z13;
        f0.f5382e = false;
        f0.f5384g = false;
    }

    public final void d() {
        if (!this.f5337q) {
            xi0 xi0Var = this.f5334n;
            if (xi0Var != null) {
                ValueAnimator valueAnimator = xi0Var.f42155z0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                xi0Var.C0 = 0.0f;
                ai.l0 l0Var = xi0Var.T;
                if (l0Var != null) {
                    l0Var.invalidate();
                }
                xi0Var.invalidate();
            }
            gc.e();
            this.f5337q = true;
            org.telegram.messenger.g0.v1(this.f5325c);
            c(false);
            if (this.v) {
                g2 g2Var = this.f5338r;
                if (g2Var instanceof bn) {
                    ((bn) g2Var).wa(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f5337q) {
            gc.e();
            this.f5337q = true;
            ai.l0 l0Var = this.f5325c;
            org.telegram.messenger.g0.v1(l0Var);
            l0Var.animate().alpha(0.0f).setDuration(150L).setListener(new z(this, 1));
            if (this.v) {
                g2 g2Var = this.f5338r;
                if (g2Var instanceof bn) {
                    ((bn) g2Var).wa(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f5344y != 5) {
            ks.e().k(ks.f25168k1, 7);
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
        x xVar = this.f5333m;
        xVar.f51840i0.setLayerType(i7, null);
        xVar.f51836g0.setLayerType(i7, null);
        if (this.f5342w) {
            for (int i10 = 0; i10 < Math.min(xVar.f51831e0.f36926b.getChildCount(), 16); i10++) {
                xVar.f51831e0.f36926b.getChildAt(i10).setLayerType(i7, null);
            }
            return;
        }
        xVar.f51834f0.setLayerType(i7, null);
        xVar.f51831e0.setLayerType(i7, null);
    }

    public final void i() {
        int i7 = 0;
        while (true) {
            x xVar = this.f5333m;
            q01 q01Var = xVar.f51840i0;
            q01 q01Var2 = xVar.f51840i0;
            if (i7 < q01Var.getChildCount()) {
                if (q01Var2.getChildAt(i7) instanceof c11) {
                    c11 c11Var = (c11) q01Var2.getChildAt(i7);
                    if (c11Var.f46388y != null) {
                        c11Var.f46379b = false;
                        c11Var.invalidate();
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
        x xVar = this.f5333m;
        float y10 = xVar.getY();
        n01 n01Var = xVar.f51823b0;
        float y11 = n01Var.getY() + y10;
        q01 q01Var = xVar.f51840i0;
        int y12 = (int) (q01Var.getY() + y11);
        ArrayList arrayList = null;
        int i7 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = q01Var.getChildCount();
            rectF = this.f5329i;
            hashSet = this.D;
            if (i7 >= childCount) {
                break;
            }
            View childAt = q01Var.getChildAt(i7);
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
        int y13 = (int) (xVar.f51831e0.getY() + n01Var.getY() + xVar.getY());
        for (int i10 = 0; i10 < xVar.f51831e0.f36926b.getChildCount(); i10++) {
            View childAt2 = xVar.f51831e0.f36926b.getChildAt(i10);
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
            xVar.f51846l0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new w(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 1));
            if (this.f5344y == 4) {
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
        if (!this.f5342w) {
            x xVar = this.f5333m;
            xVar.f51836g0.setAlpha(this.f5330j);
            xVar.f51840i0.setAlpha(this.f5330j);
            xVar.f51842j0.setAlpha(this.f5330j);
            xVar.f51831e0.setAlpha(this.f5330j);
            xVar.f51834f0.setAlpha(this.f5330j);
        }
    }

    public final void l() {
        float f10;
        x xVar = this.f5333m;
        n01 n01Var = xVar.f51823b0;
        n01 n01Var2 = xVar.f51823b0;
        boolean z10 = this.f5342w;
        a0 a0Var = this.f5323a;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = a0Var.f5312f;
        }
        n01Var.setTranslationX(f10);
        n01Var2.setTranslationY(a0Var.h);
        n01Var2.setPivotX(a0Var.f5314r);
        n01Var2.setPivotY(a0Var.f5315s);
        n01Var2.setScaleX(a0Var.f5313n);
        n01Var2.setScaleY(a0Var.f5313n);
    }
}
