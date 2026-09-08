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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bw;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xv;
import org.telegram.ui.co;
import org.telegram.ui.d61;
import org.telegram.ui.g61;
import org.telegram.ui.k61;
import org.telegram.ui.s61;
import org.telegram.ui.w51;
import w7.x5;
public final class u0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final t0 f697a;
    public final WindowManager f698b;
    public final w f699c;
    public final boolean d;
    public float f700e;
    public float f702g;
    public float h;
    public float f704j;
    public boolean f705k;
    public boolean f706l;
    public final o0 f707m;
    public final fk0 f708n;
    public final List f709o;
    public cc0 f710p;
    public boolean f711q;
    public final n2 f712r;
    public final f6 f713s;
    public float f714t;
    public float f715u;
    public boolean v;
    public boolean f716w;
    public ValueAnimator f717x;
    public final int f718y;
    public dh.d f719z;
    public final RectF f701f = new RectF();
    public final RectF f703i = new RectF();

    public u0(int i10, n2 n2Var, ArrayList arrayList, HashSet hashSet, fk0 fk0Var, f6 f6Var, boolean z10) {
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
        this.f718y = i10;
        this.f709o = arrayList;
        this.f712r = n2Var;
        this.f713s = f6Var;
        if (n2Var != null) {
            context = n2Var.getContext();
        } else {
            context = fk0Var.getContext();
        }
        Context context2 = context;
        w wVar = new w(this, context2);
        this.f699c = wVar;
        wVar.setOnClickListener(new h0(this, 0));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        t0 t0Var = new t0(this, context2);
        this.f697a = t0Var;
        int windowType = fk0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        o0 o0Var = new o0(this, n2Var, context2, windowType, z12, f6Var, fk0Var, n2Var);
        this.f707m = o0Var;
        o0Var.setOutlineProvider(new p0(this));
        o0Var.setClipToOutline(true);
        boolean z14 = fk0Var.f26120f1;
        boolean z15 = fk0Var.f26122g1;
        if (o0Var.K1 != z14) {
            o0Var.K1 = z14;
            o0Var.L1 = z15;
            g61 g61Var = o0Var.f37673h0;
            if (g61Var != null) {
                g61Var.invalidate();
            }
            w51 w51Var = o0Var.f37675i0;
            if (w51Var != null) {
                w51Var.invalidate();
            }
        }
        o0Var.setOnLongPressedListener(new xa.c(fk0Var, 2));
        o0Var.setOnRecentClearedListener(new Object());
        o0Var.setRecentReactions(arrayList);
        o0Var.setSelectedReactions(hashSet);
        o0Var.setDrawBackground(false);
        o0Var.s(null);
        t0Var.addView(o0Var, x5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        int i12 = i10 != 5 ? 16 : 2;
        if (i10 == 5) {
            t0Var.setClipChildren(false);
            t0Var.setClipToPadding(false);
            wVar.setClipChildren(false);
            wVar.setClipToPadding(false);
        }
        if (i10 == 5) {
            i11 = 85;
        } else {
            i11 = 48;
        }
        float f7 = i12;
        wVar.addView(t0Var, x5.d(-1, -1.0f, i11, f7, f7, f7, 16.0f));
        wVar.setClipChildren(false);
        if (i10 == 1 || (fk0Var.getDelegate() != null && fk0Var.getDelegate().S())) {
            o0Var.setBackgroundDelegate(new i0(0, this, fk0Var));
        }
        if (z13) {
            ((ViewGroup) fk0Var.getParent()).addView(wVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f698b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, wVar, b10);
            windowManager.addView(wVar, b10);
        }
        this.f708n = fk0Var;
        fk0Var.setOnSwitchedToLoopView(new j0(this, 0));
        fk0Var.f26109b1 = true;
        fk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new a1.e(8, this, fk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(u0 u0Var, boolean z10) {
        View view;
        fk0 fk0Var = u0Var.f708n;
        o0 o0Var = u0Var.f707m;
        if (u0Var.E.isEmpty()) {
            u0Var.h(false);
            y0.a();
            u0Var.B.unlock();
            o0Var.setEnterAnimationInProgress(false);
            g61 g61Var = o0Var.f37673h0;
            if (z10) {
                o0Var.f37663d0.m(false);
                g61Var.invalidate();
                ArrayList arrayList = g61Var.f38227a3;
                g61Var.e1();
                o0Var.f37669f0.b();
                o0Var.sendAccessibilityEvent(32);
                fk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < g61Var.getChildCount()) {
                        if (g61Var.getChildAt(i10) instanceof s61) {
                            view = g61Var.getChildAt(i10);
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
                    o0Var.performAccessibilityAction(64, null);
                }
                if (fk0Var.getPullingLeftProgress() > 0.0f) {
                    fk0Var.O0 = false;
                    ValueAnimator valueAnimator = fk0Var.f26148y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    fk0Var.B0 = 0.0f;
                    w wVar = fk0Var.S;
                    if (wVar != null) {
                        wVar.invalidate();
                    }
                    fk0Var.invalidate();
                } else {
                    fk0Var.O0 = true;
                    ValueAnimator valueAnimator2 = fk0Var.f26148y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    fk0Var.B0 = 0.0f;
                    w wVar2 = fk0Var.S;
                    if (wVar2 != null) {
                        wVar2.invalidate();
                    }
                    fk0Var.invalidate();
                }
                w51 w51Var = o0Var.f37675i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    k61 k61Var = (k61) arrayList.get(i11);
                    for (int i12 = 0; i12 < k61Var.O.size(); i12++) {
                        if (((s61) k61Var.O.get(i12)).f40343b) {
                            ((s61) k61Var.O.get(i12)).f40343b = false;
                            ((s61) k61Var.O.get(i12)).invalidate();
                            k61Var.k();
                        }
                    }
                }
                g61Var.invalidate();
                for (int i13 = 0; i13 < w51Var.f38227a3.size(); i13++) {
                    k61 k61Var2 = (k61) w51Var.f38227a3.get(i13);
                    for (int i14 = 0; i14 < k61Var2.O.size(); i14++) {
                        if (((s61) k61Var2.O.get(i14)).f40343b) {
                            ((s61) k61Var2.O.get(i14)).f40343b = false;
                            ((s61) k61Var2.O.get(i14)).invalidate();
                            k61Var2.k();
                        }
                    }
                }
                w51Var.invalidate();
                u0Var.i();
                u0Var.f697a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof s61) {
            ((s61) view).setAnimatedScale(f7);
        } else if (view instanceof xv) {
            view.setScaleX(f7);
            view.setScaleY(f7);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i11 = this.f718y;
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
        char c10;
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        boolean z13;
        boolean z14;
        o0 o0Var = this.f707m;
        int i11 = this.f718y;
        w wVar = this.f699c;
        int[] iArr = this.A;
        t0 t0Var = this.f697a;
        RectF rectF = this.f701f;
        fk0 fk0Var = this.f708n;
        rectF.set(fk0Var.f26143w);
        this.f700e = fk0Var.f26147y;
        int[] iArr2 = new int[2];
        if (z10) {
            fk0Var.getLocationOnScreen(iArr);
        }
        wVar.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (o0Var.O0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = fk0Var.getTopOffset() + (dp - i10);
        if (fk0Var.F0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (t0Var.getMeasuredHeight() + topOffset > wVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (wVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - t0Var.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        float f7 = 0.0f;
        if (i11 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i11 == 1) {
            c10 = 1;
            t0Var.setTranslationX(((wVar.getMeasuredWidth() - t0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c10 = 1;
            if (i11 != 2 && i11 != 4) {
                t0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            } else {
                t0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            }
        }
        if (!z10) {
            this.f714t = t0Var.getTranslationY();
        } else {
            this.f714t = topOffset;
            t0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - t0Var.getX();
        this.f702g = x10;
        float y3 = (iArr[c10] - iArr2[c10]) - t0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        fk0Var.setCustomEmojiEnterProgress(this.f704j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f716w = z14;
            this.f705k = false;
        } else {
            this.f716w = false;
        }
        if (this.f716w) {
            z11 = true;
            j(0.0f, true);
        } else {
            z11 = true;
        }
        k();
        o0Var.setEnterAnimationInProgress(z11);
        bw bwVar = o0Var.f37663d0;
        if (z10 && this.f716w) {
            z12 = true;
        } else {
            z12 = false;
        }
        bwVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f717x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f704j;
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
            timeAnimator.f25127a = 0;
            timeAnimator.f25128b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f717x = valueAnimator;
        valueAnimator.addUpdateListener(new l0(0, this, z10));
        if (!z10) {
            i();
        }
        this.f717x.addListener(new q0(0, this, z10));
        if (i11 == 4) {
            this.f717x.setDuration(420L);
            this.f717x.setInterpolator(pr.h);
        } else if (this.f716w) {
            this.f717x.setDuration(450L);
            this.f717x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f717x.setDuration(350L);
            this.f717x.setInterpolator(pr.f29493f);
        }
        t0Var.invalidate();
        h(true);
        if (!z10) {
            fk0Var.O0 = true;
            fk0Var.invalidate();
            this.f717x.setStartDelay(30L);
            this.f717x.start();
        } else {
            fk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f717x;
            Objects.requireNonNull(valueAnimator3);
            a3.d dVar = new a3.d(valueAnimator3, 3);
            y0.f735f = this.f716w;
            y0.f734e = true;
            y0.f736g = false;
            if (y0.d) {
                y0.d = false;
            }
            y0.f733c = dVar;
        }
        HashSet hashSet = y0.f731a;
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f9499b == null) {
            z13 = true;
            cacheOutQueue.f9499b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        y0.f732b = z13;
        y0.f734e = false;
        y0.f736g = false;
    }

    public final void d() {
        if (!this.f711q) {
            fk0 fk0Var = this.f708n;
            if (fk0Var != null) {
                ValueAnimator valueAnimator = fk0Var.f26148y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                fk0Var.B0 = 0.0f;
                w wVar = fk0Var.S;
                if (wVar != null) {
                    wVar.invalidate();
                }
                fk0Var.invalidate();
            }
            qc.e();
            this.f711q = true;
            AndroidUtilities.hideKeyboard(this.f699c);
            c(false);
            if (this.v) {
                n2 n2Var = this.f712r;
                if (n2Var instanceof co) {
                    ((co) n2Var).T9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f711q) {
            qc.e();
            this.f711q = true;
            w wVar = this.f699c;
            AndroidUtilities.hideKeyboard(wVar);
            wVar.animate().alpha(0.0f).setDuration(150L).setListener(new s0(this, 1));
            if (this.v) {
                n2 n2Var = this.f712r;
                if (n2Var instanceof co) {
                    ((co) n2Var).T9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f718y != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new j0(this, 1));
    }

    public final void h(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        o0 o0Var = this.f707m;
        o0Var.f37673h0.setLayerType(i10, null);
        o0Var.f37669f0.setLayerType(i10, null);
        if (this.f716w) {
            for (int i11 = 0; i11 < Math.min(o0Var.f37663d0.f28497b.getChildCount(), 16); i11++) {
                o0Var.f37663d0.f28497b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        o0Var.f37666e0.setLayerType(i10, null);
        o0Var.f37663d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            o0 o0Var = this.f707m;
            g61 g61Var = o0Var.f37673h0;
            g61 g61Var2 = o0Var.f37673h0;
            if (i10 < g61Var.getChildCount()) {
                if (g61Var2.getChildAt(i10) instanceof s61) {
                    s61 s61Var = (s61) g61Var2.getChildAt(i10);
                    if (s61Var.f40351x != null) {
                        s61Var.f40343b = false;
                        s61Var.invalidate();
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
        o0 o0Var = this.f707m;
        float y3 = o0Var.getY();
        d61 d61Var = o0Var.f37655a0;
        float y10 = d61Var.getY() + y3;
        g61 g61Var = o0Var.f37673h0;
        int y11 = (int) (g61Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = g61Var.getChildCount();
            rectF = this.f703i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = g61Var.getChildAt(i10);
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
        int y12 = (int) (o0Var.f37663d0.getY() + d61Var.getY() + o0Var.getY());
        for (int i11 = 0; i11 < o0Var.f37663d0.f28497b.getChildCount(); i11++) {
            View childAt2 = o0Var.f37663d0.f28497b.getChildAt(i11);
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
            o0Var.f37679k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new m0(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new r0(this, ofFloat, z10, 0));
            if (this.f718y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(pr.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f716w) {
            o0 o0Var = this.f707m;
            o0Var.f37669f0.setAlpha(this.f704j);
            o0Var.f37673h0.setAlpha(this.f704j);
            o0Var.f37675i0.setAlpha(this.f704j);
            o0Var.f37663d0.setAlpha(this.f704j);
            o0Var.f37666e0.setAlpha(this.f704j);
        }
    }

    public final void l() {
        float f7;
        o0 o0Var = this.f707m;
        d61 d61Var = o0Var.f37655a0;
        d61 d61Var2 = o0Var.f37655a0;
        boolean z10 = this.f716w;
        t0 t0Var = this.f697a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = t0Var.f689f;
        }
        d61Var.setTranslationX(f7);
        d61Var2.setTranslationY(t0Var.h);
        d61Var2.setPivotX(t0Var.f691r);
        d61Var2.setPivotY(t0Var.f692s);
        d61Var2.setScaleX(t0Var.f690n);
        d61Var2.setScaleY(t0Var.f690n);
    }
}
