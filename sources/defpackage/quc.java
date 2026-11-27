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
public final class quc {
    public final n12 a;
    public final ViewGroup b;
    public final View c;
    public final yrc d;
    public final uqc e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final ouc h;
    public final yrc i;
    public final guc j = new guc();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public l2c p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final long t;
    public final nuc u;

    public quc(ViewGroup viewGroup, View view, yrc yrcVar, uqc uqcVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, n12 n12Var) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.t = SystemClock.uptimeMillis();
        this.u = new Runnable(this) {
            public final quc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                l2c l2cVar;
                TL_wallet.walletTransaction wallettransaction2;
                byte b = r2;
                quc qucVar = this.b;
                switch (b) {
                    case 0:
                        yrc yrcVar2 = qucVar.d;
                        ViewGroup viewGroup2 = qucVar.b;
                        AnimatorSet animatorSet2 = qucVar.m;
                        yrc yrcVar3 = qucVar.i;
                        RectF rectF = qucVar.o;
                        RectF rectF2 = qucVar.n;
                        if (!qucVar.s && !qucVar.r) {
                            qucVar.e();
                            qucVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            uqc uqcVar2 = qucVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = qucVar.f;
                            q9c q9cVar = uqcVar2.u0[0];
                            l2c l2cVar2 = null;
                            if (q9cVar != null) {
                                int i = 0;
                                while (true) {
                                    if (i < q9cVar.getChildCount()) {
                                        View childAt = q9cVar.getChildAt(i);
                                        if ((childAt instanceof l2c) && (wallettransaction2 = (l2cVar = (l2c) childAt).S) != null && j2c.j(wallettransaction2, wallettransaction3)) {
                                            l2cVar2 = l2cVar;
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                            }
                            if (l2cVar2 != null && l2cVar2.getWidth() > 0) {
                                l2c l2cVar3 = qucVar.p;
                                if (l2cVar3 != l2cVar2) {
                                    if (l2cVar3 != null) {
                                        l2cVar3.f(false);
                                    }
                                    qucVar.p = l2cVar2;
                                    l2cVar2.f(true);
                                }
                                yrc pendingDiamond = qucVar.p.getPendingDiamond();
                                if (qucVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !qucVar.p.isLayoutRequested()) {
                                    rectF.set(qucVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        qucVar.r = true;
                                        yrcVar3.c(yrcVar2);
                                        yrcVar3.setAlpha(1.0f);
                                        yrcVar2.setAlpha(0.0f);
                                        qucVar.j.l(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - qucVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                qucVar.h.postOnAnimation(qucVar.u);
                                return;
                            }
                            qucVar.r = true;
                            yrcVar3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        qucVar.q = true;
                        return;
                }
            }
        };
        this.a = n12Var;
        this.b = viewGroup;
        this.c = view;
        this.d = yrcVar;
        this.l = yrcVar.getAlpha();
        this.e = uqcVar;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a = a(yrcVar, viewGroup);
        this.n = a;
        ouc oucVar = new ouc(this, viewGroup.getContext());
        this.h = oucVar;
        oucVar.setClipChildren(false);
        oucVar.setClipToPadding(false);
        oucVar.setClickable(true);
        yrc yrcVar2 = new yrc(60, viewGroup.getContext(), true);
        this.i = yrcVar2;
        yrcVar2.setContinuousRotation(540.0f);
        yrcVar2.c(yrcVar);
        yrcVar2.setAlpha(0.0f);
        oucVar.addView(yrcVar2, tre.e(60, 60, 51));
        viewGroup.addView(oucVar, new ViewGroup.LayoutParams(-1, -1));
        c(a.centerX(), a.centerY(), a.width());
        yrcVar2.l(new Runnable(this) {
            public final quc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                l2c l2cVar;
                TL_wallet.walletTransaction wallettransaction2;
                byte b = r2;
                quc qucVar = this.b;
                switch (b) {
                    case 0:
                        yrc yrcVar22 = qucVar.d;
                        ViewGroup viewGroup2 = qucVar.b;
                        AnimatorSet animatorSet2 = qucVar.m;
                        yrc yrcVar3 = qucVar.i;
                        RectF rectF = qucVar.o;
                        RectF rectF2 = qucVar.n;
                        if (!qucVar.s && !qucVar.r) {
                            qucVar.e();
                            qucVar.c(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            uqc uqcVar2 = qucVar.e;
                            TL_wallet.walletTransaction wallettransaction3 = qucVar.f;
                            q9c q9cVar = uqcVar2.u0[0];
                            l2c l2cVar2 = null;
                            if (q9cVar != null) {
                                int i = 0;
                                while (true) {
                                    if (i < q9cVar.getChildCount()) {
                                        View childAt = q9cVar.getChildAt(i);
                                        if ((childAt instanceof l2c) && (wallettransaction2 = (l2cVar = (l2c) childAt).S) != null && j2c.j(wallettransaction2, wallettransaction3)) {
                                            l2cVar2 = l2cVar;
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                            }
                            if (l2cVar2 != null && l2cVar2.getWidth() > 0) {
                                l2c l2cVar3 = qucVar.p;
                                if (l2cVar3 != l2cVar2) {
                                    if (l2cVar3 != null) {
                                        l2cVar3.f(false);
                                    }
                                    qucVar.p = l2cVar2;
                                    l2cVar2.f(true);
                                }
                                yrc pendingDiamond = qucVar.p.getPendingDiamond();
                                if (qucVar.q && pendingDiamond != null && pendingDiamond.getWidth() > 0 && !qucVar.p.isLayoutRequested()) {
                                    rectF.set(qucVar.d(pendingDiamond));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight()) {
                                        qucVar.r = true;
                                        yrcVar3.c(yrcVar22);
                                        yrcVar3.setAlpha(1.0f);
                                        yrcVar22.setAlpha(0.0f);
                                        qucVar.j.l(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                }
                            }
                            if (SystemClock.uptimeMillis() - qucVar.t <= 450 && viewGroup2.isAttachedToWindow()) {
                                qucVar.h.postOnAnimation(qucVar.u);
                                return;
                            }
                            qucVar.r = true;
                            yrcVar3.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    default:
                        qucVar.q = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new pzb(this, (byte) 20));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new puc(this, n12Var, yrcVar));
        uqcVar.S0();
        uqcVar.b1(false);
        wa waVar = uqcVar.a;
        if (waVar != null) {
            waVar.E0();
            uqcVar.a.f3.g1(0, 0);
            q9c q9cVar = uqcVar.u0[0];
            if (q9cVar != null) {
                l9c l9cVar = q9cVar.g3;
                q9cVar.E0();
                l9cVar.O(false);
                for (int i = 0; i < l9cVar.E.size(); i++) {
                    b8c G = l9cVar.G(i);
                    if (G != null) {
                        Object obj = G.H;
                        if (obj instanceof TL_wallet.walletTransaction) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            int i2 = j2c.b;
                            if ((wallettransaction2 instanceof i2c ? ((i2c) wallettransaction2).a : wallettransaction2) == wallettransaction || c.w0((TL_wallet.walletTransaction) obj, wallettransaction)) {
                                q9cVar.f3.g1(i, 0);
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
        nuc nucVar = this.u;
        ouc oucVar = this.h;
        oucVar.removeCallbacks(nucVar);
        yrc yrcVar = this.i;
        yrcVar.l(null);
        l2c l2cVar = this.p;
        if (l2cVar != null && (wallettransaction = l2cVar.S) != null && j2c.j(wallettransaction, this.f)) {
            yrc pendingDiamond = this.p.getPendingDiamond();
            if (pendingDiamond != null) {
                pendingDiamond.c(yrcVar);
            }
            this.p.f(false);
            RectF rectF = this.o;
            if (!rectF.isEmpty()) {
                float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - hl.L(150.0f))) * 2.0f) / 0.6f) / hl.p;
                l2c l2cVar2 = this.p;
                l2cVar2.d();
                vpa vpaVar = new vpa(new xk4(0.0f));
                l2cVar2.I = vpaVar;
                wpa wpaVar = new wpa(0.0f);
                wpaVar.a(0.65f);
                wpaVar.b(200.0f);
                vpaVar.m = wpaVar;
                l2cVar2.I.f(0.001f);
                l2cVar2.I.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                l2cVar2.I.b(new i10(l2cVar2, (byte) 19));
                l2cVar2.I.h();
            }
        }
        yrcVar.setPaused(true);
        oucVar.removeView(yrcVar);
        oucVar.setClickable(false);
        this.d.setAlpha(this.l);
        n12 n12Var = this.a;
        ViewGroup viewGroup = this.b;
        if (n12Var == null) {
            this.c.setTranslationY(0.0f);
        } else {
            n12Var.t1(1.0f);
            if (this.j.q()) {
                uqc uqcVar = this.e;
                if (uqcVar.getParentLayout() != null) {
                    ViewGroup view = uqcVar.getParentLayout().getView();
                    if (view.isAttachedToWindow()) {
                        int[] iArr = new int[2];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr);
                        view.getLocationOnScreen(iArr2);
                        viewGroup.removeView(oucVar);
                        oucVar.setTranslationX(iArr[0] - iArr2[0]);
                        oucVar.setTranslationY(iArr[1] - iArr2[1]);
                        view.addView(oucVar, new ViewGroup.LayoutParams(-1, -1));
                        viewGroup = view;
                    }
                }
            }
        }
        this.g.run();
        hl.d3(new slc(this, viewGroup, (byte) 25), 650L);
    }

    public final void c(float f, float f2, float f3) {
        float L = hl.L(60.0f);
        ouc oucVar = this.h;
        float f4 = L / 2.0f;
        yrc yrcVar = this.i;
        yrcVar.setTranslationX((f - oucVar.getLeft()) - f4);
        yrcVar.setTranslationY((f2 - oucVar.getTop()) - f4);
        float f5 = f3 / L;
        yrcVar.setScaleX(f5);
        yrcVar.setScaleY(f5);
    }

    public final RectF d(yrc yrcVar) {
        n12 n12Var = this.a;
        ViewGroup viewGroup = this.b;
        if (n12Var == null) {
            return a(yrcVar, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) yrcVar.getRootView();
        RectF a = a(yrcVar, viewGroup2);
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
        n12 n12Var = this.a;
        yrc yrcVar = this.d;
        if (n12Var == null) {
            f(yrcVar, this.c, viewGroup, rectF);
        } else if (yrcVar.isAttachedToWindow() && yrcVar.getRootView() == viewGroup.getRootView()) {
            rectF.set(a(yrcVar, viewGroup));
            rectF.offset(0.0f, n12Var.i4 - n12Var.s2);
        }
    }
}
