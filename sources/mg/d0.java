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
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.xv;
import org.telegram.ui.b51;
import org.telegram.ui.j51;
import org.telegram.ui.m51;
import org.telegram.ui.q51;
import org.telegram.ui.xn;
import org.telegram.ui.y51;
public final class d0 {
    public final int[] A;
    public final AnimationNotificationsLocker B;
    public boolean C;
    public final HashSet D;
    public final ArrayList E;
    public int F;
    public final c0 f13972a;
    public final WindowManager f13973b;
    public final ah.d f13974c;
    public final boolean d;
    public float e;
    public float f13976g;
    public float h;
    public float f13978j;
    public boolean f13979k;
    public boolean f13980l;
    public final z f13981m;
    public final pk0 f13982n;
    public final List f13983o;
    public cc0 f13984p;
    public boolean f13985q;
    public final p2 f13986r;
    public final f6 f13987s;
    public float f13988t;
    public float f13989u;
    public boolean v;
    public boolean f13990w;
    public ValueAnimator f13991x;
    public final int f13992y;
    public pg.b f13993z;
    public final RectF f13975f = new RectF();
    public final RectF f13977i = new RectF();

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
        this.f13992y = i10;
        this.f13983o = arrayList;
        this.f13986r = p2Var;
        this.f13987s = f6Var;
        if (p2Var != null) {
            context = p2Var.getContext();
        } else {
            context = pk0Var.getContext();
        }
        Context context2 = context;
        ah.d dVar = new ah.d(this, context2);
        this.f13974c = dVar;
        dVar.setOnClickListener(new androidx.mediarouter.app.c(this, 24));
        if (i10 != 2 && i10 != 4 && i10 != 5 && !z4) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.d = z10;
        c0 c0Var = new c0(this, context2);
        this.f13972a = c0Var;
        int windowType = pk0Var.getWindowType();
        boolean z12 = z10;
        if (i10 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        z zVar = new z(this, p2Var, context2, windowType, z11, f6Var, pk0Var, p2Var);
        this.f13981m = zVar;
        zVar.setOutlineProvider(new a0(this));
        zVar.setClipToOutline(true);
        boolean z13 = pk0Var.f27893c1;
        boolean z14 = pk0Var.f27895d1;
        if (zVar.H1 != z13) {
            zVar.H1 = z13;
            zVar.I1 = z14;
            m51 m51Var = zVar.f37605e0;
            if (m51Var != null) {
                m51Var.invalidate();
            }
            b51 b51Var = zVar.f37608f0;
            if (b51Var != null) {
                b51Var.invalidate();
            }
        }
        zVar.setOnLongPressedListener(new androidx.biometric.f0(pk0Var, 21));
        zVar.setOnRecentClearedListener(new cb.b(13));
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
            dVar.setClipChildren(false);
            dVar.setClipToPadding(false);
        }
        if (i10 == 5) {
            i12 = 85;
        } else {
            i12 = 48;
        }
        float f10 = i11;
        dVar.addView(c0Var, b6.d(-1, -1.0f, i12, f10, f10, f10, 16.0f));
        dVar.setClipChildren(false);
        if (i10 == 1 || (pk0Var.getDelegate() != null && pk0Var.getDelegate().s())) {
            zVar.setBackgroundDelegate(new w(0, this, pk0Var));
        }
        if (z12) {
            ((ViewGroup) pk0Var.getParent()).addView(dVar);
        } else {
            WindowManager.LayoutParams b10 = b(false);
            WindowManager windowManager = AndroidUtilities.findActivity(context2).getWindowManager();
            this.f13973b = windowManager;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, dVar, b10);
            windowManager.addView(dVar, b10);
        }
        this.f13982n = pk0Var;
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
        pk0 pk0Var = d0Var.f13982n;
        z zVar = d0Var.f13981m;
        if (d0Var.E.isEmpty()) {
            d0Var.h(false);
            g0.a();
            d0Var.B.unlock();
            zVar.setEnterAnimationInProgress(false);
            m51 m51Var = zVar.f37605e0;
            if (z4) {
                zVar.f37595a0.m(false);
                m51Var.invalidate();
                ArrayList arrayList = m51Var.X2;
                m51Var.f1();
                zVar.f37601c0.b();
                zVar.sendAccessibilityEvent(32);
                pk0Var.setImportantForAccessibility(4);
                int i10 = 0;
                while (true) {
                    if (i10 < m51Var.getChildCount()) {
                        if (m51Var.getChildAt(i10) instanceof y51) {
                            view = m51Var.getChildAt(i10);
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
                    ValueAnimator valueAnimator = pk0Var.f27919v0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    pk0Var.f27925y0 = 0.0f;
                    ah.d dVar = pk0Var.P;
                    if (dVar != null) {
                        dVar.invalidate();
                    }
                    pk0Var.invalidate();
                } else {
                    pk0Var.L0 = true;
                    ValueAnimator valueAnimator2 = pk0Var.f27919v0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    pk0Var.f27925y0 = 0.0f;
                    ah.d dVar2 = pk0Var.P;
                    if (dVar2 != null) {
                        dVar2.invalidate();
                    }
                    pk0Var.invalidate();
                }
                b51 b51Var = zVar.f37608f0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    q51 q51Var = (q51) arrayList.get(i11);
                    for (int i12 = 0; i12 < q51Var.L.size(); i12++) {
                        if (((y51) q51Var.L.get(i12)).f40400b) {
                            ((y51) q51Var.L.get(i12)).f40400b = false;
                            ((y51) q51Var.L.get(i12)).invalidate();
                            q51Var.k();
                        }
                    }
                }
                m51Var.invalidate();
                for (int i13 = 0; i13 < b51Var.X2.size(); i13++) {
                    q51 q51Var2 = (q51) b51Var.X2.get(i13);
                    for (int i14 = 0; i14 < q51Var2.L.size(); i14++) {
                        if (((y51) q51Var2.L.get(i14)).f40400b) {
                            ((y51) q51Var2.L.get(i14)).f40400b = false;
                            ((y51) q51Var2.L.get(i14)).invalidate();
                            q51Var2.k();
                        }
                    }
                }
                b51Var.invalidate();
                d0Var.i();
                d0Var.f13972a.invalidate();
            }
        }
    }

    public static void g(View view, float f10) {
        if (view instanceof y51) {
            ((y51) view).setAnimatedScale(f10);
        } else if (view instanceof tv) {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }
    }

    public final WindowManager.LayoutParams b(boolean z4) {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        int i11 = this.f13992y;
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
        z zVar = this.f13981m;
        int i11 = this.f13992y;
        ah.d dVar = this.f13974c;
        int[] iArr = this.A;
        c0 c0Var = this.f13972a;
        RectF rectF = this.f13975f;
        pk0 pk0Var = this.f13982n;
        rectF.set(pk0Var.f27920w);
        this.e = pk0Var.f27924y;
        int[] iArr2 = new int[2];
        if (z4) {
            pk0Var.getLocationOnScreen(iArr);
        }
        dVar.getLocationOnScreen(iArr2);
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
        if (c0Var.getMeasuredHeight() + topOffset > dVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) {
            topOffset = (dVar.getMeasuredHeight() - AndroidUtilities.dp(32.0f)) - c0Var.getMeasuredHeight();
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
            c0Var.setTranslationX(((dVar.getMeasuredWidth() - c0Var.getMeasuredWidth()) / 2.0f) - AndroidUtilities.dp(16.0f));
        } else {
            c3 = 1;
            if (i11 != 2 && i11 != 4) {
                c0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(2.0f));
            } else {
                c0Var.setTranslationX((iArr[0] - iArr2[0]) - AndroidUtilities.dp(18.0f));
            }
        }
        if (!z4) {
            this.f13988t = c0Var.getTranslationY();
        } else {
            this.f13988t = topOffset;
            c0Var.setTranslationY(topOffset);
        }
        float x10 = (iArr[0] - iArr2[0]) - c0Var.getX();
        this.f13976g = x10;
        float y10 = (iArr[c3] - iArr2[c3]) - c0Var.getY();
        this.h = y10;
        rectF.offset(x10, y10);
        pk0Var.setCustomEmojiEnterProgress(this.f13978j);
        if (z4) {
            if (SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(8200)) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f13990w = z13;
            this.f13979k = false;
        } else {
            this.f13990w = false;
        }
        if (this.f13990w) {
            z10 = true;
            j(0.0f, true);
        } else {
            z10 = true;
        }
        k();
        zVar.setEnterAnimationInProgress(z10);
        xv xvVar = zVar.f37595a0;
        if (z4 && this.f13990w) {
            z11 = true;
        } else {
            z11 = false;
        }
        xvVar.m(z11);
        this.B.lock();
        ValueAnimator valueAnimator2 = this.f13991x;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.C = true;
        float f11 = this.f13978j;
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
            timeAnimator.f24689a = 0;
            timeAnimator.f24690b = 0;
            timeAnimator.setFloatValues(fArr);
            valueAnimator = timeAnimator;
        }
        this.f13991x = valueAnimator;
        valueAnimator.addUpdateListener(new b1(1, this, z4));
        if (!z4) {
            i();
        }
        this.f13991x.addListener(new w2(3, this, z4));
        if (i11 == 4) {
            this.f13991x.setDuration(420L);
            this.f13991x.setInterpolator(nr.h);
        } else if (this.f13990w) {
            this.f13991x.setDuration(450L);
            this.f13991x.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            this.f13991x.setDuration(350L);
            this.f13991x.setInterpolator(nr.f27346f);
        }
        c0Var.invalidate();
        h(true);
        if (!z4) {
            pk0Var.L0 = true;
            pk0Var.invalidate();
            this.f13991x.setStartDelay(30L);
            this.f13991x.start();
        } else {
            pk0Var.setCustomEmojiReactionsBackground(false);
            ValueAnimator valueAnimator3 = this.f13991x;
            Objects.requireNonNull(valueAnimator3);
            lh.b bVar = new lh.b(valueAnimator3, 19);
            g0.f14006f = this.f13990w;
            g0.e = true;
            g0.f14007g = false;
            if (g0.d) {
                g0.d = false;
            }
            g0.f14005c = bVar;
        }
        HashSet hashSet = g0.f14003a;
        re.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        if (cacheOutQueue.f43446b == null) {
            z12 = true;
            cacheOutQueue.f43446b = new CountDownLatch(1);
        } else {
            z12 = true;
        }
        g0.f14004b = z12;
        g0.e = false;
        g0.f14007g = false;
    }

    public final void d() {
        if (!this.f13985q) {
            pk0 pk0Var = this.f13982n;
            if (pk0Var != null) {
                ValueAnimator valueAnimator = pk0Var.f27919v0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pk0Var.f27925y0 = 0.0f;
                ah.d dVar = pk0Var.P;
                if (dVar != null) {
                    dVar.invalidate();
                }
                pk0Var.invalidate();
            }
            ic.e();
            this.f13985q = true;
            AndroidUtilities.hideKeyboard(this.f13974c);
            c(false);
            if (this.v) {
                p2 p2Var = this.f13986r;
                if (p2Var instanceof xn) {
                    ((xn) p2Var).T9(true, true);
                }
            }
        }
    }

    public final void e() {
        if (!this.f13985q) {
            ic.e();
            this.f13985q = true;
            ah.d dVar = this.f13974c;
            AndroidUtilities.hideKeyboard(dVar);
            dVar.animate().alpha(0.0f).setDuration(150L).setListener(new b0(this, 1));
            if (this.v) {
                p2 p2Var = this.f13986r;
                if (p2Var instanceof xn) {
                    ((xn) p2Var).T9(true, true);
                }
            }
        }
    }

    public final void f() {
        if (this.f13992y != 5) {
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
        z zVar = this.f13981m;
        zVar.f37605e0.setLayerType(i10, null);
        zVar.f37601c0.setLayerType(i10, null);
        if (this.f13990w) {
            for (int i11 = 0; i11 < Math.min(zVar.f37595a0.f29253b.getChildCount(), 16); i11++) {
                zVar.f37595a0.f29253b.getChildAt(i11).setLayerType(i10, null);
            }
            return;
        }
        zVar.f37598b0.setLayerType(i10, null);
        zVar.f37595a0.setLayerType(i10, null);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            z zVar = this.f13981m;
            m51 m51Var = zVar.f37605e0;
            m51 m51Var2 = zVar.f37605e0;
            if (i10 < m51Var.getChildCount()) {
                if (m51Var2.getChildAt(i10) instanceof y51) {
                    y51 y51Var = (y51) m51Var2.getChildAt(i10);
                    if (y51Var.f40407x != null) {
                        y51Var.f40400b = false;
                        y51Var.invalidate();
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
        z zVar = this.f13981m;
        float y10 = zVar.getY();
        j51 j51Var = zVar.U;
        float y11 = j51Var.getY() + y10;
        m51 m51Var = zVar.f37605e0;
        int y12 = (int) (m51Var.getY() + y11);
        ArrayList arrayList = null;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            int childCount = m51Var.getChildCount();
            rectF = this.f13977i;
            hashSet = this.D;
            if (i10 >= childCount) {
                break;
            }
            View childAt = m51Var.getChildAt(i10);
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
        int y13 = (int) (zVar.f37595a0.getY() + j51Var.getY() + zVar.getY());
        for (int i11 = 0; i11 < zVar.f37595a0.f29253b.getChildCount(); i11++) {
            View childAt2 = zVar.f37595a0.f29253b.getChildAt(i11);
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
            zVar.f37612h0.invalidate();
        }
        if (arrayList != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ag.a(5, this, arrayList));
            this.E.add(ofFloat);
            ofFloat.addListener(new androidx.fragment.app.g(this, ofFloat, z4, 2));
            if (this.f13992y == 4) {
                ofFloat.setDuration(420L);
                ofFloat.setInterpolator(nr.h);
            } else {
                ofFloat.setDuration(350L);
                ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
            }
            ofFloat.start();
        }
    }

    public final void k() {
        if (!this.f13990w) {
            z zVar = this.f13981m;
            zVar.f37601c0.setAlpha(this.f13978j);
            zVar.f37605e0.setAlpha(this.f13978j);
            zVar.f37608f0.setAlpha(this.f13978j);
            zVar.f37595a0.setAlpha(this.f13978j);
            zVar.f37598b0.setAlpha(this.f13978j);
        }
    }

    public final void l() {
        float f10;
        z zVar = this.f13981m;
        j51 j51Var = zVar.U;
        j51 j51Var2 = zVar.U;
        boolean z4 = this.f13990w;
        c0 c0Var = this.f13972a;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = c0Var.f13957f;
        }
        j51Var.setTranslationX(f10);
        j51Var2.setTranslationY(c0Var.h);
        j51Var2.setPivotX(c0Var.f13959r);
        j51Var2.setPivotY(c0Var.f13960s);
        j51Var2.setScaleX(c0Var.f13958n);
        j51Var2.setScaleY(c0Var.f13958n);
    }
}
