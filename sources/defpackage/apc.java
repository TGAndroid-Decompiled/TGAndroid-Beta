package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class apc {
    public final ViewGroup a;
    public final View b;
    public final i22 c;
    public final npc d;
    public final yv1 e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final xoc h;
    public final npc i;
    public final trc j = new trc();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public cm1 p;
    public final yoc q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final long w;
    public final woc x;

    public apc(ViewGroup viewGroup, View view, npc npcVar, yv1 yv1Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, i22 i22Var) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.w = SystemClock.uptimeMillis();
        ?? r1 = new Runnable(this) {
            public final apc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                apc apcVar = this.b;
                switch (b) {
                    case 0:
                        npc npcVar2 = apcVar.d;
                        float f = apcVar.l;
                        ViewGroup viewGroup2 = apcVar.a;
                        yoc yocVar = apcVar.q;
                        AnimatorSet animatorSet2 = apcVar.m;
                        npc npcVar3 = apcVar.i;
                        RectF rectF = apcVar.o;
                        RectF rectF2 = apcVar.n;
                        if (!apcVar.v && !apcVar.u) {
                            apcVar.e();
                            apcVar.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            cm1 M6 = apcVar.e.M6(apcVar.f);
                            if (M6 != null && M6.getWidth() > 0) {
                                cm1 cm1Var = apcVar.p;
                                if (cm1Var != M6) {
                                    if (cm1Var != null) {
                                        cm1Var.J0.i(false);
                                    }
                                    apcVar.p = M6;
                                } else {
                                    M6 = cm1Var;
                                }
                                lmc lmcVar = M6.J0.m;
                                if (apcVar.t && yocVar.n && lmcVar != null && lmcVar.n && lmcVar.getWidth() > 0 && !apcVar.p.isLayoutRequested()) {
                                    rectF.set(apcVar.c(lmcVar));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f > 0.01f) {
                                        apcVar.u = true;
                                        apcVar.p.J0.i(true);
                                        npcVar3.c(npcVar2);
                                        npcVar3.setAlpha(f);
                                        npcVar2.setAlpha(0.0f);
                                        apcVar.j.l(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - apcVar.w <= 700 && !apcVar.s && viewGroup2.isAttachedToWindow()) {
                                apcVar.h.postOnAnimation(apcVar.x);
                                return;
                            }
                            apcVar.u = true;
                            npcVar3.setAlpha(0.0f);
                            yocVar.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        apcVar.d();
                        return;
                    default:
                        apcVar.t = true;
                        return;
                }
            }
        };
        this.x = r1;
        this.c = i22Var;
        this.a = viewGroup;
        this.b = view;
        this.d = npcVar;
        this.l = npcVar.getAlpha();
        this.e = yv1Var;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a = esc.a(npcVar, viewGroup);
        this.n = a;
        e();
        xoc xocVar = new xoc(this, viewGroup.getContext());
        this.h = xocVar;
        xocVar.setClipChildren(false);
        xocVar.setClipToPadding(false);
        xocVar.setClickable(true);
        npc npcVar2 = new npc(60, viewGroup.getContext(), true);
        this.i = npcVar2;
        npcVar2.setContinuousRotation(540.0f);
        npcVar2.c(npcVar);
        npcVar2.setAlpha(0.0f);
        xocVar.addView(npcVar2, qoe.e(60, 60, 51));
        yoc yocVar = new yoc(this, viewGroup.getContext(), new Runnable(this) {
            public final apc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                apc apcVar = this.b;
                switch (b) {
                    case 0:
                        npc npcVar22 = apcVar.d;
                        float f = apcVar.l;
                        ViewGroup viewGroup2 = apcVar.a;
                        yoc yocVar2 = apcVar.q;
                        AnimatorSet animatorSet2 = apcVar.m;
                        npc npcVar3 = apcVar.i;
                        RectF rectF = apcVar.o;
                        RectF rectF2 = apcVar.n;
                        if (!apcVar.v && !apcVar.u) {
                            apcVar.e();
                            apcVar.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            cm1 M6 = apcVar.e.M6(apcVar.f);
                            if (M6 != null && M6.getWidth() > 0) {
                                cm1 cm1Var = apcVar.p;
                                if (cm1Var != M6) {
                                    if (cm1Var != null) {
                                        cm1Var.J0.i(false);
                                    }
                                    apcVar.p = M6;
                                } else {
                                    M6 = cm1Var;
                                }
                                lmc lmcVar = M6.J0.m;
                                if (apcVar.t && yocVar2.n && lmcVar != null && lmcVar.n && lmcVar.getWidth() > 0 && !apcVar.p.isLayoutRequested()) {
                                    rectF.set(apcVar.c(lmcVar));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f > 0.01f) {
                                        apcVar.u = true;
                                        apcVar.p.J0.i(true);
                                        npcVar3.c(npcVar22);
                                        npcVar3.setAlpha(f);
                                        npcVar22.setAlpha(0.0f);
                                        apcVar.j.l(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - apcVar.w <= 700 && !apcVar.s && viewGroup2.isAttachedToWindow()) {
                                apcVar.h.postOnAnimation(apcVar.x);
                                return;
                            }
                            apcVar.u = true;
                            npcVar3.setAlpha(0.0f);
                            yocVar2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        apcVar.d();
                        return;
                    default:
                        apcVar.t = true;
                        return;
                }
            }
        });
        this.q = yocVar;
        yocVar.setAlpha(0.001f);
        yocVar.setPaused(false);
        xocVar.addView(yocVar, qoe.e(60, 60, 51));
        viewGroup.addView(xocVar, new ViewGroup.LayoutParams(-1, -1));
        b(a.centerX(), a.centerY(), a.width());
        npcVar2.l(new Runnable(this) {
            public final apc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                apc apcVar = this.b;
                switch (b) {
                    case 0:
                        npc npcVar22 = apcVar.d;
                        float f = apcVar.l;
                        ViewGroup viewGroup2 = apcVar.a;
                        yoc yocVar2 = apcVar.q;
                        AnimatorSet animatorSet2 = apcVar.m;
                        npc npcVar3 = apcVar.i;
                        RectF rectF = apcVar.o;
                        RectF rectF2 = apcVar.n;
                        if (!apcVar.v && !apcVar.u) {
                            apcVar.e();
                            apcVar.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            cm1 M6 = apcVar.e.M6(apcVar.f);
                            if (M6 != null && M6.getWidth() > 0) {
                                cm1 cm1Var = apcVar.p;
                                if (cm1Var != M6) {
                                    if (cm1Var != null) {
                                        cm1Var.J0.i(false);
                                    }
                                    apcVar.p = M6;
                                } else {
                                    M6 = cm1Var;
                                }
                                lmc lmcVar = M6.J0.m;
                                if (apcVar.t && yocVar2.n && lmcVar != null && lmcVar.n && lmcVar.getWidth() > 0 && !apcVar.p.isLayoutRequested()) {
                                    rectF.set(apcVar.c(lmcVar));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f > 0.01f) {
                                        apcVar.u = true;
                                        apcVar.p.J0.i(true);
                                        npcVar3.c(npcVar22);
                                        npcVar3.setAlpha(f);
                                        npcVar22.setAlpha(0.0f);
                                        apcVar.j.l(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - apcVar.w <= 700 && !apcVar.s && viewGroup2.isAttachedToWindow()) {
                                apcVar.h.postOnAnimation(apcVar.x);
                                return;
                            }
                            apcVar.u = true;
                            npcVar3.setAlpha(0.0f);
                            yocVar2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        apcVar.d();
                        return;
                    default:
                        apcVar.t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new oxb(this, (byte) 13));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new zoc(this, i22Var, npcVar));
        xocVar.post(r1);
    }

    public final void a(boolean z) {
        if (this.v) {
            return;
        }
        this.v = true;
        woc wocVar = this.x;
        xoc xocVar = this.h;
        xocVar.removeCallbacks(wocVar);
        npc npcVar = this.i;
        npcVar.l(null);
        cm1 cm1Var = this.p;
        if (cm1Var != null) {
            cm1Var.J0.i(false);
            if (z && this.r >= 1.0f) {
                RectF rectF = this.o;
                if (!rectF.isEmpty() && this.p.isAttachedToWindow() && c.P(this.p.getMessageObject(), this.f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - gm.L(150.0f))) * 2.0f) / 0.6f) / gm.p;
                    mmc mmcVar = this.p.J0;
                    mmcVar.l();
                    zna znaVar = new zna(new xk4(0.0f));
                    mmcVar.b0 = znaVar;
                    aoa aoaVar = new aoa(0.0f);
                    aoaVar.a(0.65f);
                    aoaVar.b(200.0f);
                    znaVar.m = aoaVar;
                    mmcVar.b0.f(0.001f);
                    mmcVar.b0.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    mmcVar.b0.b(new gmc(mmcVar, (byte) 1));
                    mmcVar.b0.h();
                }
            }
        }
        yoc yocVar = this.q;
        yocVar.setPaused(true);
        xocVar.removeView(yocVar);
        npcVar.setPaused(true);
        xocVar.removeView(npcVar);
        xocVar.setClickable(false);
        this.d.setAlpha(this.l);
        i22 i22Var = this.c;
        ViewGroup viewGroup = this.a;
        if (i22Var == null) {
            this.b.setTranslationY(0.0f);
        } else {
            i22Var.s1(1.0f);
            if (z && this.j.q()) {
                yv1 yv1Var = this.e;
                if (yv1Var.getParentLayout() != null) {
                    ViewGroup view = yv1Var.getParentLayout().getView();
                    if (view.isAttachedToWindow()) {
                        int[] iArr = new int[2];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr);
                        view.getLocationOnScreen(iArr2);
                        viewGroup.removeView(xocVar);
                        xocVar.setTranslationX(iArr[0] - iArr2[0]);
                        xocVar.setTranslationY(iArr[1] - iArr2[1]);
                        view.addView(xocVar, new ViewGroup.LayoutParams(-1, -1));
                        viewGroup = view;
                    }
                }
            }
        }
        this.g.run();
        gm.d3(new qhc(this, viewGroup, (byte) 19), 650L);
    }

    public final void b(float f, float f2, float f3) {
        float L = gm.L(60.0f);
        xoc xocVar = this.h;
        float f4 = L / 2.0f;
        npc npcVar = this.i;
        npcVar.setTranslationX((f - xocVar.getLeft()) - f4);
        npcVar.setTranslationY((f2 - xocVar.getTop()) - f4);
        float f5 = f3 / L;
        npcVar.setScaleX(f5);
        npcVar.setScaleY(f5);
        float translationX = npcVar.getTranslationX();
        yoc yocVar = this.q;
        yocVar.setTranslationX(translationX);
        yocVar.setTranslationY(npcVar.getTranslationY());
        yocVar.setScaleX(f5);
        yocVar.setScaleY(f5);
    }

    public final RectF c(lmc lmcVar) {
        i22 i22Var = this.c;
        ViewGroup viewGroup = this.a;
        if (i22Var == null) {
            return esc.a(lmcVar, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) lmcVar.getRootView();
        RectF a = esc.a(lmcVar, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a.offset(-iArr[0], -iArr[1]);
        return a;
    }

    public final void d() {
        yoc yocVar = this.q;
        if (yocVar == null) {
            return;
        }
        npc npcVar = this.i;
        float flightYaw = npcVar.getFlightYaw();
        float flightPitch = npcVar.getFlightPitch();
        if (this.p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.r - 0.55f) / 0.45f));
            float B = mlb.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.p.J0.g() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.p.J0.k.F * 0.14f) - flightPitch) * B;
        }
        yocVar.r = flightYaw;
        yocVar.s = flightPitch;
        yocVar.w = true;
        yocVar.x = true;
    }

    public final void e() {
        npc npcVar = this.d;
        if (npcVar.isAttachedToWindow()) {
            View rootView = npcVar.getRootView();
            ViewGroup viewGroup = this.a;
            if (rootView == viewGroup.getRootView()) {
                i22 i22Var = this.c;
                RectF rectF = this.n;
                if (i22Var == null) {
                    esc.f(npcVar, this.b, viewGroup, rectF);
                    return;
                }
                rectF.set(esc.a(npcVar, viewGroup));
                rectF.offset(0.0f, i22Var.i4 - i22Var.s2);
            }
        }
    }
}
