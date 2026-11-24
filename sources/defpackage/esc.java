package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class esc {
    public final i22 a;
    public final ViewGroup b;
    public final View c;
    public final npc d;
    public final goc e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final csc h;
    public final npc i;
    public final trc j = new trc();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public m0c p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final long t;
    public final bsc u;

    public esc(ViewGroup viewGroup, View view, npc npcVar, goc gocVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, i22 i22Var) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.t = SystemClock.uptimeMillis();
        this.u = new Runnable(this) {
            public final esc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                m0c m0cVar;
                TL_wallet.walletTransaction wallettransaction2;
                byte b = r2;
                esc escVar = this.b;
                switch (b) {
                    case 0:
                        npc npcVar2 = escVar.d;
                        ViewGroup viewGroup2 = escVar.b;
                        AnimatorSet animatorSet2 = escVar.m;
                        npc npcVar3 = escVar.i;
                        RectF rectF = escVar.o;
                        RectF rectF2 = escVar.n;
                        if (!escVar.s && !escVar.r) {
                            escVar.e();
                            escVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            goc gocVar2 = escVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = escVar.f;
                            q7c q7cVar = gocVar2.u0[0];
                            m0c m0cVar2 = null;
                            if (q7cVar != null) {
                                int i = 0;
                                while (true) {
                                    if (i < q7cVar.getChildCount()) {
                                        View childAt = q7cVar.getChildAt(i);
                                        if ((childAt instanceof m0c) && (wallettransaction2 = (m0cVar = (m0c) childAt).S) != null && k0c.j(wallettransaction2, wallettransaction3)) {
                                            m0cVar2 = m0cVar;
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                            }
                            if (m0cVar2 != null && m0cVar2.getWidth() > 0) {
                                m0c m0cVar3 = escVar.p;
                                if (m0cVar3 != m0cVar2) {
                                    if (m0cVar3 != null) {
                                        m0cVar3.f(false);
                                    }
                                    escVar.p = m0cVar2;
                                    m0cVar2.f(true);
                                }
                                npc pendingDiamond = escVar.p.getPendingDiamond();
                                if (escVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !escVar.p.isLayoutRequested()) {
                                    rectF.set(escVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        escVar.r = true;
                                        npcVar3.c(npcVar2);
                                        npcVar3.setAlpha(1.0f);
                                        npcVar2.setAlpha(0.0f);
                                        escVar.j.l(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - escVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                escVar.h.postOnAnimation(escVar.u);
                                return;
                            }
                            escVar.r = true;
                            npcVar3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        escVar.q = true;
                        return;
                }
            }
        };
        this.a = i22Var;
        this.b = viewGroup;
        this.c = view;
        this.d = npcVar;
        this.l = npcVar.getAlpha();
        this.e = gocVar;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a = a(npcVar, viewGroup);
        this.n = a;
        csc cscVar = new csc(this, viewGroup.getContext());
        this.h = cscVar;
        cscVar.setClipChildren(false);
        cscVar.setClipToPadding(false);
        cscVar.setClickable(true);
        npc npcVar2 = new npc(60, viewGroup.getContext(), true);
        this.i = npcVar2;
        npcVar2.setContinuousRotation(540.0f);
        npcVar2.c(npcVar);
        npcVar2.setAlpha(0.0f);
        cscVar.addView(npcVar2, qoe.e(60, 60, 51));
        viewGroup.addView(cscVar, new ViewGroup.LayoutParams(-1, -1));
        c(a.centerX(), a.centerY(), a.width());
        npcVar2.l(new Runnable(this) {
            public final esc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                m0c m0cVar;
                TL_wallet.walletTransaction wallettransaction2;
                byte b = r2;
                esc escVar = this.b;
                switch (b) {
                    case 0:
                        npc npcVar22 = escVar.d;
                        ViewGroup viewGroup2 = escVar.b;
                        AnimatorSet animatorSet2 = escVar.m;
                        npc npcVar3 = escVar.i;
                        RectF rectF = escVar.o;
                        RectF rectF2 = escVar.n;
                        if (!escVar.s && !escVar.r) {
                            escVar.e();
                            escVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            goc gocVar2 = escVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = escVar.f;
                            q7c q7cVar = gocVar2.u0[0];
                            m0c m0cVar2 = null;
                            if (q7cVar != null) {
                                int i = 0;
                                while (true) {
                                    if (i < q7cVar.getChildCount()) {
                                        View childAt = q7cVar.getChildAt(i);
                                        if ((childAt instanceof m0c) && (wallettransaction2 = (m0cVar = (m0c) childAt).S) != null && k0c.j(wallettransaction2, wallettransaction3)) {
                                            m0cVar2 = m0cVar;
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                            }
                            if (m0cVar2 != null && m0cVar2.getWidth() > 0) {
                                m0c m0cVar3 = escVar.p;
                                if (m0cVar3 != m0cVar2) {
                                    if (m0cVar3 != null) {
                                        m0cVar3.f(false);
                                    }
                                    escVar.p = m0cVar2;
                                    m0cVar2.f(true);
                                }
                                npc pendingDiamond = escVar.p.getPendingDiamond();
                                if (escVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !escVar.p.isLayoutRequested()) {
                                    rectF.set(escVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        escVar.r = true;
                                        npcVar3.c(npcVar22);
                                        npcVar3.setAlpha(1.0f);
                                        npcVar22.setAlpha(0.0f);
                                        escVar.j.l(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - escVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                escVar.h.postOnAnimation(escVar.u);
                                return;
                            }
                            escVar.r = true;
                            npcVar3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        escVar.q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new oxb(this, (byte) 20));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new dsc(this, i22Var, npcVar));
        gocVar.T0();
        gocVar.c1(false);
        va vaVar = gocVar.a;
        if (vaVar != null) {
            vaVar.D0();
            gocVar.a.f3.g1(0, 0);
            q7c q7cVar = gocVar.u0[0];
            if (q7cVar != null) {
                l7c l7cVar = q7cVar.g3;
                q7cVar.D0();
                l7cVar.O(false);
                for (int i = 0; i < l7cVar.E.size(); i++) {
                    c6c G = l7cVar.G(i);
                    if (G != null) {
                        Object obj = G.H;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i2 = k0c.b;
                            if ((wallettransaction2 instanceof j0c ? ((j0c) wallettransaction2).a : wallettransaction2) == wallettransaction || c.t0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                q7cVar.f3.g1(i, 0);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        this.h.post(this.u);
    }

    public static RectF a(View view, ViewGroup viewGroup) {
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        while (view != viewGroup) {
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
            rectF.offset(-view.getScrollX(), -view.getScrollY());
        }
        return rectF;
    }

    public static void f(View view, View view2, ViewGroup viewGroup, RectF rectF) {
        if (view.isAttachedToWindow() && view.getWidth() > 0 && view.getHeight() > 0) {
            RectF rectF2 = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
            while (view != viewGroup) {
                view.getMatrix().mapRect(rectF2);
                if (view == view2) {
                    rectF2.offset(0.0f, -view2.getTranslationY());
                }
                rectF2.offset(view.getLeft(), view.getTop());
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    rectF2.offset(-view.getScrollX(), -view.getScrollY());
                } else {
                    return;
                }
            }
            rectF.set(rectF2);
        }
    }

    public final void b() {
        TL_wallet.walletTransaction wallettransaction;
        if (this.s) {
            return;
        }
        this.s = true;
        bsc bscVar = this.u;
        csc cscVar = this.h;
        cscVar.removeCallbacks(bscVar);
        npc npcVar = this.i;
        npcVar.l(null);
        m0c m0cVar = this.p;
        if (m0cVar != null && (wallettransaction = m0cVar.S) != null && k0c.j(wallettransaction, this.f)) {
            npc pendingDiamond = this.p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.c(npcVar);
            }
            this.p.f(false);
            RectF rectF = this.o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - gm.L(150.0f))) * 2.0f) / 0.6f) / gm.p;
                m0c m0cVar2 = this.p;
                m0cVar2.d();
                zna znaVar = new zna(new xk4(0.0f));
                m0cVar2.I = znaVar;
                aoa aoaVar = new aoa(0.0f);
                aoaVar.a(0.65f);
                aoaVar.b(200.0f);
                znaVar.m = aoaVar;
                m0cVar2.I.f(0.001f);
                m0cVar2.I.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                m0cVar2.I.b(new h20(m0cVar2, (byte) 18));
                m0cVar2.I.h();
            }
        }
        npcVar.setPaused(true);
        cscVar.removeView(npcVar);
        cscVar.setClickable(false);
        this.d.setAlpha(this.l);
        i22 i22Var = this.a;
        ViewGroup viewGroup = this.b;
        if (i22Var == null) {
            this.c.setTranslationY(0.0f);
        } else {
            i22Var.s1(1.0f);
            if (this.j.q()) {
                goc gocVar = this.e;
                if (gocVar.getParentLayout() != null) {
                    ViewGroup view = gocVar.getParentLayout().getView();
                    if (view.isAttachedToWindow()) {
                        int[] iArr = new int[2];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr);
                        view.getLocationOnScreen(iArr2);
                        viewGroup.removeView(cscVar);
                        cscVar.setTranslationX(iArr[0] - iArr2[0]);
                        cscVar.setTranslationY(iArr[1] - iArr2[1]);
                        view.addView(cscVar, new ViewGroup.LayoutParams(-1, -1));
                        viewGroup = view;
                    }
                }
            }
        }
        this.g.run();
        gm.d3(new qhc(this, viewGroup, (byte) 27), 650L);
    }

    public final void c(float f, float f2, float f3) {
        float L = gm.L(60.0f);
        csc cscVar = this.h;
        float f4 = L / 2.0f;
        npc npcVar = this.i;
        npcVar.setTranslationX((f - cscVar.getLeft()) - f4);
        npcVar.setTranslationY((f2 - cscVar.getTop()) - f4);
        float f5 = f3 / L;
        npcVar.setScaleX(f5);
        npcVar.setScaleY(f5);
    }

    public final RectF d(npc npcVar) {
        i22 i22Var = this.a;
        ViewGroup viewGroup = this.b;
        if (i22Var == null) {
            return a(npcVar, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) npcVar.getRootView();
        RectF a = a(npcVar, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a.offset(-iArr[0], -iArr[1]);
        return a;
    }

    public final void e() {
        RectF rectF = this.n;
        ViewGroup viewGroup = this.b;
        i22 i22Var = this.a;
        npc npcVar = this.d;
        if (i22Var == null) {
            f(npcVar, this.c, viewGroup, rectF);
        } else if (npcVar.isAttachedToWindow() && npcVar.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(npcVar, viewGroup));
            rectF.offset(0.0f, i22Var.i4 - i22Var.s2);
        }
    }
}
