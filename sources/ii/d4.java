package ii;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.g5;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.wa;
import org.telegram.ui.ey0;
import org.telegram.ui.wm;
public final class d4 extends th implements cs {
    public int E;
    public long F;
    public int G;
    public String H;
    public boolean I;
    public w3 J;
    public r2 K;
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
    public s3 V;
    public boolean W;
    public int f14897a0;
    public s2 f14898n;
    public ValueAnimator f14899r;
    public boolean f14900s;
    public long f14901w;
    public long f14902x;
    public long f14903y;

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: ii.d4.B(int, int):void");
    }

    @Override
    public final void H(th thVar) {
        s2 s2Var = this.f14898n;
        CharSequence p10 = l10.p(hp.s1(this.G).a2(Long.valueOf(this.f14901w)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
            p10 = i6.m(p10, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        bi biVar = this.f38416b;
        biVar.S2.setTitle(p10);
        this.K.setSwipeOffsetY(0.0f);
        if (s2Var.getWebView() != null) {
            s2Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        if (d2Var != null) {
            s2Var.setParentActivity(d2Var.getParentActivity());
        }
        this.L.setVisibility(0);
        if (!s2Var.S) {
            org.telegram.messenger.g0.R3(biVar.S2.getBackButton(), 2131231269);
        }
    }

    @Override
    public final void I() {
        if (this.f14898n.O) {
            P();
        }
        this.K.setSwipeOffsetAnimationDisallowed(false);
        org.telegram.messenger.g0.h3(new s3(this, 0));
    }

    @Override
    public final void J() {
        r2 r2Var = this.K;
        r2Var.e(r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY()));
    }

    @Override
    public final boolean M() {
        return false;
    }

    public final boolean O() {
        String str;
        if (this.T) {
            TLRPC.User a22 = hp.s1(this.G).a2(Long.valueOf(this.f14901w));
            if (a22 != null) {
                str = g5.m(0, a22.first_name, a22.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = str;
            s1Var.U = bd.M0(2131752917, null);
            alertDialog$Builder.k(bd.M0(2131752916, null), new u3(this));
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
            s1Var.show();
            r6.V((TextView) s1Var.d(-1), k6.f28122q7, this.f38415a);
            return false;
        }
        this.f38416b.dismiss();
        return true;
    }

    public final void P() {
        bi biVar = this.f38416b;
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        if ((d2Var instanceof wm) && ((wm) d2Var).m1.Q() > org.telegram.messenger.g0.L(20.0f)) {
            org.telegram.messenger.g0.v1(biVar.X1.getFragmentView());
            org.telegram.messenger.g0.i3(new s3(this, 1), 250L);
            return;
        }
        biVar.getWindow().setSoftInputMode(20);
        setFocusable(true);
        biVar.A0(true);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        s2 s2Var = this.f14898n;
        if (i3 == hs.f23348z1) {
            if (this.f14903y == ((Long) objArr[0]).longValue()) {
                s2Var.h();
                this.I = true;
                this.f38416b.dismiss();
            }
        } else if (i3 == hs.n4) {
            s2Var.f51077n.b(k6.w0(k6.f27954h5, this.f38415a), 153);
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
        r2 r2Var = this.K;
        return (int) (r2Var.getOffsetY() + r2Var.getSwipeOffsetY());
    }

    @Override
    public int getCustomActionBarBackground() {
        return this.f14897a0;
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

    public org.telegram.ui.web.w0 getWebViewContainer() {
        return this.f14898n;
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
        if (this.f14898n.C()) {
            return true;
        }
        O();
        return true;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        if (this.P) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i3, i10);
        }
    }

    @Override
    public final void p() {
        hs.f(this.G).n(this, hs.f23348z1);
        hs.e().n(this, hs.n4);
        org.telegram.ui.ActionBar.x q10 = this.f38416b.S2.q();
        org.telegram.ui.ActionBar.q0 q0Var = this.L;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q0Var.f28440b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        q10.removeView(q0Var);
        this.f14898n.h();
        this.U = true;
        org.telegram.messenger.g0.r(this.V);
    }

    @Override
    public final void requestLayout() {
        if (this.f14900s) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final boolean s() {
        O();
        return false;
    }

    public void setAllowSwipes(boolean z10) {
        this.K.setAllowSwipes(z10);
    }

    public void setCustomActionBarBackground(int i3) {
        this.W = true;
        this.f14897a0 = i3;
    }

    public void setCustomBackground(int i3) {
        this.S = i3;
        this.R = true;
    }

    public void setDelegate(org.telegram.ui.web.d0 d0Var) {
        this.f14898n.setDelegate(d0Var);
    }

    public void setMeasureOffsetY(int i3) {
        this.O = i3;
        this.K.requestLayout();
    }

    public void setNeedCloseConfirmation(boolean z10) {
        this.T = z10;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38416b.f28586b.invalidate();
    }

    @Override
    public final void t() {
        bi biVar = this.f38416b;
        biVar.A0(false);
        biVar.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void u() {
        this.L.setVisibility(8);
        this.Q = false;
        s2 s2Var = this.f14898n;
        boolean z10 = s2Var.S;
        bi biVar = this.f38416b;
        if (!z10) {
            org.telegram.messenger.g0.R3(biVar.S2.getBackButton(), 2131231240);
        }
        biVar.S2.setBackground(null);
        if (s2Var.U) {
            s2Var.h();
            this.I = true;
        }
    }

    @Override
    public final void w(int i3) {
        w3 w3Var = this.J;
        s2 s2Var = this.f14898n;
        if (i3 == -1) {
            if (!s2Var.C()) {
                O();
                return;
            }
            return;
        }
        bi biVar = this.f38416b;
        if (i3 == 2131296500) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f14901w);
            biVar.X1.presentFragment(new wm(bundle));
            biVar.dismiss();
            return;
        }
        int i10 = 0;
        if (i3 == 2131296504) {
            if (s2Var.getWebView() != null) {
                s2Var.getWebView().animate().cancel();
                s2Var.getWebView().animate().alpha(0.0f).start();
            }
            w3Var.setLoadProgress(0.0f);
            w3Var.setAlpha(1.0f);
            w3Var.setVisibility(0);
            s2Var.setBotUser(hp.s1(this.G).a2(Long.valueOf(this.f14901w)));
            s2Var.s(this.G, this.f14901w);
            hs.f(s2Var.N).d(new org.telegram.ui.web.r(s2Var, 1));
        } else if (i3 == 2131296495) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = li.b0(this.G).f24011b.bots;
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i10);
                i10++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.f14901w) {
                    biVar.k1(tL_attachMenuBot2, hp.s1(this.G).a2(Long.valueOf(this.f14901w)));
                    return;
                }
            }
        } else if (i3 == 2131296506) {
            s2Var.getClass();
            s2Var.Q = System.currentTimeMillis();
            s2Var.y("settings_button_pressed", null);
        } else if (i3 == 2131296490) {
            li.b0(this.G).y0(this.f14901w, li.f24005d2, null);
        } else if (i3 == 2131296510) {
            sf.c.t(getContext(), bd.M0(2131752893, null));
        } else if (i3 == 2131296505) {
            int i11 = this.G;
            Context context = getContext();
            fc fcVar = new fc(wa.a(getContext()), this.f38415a);
            long j10 = this.f14901w;
            int i12 = ey0.f45092t1;
            ey0.J0(i11, context, j10, false, false, new ArrayList(), fcVar, null, new byte[0], null, null);
        }
    }

    @Override
    public final void y() {
        this.P = false;
        this.K.setSwipeOffsetAnimationDisallowed(false);
        this.f14898n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override
    public final void z(int i3, boolean z10) {
        boolean z11;
        s2 s2Var = this.f14898n;
        r2 r2Var = this.K;
        if (z10) {
            s2Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY());
            if (r2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                r2Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int Q = this.f38416b.f32249m3.Q() + i3;
            setMeasuredDimension(getMeasuredWidth(), i3);
            this.P = true;
            r2Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z11) {
                ValueAnimator valueAnimator = this.f14899r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f14899r = null;
                }
                if (s2Var.getWebView() != null) {
                    int scrollY = s2Var.getWebView().getScrollY();
                    int i10 = (Q - i3) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i10).setDuration(250L);
                    this.f14899r = duration;
                    duration.setInterpolator(ni.l.V);
                    this.f14899r.addUpdateListener(new t3(this, 0));
                    this.f14899r.addListener(new m2(this, i10, 1));
                    this.f14899r.start();
                }
            }
        }
    }
}
