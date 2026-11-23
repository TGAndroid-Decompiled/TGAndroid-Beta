package ki;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j6;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.ui;
import org.telegram.ui.bn;
import org.telegram.ui.qy0;
public final class s3 extends mi implements gs {
    public int E;
    public long F;
    public int G;
    public String H;
    public boolean I;
    public n3 J;
    public j2 K;
    public org.telegram.ui.ActionBar.q0 L;
    public org.telegram.ui.ActionBar.y0 M;
    public org.telegram.ui.ActionBar.y0 N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public j3 V;
    public boolean W;
    public int f18967a0;
    public k2 f18968n;
    public ValueAnimator f18969r;
    public boolean f18970s;
    public long f18971w;
    public long f18972x;
    public long f18973y;

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: ki.s3.B(int, int):void");
    }

    @Override
    public final void I(mi miVar) {
        k2 k2Var = this.f18968n;
        CharSequence q10 = p10.q(np.u1(this.G).c2(Long.valueOf(this.f18971w)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
            q10 = j6.m(q10, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        ui uiVar = this.f37520b;
        uiVar.V2.setTitle(q10);
        this.K.setSwipeOffsetY(0.0f);
        if (k2Var.getWebView() != null) {
            k2Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40368a2;
        if (g2Var != null) {
            k2Var.setParentActivity(g2Var.getParentActivity());
        }
        this.L.setVisibility(0);
        if (!k2Var.S) {
            org.telegram.messenger.g0.P3(uiVar.V2.getBackButton(), 2131231269);
        }
    }

    @Override
    public final void J() {
        if (this.f18968n.O) {
            Q();
        }
        this.K.setSwipeOffsetAnimationDisallowed(false);
        org.telegram.messenger.g0.g3(new j3(this, 0));
    }

    @Override
    public final void K() {
        j2 j2Var = this.K;
        j2Var.e(j2Var.getTopActionBarOffsetY() + (-j2Var.getOffsetY()));
    }

    @Override
    public final boolean N() {
        return false;
    }

    public final boolean P() {
        String str;
        if (this.T) {
            TLRPC.User c22 = np.u1(this.G).c2(Long.valueOf(this.f18971w));
            if (c22 != null) {
                str = i5.m(0, c22.first_name, c22.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
            t1Var.S = str;
            t1Var.U = hd.N0(2131752905, null);
            alertDialog$Builder.k(hd.N0(2131752904, null), new l3(this));
            alertDialog$Builder.h(hd.N0(2131752577, null), null);
            t1Var.show();
            t6.U((TextView) t1Var.d(-1), m6.f29622q7, this.f37519a);
            return false;
        }
        this.f37520b.dismiss();
        return true;
    }

    public final void Q() {
        ui uiVar = this.f37520b;
        org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40368a2;
        if ((g2Var instanceof bn) && ((bn) g2Var).f46111m1.Q() > org.telegram.messenger.g0.L(20.0f)) {
            org.telegram.messenger.g0.v1(uiVar.f40368a2.getFragmentView());
            org.telegram.messenger.g0.h3(new j3(this, 1), 250L);
            return;
        }
        uiVar.getWindow().setSoftInputMode(20);
        setFocusable(true);
        uiVar.A0(true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        k2 k2Var = this.f18968n;
        if (i7 == ls.f25427z1) {
            if (this.f18973y == ((Long) objArr[0]).longValue()) {
                k2Var.h();
                this.I = true;
                this.f37520b.dismiss();
            }
        } else if (i7 == ls.f25369q4) {
            k2Var.f53358n.b(m6.w0(m6.f29454h5, this.f37519a), 153);
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
        j2 j2Var = this.K;
        return (int) (j2Var.getOffsetY() + j2Var.getSwipeOffsetY());
    }

    @Override
    public int getCustomActionBarBackground() {
        return this.f18967a0;
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
        return this.f18968n;
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
        if (this.f18968n.D()) {
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
        ls.f(this.G).n(this, ls.f25427z1);
        ls.e().n(this, ls.f25369q4);
        org.telegram.ui.ActionBar.y s5 = this.f37520b.V2.s();
        org.telegram.ui.ActionBar.q0 q0Var = this.L;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q0Var.f29902b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        s5.removeView(q0Var);
        this.f18968n.h();
        this.U = true;
        org.telegram.messenger.g0.r(this.V);
    }

    @Override
    public final void requestLayout() {
        if (this.f18970s) {
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
        this.f18967a0 = i7;
    }

    public void setCustomBackground(int i7) {
        this.S = i7;
        this.R = true;
    }

    public void setDelegate(org.telegram.ui.web.c0 c0Var) {
        this.f18968n.setDelegate(c0Var);
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
        this.f37520b.f30176b.invalidate();
    }

    @Override
    public final void t() {
        ui uiVar = this.f37520b;
        uiVar.A0(false);
        uiVar.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void u() {
        this.L.setVisibility(8);
        this.Q = false;
        k2 k2Var = this.f18968n;
        boolean z10 = k2Var.S;
        ui uiVar = this.f37520b;
        if (!z10) {
            org.telegram.messenger.g0.P3(uiVar.V2.getBackButton(), 2131231240);
        }
        uiVar.V2.setBackground(null);
        if (k2Var.U) {
            k2Var.h();
            this.I = true;
        }
    }

    @Override
    public final void w(int i7) {
        n3 n3Var = this.J;
        k2 k2Var = this.f18968n;
        if (i7 == -1) {
            if (!k2Var.D()) {
                P();
                return;
            }
            return;
        }
        ui uiVar = this.f37520b;
        if (i7 == 2131296502) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f18971w);
            uiVar.f40368a2.presentFragment(new bn(bundle));
            uiVar.dismiss();
            return;
        }
        int i10 = 0;
        if (i7 == 2131296506) {
            if (k2Var.getWebView() != null) {
                k2Var.getWebView().animate().cancel();
                k2Var.getWebView().animate().alpha(0.0f).start();
            }
            n3Var.setLoadProgress(0.0f);
            n3Var.setAlpha(1.0f);
            n3Var.setVisibility(0);
            k2Var.setBotUser(np.u1(this.G).c2(Long.valueOf(this.f18971w)));
            k2Var.s(this.G, this.f18971w);
            ls.f(k2Var.N).d(new org.telegram.ui.web.q(k2Var, 1));
        } else if (i7 == 2131296497) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = si.d0(this.G).f26813b.bots;
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i10);
                i10++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.f18971w) {
                    uiVar.l1(tL_attachMenuBot2, np.u1(this.G).c2(Long.valueOf(this.f18971w)));
                    return;
                }
            }
        } else if (i7 == 2131296508) {
            k2Var.getClass();
            k2Var.Q = System.currentTimeMillis();
            k2Var.y("settings_button_pressed", null);
        } else if (i7 == 2131296492) {
            si.d0(this.G).A0(this.f18971w, si.f26807f2, null);
        } else if (i7 == 2131296512) {
            vf.c.t(getContext(), hd.N0(2131752881, null));
        } else if (i7 == 2131296507) {
            int i11 = this.G;
            Context context = getContext();
            lc lcVar = new lc(cb.a(getContext()), this.f37519a);
            long j3 = this.f18971w;
            int i12 = qy0.f51394w1;
            qy0.K0(i11, context, j3, false, false, new ArrayList(), lcVar, null, new byte[0], null, null);
        }
    }

    @Override
    public final void y() {
        this.P = false;
        this.K.setSwipeOffsetAnimationDisallowed(false);
        this.f18968n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override
    public final void z(int i7, boolean z10) {
        boolean z11;
        k2 k2Var = this.f18968n;
        j2 j2Var = this.K;
        if (z10) {
            k2Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = j2Var.getTopActionBarOffsetY() + (-j2Var.getOffsetY());
            if (j2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                j2Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int Q = this.f37520b.f40414p3.Q() + i7;
            setMeasuredDimension(getMeasuredWidth(), i7);
            this.P = true;
            j2Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z11) {
                ValueAnimator valueAnimator = this.f18969r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f18969r = null;
                }
                if (k2Var.getWebView() != null) {
                    int scrollY = k2Var.getWebView().getScrollY();
                    int i10 = (Q - i7) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i10).setDuration(250L);
                    this.f18969r = duration;
                    duration.setInterpolator(pi.k.V);
                    this.f18969r.addUpdateListener(new k3(this, 0));
                    this.f18969r.addListener(new e2(this, i10, 1));
                    this.f18969r.start();
                }
            }
        }
    }
}
