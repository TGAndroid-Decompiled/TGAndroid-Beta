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
import org.telegram.messenger.tl;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.iw;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.zr;
import org.telegram.ui.b51;
import org.telegram.ui.j51;
import org.telegram.ui.n41;
import org.telegram.ui.sn;
import org.telegram.ui.u41;
import org.telegram.ui.x41;
import w7.z5;
public final class t0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final s0 f869a;
    public final WindowManager f870b;
    public final v f871c;
    public final boolean d;
    public float e;
    public float f873g;
    public float h;
    public float f875j;
    public boolean f876k;
    public boolean f877l;
    public final n0 f878m;
    public final fl0 f879n;
    public final List f880o;
    public wb0 f881p;
    public boolean f882q;
    public final o2 f883r;
    public final g6 f884s;
    public float f885t;
    public float f886u;
    public boolean v;
    public boolean f887w;
    public ValueAnimator f888x;
    public final int f889y;
    public dh.d f890z;
    public final RectF f872f = new RectF();
    public final RectF f874i = new RectF();

    public t0(int i10, o2 o2Var, ArrayList arrayList, HashSet hashSet, fl0 fl0Var, g6 g6Var, boolean z10) {
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
        this.f889y = i10;
        this.f880o = arrayList;
        this.f883r = o2Var;
        this.f884s = g6Var;
        if (o2Var != null) {
            context = o2Var.getContext();
        } else {
            context = fl0Var.getContext();
        }
        Context context2 = context;
        v vVar = new v(this, context2);
        this.f871c = vVar;
        vVar.setOnClickListener(new g0(this, 0));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        s0 s0Var = new s0(this, context2);
        this.f869a = s0Var;
        int windowType = fl0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        n0 n0Var = new n0(this, o2Var, context2, windowType, z12, g6Var, fl0Var, o2Var);
        this.f878m = n0Var;
        n0Var.setOutlineProvider(new o0(this));
        n0Var.setClipToOutline(true);
        boolean z14 = fl0Var.f26363g1;
        boolean z15 = fl0Var.f26365h1;
        if (n0Var.L1 != z14) {
            n0Var.L1 = z14;
            n0Var.M1 = z15;
            x41 x41Var = n0Var.f35622h0;
            if (x41Var != null) {
                x41Var.invalidate();
            }
            n41 n41Var = n0Var.f35624i0;
            if (n41Var != null) {
                n41Var.invalidate();
            }
        }
        n0Var.setOnLongPressedListener(new ya.c(fl0Var, 2));
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
        if (i10 == 1 || (fl0Var.getDelegate() != null && fl0Var.getDelegate().w())) {
            n0Var.setBackgroundDelegate(new h0(0, this, fl0Var));
        }
        if (z13) {
            ((ViewGroup) fl0Var.getParent()).addView(vVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f870b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, vVar, b10);
            windowManager.addView(vVar, b10);
        }
        this.f879n = fl0Var;
        fl0Var.setOnSwitchedToLoopView(new i0(this, 0));
        fl0Var.f26354c1 = true;
        fl0Var.invalidate();
        AndroidUtilities.runOnUIThread(new a1.f(10, this, fl0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(t0 t0Var, boolean z10) {
        View view;
        fl0 fl0Var = t0Var.f879n;
        n0 n0Var = t0Var.f878m;
        if (t0Var.E.isEmpty()) {
            t0Var.h(false);
            x0.a();
            t0Var.B.unlock();
            n0Var.setEnterAnimationInProgress(false);
            x41 x41Var = n0Var.f35622h0;
            if (z10) {
                n0Var.f35613d0.m(false);
                x41Var.invalidate();
                ArrayList arrayList = x41Var.f36223b3;
                x41Var.g1();
                n0Var.f35618f0.b();
                n0Var.sendAccessibilityEvent(32);
                fl0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < x41Var.getChildCount()) {
                        if (x41Var.getChildAt(i10) instanceof j51) {
                            view = x41Var.getChildAt(i10);
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
                if (fl0Var.getPullingLeftProgress() > 0.0f) {
                    fl0Var.O0 = false;
                    ValueAnimator valueAnimator = fl0Var.f26390y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    fl0Var.B0 = 0.0f;
                    v vVar = fl0Var.S;
                    if (vVar != null) {
                        vVar.invalidate();
                    }
                    fl0Var.invalidate();
                } else {
                    fl0Var.O0 = true;
                    ValueAnimator valueAnimator2 = fl0Var.f26390y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    fl0Var.B0 = 0.0f;
                    v vVar2 = fl0Var.S;
                    if (vVar2 != null) {
                        vVar2.invalidate();
                    }
                    fl0Var.invalidate();
                }
                n41 n41Var = n0Var.f35624i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    b51 b51Var = (b51) arrayList.get(i11);
                    for (int i12 = 0; i12 < b51Var.O.size(); i12++) {
                        if (((j51) b51Var.O.get(i12)).f38463b) {
                            ((j51) b51Var.O.get(i12)).f38463b = false;
                            ((j51) b51Var.O.get(i12)).invalidate();
                            b51Var.k();
                        }
                    }
                }
                x41Var.invalidate();
                for (int i13 = 0; i13 < n41Var.f36223b3.size(); i13++) {
                    b51 b51Var2 = (b51) n41Var.f36223b3.get(i13);
                    for (int i14 = 0; i14 < b51Var2.O.size(); i14++) {
                        if (((j51) b51Var2.O.get(i14)).f38463b) {
                            ((j51) b51Var2.O.get(i14)).f38463b = false;
                            ((j51) b51Var2.O.get(i14)).invalidate();
                            b51Var2.k();
                        }
                    }
                }
                n41Var.invalidate();
                t0Var.i();
                t0Var.f869a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof j51) {
            ((j51) view).setAnimatedScale(f7);
        } else if (view instanceof ew) {
            view.setScaleX(f7);
            view.setScaleY(f7);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i11 = this.f889y;
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
        n0 n0Var = this.f878m;
        int i11 = this.f889y;
        v vVar = this.f871c;
        int[] iArr = this.A;
        s0 s0Var = this.f869a;
        RectF rectF = this.f872f;
        fl0 fl0Var = this.f879n;
        rectF.set(fl0Var.f26385w);
        this.e = fl0Var.f26389y;
        int[] iArr2 = new int[2];
        if (z10) {
            fl0Var.getLocationOnScreen(iArr);
        }
        vVar.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (n0Var.O0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = fl0Var.getTopOffset() + (dp - i10);
        if (fl0Var.F0) {
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
            this.f885t = s0Var.getTranslationY();
        } else {
            this.f885t = topOffset;
            s0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - s0Var.getX();
        this.f873g = x10;
        float y3 = (iArr[r18] - iArr2[r18]) - s0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        fl0Var.setCustomEmojiEnterProgress(this.f875j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = r18;
            } else {
                z14 = false;
            }
            this.f887w = z14;
            this.f876k = false;
        } else {
            this.f887w = false;
        }
        if (this.f887w) {
            z11 = r18;
            j(0.0f, z11);
        } else {
            z11 = r18;
        }
        k();
        n0Var.setEnterAnimationInProgress(z11);
        iw iwVar = n0Var.f35613d0;
        if (z10 && this.f887w) {
            z12 = true;
        } else {
            z12 = false;
        }
        iwVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f888x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f875j;
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
            timeAnimator.f25109a = 0;
            timeAnimator.f25110b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f888x = valueAnimator;
        valueAnimator.addUpdateListener(new k0(0, this, z10));
        if (!z10) {
            i();
        }
        this.f888x.addListener(new p0(0, this, z10));
        if (i11 == 4) {
            this.f888x.setDuration(420L);
            this.f888x.setInterpolator(zr.h);
        } else if (this.f887w) {
            this.f888x.setDuration(450L);
            tl.l(0.5f, this.f888x);
        } else {
            this.f888x.setDuration(350L);
            this.f888x.setInterpolator(zr.f33337f);
        }
        s0Var.invalidate();
        h(true);
        if (!z10) {
            fl0Var.O0 = true;
            fl0Var.invalidate();
            this.f888x.setStartDelay(30L);
            this.f888x.start();
        } else {
            fl0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f888x;
            Objects.requireNonNull(valueAnimator3);
            a3.d dVar = new a3.d(valueAnimator3, 4);
            x0.f904f = this.f887w;
            x0.e = true;
            x0.f905g = false;
            if (x0.d) {
                x0.d = false;
            }
            x0.f903c = dVar;
        }
        HashSet hashSet = x0.f901a;
        hf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f11812b == null) {
            z13 = true;
            cacheOutQueue.f11812b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        x0.f902b = z13;
        x0.e = false;
        x0.f905g = false;
    }

    public final void d() {
        if (!this.f882q) {
            fl0 fl0Var = this.f879n;
            if (fl0Var != null) {
                ValueAnimator valueAnimator = fl0Var.f26390y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                fl0Var.B0 = 0.0f;
                v vVar = fl0Var.S;
                if (vVar != null) {
                    vVar.invalidate();
                }
                fl0Var.invalidate();
            }
            oc.e();
            this.f882q = true;
            AndroidUtilities.hideKeyboard(this.f871c);
            c(false);
            if (this.v) {
                o2 o2Var = this.f883r;
                if (o2Var instanceof sn) {
                    ((sn) o2Var).Y9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f882q) {
            oc.e();
            this.f882q = true;
            v vVar = this.f871c;
            AndroidUtilities.hideKeyboard(vVar);
            vVar.animate().alpha(0.0f).setDuration(150L).setListener(new r0(this, 1));
            if (this.v) {
                o2 o2Var = this.f883r;
                if (o2Var instanceof sn) {
                    ((sn) o2Var).Y9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f889y != 5) {
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
        n0 n0Var = this.f878m;
        n0Var.f35622h0.setLayerType(i10, null);
        n0Var.f35618f0.setLayerType(i10, null);
        if (this.f887w) {
            for (int i11 = 0; i11 < Math.min(n0Var.f35613d0.f28979b.getChildCount(), 16); i11++) {
                n0Var.f35613d0.f28979b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        n0Var.f35615e0.setLayerType(i10, null);
        n0Var.f35613d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            n0 n0Var = this.f878m;
            x41 x41Var = n0Var.f35622h0;
            x41 x41Var2 = n0Var.f35622h0;
            if (i10 < x41Var.getChildCount()) {
                if (x41Var2.getChildAt(i10) instanceof j51) {
                    j51 j51Var = (j51) x41Var2.getChildAt(i10);
                    if (j51Var.f38470x != null) {
                        j51Var.f38463b = false;
                        j51Var.invalidate();
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
        n0 n0Var = this.f878m;
        float y3 = n0Var.getY();
        u41 u41Var = n0Var.f35605a0;
        float y10 = u41Var.getY() + y3;
        x41 x41Var = n0Var.f35622h0;
        int y11 = (int) (x41Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = x41Var.getChildCount();
            rectF = this.f874i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = x41Var.getChildAt(i10);
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
        int y12 = (int) (n0Var.f35613d0.getY() + u41Var.getY() + n0Var.getY());
        for (int i11 = 0; i11 < n0Var.f35613d0.f28979b.getChildCount(); i11++) {
            View childAt2 = n0Var.f35613d0.f28979b.getChildAt(i11);
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
            n0Var.f35628k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new l0(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new q0(this, ofFloat, z10, 0));
            if (this.f889y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(zr.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f887w) {
            n0 n0Var = this.f878m;
            n0Var.f35618f0.setAlpha(this.f875j);
            n0Var.f35622h0.setAlpha(this.f875j);
            n0Var.f35624i0.setAlpha(this.f875j);
            n0Var.f35613d0.setAlpha(this.f875j);
            n0Var.f35615e0.setAlpha(this.f875j);
        }
    }

    public final void l() {
        float f7;
        n0 n0Var = this.f878m;
        u41 u41Var = n0Var.f35605a0;
        u41 u41Var2 = n0Var.f35605a0;
        boolean z10 = this.f887w;
        s0 s0Var = this.f869a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = s0Var.f861f;
        }
        u41Var.setTranslationX(f7);
        u41Var2.setTranslationY(s0Var.h);
        u41Var2.setPivotX(s0Var.f863r);
        u41Var2.setPivotY(s0Var.f864s);
        u41Var2.setScaleX(s0Var.f862n);
        u41Var2.setScaleY(s0Var.f862n);
    }
}
