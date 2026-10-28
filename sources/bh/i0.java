package bh;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.kw;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.c51;
import org.telegram.ui.d3;
import org.telegram.ui.g51;
import org.telegram.ui.o51;
import org.telegram.ui.s41;
import org.telegram.ui.wn;
import org.telegram.ui.z41;
public final class i0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final h0 f4047a;
    public final WindowManager f4048b;
    public final p f4049c;
    public final boolean d;
    public float e;
    public float f4051g;
    public float h;
    public float f4053j;
    public boolean f4054k;
    public boolean f4055l;
    public final d0 f4056m;
    public final gl0 f4057n;
    public final List f4058o;
    public xa0 f4059p;
    public boolean f4060q;
    public final r2 f4061r;
    public final u6 f4062s;
    public float f4063t;
    public float f4064u;
    public boolean v;
    public boolean f4065w;
    public ValueAnimator f4066x;
    public final int f4067y;
    public eh.d f4068z;
    public final RectF f4050f = new RectF();
    public final RectF f4052i = new RectF();

    public i0(int i10, r2 r2Var, ArrayList arrayList, HashSet hashSet, gl0 gl0Var, u6 u6Var, boolean z10) {
        Context context;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        new Path();
        this.A = new int[2];
        this.B = new AnimationNotificationsLocker();
        this.D = new HashSet();
        this.E = new ArrayList();
        this.F = 0;
        this.f4067y = i10;
        this.f4058o = arrayList;
        this.f4061r = r2Var;
        this.f4062s = u6Var;
        if (r2Var != null) {
            context = r2Var.getContext();
        } else {
            context = gl0Var.getContext();
        }
        Context context2 = context;
        p pVar = new p(this, context2);
        this.f4049c = pVar;
        pVar.setOnClickListener(new ai.s(this, 2));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        h0 h0Var = new h0(this, context2);
        this.f4047a = h0Var;
        int windowType = gl0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        d0 d0Var = new d0(this, r2Var, context2, windowType, z12, u6Var, gl0Var, r2Var);
        this.f4056m = d0Var;
        d0Var.setOutlineProvider(new e0(this));
        d0Var.setClipToOutline(true);
        boolean z14 = gl0Var.f28623g1;
        boolean z15 = gl0Var.f28625h1;
        if (d0Var.L1 != z14) {
            d0Var.L1 = z14;
            d0Var.M1 = z15;
            c51 c51Var = d0Var.f39202h0;
            if (c51Var != null) {
                c51Var.invalidate();
            }
            s41 s41Var = d0Var.f39204i0;
            if (s41Var != null) {
                s41Var.invalidate();
            }
        }
        d0Var.setOnLongPressedListener(new za.c(gl0Var, 7));
        d0Var.setOnRecentClearedListener(new tb.a(3));
        d0Var.setRecentReactions(arrayList);
        d0Var.setSelectedReactions(hashSet);
        d0Var.setDrawBackground(false);
        d0Var.s(null);
        h0Var.addView(d0Var, kb1.h(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 5) {
            i11 = 2;
        } else {
            i11 = 16;
        }
        if (i10 == 5) {
            h0Var.setClipChildren(false);
            h0Var.setClipToPadding(false);
            pVar.setClipChildren(false);
            pVar.setClipToPadding(false);
        }
        if (i10 == 5) {
            i12 = 85;
        } else {
            i12 = 48;
        }
        float f7 = i11;
        pVar.addView(h0Var, kb1.h(-1, -1.0f, i12, f7, f7, f7, 16.0f));
        pVar.setClipChildren(false);
        if (i10 == 1 || (gl0Var.getDelegate() != null && gl0Var.getDelegate().o())) {
            d0Var.setBackgroundDelegate(new ai.f0(2, this, gl0Var));
        }
        if (z13) {
            ((ViewGroup) gl0Var.getParent()).addView(pVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f4048b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, pVar, b10);
            windowManager.addView(pVar, b10);
        }
        this.f4057n = gl0Var;
        gl0Var.setOnSwitchedToLoopView(new y(this, 0));
        gl0Var.f28614c1 = true;
        gl0Var.invalidate();
        AndroidUtilities.runOnUIThread(new a1.f(24, this, gl0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(i0 i0Var, boolean z10) {
        View view;
        gl0 gl0Var = i0Var.f4057n;
        d0 d0Var = i0Var.f4056m;
        if (i0Var.E.isEmpty()) {
            i0Var.h(false);
            m0.a();
            i0Var.B.unlock();
            d0Var.setEnterAnimationInProgress(false);
            c51 c51Var = d0Var.f39202h0;
            if (z10) {
                d0Var.f39193d0.m(false);
                c51Var.invalidate();
                ArrayList arrayList = c51Var.f39788i3;
                c51Var.g1();
                d0Var.f39198f0.b();
                d0Var.sendAccessibilityEvent(32);
                gl0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < c51Var.getChildCount()) {
                        if (c51Var.getChildAt(i10) instanceof o51) {
                            view = c51Var.getChildAt(i10);
                            break;
                        }
                        i10++;
                    } else {
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    view.performAccessibilityAction(64, null);
                } else {
                    d0Var.performAccessibilityAction(64, null);
                }
                if (gl0Var.getPullingLeftProgress() > 0.0f) {
                    gl0Var.O0 = false;
                    ValueAnimator valueAnimator = gl0Var.f28650y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    gl0Var.B0 = 0.0f;
                    p pVar = gl0Var.S;
                    if (pVar != null) {
                        pVar.invalidate();
                    }
                    gl0Var.invalidate();
                } else {
                    gl0Var.O0 = true;
                    ValueAnimator valueAnimator2 = gl0Var.f28650y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    gl0Var.B0 = 0.0f;
                    p pVar2 = gl0Var.S;
                    if (pVar2 != null) {
                        pVar2.invalidate();
                    }
                    gl0Var.invalidate();
                }
                s41 s41Var = d0Var.f39204i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    g51 g51Var = (g51) arrayList.get(i11);
                    for (int i12 = 0; i12 < g51Var.O.size(); i12++) {
                        if (((o51) g51Var.O.get(i12)).f41975b) {
                            ((o51) g51Var.O.get(i12)).f41975b = false;
                            ((o51) g51Var.O.get(i12)).invalidate();
                            g51Var.k();
                        }
                    }
                }
                c51Var.invalidate();
                for (int i13 = 0; i13 < s41Var.f39788i3.size(); i13++) {
                    g51 g51Var2 = (g51) s41Var.f39788i3.get(i13);
                    for (int i14 = 0; i14 < g51Var2.O.size(); i14++) {
                        if (((o51) g51Var2.O.get(i14)).f41975b) {
                            ((o51) g51Var2.O.get(i14)).f41975b = false;
                            ((o51) g51Var2.O.get(i14)).invalidate();
                            g51Var2.k();
                        }
                    }
                }
                s41Var.invalidate();
                i0Var.i();
                i0Var.f4047a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof o51) {
            ((o51) view).setAnimatedScale(f7);
        } else if (view instanceof gw) {
            view.setScaleX(f7);
            view.setScaleY(f7);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i11 = this.f4067y;
        if (i11 != 0 && i11 != 3) {
            i10 = 99;
        } else {
            i10 = 1000;
        }
        layoutParams.type = i10;
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
        int i10;
        ?? r18;
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        boolean z13;
        boolean z14;
        d0 d0Var = this.f4056m;
        int i11 = this.f4067y;
        p pVar = this.f4049c;
        int[] iArr = this.A;
        h0 h0Var = this.f4047a;
        RectF rectF = this.f4050f;
        gl0 gl0Var = this.f4057n;
        rectF.set(gl0Var.f28645w);
        this.e = gl0Var.f28649y;
        int[] iArr2 = new int[2];
        if (z10) {
            gl0Var.getLocationOnScreen(iArr);
        }
        pVar.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (d0Var.O0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = gl0Var.getTopOffset() + (dp - i10);
        if (gl0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (h0Var.getMeasuredHeight() + topOffset > pVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (pVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - h0Var.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        float f7 = 0.0f;
        if (i11 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i11 == 1) {
            r18 = 1;
            h0Var.setTranslationX(((pVar.getMeasuredWidth() - h0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            boolean z15 = true;
            if (i11 != 2 && i11 != 4) {
                h0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
                r18 = z15;
            } else {
                h0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
                r18 = z15;
            }
        }
        if (!z10) {
            this.f4063t = h0Var.getTranslationY();
        } else {
            this.f4063t = topOffset;
            h0Var.setTranslationY(topOffset);
        }
        float x9 = (iArr[0] - iArr2[0]) - h0Var.getX();
        this.f4051g = x9;
        float y3 = (iArr[r18] - iArr2[r18]) - h0Var.getY();
        this.h = y3;
        rectF.offset(x9, y3);
        gl0Var.setCustomEmojiEnterProgress(this.f4053j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = r18;
            } else {
                z14 = false;
            }
            this.f4065w = z14;
            this.f4054k = false;
        } else {
            this.f4065w = false;
        }
        if (this.f4065w) {
            z11 = r18;
            j(0.0f, z11);
        } else {
            z11 = r18;
        }
        k();
        d0Var.setEnterAnimationInProgress(z11);
        kw kwVar = d0Var.f39193d0;
        if (z10 && this.f4065w) {
            z12 = true;
        } else {
            z12 = false;
        }
        kwVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f4066x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f4053j;
        if (i11 == 4) {
            if (z10) {
                f7 = 1.0f;
            }
            valueAnimator = ValueAnimator.ofFloat(f10, f7);
        } else {
            if (z10) {
                f7 = 1.0f;
            }
            ?? timeAnimator = new TimeAnimator();
            timeAnimator.f30047a = 0;
            timeAnimator.f30048b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f4066x = valueAnimator;
        valueAnimator.addUpdateListener(new a0(0, this, z10));
        if (!z10) {
            i();
        }
        this.f4066x.addListener(new f0(0, this, z10));
        if (i11 == 4) {
            this.f4066x.setDuration(420L);
            this.f4066x.setInterpolator(ds.h);
        } else if (this.f4065w) {
            this.f4066x.setDuration(450L);
            d3.m(0.5f, this.f4066x);
        } else {
            this.f4066x.setDuration(350L);
            this.f4066x.setInterpolator(ds.f27530f);
        }
        h0Var.invalidate();
        h(true);
        if (!z10) {
            gl0Var.O0 = true;
            gl0Var.invalidate();
            this.f4066x.setStartDelay(30L);
            this.f4066x.start();
        } else {
            gl0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f4066x;
            Objects.requireNonNull(valueAnimator3);
            a3.d dVar = new a3.d(valueAnimator3, 14);
            m0.f4084f = this.f4065w;
            m0.e = true;
            m0.f4085g = false;
            if (m0.d) {
                m0.d = false;
            }
            m0.f4083c = dVar;
        }
        HashSet hashSet = m0.f4081a;
        jf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f15616b == null) {
            z13 = true;
            cacheOutQueue.f15616b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        m0.f4082b = z13;
        m0.e = false;
        m0.f4085g = false;
    }

    public final void d() {
        if (!this.f4060q) {
            gl0 gl0Var = this.f4057n;
            if (gl0Var != null) {
                ValueAnimator valueAnimator = gl0Var.f28650y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                gl0Var.B0 = 0.0f;
                p pVar = gl0Var.S;
                if (pVar != null) {
                    pVar.invalidate();
                }
                gl0Var.invalidate();
            }
            qc.e();
            this.f4060q = true;
            AndroidUtilities.hideKeyboard(this.f4049c);
            c(false);
            if (this.v) {
                r2 r2Var = this.f4061r;
                if (r2Var instanceof wn) {
                    ((wn) r2Var).ga(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f4060q) {
            qc.e();
            this.f4060q = true;
            p pVar = this.f4049c;
            AndroidUtilities.hideKeyboard(pVar);
            pVar.animate().alpha(0.0f).setDuration(150L).setListener(new g0(this, 1));
            if (this.v) {
                r2 r2Var = this.f4061r;
                if (r2Var instanceof wn) {
                    ((wn) r2Var).ga(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f4067y != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new y(this, 1));
    }

    public final void h(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        d0 d0Var = this.f4056m;
        d0Var.f39202h0.setLayerType(i10, null);
        d0Var.f39198f0.setLayerType(i10, null);
        if (this.f4065w) {
            for (int i11 = 0; i11 < Math.min(d0Var.f39193d0.f33435b.getChildCount(), 16); i11++) {
                d0Var.f39193d0.f33435b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        d0Var.f39195e0.setLayerType(i10, null);
        d0Var.f39193d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            d0 d0Var = this.f4056m;
            c51 c51Var = d0Var.f39202h0;
            c51 c51Var2 = d0Var.f39202h0;
            if (i10 < c51Var.getChildCount()) {
                if (c51Var2.getChildAt(i10) instanceof o51) {
                    o51 o51Var = (o51) c51Var2.getChildAt(i10);
                    if (o51Var.f41982x != null) {
                        o51Var.f41975b = false;
                        o51Var.invalidate();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void j(float f7, boolean z10) {
        RectF rectF;
        HashSet hashSet;
        d0 d0Var = this.f4056m;
        float y3 = d0Var.getY();
        z41 z41Var = d0Var.f39185a0;
        float y10 = z41Var.getY() + y3;
        c51 c51Var = d0Var.f39202h0;
        int y11 = (int) (c51Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = c51Var.getChildCount();
            rectF = this.f4052i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = c51Var.getChildAt(i10);
            if (!hashSet.contains(childAt)) {
                float measuredHeight = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop() + y11;
                if (measuredHeight < rectF.bottom && measuredHeight > rectF.top && f7 != 0.0f) {
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
            i10++;
        }
        int y12 = (int) (d0Var.f39193d0.getY() + z41Var.getY() + d0Var.getY());
        for (int i11 = 0; i11 < d0Var.f39193d0.f33435b.getChildCount(); i11++) {
            View childAt2 = d0Var.f39193d0.f33435b.getChildAt(i11);
            if (!hashSet.contains(childAt2)) {
                float measuredHeight2 = (childAt2.getMeasuredHeight() / 2.0f) + childAt2.getTop() + y12;
                if (measuredHeight2 < rectF.bottom && measuredHeight2 > rectF.top && f7 != 0.0f) {
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
            d0Var.f39208k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new b0(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new ai.l0(this, ofFloat, z10, 3));
            if (this.f4067y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(ds.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f4065w) {
            d0 d0Var = this.f4056m;
            d0Var.f39198f0.setAlpha(this.f4053j);
            d0Var.f39202h0.setAlpha(this.f4053j);
            d0Var.f39204i0.setAlpha(this.f4053j);
            d0Var.f39193d0.setAlpha(this.f4053j);
            d0Var.f39195e0.setAlpha(this.f4053j);
        }
    }

    public final void l() {
        float f7;
        d0 d0Var = this.f4056m;
        z41 z41Var = d0Var.f39185a0;
        z41 z41Var2 = d0Var.f39185a0;
        boolean z10 = this.f4065w;
        h0 h0Var = this.f4047a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = h0Var.f4040f;
        }
        z41Var.setTranslationX(f7);
        z41Var2.setTranslationY(h0Var.h);
        z41Var2.setPivotX(h0Var.f4042r);
        z41Var2.setPivotY(h0Var.f4043s);
        z41Var2.setScaleX(h0Var.f4041n);
        z41Var2.setScaleY(h0Var.f4041n);
    }
}
