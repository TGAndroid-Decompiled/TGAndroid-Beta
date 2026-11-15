package ki;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.j6;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ta;
import org.telegram.ui.an;
import org.telegram.ui.my0;
public final class y3 extends ci implements is {
    public int E;
    public long F;
    public int G;
    public String H;
    public boolean I;
    public t3 J;
    public o2 K;
    public org.telegram.ui.ActionBar.q0 L;
    public org.telegram.ui.ActionBar.z0 M;
    public org.telegram.ui.ActionBar.z0 N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public p3 V;
    public boolean W;
    public int f18714a0;
    public p2 f18715n;
    public ValueAnimator f18716r;
    public boolean f18717s;
    public long f18718w;
    public long f18719x;
    public long f18720y;

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: ki.y3.B(int, int):void");
    }

    @Override
    public final void I(ci ciVar) {
        p2 p2Var = this.f18715n;
        CharSequence p10 = q10.p(np.s1(this.G).a2(Long.valueOf(this.f18718w)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
            p10 = j6.m(p10, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        ki kiVar = this.f33607b;
        kiVar.V2.setTitle(p10);
        this.K.setSwipeOffsetY(0.0f);
        if (p2Var.getWebView() != null) {
            p2Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36436a2;
        if (e2Var != null) {
            p2Var.setParentActivity(e2Var.getParentActivity());
        }
        this.L.setVisibility(0);
        if (!p2Var.S) {
            org.telegram.messenger.g0.Q3(kiVar.V2.getBackButton(), 2131231269);
        }
    }

    @Override
    public final void J() {
        if (this.f18715n.O) {
            Q();
        }
        this.K.setSwipeOffsetAnimationDisallowed(false);
        org.telegram.messenger.g0.h3(new p3(this, 0));
    }

    @Override
    public final void K() {
        o2 o2Var = this.K;
        o2Var.e(o2Var.getTopActionBarOffsetY() + (-o2Var.getOffsetY()));
    }

    @Override
    public final boolean N() {
        return false;
    }

    public final boolean P() {
        String str;
        if (this.T) {
            TLRPC.User a22 = np.s1(this.G).a2(Long.valueOf(this.f18718w));
            if (a22 != null) {
                str = g5.m(0, a22.first_name, a22.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = str;
            t1Var.U = hd.M0(2131752917, null);
            alertDialog$Builder.k(hd.M0(2131752916, null), new r3(this));
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
            t1Var.show();
            q6.U((TextView) t1Var.d(-1), org.telegram.ui.ActionBar.j6.f29090q7, this.f33606a);
            return false;
        }
        this.f33607b.dismiss();
        return true;
    }

    public final void Q() {
        ki kiVar = this.f33607b;
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36436a2;
        if ((e2Var instanceof an) && ((an) e2Var).f45278m1.Q() > org.telegram.messenger.g0.L(20.0f)) {
            org.telegram.messenger.g0.v1(kiVar.f36436a2.getFragmentView());
            org.telegram.messenger.g0.i3(new p3(this, 1), 250L);
            return;
        }
        kiVar.getWindow().setSoftInputMode(20);
        setFocusable(true);
        kiVar.A0(true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p2 p2Var = this.f18715n;
        if (i7 == ns.f25615z1) {
            if (this.f18720y == ((Long) objArr[0]).longValue()) {
                p2Var.h();
                this.I = true;
                this.f33607b.dismiss();
            }
        } else if (i7 == ns.f25540n4) {
            p2Var.f52828n.b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.f33606a), 153);
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
        o2 o2Var = this.K;
        return (int) (o2Var.getOffsetY() + o2Var.getSwipeOffsetY());
    }

    @Override
    public int getCustomActionBarBackground() {
        return this.f18714a0;
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
        return this.f18715n;
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
        if (this.f18715n.D()) {
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
        ns.f(this.G).n(this, ns.f25615z1);
        ns.e().n(this, ns.f25540n4);
        org.telegram.ui.ActionBar.y s5 = this.f33607b.V2.s();
        org.telegram.ui.ActionBar.q0 q0Var = this.L;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q0Var.f29497b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        s5.removeView(q0Var);
        this.f18715n.h();
        this.U = true;
        org.telegram.messenger.g0.r(this.V);
    }

    @Override
    public final void requestLayout() {
        if (this.f18717s) {
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
        this.f18714a0 = i7;
    }

    public void setCustomBackground(int i7) {
        this.S = i7;
        this.R = true;
    }

    public void setDelegate(org.telegram.ui.web.c0 c0Var) {
        this.f18715n.setDelegate(c0Var);
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
        this.f33607b.f29682b.invalidate();
    }

    @Override
    public final void t() {
        ki kiVar = this.f33607b;
        kiVar.A0(false);
        kiVar.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void u() {
        this.L.setVisibility(8);
        this.Q = false;
        p2 p2Var = this.f18715n;
        boolean z10 = p2Var.S;
        ki kiVar = this.f33607b;
        if (!z10) {
            org.telegram.messenger.g0.Q3(kiVar.V2.getBackButton(), 2131231240);
        }
        kiVar.V2.setBackground(null);
        if (p2Var.U) {
            p2Var.h();
            this.I = true;
        }
    }

    @Override
    public final void w(int i7) {
        t3 t3Var = this.J;
        p2 p2Var = this.f18715n;
        if (i7 == -1) {
            if (!p2Var.D()) {
                P();
                return;
            }
            return;
        }
        ki kiVar = this.f33607b;
        if (i7 == 2131296500) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f18718w);
            kiVar.f36436a2.presentFragment(new an(bundle));
            kiVar.dismiss();
            return;
        }
        int i10 = 0;
        if (i7 == 2131296504) {
            if (p2Var.getWebView() != null) {
                p2Var.getWebView().animate().cancel();
                p2Var.getWebView().animate().alpha(0.0f).start();
            }
            t3Var.setLoadProgress(0.0f);
            t3Var.setAlpha(1.0f);
            t3Var.setVisibility(0);
            p2Var.setBotUser(np.s1(this.G).a2(Long.valueOf(this.f18718w)));
            p2Var.s(this.G, this.f18718w);
            ns.f(p2Var.N).d(new org.telegram.ui.web.q(p2Var, 1));
        } else if (i7 == 2131296495) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = si.b0(this.G).f26461b.bots;
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i10);
                i10++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.f18718w) {
                    kiVar.k1(tL_attachMenuBot2, np.s1(this.G).a2(Long.valueOf(this.f18718w)));
                    return;
                }
            }
        } else if (i7 == 2131296506) {
            p2Var.getClass();
            p2Var.Q = System.currentTimeMillis();
            p2Var.y("settings_button_pressed", null);
        } else if (i7 == 2131296490) {
            si.b0(this.G).y0(this.f18718w, si.d2, null);
        } else if (i7 == 2131296510) {
            vf.c.t(getContext(), hd.M0(2131752893, null));
        } else if (i7 == 2131296505) {
            int i11 = this.G;
            Context context = getContext();
            cc ccVar = new cc(ta.a(getContext()), this.f33606a);
            long j3 = this.f18718w;
            int i12 = my0.f49340w1;
            my0.J0(i11, context, j3, false, false, new ArrayList(), ccVar, null, new byte[0], null, null);
        }
    }

    @Override
    public final void y() {
        this.P = false;
        this.K.setSwipeOffsetAnimationDisallowed(false);
        this.f18715n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override
    public final void z(int i7, boolean z10) {
        boolean z11;
        p2 p2Var = this.f18715n;
        o2 o2Var = this.K;
        if (z10) {
            p2Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = o2Var.getTopActionBarOffsetY() + (-o2Var.getOffsetY());
            if (o2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                o2Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int Q = this.f33607b.f36482p3.Q() + i7;
            setMeasuredDimension(getMeasuredWidth(), i7);
            this.P = true;
            o2Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z11) {
                ValueAnimator valueAnimator = this.f18716r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f18716r = null;
                }
                if (p2Var.getWebView() != null) {
                    int scrollY = p2Var.getWebView().getScrollY();
                    int i10 = (Q - i7) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i10).setDuration(250L);
                    this.f18716r = duration;
                    duration.setInterpolator(pi.k.V);
                    this.f18716r.addUpdateListener(new q3(this, 0));
                    this.f18716r.addListener(new j2(this, i10, 1));
                    this.f18716r.start();
                }
            }
        }
    }
}
