package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.xa;
import org.telegram.ui.an;
import org.telegram.ui.oy0;
public final class c4 extends vh implements ls {
    public int D;
    public long E;
    public int F;
    public String G;
    public boolean H;
    public v3 I;
    public r2 J;
    public org.telegram.ui.ActionBar.r0 K;
    public org.telegram.ui.ActionBar.z0 L;
    public org.telegram.ui.ActionBar.z0 M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public boolean S;
    public boolean T;
    public s3 U;
    public boolean V;
    public int W;
    public s2 f14592n;
    public ValueAnimator f14593r;
    public boolean f14594s;
    public long f14595w;
    public long f14596x;
    public long f14597y;

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: hi.c4.B(int, int):void");
    }

    @Override
    public final void H(vh vhVar) {
        s2 s2Var = this.f14592n;
        CharSequence p10 = t10.p(qp.s1(this.F).a2(Long.valueOf(this.f14595w)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
            p10 = i6.m(p10, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        di diVar = this.f38969b;
        diVar.R2.setTitle(p10);
        this.J.setSwipeOffsetY(0.0f);
        if (s2Var.getWebView() != null) {
            s2Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        if (f2Var != null) {
            s2Var.setParentActivity(f2Var.getParentActivity());
        }
        this.K.setVisibility(0);
        if (!s2Var.R) {
            org.telegram.messenger.g0.R3(diVar.R2.getBackButton(), 2131231269);
        }
    }

    @Override
    public final void I() {
        if (this.f14592n.N) {
            P();
        }
        this.J.setSwipeOffsetAnimationDisallowed(false);
        org.telegram.messenger.g0.h3(new s3(this, 0));
    }

    @Override
    public final void J() {
        r2 r2Var = this.J;
        r2Var.e(r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY()));
    }

    @Override
    public final boolean M() {
        return false;
    }

    public final boolean O() {
        String str;
        if (this.S) {
            TLRPC.User a22 = qp.s1(this.F).a2(Long.valueOf(this.f14595w));
            if (a22 != null) {
                str = g5.m(0, a22.first_name, a22.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
            u1Var.R = str;
            u1Var.T = hd.M0(2131752917, null);
            alertDialog$Builder.k(hd.M0(2131752916, null), new u3(this));
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
            u1Var.show();
            r6.V((TextView) u1Var.d(-1), k6.f28090q7, this.f38968a);
            return false;
        }
        this.f38969b.dismiss();
        return true;
    }

    public final void P() {
        di diVar = this.f38969b;
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        if ((f2Var instanceof an) && ((an) f2Var).l1.Q() > org.telegram.messenger.g0.L(20.0f)) {
            org.telegram.messenger.g0.v1(diVar.W1.getFragmentView());
            org.telegram.messenger.g0.i3(new s3(this, 1), 250L);
            return;
        }
        diVar.getWindow().setSoftInputMode(20);
        setFocusable(true);
        diVar.A0(true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        s2 s2Var = this.f14592n;
        if (i7 == qs.f25110z1) {
            if (this.f14597y == ((Long) objArr[0]).longValue()) {
                s2Var.h();
                this.H = true;
                this.f38969b.dismiss();
            }
        } else if (i7 == qs.f25035n4) {
            s2Var.f51370n.b(k6.w0(k6.f27922h5, this.f38968a), 153);
        }
    }

    @Override
    public final boolean g() {
        return this.V;
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(12.0f) + ((int) this.J.getTopActionBarOffsetY());
    }

    @Override
    public int getCurrentItemTop() {
        r2 r2Var = this.J;
        return (int) (r2Var.getOffsetY() + r2Var.getSwipeOffsetY());
    }

    @Override
    public int getCustomActionBarBackground() {
        return this.W;
    }

    @Override
    public int getCustomBackground() {
        return this.R;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (int) this.J.getOffsetY();
    }

    public String getStartCommand() {
        return this.G;
    }

    public org.telegram.ui.web.x0 getWebViewContainer() {
        return this.f14592n;
    }

    @Override
    public final boolean h() {
        return this.Q;
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final boolean k() {
        if (this.f14592n.D()) {
            return true;
        }
        O();
        return true;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.O) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i7, i10);
        }
    }

    @Override
    public final void p() {
        qs.f(this.F).n(this, qs.f25110z1);
        qs.e().n(this, qs.f25035n4);
        org.telegram.ui.ActionBar.y q10 = this.f38969b.R2.q();
        org.telegram.ui.ActionBar.r0 r0Var = this.K;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r0Var.f28421b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        q10.removeView(r0Var);
        this.f14592n.h();
        this.T = true;
        org.telegram.messenger.g0.r(this.U);
    }

    @Override
    public final void requestLayout() {
        if (this.f14594s) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final boolean s() {
        O();
        return false;
    }

    public void setAllowSwipes(boolean z9) {
        this.J.setAllowSwipes(z9);
    }

    public void setCustomActionBarBackground(int i7) {
        this.V = true;
        this.W = i7;
    }

    public void setCustomBackground(int i7) {
        this.R = i7;
        this.Q = true;
    }

    public void setDelegate(org.telegram.ui.web.d0 d0Var) {
        this.f14592n.setDelegate(d0Var);
    }

    public void setMeasureOffsetY(int i7) {
        this.N = i7;
        this.J.requestLayout();
    }

    public void setNeedCloseConfirmation(boolean z9) {
        this.S = z9;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38969b.f28616b.invalidate();
    }

    @Override
    public final void t() {
        di diVar = this.f38969b;
        diVar.A0(false);
        diVar.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void u() {
        this.K.setVisibility(8);
        this.P = false;
        s2 s2Var = this.f14592n;
        boolean z9 = s2Var.R;
        di diVar = this.f38969b;
        if (!z9) {
            org.telegram.messenger.g0.R3(diVar.R2.getBackButton(), 2131231240);
        }
        diVar.R2.setBackground(null);
        if (s2Var.T) {
            s2Var.h();
            this.H = true;
        }
    }

    @Override
    public final void w(int i7) {
        v3 v3Var = this.I;
        s2 s2Var = this.f14592n;
        if (i7 == -1) {
            if (!s2Var.D()) {
                O();
                return;
            }
            return;
        }
        di diVar = this.f38969b;
        if (i7 == 2131296500) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f14595w);
            diVar.W1.presentFragment(new an(bundle));
            diVar.dismiss();
            return;
        }
        int i10 = 0;
        if (i7 == 2131296504) {
            if (s2Var.getWebView() != null) {
                s2Var.getWebView().animate().cancel();
                s2Var.getWebView().animate().alpha(0.0f).start();
            }
            v3Var.setLoadProgress(0.0f);
            v3Var.setAlpha(1.0f);
            v3Var.setVisibility(0);
            s2Var.setBotUser(qp.s1(this.F).a2(Long.valueOf(this.f14595w)));
            s2Var.s(this.F, this.f14595w);
            qs.f(s2Var.M).d(new org.telegram.ui.web.p(s2Var, 1));
        } else if (i7 == 2131296495) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = ui.b0(this.F).f25799b.bots;
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i10);
                i10++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.f14595w) {
                    diVar.k1(tL_attachMenuBot2, qp.s1(this.F).a2(Long.valueOf(this.f14595w)));
                    return;
                }
            }
        } else if (i7 == 2131296506) {
            s2Var.getClass();
            s2Var.P = System.currentTimeMillis();
            s2Var.y("settings_button_pressed", null);
        } else if (i7 == 2131296490) {
            ui.b0(this.F).y0(this.f14595w, ui.f25794c2, null);
        } else if (i7 == 2131296510) {
            vf.c.t(getContext(), hd.M0(2131752893, null));
        } else if (i7 == 2131296505) {
            int i11 = this.F;
            Context context = getContext();
            hc hcVar = new hc(xa.a(getContext()), this.f38968a);
            long j3 = this.f14595w;
            int i12 = oy0.f48566s1;
            oy0.J0(i11, context, j3, false, false, new ArrayList(), hcVar, null, new byte[0], null, null);
        }
    }

    @Override
    public final void y() {
        this.O = false;
        this.J.setSwipeOffsetAnimationDisallowed(false);
        this.f14592n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override
    public final void z(int i7, boolean z9) {
        boolean z10;
        s2 s2Var = this.f14592n;
        r2 r2Var = this.J;
        if (z9) {
            s2Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY());
            if (r2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                r2Var.e(topActionBarOffsetY);
                z10 = true;
            } else {
                z10 = false;
            }
            int Q = this.f38969b.f32959l3.Q() + i7;
            setMeasuredDimension(getMeasuredWidth(), i7);
            this.O = true;
            r2Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z10) {
                ValueAnimator valueAnimator = this.f14593r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f14593r = null;
                }
                if (s2Var.getWebView() != null) {
                    int scrollY = s2Var.getWebView().getScrollY();
                    int i10 = (Q - i7) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i10).setDuration(250L);
                    this.f14593r = duration;
                    duration.setInterpolator(mi.l.V);
                    this.f14593r.addUpdateListener(new t3(this, 0));
                    this.f14593r.addListener(new m2(this, i10, 1));
                    this.f14593r.start();
                }
            }
        }
    }
}
