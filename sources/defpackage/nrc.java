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
public final class nrc {
    public final ViewGroup a;
    public final View b;
    public final n12 c;
    public final yrc d;
    public final zu1 e;
    public final TL_wallet.walletTransaction f;
    public final Runnable g;
    public final krc h;
    public final yrc i;
    public final guc j = new guc();
    public final PathInterpolator k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float l;
    public final AnimatorSet m;
    public final RectF n;
    public final RectF o;
    public dl1 p;
    public final lrc q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final long w;
    public final jrc x;

    public nrc(ViewGroup viewGroup, View view, yrc yrcVar, zu1 zu1Var, TL_wallet.walletTransaction wallettransaction, Runnable runnable, n12 n12Var) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.m = animatorSet;
        this.o = new RectF();
        this.w = SystemClock.uptimeMillis();
        ?? r1 = new Runnable(this) {
            public final nrc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                nrc nrcVar = this.b;
                switch (b) {
                    case 0:
                        yrc yrcVar2 = nrcVar.d;
                        float f = nrcVar.l;
                        ViewGroup viewGroup2 = nrcVar.a;
                        lrc lrcVar = nrcVar.q;
                        AnimatorSet animatorSet2 = nrcVar.m;
                        yrc yrcVar3 = nrcVar.i;
                        RectF rectF = nrcVar.o;
                        RectF rectF2 = nrcVar.n;
                        if (!nrcVar.v && !nrcVar.u) {
                            nrcVar.e();
                            nrcVar.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            dl1 M6 = nrcVar.e.M6(nrcVar.f);
                            if (M6 != null && M6.getWidth() > 0) {
                                dl1 dl1Var = nrcVar.p;
                                if (dl1Var != M6) {
                                    if (dl1Var != null) {
                                        dl1Var.J0.i(false);
                                    }
                                    nrcVar.p = M6;
                                } else {
                                    M6 = dl1Var;
                                }
                                yoc yocVar = M6.J0.m;
                                if (nrcVar.t && lrcVar.n && yocVar != null && yocVar.n && yocVar.getWidth() > 0 && !nrcVar.p.isLayoutRequested()) {
                                    rectF.set(nrcVar.c(yocVar));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f > 0.01f) {
                                        nrcVar.u = true;
                                        nrcVar.p.J0.i(true);
                                        yrcVar3.c(yrcVar2);
                                        yrcVar3.setAlpha(f);
                                        yrcVar2.setAlpha(0.0f);
                                        nrcVar.j.l(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - nrcVar.w <= 700 && !nrcVar.s && viewGroup2.isAttachedToWindow()) {
                                nrcVar.h.postOnAnimation(nrcVar.x);
                                return;
                            }
                            nrcVar.u = true;
                            yrcVar3.setAlpha(0.0f);
                            lrcVar.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        nrcVar.d();
                        return;
                    default:
                        nrcVar.t = true;
                        return;
                }
            }
        };
        this.x = r1;
        this.c = n12Var;
        this.a = viewGroup;
        this.b = view;
        this.d = yrcVar;
        this.l = yrcVar.getAlpha();
        this.e = zu1Var;
        this.f = wallettransaction;
        this.g = runnable;
        RectF a = quc.a(yrcVar, viewGroup);
        this.n = a;
        e();
        krc krcVar = new krc(this, viewGroup.getContext());
        this.h = krcVar;
        krcVar.setClipChildren(false);
        krcVar.setClipToPadding(false);
        krcVar.setClickable(true);
        yrc yrcVar2 = new yrc(60, viewGroup.getContext(), true);
        this.i = yrcVar2;
        yrcVar2.setContinuousRotation(540.0f);
        yrcVar2.c(yrcVar);
        yrcVar2.setAlpha(0.0f);
        krcVar.addView(yrcVar2, tre.e(60, 60, 51));
        lrc lrcVar = new lrc(this, viewGroup.getContext(), new Runnable(this) {
            public final nrc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                nrc nrcVar = this.b;
                switch (b) {
                    case 0:
                        yrc yrcVar22 = nrcVar.d;
                        float f = nrcVar.l;
                        ViewGroup viewGroup2 = nrcVar.a;
                        lrc lrcVar2 = nrcVar.q;
                        AnimatorSet animatorSet2 = nrcVar.m;
                        yrc yrcVar3 = nrcVar.i;
                        RectF rectF = nrcVar.o;
                        RectF rectF2 = nrcVar.n;
                        if (!nrcVar.v && !nrcVar.u) {
                            nrcVar.e();
                            nrcVar.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            dl1 M6 = nrcVar.e.M6(nrcVar.f);
                            if (M6 != null && M6.getWidth() > 0) {
                                dl1 dl1Var = nrcVar.p;
                                if (dl1Var != M6) {
                                    if (dl1Var != null) {
                                        dl1Var.J0.i(false);
                                    }
                                    nrcVar.p = M6;
                                } else {
                                    M6 = dl1Var;
                                }
                                yoc yocVar = M6.J0.m;
                                if (nrcVar.t && lrcVar2.n && yocVar != null && yocVar.n && yocVar.getWidth() > 0 && !nrcVar.p.isLayoutRequested()) {
                                    rectF.set(nrcVar.c(yocVar));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f > 0.01f) {
                                        nrcVar.u = true;
                                        nrcVar.p.J0.i(true);
                                        yrcVar3.c(yrcVar22);
                                        yrcVar3.setAlpha(f);
                                        yrcVar22.setAlpha(0.0f);
                                        nrcVar.j.l(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - nrcVar.w <= 700 && !nrcVar.s && viewGroup2.isAttachedToWindow()) {
                                nrcVar.h.postOnAnimation(nrcVar.x);
                                return;
                            }
                            nrcVar.u = true;
                            yrcVar3.setAlpha(0.0f);
                            lrcVar2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        nrcVar.d();
                        return;
                    default:
                        nrcVar.t = true;
                        return;
                }
            }
        });
        this.q = lrcVar;
        lrcVar.setAlpha(0.001f);
        lrcVar.setPaused(false);
        krcVar.addView(lrcVar, tre.e(60, 60, 51));
        viewGroup.addView(krcVar, new ViewGroup.LayoutParams(-1, -1));
        b(a.centerX(), a.centerY(), a.width());
        yrcVar2.l(new Runnable(this) {
            public final nrc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                nrc nrcVar = this.b;
                switch (b) {
                    case 0:
                        yrc yrcVar22 = nrcVar.d;
                        float f = nrcVar.l;
                        ViewGroup viewGroup2 = nrcVar.a;
                        lrc lrcVar2 = nrcVar.q;
                        AnimatorSet animatorSet2 = nrcVar.m;
                        yrc yrcVar3 = nrcVar.i;
                        RectF rectF = nrcVar.o;
                        RectF rectF2 = nrcVar.n;
                        if (!nrcVar.v && !nrcVar.u) {
                            nrcVar.e();
                            nrcVar.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            dl1 M6 = nrcVar.e.M6(nrcVar.f);
                            if (M6 != null && M6.getWidth() > 0) {
                                dl1 dl1Var = nrcVar.p;
                                if (dl1Var != M6) {
                                    if (dl1Var != null) {
                                        dl1Var.J0.i(false);
                                    }
                                    nrcVar.p = M6;
                                } else {
                                    M6 = dl1Var;
                                }
                                yoc yocVar = M6.J0.m;
                                if (nrcVar.t && lrcVar2.n && yocVar != null && yocVar.n && yocVar.getWidth() > 0 && !nrcVar.p.isLayoutRequested()) {
                                    rectF.set(nrcVar.c(yocVar));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f > 0.01f) {
                                        nrcVar.u = true;
                                        nrcVar.p.J0.i(true);
                                        yrcVar3.c(yrcVar22);
                                        yrcVar3.setAlpha(f);
                                        yrcVar22.setAlpha(0.0f);
                                        nrcVar.j.l(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - nrcVar.w <= 700 && !nrcVar.s && viewGroup2.isAttachedToWindow()) {
                                nrcVar.h.postOnAnimation(nrcVar.x);
                                return;
                            }
                            nrcVar.u = true;
                            yrcVar3.setAlpha(0.0f);
                            lrcVar2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        nrcVar.d();
                        return;
                    default:
                        nrcVar.t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new pzb(this, (byte) 13));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new mrc(this, n12Var, yrcVar));
        krcVar.post(r1);
    }

    public final void a(boolean z) {
        if (this.v) {
            return;
        }
        this.v = true;
        jrc jrcVar = this.x;
        krc krcVar = this.h;
        krcVar.removeCallbacks(jrcVar);
        yrc yrcVar = this.i;
        yrcVar.l(null);
        dl1 dl1Var = this.p;
        if (dl1Var != null) {
            dl1Var.J0.i(false);
            if (z && this.r >= 1.0f) {
                RectF rectF = this.o;
                if (!rectF.isEmpty() && this.p.isAttachedToWindow() && c.Q(this.p.getMessageObject(), this.f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.n.centerY(), rectF.centerY()) - hl.L(150.0f))) * 2.0f) / 0.6f) / hl.p;
                    zoc zocVar = this.p.J0;
                    zocVar.l();
                    vpa vpaVar = new vpa(new xk4(0.0f));
                    zocVar.b0 = vpaVar;
                    wpa wpaVar = new wpa(0.0f);
                    wpaVar.a(0.65f);
                    wpaVar.b(200.0f);
                    vpaVar.m = wpaVar;
                    zocVar.b0.f(0.001f);
                    zocVar.b0.a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    zocVar.b0.b(new toc(zocVar, (byte) 1));
                    zocVar.b0.h();
                }
            }
        }
        lrc lrcVar = this.q;
        lrcVar.setPaused(true);
        krcVar.removeView(lrcVar);
        yrcVar.setPaused(true);
        krcVar.removeView(yrcVar);
        krcVar.setClickable(false);
        this.d.setAlpha(this.l);
        n12 n12Var = this.c;
        ViewGroup viewGroup = this.a;
        if (n12Var == null) {
            this.b.setTranslationY(0.0f);
        } else {
            n12Var.t1(1.0f);
            if (z && this.j.q()) {
                zu1 zu1Var = this.e;
                if (zu1Var.getParentLayout() != null) {
                    ViewGroup view = zu1Var.getParentLayout().getView();
                    if (view.isAttachedToWindow()) {
                        int[] iArr = new int[2];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr);
                        view.getLocationOnScreen(iArr2);
                        viewGroup.removeView(krcVar);
                        krcVar.setTranslationX(iArr[0] - iArr2[0]);
                        krcVar.setTranslationY(iArr[1] - iArr2[1]);
                        view.addView(krcVar, new ViewGroup.LayoutParams(-1, -1));
                        viewGroup = view;
                    }
                }
            }
        }
        this.g.run();
        hl.d3(new vlc(this, viewGroup, (byte) 16), 650L);
    }

    public final void b(float f, float f2, float f3) {
        float L = hl.L(60.0f);
        krc krcVar = this.h;
        float f4 = L / 2.0f;
        yrc yrcVar = this.i;
        yrcVar.setTranslationX((f - krcVar.getLeft()) - f4);
        yrcVar.setTranslationY((f2 - krcVar.getTop()) - f4);
        float f5 = f3 / L;
        yrcVar.setScaleX(f5);
        yrcVar.setScaleY(f5);
        float translationX = yrcVar.getTranslationX();
        lrc lrcVar = this.q;
        lrcVar.setTranslationX(translationX);
        lrcVar.setTranslationY(yrcVar.getTranslationY());
        lrcVar.setScaleX(f5);
        lrcVar.setScaleY(f5);
    }

    public final RectF c(yoc yocVar) {
        n12 n12Var = this.c;
        ViewGroup viewGroup = this.a;
        if (n12Var == null) {
            return quc.a(yocVar, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) yocVar.getRootView();
        RectF a = quc.a(yocVar, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a.offset(-iArr[0], -iArr[1]);
        return a;
    }

    public final void d() {
        lrc lrcVar = this.q;
        if (lrcVar == null) {
            return;
        }
        yrc yrcVar = this.i;
        float flightYaw = yrcVar.getFlightYaw();
        float flightPitch = yrcVar.getFlightPitch();
        if (this.p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.r - 0.55f) / 0.45f));
            float B = xnb.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.p.J0.g() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.p.J0.k.F * 0.14f) - flightPitch) * B;
        }
        lrcVar.r = flightYaw;
        lrcVar.s = flightPitch;
        lrcVar.w = true;
        lrcVar.x = true;
    }

    public final void e() {
        yrc yrcVar = this.d;
        if (yrcVar.isAttachedToWindow()) {
            View rootView = yrcVar.getRootView();
            ViewGroup viewGroup = this.a;
            if (rootView == viewGroup.getRootView()) {
                n12 n12Var = this.c;
                RectF rectF = this.n;
                if (n12Var == null) {
                    quc.f(yrcVar, this.b, viewGroup, rectF);
                    return;
                }
                rectF.set(quc.a(yrcVar, viewGroup));
                rectF.offset(0.0f, n12Var.i4 - n12Var.s2);
            }
        }
    }
}
