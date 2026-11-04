package dh;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import b8.mf;
import ci.d1;
import ci.uc;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.az;
import org.telegram.messenger.hs;
import org.telegram.messenger.lc;
import org.telegram.messenger.zb;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zu;
import org.telegram.ui.b01;
import org.telegram.ui.e01;
import org.telegram.ui.i01;
import org.telegram.ui.q01;
import org.telegram.ui.uz0;
import org.telegram.ui.wm;
public final class a0 {
    public final int[] A;
    public final g2.g B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final z f8931a;
    public final WindowManager f8932b;
    public final ai.c0 f8933c;
    public final boolean d;
    public float f8934e;
    public float f8936g;
    public float h;
    public float f8938j;
    public boolean f8939k;
    public boolean f8940l;
    public final v f8941m;
    public final li0 f8942n;
    public final List f8943o;
    public jb0 f8944p;
    public boolean f8945q;
    public final d2 f8946r;
    public final e6 f8947s;
    public float f8948t;
    public float f8949u;
    public boolean v;
    public boolean f8950w;
    public ValueAnimator f8951x;
    public final int f8952y;
    public gh.g f8953z;
    public final RectF f8935f = new RectF();
    public final RectF f8937i = new RectF();

    public a0(int i3, d2 d2Var, ArrayList arrayList, HashSet hashSet, li0 li0Var, e6 e6Var, boolean z10) {
        Context context;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        new Path();
        this.A = new int[2];
        this.B = new g2.g((int[]) null);
        this.D = new HashSet();
        this.E = new ArrayList();
        this.F = 0;
        this.f8952y = i3;
        this.f8943o = arrayList;
        this.f8946r = d2Var;
        this.f8947s = e6Var;
        if (d2Var != null) {
            context = d2Var.getContext();
        } else {
            context = li0Var.getContext();
        }
        Context context2 = context;
        ai.c0 c0Var = new ai.c0(this, context2);
        this.f8933c = c0Var;
        c0Var.setOnClickListener(new ai.b(this, 16));
        if (i3 != 2 && i3 != 4 && i3 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        z zVar = new z(this, context2);
        this.f8931a = zVar;
        int windowType = li0Var.getWindowType();
        boolean z13 = z11;
        if (i3 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        v vVar = new v(this, d2Var, context2, windowType, z12, e6Var, li0Var, d2Var);
        this.f8941m = vVar;
        vVar.setOutlineProvider(new w(this));
        vVar.setClipToOutline(true);
        boolean z14 = li0Var.f35753h1;
        boolean z15 = li0Var.f35755i1;
        if (vVar.M1 != z14) {
            vVar.M1 = z14;
            vVar.N1 = z15;
            e01 e01Var = vVar.f45456i0;
            if (e01Var != null) {
                e01Var.invalidate();
            }
            uz0 uz0Var = vVar.f45458j0;
            if (uz0Var != null) {
                uz0Var.invalidate();
            }
        }
        vVar.setOnLongPressedListener(new bb.c(li0Var, 18));
        vVar.setOnRecentClearedListener(new ra.e(5));
        vVar.setRecentReactions(arrayList);
        vVar.setSelectedReactions(hashSet);
        vVar.setDrawBackground(false);
        vVar.s(null);
        zVar.addView(vVar, mf.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        if (i3 == 5) {
            i10 = 2;
        } else {
            i10 = 16;
        }
        if (i3 == 5) {
            zVar.setClipChildren(false);
            zVar.setClipToPadding(false);
            c0Var.setClipChildren(false);
            c0Var.setClipToPadding(false);
        }
        if (i3 == 5) {
            i11 = 85;
        } else {
            i11 = 48;
        }
        float f10 = i10;
        c0Var.addView(zVar, mf.d(-1, -1.0f, i11, f10, f10, f10, 16.0f));
        c0Var.setClipChildren(false);
        if (i3 == 1 || (li0Var.getDelegate() != null && li0Var.getDelegate().O())) {
            vVar.setBackgroundDelegate(new ai.n(12, this, li0Var));
        }
        if (z13) {
            ((ViewGroup) li0Var.getParent()).addView(c0Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = org.telegram.messenger.g0.W(context2).getWindowManager();
            this.f8932b = windowManager;
            org.telegram.messenger.g0.y3(windowManager, c0Var, b10);
            windowManager.addView(c0Var, b10);
        }
        this.f8942n = li0Var;
        li0Var.setOnSwitchedToLoopView(new s(this, 0));
        li0Var.f35743d1 = true;
        li0Var.invalidate();
        org.telegram.messenger.g0.i3(new ci.e0(23, this, li0Var), 50L);
        if (i3 != 5) {
            hs.e().k(hs.f23249j1, 7);
        }
    }

    public static void a(a0 a0Var, boolean z10) {
        View view;
        li0 li0Var = a0Var.f8942n;
        v vVar = a0Var.f8941m;
        if (a0Var.E.isEmpty()) {
            a0Var.h(false);
            d0.a();
            a0Var.B.e();
            vVar.setEnterAnimationInProgress(false);
            e01 e01Var = vVar.f45456i0;
            if (z10) {
                vVar.f45447e0.m(false);
                e01Var.invalidate();
                ArrayList arrayList = e01Var.i3;
                e01Var.g1();
                vVar.f45452g0.b();
                vVar.sendAccessibilityEvent(32);
                li0Var.setImportantForAccessibility(4);
                int i3 = 0;
                while (true) {
                    if (i3 < e01Var.getChildCount()) {
                        if (e01Var.getChildAt(i3) instanceof q01) {
                            view = e01Var.getChildAt(i3);
                            break;
                        }
                        i3++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    view.performAccessibilityAction(64, null);
                } else {
                    vVar.performAccessibilityAction(64, null);
                }
                if (li0Var.getPullingLeftProgress() > 0.0f) {
                    li0Var.P0 = false;
                    ValueAnimator valueAnimator = li0Var.f35779z0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    li0Var.C0 = 0.0f;
                    ai.c0 c0Var = li0Var.T;
                    if (c0Var != null) {
                        c0Var.invalidate();
                    }
                    li0Var.invalidate();
                } else {
                    li0Var.P0 = true;
                    ValueAnimator valueAnimator2 = li0Var.f35779z0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    li0Var.C0 = 0.0f;
                    ai.c0 c0Var2 = li0Var.T;
                    if (c0Var2 != null) {
                        c0Var2.invalidate();
                    }
                    li0Var.invalidate();
                }
                uz0 uz0Var = vVar.f45458j0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    i01 i01Var = (i01) arrayList.get(i10);
                    for (int i11 = 0; i11 < i01Var.P.size(); i11++) {
                        if (((q01) i01Var.P.get(i11)).f48718b) {
                            ((q01) i01Var.P.get(i11)).f48718b = false;
                            ((q01) i01Var.P.get(i11)).invalidate();
                            i01Var.k();
                        }
                    }
                }
                e01Var.invalidate();
                for (int i12 = 0; i12 < uz0Var.i3.size(); i12++) {
                    i01 i01Var2 = (i01) uz0Var.i3.get(i12);
                    for (int i13 = 0; i13 < i01Var2.P.size(); i13++) {
                        if (((q01) i01Var2.P.get(i13)).f48718b) {
                            ((q01) i01Var2.P.get(i13)).f48718b = false;
                            ((q01) i01Var2.P.get(i13)).invalidate();
                            i01Var2.k();
                        }
                    }
                }
                uz0Var.invalidate();
                a0Var.i();
                a0Var.f8931a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof q01) {
            ((q01) view).setAnimatedScale(f10);
        } else if (view instanceof vu) {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i3;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i10 = this.f8952y;
        if (i10 != 0 && i10 != 3) {
            i3 = 99;
        } else {
            i3 = 1000;
        }
        layoutParams.type = i3;
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
        int i3;
        ?? r18;
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        boolean z13;
        boolean z14;
        v vVar = this.f8941m;
        int i10 = this.f8952y;
        ai.c0 c0Var = this.f8933c;
        int[] iArr = this.A;
        z zVar = this.f8931a;
        RectF rectF = this.f8935f;
        li0 li0Var = this.f8942n;
        rectF.set(li0Var.f35775x);
        this.f8934e = li0Var.E;
        int[] iArr2 = new int[2];
        if (z10) {
            li0Var.getLocationOnScreen(iArr);
        }
        c0Var.getLocationOnScreen(iArr2);
        int L = ((iArr[1] - iArr2[1]) - org.telegram.messenger.g0.L(44.0f)) - org.telegram.messenger.g0.L(52.0f);
        if (vVar.P0) {
            i3 = org.telegram.messenger.g0.L(26.0f);
        } else {
            i3 = 0;
        }
        float topOffset = li0Var.getTopOffset() + (L - i3);
        if (li0Var.G0) {
            topOffset = (iArr[1] - iArr2[1]) - org.telegram.messenger.g0.L(12.0f);
        }
        if (zVar.getMeasuredHeight() + topOffset > c0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) {
            topOffset = (c0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) - zVar.getMeasuredHeight();
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
            zVar.setTranslationX(((c0Var.getMeasuredWidth() - zVar.getMeasuredWidth()) / 2.0f) - org.telegram.messenger.g0.L(16.0f));
        } else {
            boolean z15 = true;
            if (i10 != 2 && i10 != 4) {
                zVar.setTranslationX((iArr[0] - iArr2[0]) - org.telegram.messenger.g0.L(2.0f));
                r18 = z15;
            } else {
                zVar.setTranslationX((iArr[0] - iArr2[0]) - org.telegram.messenger.g0.L(18.0f));
                r18 = z15;
            }
        }
        if (!z10) {
            this.f8948t = zVar.getTranslationY();
        } else {
            this.f8948t = topOffset;
            zVar.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - zVar.getX();
        this.f8936g = x10;
        float y9 = (iArr[r18] - iArr2[r18]) - zVar.getY();
        this.h = y9;
        rectF.offset(x10, y9);
        li0Var.setCustomEmojiEnterProgress(this.f8938j);
        if (z10) {
            if (az.o() >= 2 && lc.e(8200)) {
                z14 = r18;
            } else {
                z14 = false;
            }
            this.f8950w = z14;
            this.f8939k = false;
        } else {
            this.f8950w = false;
        }
        if (this.f8950w) {
            z11 = r18;
            j(z11, 0.0f);
        } else {
            z11 = r18;
        }
        k();
        vVar.setEnterAnimationInProgress(z11);
        zu zuVar = vVar.f45447e0;
        if (z10 && this.f8950w) {
            z12 = true;
        } else {
            z12 = false;
        }
        zuVar.m(z12);
        this.B.d();
        ValueAnimator valueAnimator2 = this.f8951x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f11 = this.f8938j;
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
            timeAnimator.f33867a = 0;
            timeAnimator.f33868b = 0;
            timeAnimator.setFloatValues(new float[]{f11, f10});
            valueAnimator = timeAnimator;
        }
        this.f8951x = valueAnimator;
        valueAnimator.addUpdateListener(new u(0, this, z10));
        if (!z10) {
            i();
        }
        this.f8951x.addListener(new x(0, this, z10));
        if (i10 == 4) {
            this.f8951x.setDuration(420L);
            this.f8951x.setInterpolator(xq.h);
        } else if (this.f8950w) {
            this.f8951x.setDuration(450L);
            org.telegram.messenger.camera.q.i(0.5f, this.f8951x);
        } else {
            this.f8951x.setDuration(350L);
            this.f8951x.setInterpolator(xq.f40452f);
        }
        zVar.invalidate();
        h(true);
        if (!z10) {
            li0Var.P0 = true;
            li0Var.invalidate();
            this.f8951x.setStartDelay(30L);
            this.f8951x.start();
        } else {
            li0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f8951x;
            Objects.requireNonNull(valueAnimator3);
            d1 d1Var = new d1(valueAnimator3, 16);
            d0.f8986f = this.f8950w;
            d0.f8985e = true;
            d0.f8987g = false;
            if (d0.d) {
                d0.d = false;
            }
            d0.f8984c = d1Var;
        }
        HashSet hashSet = d0.f8982a;
        com.google.android.gms.internal.cast.c0 c0Var2 = zb.D().f26770p;
        if (((CountDownLatch) c0Var2.f6883c) == null) {
            z13 = true;
            c0Var2.f6883c = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        d0.f8983b = z13;
        d0.f8985e = false;
        d0.f8987g = false;
    }

    public final void d() {
        if (!this.f8945q) {
            li0 li0Var = this.f8942n;
            if (li0Var != null) {
                ValueAnimator valueAnimator = li0Var.f35779z0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                li0Var.C0 = 0.0f;
                ai.c0 c0Var = li0Var.T;
                if (c0Var != null) {
                    c0Var.invalidate();
                }
                li0Var.invalidate();
            }
            ac.e();
            this.f8945q = true;
            org.telegram.messenger.g0.v1(this.f8933c);
            c(false);
            if (this.v) {
                d2 d2Var = this.f8946r;
                if (d2Var instanceof wm) {
                    ((wm) d2Var).ta(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f8945q) {
            ac.e();
            this.f8945q = true;
            ai.c0 c0Var = this.f8933c;
            org.telegram.messenger.g0.v1(c0Var);
            c0Var.animate().alpha(0.0f).setDuration(150L).setListener(new y(this, 1));
            if (this.v) {
                d2 d2Var = this.f8946r;
                if (d2Var instanceof wm) {
                    ((wm) d2Var).ta(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f8952y != 5) {
            hs.e().k(hs.k1, 7);
        }
        org.telegram.messenger.g0.h3(new s(this, 1));
    }

    public final void h(boolean z10) {
        int i3;
        if (z10) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        v vVar = this.f8941m;
        vVar.f45456i0.setLayerType(i3, null);
        vVar.f45452g0.setLayerType(i3, null);
        if (this.f8950w) {
            for (int i10 = 0; i10 < Math.min(vVar.f45447e0.f41058b.getChildCount(), 16); i10++) {
                vVar.f45447e0.f41058b.getChildAt(i10).setLayerType(i3, null);
            }
            return;
        }
        vVar.f45450f0.setLayerType(i3, null);
        vVar.f45447e0.setLayerType(i3, null);
    }

    public final void i() {
        int i3 = 0;
        while (true) {
            v vVar = this.f8941m;
            e01 e01Var = vVar.f45456i0;
            e01 e01Var2 = vVar.f45456i0;
            if (i3 < e01Var.getChildCount()) {
                if (e01Var2.getChildAt(i3) instanceof q01) {
                    q01 q01Var = (q01) e01Var2.getChildAt(i3);
                    if (q01Var.f48727y != null) {
                        q01Var.f48718b = false;
                        q01Var.invalidate();
                    }
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public final void j(boolean z10, float f10) {
        RectF rectF;
        HashSet hashSet;
        v vVar = this.f8941m;
        float y9 = vVar.getY();
        b01 b01Var = vVar.f45439b0;
        float y10 = b01Var.getY() + y9;
        e01 e01Var = vVar.f45456i0;
        int y11 = (int) (e01Var.getY() + y10);
        ArrayList arrayList = null;
        int i3 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = e01Var.getChildCount();
            rectF = this.f8937i;
            hashSet = this.D;
            if (i3 >= childCount) {
                break;
            }
            View childAt = e01Var.getChildAt(i3);
            if (!hashSet.contains(childAt)) {
                float measuredHeight = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop() + y11;
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
            i3++;
        }
        int y12 = (int) (vVar.f45447e0.getY() + b01Var.getY() + vVar.getY());
        for (int i10 = 0; i10 < vVar.f45447e0.f41058b.getChildCount(); i10++) {
            View childAt2 = vVar.f45447e0.f41058b.getChildAt(i10);
            if (!hashSet.contains(childAt2)) {
                float measuredHeight2 = (childAt2.getMeasuredHeight() / 2.0f) + childAt2.getTop() + y12;
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
            vVar.f45461l0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new uc(1, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 3));
            if (this.f8952y == 4) {
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
        if (!this.f8950w) {
            v vVar = this.f8941m;
            vVar.f45452g0.setAlpha(this.f8938j);
            vVar.f45456i0.setAlpha(this.f8938j);
            vVar.f45458j0.setAlpha(this.f8938j);
            vVar.f45447e0.setAlpha(this.f8938j);
            vVar.f45450f0.setAlpha(this.f8938j);
        }
    }

    public final void l() {
        float f10;
        v vVar = this.f8941m;
        b01 b01Var = vVar.f45439b0;
        b01 b01Var2 = vVar.f45439b0;
        boolean z10 = this.f8950w;
        z zVar = this.f8931a;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = zVar.f9173f;
        }
        b01Var.setTranslationX(f10);
        b01Var2.setTranslationY(zVar.h);
        b01Var2.setPivotX(zVar.f9175r);
        b01Var2.setPivotY(zVar.f9176s);
        b01Var2.setScaleX(zVar.f9174n);
        b01Var2.setScaleY(zVar.f9174n);
    }
}
