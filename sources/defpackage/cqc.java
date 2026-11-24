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
public final class cqc {
    public final x02 a;
    public final ViewGroup b;
    public final View c;
    public final lnc d;
    public final hmc e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final aqc h;
    public final lnc i;
    public final spc j = new spc();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public lyb p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final long t;
    public final zpc u;

    public cqc(ViewGroup viewGroup, View view, lnc lncVar, hmc hmcVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, x02 x02Var) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.t = SystemClock.uptimeMillis();
        this.u = new Runnable(this) {
            public final cqc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                lyb lybVar;
                TL_wallet.walletTransaction wallettransaction2;
                byte b = r2;
                cqc cqcVar = this.b;
                switch (b) {
                    case 0:
                        lnc lncVar2 = cqcVar.d;
                        ViewGroup viewGroup2 = cqcVar.b;
                        AnimatorSet animatorSet2 = cqcVar.m;
                        lnc lncVar3 = cqcVar.i;
                        RectF rectF = cqcVar.o;
                        RectF rectF2 = cqcVar.n;
                        if (!cqcVar.s && !cqcVar.r) {
                            cqcVar.e();
                            cqcVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            hmc hmcVar2 = cqcVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = cqcVar.f;
                            q5c q5cVar = hmcVar2.u0[0];
                            lyb lybVar2 = null;
                            if (q5cVar != null) {
                                int i = 0;
                                while (true) {
                                    if (i < q5cVar.getChildCount()) {
                                        View childAt = q5cVar.getChildAt(i);
                                        if ((childAt instanceof lyb) && (wallettransaction2 = (lybVar = (lyb) childAt).S) != null && jyb.j(wallettransaction2, wallettransaction3)) {
                                            lybVar2 = lybVar;
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                            }
                            if (lybVar2 != null && lybVar2.getWidth() > 0) {
                                lyb lybVar3 = cqcVar.p;
                                if (lybVar3 != lybVar2) {
                                    if (lybVar3 != null) {
                                        lybVar3.f(false);
                                    }
                                    cqcVar.p = lybVar2;
                                    lybVar2.f(true);
                                }
                                lnc pendingDiamond = cqcVar.p.getPendingDiamond();
                                if (cqcVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !cqcVar.p.isLayoutRequested()) {
                                    rectF.set(cqcVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        cqcVar.r = true;
                                        lncVar3.c(lncVar2);
                                        lncVar3.setAlpha(1.0f);
                                        lncVar2.setAlpha(0.0f);
                                        cqcVar.j.l(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - cqcVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                cqcVar.h.postOnAnimation(cqcVar.u);
                                return;
                            }
                            cqcVar.r = true;
                            lncVar3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        cqcVar.q = true;
                        return;
                }
            }
        };
        this.a = x02Var;
        this.b = viewGroup;
        this.c = view;
        this.d = lncVar;
        this.l = lncVar.getAlpha();
        this.e = hmcVar;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a = a(lncVar, viewGroup);
        this.n = a;
        aqc aqcVar = new aqc(this, viewGroup.getContext());
        this.h = aqcVar;
        aqcVar.setClipChildren(false);
        aqcVar.setClipToPadding(false);
        aqcVar.setClickable(true);
        lnc lncVar2 = new lnc(60, viewGroup.getContext(), true);
        this.i = lncVar2;
        lncVar2.setContinuousRotation(540.0f);
        lncVar2.c(lncVar);
        lncVar2.setAlpha(0.0f);
        aqcVar.addView(lncVar2, nme.e(60, 60, 51));
        viewGroup.addView(aqcVar, new ViewGroup.LayoutParams(-1, -1));
        c(a.centerX(), a.centerY(), a.width());
        lncVar2.l(new Runnable(this) {
            public final cqc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                lyb lybVar;
                TL_wallet.walletTransaction wallettransaction2;
                byte b = r2;
                cqc cqcVar = this.b;
                switch (b) {
                    case 0:
                        lnc lncVar22 = cqcVar.d;
                        ViewGroup viewGroup2 = cqcVar.b;
                        AnimatorSet animatorSet2 = cqcVar.m;
                        lnc lncVar3 = cqcVar.i;
                        RectF rectF = cqcVar.o;
                        RectF rectF2 = cqcVar.n;
                        if (!cqcVar.s && !cqcVar.r) {
                            cqcVar.e();
                            cqcVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            hmc hmcVar2 = cqcVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = cqcVar.f;
                            q5c q5cVar = hmcVar2.u0[0];
                            lyb lybVar2 = null;
                            if (q5cVar != null) {
                                int i = 0;
                                while (true) {
                                    if (i < q5cVar.getChildCount()) {
                                        View childAt = q5cVar.getChildAt(i);
                                        if ((childAt instanceof lyb) && (wallettransaction2 = (lybVar = (lyb) childAt).S) != null && jyb.j(wallettransaction2, wallettransaction3)) {
                                            lybVar2 = lybVar;
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                            }
                            if (lybVar2 != null && lybVar2.getWidth() > 0) {
                                lyb lybVar3 = cqcVar.p;
                                if (lybVar3 != lybVar2) {
                                    if (lybVar3 != null) {
                                        lybVar3.f(false);
                                    }
                                    cqcVar.p = lybVar2;
                                    lybVar2.f(true);
                                }
                                lnc pendingDiamond = cqcVar.p.getPendingDiamond();
                                if (cqcVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !cqcVar.p.isLayoutRequested()) {
                                    rectF.set(cqcVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        cqcVar.r = true;
                                        lncVar3.c(lncVar22);
                                        lncVar3.setAlpha(1.0f);
                                        lncVar22.setAlpha(0.0f);
                                        cqcVar.j.l(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - cqcVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                cqcVar.h.postOnAnimation(cqcVar.u);
                                return;
                            }
                            cqcVar.r = true;
                            lncVar3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        cqcVar.q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new uwb(this, (byte) 18));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new bqc(this, x02Var, lncVar));
        hmcVar.S0();
        hmcVar.b1(false);
        va vaVar = hmcVar.a;
        if (vaVar != null) {
            vaVar.D0();
            hmcVar.a.f3.g1(0, 0);
            q5c q5cVar = hmcVar.u0[0];
            if (q5cVar != null) {
                l5c l5cVar = q5cVar.g3;
                q5cVar.D0();
                l5cVar.O(false);
                for (int i = 0; i < l5cVar.E.size(); i++) {
                    c4c G = l5cVar.G(i);
                    if (G != null) {
                        Object obj = G.H;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i2 = jyb.b;
                            if ((wallettransaction2 instanceof iyb ? ((iyb) wallettransaction2).a : wallettransaction2) == wallettransaction || c.t0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                q5cVar.f3.g1(i, 0);
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
        zpc zpcVar = this.u;
        aqc aqcVar = this.h;
        aqcVar.removeCallbacks(zpcVar);
        lnc lncVar = this.i;
        lncVar.l(null);
        lyb lybVar = this.p;
        if (lybVar != null && (wallettransaction = lybVar.S) != null && jyb.j(wallettransaction, this.f)) {
            lnc pendingDiamond = this.p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.c(lncVar);
            }
            this.p.f(false);
            RectF rectF = this.o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - gl.L(150.0f))) * 2.0f) / 0.6f) / gl.p;
                lyb lybVar2 = this.p;
                lybVar2.d();
                yla ylaVar = new yla(new ti4(0.0f));
                lybVar2.I = ylaVar;
                zla zlaVar = new zla(0.0f);
                zlaVar.a(0.65f);
                zlaVar.b(200.0f);
                ylaVar.m = zlaVar;
                lybVar2.I.f(0.001f);
                lybVar2.I.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                lybVar2.I.b(new h10(lybVar2, (byte) 18));
                lybVar2.I.h();
            }
        }
        lncVar.setPaused(true);
        aqcVar.removeView(lncVar);
        aqcVar.setClickable(false);
        this.d.setAlpha(this.l);
        x02 x02Var = this.a;
        ViewGroup viewGroup = this.b;
        if (x02Var == null) {
            this.c.setTranslationY(0.0f);
        } else {
            x02Var.s1(1.0f);
            if (this.j.q()) {
                hmc hmcVar = this.e;
                if (hmcVar.getParentLayout() != null) {
                    ViewGroup view = hmcVar.getParentLayout().getView();
                    if (view.isAttachedToWindow()) {
                        int[] iArr = new int[2];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr);
                        view.getLocationOnScreen(iArr2);
                        viewGroup.removeView(aqcVar);
                        aqcVar.setTranslationX(iArr[0] - iArr2[0]);
                        aqcVar.setTranslationY(iArr[1] - iArr2[1]);
                        view.addView(aqcVar, new ViewGroup.LayoutParams(-1, -1));
                        viewGroup = view;
                    }
                }
            }
        }
        this.g.run();
        gl.d3(new mhc(this, viewGroup, (byte) 25), 650L);
    }

    public final void c(float f, float f2, float f3) {
        float L = gl.L(60.0f);
        aqc aqcVar = this.h;
        float f4 = L / 2.0f;
        lnc lncVar = this.i;
        lncVar.setTranslationX((f - aqcVar.getLeft()) - f4);
        lncVar.setTranslationY((f2 - aqcVar.getTop()) - f4);
        float f5 = f3 / L;
        lncVar.setScaleX(f5);
        lncVar.setScaleY(f5);
    }

    public final RectF d(lnc lncVar) {
        x02 x02Var = this.a;
        ViewGroup viewGroup = this.b;
        if (x02Var == null) {
            return a(lncVar, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) lncVar.getRootView();
        RectF a = a(lncVar, viewGroup2);
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
        x02 x02Var = this.a;
        lnc lncVar = this.d;
        if (x02Var == null) {
            f(lncVar, this.c, viewGroup, rectF);
        } else if (lncVar.isAttachedToWindow() && lncVar.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(lncVar, viewGroup));
            rectF.offset(0.0f, x02Var.i4 - x02Var.s2);
        }
    }
}
