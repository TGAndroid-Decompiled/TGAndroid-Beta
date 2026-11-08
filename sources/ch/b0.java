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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xu;
import org.telegram.ui.a11;
import org.telegram.ui.an;
import org.telegram.ui.e01;
import org.telegram.ui.l01;
import org.telegram.ui.o01;
import org.telegram.ui.s01;
public final class b0 {
    public final int[] A;
    public final h2.f B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final a0 f6183a;
    public final WindowManager f6184b;
    public final x5 f6185c;
    public final boolean d;
    public float f6186e;
    public float f6188g;
    public float h;
    public float f6190j;
    public boolean f6191k;
    public boolean f6192l;
    public final w f6193m;
    public final ii0 f6194n;
    public final List f6195o;
    public ob0 f6196p;
    public boolean f6197q;
    public final f2 f6198r;
    public final f6 f6199s;
    public float f6200t;
    public float f6201u;
    public boolean v;
    public boolean f6202w;
    public ValueAnimator f6203x;
    public final int f6204y;
    public fh.g f6205z;
    public final RectF f6187f = new RectF();
    public final RectF f6189i = new RectF();

    public b0(int i7, f2 f2Var, ArrayList arrayList, HashSet hashSet, ii0 ii0Var, f6 f6Var, boolean z9) {
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
        this.f6204y = i7;
        this.f6195o = arrayList;
        this.f6198r = f2Var;
        this.f6199s = f6Var;
        if (f2Var != null) {
            context = f2Var.getContext();
        } else {
            context = ii0Var.getContext();
        }
        Context context2 = context;
        x5 x5Var = new x5(this, context2);
        this.f6185c = x5Var;
        x5Var.setOnClickListener(new ah.d(this, 13));
        if (i7 != 2 && i7 != 4 && i7 != 5 && !z9) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.d = z10;
        a0 a0Var = new a0(this, context2);
        this.f6183a = a0Var;
        boolean z12 = z10;
        int windowType = ii0Var.getWindowType();
        if (i7 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        w wVar = new w(this, f2Var, context2, windowType, z11, f6Var, ii0Var, f2Var);
        this.f6193m = wVar;
        wVar.setOutlineProvider(new x(this));
        wVar.setClipToOutline(true);
        boolean z13 = ii0Var.f34697g1;
        boolean z14 = ii0Var.f34699h1;
        if (wVar.L1 != z13) {
            wVar.L1 = z13;
            wVar.M1 = z14;
            o01 o01Var = wVar.f49037h0;
            if (o01Var != null) {
                o01Var.invalidate();
            }
            e01 e01Var = wVar.f49039i0;
            if (e01Var != null) {
                e01Var.invalidate();
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
            this.f6184b = windowManager;
            org.telegram.messenger.g0.y3(windowManager, x5Var, b10);
            windowManager.addView(x5Var, b10);
        }
        this.f6194n = ii0Var;
        ii0Var.setOnSwitchedToLoopView(new s(this, 0));
        ii0Var.f34687c1 = true;
        ii0Var.invalidate();
        org.telegram.messenger.g0.i3(new a4(18, this, ii0Var), 50L);
        if (i7 != 5) {
            qs.e().k(qs.f25021j1, 7);
        }
    }

    public static void a(b0 b0Var, boolean z9) {
        View view;
        ii0 ii0Var = b0Var.f6194n;
        w wVar = b0Var.f6193m;
        if (b0Var.E.isEmpty()) {
            b0Var.h(false);
            e0.a();
            b0Var.B.e();
            wVar.setEnterAnimationInProgress(false);
            o01 o01Var = wVar.f49037h0;
            if (z9) {
                wVar.f49027d0.m(false);
                o01Var.invalidate();
                ArrayList arrayList = o01Var.f49871h3;
                o01Var.g1();
                wVar.f49033f0.b();
                wVar.sendAccessibilityEvent(32);
                ii0Var.setImportantForAccessibility(4);
                int i7 = 0;
                while (true) {
                    if (i7 < o01Var.getChildCount()) {
                        if (o01Var.getChildAt(i7) instanceof a11) {
                            view = o01Var.getChildAt(i7);
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
                    ValueAnimator valueAnimator = ii0Var.f34724y0;
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
                    ValueAnimator valueAnimator2 = ii0Var.f34724y0;
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
                e01 e01Var = wVar.f49039i0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    s01 s01Var = (s01) arrayList.get(i10);
                    for (int i11 = 0; i11 < s01Var.O.size(); i11++) {
                        if (((a11) s01Var.O.get(i11)).f43533b) {
                            ((a11) s01Var.O.get(i11)).f43533b = false;
                            ((a11) s01Var.O.get(i11)).invalidate();
                            s01Var.k();
                        }
                    }
                }
                o01Var.invalidate();
                for (int i12 = 0; i12 < e01Var.f49871h3.size(); i12++) {
                    s01 s01Var2 = (s01) e01Var.f49871h3.get(i12);
                    for (int i13 = 0; i13 < s01Var2.O.size(); i13++) {
                        if (((a11) s01Var2.O.get(i13)).f43533b) {
                            ((a11) s01Var2.O.get(i13)).f43533b = false;
                            ((a11) s01Var2.O.get(i13)).invalidate();
                            s01Var2.k();
                        }
                    }
                }
                e01Var.invalidate();
                b0Var.i();
                b0Var.f6183a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof a11) {
            ((a11) view).setAnimatedScale(f10);
        } else if (view instanceof xu) {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public final WindowManager.LayoutParams b(boolean z9) {
        int i7;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i10 = this.f6204y;
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
        w wVar = this.f6193m;
        int i10 = this.f6204y;
        x5 x5Var = this.f6185c;
        int[] iArr = this.A;
        a0 a0Var = this.f6183a;
        RectF rectF = this.f6187f;
        ii0 ii0Var = this.f6194n;
        rectF.set(ii0Var.f34721x);
        this.f6186e = ii0Var.D;
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
            this.f6200t = a0Var.getTranslationY();
        } else {
            this.f6200t = topOffset;
            a0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - a0Var.getX();
        this.f6188g = x10;
        float y10 = (iArr[r18] - iArr2[r18]) - a0Var.getY();
        this.h = y10;
        rectF.offset(x10, y10);
        ii0Var.setCustomEmojiEnterProgress(this.f6190j);
        if (z9) {
            if (iz.o() >= 2 && sc.e(8200)) {
                z13 = r18;
            } else {
                z13 = false;
            }
            this.f6202w = z13;
            this.f6191k = false;
        } else {
            this.f6202w = false;
        }
        if (this.f6202w) {
            z10 = r18;
            j(z10, 0.0f);
        } else {
            z10 = r18;
        }
        k();
        wVar.setEnterAnimationInProgress(z10);
        bv bvVar = wVar.f49027d0;
        if (z9 && this.f6202w) {
            z11 = true;
        } else {
            z11 = false;
        }
        bvVar.m(z11);
        this.B.d();
        ValueAnimator valueAnimator2 = this.f6203x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f11 = this.f6190j;
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
            timeAnimator.f34022a = 0;
            timeAnimator.f34023b = 0;
            timeAnimator.setFloatValues(new float[]{f11, f10});
            valueAnimator = timeAnimator;
        }
        this.f6203x = valueAnimator;
        valueAnimator.addUpdateListener(new u(0, this, z9));
        if (!z9) {
            i();
        }
        this.f6203x.addListener(new y(0, this, z9));
        if (i10 == 4) {
            this.f6203x.setDuration(420L);
            this.f6203x.setInterpolator(xq.h);
        } else if (this.f6202w) {
            this.f6203x.setDuration(450L);
            org.telegram.messenger.camera.q.i(0.5f, this.f6203x);
        } else {
            this.f6203x.setDuration(350L);
            this.f6203x.setInterpolator(xq.f40366f);
        }
        a0Var.invalidate();
        h(true);
        if (!z9) {
            ii0Var.O0 = true;
            ii0Var.invalidate();
            this.f6203x.setStartDelay(30L);
            this.f6203x.start();
        } else {
            ii0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f6203x;
            Objects.requireNonNull(valueAnimator3);
            ab abVar = new ab(valueAnimator3, 9);
            e0.f6235f = this.f6202w;
            e0.f6234e = true;
            e0.f6236g = false;
            if (e0.d) {
                e0.d = false;
            }
            e0.f6233c = abVar;
        }
        HashSet hashSet = e0.f6231a;
        com.google.android.gms.internal.cast.b0 b0Var = gc.D().f22648p;
        if (((CountDownLatch) b0Var.f6815c) == null) {
            z12 = true;
            b0Var.f6815c = new CountDownLatch(1);
        } else {
            z12 = true;
        }
        e0.f6232b = z12;
        e0.f6234e = false;
        e0.f6236g = false;
    }

    public final void d() {
        if (!this.f6197q) {
            ii0 ii0Var = this.f6194n;
            if (ii0Var != null) {
                ValueAnimator valueAnimator = ii0Var.f34724y0;
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
            cc.e();
            this.f6197q = true;
            org.telegram.messenger.g0.v1(this.f6185c);
            c(false);
            if (this.v) {
                f2 f2Var = this.f6198r;
                if (f2Var instanceof an) {
                    ((an) f2Var).ta(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f6197q) {
            cc.e();
            this.f6197q = true;
            x5 x5Var = this.f6185c;
            org.telegram.messenger.g0.v1(x5Var);
            x5Var.animate().alpha(0.0f).setDuration(150L).setListener(new z(this, 1));
            if (this.v) {
                f2 f2Var = this.f6198r;
                if (f2Var instanceof an) {
                    ((an) f2Var).ta(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f6204y != 5) {
            qs.e().k(qs.f25026k1, 7);
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
        w wVar = this.f6193m;
        wVar.f49037h0.setLayerType(i7, null);
        wVar.f49033f0.setLayerType(i7, null);
        if (this.f6202w) {
            for (int i10 = 0; i10 < Math.min(wVar.f49027d0.f39027b.getChildCount(), 16); i10++) {
                wVar.f49027d0.f39027b.getChildAt(i10).setLayerType(i7, null);
            }
            return;
        }
        wVar.f49030e0.setLayerType(i7, null);
        wVar.f49027d0.setLayerType(i7, null);
    }

    public final void i() {
        int i7 = 0;
        while (true) {
            w wVar = this.f6193m;
            o01 o01Var = wVar.f49037h0;
            o01 o01Var2 = wVar.f49037h0;
            if (i7 < o01Var.getChildCount()) {
                if (o01Var2.getChildAt(i7) instanceof a11) {
                    a11 a11Var = (a11) o01Var2.getChildAt(i7);
                    if (a11Var.f43542y != null) {
                        a11Var.f43533b = false;
                        a11Var.invalidate();
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
        w wVar = this.f6193m;
        float y10 = wVar.getY();
        l01 l01Var = wVar.f49019a0;
        float y11 = l01Var.getY() + y10;
        o01 o01Var = wVar.f49037h0;
        int y12 = (int) (o01Var.getY() + y11);
        ArrayList arrayList = null;
        int i7 = 0;
        boolean z10 = false;
        while (true) {
            int childCount = o01Var.getChildCount();
            rectF = this.f6189i;
            hashSet = this.D;
            if (i7 >= childCount) {
                break;
            }
            View childAt = o01Var.getChildAt(i7);
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
        int y13 = (int) (wVar.f49027d0.getY() + l01Var.getY() + wVar.getY());
        for (int i10 = 0; i10 < wVar.f49027d0.f39027b.getChildCount(); i10++) {
            View childAt2 = wVar.f49027d0.f39027b.getChildAt(i10);
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
            wVar.f49043k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new de(1, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new ai.g0(this, ofFloat, z9, 3));
            if (this.f6204y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(xq.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f6202w) {
            w wVar = this.f6193m;
            wVar.f49033f0.setAlpha(this.f6190j);
            wVar.f49037h0.setAlpha(this.f6190j);
            wVar.f49039i0.setAlpha(this.f6190j);
            wVar.f49027d0.setAlpha(this.f6190j);
            wVar.f49030e0.setAlpha(this.f6190j);
        }
    }

    public final void l() {
        float f10;
        w wVar = this.f6193m;
        l01 l01Var = wVar.f49019a0;
        l01 l01Var2 = wVar.f49019a0;
        boolean z9 = this.f6202w;
        a0 a0Var = this.f6183a;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = a0Var.f6172f;
        }
        l01Var.setTranslationX(f10);
        l01Var2.setTranslationY(a0Var.h);
        l01Var2.setPivotX(a0Var.f6174r);
        l01Var2.setPivotY(a0Var.f6175s);
        l01Var2.setScaleX(a0Var.f6173n);
        l01Var2.setScaleY(a0Var.f6173n);
    }
}
