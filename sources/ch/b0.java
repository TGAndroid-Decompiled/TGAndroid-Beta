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
    public final a0 f5008a;
    public final WindowManager f5009b;
    public final ai.j0 f5010c;
    public final boolean d;
    public float f5011e;
    public float f5013g;
    public float h;
    public float f5015j;
    public boolean f5016k;
    public boolean f5017l;
    public final x f5018m;
    public final mi0 f5019n;
    public final List f5020o;
    public wa0 f5021p;
    public boolean f5022q;
    public final e2 f5023r;
    public final e6 f5024s;
    public float f5025t;
    public float f5026u;
    public boolean v;
    public boolean f5027w;
    public ValueAnimator f5028x;
    public final int f5029y;
    public fh.g f5030z;
    public final RectF f5012f = new RectF();
    public final RectF f5014i = new RectF();

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
        this.f5029y = i7;
        this.f5020o = arrayList;
        this.f5023r = e2Var;
        this.f5024s = e6Var;
        if (e2Var != null) {
            context = e2Var.getContext();
        } else {
            context = mi0Var.getContext();
        }
        Context context2 = context;
        ai.j0 j0Var = new ai.j0(this, context2);
        this.f5010c = j0Var;
        j0Var.setOnClickListener(new ah.d(this, 8));
        if (i7 != 2 && i7 != 4 && i7 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        a0 a0Var = new a0(this, context2);
        this.f5008a = a0Var;
        boolean z13 = z11;
        int windowType = mi0Var.getWindowType();
        if (i7 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        x xVar = new x(this, e2Var, context2, windowType, z12, e6Var, mi0Var, e2Var);
        this.f5018m = xVar;
        xVar.setOutlineProvider(new y(this));
        xVar.setClipToOutline(true);
        boolean z14 = mi0Var.f37276h1;
        boolean z15 = mi0Var.f37278i1;
        if (xVar.M1 != z14) {
            xVar.M1 = z14;
            xVar.N1 = z15;
            l01 l01Var = xVar.f49386i0;
            if (l01Var != null) {
                l01Var.invalidate();
            }
            b01 b01Var = xVar.f49388j0;
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
            j0Var.setClipChildren(false);
            j0Var.setClipToPadding(false);
        }
        if (i7 == 5) {
            i11 = 85;
        } else {
            i11 = 48;
        }
        int i12 = i11;
        float f10 = i10;
        j0Var.addView(a0Var, ja.d(-1, -1.0f, i12, f10, f10, f10, 16.0f));
        j0Var.setClipChildren(false);
        if (i7 == 1 || (mi0Var.getDelegate() != null && mi0Var.getDelegate().L())) {
            xVar.setBackgroundDelegate(new ab.g(10, this, mi0Var));
        }
        if (z13) {
            ((ViewGroup) mi0Var.getParent()).addView(j0Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = org.telegram.messenger.g0.W(context2).getWindowManager();
            this.f5009b = windowManager;
            org.telegram.messenger.g0.x3(windowManager, j0Var, b10);
            windowManager.addView(j0Var, b10);
        }
        this.f5019n = mi0Var;
        mi0Var.setOnSwitchedToLoopView(new s(this, 0));
        mi0Var.f37266d1 = true;
        mi0Var.invalidate();
        org.telegram.messenger.g0.i3(new c1.c(5, this, mi0Var), 50L);
        if (i7 != 5) {
            ns.e().k(ns.f25517j1, 7);
        }
    }

    public static void a(b0 b0Var, boolean z10) {
        View view;
        mi0 mi0Var = b0Var.f5019n;
        x xVar = b0Var.f5018m;
        if (b0Var.E.isEmpty()) {
            b0Var.h(false);
            f0.a();
            b0Var.B.e();
            xVar.setEnterAnimationInProgress(false);
            l01 l01Var = xVar.f49386i0;
            if (z10) {
                xVar.f49377e0.m(false);
                l01Var.invalidate();
                ArrayList arrayList = l01Var.f50424i3;
                l01Var.g1();
                xVar.f49382g0.b();
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
                    ValueAnimator valueAnimator = mi0Var.f37302z0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    mi0Var.C0 = 0.0f;
                    ai.j0 j0Var = mi0Var.T;
                    if (j0Var != null) {
                        j0Var.invalidate();
                    }
                    mi0Var.invalidate();
                } else {
                    mi0Var.P0 = true;
                    ValueAnimator valueAnimator2 = mi0Var.f37302z0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    mi0Var.C0 = 0.0f;
                    ai.j0 j0Var2 = mi0Var.T;
                    if (j0Var2 != null) {
                        j0Var2.invalidate();
                    }
                    mi0Var.invalidate();
                }
                b01 b01Var = xVar.f49388j0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    p01 p01Var = (p01) arrayList.get(i10);
                    for (int i11 = 0; i11 < p01Var.P.size(); i11++) {
                        if (((x01) p01Var.P.get(i11)).f53055b) {
                            ((x01) p01Var.P.get(i11)).f53055b = false;
                            ((x01) p01Var.P.get(i11)).invalidate();
                            p01Var.k();
                        }
                    }
                }
                l01Var.invalidate();
                for (int i12 = 0; i12 < b01Var.f50424i3.size(); i12++) {
                    p01 p01Var2 = (p01) b01Var.f50424i3.get(i12);
                    for (int i13 = 0; i13 < p01Var2.P.size(); i13++) {
                        if (((x01) p01Var2.P.get(i13)).f53055b) {
                            ((x01) p01Var2.P.get(i13)).f53055b = false;
                            ((x01) p01Var2.P.get(i13)).invalidate();
                            p01Var2.k();
                        }
                    }
                }
                b01Var.invalidate();
                b0Var.i();
                b0Var.f5008a.invalidate();
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
        int i10 = this.f5029y;
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
        x xVar = this.f5018m;
        int i10 = this.f5029y;
        ai.j0 j0Var = this.f5010c;
        int[] iArr = this.A;
        a0 a0Var = this.f5008a;
        RectF rectF = this.f5012f;
        mi0 mi0Var = this.f5019n;
        rectF.set(mi0Var.f37298x);
        this.f5011e = mi0Var.E;
        int[] iArr2 = new int[2];
        if (z10) {
            mi0Var.getLocationOnScreen(iArr);
        }
        j0Var.getLocationOnScreen(iArr2);
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
        if (a0Var.getMeasuredHeight() + topOffset > j0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) {
            topOffset = (j0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) - a0Var.getMeasuredHeight();
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
            a0Var.setTranslationX(((j0Var.getMeasuredWidth() - a0Var.getMeasuredWidth()) / 2.0f) - org.telegram.messenger.g0.L(16.0f));
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
            this.f5025t = a0Var.getTranslationY();
        } else {
            this.f5025t = topOffset;
            a0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - a0Var.getX();
        this.f5013g = x10;
        float y10 = (iArr[r18] - iArr2[r18]) - a0Var.getY();
        this.h = y10;
        rectF.offset(x10, y10);
        mi0Var.setCustomEmojiEnterProgress(this.f5015j);
        if (z10) {
            if (gz.o() >= 2 && qc.e(8200)) {
                z14 = r18;
            } else {
                z14 = false;
            }
            this.f5027w = z14;
            this.f5016k = false;
        } else {
            this.f5027w = false;
        }
        if (this.f5027w) {
            z11 = r18;
            j(z11, 0.0f);
        } else {
            z11 = r18;
        }
        k();
        xVar.setEnterAnimationInProgress(z11);
        gv gvVar = xVar.f49377e0;
        if (z10 && this.f5027w) {
            z12 = true;
        } else {
            z12 = false;
        }
        gvVar.m(z12);
        this.B.d();
        ValueAnimator valueAnimator2 = this.f5028x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f11 = this.f5015j;
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
            timeAnimator.f35346a = 0;
            timeAnimator.f35347b = 0;
            timeAnimator.setFloatValues(new float[]{f11, f10});
            valueAnimator = timeAnimator;
        }
        this.f5028x = valueAnimator;
        valueAnimator.addUpdateListener(new u(0, this, z10));
        if (!z10) {
            i();
        }
        this.f5028x.addListener(new v4(1, this, z10));
        if (i10 == 4) {
            this.f5028x.setDuration(420L);
            this.f5028x.setInterpolator(er.h);
        } else if (this.f5027w) {
            this.f5028x.setDuration(450L);
            i20.k(0.5f, this.f5028x);
        } else {
            this.f5028x.setDuration(350L);
            this.f5028x.setInterpolator(er.f34420f);
        }
        a0Var.invalidate();
        h(true);
        if (!z10) {
            mi0Var.P0 = true;
            mi0Var.invalidate();
            this.f5028x.setStartDelay(30L);
            this.f5028x.start();
        } else {
            mi0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f5028x;
            Objects.requireNonNull(valueAnimator3);
            a3.f fVar = new a3.f(valueAnimator3, 29);
            f0.f5068f = this.f5027w;
            f0.f5067e = true;
            f0.f5069g = false;
            if (f0.d) {
                f0.d = false;
            }
            f0.f5066c = fVar;
        }
        HashSet hashSet = f0.f5064a;
        com.google.android.gms.internal.cast.b0 b0Var = fc.D().f23473p;
        if (((CountDownLatch) b0Var.f6204c) == null) {
            z13 = true;
            b0Var.f6204c = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        f0.f5065b = z13;
        f0.f5067e = false;
        f0.f5069g = false;
    }

    public final void d() {
        if (!this.f5022q) {
            mi0 mi0Var = this.f5019n;
            if (mi0Var != null) {
                ValueAnimator valueAnimator = mi0Var.f37302z0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                mi0Var.C0 = 0.0f;
                ai.j0 j0Var = mi0Var.T;
                if (j0Var != null) {
                    j0Var.invalidate();
                }
                mi0Var.invalidate();
            }
            xb.e();
            this.f5022q = true;
            org.telegram.messenger.g0.v1(this.f5010c);
            c(false);
            if (this.v) {
                e2 e2Var = this.f5023r;
                if (e2Var instanceof an) {
                    ((an) e2Var).wa(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f5022q) {
            xb.e();
            this.f5022q = true;
            ai.j0 j0Var = this.f5010c;
            org.telegram.messenger.g0.v1(j0Var);
            j0Var.animate().alpha(0.0f).setDuration(150L).setListener(new z(this, 1));
            if (this.v) {
                e2 e2Var = this.f5023r;
                if (e2Var instanceof an) {
                    ((an) e2Var).wa(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f5029y != 5) {
            ns.e().k(ns.f25522k1, 7);
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
        x xVar = this.f5018m;
        xVar.f49386i0.setLayerType(i7, null);
        xVar.f49382g0.setLayerType(i7, null);
        if (this.f5027w) {
            for (int i10 = 0; i10 < Math.min(xVar.f49377e0.f33010b.getChildCount(), 16); i10++) {
                xVar.f49377e0.f33010b.getChildAt(i10).setLayerType(i7, null);
            }
            return;
        }
        xVar.f49380f0.setLayerType(i7, null);
        xVar.f49377e0.setLayerType(i7, null);
    }

    public final void i() {
        int i7 = 0;
        while (true) {
            x xVar = this.f5018m;
            l01 l01Var = xVar.f49386i0;
            l01 l01Var2 = xVar.f49386i0;
            if (i7 < l01Var.getChildCount()) {
                if (l01Var2.getChildAt(i7) instanceof x01) {
                    x01 x01Var = (x01) l01Var2.getChildAt(i7);
                    if (x01Var.f53064y != null) {
                        x01Var.f53055b = false;
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
        x xVar = this.f5018m;
        float y10 = xVar.getY();
        i01 i01Var = xVar.f49369b0;
        float y11 = i01Var.getY() + y10;
        l01 l01Var = xVar.f49386i0;
        int y12 = (int) (l01Var.getY() + y11);
        ArrayList arrayList = null;
        int i7 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = l01Var.getChildCount();
            rectF = this.f5014i;
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
        int y13 = (int) (xVar.f49377e0.getY() + i01Var.getY() + xVar.getY());
        for (int i10 = 0; i10 < xVar.f49377e0.f33010b.getChildCount(); i10++) {
            View childAt2 = xVar.f49377e0.f33010b.getChildAt(i10);
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
            xVar.f49392l0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new v(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 1));
            if (this.f5029y == 4) {
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
        if (!this.f5027w) {
            x xVar = this.f5018m;
            xVar.f49382g0.setAlpha(this.f5015j);
            xVar.f49386i0.setAlpha(this.f5015j);
            xVar.f49388j0.setAlpha(this.f5015j);
            xVar.f49377e0.setAlpha(this.f5015j);
            xVar.f49380f0.setAlpha(this.f5015j);
        }
    }

    public final void l() {
        float f10;
        x xVar = this.f5018m;
        i01 i01Var = xVar.f49369b0;
        i01 i01Var2 = xVar.f49369b0;
        boolean z10 = this.f5027w;
        a0 a0Var = this.f5008a;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = a0Var.f4997f;
        }
        i01Var.setTranslationX(f10);
        i01Var2.setTranslationY(a0Var.h);
        i01Var2.setPivotX(a0Var.f4999r);
        i01Var2.setPivotY(a0Var.f5000s);
        i01Var2.setScaleX(a0Var.f4998n);
        i01Var2.setScaleY(a0Var.f4998n);
    }
}
