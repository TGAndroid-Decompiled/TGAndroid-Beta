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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.kw;
import org.telegram.ui.Components.ow;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.a71;
import org.telegram.ui.e61;
import org.telegram.ui.fo;
import org.telegram.ui.l61;
import org.telegram.ui.o61;
import org.telegram.ui.s61;
import w7.a6;
public final class t0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final s0 f864a;
    public final WindowManager f865b;
    public final v f866c;
    public final boolean d;
    public float e;
    public float f868g;
    public float h;
    public float f870j;
    public boolean f871k;
    public boolean f872l;
    public final n0 f873m;
    public final gl0 f874n;
    public final List f875o;
    public yc0 f876p;
    public boolean f877q;
    public final m2 f878r;
    public final c6 f879s;
    public float f880t;
    public float f881u;
    public boolean v;
    public boolean f882w;
    public ValueAnimator f883x;
    public final int f884y;
    public dh.d f885z;
    public final RectF f867f = new RectF();
    public final RectF f869i = new RectF();

    public t0(int i10, m2 m2Var, ArrayList arrayList, HashSet hashSet, gl0 gl0Var, c6 c6Var, boolean z10) {
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
        this.f884y = i10;
        this.f875o = arrayList;
        this.f878r = m2Var;
        this.f879s = c6Var;
        if (m2Var != null) {
            context = m2Var.getContext();
        } else {
            context = gl0Var.getContext();
        }
        Context context2 = context;
        v vVar = new v(this, context2);
        this.f866c = vVar;
        vVar.setOnClickListener(new g0(this, 0));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.d = z11;
        s0 s0Var = new s0(this, context2);
        this.f864a = s0Var;
        int windowType = gl0Var.getWindowType();
        boolean z13 = z11;
        if (i10 != 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        n0 n0Var = new n0(this, m2Var, context2, windowType, z12, c6Var, gl0Var, m2Var);
        this.f873m = n0Var;
        n0Var.setOutlineProvider(new o0(this));
        n0Var.setClipToOutline(true);
        boolean z14 = gl0Var.f25332f1;
        boolean z15 = gl0Var.f25334g1;
        if (n0Var.K1 != z14) {
            n0Var.K1 = z14;
            n0Var.L1 = z15;
            o61 o61Var = n0Var.f39637h0;
            if (o61Var != null) {
                o61Var.invalidate();
            }
            e61 e61Var = n0Var.f39639i0;
            if (e61Var != null) {
                e61Var.invalidate();
            }
        }
        n0Var.setOnLongPressedListener(new ya.c(gl0Var, 3));
        n0Var.setOnRecentClearedListener(new sb.a(1));
        n0Var.setRecentReactions(arrayList);
        n0Var.setSelectedReactions(hashSet);
        n0Var.setDrawBackground(false);
        n0Var.s(null);
        s0Var.addView(n0Var, a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        if (i10 == 5) {
            i11 = 2;
        } else {
            i11 = 16;
        }
        if (i10 == 5) {
            s0Var.setClipChildren(false);
            s0Var.setClipToPadding(false);
            vVar.setClipChildren(false);
            vVar.setClipToPadding(false);
        }
        if (i10 == 5) {
            i12 = 85;
        } else {
            i12 = 48;
        }
        float f7 = i11;
        vVar.addView(s0Var, a6.a(-1.0f, f7, f7, f7, 16.0f, -1, i12));
        vVar.setClipChildren(false);
        if (i10 == 1 || (gl0Var.getDelegate() != null && gl0Var.getDelegate().D())) {
            n0Var.setBackgroundDelegate(new h0(0, this, gl0Var));
        }
        if (z13) {
            ((ViewGroup) gl0Var.getParent()).addView(vVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f865b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, vVar, b10);
            windowManager.addView(vVar, b10);
        }
        this.f874n = gl0Var;
        gl0Var.setOnSwitchedToLoopView(new i0(this, 0));
        gl0Var.f25322b1 = true;
        gl0Var.invalidate();
        AndroidUtilities.runOnUIThread(new a1.f(10, this, gl0Var), 50L);
        if (i10 != 5) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 7);
        }
    }

    public static void a(t0 t0Var, boolean z10) {
        View view;
        gl0 gl0Var = t0Var.f874n;
        n0 n0Var = t0Var.f873m;
        if (t0Var.E.isEmpty()) {
            t0Var.h(false);
            x0.a();
            t0Var.B.unlock();
            n0Var.setEnterAnimationInProgress(false);
            o61 o61Var = n0Var.f39637h0;
            if (z10) {
                n0Var.f39628d0.m(false);
                o61Var.invalidate();
                ArrayList arrayList = o61Var.Y2;
                o61Var.f1();
                n0Var.f39633f0.b();
                n0Var.sendAccessibilityEvent(32);
                gl0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < o61Var.getChildCount()) {
                        if (o61Var.getChildAt(i10) instanceof a71) {
                            view = o61Var.getChildAt(i10);
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
                if (gl0Var.getPullingLeftProgress() > 0.0f) {
                    gl0Var.O0 = false;
                    ValueAnimator valueAnimator = gl0Var.f25360y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    gl0Var.B0 = 0.0f;
                    v vVar = gl0Var.S;
                    if (vVar != null) {
                        vVar.invalidate();
                    }
                    gl0Var.invalidate();
                } else {
                    gl0Var.O0 = true;
                    ValueAnimator valueAnimator2 = gl0Var.f25360y0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    gl0Var.B0 = 0.0f;
                    v vVar2 = gl0Var.S;
                    if (vVar2 != null) {
                        vVar2.invalidate();
                    }
                    gl0Var.invalidate();
                }
                e61 e61Var = n0Var.f39639i0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    s61 s61Var = (s61) arrayList.get(i11);
                    for (int i12 = 0; i12 < s61Var.O.size(); i12++) {
                        if (((a71) s61Var.O.get(i12)).f34064b) {
                            ((a71) s61Var.O.get(i12)).f34064b = false;
                            ((a71) s61Var.O.get(i12)).invalidate();
                            s61Var.k();
                        }
                    }
                }
                o61Var.invalidate();
                for (int i13 = 0; i13 < e61Var.Y2.size(); i13++) {
                    s61 s61Var2 = (s61) e61Var.Y2.get(i13);
                    for (int i14 = 0; i14 < s61Var2.O.size(); i14++) {
                        if (((a71) s61Var2.O.get(i14)).f34064b) {
                            ((a71) s61Var2.O.get(i14)).f34064b = false;
                            ((a71) s61Var2.O.get(i14)).invalidate();
                            s61Var2.k();
                        }
                    }
                }
                e61Var.invalidate();
                t0Var.i();
                t0Var.f864a.invalidate();
            }
        }
    }

    public static void g(View view, float f7) {
        if (view instanceof a71) {
            ((a71) view).setAnimatedScale(f7);
        } else if (view instanceof kw) {
            view.setScaleX(f7);
            view.setScaleY(f7);
        }
    }

    public final WindowManager.LayoutParams b(boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i11 = this.f884y;
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
        n0 n0Var = this.f873m;
        int i11 = this.f884y;
        v vVar = this.f866c;
        int[] iArr = this.A;
        s0 s0Var = this.f864a;
        RectF rectF = this.f867f;
        gl0 gl0Var = this.f874n;
        rectF.set(gl0Var.f25355w);
        this.e = gl0Var.f25359y;
        int[] iArr2 = new int[2];
        if (z10) {
            gl0Var.getLocationOnScreen(iArr);
        }
        vVar.getLocationOnScreen(iArr2);
        int dp = ((iArr[1] - iArr2[1]) - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(52.0f);
        if (n0Var.O0) {
            i10 = AndroidUtilities.dp(26.0f);
        } else {
            i10 = 0;
        }
        float topOffset = gl0Var.getTopOffset() + (dp - i10);
        if (gl0Var.F0) {
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
            this.f880t = s0Var.getTranslationY();
        } else {
            this.f880t = topOffset;
            s0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - s0Var.getX();
        this.f868g = x10;
        float y3 = (iArr[r18] - iArr2[r18]) - s0Var.getY();
        this.h = y3;
        rectF.offset(x10, y3);
        gl0Var.setCustomEmojiEnterProgress(this.f870j);
        if (z10) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z14 = r18;
            } else {
                z14 = false;
            }
            this.f882w = z14;
            this.f871k = false;
        } else {
            this.f882w = false;
        }
        if (this.f882w) {
            z11 = r18;
            j(0.0f, z11);
        } else {
            z11 = r18;
        }
        k();
        n0Var.setEnterAnimationInProgress(z11);
        ow owVar = n0Var.f39628d0;
        if (z10 && this.f882w) {
            z12 = true;
        } else {
            z12 = false;
        }
        owVar.m(z12);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f883x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f10 = this.f870j;
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
            timeAnimator.f24224a = 0;
            timeAnimator.f24225b = 0;
            timeAnimator.setFloatValues(new float[]{f10, f7});
            valueAnimator = timeAnimator;
        }
        this.f883x = valueAnimator;
        valueAnimator.addUpdateListener(new k0(0, this, z10));
        if (!z10) {
            i();
        }
        this.f883x.addListener(new p0(0, this, z10));
        if (i11 == 4) {
            this.f883x.setDuration(420L);
            this.f883x.setInterpolator(es.h);
        } else if (this.f882w) {
            this.f883x.setDuration(450L);
            org.telegram.ui.Cells.d0.l(0.5f, this.f883x);
        } else {
            this.f883x.setDuration(350L);
            this.f883x.setInterpolator(es.f24771f);
        }
        s0Var.invalidate();
        h(true);
        if (!z10) {
            gl0Var.O0 = true;
            gl0Var.invalidate();
            this.f883x.setStartDelay(30L);
            this.f883x.start();
        } else {
            gl0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f883x;
            Objects.requireNonNull(valueAnimator3);
            a3.d dVar = new a3.d(valueAnimator3, 4);
            x0.f899f = this.f882w;
            x0.e = true;
            x0.f900g = false;
            if (x0.d) {
                x0.d = false;
            }
            x0.f898c = dVar;
        }
        HashSet hashSet = x0.f896a;
        hf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f10477b == null) {
            z13 = true;
            cacheOutQueue.f10477b = new CountDownLatch(1);
        } else {
            z13 = true;
        }
        x0.f897b = z13;
        x0.e = false;
        x0.f900g = false;
    }

    public final void d() {
        if (!this.f877q) {
            gl0 gl0Var = this.f874n;
            if (gl0Var != null) {
                ValueAnimator valueAnimator = gl0Var.f25360y0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                gl0Var.B0 = 0.0f;
                v vVar = gl0Var.S;
                if (vVar != null) {
                    vVar.invalidate();
                }
                gl0Var.invalidate();
            }
            sc.e();
            this.f877q = true;
            AndroidUtilities.hideKeyboard(this.f866c);
            c(false);
            if (this.v) {
                m2 m2Var = this.f878r;
                if (m2Var instanceof fo) {
                    ((fo) m2Var).Y9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f877q) {
            sc.e();
            this.f877q = true;
            v vVar = this.f866c;
            AndroidUtilities.hideKeyboard(vVar);
            vVar.animate().alpha(0.0f).setDuration(150L).setListener(new r0(this, 1));
            if (this.v) {
                m2 m2Var = this.f878r;
                if (m2Var instanceof fo) {
                    ((fo) m2Var).Y9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f884y != 5) {
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
        n0 n0Var = this.f873m;
        n0Var.f39637h0.setLayerType(i10, null);
        n0Var.f39633f0.setLayerType(i10, null);
        if (this.f882w) {
            for (int i11 = 0; i11 < Math.min(n0Var.f39628d0.f28000b.getChildCount(), 16); i11++) {
                n0Var.f39628d0.f28000b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        n0Var.f39630e0.setLayerType(i10, null);
        n0Var.f39628d0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            n0 n0Var = this.f873m;
            o61 o61Var = n0Var.f39637h0;
            o61 o61Var2 = n0Var.f39637h0;
            if (i10 < o61Var.getChildCount()) {
                if (o61Var2.getChildAt(i10) instanceof a71) {
                    a71 a71Var = (a71) o61Var2.getChildAt(i10);
                    if (a71Var.f34071x != null) {
                        a71Var.f34064b = false;
                        a71Var.invalidate();
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
        n0 n0Var = this.f873m;
        float y3 = n0Var.getY();
        l61 l61Var = n0Var.f39620a0;
        float y10 = l61Var.getY() + y3;
        o61 o61Var = n0Var.f39637h0;
        int y11 = (int) (o61Var.getY() + y10);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            int childCount = o61Var.getChildCount();
            rectF = this.f869i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = o61Var.getChildAt(i10);
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
        int y12 = (int) (n0Var.f39628d0.getY() + l61Var.getY() + n0Var.getY());
        for (int i11 = 0; i11 < n0Var.f39628d0.f28000b.getChildCount(); i11++) {
            View childAt2 = n0Var.f39628d0.f28000b.getChildAt(i11);
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
            n0Var.f39643k0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new l0(0, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new q0(this, ofFloat, z10, 0));
            if (this.f884y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(es.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f882w) {
            n0 n0Var = this.f873m;
            n0Var.f39633f0.setAlpha(this.f870j);
            n0Var.f39637h0.setAlpha(this.f870j);
            n0Var.f39639i0.setAlpha(this.f870j);
            n0Var.f39628d0.setAlpha(this.f870j);
            n0Var.f39630e0.setAlpha(this.f870j);
        }
    }

    public final void l() {
        float f7;
        n0 n0Var = this.f873m;
        l61 l61Var = n0Var.f39620a0;
        l61 l61Var2 = n0Var.f39620a0;
        boolean z10 = this.f882w;
        s0 s0Var = this.f864a;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = s0Var.f856f;
        }
        l61Var.setTranslationX(f7);
        l61Var2.setTranslationY(s0Var.h);
        l61Var2.setPivotX(s0Var.f858r);
        l61Var2.setPivotY(s0Var.f859s);
        l61Var2.setScaleX(s0Var.f857n);
        l61Var2.setScaleY(s0Var.f857n);
    }
}
