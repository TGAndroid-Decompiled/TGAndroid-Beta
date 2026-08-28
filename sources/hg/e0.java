package hg;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import fh.o1;
import g7.e6;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.nv;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.c51;
import org.telegram.ui.k51;
import org.telegram.ui.o41;
import org.telegram.ui.qn;
import org.telegram.ui.v41;
import org.telegram.ui.y41;
public final class e0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final d0 f10574a;
    public final WindowManager f10575b;
    public final fh.v f10576c;
    public final boolean d;
    public float f10577e;
    public float f10579g;
    public float h;
    public float f10581j;
    public boolean f10582k;
    public boolean f10583l;
    public final z f10584m;
    public final uj0 f10585n;
    public final List f10586o;
    public ib0 f10587p;
    public boolean f10588q;
    public final o2 f10589r;
    public final b6 f10590s;
    public float f10591t;
    public float f10592u;
    public boolean v;
    public boolean f10593w;
    public ValueAnimator f10594x;
    public final int f10595y;
    public kg.d f10596z;
    public final RectF f10578f = new RectF();
    public final RectF f10580i = new RectF();

    public e0(int i9, o2 o2Var, ArrayList arrayList, HashSet hashSet, uj0 uj0Var, b6 b6Var, boolean z10) {
        Context context;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        new Path();
        this.A = new int[2];
        this.B = new AnimationNotificationsLocker();
        this.D = new HashSet();
        this.E = new ArrayList();
        this.F = 0;
        this.f10595y = i9;
        this.f10586o = arrayList;
        this.f10589r = o2Var;
        this.f10590s = b6Var;
        if (o2Var != null) {
            context = o2Var.getContext();
        } else {
            context = uj0Var.getContext();
        }
        Context context2 = context;
        fh.v vVar = new fh.v(this, context2);
        this.f10576c = vVar;
        vVar.setOnClickListener(new androidx.mediarouter.app.c(this, 18));
        if (i9 != 2 && i9 != 4 && i9 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        d0 d0Var = new d0(this, context2);
        this.f10574a = d0Var;
        boolean z13 = z11;
        int windowType = uj0Var.getWindowType();
        if (i9 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        z zVar = new z(this, o2Var, context2, windowType, z12, b6Var, uj0Var, o2Var);
        this.f10584m = zVar;
        zVar.setOutlineProvider(new a0(this));
        zVar.setClipToOutline(true);
        boolean z14 = uj0Var.f33047b1;
        boolean z15 = uj0Var.f33050c1;
        if (zVar.G1 != z14) {
            zVar.G1 = z14;
            zVar.H1 = z15;
            y41 y41Var = zVar.f36669d0;
            if (y41Var != null) {
                y41Var.invalidate();
            }
            o41 o41Var = zVar.f36672e0;
            if (o41Var != null) {
                o41Var.invalidate();
            }
        }
        zVar.setOnLongPressedListener(new fa.c(uj0Var, 21));
        zVar.setOnRecentClearedListener(new v9.d(9));
        zVar.setRecentReactions(arrayList);
        zVar.setSelectedReactions(hashSet);
        zVar.setDrawBackground(false);
        zVar.s(null);
        d0Var.addView(zVar, e6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        if (i9 == 5) {
            i10 = 2;
        } else {
            i10 = 16;
        }
        if (i9 == 5) {
            d0Var.setClipChildren(false);
            d0Var.setClipToPadding(false);
            vVar.setClipChildren(false);
            vVar.setClipToPadding(false);
        }
        if (i9 == 5) {
            i11 = 85;
        } else {
            i11 = 48;
        }
        float f10 = i10;
        vVar.addView(d0Var, e6.d(-1, -1.0f, i11, f10, f10, f10, 16.0f));
        vVar.setClipChildren(false);
        if (i9 == 1 || (uj0Var.getDelegate() != null && uj0Var.getDelegate().u())) {
            zVar.setBackgroundDelegate(new b5.d(24, this, uj0Var));
        }
        if (z13) {
            ((ViewGroup) uj0Var.getParent()).addView(vVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f10575b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, vVar, b10);
            windowManager.addView(vVar, b10);
        }
        this.f10585n = uj0Var;
        uj0Var.setOnSwitchedToLoopView(new w(this, 0));
        uj0Var.X0 = true;
        uj0Var.invalidate();
        AndroidUtilities.runOnUIThread(new h3.g0(4, this, uj0Var), 50L);
        if (i9 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(e0 e0Var, boolean z10) {
        View view;
        uj0 uj0Var = e0Var.f10585n;
        z zVar = e0Var.f10584m;
        if (e0Var.E.isEmpty()) {
            e0Var.h(false);
            h0.a();
            e0Var.B.unlock();
            zVar.setEnterAnimationInProgress(false);
            y41 y41Var = zVar.f36669d0;
            if (z10) {
                zVar.W.m(false);
                y41Var.invalidate();
                ArrayList arrayList = y41Var.W2;
                y41Var.f1();
                zVar.f36664b0.b();
                zVar.sendAccessibilityEvent(32);
                uj0Var.setImportantForAccessibility(4);
                int i9 = 0;
                while (true) {
                    if (i9 < y41Var.getChildCount()) {
                        if (y41Var.getChildAt(i9) instanceof k51) {
                            view = y41Var.getChildAt(i9);
                            break;
                        }
                        i9++;
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
                if (uj0Var.getPullingLeftProgress() > 0.0f) {
                    uj0Var.K0 = false;
                    ValueAnimator valueAnimator = uj0Var.f33075u0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    uj0Var.f33080x0 = 0.0f;
                    fh.v vVar = uj0Var.O;
                    if (vVar != null) {
                        vVar.invalidate();
                    }
                    uj0Var.invalidate();
                } else {
                    uj0Var.K0 = true;
                    ValueAnimator valueAnimator2 = uj0Var.f33075u0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    uj0Var.f33080x0 = 0.0f;
                    fh.v vVar2 = uj0Var.O;
                    if (vVar2 != null) {
                        vVar2.invalidate();
                    }
                    uj0Var.invalidate();
                }
                o41 o41Var = zVar.f36672e0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    c51 c51Var = (c51) arrayList.get(i10);
                    for (int i11 = 0; i11 < c51Var.K.size(); i11++) {
                        if (((k51) c51Var.K.get(i11)).f39711b) {
                            ((k51) c51Var.K.get(i11)).f39711b = false;
                            ((k51) c51Var.K.get(i11)).invalidate();
                            c51Var.k();
                        }
                    }
                }
                y41Var.invalidate();
                for (int i12 = 0; i12 < o41Var.W2.size(); i12++) {
                    c51 c51Var2 = (c51) o41Var.W2.get(i12);
                    for (int i13 = 0; i13 < c51Var2.K.size(); i13++) {
                        if (((k51) c51Var2.K.get(i13)).f39711b) {
                            ((k51) c51Var2.K.get(i13)).f39711b = false;
                            ((k51) c51Var2.K.get(i13)).invalidate();
                            c51Var2.k();
                        }
                    }
                }
                o41Var.invalidate();
                e0Var.i();
                e0Var.f10574a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof k51) {
            ((k51) view).setAnimatedScale(f10);
        } else if (view instanceof jv) {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i9;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i10 = this.f10595y;
        if (i10 != 0 && i10 != 3) {
            i9 = 99;
        } else {
            i9 = 1000;
        }
        layoutParams.type = i9;
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
        int i9;
        char c10;
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        boolean z13;
        boolean z14;
        z zVar = this.f10584m;
        int i10 = this.f10595y;
        fh.v vVar = this.f10576c;
        int[] iArr = this.A;
        d0 d0Var = this.f10574a;
        RectF rectF = this.f10578f;
        uj0 uj0Var = this.f10585n;
        rectF.set(uj0Var.f33077w);
        this.f10577e = uj0Var.f33081y;
        int[] iArr2 = new int[2];
        if (z10) {
            uj0Var.getLocationOnScreen(iArr);
        }
        vVar.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (zVar.K0) {
            i9 = AndroidUtilities.dp(26.0f);
        } else {
            i9 = 0;
        }
        float topOffset = uj0Var.getTopOffset() + (dp - i9);
        if (uj0Var.B0) {
            topOffset = (iArr[1] - iArr2[1]) - AndroidUtilities.dp(12.0f);
        }
        if (d0Var.getMeasuredHeight() + topOffset > vVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (vVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - d0Var.getMeasuredHeight();
        }
        if (topOffset < AndroidUtilities.dp(16.0f)) {
            topOffset = AndroidUtilities.dp(16.0f);
        }
        float f10 = 0.0f;
        if (i10 == 5) {
            topOffset = Math.min(topOffset, 0.0f);
        }
        if (i10 == 1) {
            c10 = 1;
            d0Var.setTranslationX(((vVar.getMeasuredWidth() - d0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c10 = 1;
            if (i10 != 2 && i10 != 4) {
                d0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            } else {
                d0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            }
        }
        if (!z10) {
            this.f10591t = d0Var.getTranslationY();
        } else {
            this.f10591t = topOffset;
            d0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - d0Var.getX();
        this.f10579g = x10;
        float y10 = (iArr[c10] - iArr2[c10]) - d0Var.getY();
        this.h = y10;
        rectF.offset(x10, y10);
        uj0Var.setCustomEmojiEnterProgress(this.f10581j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f10593w = z14;
            this.f10582k = false;
        } else {
            this.f10593w = false;
        }
        if (this.f10593w) {
            z11 = true;
            j(0.0f, true);
        } else {
            z11 = true;
        }
        k();
        zVar.setEnterAnimationInProgress(z11);
        nv nvVar = zVar.W;
        if (z10 && this.f10593w) {
            z12 = true;
        } else {
            z12 = false;
        }
        nvVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f10594x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f11 = this.f10581j;
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
            timeAnimator.f30563a = 0;
            timeAnimator.f30564b = 0;
            timeAnimator.setFloatValues(new float[]{f11, f10});
            valueAnimator = timeAnimator;
        }
        this.f10594x = valueAnimator;
        valueAnimator.addUpdateListener(new y(0, this, z10));
        if (!z10) {
            i();
        }
        this.f10594x.addListener(new b0(0, this, z10));
        if (i10 == 4) {
            this.f10594x.setDuration(420L);
            this.f10594x.setInterpolator(gr.h);
        } else if (this.f10593w) {
            this.f10594x.setDuration(450L);
            this.f10594x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f10594x.setDuration(350L);
            this.f10594x.setInterpolator(gr.f28844f);
        }
        d0Var.invalidate();
        h(true);
        if (!z10) {
            uj0Var.K0 = true;
            uj0Var.invalidate();
            this.f10594x.setStartDelay(30L);
            this.f10594x.start();
        } else {
            uj0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f10594x;
            Objects.requireNonNull(valueAnimator3);
            o1 o1Var = new o1(valueAnimator3, 27);
            h0.f10612f = this.f10593w;
            h0.f10611e = true;
            h0.f10613g = false;
            if (h0.d) {
                h0.d = false;
            }
            h0.f10610c = o1Var;
        }
        HashSet hashSet = h0.f10608a;
        me.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f17684b == null) {
            z13 = true;
            cacheOutQueue.f17684b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        h0.f10609b = z13;
        h0.f10611e = false;
        h0.f10613g = false;
    }

    public final void d() {
        if (!this.f10588q) {
            uj0 uj0Var = this.f10585n;
            if (uj0Var != null) {
                ValueAnimator valueAnimator = uj0Var.f33075u0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                uj0Var.f33080x0 = 0.0f;
                fh.v vVar = uj0Var.O;
                if (vVar != null) {
                    vVar.invalidate();
                }
                uj0Var.invalidate();
            }
            gc.e();
            this.f10588q = true;
            AndroidUtilities.hideKeyboard(this.f10576c);
            c(false);
            if (this.v) {
                o2 o2Var = this.f10589r;
                if (o2Var instanceof qn) {
                    ((qn) o2Var).T9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f10588q) {
            gc.e();
            this.f10588q = true;
            fh.v vVar = this.f10576c;
            AndroidUtilities.hideKeyboard(vVar);
            vVar.animate().alpha(0.0f).setDuration(150L).setListener(new c0(this, 1));
            if (this.v) {
                o2 o2Var = this.f10589r;
                if (o2Var instanceof qn) {
                    ((qn) o2Var).T9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f10595y != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 7);
        }
        AndroidUtilities.runOnUIThread(new w(this, 1));
    }

    public final void h(boolean z10) {
        int i9;
        if (z10) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        z zVar = this.f10584m;
        zVar.f36669d0.setLayerType(i9, null);
        zVar.f36664b0.setLayerType(i9, null);
        if (this.f10593w) {
            for (int i10 = 0; i10 < Math.min(zVar.W.f34720b.getChildCount(), 16); i10++) {
                zVar.W.f34720b.getChildAt(i10).setLayerType(i9, null);
            }
            return;
        }
        zVar.f36661a0.setLayerType(i9, null);
        zVar.W.setLayerType(i9, null);
    }

    public final void i() {
        int i9 = 0;
        while (true) {
            z zVar = this.f10584m;
            y41 y41Var = zVar.f36669d0;
            y41 y41Var2 = zVar.f36669d0;
            if (i9 < y41Var.getChildCount()) {
                if (y41Var2.getChildAt(i9) instanceof k51) {
                    k51 k51Var = (k51) y41Var2.getChildAt(i9);
                    if (k51Var.f39719x != null) {
                        k51Var.f39711b = false;
                        k51Var.invalidate();
                    }
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public final void j(float f10, boolean z10) {
        RectF rectF;
        HashSet hashSet;
        z zVar = this.f10584m;
        float y10 = zVar.getY();
        v41 v41Var = zVar.T;
        float y11 = v41Var.getY() + y10;
        y41 y41Var = zVar.f36669d0;
        int y12 = (int) (y41Var.getY() + y11);
        ArrayList arrayList = null;
        int i9 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = y41Var.getChildCount();
            rectF = this.f10580i;
            hashSet = this.D;
            if (i9 >= childCount) {
                break;
            }
            View childAt = y41Var.getChildAt(i9);
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
                    z11 = true;
                }
            }
            i9++;
        }
        int y13 = (int) (zVar.W.getY() + v41Var.getY() + zVar.getY());
        for (int i10 = 0; i10 < zVar.W.f34720b.getChildCount(); i10++) {
            View childAt2 = zVar.W.f34720b.getChildAt(i10);
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
                    z11 = true;
                }
            }
        }
        if (z11) {
            zVar.f36677g0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new f2.g(2, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z10, 1));
            if (this.f10595y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(gr.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f10593w) {
            z zVar = this.f10584m;
            zVar.f36664b0.setAlpha(this.f10581j);
            zVar.f36669d0.setAlpha(this.f10581j);
            zVar.f36672e0.setAlpha(this.f10581j);
            zVar.W.setAlpha(this.f10581j);
            zVar.f36661a0.setAlpha(this.f10581j);
        }
    }

    public final void l() {
        float f10;
        z zVar = this.f10584m;
        v41 v41Var = zVar.T;
        v41 v41Var2 = zVar.T;
        boolean z10 = this.f10593w;
        d0 d0Var = this.f10574a;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = d0Var.f10567f;
        }
        v41Var.setTranslationX(f10);
        v41Var2.setTranslationY(d0Var.h);
        v41Var2.setPivotX(d0Var.f10569r);
        v41Var2.setPivotY(d0Var.f10570s);
        v41Var2.setScaleX(d0Var.f10568n);
        v41Var2.setScaleY(d0Var.f10568n);
    }
}
