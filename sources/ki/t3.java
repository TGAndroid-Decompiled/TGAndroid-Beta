package ki;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.si;
import org.telegram.ui.bn;
import org.telegram.ui.qy0;
public final class t3 extends ki implements fs {
    public int E;
    public long F;
    public int G;
    public String H;
    public boolean I;
    public o3 J;
    public k2 K;
    public org.telegram.ui.ActionBar.r0 L;
    public org.telegram.ui.ActionBar.z0 M;
    public org.telegram.ui.ActionBar.z0 N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public k3 V;
    public boolean W;
    public int f18954a0;
    public l2 f18955n;
    public ValueAnimator f18956r;
    public boolean f18957s;
    public long f18958w;
    public long f18959x;
    public long f18960y;

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: ki.t3.B(int, int):void");
    }

    @Override
    public final void I(ki kiVar) {
        l2 l2Var = this.f18955n;
        CharSequence q10 = o10.q(mp.u1(this.G).c2(Long.valueOf(this.f18958w)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
            q10 = j6.m(q10, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        si siVar = this.f36766b;
        siVar.V2.setTitle(q10);
        this.K.setSwipeOffsetY(0.0f);
        if (l2Var.getWebView() != null) {
            l2Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
        if (h2Var != null) {
            l2Var.setParentActivity(h2Var.getParentActivity());
        }
        this.L.setVisibility(0);
        if (!l2Var.S) {
            org.telegram.messenger.g0.P3(siVar.V2.getBackButton(), 2131231269);
        }
    }

    @Override
    public final void J() {
        if (this.f18955n.O) {
            Q();
        }
        this.K.setSwipeOffsetAnimationDisallowed(false);
        org.telegram.messenger.g0.g3(new k3(this, 0));
    }

    @Override
    public final void K() {
        k2 k2Var = this.K;
        k2Var.e(k2Var.getTopActionBarOffsetY() + (-k2Var.getOffsetY()));
    }

    @Override
    public final boolean N() {
        return false;
    }

    public final boolean P() {
        String str;
        if (this.T) {
            TLRPC.User c22 = mp.u1(this.G).c2(Long.valueOf(this.f18958w));
            if (c22 != null) {
                str = i5.m(0, c22.first_name, c22.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = str;
            u1Var.U = gd.M0(2131752906, null);
            alertDialog$Builder.k(gd.M0(2131752905, null), new m3(this));
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
            u1Var.show();
            u6.U((TextView) u1Var.d(-1), n6.f29635q7, this.f36765a);
            return false;
        }
        this.f36766b.dismiss();
        return true;
    }

    public final void Q() {
        si siVar = this.f36766b;
        org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
        if ((h2Var instanceof bn) && ((bn) h2Var).f46084m1.Q() > org.telegram.messenger.g0.L(20.0f)) {
            org.telegram.messenger.g0.v1(siVar.f39659a2.getFragmentView());
            org.telegram.messenger.g0.h3(new k3(this, 1), 250L);
            return;
        }
        siVar.getWindow().setSoftInputMode(20);
        setFocusable(true);
        siVar.A0(true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        l2 l2Var = this.f18955n;
        if (i7 == ks.f25233z1) {
            if (this.f18960y == ((Long) objArr[0]).longValue()) {
                l2Var.h();
                this.I = true;
                this.f36766b.dismiss();
            }
        } else if (i7 == ks.f25175q4) {
            l2Var.f53311n.b(n6.w0(n6.f29467h5, this.f36765a), 153);
        }
    }

    @Override
    public final boolean g() {
        return this.W;
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(12.0f) + ((int) this.K.getTopActionBarOffsetY());
    }

    @Override
    public int getCurrentItemTop() {
        k2 k2Var = this.K;
        return (int) (k2Var.getOffsetY() + k2Var.getSwipeOffsetY());
    }

    @Override
    public int getCustomActionBarBackground() {
        return this.f18954a0;
    }

    @Override
    public int getCustomBackground() {
        return this.S;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (int) this.K.getOffsetY();
    }

    public String getStartCommand() {
        return this.H;
    }

    public org.telegram.ui.web.v0 getWebViewContainer() {
        return this.f18955n;
    }

    @Override
    public final boolean h() {
        return this.R;
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final boolean k() {
        if (this.f18955n.D()) {
            return true;
        }
        P();
        return true;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.P) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i7, i10);
        }
    }

    @Override
    public final void p() {
        ks.f(this.G).n(this, ks.f25233z1);
        ks.e().n(this, ks.f25175q4);
        org.telegram.ui.ActionBar.z t6 = this.f36766b.V2.t();
        org.telegram.ui.ActionBar.r0 r0Var = this.L;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r0Var.f29916b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        t6.removeView(r0Var);
        this.f18955n.h();
        this.U = true;
        org.telegram.messenger.g0.r(this.V);
    }

    @Override
    public final void requestLayout() {
        if (this.f18957s) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final boolean s() {
        P();
        return false;
    }

    public void setAllowSwipes(boolean z10) {
        this.K.setAllowSwipes(z10);
    }

    public void setCustomActionBarBackground(int i7) {
        this.W = true;
        this.f18954a0 = i7;
    }

    public void setCustomBackground(int i7) {
        this.S = i7;
        this.R = true;
    }

    public void setDelegate(org.telegram.ui.web.c0 c0Var) {
        this.f18955n.setDelegate(c0Var);
    }

    public void setMeasureOffsetY(int i7) {
        this.O = i7;
        this.K.requestLayout();
    }

    public void setNeedCloseConfirmation(boolean z10) {
        this.T = z10;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f36766b.f30190b.invalidate();
    }

    @Override
    public final void t() {
        si siVar = this.f36766b;
        siVar.A0(false);
        siVar.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void u() {
        this.L.setVisibility(8);
        this.Q = false;
        l2 l2Var = this.f18955n;
        boolean z10 = l2Var.S;
        si siVar = this.f36766b;
        if (!z10) {
            org.telegram.messenger.g0.P3(siVar.V2.getBackButton(), 2131231240);
        }
        siVar.V2.setBackground(null);
        if (l2Var.U) {
            l2Var.h();
            this.I = true;
        }
    }

    @Override
    public final void w(int i7) {
        o3 o3Var = this.J;
        l2 l2Var = this.f18955n;
        if (i7 == -1) {
            if (!l2Var.D()) {
                P();
                return;
            }
            return;
        }
        si siVar = this.f36766b;
        if (i7 == 2131296500) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f18958w);
            siVar.f39659a2.presentFragment(new bn(bundle));
            siVar.dismiss();
            return;
        }
        int i10 = 0;
        if (i7 == 2131296504) {
            if (l2Var.getWebView() != null) {
                l2Var.getWebView().animate().cancel();
                l2Var.getWebView().animate().alpha(0.0f).start();
            }
            o3Var.setLoadProgress(0.0f);
            o3Var.setAlpha(1.0f);
            o3Var.setVisibility(0);
            l2Var.setBotUser(mp.u1(this.G).c2(Long.valueOf(this.f18958w)));
            l2Var.s(this.G, this.f18958w);
            ks.f(l2Var.N).d(new org.telegram.ui.web.q(l2Var, 1));
        } else if (i7 == 2131296495) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = ri.d0(this.G).f26599b.bots;
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i10);
                i10++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.f18958w) {
                    siVar.l1(tL_attachMenuBot2, mp.u1(this.G).c2(Long.valueOf(this.f18958w)));
                    return;
                }
            }
        } else if (i7 == 2131296506) {
            l2Var.getClass();
            l2Var.Q = System.currentTimeMillis();
            l2Var.y("settings_button_pressed", null);
        } else if (i7 == 2131296490) {
            ri.d0(this.G).A0(this.f18958w, ri.f26593f2, null);
        } else if (i7 == 2131296510) {
            vf.c.t(getContext(), gd.M0(2131752882, null));
        } else if (i7 == 2131296505) {
            int i11 = this.G;
            Context context = getContext();
            lc lcVar = new lc(cb.a(getContext()), this.f36765a);
            long j3 = this.f18958w;
            int i12 = qy0.f51336w1;
            qy0.K0(i11, context, j3, false, false, new ArrayList(), lcVar, null, new byte[0], null, null);
        }
    }

    @Override
    public final void y() {
        this.P = false;
        this.K.setSwipeOffsetAnimationDisallowed(false);
        this.f18955n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override
    public final void z(int i7, boolean z10) {
        boolean z11;
        l2 l2Var = this.f18955n;
        k2 k2Var = this.K;
        if (z10) {
            l2Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = k2Var.getTopActionBarOffsetY() + (-k2Var.getOffsetY());
            if (k2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                k2Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int Q = this.f36766b.f39705p3.Q() + i7;
            setMeasuredDimension(getMeasuredWidth(), i7);
            this.P = true;
            k2Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z11) {
                ValueAnimator valueAnimator = this.f18956r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f18956r = null;
                }
                if (l2Var.getWebView() != null) {
                    int scrollY = l2Var.getWebView().getScrollY();
                    int i10 = (Q - i7) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i10).setDuration(250L);
                    this.f18956r = duration;
                    duration.setInterpolator(pi.k.V);
                    this.f18956r.addUpdateListener(new l3(this, 0));
                    this.f18956r.addListener(new f2(this, i10, 1));
                    this.f18956r.start();
                }
            }
        }
    }
}
