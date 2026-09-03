package ng;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import eg.u2;
import eg.z0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import k7.c6;
import lh.c3;
import mh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.vv;
import org.telegram.ui.Components.zv;
import org.telegram.ui.f61;
import org.telegram.ui.i51;
import org.telegram.ui.q51;
import org.telegram.ui.t51;
import org.telegram.ui.x51;
import org.telegram.ui.xn;
public final class d0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final c0 f16035a;
    public final WindowManager f16036b;
    public final ag.l f16037c;
    public final boolean d;
    public float f16038e;
    public float f16040g;
    public float h;
    public float f16042j;
    public boolean f16043k;
    public boolean f16044l;
    public final z f16045m;
    public final qk0 f16046n;
    public final List f16047o;
    public ec0 f16048p;
    public boolean f16049q;
    public final p2 f16050r;
    public final g6 f16051s;
    public float f16052t;
    public float f16053u;
    public boolean v;
    public boolean f16054w;
    public ValueAnimator f16055x;
    public final int f16056y;
    public qg.b f16057z;
    public final RectF f16039f = new RectF();
    public final RectF f16041i = new RectF();

    public d0(int i10, p2 p2Var, ArrayList arrayList, HashSet hashSet, qk0 qk0Var, g6 g6Var, boolean z4) {
        Context context;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        new Path();
        this.A = new int[2];
        this.B = new AnimationNotificationsLocker();
        this.D = new HashSet();
        this.E = new ArrayList();
        this.F = 0;
        this.f16056y = i10;
        this.f16047o = arrayList;
        this.f16050r = p2Var;
        this.f16051s = g6Var;
        if (p2Var != null) {
            context = p2Var.getContext();
        } else {
            context = qk0Var.getContext();
        }
        Context context2 = context;
        ag.l lVar = new ag.l(this, context2);
        this.f16037c = lVar;
        lVar.setOnClickListener(new androidx.mediarouter.app.c(this, 24));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z4) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.d = z10;
        c0 c0Var = new c0(this, context2);
        this.f16035a = c0Var;
        boolean z12 = z10;
        int windowType = qk0Var.getWindowType();
        if (i10 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        z zVar = new z(this, p2Var, context2, windowType, z11, g6Var, qk0Var, p2Var);
        this.f16045m = zVar;
        zVar.setOutlineProvider(new a0(this));
        zVar.setClipToOutline(true);
        boolean z13 = qk0Var.f30431c1;
        boolean z14 = qk0Var.f30433d1;
        if (zVar.H1 != z13) {
            zVar.H1 = z13;
            zVar.I1 = z14;
            t51 t51Var = zVar.f42314e0;
            if (t51Var != null) {
                t51Var.invalidate();
            }
            i51 i51Var = zVar.f42317f0;
            if (i51Var != null) {
                i51Var.invalidate();
            }
        }
        zVar.setOnLongPressedListener(new o5.i(qk0Var, 24));
        zVar.setOnRecentClearedListener(new cb.b(13));
        zVar.setRecentReactions(arrayList);
        zVar.setSelectedReactions(hashSet);
        zVar.setDrawBackground(false);
        zVar.s(null);
        c0Var.addView(zVar, c6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 5) {
            i11 = 2;
        } else {
            i11 = 16;
        }
        if (i10 == 5) {
            c0Var.setClipChildren(false);
            c0Var.setClipToPadding(false);
            lVar.setClipChildren(false);
            lVar.setClipToPadding(false);
        }
        if (i10 == 5) {
            i12 = 85;
        } else {
            i12 = 48;
        }
        float f10 = i11;
        lVar.addView(c0Var, c6.d(-1, -1.0f, i12, f10, f10, f10, 16.0f));
        lVar.setClipChildren(false);
        if (i10 == 1 || (qk0Var.getDelegate() != null && qk0Var.getDelegate().t())) {
            zVar.setBackgroundDelegate(new w(0, this, qk0Var));
        }
        if (z12) {
            ((ViewGroup) qk0Var.getParent()).addView(lVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f16036b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, lVar, b10);
            windowManager.addView(lVar, b10);
        }
        this.f16046n = qk0Var;
        qk0Var.setOnSwitchedToLoopView(new x(this, 0));
        qk0Var.Y0 = true;
        qk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new m2(19, this, qk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(d0 d0Var, boolean z4) {
        View view;
        qk0 qk0Var = d0Var.f16046n;
        z zVar = d0Var.f16045m;
        if (d0Var.E.isEmpty()) {
            d0Var.h(false);
            g0.a();
            d0Var.B.unlock();
            zVar.setEnterAnimationInProgress(false);
            t51 t51Var = zVar.f42314e0;
            if (z4) {
                zVar.f42303a0.m(false);
                t51Var.invalidate();
                ArrayList arrayList = t51Var.X2;
                t51Var.e1();
                zVar.f42309c0.b();
                zVar.sendAccessibilityEvent(32);
                qk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < t51Var.getChildCount()) {
                        if (t51Var.getChildAt(i10) instanceof f61) {
                            view = t51Var.getChildAt(i10);
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
                    zVar.performAccessibilityAction(64, null);
                }
                if (qk0Var.getPullingLeftProgress() > 0.0f) {
                    qk0Var.L0 = false;
                    ValueAnimator valueAnimator = qk0Var.f30458v0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    qk0Var.f30464y0 = 0.0f;
                    ag.l lVar = qk0Var.P;
                    if (lVar != null) {
                        lVar.invalidate();
                    }
                    qk0Var.invalidate();
                } else {
                    qk0Var.L0 = true;
                    ValueAnimator valueAnimator2 = qk0Var.f30458v0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    qk0Var.f30464y0 = 0.0f;
                    ag.l lVar2 = qk0Var.P;
                    if (lVar2 != null) {
                        lVar2.invalidate();
                    }
                    qk0Var.invalidate();
                }
                i51 i51Var = zVar.f42317f0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    x51 x51Var = (x51) arrayList.get(i11);
                    for (int i12 = 0; i12 < x51Var.L.size(); i12++) {
                        if (((f61) x51Var.L.get(i12)).f36678b) {
                            ((f61) x51Var.L.get(i12)).f36678b = false;
                            ((f61) x51Var.L.get(i12)).invalidate();
                            x51Var.k();
                        }
                    }
                }
                t51Var.invalidate();
                for (int i13 = 0; i13 < i51Var.X2.size(); i13++) {
                    x51 x51Var2 = (x51) i51Var.X2.get(i13);
                    for (int i14 = 0; i14 < x51Var2.L.size(); i14++) {
                        if (((f61) x51Var2.L.get(i14)).f36678b) {
                            ((f61) x51Var2.L.get(i14)).f36678b = false;
                            ((f61) x51Var2.L.get(i14)).invalidate();
                            x51Var2.k();
                        }
                    }
                }
                i51Var.invalidate();
                d0Var.i();
                d0Var.f16035a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof f61) {
            ((f61) view).setAnimatedScale(f10);
        } else if (view instanceof vv) {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public final WindowManager.LayoutParams b(boolean z4) {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i11 = this.f16056y;
        if (i11 != 0 && i11 != 3) {
            i10 = 99;
        } else {
            i10 = 1000;
        }
        layoutParams.type = i10;
        layoutParams.softInputMode = 16;
        if (z4) {
            layoutParams.flags = 65792;
        } else {
            layoutParams.flags = 65800;
        }
        layoutParams.format = -3;
        return layoutParams;
    }

    public final void c(boolean z4) {
        int i10;
        char c3;
        boolean z10;
        boolean z11;
        ValueAnimator valueAnimator;
        boolean z12;
        boolean z13;
        z zVar = this.f16045m;
        int i11 = this.f16056y;
        ag.l lVar = this.f16037c;
        int[] iArr = this.A;
        c0 c0Var = this.f16035a;
        RectF rectF = this.f16039f;
        qk0 qk0Var = this.f16046n;
        rectF.set(qk0Var.f30459w);
        this.f16038e = qk0Var.f30463y;
        int[] iArr2 = new int[2];
        if (z4) {
            qk0Var.getLocationOnScreen(iArr);
        }
        lVar.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (zVar.L0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = qk0Var.getTopOffset() + (dp - i10);
        if (qk0Var.C0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (c0Var.getMeasuredHeight() + topOffset > lVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (lVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - c0Var.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        float f10 = 0.0f;
        if (i11 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i11 == 1) {
            c3 = 1;
            c0Var.setTranslationX(((lVar.getMeasuredWidth() - c0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c3 = 1;
            if (i11 != 2 && i11 != 4) {
                c0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            } else {
                c0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            }
        }
        if (!z4) {
            this.f16052t = c0Var.getTranslationY();
        } else {
            this.f16052t = topOffset;
            c0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - c0Var.getX();
        this.f16040g = x10;
        float y10 = (iArr[c3] - iArr2[c3]) - c0Var.getY();
        this.h = y10;
        rectF.offset(x10, y10);
        qk0Var.setCustomEmojiEnterProgress(this.f16042j);
        if (z4) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f16054w = z13;
            this.f16043k = false;
        } else {
            this.f16054w = false;
        }
        if (this.f16054w) {
            z10 = true;
            j(0.0f, true);
        } else {
            z10 = true;
        }
        k();
        zVar.setEnterAnimationInProgress(z10);
        zv zvVar = zVar.f42303a0;
        if (z4 && this.f16054w) {
            z11 = true;
        } else {
            z11 = false;
        }
        zvVar.m(z11);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f16055x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f11 = this.f16042j;
        if (i11 == 4) {
            if (z4) {
                f10 = 1.0f;
            }
            valueAnimator = ValueAnimator.ofFloat(f11, f10);
        } else {
            if (z4) {
                f10 = 1.0f;
            }
            float[] fArr = {f11, f10};
            ?? timeAnimator = new TimeAnimator();
            timeAnimator.f26685a = 0;
            timeAnimator.f26686b = 0;
            timeAnimator.setFloatValues(fArr);
            valueAnimator = timeAnimator;
        }
        this.f16055x = valueAnimator;
        valueAnimator.addUpdateListener(new z0(1, this, z4));
        if (!z4) {
            i();
        }
        this.f16055x.addListener(new u2(3, this, z4));
        if (i11 == 4) {
            this.f16055x.setDuration(420L);
            this.f16055x.setInterpolator(pr.h);
        } else if (this.f16054w) {
            this.f16055x.setDuration(450L);
            this.f16055x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f16055x.setDuration(350L);
            this.f16055x.setInterpolator(pr.f30168f);
        }
        c0Var.invalidate();
        h(true);
        if (!z4) {
            qk0Var.L0 = true;
            qk0Var.invalidate();
            this.f16055x.setStartDelay(30L);
            this.f16055x.start();
        } else {
            qk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f16055x;
            Objects.requireNonNull(valueAnimator3);
            c3 c3Var = new c3(valueAnimator3, 20);
            g0.f16073f = this.f16054w;
            g0.f16072e = true;
            g0.f16074g = false;
            if (g0.d) {
                g0.d = false;
            }
            g0.f16071c = c3Var;
        }
        HashSet hashSet = g0.f16069a;
        re.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f46833b == null) {
            z12 = true;
            cacheOutQueue.f46833b = new CountDownLatch(1);
        } else {
            z12 = true;
        }
        g0.f16070b = z12;
        g0.f16072e = false;
        g0.f16074g = false;
    }

    public final void d() {
        if (!this.f16049q) {
            qk0 qk0Var = this.f16046n;
            if (qk0Var != null) {
                ValueAnimator valueAnimator = qk0Var.f30458v0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                qk0Var.f30464y0 = 0.0f;
                ag.l lVar = qk0Var.P;
                if (lVar != null) {
                    lVar.invalidate();
                }
                qk0Var.invalidate();
            }
            ic.e();
            this.f16049q = true;
            AndroidUtilities.hideKeyboard(this.f16037c);
            c(false);
            if (this.v) {
                p2 p2Var = this.f16050r;
                if (p2Var instanceof xn) {
                    ((xn) p2Var).T9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f16049q) {
            ic.e();
            this.f16049q = true;
            ag.l lVar = this.f16037c;
            AndroidUtilities.hideKeyboard(lVar);
            lVar.animate().alpha(0.0f).setDuration(150L).setListener(new b0(this, 1));
            if (this.v) {
                p2 p2Var = this.f16050r;
                if (p2Var instanceof xn) {
                    ((xn) p2Var).T9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f16056y != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new x(this, 1));
    }

    public final void h(boolean z4) {
        int i10;
        if (z4) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        z zVar = this.f16045m;
        zVar.f42314e0.setLayerType(i10, null);
        zVar.f42309c0.setLayerType(i10, null);
        if (this.f16054w) {
            for (int i11 = 0; i11 < Math.min(zVar.f42303a0.f31649b.getChildCount(), 16); i11++) {
                zVar.f42303a0.f31649b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        zVar.f42306b0.setLayerType(i10, null);
        zVar.f42303a0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            z zVar = this.f16045m;
            t51 t51Var = zVar.f42314e0;
            t51 t51Var2 = zVar.f42314e0;
            if (i10 < t51Var.getChildCount()) {
                if (t51Var2.getChildAt(i10) instanceof f61) {
                    f61 f61Var = (f61) t51Var2.getChildAt(i10);
                    if (f61Var.f36686x != null) {
                        f61Var.f36678b = false;
                        f61Var.invalidate();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void j(float f10, boolean z4) {
        RectF rectF;
        HashSet hashSet;
        z zVar = this.f16045m;
        float y10 = zVar.getY();
        q51 q51Var = zVar.U;
        float y11 = q51Var.getY() + y10;
        t51 t51Var = zVar.f42314e0;
        int y12 = (int) (t51Var.getY() + y11);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            int childCount = t51Var.getChildCount();
            rectF = this.f16041i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = t51Var.getChildAt(i10);
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
            i10++;
        }
        int y13 = (int) (zVar.f42303a0.getY() + q51Var.getY() + zVar.getY());
        for (int i11 = 0; i11 < zVar.f42303a0.f31649b.getChildCount(); i11++) {
            View childAt2 = zVar.f42303a0.f31649b.getChildAt(i11);
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
            zVar.f42321h0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new bg.a(5, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z4, 2));
            if (this.f16056y == 4) {
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
        if (!this.f16054w) {
            z zVar = this.f16045m;
            zVar.f42309c0.setAlpha(this.f16042j);
            zVar.f42314e0.setAlpha(this.f16042j);
            zVar.f42317f0.setAlpha(this.f16042j);
            zVar.f42303a0.setAlpha(this.f16042j);
            zVar.f42306b0.setAlpha(this.f16042j);
        }
    }

    public final void l() {
        float f10;
        z zVar = this.f16045m;
        q51 q51Var = zVar.U;
        q51 q51Var2 = zVar.U;
        boolean z4 = this.f16054w;
        c0 c0Var = this.f16035a;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = c0Var.f16019f;
        }
        q51Var.setTranslationX(f10);
        q51Var2.setTranslationY(c0Var.h);
        q51Var2.setPivotX(c0Var.f16021r);
        q51Var2.setPivotY(c0Var.f16022s);
        q51Var2.setScaleX(c0Var.f16020n);
        q51Var2.setScaleY(c0Var.f16020n);
    }
}
