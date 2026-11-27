package defpackage;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class tw implements ag0, dy0 {
    public ValueAnimator E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public boolean K;
    public final o L;
    public final pn a = new pn(null);
    public e b;
    public final sw c;
    public View d;
    public tx0 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public y58 w;
    public float x;
    public float y;

    public tw(o oVar, e eVar) {
        this.L = oVar;
        this.b = eVar;
        eVar.getResourceProvider();
        sw swVar = new sw(this, eVar.getContext());
        this.c = swVar;
        new rx5(swVar, true, new te2(this, (byte) 4));
    }

    public final void A() {
        float f;
        View view = this.d;
        if (view == null) {
            return;
        }
        float w = w();
        float f2 = 1.0f - this.x;
        if (this.n) {
            f = 0.0f;
        } else {
            f = this.y;
        }
        view.setTranslationY(Math.max(f2, f) * w);
        this.c.invalidate();
    }

    @Override
    public final void a(boolean z) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.n = z;
        if (z) {
            LaunchActivity.H1.x0.b(this);
        } else {
            m(true, new c1(this, (byte) 24));
        }
        t();
        r();
    }

    @Override
    public final void b(boolean z) {
        this.K = z;
        o oVar = this.L;
        oVar.v0[0].setLastVisible(z);
        oVar.v0[1].setLastVisible(false);
    }

    @Override
    public final xx0 c() {
        int w0;
        int w02;
        float progress;
        xx0 xx0Var = new xx0();
        o oVar = this.L;
        xx0Var.E = oVar.i0.getTitle();
        xx0Var.J = oVar;
        m mVar = oVar.v0[0];
        Bitmap bitmap = null;
        if (mVar != null && xea.s0) {
            w0 = mVar.getActionBarColor();
        } else {
            w0 = aob.w0(null, aob.Gl, false);
        }
        xx0Var.q = w0;
        m mVar2 = oVar.v0[0];
        if (mVar2 != null && xea.s0) {
            w02 = mVar2.getBackgroundColor();
        } else {
            w02 = aob.w0(null, aob.Gl, false);
        }
        xx0Var.r = w02;
        xx0Var.n = true;
        if (!this.G) {
            progress = 0.0f;
        } else {
            progress = oVar.v0[0].getProgress();
        }
        xx0Var.I = progress;
        m mVar3 = oVar.v0[0];
        xx0Var.c = mVar3;
        if (mVar3 != null && mVar3.getWebView() != null) {
            bitmap = oVar.v0[0].getWebView().getFavicon();
        }
        xx0Var.F = bitmap;
        m mVar4 = xx0Var.c;
        if (mVar4 != null) {
            xx0Var.g = mVar4.getWidth();
            xx0Var.h = xx0Var.c.getHeight();
        }
        xx0Var.i = x();
        xx0Var.D = aob.I.o();
        return xx0Var;
    }

    @Override
    public final ey0 mo23d() {
        return this.c;
    }

    @Override
    public final void dismiss() {
        a(true);
    }

    @Override
    public final int e(int i) {
        float min;
        if (this.n) {
            min = 0.0f;
        } else {
            min = Math.min(this.x, 1.0f - this.y) * (1.0f - this.J);
        }
        int v = v();
        xt xtVar = this.L.i0;
        if (xtVar != null) {
            v = vm2.f(xtVar.b0, v, xtVar.y);
        }
        return vm2.f(min, i, v);
    }

    @Override
    public final boolean f() {
        float min;
        int f;
        float f2 = 0.0f;
        if (this.n) {
            min = 0.0f;
        } else {
            min = (1.0f - this.J) * Math.min(this.x, 1.0f - this.y);
        }
        if (this.G && min > 0.25f) {
            if (!xea.s0) {
                f = aob.w0(null, aob.Gl, false);
            } else {
                o oVar = this.L;
                if (oVar.v0[0].getVisibility() == 0) {
                    f2 = 1.0f - (oVar.v0[0].getTranslationX() / oVar.v0[0].getWidth());
                }
                f = vm2.f(1.0f - f2, oVar.v0[0].getActionBarColor(), oVar.v0[1].getActionBarColor());
            }
            if (hl.B(f) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean h() {
        if (this.H && this.y <= 0.0f && this.x >= 1.0f && this.J <= 0.0f && !this.n && !this.h) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean i() {
        return this.f;
    }

    @Override
    public final defpackage.d31 j() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw.j():d31");
    }

    @Override
    public final boolean k(tx0 tx0Var) {
        this.e = tx0Var;
        if (tx0Var != null) {
            this.f = true;
        }
        return true;
    }

    public final ValueAnimator l(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f);
        ofFloat.addUpdateListener(new qw(this, (byte) 0));
        return ofFloat;
    }

    public final void m(boolean z, c1 c1Var) {
        float f;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = this.y;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new qw(this, (byte) 2));
        this.F.addListener(new rw(this, z, c1Var, (byte) 0));
        this.F.setInterpolator(k43.h);
        this.F.setDuration(250L);
        this.F.start();
    }

    @Override
    public final void n(Runnable runnable) {
        this.w = (y58) runnable;
    }

    public final void o() {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new qw(this, (byte) 1));
        this.E.addListener(new h0(this, (byte) 13));
        this.E.setInterpolator(k43.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    @Override
    public final void p() {
        o oVar = this.L;
        if (oVar.p0) {
            hl.t1(this.c);
            return;
        }
        xt xtVar = oVar.i0;
        if (xtVar.U) {
            xtVar.h(false);
        } else if (xtVar.a0) {
            xtVar.k(false);
        } else {
            if (oVar.G()) {
                m mVar = oVar.v0[0];
                if (mVar.s) {
                    if (mVar.e() && mVar.getWebView() != null) {
                        mVar.getWebView().goBack();
                        return;
                    }
                    return;
                }
            }
            if (oVar.e0.size() > 1) {
                oVar.D();
            } else {
                a(false);
            }
        }
    }

    public final void q(e eVar) {
        zu1 zu1Var;
        nr1 nr1Var;
        this.r = false;
        this.b = eVar;
        eVar.getResourceProvider();
        if ((eVar instanceof zu1) && (nr1Var = (zu1Var = (zu1) eVar).a0) != null) {
            nr1Var.U();
            zu1Var.a0.O0(true, false, true);
        }
        tx0 tx0Var = this.e;
        if (tx0Var != null) {
            if (!tx0Var.e) {
                tx0Var.e = true;
                try {
                    tx0Var.show();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        } else {
            sw swVar = this.c;
            hl.B2(swVar);
            if (eVar.getLayoutContainer() != null) {
                eVar.getLayoutContainer().addView(swVar);
            }
        }
        o oVar = this.L;
        m mVar = oVar.v0[0];
        if (mVar != null && mVar.G) {
            if (mVar.getWebView() != null) {
                mVar.getWebView().onResume();
            }
            mVar.G = false;
        }
        m mVar2 = oVar.v0[1];
        if (mVar2 != null && mVar2.G) {
            if (mVar2.getWebView() != null) {
                mVar2.getWebView().onResume();
            }
            mVar2.G = false;
        }
        o.d1.add(oVar);
    }

    public final void r() {
        if (this.s != h()) {
            this.s = h();
            if (this.b.getParentLayout() instanceof ActionBarLayout) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b.getParentLayout();
                b bVar = actionBarLayout.s;
                if (bVar != null) {
                    bVar.invalidate();
                }
                b bVar2 = actionBarLayout.x;
                if (bVar2 != null) {
                    bVar2.invalidate();
                    return;
                }
                return;
            }
            sw swVar = this.c;
            if (swVar.getParent() instanceof View) {
                ((View) swVar.getParent()).invalidate();
            }
        }
    }

    @Override
    public final void release() {
        this.r = true;
        o oVar = this.L;
        m[] mVarArr = oVar.v0;
        m mVar = mVarArr[0];
        if (mVar != null && mVar.h) {
            jw jwVar = mVar.e;
            jwVar.setSwipeOffsetY((-jwVar.f) + jwVar.e);
            mVarArr = oVar.v0;
            mVarArr[0].h = false;
        }
        m mVar2 = mVarArr[0];
        if (mVar2 != null && !mVar2.G) {
            if (mVar2.getWebView() != null) {
                mVar2.getWebView().onPause();
            }
            mVar2.G = true;
        }
        m mVar3 = oVar.v0[1];
        if (mVar3 != null && !mVar3.G) {
            if (mVar3.getWebView() != null) {
                mVar3.getWebView().onPause();
            }
            mVar3.G = true;
        }
        tx0 tx0Var = this.e;
        if (tx0Var != null) {
            tx0Var.b();
        }
        this.b.removeSheet(this);
        if (this.e == null) {
            hl.B2(this.c);
        }
        y58 y58Var = this.w;
        if (y58Var != null) {
            y58Var.run();
            this.w = null;
        }
        o.d1.remove(oVar);
    }

    @Override
    public final boolean s() {
        sw swVar;
        if (!this.h && !this.r && this.x > 0.5f && (swVar = this.c) != null && swVar.isAttachedToWindow()) {
            if (hl.U1(Utilities.l(swVar.k0.c), swVar.r0.x() - hl.L(20.0f), 0) < swVar.getHeight() && this.J < 1.0f) {
                return true;
            }
        }
        return false;
    }

    public final void t() {
        View view;
        tx0 tx0Var = this.e;
        sw swVar = this.c;
        if (tx0Var != null) {
            view = tx0Var.b;
        } else {
            view = swVar;
        }
        hl.m3(view, f());
        tx0 tx0Var2 = this.e;
        boolean z = false;
        if (tx0Var2 != null) {
            int e = tx0Var2.a.e(aob.w0(null, aob.a7, false));
            tx0Var2.d.setColor(e);
            tx0Var2.c.invalidate();
            hl.o3(tx0Var2, e, true, null);
            if (hl.B(e) >= 0.721f) {
                z = true;
            }
            hl.i3(tx0Var2, z);
            LaunchActivity.H1.H(true, true, true);
            return;
        }
        LaunchActivity.H1.H(true, true, true);
        if (hl.B(e(aob.w0(null, aob.a7, false))) >= 0.721f) {
            z = true;
        }
        hl.j3(swVar, z);
    }

    @Override
    public final boolean u(Dialog dialog) {
        return false;
    }

    public final int v() {
        float translationX;
        if (!xea.s0) {
            return aob.w0(null, aob.Jl, false);
        }
        o oVar = this.L;
        if (oVar.v0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (oVar.v0[0].getTranslationX() / oVar.v0[0].getWidth());
        }
        return vm2.f(1.0f - translationX, oVar.v0[0].getBackgroundColor(), oVar.v0[1].getBackgroundColor());
    }

    public final int w() {
        int height;
        int L = hl.L(16.0f);
        View view = this.d;
        if (view == null) {
            height = hl.q.y;
        } else {
            height = view.getHeight();
        }
        return uh9.f(20.0f, x(), L + height);
    }

    public final int x() {
        float f;
        o oVar = this.L;
        int i = 0;
        m mVar = oVar.v0[0];
        if (mVar != null && mVar.getVisibility() == 0) {
            f = 1.0f - (oVar.v0[0].getTranslationX() / oVar.v0[0].getWidth());
        } else {
            f = 0.0f;
        }
        float f2 = 1.0f - f;
        m mVar2 = oVar.v0[0];
        if (mVar2 != null && mVar2.getVisibility() == 0) {
            i = (int) (oVar.v0[0].getAlpha() * oVar.v0[0].getListTop() * f);
        }
        m mVar3 = oVar.v0[1];
        if (mVar3 != null && mVar3.getVisibility() == 0) {
            return i + ((int) (oVar.v0[1].getAlpha() * oVar.v0[1].getListTop() * f2));
        }
        return i;
    }

    public final void y() {
        o oVar = this.L;
        oVar.v0[0].setLastVisible(this.K);
        oVar.v0[1].setLastVisible(false);
    }

    @Override
    public final boolean z() {
        return this.c.isAttachedToWindow();
    }

    @Override
    public final View d() {
        return this.c;
    }

    @Override
    public final void g(int i) {
    }
}
