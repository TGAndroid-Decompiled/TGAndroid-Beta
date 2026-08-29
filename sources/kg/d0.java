package kg;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import bg.b3;
import bg.c1;
import bg.d1;
import bg.z2;
import i7.f6;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import jh.w2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.pv;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.a51;
import org.telegram.ui.e51;
import org.telegram.ui.m51;
import org.telegram.ui.q41;
import org.telegram.ui.tn;
import org.telegram.ui.x41;
public final class d0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final c0 f13681a;
    public final WindowManager f13682b;
    public final d1 f13683c;
    public final boolean d;
    public float f13684e;
    public float f13686g;
    public float h;
    public float f13688j;
    public boolean f13689k;
    public boolean f13690l;
    public final z f13691m;
    public final fk0 f13692n;
    public final List f13693o;
    public xb0 f13694p;
    public boolean f13695q;
    public final o2 f13696r;
    public final c6 f13697s;
    public float f13698t;
    public float f13699u;
    public boolean v;
    public boolean f13700w;
    public ValueAnimator f13701x;
    public final int f13702y;
    public ng.d f13703z;
    public final RectF f13685f = new RectF();
    public final RectF f13687i = new RectF();

    public d0(int i10, o2 o2Var, ArrayList arrayList, HashSet hashSet, fk0 fk0Var, c6 c6Var, boolean z10) {
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
        this.f13702y = i10;
        this.f13693o = arrayList;
        this.f13696r = o2Var;
        this.f13697s = c6Var;
        if (o2Var != null) {
            context = o2Var.getContext();
        } else {
            context = fk0Var.getContext();
        }
        Context context2 = context;
        d1 d1Var = new d1(this, context2);
        this.f13683c = d1Var;
        d1Var.setOnClickListener(new ag.o(this, 24));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        c0 c0Var = new c0(this, context2);
        this.f13681a = c0Var;
        int windowType = fk0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        z zVar = new z(this, o2Var, context2, windowType, z12, c6Var, fk0Var, o2Var);
        this.f13691m = zVar;
        zVar.setOutlineProvider(new a0(this));
        zVar.setClipToOutline(true);
        boolean z14 = fk0Var.f28436b1;
        boolean z15 = fk0Var.f28439c1;
        if (zVar.G1 != z14) {
            zVar.G1 = z14;
            zVar.H1 = z15;
            a51 a51Var = zVar.f37326d0;
            if (a51Var != null) {
                a51Var.invalidate();
            }
            q41 q41Var = zVar.f37329e0;
            if (q41Var != null) {
                q41Var.invalidate();
            }
        }
        zVar.setOnLongPressedListener(new m5.i(fk0Var, 20));
        zVar.setOnRecentClearedListener(new ya.a(11));
        zVar.setRecentReactions(arrayList);
        zVar.setSelectedReactions(hashSet);
        zVar.setDrawBackground(false);
        zVar.s(null);
        c0Var.addView(zVar, f6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 5) {
            i11 = 2;
        } else {
            i11 = 16;
        }
        if (i10 == 5) {
            c0Var.setClipChildren(false);
            c0Var.setClipToPadding(false);
            d1Var.setClipChildren(false);
            d1Var.setClipToPadding(false);
        }
        if (i10 == 5) {
            i12 = 85;
        } else {
            i12 = 48;
        }
        float f9 = i11;
        d1Var.addView(c0Var, f6.d(-1, -1.0f, i12, f9, f9, f9, 16.0f));
        d1Var.setClipChildren(false);
        if (i10 == 1 || (fk0Var.getDelegate() != null && fk0Var.getDelegate().O())) {
            zVar.setBackgroundDelegate(new w(0, this, fk0Var));
        }
        if (z13) {
            ((ViewGroup) fk0Var.getParent()).addView(d1Var);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f13682b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, d1Var, b10);
            windowManager.addView(d1Var, b10);
        }
        this.f13692n = fk0Var;
        fk0Var.setOnSwitchedToLoopView(new x(this, 0));
        fk0Var.X0 = true;
        fk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new w2(17, this, fk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(d0 d0Var, boolean z10) {
        View view;
        fk0 fk0Var = d0Var.f13692n;
        z zVar = d0Var.f13691m;
        if (d0Var.E.isEmpty()) {
            d0Var.h(false);
            g0.a();
            d0Var.B.unlock();
            zVar.setEnterAnimationInProgress(false);
            a51 a51Var = zVar.f37326d0;
            if (z10) {
                zVar.W.m(false);
                a51Var.invalidate();
                ArrayList arrayList = a51Var.W2;
                a51Var.f1();
                zVar.f37321b0.b();
                zVar.sendAccessibilityEvent(32);
                fk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < a51Var.getChildCount()) {
                        if (a51Var.getChildAt(i10) instanceof m51) {
                            view = a51Var.getChildAt(i10);
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
                if (fk0Var.getPullingLeftProgress() > 0.0f) {
                    fk0Var.K0 = false;
                    ValueAnimator valueAnimator = fk0Var.f28464u0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    fk0Var.f28469x0 = 0.0f;
                    d1 d1Var = fk0Var.O;
                    if (d1Var != null) {
                        d1Var.invalidate();
                    }
                    fk0Var.invalidate();
                } else {
                    fk0Var.K0 = true;
                    ValueAnimator valueAnimator2 = fk0Var.f28464u0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    fk0Var.f28469x0 = 0.0f;
                    d1 d1Var2 = fk0Var.O;
                    if (d1Var2 != null) {
                        d1Var2.invalidate();
                    }
                    fk0Var.invalidate();
                }
                q41 q41Var = zVar.f37329e0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    e51 e51Var = (e51) arrayList.get(i11);
                    for (int i12 = 0; i12 < e51Var.K.size(); i12++) {
                        if (((m51) e51Var.K.get(i12)).f40427b) {
                            ((m51) e51Var.K.get(i12)).f40427b = false;
                            ((m51) e51Var.K.get(i12)).invalidate();
                            e51Var.k();
                        }
                    }
                }
                a51Var.invalidate();
                for (int i13 = 0; i13 < q41Var.W2.size(); i13++) {
                    e51 e51Var2 = (e51) q41Var.W2.get(i13);
                    for (int i14 = 0; i14 < e51Var2.K.size(); i14++) {
                        if (((m51) e51Var2.K.get(i14)).f40427b) {
                            ((m51) e51Var2.K.get(i14)).f40427b = false;
                            ((m51) e51Var2.K.get(i14)).invalidate();
                            e51Var2.k();
                        }
                    }
                }
                q41Var.invalidate();
                d0Var.i();
                d0Var.f13681a.invalidate();
            }
        }
    }

    public static void g(View view, float f9) {
        if (view instanceof m51) {
            ((m51) view).setAnimatedScale(f9);
        } else if (view instanceof pv) {
            view.setScaleX(f9);
            view.setScaleY(f9);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i11 = this.f13702y;
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
        char c3;
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        boolean z13;
        boolean z14;
        z zVar = this.f13691m;
        int i11 = this.f13702y;
        d1 d1Var = this.f13683c;
        int[] iArr = this.A;
        c0 c0Var = this.f13681a;
        RectF rectF = this.f13685f;
        fk0 fk0Var = this.f13692n;
        rectF.set(fk0Var.f28466w);
        this.f13684e = fk0Var.f28470y;
        int[] iArr2 = new int[2];
        if (z10) {
            fk0Var.getLocationOnScreen(iArr);
        }
        d1Var.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (zVar.K0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = fk0Var.getTopOffset() + (dp - i10);
        if (fk0Var.B0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (c0Var.getMeasuredHeight() + topOffset > d1Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (d1Var.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - c0Var.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        float f9 = 0.0f;
        if (i11 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i11 == 1) {
            c3 = 1;
            c0Var.setTranslationX(((d1Var.getMeasuredWidth() - c0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c3 = 1;
            if (i11 != 2 && i11 != 4) {
                c0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            } else {
                c0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            }
        }
        if (!z10) {
            this.f13698t = c0Var.getTranslationY();
        } else {
            this.f13698t = topOffset;
            c0Var.setTranslationY(topOffset);
        }
        float x4 = (iArr[0] - iArr2[0]) - c0Var.getX();
        this.f13686g = x4;
        float y8 = (iArr[c3] - iArr2[c3]) - c0Var.getY();
        this.h = y8;
        rectF.offset(x4, y8);
        fk0Var.setCustomEmojiEnterProgress(this.f13688j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f13700w = z14;
            this.f13689k = false;
        } else {
            this.f13700w = false;
        }
        if (this.f13700w) {
            z11 = true;
            j(0.0f, true);
        } else {
            z11 = true;
        }
        k();
        zVar.setEnterAnimationInProgress(z11);
        tv tvVar = zVar.W;
        if (z10 && this.f13700w) {
            z12 = true;
        } else {
            z12 = false;
        }
        tvVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f13701x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f13688j;
        if (i11 == 4) {
            if (z10) {
                f9 = 1.0f;
            }
            valueAnimator = ValueAnimator.ofFloat(f10, f9);
        } else {
            if (z10) {
                f9 = 1.0f;
            }
            float[] fArr = {f10, f9};
            ?? timeAnimator = new TimeAnimator();
            timeAnimator.f34184a = 0;
            timeAnimator.f34185b = 0;
            timeAnimator.setFloatValues(fArr);
            valueAnimator = timeAnimator;
        }
        this.f13701x = valueAnimator;
        valueAnimator.addUpdateListener(new c1(1, this, z10));
        if (!z10) {
            i();
        }
        this.f13701x.addListener(new z2(3, this, z10));
        if (i11 == 4) {
            this.f13701x.setDuration(420L);
            this.f13701x.setInterpolator(jr.h);
        } else if (this.f13700w) {
            this.f13701x.setDuration(450L);
            this.f13701x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f13701x.setDuration(350L);
            this.f13701x.setInterpolator(jr.f29800f);
        }
        c0Var.invalidate();
        h(true);
        if (!z10) {
            fk0Var.K0 = true;
            fk0Var.invalidate();
            this.f13701x.setStartDelay(30L);
            this.f13701x.start();
        } else {
            fk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f13701x;
            Objects.requireNonNull(valueAnimator3);
            jh.o oVar = new jh.o(valueAnimator3, 19);
            g0.f13719f = this.f13700w;
            g0.f13718e = true;
            g0.f13720g = false;
            if (g0.d) {
                g0.d = false;
            }
            g0.f13717c = oVar;
        }
        HashSet hashSet = g0.f13715a;
        pe.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f45722b == null) {
            z13 = true;
            cacheOutQueue.f45722b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        g0.f13716b = z13;
        g0.f13718e = false;
        g0.f13720g = false;
    }

    public final void d() {
        if (!this.f13695q) {
            fk0 fk0Var = this.f13692n;
            if (fk0Var != null) {
                ValueAnimator valueAnimator = fk0Var.f28464u0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                fk0Var.f28469x0 = 0.0f;
                d1 d1Var = fk0Var.O;
                if (d1Var != null) {
                    d1Var.invalidate();
                }
                fk0Var.invalidate();
            }
            mc.e();
            this.f13695q = true;
            AndroidUtilities.hideKeyboard(this.f13683c);
            c(false);
            if (this.v) {
                o2 o2Var = this.f13696r;
                if (o2Var instanceof tn) {
                    ((tn) o2Var).T9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f13695q) {
            mc.e();
            this.f13695q = true;
            d1 d1Var = this.f13683c;
            AndroidUtilities.hideKeyboard(d1Var);
            d1Var.animate().alpha(0.0f).setDuration(150L).setListener(new b0(this, 1));
            if (this.v) {
                o2 o2Var = this.f13696r;
                if (o2Var instanceof tn) {
                    ((tn) o2Var).T9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f13702y != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new x(this, 1));
    }

    public final void h(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        z zVar = this.f13691m;
        zVar.f37326d0.setLayerType(i10, null);
        zVar.f37321b0.setLayerType(i10, null);
        if (this.f13700w) {
            for (int i11 = 0; i11 < Math.min(zVar.W.f30108b.getChildCount(), 16); i11++) {
                zVar.W.f30108b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        zVar.f37318a0.setLayerType(i10, null);
        zVar.W.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            z zVar = this.f13691m;
            a51 a51Var = zVar.f37326d0;
            a51 a51Var2 = zVar.f37326d0;
            if (i10 < a51Var.getChildCount()) {
                if (a51Var2.getChildAt(i10) instanceof m51) {
                    m51 m51Var = (m51) a51Var2.getChildAt(i10);
                    if (m51Var.f40435x != null) {
                        m51Var.f40427b = false;
                        m51Var.invalidate();
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void j(float f9, boolean z10) {
        RectF rectF;
        HashSet hashSet;
        z zVar = this.f13691m;
        float y8 = zVar.getY();
        x41 x41Var = zVar.T;
        float y10 = x41Var.getY() + y8;
        a51 a51Var = zVar.f37326d0;
        int y11 = (int) (a51Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = a51Var.getChildCount();
            rectF = this.f13687i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = a51Var.getChildAt(i10);
            if (!hashSet.contains(childAt)) {
                float measuredHeight = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop() + y11;
                if (measuredHeight < rectF.bottom && measuredHeight > rectF.top && f9 != 0.0f) {
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
        int y12 = (int) (zVar.W.getY() + x41Var.getY() + zVar.getY());
        for (int i11 = 0; i11 < zVar.W.f30108b.getChildCount(); i11++) {
            View childAt2 = zVar.W.f30108b.getChildAt(i11);
            if (!hashSet.contains(childAt2)) {
                float measuredHeight2 = (childAt2.getMeasuredHeight() / 2.0f) + childAt2.getTop() + y12;
                if (measuredHeight2 < rectF.bottom && measuredHeight2 > rectF.top && f9 != 0.0f) {
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
            zVar.f37334g0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new b3(4, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 2));
            if (this.f13702y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(jr.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f13700w) {
            z zVar = this.f13691m;
            zVar.f37321b0.setAlpha(this.f13688j);
            zVar.f37326d0.setAlpha(this.f13688j);
            zVar.f37329e0.setAlpha(this.f13688j);
            zVar.W.setAlpha(this.f13688j);
            zVar.f37318a0.setAlpha(this.f13688j);
        }
    }

    public final void l() {
        float f9;
        z zVar = this.f13691m;
        x41 x41Var = zVar.T;
        x41 x41Var2 = zVar.T;
        boolean z10 = this.f13700w;
        c0 c0Var = this.f13681a;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = c0Var.f13665f;
        }
        x41Var.setTranslationX(f9);
        x41Var2.setTranslationY(c0Var.h);
        x41Var2.setPivotX(c0Var.f13667r);
        x41Var2.setPivotY(c0Var.f13668s);
        x41Var2.setScaleX(c0Var.f13666n);
        x41Var2.setScaleY(c0Var.f13666n);
    }
}
