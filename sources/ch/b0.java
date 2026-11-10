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
import bi.a4;
import bi.ab;
import bi.de;
import bi.x5;
import c8.ha;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.gc;
import org.telegram.messenger.iz;
import org.telegram.messenger.qs;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.wu;
import org.telegram.ui.cn;
import org.telegram.ui.d11;
import org.telegram.ui.h01;
import org.telegram.ui.o01;
import org.telegram.ui.r01;
import org.telegram.ui.v01;
public final class b0 {
    public final int[] A;
    public final h2.f B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final a0 f6186a;
    public final WindowManager f6187b;
    public final x5 f6188c;
    public final boolean d;
    public float f6189e;
    public float f6191g;
    public float h;
    public float f6193j;
    public boolean f6194k;
    public boolean f6195l;
    public final w f6196m;
    public final ii0 f6197n;
    public final List f6198o;
    public ob0 f6199p;
    public boolean f6200q;
    public final f2 f6201r;
    public final h6 f6202s;
    public float f6203t;
    public float f6204u;
    public boolean v;
    public boolean f6205w;
    public ValueAnimator f6206x;
    public final int f6207y;
    public fh.g f6208z;
    public final RectF f6190f = new RectF();
    public final RectF f6192i = new RectF();

    public b0(int i7, f2 f2Var, ArrayList arrayList, HashSet hashSet, ii0 ii0Var, h6 h6Var, boolean z9) {
        Context context;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        new Path();
        this.A = new int[2];
        this.B = new h2.f((int[]) null);
        this.D = new HashSet();
        this.E = new ArrayList();
        this.F = 0;
        this.f6207y = i7;
        this.f6198o = arrayList;
        this.f6201r = f2Var;
        this.f6202s = h6Var;
        if (f2Var != null) {
            context = f2Var.getContext();
        } else {
            context = ii0Var.getContext();
        }
        Context context2 = context;
        x5 x5Var = new x5(this, context2);
        this.f6188c = x5Var;
        x5Var.setOnClickListener(new ah.d(this, 13));
        if (i7 != 2 && i7 != 4 && i7 != 5 && !z9) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.d = z10;
        a0 a0Var = new a0(this, context2);
        this.f6186a = a0Var;
        boolean z12 = z10;
        int windowType = ii0Var.getWindowType();
        if (i7 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        w wVar = new w(this, f2Var, context2, windowType, z11, h6Var, ii0Var, f2Var);
        this.f6196m = wVar;
        wVar.setOutlineProvider(new x(this));
        wVar.setClipToOutline(true);
        boolean z13 = ii0Var.f34652g1;
        boolean z14 = ii0Var.f34654h1;
        if (wVar.L1 != z13) {
            wVar.L1 = z13;
            wVar.M1 = z14;
            r01 r01Var = wVar.f50036h0;
            if (r01Var != null) {
                r01Var.invalidate();
            }
            h01 h01Var = wVar.f50038i0;
            if (h01Var != null) {
                h01Var.invalidate();
            }
        }
        wVar.setOnLongPressedListener(new aa.n(ii0Var, 9));
        wVar.setOnRecentClearedListener(new qb.a(6));
        wVar.setRecentReactions(arrayList);
        wVar.setSelectedReactions(hashSet);
        wVar.setDrawBackground(false);
        wVar.s(null);
        a0Var.addView(wVar, ha.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        if (i7 == 5) {
            i10 = 2;
        } else {
            i10 = 16;
        }
        if (i7 == 5) {
            a0Var.setClipChildren(false);
            a0Var.setClipToPadding(false);
            x5Var.setClipChildren(false);
            x5Var.setClipToPadding(false);
        }
        if (i7 == 5) {
            i11 = 85;
        } else {
            i11 = 48;
        }
        int i12 = i11;
        float f10 = i10;
        x5Var.addView(a0Var, ha.d(-1, -1.0f, i12, f10, f10, f10, 16.0f));
        x5Var.setClipChildren(false);
        if (i7 == 1 || (ii0Var.getDelegate() != null && ii0Var.getDelegate().U())) {
            wVar.setBackgroundDelegate(new ab.g(8, this, ii0Var));
        }
        if (z12) {
            ((ViewGroup) ii0Var.getParent()).addView(x5Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = org.telegram.messenger.g0.W(context2).getWindowManager();
            this.f6187b = windowManager;
            org.telegram.messenger.g0.y3(windowManager, x5Var, b10);
            windowManager.addView(x5Var, b10);
        }
        this.f6197n = ii0Var;
        ii0Var.setOnSwitchedToLoopView(new s(this, 0));
        ii0Var.f34642c1 = true;
        ii0Var.invalidate();
        org.telegram.messenger.g0.i3(new a4(18, this, ii0Var), 50L);
        if (i7 != 5) {
            qs.e().k(qs.f25025j1, 7);
        }
    }

    public static void a(b0 b0Var, boolean z9) {
        View view;
        ii0 ii0Var = b0Var.f6197n;
        w wVar = b0Var.f6196m;
        if (b0Var.E.isEmpty()) {
            b0Var.h(false);
            e0.a();
            b0Var.B.e();
            wVar.setEnterAnimationInProgress(false);
            r01 r01Var = wVar.f50036h0;
            if (z9) {
                wVar.f50026d0.m(false);
                r01Var.invalidate();
                ArrayList arrayList = r01Var.f50859h3;
                r01Var.g1();
                wVar.f50032f0.b();
                wVar.sendAccessibilityEvent(32);
                ii0Var.setImportantForAccessibility(4);
                int i7 = 0;
                while (true) {
                    if (i7 < r01Var.getChildCount()) {
                        if (r01Var.getChildAt(i7) instanceof d11) {
                            view = r01Var.getChildAt(i7);
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
                    wVar.performAccessibilityAction(64, null);
                }
                if (ii0Var.getPullingLeftProgress() > 0.0f) {
                    ii0Var.O0 = false;
                    ValueAnimator valueAnimator = ii0Var.f34679y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ii0Var.B0 = 0.0f;
                    x5 x5Var = ii0Var.S;
                    if (x5Var != null) {
                        x5Var.invalidate();
                    }
                    ii0Var.invalidate();
                } else {
                    ii0Var.O0 = true;
                    ValueAnimator valueAnimator2 = ii0Var.f34679y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    ii0Var.B0 = 0.0f;
                    x5 x5Var2 = ii0Var.S;
                    if (x5Var2 != null) {
                        x5Var2.invalidate();
                    }
                    ii0Var.invalidate();
                }
                h01 h01Var = wVar.f50038i0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    v01 v01Var = (v01) arrayList.get(i10);
                    for (int i11 = 0; i11 < v01Var.O.size(); i11++) {
                        if (((d11) v01Var.O.get(i11)).f44872b) {
                            ((d11) v01Var.O.get(i11)).f44872b = false;
                            ((d11) v01Var.O.get(i11)).invalidate();
                            v01Var.k();
                        }
                    }
                }
                r01Var.invalidate();
                for (int i12 = 0; i12 < h01Var.f50859h3.size(); i12++) {
                    v01 v01Var2 = (v01) h01Var.f50859h3.get(i12);
                    for (int i13 = 0; i13 < v01Var2.O.size(); i13++) {
                        if (((d11) v01Var2.O.get(i13)).f44872b) {
                            ((d11) v01Var2.O.get(i13)).f44872b = false;
                            ((d11) v01Var2.O.get(i13)).invalidate();
                            v01Var2.k();
                        }
                    }
                }
                h01Var.invalidate();
                b0Var.i();
                b0Var.f6186a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof d11) {
            ((d11) view).setAnimatedScale(f10);
        } else if (view instanceof wu) {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public final WindowManager.LayoutParams b(boolean z9) {
        int i7;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i10 = this.f6207y;
        if (i10 != 0 && i10 != 3) {
            i7 = 99;
        } else {
            i7 = 1000;
        }
        layoutParams.type = i7;
        layoutParams.softInputMode = 16;
        if (z9) {
            layoutParams.flags = 65792;
        } else {
            layoutParams.flags = 65800;
        }
        layoutParams.format = -3;
        return layoutParams;
    }

    public final void c(boolean z9) {
        int i7;
        ?? r18;
        boolean z10;
        boolean z11;
        ValueAnimator valueAnimator;
        boolean z12;
        boolean z13;
        w wVar = this.f6196m;
        int i10 = this.f6207y;
        x5 x5Var = this.f6188c;
        int[] iArr = this.A;
        a0 a0Var = this.f6186a;
        RectF rectF = this.f6190f;
        ii0 ii0Var = this.f6197n;
        rectF.set(ii0Var.f34676x);
        this.f6189e = ii0Var.D;
        int[] iArr2 = new int[2];
        if (z9) {
            ii0Var.getLocationOnScreen(iArr);
        }
        x5Var.getLocationOnScreen(iArr2);
        int L = ((iArr[1] - iArr2[1]) - org.telegram.messenger.g0.L(44.0f)) - org.telegram.messenger.g0.L(52.0f);
        if (wVar.O0) {
            i7 = org.telegram.messenger.g0.L(26.0f);
        } else {
            i7 = 0;
        }
        float topOffset = ii0Var.getTopOffset() + (L - i7);
        if (ii0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - org.telegram.messenger.g0.L(12.0f);
        }
        if (a0Var.getMeasuredHeight() + topOffset > x5Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) {
            topOffset = (x5Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) - a0Var.getMeasuredHeight();
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
            a0Var.setTranslationX(((x5Var.getMeasuredWidth() - a0Var.getMeasuredWidth()) / 2.0f) - org.telegram.messenger.g0.L(16.0f));
        } else {
            boolean z14 = true;
            if (i10 != 2 && i10 != 4) {
                a0Var.setTranslationX((iArr[0] - iArr2[0]) - org.telegram.messenger.g0.L(2.0f));
                r18 = z14;
            } else {
                a0Var.setTranslationX((iArr[0] - iArr2[0]) - org.telegram.messenger.g0.L(18.0f));
                r18 = z14;
            }
        }
        if (!z9) {
            this.f6203t = a0Var.getTranslationY();
        } else {
            this.f6203t = topOffset;
            a0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - a0Var.getX();
        this.f6191g = x10;
        float y10 = (iArr[r18] - iArr2[r18]) - a0Var.getY();
        this.h = y10;
        rectF.offset(x10, y10);
        ii0Var.setCustomEmojiEnterProgress(this.f6193j);
        if (z9) {
            if (iz.o() >= 2 && sc.e(8200)) {
                z13 = r18;
            } else {
                z13 = false;
            }
            this.f6205w = z13;
            this.f6194k = false;
        } else {
            this.f6205w = false;
        }
        if (this.f6205w) {
            z10 = r18;
            j(z10, 0.0f);
        } else {
            z10 = r18;
        }
        k();
        wVar.setEnterAnimationInProgress(z10);
        av avVar = wVar.f50026d0;
        if (z9 && this.f6205w) {
            z11 = true;
        } else {
            z11 = false;
        }
        avVar.m(z11);
        this.B.d();
        ValueAnimator valueAnimator2 = this.f6206x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f11 = this.f6193j;
        if (i10 == 4) {
            if (z9) {
                f10 = 1.0f;
            }
            valueAnimator = ValueAnimator.ofFloat(f11, f10);
        } else {
            if (z9) {
                f10 = 1.0f;
            }
            ?? timeAnimator = new TimeAnimator();
            timeAnimator.f34460a = 0;
            timeAnimator.f34461b = 0;
            timeAnimator.setFloatValues(new float[]{f11, f10});
            valueAnimator = timeAnimator;
        }
        this.f6206x = valueAnimator;
        valueAnimator.addUpdateListener(new u(0, this, z9));
        if (!z9) {
            i();
        }
        this.f6206x.addListener(new y(0, this, z9));
        if (i10 == 4) {
            this.f6206x.setDuration(420L);
            this.f6206x.setInterpolator(wq.h);
        } else if (this.f6205w) {
            this.f6206x.setDuration(450L);
            org.telegram.messenger.camera.q.i(0.5f, this.f6206x);
        } else {
            this.f6206x.setDuration(350L);
            this.f6206x.setInterpolator(wq.f40046f);
        }
        a0Var.invalidate();
        h(true);
        if (!z9) {
            ii0Var.O0 = true;
            ii0Var.invalidate();
            this.f6206x.setStartDelay(30L);
            this.f6206x.start();
        } else {
            ii0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f6206x;
            Objects.requireNonNull(valueAnimator3);
            ab abVar = new ab(valueAnimator3, 9);
            e0.f6238f = this.f6205w;
            e0.f6237e = true;
            e0.f6239g = false;
            if (e0.d) {
                e0.d = false;
            }
            e0.f6236c = abVar;
        }
        HashSet hashSet = e0.f6234a;
        com.google.android.gms.internal.cast.b0 b0Var = gc.D().f22652p;
        if (((CountDownLatch) b0Var.f6818c) == null) {
            z12 = true;
            b0Var.f6818c = new CountDownLatch(1);
        } else {
            z12 = true;
        }
        e0.f6235b = z12;
        e0.f6237e = false;
        e0.f6239g = false;
    }

    public final void d() {
        if (!this.f6200q) {
            ii0 ii0Var = this.f6197n;
            if (ii0Var != null) {
                ValueAnimator valueAnimator = ii0Var.f34679y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ii0Var.B0 = 0.0f;
                x5 x5Var = ii0Var.S;
                if (x5Var != null) {
                    x5Var.invalidate();
                }
                ii0Var.invalidate();
            }
            bc.e();
            this.f6200q = true;
            org.telegram.messenger.g0.v1(this.f6188c);
            c(false);
            if (this.v) {
                f2 f2Var = this.f6201r;
                if (f2Var instanceof cn) {
                    ((cn) f2Var).va(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f6200q) {
            bc.e();
            this.f6200q = true;
            x5 x5Var = this.f6188c;
            org.telegram.messenger.g0.v1(x5Var);
            x5Var.animate().alpha(0.0f).setDuration(150L).setListener(new z(this, 1));
            if (this.v) {
                f2 f2Var = this.f6201r;
                if (f2Var instanceof cn) {
                    ((cn) f2Var).va(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f6207y != 5) {
            qs.e().k(qs.f25030k1, 7);
        }
        org.telegram.messenger.g0.h3(new s(this, 1));
    }

    public final void h(boolean z9) {
        int i7;
        if (z9) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        w wVar = this.f6196m;
        wVar.f50036h0.setLayerType(i7, null);
        wVar.f50032f0.setLayerType(i7, null);
        if (this.f6205w) {
            for (int i10 = 0; i10 < Math.min(wVar.f50026d0.f39048b.getChildCount(), 16); i10++) {
                wVar.f50026d0.f39048b.getChildAt(i10).setLayerType(i7, null);
            }
            return;
        }
        wVar.f50029e0.setLayerType(i7, null);
        wVar.f50026d0.setLayerType(i7, null);
    }

    public final void i() {
        int i7 = 0;
        while (true) {
            w wVar = this.f6196m;
            r01 r01Var = wVar.f50036h0;
            r01 r01Var2 = wVar.f50036h0;
            if (i7 < r01Var.getChildCount()) {
                if (r01Var2.getChildAt(i7) instanceof d11) {
                    d11 d11Var = (d11) r01Var2.getChildAt(i7);
                    if (d11Var.f44881y != null) {
                        d11Var.f44872b = false;
                        d11Var.invalidate();
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void j(boolean z9, float f10) {
        RectF rectF;
        HashSet hashSet;
        w wVar = this.f6196m;
        float y10 = wVar.getY();
        o01 o01Var = wVar.f50018a0;
        float y11 = o01Var.getY() + y10;
        r01 r01Var = wVar.f50036h0;
        int y12 = (int) (r01Var.getY() + y11);
        ArrayList arrayList = null;
        int i7 = 0;
        boolean z10 = false;
        while (true) {
            int childCount = r01Var.getChildCount();
            rectF = this.f6192i;
            hashSet = this.D;
            if (i7 >= childCount) {
                break;
            }
            View childAt = r01Var.getChildAt(i7);
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
                    z10 = true;
                }
            }
            i7++;
        }
        int y13 = (int) (wVar.f50026d0.getY() + o01Var.getY() + wVar.getY());
        for (int i10 = 0; i10 < wVar.f50026d0.f39048b.getChildCount(); i10++) {
            View childAt2 = wVar.f50026d0.f39048b.getChildAt(i10);
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
                    z10 = true;
                }
            }
        }
        if (z10) {
            wVar.f50042k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new de(1, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new ai.g0(this, ofFloat, z9, 3));
            if (this.f6207y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(wq.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f6205w) {
            w wVar = this.f6196m;
            wVar.f50032f0.setAlpha(this.f6193j);
            wVar.f50036h0.setAlpha(this.f6193j);
            wVar.f50038i0.setAlpha(this.f6193j);
            wVar.f50026d0.setAlpha(this.f6193j);
            wVar.f50029e0.setAlpha(this.f6193j);
        }
    }

    public final void l() {
        float f10;
        w wVar = this.f6196m;
        o01 o01Var = wVar.f50018a0;
        o01 o01Var2 = wVar.f50018a0;
        boolean z9 = this.f6205w;
        a0 a0Var = this.f6186a;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = a0Var.f6175f;
        }
        o01Var.setTranslationX(f10);
        o01Var2.setTranslationY(a0Var.h);
        o01Var2.setPivotX(a0Var.f6177r);
        o01Var2.setPivotY(a0Var.f6178s);
        o01Var2.setScaleX(a0Var.f6176n);
        o01Var2.setScaleY(a0Var.f6176n);
    }
}
