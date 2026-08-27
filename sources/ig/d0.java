package ig;

import ag.t2;
import ag.w0;
import ag.y1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import h7.z5;
import hh.m5;
import hh.y9;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.b51;
import org.telegram.ui.j51;
import org.telegram.ui.n41;
import org.telegram.ui.rn;
import org.telegram.ui.u41;
import org.telegram.ui.x41;

public final class d0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;

    public final c0 f11268a;

    public final WindowManager f11269b;

    public final y1 f11270c;
    public final boolean d;

    public float f11271e;

    public float f11273g;
    public float h;

    public float f11275j;

    public boolean f11276k;

    public boolean f11277l;

    public final z f11278m;

    public final wj0 f11279n;

    public final List f11280o;

    public mb0 f11281p;

    public boolean f11282q;

    public final n2 f11283r;

    public final c6 f11284s;

    public float f11285t;

    public float f11286u;
    public boolean v;

    public boolean f11287w;

    public ValueAnimator f11288x;

    public final int f11289y;

    public lg.d f11290z;

    public final RectF f11272f = new RectF();

    public final RectF f11274i = new RectF();

    public d0(int i10, n2 n2Var, ArrayList arrayList, HashSet hashSet, wj0 wj0Var, c6 c6Var, boolean z10) {
        new Path();
        this.A = new int[2];
        this.B = new AnimationNotificationsLocker();
        this.D = new HashSet();
        this.E = new ArrayList();
        int i11 = 0;
        this.F = 0;
        this.f11289y = i10;
        this.f11280o = arrayList;
        this.f11283r = n2Var;
        this.f11284s = c6Var;
        Context context = n2Var != null ? n2Var.getContext() : wj0Var.getContext();
        y1 y1Var = new y1(this, context);
        this.f11270c = y1Var;
        y1Var.setOnClickListener(new w0(this, 20));
        boolean z11 = i10 == 2 || i10 == 4 || i10 == 5 || z10;
        this.d = z11;
        c0 c0Var = new c0(this, context);
        this.f11268a = c0Var;
        boolean z12 = z11;
        z zVar = new z(this, n2Var, context, wj0Var.getWindowType(), i10 != 1, c6Var, wj0Var, n2Var);
        this.f11278m = zVar;
        zVar.setOutlineProvider(new a0(this));
        zVar.setClipToOutline(true);
        boolean z13 = wj0Var.f34238b1;
        boolean z14 = wj0Var.f34241c1;
        if (zVar.G1 != z13) {
            zVar.G1 = z13;
            zVar.H1 = z14;
            x41 x41Var = zVar.f36392d0;
            if (x41Var != null) {
                x41Var.invalidate();
            }
            n41 n41Var = zVar.f36395e0;
            if (n41Var != null) {
                n41Var.invalidate();
            }
        }
        zVar.setOnLongPressedListener(new k5.i(wj0Var, 19));
        zVar.setOnRecentClearedListener(new xa.a(9));
        zVar.setRecentReactions(arrayList);
        zVar.setSelectedReactions((HashSet<q0>) hashSet);
        zVar.setDrawBackground(false);
        zVar.s(null);
        c0Var.addView(zVar, z5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i12 = i10 == 5 ? 2 : 16;
        if (i10 == 5) {
            c0Var.setClipChildren(false);
            c0Var.setClipToPadding(false);
            y1Var.setClipChildren(false);
            y1Var.setClipToPadding(false);
        }
        float f10 = i12;
        y1Var.addView(c0Var, z5.d(-1, -1.0f, i10 == 5 ? 85 : 48, f10, f10, f10, 16.0f));
        y1Var.setClipChildren(false);
        if (i10 == 1 || (wj0Var.getDelegate() != null && wj0Var.getDelegate().t())) {
            zVar.setBackgroundDelegate(new ag.h0(28, this, wj0Var));
        }
        if (z12) {
            ((ViewGroup) wj0Var.getParent()).addView(y1Var);
        } else {
            WindowManager.LayoutParams layoutParamsB = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context).getWindowManager();
            this.f11269b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, y1Var, layoutParamsB);
            windowManager.addView(y1Var, layoutParamsB);
        }
        this.f11279n = wj0Var;
        wj0Var.setOnSwitchedToLoopView(new w(this, i11));
        wj0Var.X0 = true;
        wj0Var.invalidate();
        AndroidUtilities.runOnUIThread(new m5(10, this, wj0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(d0 d0Var, boolean z10) {
        View childAt;
        wj0 wj0Var = d0Var.f11279n;
        z zVar = d0Var.f11278m;
        if (d0Var.E.isEmpty()) {
            d0Var.h(false);
            g0.a();
            d0Var.B.unlock();
            zVar.setEnterAnimationInProgress(false);
            x41 x41Var = zVar.f36392d0;
            if (z10) {
                zVar.W.m(false);
                x41Var.invalidate();
                ArrayList arrayList = x41Var.W2;
                x41Var.f1();
                zVar.f36387b0.b();
                zVar.sendAccessibilityEvent(32);
                wj0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 >= x41Var.getChildCount()) {
                        childAt = null;
                        break;
                    } else {
                        if (x41Var.getChildAt(i10) instanceof j51) {
                            childAt = x41Var.getChildAt(i10);
                            break;
                        }
                        i10++;
                    }
                }
                if (childAt != null) {
                    childAt.performAccessibilityAction(64, null);
                } else {
                    zVar.performAccessibilityAction(64, null);
                }
                if (wj0Var.getPullingLeftProgress() > 0.0f) {
                    wj0Var.K0 = false;
                    ValueAnimator valueAnimator = wj0Var.f34266u0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    wj0Var.f34271x0 = 0.0f;
                    y1 y1Var = wj0Var.O;
                    if (y1Var != null) {
                        y1Var.invalidate();
                    }
                    wj0Var.invalidate();
                } else {
                    wj0Var.K0 = true;
                    ValueAnimator valueAnimator2 = wj0Var.f34266u0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    wj0Var.f34271x0 = 0.0f;
                    y1 y1Var2 = wj0Var.O;
                    if (y1Var2 != null) {
                        y1Var2.invalidate();
                    }
                    wj0Var.invalidate();
                }
                n41 n41Var = zVar.f36395e0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    b51 b51Var = (b51) arrayList.get(i11);
                    for (int i12 = 0; i12 < b51Var.K.size(); i12++) {
                        if (((j51) b51Var.K.get(i12)).f39257b) {
                            ((j51) b51Var.K.get(i12)).f39257b = false;
                            ((j51) b51Var.K.get(i12)).invalidate();
                            b51Var.k();
                        }
                    }
                }
                x41Var.invalidate();
                for (int i13 = 0; i13 < n41Var.W2.size(); i13++) {
                    b51 b51Var2 = (b51) n41Var.W2.get(i13);
                    for (int i14 = 0; i14 < b51Var2.K.size(); i14++) {
                        if (((j51) b51Var2.K.get(i14)).f39257b) {
                            ((j51) b51Var2.K.get(i14)).f39257b = false;
                            ((j51) b51Var2.K.get(i14)).invalidate();
                            b51Var2.k();
                        }
                    }
                }
                n41Var.invalidate();
                d0Var.i();
                d0Var.f11268a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof j51) {
            ((j51) view).setAnimatedScale(f10);
        } else if (view instanceof iv) {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i10 = this.f11289y;
        layoutParams.type = (i10 == 0 || i10 == 3) ? 1000 : 99;
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
        char c10;
        boolean z11;
        ValueAnimator valueAnimatorOfFloat;
        boolean z12;
        z zVar = this.f11278m;
        int i10 = this.f11289y;
        y1 y1Var = this.f11270c;
        int[] iArr = this.A;
        c0 c0Var = this.f11268a;
        RectF rectF = this.f11272f;
        wj0 wj0Var = this.f11279n;
        rectF.set(wj0Var.f34268w);
        this.f11271e = wj0Var.f34272y;
        int i11 = 2;
        int[] iArr2 = new int[2];
        if (z10) {
            wj0Var.getLocationOnScreen(iArr);
        }
        y1Var.getLocationOnScreen(iArr2);
        int i12 = 0;
        float topOffset = wj0Var.getTopOffset() + ((((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f)) - (zVar.K0 ? AndroidUtilities.dp(26.0f) : 0));
        if (wj0Var.B0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (c0Var.getMeasuredHeight() + topOffset > y1Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (y1Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - c0Var.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        if (i10 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i10 == 1) {
            c10 = 1;
            c0Var.setTranslationX(((y1Var.getMeasuredWidth() - c0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c10 = 1;
            if (i10 == 2 || i10 == 4) {
                c0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            } else {
                c0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            }
        }
        if (z10) {
            this.f11285t = topOffset;
            c0Var.setTranslationY(topOffset);
        } else {
            this.f11285t = c0Var.getTranslationY();
        }
        float x8 = (iArr[0] - iArr2[0]) - c0Var.getX();
        this.f11273g = x8;
        float y10 = (iArr[c10] - iArr2[c10]) - c0Var.getY();
        this.h = y10;
        rectF.offset(x8, y10);
        wj0Var.setCustomEmojiEnterProgress(this.f11275j);
        if (z10) {
            this.f11287w = SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200);
            this.f11276k = false;
        } else {
            this.f11287w = false;
        }
        if (this.f11287w) {
            z11 = true;
            j(0.0f, true);
        } else {
            z11 = true;
        }
        k();
        zVar.setEnterAnimationInProgress(z11);
        zVar.W.m(z10 && this.f11287w);
        this.B.lock();
        ValueAnimator valueAnimator = this.f11288x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.C = true;
        float f10 = this.f11275j;
        if (i10 == 4) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
        } else {
            float f11 = z10 ? 1.0f : 0.0f;
            nv0 nv0Var = new nv0();
            nv0Var.f31037a = 0;
            nv0Var.f31038b = 0;
            nv0Var.setFloatValues(new float[]{f10, f11});
            valueAnimatorOfFloat = nv0Var;
        }
        this.f11288x = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new y(i12, this, z10));
        if (!z10) {
            i();
        }
        this.f11288x.addListener(new ag.x(i11, this, z10));
        if (i10 == 4) {
            this.f11288x.setDuration(420L);
            this.f11288x.setInterpolator(er.h);
        } else if (this.f11287w) {
            this.f11288x.setDuration(450L);
            this.f11288x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f11288x.setDuration(350L);
            this.f11288x.setInterpolator(er.f28122f);
        }
        c0Var.invalidate();
        h(true);
        if (z10) {
            wj0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator2 = this.f11288x;
            Objects.requireNonNull(valueAnimator2);
            y9 y9Var = new y9(valueAnimator2, 5);
            g0.f11306f = this.f11287w;
            g0.f11305e = true;
            g0.f11307g = false;
            if (g0.d) {
                g0.d = false;
            }
            g0.f11304c = y9Var;
        } else {
            wj0Var.K0 = true;
            wj0Var.invalidate();
            this.f11288x.setStartDelay(30L);
            this.f11288x.start();
        }
        HashSet hashSet = g0.f11302a;
        ne.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f18520b == null) {
            z12 = true;
            cacheOutQueue.f18520b = new CountDownLatch(1);
        } else {
            z12 = true;
        }
        g0.f11303b = z12;
        g0.f11305e = false;
        g0.f11307g = false;
    }

    public final void d() {
        if (this.f11282q) {
            return;
        }
        wj0 wj0Var = this.f11279n;
        if (wj0Var != null) {
            ValueAnimator valueAnimator = wj0Var.f34266u0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            wj0Var.f34271x0 = 0.0f;
            y1 y1Var = wj0Var.O;
            if (y1Var != null) {
                y1Var.invalidate();
            }
            wj0Var.invalidate();
        }
        ec.e();
        this.f11282q = true;
        AndroidUtilities.hideKeyboard(this.f11270c);
        c(false);
        if (this.v) {
            n2 n2Var = this.f11283r;
            if (n2Var instanceof rn) {
                ((rn) n2Var).T9(true, true);
            }
        }
    }

    public final void e() {
        if (this.f11282q) {
            return;
        }
        ec.e();
        this.f11282q = true;
        y1 y1Var = this.f11270c;
        AndroidUtilities.hideKeyboard(y1Var);
        y1Var.animate().alpha(0.0f).setDuration(150L).setListener(new b0(this, 1));
        if (this.v) {
            n2 n2Var = this.f11283r;
            if (n2Var instanceof rn) {
                ((rn) n2Var).T9(true, true);
            }
        }
    }

    public final void f() {
        int i10 = 1;
        if (this.f11289y != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new w(this, i10));
    }

    public final void h(boolean z10) {
        int i10 = z10 ? 2 : 0;
        z zVar = this.f11278m;
        zVar.f36392d0.setLayerType(i10, null);
        zVar.f36387b0.setLayerType(i10, null);
        if (!this.f11287w) {
            zVar.f36384a0.setLayerType(i10, null);
            zVar.W.setLayerType(i10, null);
        } else {
            for (int i11 = 0; i11 < Math.min(zVar.W.f26767b.getChildCount(), 16); i11++) {
                zVar.W.f26767b.getChildAt(i11).setLayerType(i10, null);
            }
        }
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            z zVar = this.f11278m;
            x41 x41Var = zVar.f36392d0;
            x41 x41Var2 = zVar.f36392d0;
            if (i10 >= x41Var.getChildCount()) {
                return;
            }
            if (x41Var2.getChildAt(i10) instanceof j51) {
                j51 j51Var = (j51) x41Var2.getChildAt(i10);
                if (j51Var.f39265x != null) {
                    j51Var.f39257b = false;
                    j51Var.invalidate();
                }
            }
            i10++;
        }
    }

    public final void j(float f10, boolean z10) {
        RectF rectF;
        int i10;
        HashSet hashSet;
        z zVar = this.f11278m;
        float y10 = zVar.getY();
        u41 u41Var = zVar.T;
        float y11 = u41Var.getY() + y10;
        x41 x41Var = zVar.f36392d0;
        int y12 = (int) (x41Var.getY() + y11);
        ArrayList arrayList = null;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = x41Var.getChildCount();
            rectF = this.f11274i;
            i10 = 1;
            hashSet = this.D;
            if (i11 >= childCount) {
                break;
            }
            View childAt = x41Var.getChildAt(i11);
            if (!hashSet.contains(childAt)) {
                float measuredHeight = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop() + y12;
                if (measuredHeight >= rectF.bottom || measuredHeight <= rectF.top || f10 == 0.0f) {
                    g(childAt, 0.0f);
                    z11 = true;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt);
                    hashSet.add(childAt);
                }
            }
            i11++;
        }
        int y13 = (int) (zVar.W.getY() + u41Var.getY() + zVar.getY());
        for (int i12 = 0; i12 < zVar.W.f26767b.getChildCount(); i12++) {
            View childAt2 = zVar.W.f26767b.getChildAt(i12);
            if (!hashSet.contains(childAt2)) {
                float measuredHeight2 = (childAt2.getMeasuredHeight() / 2.0f) + childAt2.getTop() + y13;
                if (measuredHeight2 >= rectF.bottom || measuredHeight2 <= rectF.top || f10 == 0.0f) {
                    g(childAt2, 0.0f);
                    z11 = true;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt2);
                    hashSet.add(childAt2);
                }
            }
        }
        if (z11) {
            zVar.f36400g0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new t2(3, this, arrayList));
            this.E.add(valueAnimatorOfFloat);
            valueAnimatorOfFloat.addListener(new androidx.fragment.app.g(this, valueAnimatorOfFloat, z10, i10));
            if (this.f11289y == 4) {
                valueAnimatorOfFloat.setDuration(420L);
                valueAnimatorOfFloat.setInterpolator(er.h);
            } else {
                valueAnimatorOfFloat.setDuration(350L);
                valueAnimatorOfFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            valueAnimatorOfFloat.start();
        }
    }

    public final void k() {
        if (this.f11287w) {
            return;
        }
        z zVar = this.f11278m;
        zVar.f36387b0.setAlpha(this.f11275j);
        zVar.f36392d0.setAlpha(this.f11275j);
        zVar.f36395e0.setAlpha(this.f11275j);
        zVar.W.setAlpha(this.f11275j);
        zVar.f36384a0.setAlpha(this.f11275j);
    }

    public final void l() {
        z zVar = this.f11278m;
        u41 u41Var = zVar.T;
        u41 u41Var2 = zVar.T;
        boolean z10 = this.f11287w;
        c0 c0Var = this.f11268a;
        u41Var.setTranslationX(z10 ? 0.0f : c0Var.f11252f);
        u41Var2.setTranslationY(c0Var.h);
        u41Var2.setPivotX(c0Var.f11254r);
        u41Var2.setPivotY(c0Var.f11255s);
        u41Var2.setScaleX(c0Var.f11253n);
        u41Var2.setScaleY(c0Var.f11253n);
    }
}
