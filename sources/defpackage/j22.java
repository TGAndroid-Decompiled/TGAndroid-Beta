package defpackage;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
public final class j22 extends f12 implements fn7 {
    public int E;
    public long F;
    public int G;
    public String H;
    public boolean I;
    public d22 J;
    public ow0 K;
    public s7 L;
    public b8 M;
    public b8 N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public y12 V;
    public boolean W;
    public int a0;
    public pw0 n;
    public ValueAnimator r;
    public boolean s;
    public long w;
    public long x;
    public long y;

    @Override
    public final void A(int i, boolean z) {
        boolean z2;
        pw0 pw0Var = this.n;
        ow0 ow0Var = this.K;
        if (z) {
            pw0Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = ow0Var.getTopActionBarOffsetY() + (-ow0Var.getOffsetY());
            if (ow0Var.getSwipeOffsetY() != topActionBarOffsetY) {
                ow0Var.d(topActionBarOffsetY);
                z2 = true;
            } else {
                z2 = false;
            }
            int Q = this.b.o3.Q() + i;
            setMeasuredDimension(getMeasuredWidth(), i);
            this.P = true;
            ow0Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z2) {
                ValueAnimator valueAnimator = this.r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.r = null;
                }
                if (pw0Var.getWebView() != null) {
                    int scrollY = pw0Var.getWebView().getScrollY();
                    int i2 = (Q - i) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i2).setDuration(250L);
                    this.r = duration;
                    duration.setInterpolator(bb2.V);
                    this.r.addUpdateListener(new z12(this, (byte) 1));
                    this.r.addListener(new dn(this, i2, (byte) 4));
                    this.r.start();
                }
            }
        }
    }

    @Override
    public final void C(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j22.C(int, int):void");
    }

    @Override
    public final void H(f12 f12Var) {
        pw0 pw0Var = this.n;
        CharSequence r = lbc.r(uc7.s1(this.G).X1(Long.valueOf(this.w)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(hl.L(20.0f));
            r = pv3.m(r, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        n12 n12Var = this.b;
        n12Var.U2.setTitle(r);
        this.K.setSwipeOffsetY(0.0f);
        if (pw0Var.getWebView() != null) {
            pw0Var.getWebView().scrollTo(0, 0);
        }
        e eVar = n12Var.Z1;
        if (eVar != null) {
            pw0Var.setParentActivity(eVar.getParentActivity());
        }
        this.L.setVisibility(0);
        if (!pw0Var.S) {
            hl.L3(n12Var.U2.getBackButton(), 2131231272);
        }
    }

    @Override
    public final void I() {
        if (this.n.O) {
            P();
        }
        this.K.setSwipeOffsetAnimationDisallowed(false);
        hl.c3(new y12(this, (byte) 0));
    }

    @Override
    public final void J() {
        ow0 ow0Var = this.K;
        ow0Var.d(ow0Var.getTopActionBarOffsetY() + (-ow0Var.getOffsetY()));
    }

    @Override
    public final boolean M() {
        return false;
    }

    public final boolean O() {
        String str;
        if (this.T) {
            TLRPC.User X1 = uc7.s1(this.G).X1(Long.valueOf(this.w));
            if (X1 != null) {
                str = lv2.m(0, X1.first_name, X1.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            id idVar = alertDialog$Builder.a;
            idVar.S = str;
            idVar.U = ob6.M0(2131752898, null);
            alertDialog$Builder.j(ob6.M0(2131752897, null), new a22(this));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            idVar.show();
            yob.X((TextView) idVar.c(-1), aob.q7, this.a);
            return false;
        }
        this.b.dismiss();
        return true;
    }

    public final void P() {
        n12 n12Var = this.b;
        e eVar = n12Var.Z1;
        if ((eVar instanceof zu1) && ((zu1) eVar).m1.Q() > hl.L(20.0f)) {
            hl.t1(n12Var.Z1.getFragmentView());
            hl.d3(new y12(this, (byte) 1), 250L);
            return;
        }
        n12Var.getWindow().setSoftInputMode(20);
        setFocusable(true);
        n12Var.w0(true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        pw0 pw0Var = this.n;
        if (i == jn7.z1) {
            if (this.y == ((Long) objArr[0]).longValue()) {
                pw0Var.f();
                this.I = true;
                this.b.dismiss();
            }
        } else if (i == jn7.q4) {
            pw0Var.n.b(aob.v0(aob.h5, this.a), 153);
        }
    }

    @Override
    public final boolean g() {
        return this.W;
    }

    @Override
    public int getButtonsHideOffset() {
        return hl.L(12.0f) + ((int) this.K.getTopActionBarOffsetY());
    }

    @Override
    public int getCurrentItemTop() {
        ow0 ow0Var = this.K;
        return (int) (ow0Var.getOffsetY() + ow0Var.getSwipeOffsetY());
    }

    @Override
    public int getCustomActionBarBackground() {
        return this.a0;
    }

    @Override
    public int getCustomBackground() {
        return this.S;
    }

    @Override
    public int getFirstOffset() {
        return hl.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (int) this.K.getOffsetY();
    }

    public String getStartCommand() {
        return this.H;
    }

    public rv0 getWebViewContainer() {
        return this.n;
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
        if (this.n.A()) {
            return true;
        }
        O();
        return true;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.P) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override
    public final void p() {
        jn7.f(this.G).n(this, jn7.z1);
        jn7.e().n(this, jn7.q4);
        s6 u = this.b.U2.u();
        s7 s7Var = this.L;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = s7Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        u.removeView(s7Var);
        this.n.f();
        this.U = true;
        hl.r(this.V);
    }

    @Override
    public final void requestLayout() {
        if (this.s) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final boolean s() {
        O();
        return false;
    }

    public void setAllowSwipes(boolean z) {
        this.K.setAllowSwipes(z);
    }

    public void setCustomActionBarBackground(int i) {
        this.W = true;
        this.a0 = i;
    }

    public void setCustomBackground(int i) {
        this.S = i;
        this.R = true;
    }

    public void setDelegate(uu0 uu0Var) {
        this.n.setDelegate(uu0Var);
    }

    public void setMeasureOffsetY(int i) {
        this.O = i;
        this.K.requestLayout();
    }

    public void setNeedCloseConfirmation(boolean z) {
        this.T = z;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    @Override
    public final void u() {
        n12 n12Var = this.b;
        n12Var.w0(false);
        n12Var.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void v() {
        this.L.setVisibility(8);
        this.Q = false;
        pw0 pw0Var = this.n;
        boolean z = pw0Var.S;
        n12 n12Var = this.b;
        if (!z) {
            hl.L3(n12Var.U2.getBackButton(), 2131231243);
        }
        n12Var.U2.setBackground(null);
        if (pw0Var.U) {
            pw0Var.f();
            this.I = true;
        }
    }

    @Override
    public final void x(int i) {
        d22 d22Var = this.J;
        pw0 pw0Var = this.n;
        if (i == -1) {
            if (!pw0Var.A()) {
                O();
                return;
            }
            return;
        }
        n12 n12Var = this.b;
        if (i == 2131296502) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.w);
            n12Var.Z1.presentFragment(new zu1(bundle));
            n12Var.dismiss();
            return;
        }
        int i2 = 0;
        if (i == 2131296506) {
            if (pw0Var.getWebView() != null) {
                pw0Var.getWebView().animate().cancel();
                pw0Var.getWebView().animate().alpha(0.0f).start();
            }
            d22Var.setLoadProgress(0.0f);
            d22Var.setAlpha(1.0f);
            d22Var.setVisibility(0);
            pw0Var.setBotUser(uc7.s1(this.G).X1(Long.valueOf(this.w)));
            pw0Var.p(this.G, this.w);
            jn7.f(pw0Var.N).d(new bu0(pw0Var, (byte) 1));
        } else if (i == 2131296497) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = ls6.d0(this.G).b.bots;
            int size = arrayList.size();
            while (i2 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i2);
                i2++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.w) {
                    n12Var.g1(tL_attachMenuBot2, uc7.s1(this.G).X1(Long.valueOf(this.w)));
                    return;
                }
            }
        } else if (i == 2131296508) {
            pw0Var.getClass();
            pw0Var.Q = System.currentTimeMillis();
            pw0Var.v("settings_button_pressed", null);
        } else if (i == 2131296492) {
            ls6.d0(this.G).z0(this.w, ls6.f2 ? 1 : 0, null);
        } else if (i == 2131296512) {
            m01.u(getContext(), ob6.M0(2131752874, null));
        } else if (i == 2131296507) {
            nb9.F0(this.G, getContext(), new d31(o11.a(getContext()), this.a), this.w);
        }
    }

    @Override
    public final void z() {
        this.P = false;
        this.K.setSwipeOffsetAnimationDisallowed(false);
        this.n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }
}
