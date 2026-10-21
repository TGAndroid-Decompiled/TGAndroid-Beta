package ah;

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
import org.telegram.messenger.mk;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.kw;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.g51;
import org.telegram.ui.k41;
import org.telegram.ui.qn;
import org.telegram.ui.r41;
import org.telegram.ui.u41;
import org.telegram.ui.y41;
import w7.z5;
public final class t0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final s0 f868a;
    public final WindowManager f869b;
    public final v f870c;
    public final boolean d;
    public float e;
    public float f872g;
    public float h;
    public float f874j;
    public boolean f875k;
    public boolean f876l;
    public final n0 f877m;
    public final dl0 f878n;
    public final List f879o;
    public rc0 f880p;
    public boolean f881q;
    public final n2 f882r;
    public final d6 f883s;
    public float f884t;
    public float f885u;
    public boolean v;
    public boolean f886w;
    public ValueAnimator f887x;
    public final int f888y;
    public dh.d f889z;
    public final RectF f871f = new RectF();
    public final RectF f873i = new RectF();

    public t0(int i10, n2 n2Var, ArrayList arrayList, HashSet hashSet, dl0 dl0Var, d6 d6Var, boolean z10) {
        Context context;
        boolean z11;
        boolean z12;
        int i11;
        new Path();
        this.A = new int[2];
        this.B = new AnimationNotificationsLocker();
        this.D = new HashSet();
        this.E = new ArrayList();
        this.F = 0;
        this.f888y = i10;
        this.f879o = arrayList;
        this.f882r = n2Var;
        this.f883s = d6Var;
        if (n2Var != null) {
            context = n2Var.getContext();
        } else {
            context = dl0Var.getContext();
        }
        Context context2 = context;
        v vVar = new v(this, context2);
        this.f870c = vVar;
        vVar.setOnClickListener(new g0(this, 0));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        s0 s0Var = new s0(this, context2);
        this.f868a = s0Var;
        int windowType = dl0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        n0 n0Var = new n0(this, n2Var, context2, windowType, z12, d6Var, dl0Var, n2Var);
        this.f877m = n0Var;
        n0Var.setOutlineProvider(new o0(this));
        n0Var.setClipToOutline(true);
        boolean z14 = dl0Var.f25537f1;
        boolean z15 = dl0Var.f25539g1;
        if (n0Var.K1 != z14) {
            n0Var.K1 = z14;
            n0Var.L1 = z15;
            u41 u41Var = n0Var.f43061h0;
            if (u41Var != null) {
                u41Var.invalidate();
            }
            k41 k41Var = n0Var.f43063i0;
            if (k41Var != null) {
                k41Var.invalidate();
            }
        }
        n0Var.setOnLongPressedListener(new ya.d(dl0Var, 2));
        n0Var.setOnRecentClearedListener(new sb.a(1));
        n0Var.setRecentReactions(arrayList);
        n0Var.setSelectedReactions(hashSet);
        n0Var.setDrawBackground(false);
        n0Var.s(null);
        s0Var.addView(n0Var, z5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i12 = i10 != 5 ? 16 : 2;
        if (i10 == 5) {
            s0Var.setClipChildren(false);
            s0Var.setClipToPadding(false);
            vVar.setClipChildren(false);
            vVar.setClipToPadding(false);
        }
        if (i10 == 5) {
            i11 = 85;
        } else {
            i11 = 48;
        }
        int i13 = i11;
        float f7 = i12;
        vVar.addView(s0Var, z5.d(-1, -1.0f, i13, f7, f7, f7, 16.0f));
        vVar.setClipChildren(false);
        if (i10 == 1 || (dl0Var.getDelegate() != null && dl0Var.getDelegate().w())) {
            n0Var.setBackgroundDelegate(new h0(0, this, dl0Var));
        }
        if (z13) {
            ((ViewGroup) dl0Var.getParent()).addView(vVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f869b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, vVar, b10);
            windowManager.addView(vVar, b10);
        }
        this.f878n = dl0Var;
        dl0Var.setOnSwitchedToLoopView(new i0(this, 0));
        dl0Var.f25527b1 = true;
        dl0Var.invalidate();
        AndroidUtilities.runOnUIThread(new a1.f(10, this, dl0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(t0 t0Var, boolean z10) {
        View view;
        dl0 dl0Var = t0Var.f878n;
        n0 n0Var = t0Var.f877m;
        if (t0Var.E.isEmpty()) {
            t0Var.h(false);
            x0.a();
            t0Var.B.unlock();
            n0Var.setEnterAnimationInProgress(false);
            u41 u41Var = n0Var.f43061h0;
            if (z10) {
                n0Var.f43052d0.m(false);
                u41Var.invalidate();
                ArrayList arrayList = u41Var.Y2;
                u41Var.f1();
                n0Var.f43057f0.b();
                n0Var.sendAccessibilityEvent(32);
                dl0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < u41Var.getChildCount()) {
                        if (u41Var.getChildAt(i10) instanceof g51) {
                            view = u41Var.getChildAt(i10);
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
                    n0Var.performAccessibilityAction(64, null);
                }
                if (dl0Var.getPullingLeftProgress() > 0.0f) {
                    dl0Var.O0 = false;
                    ValueAnimator valueAnimator = dl0Var.f25565y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    dl0Var.B0 = 0.0f;
                    v vVar = dl0Var.S;
                    if (vVar != null) {
                        vVar.invalidate();
                    }
                    dl0Var.invalidate();
                } else {
                    dl0Var.O0 = true;
                    ValueAnimator valueAnimator2 = dl0Var.f25565y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    dl0Var.B0 = 0.0f;
                    v vVar2 = dl0Var.S;
                    if (vVar2 != null) {
                        vVar2.invalidate();
                    }
                    dl0Var.invalidate();
                }
                k41 k41Var = n0Var.f43063i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    y41 y41Var = (y41) arrayList.get(i11);
                    for (int i12 = 0; i12 < y41Var.O.size(); i12++) {
                        if (((g51) y41Var.O.get(i12)).f37190b) {
                            ((g51) y41Var.O.get(i12)).f37190b = false;
                            ((g51) y41Var.O.get(i12)).invalidate();
                            y41Var.k();
                        }
                    }
                }
                u41Var.invalidate();
                for (int i13 = 0; i13 < k41Var.Y2.size(); i13++) {
                    y41 y41Var2 = (y41) k41Var.Y2.get(i13);
                    for (int i14 = 0; i14 < y41Var2.O.size(); i14++) {
                        if (((g51) y41Var2.O.get(i14)).f37190b) {
                            ((g51) y41Var2.O.get(i14)).f37190b = false;
                            ((g51) y41Var2.O.get(i14)).invalidate();
                            y41Var2.k();
                        }
                    }
                }
                k41Var.invalidate();
                t0Var.i();
                t0Var.f868a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof g51) {
            ((g51) view).setAnimatedScale(f7);
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
        int i11 = this.f888y;
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
        n0 n0Var = this.f877m;
        int i11 = this.f888y;
        v vVar = this.f870c;
        int[] iArr = this.A;
        s0 s0Var = this.f868a;
        RectF rectF = this.f871f;
        dl0 dl0Var = this.f878n;
        rectF.set(dl0Var.f25560w);
        this.e = dl0Var.f25564y;
        int[] iArr2 = new int[2];
        if (z10) {
            dl0Var.getLocationOnScreen(iArr);
        }
        vVar.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (n0Var.O0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = dl0Var.getTopOffset() + (dp - i10);
        if (dl0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (s0Var.getMeasuredHeight() + topOffset > vVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (vVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - s0Var.getMeasuredHeight();
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
            s0Var.setTranslationX(((vVar.getMeasuredWidth() - s0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            boolean z15 = true;
            if (i11 != 2 && i11 != 4) {
                s0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
                r18 = z15;
            } else {
                s0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
                r18 = z15;
            }
        }
        if (!z10) {
            this.f884t = s0Var.getTranslationY();
        } else {
            this.f884t = topOffset;
            s0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - s0Var.getX();
        this.f872g = x10;
        float y3 = (iArr[r18] - iArr2[r18]) - s0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        dl0Var.setCustomEmojiEnterProgress(this.f874j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = r18;
            } else {
                z14 = false;
            }
            this.f886w = z14;
            this.f875k = false;
        } else {
            this.f886w = false;
        }
        if (this.f886w) {
            z11 = r18;
            j(0.0f, z11);
        } else {
            z11 = r18;
        }
        k();
        n0Var.setEnterAnimationInProgress(z11);
        kw kwVar = n0Var.f43052d0;
        if (z10 && this.f886w) {
            z12 = true;
        } else {
            z12 = false;
        }
        kwVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f887x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f874j;
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
            timeAnimator.f33049a = 0;
            timeAnimator.f33050b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f887x = valueAnimator;
        valueAnimator.addUpdateListener(new k0(0, this, z10));
        if (!z10) {
            i();
        }
        this.f887x.addListener(new p0(0, this, z10));
        if (i11 == 4) {
            this.f887x.setDuration(420L);
            this.f887x.setInterpolator(bs.h);
        } else if (this.f886w) {
            this.f887x.setDuration(450L);
            mk.l(0.5f, this.f887x);
        } else {
            this.f887x.setDuration(350L);
            this.f887x.setInterpolator(bs.f25021f);
        }
        s0Var.invalidate();
        h(true);
        if (!z10) {
            dl0Var.O0 = true;
            dl0Var.invalidate();
            this.f887x.setStartDelay(30L);
            this.f887x.start();
        } else {
            dl0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f887x;
            Objects.requireNonNull(valueAnimator3);
            a3.d dVar = new a3.d(valueAnimator3, 4);
            x0.f903f = this.f886w;
            x0.e = true;
            x0.f904g = false;
            if (x0.d) {
                x0.d = false;
            }
            x0.f902c = dVar;
        }
        HashSet hashSet = x0.f900a;
        hf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f11785b == null) {
            z13 = true;
            cacheOutQueue.f11785b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        x0.f901b = z13;
        x0.e = false;
        x0.f904g = false;
    }

    public final void d() {
        if (!this.f881q) {
            dl0 dl0Var = this.f878n;
            if (dl0Var != null) {
                ValueAnimator valueAnimator = dl0Var.f25565y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                dl0Var.B0 = 0.0f;
                v vVar = dl0Var.S;
                if (vVar != null) {
                    vVar.invalidate();
                }
                dl0Var.invalidate();
            }
            qc.e();
            this.f881q = true;
            AndroidUtilities.hideKeyboard(this.f870c);
            c(false);
            if (this.v) {
                n2 n2Var = this.f882r;
                if (n2Var instanceof qn) {
                    ((qn) n2Var).Y9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f881q) {
            qc.e();
            this.f881q = true;
            v vVar = this.f870c;
            AndroidUtilities.hideKeyboard(vVar);
            vVar.animate().alpha(0.0f).setDuration(150L).setListener(new r0(this, 1));
            if (this.v) {
                n2 n2Var = this.f882r;
                if (n2Var instanceof qn) {
                    ((qn) n2Var).Y9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f888y != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new i0(this, 1));
    }

    public final void h(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        n0 n0Var = this.f877m;
        n0Var.f43061h0.setLayerType(i10, null);
        n0Var.f43057f0.setLayerType(i10, null);
        if (this.f886w) {
            for (int i11 = 0; i11 < Math.min(n0Var.f43052d0.f28231b.getChildCount(), 16); i11++) {
                n0Var.f43052d0.f28231b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        n0Var.f43054e0.setLayerType(i10, null);
        n0Var.f43052d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            n0 n0Var = this.f877m;
            u41 u41Var = n0Var.f43061h0;
            u41 u41Var2 = n0Var.f43061h0;
            if (i10 < u41Var.getChildCount()) {
                if (u41Var2.getChildAt(i10) instanceof g51) {
                    g51 g51Var = (g51) u41Var2.getChildAt(i10);
                    if (g51Var.f37197x != null) {
                        g51Var.f37190b = false;
                        g51Var.invalidate();
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
        n0 n0Var = this.f877m;
        float y3 = n0Var.getY();
        r41 r41Var = n0Var.f43044a0;
        float y10 = r41Var.getY() + y3;
        u41 u41Var = n0Var.f43061h0;
        int y11 = (int) (u41Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = u41Var.getChildCount();
            rectF = this.f873i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = u41Var.getChildAt(i10);
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
        int y12 = (int) (n0Var.f43052d0.getY() + r41Var.getY() + n0Var.getY());
        for (int i11 = 0; i11 < n0Var.f43052d0.f28231b.getChildCount(); i11++) {
            View childAt2 = n0Var.f43052d0.f28231b.getChildAt(i11);
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
            n0Var.f43067k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new l0(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new q0(this, ofFloat, z10, 0));
            if (this.f888y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(bs.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f886w) {
            n0 n0Var = this.f877m;
            n0Var.f43057f0.setAlpha(this.f874j);
            n0Var.f43061h0.setAlpha(this.f874j);
            n0Var.f43063i0.setAlpha(this.f874j);
            n0Var.f43052d0.setAlpha(this.f874j);
            n0Var.f43054e0.setAlpha(this.f874j);
        }
    }

    public final void l() {
        float f7;
        n0 n0Var = this.f877m;
        r41 r41Var = n0Var.f43044a0;
        r41 r41Var2 = n0Var.f43044a0;
        boolean z10 = this.f886w;
        s0 s0Var = this.f868a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = s0Var.f860f;
        }
        r41Var.setTranslationX(f7);
        r41Var2.setTranslationY(s0Var.h);
        r41Var2.setPivotX(s0Var.f862r);
        r41Var2.setPivotY(s0Var.f863s);
        r41Var2.setScaleX(s0Var.f861n);
        r41Var2.setScaleY(s0Var.f861n);
    }
}
