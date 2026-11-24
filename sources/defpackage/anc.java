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
public final class anc {
    public final ViewGroup a;
    public final View b;
    public final x02 c;
    public final lnc d;
    public final mu1 e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final xmc h;
    public final lnc i;
    public final spc j = new spc();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public uk1 p;
    public final ymc q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final long w;
    public final wmc x;

    public anc(ViewGroup viewGroup, View view, lnc lncVar, mu1 mu1Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, x02 x02Var) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.w = SystemClock.uptimeMillis();
        ?? r1 = new Runnable(this) {
            public final anc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                anc ancVar = this.b;
                switch (b) {
                    case 0:
                        lnc lncVar2 = ancVar.d;
                        float f = ancVar.l;
                        ViewGroup viewGroup2 = ancVar.a;
                        ymc ymcVar = ancVar.q;
                        AnimatorSet animatorSet2 = ancVar.m;
                        lnc lncVar3 = ancVar.i;
                        RectF rectF = ancVar.o;
                        RectF rectF2 = ancVar.n;
                        if (!ancVar.v && !ancVar.u) {
                            ancVar.e();
                            ancVar.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            uk1 F6 = ancVar.e.F6(ancVar.f);
                            if (F6 != null && F6.getWidth() > 0) {
                                uk1 uk1Var = ancVar.p;
                                if (uk1Var != F6) {
                                    if (uk1Var != null) {
                                        uk1Var.J0.i(false);
                                    }
                                    ancVar.p = F6;
                                } else {
                                    F6 = uk1Var;
                                }
                                mkc mkcVar = F6.J0.m;
                                if (ancVar.t && ymcVar.n && mkcVar != null && mkcVar.n && mkcVar.getWidth() > 0 && !ancVar.p.isLayoutRequested()) {
                                    rectF.set(ancVar.c(mkcVar));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f > 0.01f) {
                                        ancVar.u = true;
                                        ancVar.p.J0.i(true);
                                        lncVar3.c(lncVar2);
                                        lncVar3.setAlpha(f);
                                        lncVar2.setAlpha(0.0f);
                                        ancVar.j.l(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - ancVar.w <= 700 && !ancVar.s && viewGroup2.isAttachedToWindow()) {
                                ancVar.h.postOnAnimation(ancVar.x);
                                return;
                            }
                            ancVar.u = true;
                            lncVar3.setAlpha(0.0f);
                            ymcVar.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        ancVar.d();
                        return;
                    default:
                        ancVar.t = true;
                        return;
                }
            }
        };
        this.x = r1;
        this.c = x02Var;
        this.a = viewGroup;
        this.b = view;
        this.d = lncVar;
        this.l = lncVar.getAlpha();
        this.e = mu1Var;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a = cqc.a(lncVar, viewGroup);
        this.n = a;
        e();
        xmc xmcVar = new xmc(this, viewGroup.getContext());
        this.h = xmcVar;
        xmcVar.setClipChildren(false);
        xmcVar.setClipToPadding(false);
        xmcVar.setClickable(true);
        lnc lncVar2 = new lnc(60, viewGroup.getContext(), true);
        this.i = lncVar2;
        lncVar2.setContinuousRotation(540.0f);
        lncVar2.c(lncVar);
        lncVar2.setAlpha(0.0f);
        xmcVar.addView(lncVar2, nme.e(60, 60, 51));
        ymc ymcVar = new ymc(this, viewGroup.getContext(), new Runnable(this) {
            public final anc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                anc ancVar = this.b;
                switch (b) {
                    case 0:
                        lnc lncVar22 = ancVar.d;
                        float f = ancVar.l;
                        ViewGroup viewGroup2 = ancVar.a;
                        ymc ymcVar2 = ancVar.q;
                        AnimatorSet animatorSet2 = ancVar.m;
                        lnc lncVar3 = ancVar.i;
                        RectF rectF = ancVar.o;
                        RectF rectF2 = ancVar.n;
                        if (!ancVar.v && !ancVar.u) {
                            ancVar.e();
                            ancVar.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            uk1 F6 = ancVar.e.F6(ancVar.f);
                            if (F6 != null && F6.getWidth() > 0) {
                                uk1 uk1Var = ancVar.p;
                                if (uk1Var != F6) {
                                    if (uk1Var != null) {
                                        uk1Var.J0.i(false);
                                    }
                                    ancVar.p = F6;
                                } else {
                                    F6 = uk1Var;
                                }
                                mkc mkcVar = F6.J0.m;
                                if (ancVar.t && ymcVar2.n && mkcVar != null && mkcVar.n && mkcVar.getWidth() > 0 && !ancVar.p.isLayoutRequested()) {
                                    rectF.set(ancVar.c(mkcVar));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f > 0.01f) {
                                        ancVar.u = true;
                                        ancVar.p.J0.i(true);
                                        lncVar3.c(lncVar22);
                                        lncVar3.setAlpha(f);
                                        lncVar22.setAlpha(0.0f);
                                        ancVar.j.l(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - ancVar.w <= 700 && !ancVar.s && viewGroup2.isAttachedToWindow()) {
                                ancVar.h.postOnAnimation(ancVar.x);
                                return;
                            }
                            ancVar.u = true;
                            lncVar3.setAlpha(0.0f);
                            ymcVar2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        ancVar.d();
                        return;
                    default:
                        ancVar.t = true;
                        return;
                }
            }
        });
        this.q = ymcVar;
        ymcVar.setAlpha(0.001f);
        ymcVar.setPaused(false);
        xmcVar.addView(ymcVar, nme.e(60, 60, 51));
        viewGroup.addView(xmcVar, new ViewGroup.LayoutParams(-1, -1));
        b(a.centerX(), a.centerY(), a.width());
        lncVar2.l(new Runnable(this) {
            public final anc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                anc ancVar = this.b;
                switch (b) {
                    case 0:
                        lnc lncVar22 = ancVar.d;
                        float f = ancVar.l;
                        ViewGroup viewGroup2 = ancVar.a;
                        ymc ymcVar2 = ancVar.q;
                        AnimatorSet animatorSet2 = ancVar.m;
                        lnc lncVar3 = ancVar.i;
                        RectF rectF = ancVar.o;
                        RectF rectF2 = ancVar.n;
                        if (!ancVar.v && !ancVar.u) {
                            ancVar.e();
                            ancVar.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            uk1 F6 = ancVar.e.F6(ancVar.f);
                            if (F6 != null && F6.getWidth() > 0) {
                                uk1 uk1Var = ancVar.p;
                                if (uk1Var != F6) {
                                    if (uk1Var != null) {
                                        uk1Var.J0.i(false);
                                    }
                                    ancVar.p = F6;
                                } else {
                                    F6 = uk1Var;
                                }
                                mkc mkcVar = F6.J0.m;
                                if (ancVar.t && ymcVar2.n && mkcVar != null && mkcVar.n && mkcVar.getWidth() > 0 && !ancVar.p.isLayoutRequested()) {
                                    rectF.set(ancVar.c(mkcVar));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f > 0.01f) {
                                        ancVar.u = true;
                                        ancVar.p.J0.i(true);
                                        lncVar3.c(lncVar22);
                                        lncVar3.setAlpha(f);
                                        lncVar22.setAlpha(0.0f);
                                        ancVar.j.l(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - ancVar.w <= 700 && !ancVar.s && viewGroup2.isAttachedToWindow()) {
                                ancVar.h.postOnAnimation(ancVar.x);
                                return;
                            }
                            ancVar.u = true;
                            lncVar3.setAlpha(0.0f);
                            ymcVar2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        ancVar.d();
                        return;
                    default:
                        ancVar.t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new uwb(this, (byte) 11));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new zmc(this, x02Var, lncVar));
        xmcVar.post(r1);
    }

    public final void a(boolean z) {
        if (this.v) {
            return;
        }
        this.v = true;
        wmc wmcVar = this.x;
        xmc xmcVar = this.h;
        xmcVar.removeCallbacks(wmcVar);
        lnc lncVar = this.i;
        lncVar.l(null);
        uk1 uk1Var = this.p;
        if (uk1Var != null) {
            uk1Var.J0.i(false);
            if (z && this.r >= 1.0f) {
                RectF rectF = this.o;
                if (!rectF.isEmpty() && this.p.isAttachedToWindow() && c.P(this.p.getMessageObject(), this.f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - gl.L(150.0f))) * 2.0f) / 0.6f) / gl.p;
                    nkc nkcVar = this.p.J0;
                    nkcVar.l();
                    yla ylaVar = new yla(new ti4(0.0f));
                    nkcVar.b0 = ylaVar;
                    zla zlaVar = new zla(0.0f);
                    zlaVar.a(0.65f);
                    zlaVar.b(200.0f);
                    ylaVar.m = zlaVar;
                    nkcVar.b0.f(0.001f);
                    nkcVar.b0.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    nkcVar.b0.b(new hkc(nkcVar, (byte) 1));
                    nkcVar.b0.h();
                }
            }
        }
        ymc ymcVar = this.q;
        ymcVar.setPaused(true);
        xmcVar.removeView(ymcVar);
        lncVar.setPaused(true);
        xmcVar.removeView(lncVar);
        xmcVar.setClickable(false);
        this.d.setAlpha(this.l);
        x02 x02Var = this.c;
        ViewGroup viewGroup = this.a;
        if (x02Var == null) {
            this.b.setTranslationY(0.0f);
        } else {
            x02Var.s1(1.0f);
            if (z && this.j.q()) {
                mu1 mu1Var = this.e;
                if (mu1Var.getParentLayout() != null) {
                    ViewGroup view = mu1Var.getParentLayout().getView();
                    if (view.isAttachedToWindow()) {
                        int[] iArr = new int[2];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr);
                        view.getLocationOnScreen(iArr2);
                        viewGroup.removeView(xmcVar);
                        xmcVar.setTranslationX(iArr[0] - iArr2[0]);
                        xmcVar.setTranslationY(iArr[1] - iArr2[1]);
                        view.addView(xmcVar, new ViewGroup.LayoutParams(-1, -1));
                        viewGroup = view;
                    }
                }
            }
        }
        this.g.run();
        gl.d3(new mhc(this, viewGroup, (byte) 17), 650L);
    }

    public final void b(float f, float f2, float f3) {
        float L = gl.L(60.0f);
        xmc xmcVar = this.h;
        float f4 = L / 2.0f;
        lnc lncVar = this.i;
        lncVar.setTranslationX((f - xmcVar.getLeft()) - f4);
        lncVar.setTranslationY((f2 - xmcVar.getTop()) - f4);
        float f5 = f3 / L;
        lncVar.setScaleX(f5);
        lncVar.setScaleY(f5);
        float translationX = lncVar.getTranslationX();
        ymc ymcVar = this.q;
        ymcVar.setTranslationX(translationX);
        ymcVar.setTranslationY(lncVar.getTranslationY());
        ymcVar.setScaleX(f5);
        ymcVar.setScaleY(f5);
    }

    public final RectF c(mkc mkcVar) {
        x02 x02Var = this.c;
        ViewGroup viewGroup = this.a;
        if (x02Var == null) {
            return cqc.a(mkcVar, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) mkcVar.getRootView();
        RectF a = cqc.a(mkcVar, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a.offset(-iArr[0], -iArr[1]);
        return a;
    }

    public final void d() {
        ymc ymcVar = this.q;
        if (ymcVar == null) {
            return;
        }
        lnc lncVar = this.i;
        float flightYaw = lncVar.getFlightYaw();
        float flightPitch = lncVar.getFlightPitch();
        if (this.p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.r - 0.55f) / 0.45f));
            float B = yjb.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.p.J0.g() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.p.J0.k.F * 0.14f) - flightPitch) * B;
        }
        ymcVar.r = flightYaw;
        ymcVar.s = flightPitch;
        ymcVar.w = true;
        ymcVar.x = true;
    }

    public final void e() {
        lnc lncVar = this.d;
        if (lncVar.isAttachedToWindow()) {
            View rootView = lncVar.getRootView();
            ViewGroup viewGroup = this.a;
            if (rootView == viewGroup.getRootView()) {
                x02 x02Var = this.c;
                RectF rectF = this.n;
                if (x02Var == null) {
                    cqc.f(lncVar, this.b, viewGroup, rectF);
                    return;
                }
                rectF.set(cqc.a(lncVar, viewGroup));
                rectF.offset(0.0f, x02Var.i4 - x02Var.s2);
            }
        }
    }
}
