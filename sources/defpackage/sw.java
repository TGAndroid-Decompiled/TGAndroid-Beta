package defpackage;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class sw implements zf0, vx0 {
    public ValueAnimator E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public boolean K;
    public final o L;
    public final on a = new on(null);
    public d b;
    public final rw c;
    public View d;
    public lx0 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public g28 w;
    public float x;
    public float y;

    public sw(o oVar, d dVar) {
        this.L = oVar;
        this.b = dVar;
        dVar.getResourceProvider();
        rw rwVar = new rw(this, dVar.getContext());
        this.c = rwVar;
        new mv5(rwVar, true, new be2(this, (byte) 4));
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
            m(true, new b1(this, (byte) 24));
        }
        s();
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
    public final px0 c() {
        int w0;
        int w02;
        float progress;
        px0 px0Var = new px0();
        o oVar = this.L;
        px0Var.E = oVar.i0.getTitle();
        px0Var.J = oVar;
        m mVar = oVar.v0[0];
        Bitmap bitmap = null;
        if (mVar != null && gba.s0) {
            w0 = mVar.getActionBarColor();
        } else {
            w0 = bkb.w0(null, bkb.Fl, false);
        }
        px0Var.q = w0;
        m mVar2 = oVar.v0[0];
        if (mVar2 != null && gba.s0) {
            w02 = mVar2.getBackgroundColor();
        } else {
            w02 = bkb.w0(null, bkb.Fl, false);
        }
        px0Var.r = w02;
        px0Var.n = true;
        if (!this.G) {
            progress = 0.0f;
        } else {
            progress = oVar.v0[0].getProgress();
        }
        px0Var.I = progress;
        m mVar3 = oVar.v0[0];
        px0Var.c = mVar3;
        if (mVar3 != null && mVar3.getWebView() != null) {
            bitmap = oVar.v0[0].getWebView().getFavicon();
        }
        px0Var.F = bitmap;
        m mVar4 = px0Var.c;
        if (mVar4 != null) {
            px0Var.g = mVar4.getWidth();
            px0Var.h = px0Var.c.getHeight();
        }
        px0Var.i = x();
        px0Var.D = bkb.I.o();
        return px0Var;
    }

    @Override
    public final wx0 mo23d() {
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
        wt wtVar = this.L.i0;
        if (wtVar != null) {
            v = bm2.f(wtVar.b0, v, wtVar.y);
        }
        return bm2.f(min, i, v);
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
            if (!gba.s0) {
                f = bkb.w0(null, bkb.Fl, false);
            } else {
                o oVar = this.L;
                if (oVar.v0[0].getVisibility() == 0) {
                    f2 = 1.0f - (oVar.v0[0].getTranslationX() / oVar.v0[0].getWidth());
                }
                f = bm2.f(1.0f - f2, oVar.v0[0].getActionBarColor(), oVar.v0[1].getActionBarColor());
            }
            if (gl.B(f) >= 0.721f) {
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
    public final defpackage.u21 j() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw.j():u21");
    }

    @Override
    public final boolean k(lx0 lx0Var) {
        this.e = lx0Var;
        if (lx0Var != null) {
            this.f = true;
        }
        return true;
    }

    public final ValueAnimator l(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f);
        ofFloat.addUpdateListener(new pw(this, (byte) 0));
        return ofFloat;
    }

    public final void m(boolean z, b1 b1Var) {
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
        ofFloat.addUpdateListener(new pw(this, (byte) 2));
        this.F.addListener(new qw(this, z, b1Var, (byte) 0));
        this.F.setInterpolator(s33.h);
        this.F.setDuration(250L);
        this.F.start();
    }

    @Override
    public final void n(Runnable runnable) {
        this.w = (g28) runnable;
    }

    public final void o() {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new pw(this, (byte) 1));
        this.E.addListener(new g0(this, (byte) 13));
        this.E.setInterpolator(s33.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    public final void p(d dVar) {
        mu1 mu1Var;
        ar1 ar1Var;
        this.r = false;
        this.b = dVar;
        dVar.getResourceProvider();
        if ((dVar instanceof mu1) && (ar1Var = (mu1Var = (mu1) dVar).a0) != null) {
            ar1Var.S();
            mu1Var.a0.K0(true, false, true);
        }
        lx0 lx0Var = this.e;
        if (lx0Var != null) {
            if (!lx0Var.e) {
                lx0Var.e = true;
                try {
                    lx0Var.show();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        } else {
            rw rwVar = this.c;
            gl.B2(rwVar);
            if (dVar.getLayoutContainer() != null) {
                dVar.getLayoutContainer().addView(rwVar);
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

    @Override
    public final void q() {
        o oVar = this.L;
        if (oVar.p0) {
            gl.t1(this.c);
            return;
        }
        wt wtVar = oVar.i0;
        if (wtVar.U) {
            wtVar.h(false);
        } else if (wtVar.a0) {
            wtVar.k(false);
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
            rw rwVar = this.c;
            if (rwVar.getParent() instanceof View) {
                ((View) rwVar.getParent()).invalidate();
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
            iw iwVar = mVar.e;
            iwVar.setSwipeOffsetY((-iwVar.f) + iwVar.e);
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
        lx0 lx0Var = this.e;
        if (lx0Var != null) {
            lx0Var.b();
        }
        this.b.removeSheet(this);
        if (this.e == null) {
            gl.B2(this.c);
        }
        g28 g28Var = this.w;
        if (g28Var != null) {
            g28Var.run();
            this.w = null;
        }
        o.d1.remove(oVar);
    }

    public final void s() {
        View view;
        lx0 lx0Var = this.e;
        rw rwVar = this.c;
        if (lx0Var != null) {
            view = lx0Var.b;
        } else {
            view = rwVar;
        }
        gl.m3(view, f());
        lx0 lx0Var2 = this.e;
        boolean z = false;
        if (lx0Var2 != null) {
            int e = lx0Var2.a.e(bkb.w0(null, bkb.Z6, false));
            lx0Var2.d.setColor(e);
            lx0Var2.c.invalidate();
            gl.o3(lx0Var2, e, true, null);
            if (gl.B(e) >= 0.721f) {
                z = true;
            }
            gl.i3(lx0Var2, z);
            LaunchActivity.H1.H(true, true, true);
            return;
        }
        LaunchActivity.H1.H(true, true, true);
        if (gl.B(e(bkb.w0(null, bkb.Z6, false))) >= 0.721f) {
            z = true;
        }
        gl.j3(rwVar, z);
    }

    @Override
    public final boolean t() {
        rw rwVar;
        if (!this.h && !this.r && this.x > 0.5f && (rwVar = this.c) != null && rwVar.isAttachedToWindow()) {
            if (gl.U1(Utilities.l(rwVar.q0.c), rwVar.x0.x() - gl.L(20.0f), 0) < rwVar.getHeight() && this.J < 1.0f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean u(Dialog dialog) {
        return false;
    }

    public final int v() {
        float translationX;
        if (!gba.s0) {
            return bkb.w0(null, bkb.Il, false);
        }
        o oVar = this.L;
        if (oVar.v0[0].getVisibility() != 0) {
            translationX = 0.0f;
        } else {
            translationX = 1.0f - (oVar.v0[0].getTranslationX() / oVar.v0[0].getWidth());
        }
        return bm2.f(1.0f - translationX, oVar.v0[0].getBackgroundColor(), oVar.v0[1].getBackgroundColor());
    }

    public final int w() {
        int height;
        int L = gl.L(16.0f);
        View view = this.d;
        if (view == null) {
            height = gl.q.y;
        } else {
            height = view.getHeight();
        }
        return de9.f(20.0f, x(), L + height);
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
