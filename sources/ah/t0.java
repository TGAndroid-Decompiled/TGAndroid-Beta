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
import org.telegram.messenger.lk;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.kw;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.a51;
import org.telegram.ui.i51;
import org.telegram.ui.m41;
import org.telegram.ui.sn;
import org.telegram.ui.t41;
import org.telegram.ui.w41;
import w7.z5;
public final class t0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final s0 f870a;
    public final WindowManager f871b;
    public final v f872c;
    public final boolean d;
    public float e;
    public float f874g;
    public float h;
    public float f876j;
    public boolean f877k;
    public boolean f878l;
    public final n0 f879m;
    public final cl0 f880n;
    public final List f881o;
    public rc0 f882p;
    public boolean f883q;
    public final n2 f884r;
    public final d6 f885s;
    public float f886t;
    public float f887u;
    public boolean v;
    public boolean f888w;
    public ValueAnimator f889x;
    public final int f890y;
    public dh.d f891z;
    public final RectF f873f = new RectF();
    public final RectF f875i = new RectF();

    public t0(int i10, n2 n2Var, ArrayList arrayList, HashSet hashSet, cl0 cl0Var, d6 d6Var, boolean z10) {
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
        this.f890y = i10;
        this.f881o = arrayList;
        this.f884r = n2Var;
        this.f885s = d6Var;
        if (n2Var != null) {
            context = n2Var.getContext();
        } else {
            context = cl0Var.getContext();
        }
        Context context2 = context;
        v vVar = new v(this, context2);
        this.f872c = vVar;
        vVar.setOnClickListener(new g0(this, 0));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        s0 s0Var = new s0(this, context2);
        this.f870a = s0Var;
        int windowType = cl0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        n0 n0Var = new n0(this, n2Var, context2, windowType, z12, d6Var, cl0Var, n2Var);
        this.f879m = n0Var;
        n0Var.setOutlineProvider(new o0(this));
        n0Var.setClipToOutline(true);
        boolean z14 = cl0Var.f25272f1;
        boolean z15 = cl0Var.f25274g1;
        if (n0Var.K1 != z14) {
            n0Var.K1 = z14;
            n0Var.L1 = z15;
            w41 w41Var = n0Var.f43586h0;
            if (w41Var != null) {
                w41Var.invalidate();
            }
            m41 m41Var = n0Var.f43588i0;
            if (m41Var != null) {
                m41Var.invalidate();
            }
        }
        n0Var.setOnLongPressedListener(new ya.d(cl0Var, 2));
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
        if (i10 == 1 || (cl0Var.getDelegate() != null && cl0Var.getDelegate().s())) {
            n0Var.setBackgroundDelegate(new h0(0, this, cl0Var));
        }
        if (z13) {
            ((ViewGroup) cl0Var.getParent()).addView(vVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f871b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, vVar, b10);
            windowManager.addView(vVar, b10);
        }
        this.f880n = cl0Var;
        cl0Var.setOnSwitchedToLoopView(new i0(this, 0));
        cl0Var.f25262b1 = true;
        cl0Var.invalidate();
        AndroidUtilities.runOnUIThread(new a1.f(10, this, cl0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(t0 t0Var, boolean z10) {
        View view;
        cl0 cl0Var = t0Var.f880n;
        n0 n0Var = t0Var.f879m;
        if (t0Var.E.isEmpty()) {
            t0Var.h(false);
            x0.a();
            t0Var.B.unlock();
            n0Var.setEnterAnimationInProgress(false);
            w41 w41Var = n0Var.f43586h0;
            if (z10) {
                n0Var.f43577d0.m(false);
                w41Var.invalidate();
                ArrayList arrayList = w41Var.Y2;
                w41Var.f1();
                n0Var.f43582f0.b();
                n0Var.sendAccessibilityEvent(32);
                cl0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < w41Var.getChildCount()) {
                        if (w41Var.getChildAt(i10) instanceof i51) {
                            view = w41Var.getChildAt(i10);
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
                if (cl0Var.getPullingLeftProgress() > 0.0f) {
                    cl0Var.O0 = false;
                    ValueAnimator valueAnimator = cl0Var.f25300y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    cl0Var.B0 = 0.0f;
                    v vVar = cl0Var.S;
                    if (vVar != null) {
                        vVar.invalidate();
                    }
                    cl0Var.invalidate();
                } else {
                    cl0Var.O0 = true;
                    ValueAnimator valueAnimator2 = cl0Var.f25300y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    cl0Var.B0 = 0.0f;
                    v vVar2 = cl0Var.S;
                    if (vVar2 != null) {
                        vVar2.invalidate();
                    }
                    cl0Var.invalidate();
                }
                m41 m41Var = n0Var.f43588i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    a51 a51Var = (a51) arrayList.get(i11);
                    for (int i12 = 0; i12 < a51Var.O.size(); i12++) {
                        if (((i51) a51Var.O.get(i12)).f37725b) {
                            ((i51) a51Var.O.get(i12)).f37725b = false;
                            ((i51) a51Var.O.get(i12)).invalidate();
                            a51Var.k();
                        }
                    }
                }
                w41Var.invalidate();
                for (int i13 = 0; i13 < m41Var.Y2.size(); i13++) {
                    a51 a51Var2 = (a51) m41Var.Y2.get(i13);
                    for (int i14 = 0; i14 < a51Var2.O.size(); i14++) {
                        if (((i51) a51Var2.O.get(i14)).f37725b) {
                            ((i51) a51Var2.O.get(i14)).f37725b = false;
                            ((i51) a51Var2.O.get(i14)).invalidate();
                            a51Var2.k();
                        }
                    }
                }
                m41Var.invalidate();
                t0Var.i();
                t0Var.f870a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof i51) {
            ((i51) view).setAnimatedScale(f7);
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
        int i11 = this.f890y;
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
        n0 n0Var = this.f879m;
        int i11 = this.f890y;
        v vVar = this.f872c;
        int[] iArr = this.A;
        s0 s0Var = this.f870a;
        RectF rectF = this.f873f;
        cl0 cl0Var = this.f880n;
        rectF.set(cl0Var.f25295w);
        this.e = cl0Var.f25299y;
        int[] iArr2 = new int[2];
        if (z10) {
            cl0Var.getLocationOnScreen(iArr);
        }
        vVar.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (n0Var.O0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = cl0Var.getTopOffset() + (dp - i10);
        if (cl0Var.F0) {
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
            this.f886t = s0Var.getTranslationY();
        } else {
            this.f886t = topOffset;
            s0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - s0Var.getX();
        this.f874g = x10;
        float y3 = (iArr[r18] - iArr2[r18]) - s0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        cl0Var.setCustomEmojiEnterProgress(this.f876j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = r18;
            } else {
                z14 = false;
            }
            this.f888w = z14;
            this.f877k = false;
        } else {
            this.f888w = false;
        }
        if (this.f888w) {
            z11 = r18;
            j(0.0f, z11);
        } else {
            z11 = r18;
        }
        k();
        n0Var.setEnterAnimationInProgress(z11);
        kw kwVar = n0Var.f43577d0;
        if (z10 && this.f888w) {
            z12 = true;
        } else {
            z12 = false;
        }
        kwVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f889x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f876j;
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
            timeAnimator.f32460a = 0;
            timeAnimator.f32461b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f889x = valueAnimator;
        valueAnimator.addUpdateListener(new k0(0, this, z10));
        if (!z10) {
            i();
        }
        this.f889x.addListener(new p0(0, this, z10));
        if (i11 == 4) {
            this.f889x.setDuration(420L);
            this.f889x.setInterpolator(bs.h);
        } else if (this.f888w) {
            this.f889x.setDuration(450L);
            lk.l(0.5f, this.f889x);
        } else {
            this.f889x.setDuration(350L);
            this.f889x.setInterpolator(bs.f25030f);
        }
        s0Var.invalidate();
        h(true);
        if (!z10) {
            cl0Var.O0 = true;
            cl0Var.invalidate();
            this.f889x.setStartDelay(30L);
            this.f889x.start();
        } else {
            cl0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f889x;
            Objects.requireNonNull(valueAnimator3);
            a3.d dVar = new a3.d(valueAnimator3, 4);
            x0.f905f = this.f888w;
            x0.e = true;
            x0.f906g = false;
            if (x0.d) {
                x0.d = false;
            }
            x0.f904c = dVar;
        }
        HashSet hashSet = x0.f902a;
        hf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f11786b == null) {
            z13 = true;
            cacheOutQueue.f11786b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        x0.f903b = z13;
        x0.e = false;
        x0.f906g = false;
    }

    public final void d() {
        if (!this.f883q) {
            cl0 cl0Var = this.f880n;
            if (cl0Var != null) {
                ValueAnimator valueAnimator = cl0Var.f25300y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                cl0Var.B0 = 0.0f;
                v vVar = cl0Var.S;
                if (vVar != null) {
                    vVar.invalidate();
                }
                cl0Var.invalidate();
            }
            qc.e();
            this.f883q = true;
            AndroidUtilities.hideKeyboard(this.f872c);
            c(false);
            if (this.v) {
                n2 n2Var = this.f884r;
                if (n2Var instanceof sn) {
                    ((sn) n2Var).Y9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f883q) {
            qc.e();
            this.f883q = true;
            v vVar = this.f872c;
            AndroidUtilities.hideKeyboard(vVar);
            vVar.animate().alpha(0.0f).setDuration(150L).setListener(new r0(this, 1));
            if (this.v) {
                n2 n2Var = this.f884r;
                if (n2Var instanceof sn) {
                    ((sn) n2Var).Y9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f890y != 5) {
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
        n0 n0Var = this.f879m;
        n0Var.f43586h0.setLayerType(i10, null);
        n0Var.f43582f0.setLayerType(i10, null);
        if (this.f888w) {
            for (int i11 = 0; i11 < Math.min(n0Var.f43577d0.f27944b.getChildCount(), 16); i11++) {
                n0Var.f43577d0.f27944b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        n0Var.f43579e0.setLayerType(i10, null);
        n0Var.f43577d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            n0 n0Var = this.f879m;
            w41 w41Var = n0Var.f43586h0;
            w41 w41Var2 = n0Var.f43586h0;
            if (i10 < w41Var.getChildCount()) {
                if (w41Var2.getChildAt(i10) instanceof i51) {
                    i51 i51Var = (i51) w41Var2.getChildAt(i10);
                    if (i51Var.f37732x != null) {
                        i51Var.f37725b = false;
                        i51Var.invalidate();
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
        n0 n0Var = this.f879m;
        float y3 = n0Var.getY();
        t41 t41Var = n0Var.f43569a0;
        float y10 = t41Var.getY() + y3;
        w41 w41Var = n0Var.f43586h0;
        int y11 = (int) (w41Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = w41Var.getChildCount();
            rectF = this.f875i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = w41Var.getChildAt(i10);
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
        int y12 = (int) (n0Var.f43577d0.getY() + t41Var.getY() + n0Var.getY());
        for (int i11 = 0; i11 < n0Var.f43577d0.f27944b.getChildCount(); i11++) {
            View childAt2 = n0Var.f43577d0.f27944b.getChildAt(i11);
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
            n0Var.f43592k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new l0(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new q0(this, ofFloat, z10, 0));
            if (this.f890y == 4) {
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
        if (!this.f888w) {
            n0 n0Var = this.f879m;
            n0Var.f43582f0.setAlpha(this.f876j);
            n0Var.f43586h0.setAlpha(this.f876j);
            n0Var.f43588i0.setAlpha(this.f876j);
            n0Var.f43577d0.setAlpha(this.f876j);
            n0Var.f43579e0.setAlpha(this.f876j);
        }
    }

    public final void l() {
        float f7;
        n0 n0Var = this.f879m;
        t41 t41Var = n0Var.f43569a0;
        t41 t41Var2 = n0Var.f43569a0;
        boolean z10 = this.f888w;
        s0 s0Var = this.f870a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = s0Var.f862f;
        }
        t41Var.setTranslationX(f7);
        t41Var2.setTranslationY(s0Var.h);
        t41Var2.setPivotX(s0Var.f864r);
        t41Var2.setPivotY(s0Var.f865s);
        t41Var2.setScaleX(s0Var.f863n);
        t41Var2.setScaleY(s0Var.f863n);
    }
}
