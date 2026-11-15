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
import bi.v4;
import c8.ja;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.fc;
import org.telegram.messenger.gz;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.messenger.qc;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gv;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.an;
import org.telegram.ui.b01;
import org.telegram.ui.i01;
import org.telegram.ui.l01;
import org.telegram.ui.p01;
import org.telegram.ui.x01;
public final class b0 {
    public final int[] A;
    public final h2.f B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final a0 f5011a;
    public final WindowManager f5012b;
    public final ai.k0 f5013c;
    public final boolean d;
    public float f5014e;
    public float f5016g;
    public float h;
    public float f5018j;
    public boolean f5019k;
    public boolean f5020l;
    public final x f5021m;
    public final mi0 f5022n;
    public final List f5023o;
    public wa0 f5024p;
    public boolean f5025q;
    public final e2 f5026r;
    public final e6 f5027s;
    public float f5028t;
    public float f5029u;
    public boolean v;
    public boolean f5030w;
    public ValueAnimator f5031x;
    public final int f5032y;
    public fh.g f5033z;
    public final RectF f5015f = new RectF();
    public final RectF f5017i = new RectF();

    public b0(int i7, e2 e2Var, ArrayList arrayList, HashSet hashSet, mi0 mi0Var, e6 e6Var, boolean z10) {
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
        this.f5032y = i7;
        this.f5023o = arrayList;
        this.f5026r = e2Var;
        this.f5027s = e6Var;
        if (e2Var != null) {
            context = e2Var.getContext();
        } else {
            context = mi0Var.getContext();
        }
        Context context2 = context;
        ai.k0 k0Var = new ai.k0(this, context2);
        this.f5013c = k0Var;
        k0Var.setOnClickListener(new ah.d(this, 8));
        if (i7 != 2 && i7 != 4 && i7 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        a0 a0Var = new a0(this, context2);
        this.f5011a = a0Var;
        boolean z13 = z11;
        int windowType = mi0Var.getWindowType();
        if (i7 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        x xVar = new x(this, e2Var, context2, windowType, z12, e6Var, mi0Var, e2Var);
        this.f5021m = xVar;
        xVar.setOutlineProvider(new y(this));
        xVar.setClipToOutline(true);
        boolean z14 = mi0Var.f37275h1;
        boolean z15 = mi0Var.f37277i1;
        if (xVar.M1 != z14) {
            xVar.M1 = z14;
            xVar.N1 = z15;
            l01 l01Var = xVar.f49385i0;
            if (l01Var != null) {
                l01Var.invalidate();
            }
            b01 b01Var = xVar.f49387j0;
            if (b01Var != null) {
                b01Var.invalidate();
            }
        }
        xVar.setOnLongPressedListener(new ob.c(mi0Var, 10));
        xVar.setOnRecentClearedListener(new sa.d(6));
        xVar.setRecentReactions(arrayList);
        xVar.setSelectedReactions(hashSet);
        xVar.setDrawBackground(false);
        xVar.s(null);
        a0Var.addView(xVar, ja.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        if (i7 == 5) {
            i10 = 2;
        } else {
            i10 = 16;
        }
        if (i7 == 5) {
            a0Var.setClipChildren(false);
            a0Var.setClipToPadding(false);
            k0Var.setClipChildren(false);
            k0Var.setClipToPadding(false);
        }
        if (i7 == 5) {
            i11 = 85;
        } else {
            i11 = 48;
        }
        int i12 = i11;
        float f10 = i10;
        k0Var.addView(a0Var, ja.d(-1, -1.0f, i12, f10, f10, f10, 16.0f));
        k0Var.setClipChildren(false);
        if (i7 == 1 || (mi0Var.getDelegate() != null && mi0Var.getDelegate().L())) {
            xVar.setBackgroundDelegate(new ab.g(10, this, mi0Var));
        }
        if (z13) {
            ((ViewGroup) mi0Var.getParent()).addView(k0Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = org.telegram.messenger.g0.W(context2).getWindowManager();
            this.f5012b = windowManager;
            org.telegram.messenger.g0.x3(windowManager, k0Var, b10);
            windowManager.addView(k0Var, b10);
        }
        this.f5022n = mi0Var;
        mi0Var.setOnSwitchedToLoopView(new s(this, 0));
        mi0Var.f37265d1 = true;
        mi0Var.invalidate();
        org.telegram.messenger.g0.i3(new c1.c(5, this, mi0Var), 50L);
        if (i7 != 5) {
            ns.e().k(ns.f25518j1, 7);
        }
    }

    public static void a(b0 b0Var, boolean z10) {
        View view;
        mi0 mi0Var = b0Var.f5022n;
        x xVar = b0Var.f5021m;
        if (b0Var.E.isEmpty()) {
            b0Var.h(false);
            f0.a();
            b0Var.B.e();
            xVar.setEnterAnimationInProgress(false);
            l01 l01Var = xVar.f49385i0;
            if (z10) {
                xVar.f49376e0.m(false);
                l01Var.invalidate();
                ArrayList arrayList = l01Var.f50415i3;
                l01Var.g1();
                xVar.f49381g0.b();
                xVar.sendAccessibilityEvent(32);
                mi0Var.setImportantForAccessibility(4);
                int i7 = 0;
                while (true) {
                    if (i7 < l01Var.getChildCount()) {
                        if (l01Var.getChildAt(i7) instanceof x01) {
                            view = l01Var.getChildAt(i7);
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
                if (mi0Var.getPullingLeftProgress() > 0.0f) {
                    mi0Var.P0 = false;
                    ValueAnimator valueAnimator = mi0Var.f37301z0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    mi0Var.C0 = 0.0f;
                    ai.k0 k0Var = mi0Var.T;
                    if (k0Var != null) {
                        k0Var.invalidate();
                    }
                    mi0Var.invalidate();
                } else {
                    mi0Var.P0 = true;
                    ValueAnimator valueAnimator2 = mi0Var.f37301z0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    mi0Var.C0 = 0.0f;
                    ai.k0 k0Var2 = mi0Var.T;
                    if (k0Var2 != null) {
                        k0Var2.invalidate();
                    }
                    mi0Var.invalidate();
                }
                b01 b01Var = xVar.f49387j0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    p01 p01Var = (p01) arrayList.get(i10);
                    for (int i11 = 0; i11 < p01Var.P.size(); i11++) {
                        if (((x01) p01Var.P.get(i11)).f53054b) {
                            ((x01) p01Var.P.get(i11)).f53054b = false;
                            ((x01) p01Var.P.get(i11)).invalidate();
                            p01Var.k();
                        }
                    }
                }
                l01Var.invalidate();
                for (int i12 = 0; i12 < b01Var.f50415i3.size(); i12++) {
                    p01 p01Var2 = (p01) b01Var.f50415i3.get(i12);
                    for (int i13 = 0; i13 < p01Var2.P.size(); i13++) {
                        if (((x01) p01Var2.P.get(i13)).f53054b) {
                            ((x01) p01Var2.P.get(i13)).f53054b = false;
                            ((x01) p01Var2.P.get(i13)).invalidate();
                            p01Var2.k();
                        }
                    }
                }
                b01Var.invalidate();
                b0Var.i();
                b0Var.f5011a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof x01) {
            ((x01) view).setAnimatedScale(f10);
        } else if (view instanceof cv) {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i7;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i10 = this.f5032y;
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
        x xVar = this.f5021m;
        int i10 = this.f5032y;
        ai.k0 k0Var = this.f5013c;
        int[] iArr = this.A;
        a0 a0Var = this.f5011a;
        RectF rectF = this.f5015f;
        mi0 mi0Var = this.f5022n;
        rectF.set(mi0Var.f37297x);
        this.f5014e = mi0Var.E;
        int[] iArr2 = new int[2];
        if (z10) {
            mi0Var.getLocationOnScreen(iArr);
        }
        k0Var.getLocationOnScreen(iArr2);
        int L = ((iArr[1] - iArr2[1]) - org.telegram.messenger.g0.L(44.0f)) - org.telegram.messenger.g0.L(52.0f);
        if (xVar.P0) {
            i7 = org.telegram.messenger.g0.L(26.0f);
        } else {
            i7 = 0;
        }
        float topOffset = mi0Var.getTopOffset() + (L - i7);
        if (mi0Var.G0) {
            topOffset = (iArr[1] - iArr2[1]) - org.telegram.messenger.g0.L(12.0f);
        }
        if (a0Var.getMeasuredHeight() + topOffset > k0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) {
            topOffset = (k0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) - a0Var.getMeasuredHeight();
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
            a0Var.setTranslationX(((k0Var.getMeasuredWidth() - a0Var.getMeasuredWidth()) / 2.0f) - org.telegram.messenger.g0.L(16.0f));
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
            this.f5028t = a0Var.getTranslationY();
        } else {
            this.f5028t = topOffset;
            a0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - a0Var.getX();
        this.f5016g = x10;
        float y10 = (iArr[r18] - iArr2[r18]) - a0Var.getY();
        this.h = y10;
        rectF.offset(x10, y10);
        mi0Var.setCustomEmojiEnterProgress(this.f5018j);
        if (z10) {
            if (gz.o() >= 2 && qc.e(8200)) {
                z14 = r18;
            } else {
                z14 = false;
            }
            this.f5030w = z14;
            this.f5019k = false;
        } else {
            this.f5030w = false;
        }
        if (this.f5030w) {
            z11 = r18;
            j(z11, 0.0f);
        } else {
            z11 = r18;
        }
        k();
        xVar.setEnterAnimationInProgress(z11);
        gv gvVar = xVar.f49376e0;
        if (z10 && this.f5030w) {
            z12 = true;
        } else {
            z12 = false;
        }
        gvVar.m(z12);
        this.B.d();
        ValueAnimator valueAnimator2 = this.f5031x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f11 = this.f5018j;
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
            timeAnimator.f35337a = 0;
            timeAnimator.f35338b = 0;
            timeAnimator.setFloatValues(new float[]{f11, f10});
            valueAnimator = timeAnimator;
        }
        this.f5031x = valueAnimator;
        valueAnimator.addUpdateListener(new u(0, this, z10));
        if (!z10) {
            i();
        }
        this.f5031x.addListener(new v4(1, this, z10));
        if (i10 == 4) {
            this.f5031x.setDuration(420L);
            this.f5031x.setInterpolator(er.h);
        } else if (this.f5030w) {
            this.f5031x.setDuration(450L);
            i20.k(0.5f, this.f5031x);
        } else {
            this.f5031x.setDuration(350L);
            this.f5031x.setInterpolator(er.f34419f);
        }
        a0Var.invalidate();
        h(true);
        if (!z10) {
            mi0Var.P0 = true;
            mi0Var.invalidate();
            this.f5031x.setStartDelay(30L);
            this.f5031x.start();
        } else {
            mi0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f5031x;
            Objects.requireNonNull(valueAnimator3);
            a3.f fVar = new a3.f(valueAnimator3, 29);
            f0.f5071f = this.f5030w;
            f0.f5070e = true;
            f0.f5072g = false;
            if (f0.d) {
                f0.d = false;
            }
            f0.f5069c = fVar;
        }
        HashSet hashSet = f0.f5067a;
        com.google.android.gms.internal.cast.b0 b0Var = fc.D().f23476p;
        if (((CountDownLatch) b0Var.f6207c) == null) {
            z13 = true;
            b0Var.f6207c = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        f0.f5068b = z13;
        f0.f5070e = false;
        f0.f5072g = false;
    }

    public final void d() {
        if (!this.f5025q) {
            mi0 mi0Var = this.f5022n;
            if (mi0Var != null) {
                ValueAnimator valueAnimator = mi0Var.f37301z0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                mi0Var.C0 = 0.0f;
                ai.k0 k0Var = mi0Var.T;
                if (k0Var != null) {
                    k0Var.invalidate();
                }
                mi0Var.invalidate();
            }
            xb.e();
            this.f5025q = true;
            org.telegram.messenger.g0.v1(this.f5013c);
            c(false);
            if (this.v) {
                e2 e2Var = this.f5026r;
                if (e2Var instanceof an) {
                    ((an) e2Var).wa(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f5025q) {
            xb.e();
            this.f5025q = true;
            ai.k0 k0Var = this.f5013c;
            org.telegram.messenger.g0.v1(k0Var);
            k0Var.animate().alpha(0.0f).setDuration(150L).setListener(new z(this, 1));
            if (this.v) {
                e2 e2Var = this.f5026r;
                if (e2Var instanceof an) {
                    ((an) e2Var).wa(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f5032y != 5) {
            ns.e().k(ns.f25523k1, 7);
        }
        org.telegram.messenger.g0.h3(new s(this, 1));
    }

    public final void h(boolean z10) {
        int i7;
        if (z10) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        x xVar = this.f5021m;
        xVar.f49385i0.setLayerType(i7, null);
        xVar.f49381g0.setLayerType(i7, null);
        if (this.f5030w) {
            for (int i10 = 0; i10 < Math.min(xVar.f49376e0.f33013b.getChildCount(), 16); i10++) {
                xVar.f49376e0.f33013b.getChildAt(i10).setLayerType(i7, null);
            }
            return;
        }
        xVar.f49379f0.setLayerType(i7, null);
        xVar.f49376e0.setLayerType(i7, null);
    }

    public final void i() {
        int i7 = 0;
        while (true) {
            x xVar = this.f5021m;
            l01 l01Var = xVar.f49385i0;
            l01 l01Var2 = xVar.f49385i0;
            if (i7 < l01Var.getChildCount()) {
                if (l01Var2.getChildAt(i7) instanceof x01) {
                    x01 x01Var = (x01) l01Var2.getChildAt(i7);
                    if (x01Var.f53063y != null) {
                        x01Var.f53054b = false;
                        x01Var.invalidate();
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
        x xVar = this.f5021m;
        float y10 = xVar.getY();
        i01 i01Var = xVar.f49368b0;
        float y11 = i01Var.getY() + y10;
        l01 l01Var = xVar.f49385i0;
        int y12 = (int) (l01Var.getY() + y11);
        ArrayList arrayList = null;
        int i7 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = l01Var.getChildCount();
            rectF = this.f5017i;
            hashSet = this.D;
            if (i7 >= childCount) {
                break;
            }
            View childAt = l01Var.getChildAt(i7);
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
        int y13 = (int) (xVar.f49376e0.getY() + i01Var.getY() + xVar.getY());
        for (int i10 = 0; i10 < xVar.f49376e0.f33013b.getChildCount(); i10++) {
            View childAt2 = xVar.f49376e0.f33013b.getChildAt(i10);
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
            xVar.f49391l0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new v(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 1));
            if (this.f5032y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(er.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f5030w) {
            x xVar = this.f5021m;
            xVar.f49381g0.setAlpha(this.f5018j);
            xVar.f49385i0.setAlpha(this.f5018j);
            xVar.f49387j0.setAlpha(this.f5018j);
            xVar.f49376e0.setAlpha(this.f5018j);
            xVar.f49379f0.setAlpha(this.f5018j);
        }
    }

    public final void l() {
        float f10;
        x xVar = this.f5021m;
        i01 i01Var = xVar.f49368b0;
        i01 i01Var2 = xVar.f49368b0;
        boolean z10 = this.f5030w;
        a0 a0Var = this.f5011a;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = a0Var.f5000f;
        }
        i01Var.setTranslationX(f10);
        i01Var2.setTranslationY(a0Var.h);
        i01Var2.setPivotX(a0Var.f5002r);
        i01Var2.setPivotY(a0Var.f5003s);
        i01Var2.setScaleX(a0Var.f5001n);
        i01Var2.setScaleY(a0Var.f5001n);
    }
}
