package mg;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import dg.b1;
import dg.w2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import k7.b6;
import lh.n2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.wv;
import org.telegram.ui.f61;
import org.telegram.ui.i51;
import org.telegram.ui.q51;
import org.telegram.ui.t51;
import org.telegram.ui.x51;
import org.telegram.ui.zn;
public final class d0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final c0 f13960a;
    public final WindowManager f13961b;
    public final ah.e f13962c;
    public final boolean d;
    public float e;
    public float f13964g;
    public float h;
    public float f13966j;
    public boolean f13967k;
    public boolean f13968l;
    public final z f13969m;
    public final pk0 f13970n;
    public final List f13971o;
    public dc0 f13972p;
    public boolean f13973q;
    public final p2 f13974r;
    public final f6 f13975s;
    public float f13976t;
    public float f13977u;
    public boolean v;
    public boolean f13978w;
    public ValueAnimator f13979x;
    public final int f13980y;
    public pg.b f13981z;
    public final RectF f13963f = new RectF();
    public final RectF f13965i = new RectF();

    public d0(int i10, p2 p2Var, ArrayList arrayList, HashSet hashSet, pk0 pk0Var, f6 f6Var, boolean z4) {
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
        this.f13980y = i10;
        this.f13971o = arrayList;
        this.f13974r = p2Var;
        this.f13975s = f6Var;
        if (p2Var != null) {
            context = p2Var.getContext();
        } else {
            context = pk0Var.getContext();
        }
        Context context2 = context;
        ah.e eVar = new ah.e(this, context2);
        this.f13962c = eVar;
        eVar.setOnClickListener(new androidx.mediarouter.app.c(this, 24));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z4) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.d = z10;
        c0 c0Var = new c0(this, context2);
        this.f13960a = c0Var;
        int windowType = pk0Var.getWindowType();
        boolean z12 = z10;
        if (i10 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        z zVar = new z(this, p2Var, context2, windowType, z11, f6Var, pk0Var, p2Var);
        this.f13969m = zVar;
        zVar.setOutlineProvider(new a0(this));
        zVar.setClipToOutline(true);
        boolean z13 = pk0Var.f27888c1;
        boolean z14 = pk0Var.f27890d1;
        if (zVar.H1 != z13) {
            zVar.H1 = z13;
            zVar.I1 = z14;
            t51 t51Var = zVar.f39862e0;
            if (t51Var != null) {
                t51Var.invalidate();
            }
            i51 i51Var = zVar.f39865f0;
            if (i51Var != null) {
                i51Var.invalidate();
            }
        }
        zVar.setOnLongPressedListener(new androidx.biometric.e0(pk0Var, 20));
        zVar.setOnRecentClearedListener(new ab.a(13));
        zVar.setRecentReactions(arrayList);
        zVar.setSelectedReactions(hashSet);
        zVar.setDrawBackground(false);
        zVar.s(null);
        c0Var.addView(zVar, b6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 5) {
            i11 = 2;
        } else {
            i11 = 16;
        }
        if (i10 == 5) {
            c0Var.setClipChildren(false);
            c0Var.setClipToPadding(false);
            eVar.setClipChildren(false);
            eVar.setClipToPadding(false);
        }
        if (i10 == 5) {
            i12 = 85;
        } else {
            i12 = 48;
        }
        float f10 = i11;
        eVar.addView(c0Var, b6.d(-1, -1.0f, i12, f10, f10, f10, 16.0f));
        eVar.setClipChildren(false);
        if (i10 == 1 || (pk0Var.getDelegate() != null && pk0Var.getDelegate().o())) {
            zVar.setBackgroundDelegate(new w(0, this, pk0Var));
        }
        if (z12) {
            ((ViewGroup) pk0Var.getParent()).addView(eVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f13961b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, eVar, b10);
            windowManager.addView(eVar, b10);
        }
        this.f13970n = pk0Var;
        pk0Var.setOnSwitchedToLoopView(new x(this, 0));
        pk0Var.Y0 = true;
        pk0Var.invalidate();
        AndroidUtilities.runOnUIThread(new n2(19, this, pk0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(d0 d0Var, boolean z4) {
        View view;
        pk0 pk0Var = d0Var.f13970n;
        z zVar = d0Var.f13969m;
        if (d0Var.E.isEmpty()) {
            d0Var.h(false);
            g0.a();
            d0Var.B.unlock();
            zVar.setEnterAnimationInProgress(false);
            t51 t51Var = zVar.f39862e0;
            if (z4) {
                zVar.f39852a0.m(false);
                t51Var.invalidate();
                ArrayList arrayList = t51Var.X2;
                t51Var.e1();
                zVar.f39858c0.b();
                zVar.sendAccessibilityEvent(32);
                pk0Var.setImportantForAccessibility(4);
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
                if (pk0Var.getPullingLeftProgress() > 0.0f) {
                    pk0Var.L0 = false;
                    ValueAnimator valueAnimator = pk0Var.f27914v0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    pk0Var.f27920y0 = 0.0f;
                    ah.e eVar = pk0Var.P;
                    if (eVar != null) {
                        eVar.invalidate();
                    }
                    pk0Var.invalidate();
                } else {
                    pk0Var.L0 = true;
                    ValueAnimator valueAnimator2 = pk0Var.f27914v0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    pk0Var.f27920y0 = 0.0f;
                    ah.e eVar2 = pk0Var.P;
                    if (eVar2 != null) {
                        eVar2.invalidate();
                    }
                    pk0Var.invalidate();
                }
                i51 i51Var = zVar.f39865f0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    x51 x51Var = (x51) arrayList.get(i11);
                    for (int i12 = 0; i12 < x51Var.L.size(); i12++) {
                        if (((f61) x51Var.L.get(i12)).f33964b) {
                            ((f61) x51Var.L.get(i12)).f33964b = false;
                            ((f61) x51Var.L.get(i12)).invalidate();
                            x51Var.k();
                        }
                    }
                }
                t51Var.invalidate();
                for (int i13 = 0; i13 < i51Var.X2.size(); i13++) {
                    x51 x51Var2 = (x51) i51Var.X2.get(i13);
                    for (int i14 = 0; i14 < x51Var2.L.size(); i14++) {
                        if (((f61) x51Var2.L.get(i14)).f33964b) {
                            ((f61) x51Var2.L.get(i14)).f33964b = false;
                            ((f61) x51Var2.L.get(i14)).invalidate();
                            x51Var2.k();
                        }
                    }
                }
                i51Var.invalidate();
                d0Var.i();
                d0Var.f13960a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof f61) {
            ((f61) view).setAnimatedScale(f10);
        } else if (view instanceof sv) {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public final WindowManager.LayoutParams b(boolean z4) {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i11 = this.f13980y;
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
        z zVar = this.f13969m;
        int i11 = this.f13980y;
        ah.e eVar = this.f13962c;
        int[] iArr = this.A;
        c0 c0Var = this.f13960a;
        RectF rectF = this.f13963f;
        pk0 pk0Var = this.f13970n;
        rectF.set(pk0Var.f27915w);
        this.e = pk0Var.f27919y;
        int[] iArr2 = new int[2];
        if (z4) {
            pk0Var.getLocationOnScreen(iArr);
        }
        eVar.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (zVar.L0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = pk0Var.getTopOffset() + (dp - i10);
        if (pk0Var.C0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (c0Var.getMeasuredHeight() + topOffset > eVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (eVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - c0Var.getMeasuredHeight();
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
            c0Var.setTranslationX(((eVar.getMeasuredWidth() - c0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c3 = 1;
            if (i11 != 2 && i11 != 4) {
                c0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            } else {
                c0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            }
        }
        if (!z4) {
            this.f13976t = c0Var.getTranslationY();
        } else {
            this.f13976t = topOffset;
            c0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - c0Var.getX();
        this.f13964g = x10;
        float y10 = (iArr[c3] - iArr2[c3]) - c0Var.getY();
        this.h = y10;
        rectF.offset(x10, y10);
        pk0Var.setCustomEmojiEnterProgress(this.f13966j);
        if (z4) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f13978w = z13;
            this.f13967k = false;
        } else {
            this.f13978w = false;
        }
        if (this.f13978w) {
            z10 = true;
            j(0.0f, true);
        } else {
            z10 = true;
        }
        k();
        zVar.setEnterAnimationInProgress(z10);
        wv wvVar = zVar.f39852a0;
        if (z4 && this.f13978w) {
            z11 = true;
        } else {
            z11 = false;
        }
        wvVar.m(z11);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f13979x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f11 = this.f13966j;
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
            timeAnimator.f24708a = 0;
            timeAnimator.f24709b = 0;
            timeAnimator.setFloatValues(fArr);
            valueAnimator = timeAnimator;
        }
        this.f13979x = valueAnimator;
        valueAnimator.addUpdateListener(new b1(1, this, z4));
        if (!z4) {
            i();
        }
        this.f13979x.addListener(new w2(3, this, z4));
        if (i11 == 4) {
            this.f13979x.setDuration(420L);
            this.f13979x.setInterpolator(mr.h);
        } else if (this.f13978w) {
            this.f13979x.setDuration(450L);
            this.f13979x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f13979x.setDuration(350L);
            this.f13979x.setInterpolator(mr.f27122f);
        }
        c0Var.invalidate();
        h(true);
        if (!z4) {
            pk0Var.L0 = true;
            pk0Var.invalidate();
            this.f13979x.setStartDelay(30L);
            this.f13979x.start();
        } else {
            pk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f13979x;
            Objects.requireNonNull(valueAnimator3);
            lh.b bVar = new lh.b(valueAnimator3, 19);
            g0.f13994f = this.f13978w;
            g0.e = true;
            g0.f13995g = false;
            if (g0.d) {
                g0.d = false;
            }
            g0.f13993c = bVar;
        }
        HashSet hashSet = g0.f13991a;
        re.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f43470b == null) {
            z12 = true;
            cacheOutQueue.f43470b = new CountDownLatch(1);
        } else {
            z12 = true;
        }
        g0.f13992b = z12;
        g0.e = false;
        g0.f13995g = false;
    }

    public final void d() {
        if (!this.f13973q) {
            pk0 pk0Var = this.f13970n;
            if (pk0Var != null) {
                ValueAnimator valueAnimator = pk0Var.f27914v0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pk0Var.f27920y0 = 0.0f;
                ah.e eVar = pk0Var.P;
                if (eVar != null) {
                    eVar.invalidate();
                }
                pk0Var.invalidate();
            }
            ic.e();
            this.f13973q = true;
            AndroidUtilities.hideKeyboard(this.f13962c);
            c(false);
            if (this.v) {
                p2 p2Var = this.f13974r;
                if (p2Var instanceof zn) {
                    ((zn) p2Var).T9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f13973q) {
            ic.e();
            this.f13973q = true;
            ah.e eVar = this.f13962c;
            AndroidUtilities.hideKeyboard(eVar);
            eVar.animate().alpha(0.0f).setDuration(150L).setListener(new b0(this, 1));
            if (this.v) {
                p2 p2Var = this.f13974r;
                if (p2Var instanceof zn) {
                    ((zn) p2Var).T9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f13980y != 5) {
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
        z zVar = this.f13969m;
        zVar.f39862e0.setLayerType(i10, null);
        zVar.f39858c0.setLayerType(i10, null);
        if (this.f13978w) {
            for (int i11 = 0; i11 < Math.min(zVar.f39852a0.f28998b.getChildCount(), 16); i11++) {
                zVar.f39852a0.f28998b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        zVar.f39855b0.setLayerType(i10, null);
        zVar.f39852a0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            z zVar = this.f13969m;
            t51 t51Var = zVar.f39862e0;
            t51 t51Var2 = zVar.f39862e0;
            if (i10 < t51Var.getChildCount()) {
                if (t51Var2.getChildAt(i10) instanceof f61) {
                    f61 f61Var = (f61) t51Var2.getChildAt(i10);
                    if (f61Var.f33971x != null) {
                        f61Var.f33964b = false;
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
        z zVar = this.f13969m;
        float y10 = zVar.getY();
        q51 q51Var = zVar.U;
        float y11 = q51Var.getY() + y10;
        t51 t51Var = zVar.f39862e0;
        int y12 = (int) (t51Var.getY() + y11);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            int childCount = t51Var.getChildCount();
            rectF = this.f13965i;
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
        int y13 = (int) (zVar.f39852a0.getY() + q51Var.getY() + zVar.getY());
        for (int i11 = 0; i11 < zVar.f39852a0.f28998b.getChildCount(); i11++) {
            View childAt2 = zVar.f39852a0.f28998b.getChildAt(i11);
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
            zVar.f39869h0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ag.a(5, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z4, 2));
            if (this.f13980y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(mr.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f13978w) {
            z zVar = this.f13969m;
            zVar.f39858c0.setAlpha(this.f13966j);
            zVar.f39862e0.setAlpha(this.f13966j);
            zVar.f39865f0.setAlpha(this.f13966j);
            zVar.f39852a0.setAlpha(this.f13966j);
            zVar.f39855b0.setAlpha(this.f13966j);
        }
    }

    public final void l() {
        float f10;
        z zVar = this.f13969m;
        q51 q51Var = zVar.U;
        q51 q51Var2 = zVar.U;
        boolean z4 = this.f13978w;
        c0 c0Var = this.f13960a;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = c0Var.f13945f;
        }
        q51Var.setTranslationX(f10);
        q51Var2.setTranslationY(c0Var.h);
        q51Var2.setPivotX(c0Var.f13947r);
        q51Var2.setPivotY(c0Var.f13948s);
        q51Var2.setScaleX(c0Var.f13946n);
        q51Var2.setScaleY(c0Var.f13946n);
    }
}
