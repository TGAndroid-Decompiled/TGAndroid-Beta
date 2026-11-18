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
import bi.e7;
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
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.vi0;
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
    public final a0 f5297a;
    public final WindowManager f5298b;
    public final ai.k0 f5299c;
    public final boolean d;
    public float f5300e;
    public float f5302g;
    public float h;
    public float f5304j;
    public boolean f5305k;
    public boolean f5306l;
    public final x f5307m;
    public final vi0 f5308n;
    public final List f5309o;
    public gb0 f5310p;
    public boolean f5311q;
    public final h2 f5312r;
    public final i6 f5313s;
    public float f5314t;
    public float f5315u;
    public boolean v;
    public boolean f5316w;
    public ValueAnimator f5317x;
    public final int f5318y;
    public fh.g f5319z;
    public final RectF f5301f = new RectF();
    public final RectF f5303i = new RectF();

    public b0(int i7, h2 h2Var, ArrayList arrayList, HashSet hashSet, vi0 vi0Var, i6 i6Var, boolean z10) {
        Context context;
        boolean z11;
        int i10;
        int i11;
        new Path();
        this.A = new int[2];
        this.B = new h2.f((int[]) null);
        this.D = new HashSet();
        this.E = new ArrayList();
        this.F = 0;
        this.f5318y = i7;
        this.f5309o = arrayList;
        this.f5312r = h2Var;
        this.f5313s = i6Var;
        if (h2Var != null) {
            context = h2Var.getContext();
        } else {
            context = vi0Var.getContext();
        }
        Context context2 = context;
        ai.k0 k0Var = new ai.k0(this, context2);
        this.f5299c = k0Var;
        k0Var.setOnClickListener(new ah.d(this, 9));
        if (i7 != 2 && i7 != 4 && i7 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        a0 a0Var = new a0(this, context2);
        this.f5297a = a0Var;
        boolean z12 = z11;
        x xVar = new x(this, h2Var, context2, vi0Var.getWindowType(), i7 != 1, i6Var, vi0Var, h2Var);
        this.f5307m = xVar;
        xVar.setOutlineProvider(new y(this));
        xVar.setClipToOutline(true);
        boolean z13 = vi0Var.f40658h1;
        boolean z14 = vi0Var.f40660i1;
        if (xVar.M1 != z13) {
            xVar.M1 = z13;
            xVar.N1 = z14;
            p01 p01Var = xVar.f51438i0;
            if (p01Var != null) {
                p01Var.invalidate();
            }
            f01 f01Var = xVar.f51440j0;
            if (f01Var != null) {
                f01Var.invalidate();
            }
        }
        xVar.setOnLongPressedListener(new cb.c(vi0Var, 11));
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
        k0Var.addView(a0Var, ma.d(-1, -1.0f, i12, f10, f10, f10, 16.0f));
        k0Var.setClipChildren(false);
        if (i7 == 1 || (vi0Var.getDelegate() != null && vi0Var.getDelegate().E())) {
            xVar.setBackgroundDelegate(new ab.g(9, this, vi0Var));
        }
        if (z12) {
            ((ViewGroup) vi0Var.getParent()).addView(k0Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = org.telegram.messenger.g0.W(context2).getWindowManager();
            this.f5298b = windowManager;
            org.telegram.messenger.g0.w3(windowManager, k0Var, b10);
            windowManager.addView(k0Var, b10);
        }
        this.f5308n = vi0Var;
        vi0Var.setOnSwitchedToLoopView(new t(this, 0));
        vi0Var.f40648d1 = true;
        vi0Var.invalidate();
        org.telegram.messenger.g0.h3(new c1.c(4, this, vi0Var), 50L);
        if (i7 != 5) {
            ks.e().k(ks.f25137j1, 7);
        }
    }

    public static void a(b0 b0Var, boolean z10) {
        View view;
        vi0 vi0Var = b0Var.f5308n;
        x xVar = b0Var.f5307m;
        if (b0Var.E.isEmpty()) {
            b0Var.h(false);
            f0.a();
            b0Var.B.e();
            xVar.setEnterAnimationInProgress(false);
            p01 p01Var = xVar.f51438i0;
            if (z10) {
                xVar.f51429e0.m(false);
                p01Var.invalidate();
                ArrayList arrayList = p01Var.f52407i3;
                p01Var.g1();
                xVar.f51434g0.b();
                xVar.sendAccessibilityEvent(32);
                vi0Var.setImportantForAccessibility(4);
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
                if (vi0Var.getPullingLeftProgress() > 0.0f) {
                    vi0Var.P0 = false;
                    ValueAnimator valueAnimator = vi0Var.f40684z0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    vi0Var.C0 = 0.0f;
                    ai.k0 k0Var = vi0Var.T;
                    if (k0Var != null) {
                        k0Var.invalidate();
                    }
                    vi0Var.invalidate();
                } else {
                    vi0Var.P0 = true;
                    ValueAnimator valueAnimator2 = vi0Var.f40684z0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    vi0Var.C0 = 0.0f;
                    ai.k0 k0Var2 = vi0Var.T;
                    if (k0Var2 != null) {
                        k0Var2.invalidate();
                    }
                    vi0Var.invalidate();
                }
                f01 f01Var = xVar.f51440j0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    t01 t01Var = (t01) arrayList.get(i10);
                    for (int i11 = 0; i11 < t01Var.P.size(); i11++) {
                        if (((b11) t01Var.P.get(i11)).f45722b) {
                            ((b11) t01Var.P.get(i11)).f45722b = false;
                            ((b11) t01Var.P.get(i11)).invalidate();
                            t01Var.k();
                        }
                    }
                }
                p01Var.invalidate();
                for (int i12 = 0; i12 < f01Var.f52407i3.size(); i12++) {
                    t01 t01Var2 = (t01) f01Var.f52407i3.get(i12);
                    for (int i13 = 0; i13 < t01Var2.P.size(); i13++) {
                        if (((b11) t01Var2.P.get(i13)).f45722b) {
                            ((b11) t01Var2.P.get(i13)).f45722b = false;
                            ((b11) t01Var2.P.get(i13)).invalidate();
                            t01Var2.k();
                        }
                    }
                }
                f01Var.invalidate();
                b0Var.i();
                b0Var.f5297a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof b11) {
            ((b11) view).setAnimatedScale(f10);
        } else if (view instanceof hv) {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i7;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i10 = this.f5318y;
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
        x xVar = this.f5307m;
        int i10 = this.f5318y;
        ai.k0 k0Var = this.f5299c;
        int[] iArr = this.A;
        a0 a0Var = this.f5297a;
        RectF rectF = this.f5301f;
        vi0 vi0Var = this.f5308n;
        rectF.set(vi0Var.f40680x);
        this.f5300e = vi0Var.E;
        int[] iArr2 = new int[2];
        if (z10) {
            vi0Var.getLocationOnScreen(iArr);
        }
        k0Var.getLocationOnScreen(iArr2);
        int L = ((iArr[1] - iArr2[1]) - org.telegram.messenger.g0.L(44.0f)) - org.telegram.messenger.g0.L(52.0f);
        if (xVar.P0) {
            i7 = org.telegram.messenger.g0.L(26.0f);
        } else {
            i7 = 0;
        }
        float topOffset = vi0Var.getTopOffset() + (L - i7);
        if (vi0Var.G0) {
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
            this.f5314t = a0Var.getTranslationY();
        } else {
            this.f5314t = topOffset;
            a0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - a0Var.getX();
        this.f5302g = x10;
        float y10 = (iArr[r18] - iArr2[r18]) - a0Var.getY();
        this.h = y10;
        rectF.offset(x10, y10);
        vi0Var.setCustomEmojiEnterProgress(this.f5304j);
        if (z10) {
            if (bz.o() >= 2 && pc.e(8200)) {
                z14 = r18;
            } else {
                z14 = false;
            }
            this.f5316w = z14;
            this.f5305k = false;
        } else {
            this.f5316w = false;
        }
        if (this.f5316w) {
            z11 = r18;
            j(z11, 0.0f);
        } else {
            z11 = r18;
        }
        k();
        xVar.setEnterAnimationInProgress(z11);
        lv lvVar = xVar.f51429e0;
        if (z10 && this.f5316w) {
            z12 = true;
        } else {
            z12 = false;
        }
        lvVar.m(z12);
        this.B.d();
        ValueAnimator valueAnimator2 = this.f5317x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f11 = this.f5304j;
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
            timeAnimator.f38562a = 0;
            timeAnimator.f38563b = 0;
            timeAnimator.setFloatValues(new float[]{f11, f10});
            valueAnimator = timeAnimator;
        }
        this.f5317x = valueAnimator;
        valueAnimator.addUpdateListener(new v(0, this, z10));
        if (!z10) {
            i();
        }
        this.f5317x.addListener(new e7(1, this, z10));
        if (i10 == 4) {
            this.f5317x.setDuration(420L);
            this.f5317x.setInterpolator(lr.h);
        } else if (this.f5316w) {
            this.f5317x.setDuration(450L);
            org.telegram.ui.Cells.c0.q(0.5f, this.f5317x);
        } else {
            this.f5317x.setDuration(350L);
            this.f5317x.setInterpolator(lr.f37208f);
        }
        a0Var.invalidate();
        h(true);
        if (!z10) {
            vi0Var.P0 = true;
            vi0Var.invalidate();
            this.f5317x.setStartDelay(30L);
            this.f5317x.start();
        } else {
            vi0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f5317x;
            Objects.requireNonNull(valueAnimator3);
            ca.r rVar = new ca.r(valueAnimator3, 3);
            f0.f5357f = this.f5316w;
            f0.f5356e = true;
            f0.f5358g = false;
            if (f0.d) {
                f0.d = false;
            }
            f0.f5355c = rVar;
        }
        HashSet hashSet = f0.f5353a;
        com.google.android.gms.internal.cast.b0 b0Var = ec.D().f23692p;
        if (((CountDownLatch) b0Var.f6490c) == null) {
            z13 = true;
            b0Var.f6490c = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        f0.f5354b = z13;
        f0.f5356e = false;
        f0.f5358g = false;
    }

    public final void d() {
        if (!this.f5311q) {
            vi0 vi0Var = this.f5308n;
            if (vi0Var != null) {
                ValueAnimator valueAnimator = vi0Var.f40684z0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                vi0Var.C0 = 0.0f;
                ai.k0 k0Var = vi0Var.T;
                if (k0Var != null) {
                    k0Var.invalidate();
                }
                vi0Var.invalidate();
            }
            gc.e();
            this.f5311q = true;
            org.telegram.messenger.g0.v1(this.f5299c);
            c(false);
            if (this.v) {
                h2 h2Var = this.f5312r;
                if (h2Var instanceof bn) {
                    ((bn) h2Var).wa(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f5311q) {
            gc.e();
            this.f5311q = true;
            ai.k0 k0Var = this.f5299c;
            org.telegram.messenger.g0.v1(k0Var);
            k0Var.animate().alpha(0.0f).setDuration(150L).setListener(new z(this, 1));
            if (this.v) {
                h2 h2Var = this.f5312r;
                if (h2Var instanceof bn) {
                    ((bn) h2Var).wa(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f5318y != 5) {
            ks.e().k(ks.f25142k1, 7);
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
        x xVar = this.f5307m;
        xVar.f51438i0.setLayerType(i7, null);
        xVar.f51434g0.setLayerType(i7, null);
        if (this.f5316w) {
            for (int i10 = 0; i10 < Math.min(xVar.f51429e0.f36144b.getChildCount(), 16); i10++) {
                xVar.f51429e0.f36144b.getChildAt(i10).setLayerType(i7, null);
            }
            return;
        }
        xVar.f51432f0.setLayerType(i7, null);
        xVar.f51429e0.setLayerType(i7, null);
    }

    public final void i() {
        int i7 = 0;
        while (true) {
            x xVar = this.f5307m;
            p01 p01Var = xVar.f51438i0;
            p01 p01Var2 = xVar.f51438i0;
            if (i7 < p01Var.getChildCount()) {
                if (p01Var2.getChildAt(i7) instanceof b11) {
                    b11 b11Var = (b11) p01Var2.getChildAt(i7);
                    if (b11Var.f45731y != null) {
                        b11Var.f45722b = false;
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
        x xVar = this.f5307m;
        float y10 = xVar.getY();
        m01 m01Var = xVar.f51421b0;
        float y11 = m01Var.getY() + y10;
        p01 p01Var = xVar.f51438i0;
        int y12 = (int) (p01Var.getY() + y11);
        ArrayList arrayList = null;
        int i7 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = p01Var.getChildCount();
            rectF = this.f5303i;
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
        int y13 = (int) (xVar.f51429e0.getY() + m01Var.getY() + xVar.getY());
        for (int i10 = 0; i10 < xVar.f51429e0.f36144b.getChildCount(); i10++) {
            View childAt2 = xVar.f51429e0.f36144b.getChildAt(i10);
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
            xVar.f51444l0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new w(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 1));
            if (this.f5318y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(lr.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f5316w) {
            x xVar = this.f5307m;
            xVar.f51434g0.setAlpha(this.f5304j);
            xVar.f51438i0.setAlpha(this.f5304j);
            xVar.f51440j0.setAlpha(this.f5304j);
            xVar.f51429e0.setAlpha(this.f5304j);
            xVar.f51432f0.setAlpha(this.f5304j);
        }
    }

    public final void l() {
        float f10;
        x xVar = this.f5307m;
        m01 m01Var = xVar.f51421b0;
        m01 m01Var2 = xVar.f51421b0;
        boolean z10 = this.f5316w;
        a0 a0Var = this.f5297a;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = a0Var.f5286f;
        }
        m01Var.setTranslationX(f10);
        m01Var2.setTranslationY(a0Var.h);
        m01Var2.setPivotX(a0Var.f5288r);
        m01Var2.setPivotY(a0Var.f5289s);
        m01Var2.setScaleX(a0Var.f5287n);
        m01Var2.setScaleY(a0Var.f5287n);
    }
}
