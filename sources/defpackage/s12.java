package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class s12 extends p02 implements gk7 {
    public int E;
    public long F;
    public int G;
    public String H;
    public boolean I;
    public m12 J;
    public fw0 K;
    public r7 L;
    public a8 M;
    public a8 N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public i12 V;
    public boolean W;
    public int a0;
    public gw0 n;
    public ValueAnimator r;
    public boolean s;
    public long w;
    public long x;
    public long y;

    @Override
    public final void A(int i, boolean z) {
        boolean z2;
        gw0 gw0Var = this.n;
        fw0 fw0Var = this.K;
        if (z) {
            gw0Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = fw0Var.getTopActionBarOffsetY() + (-fw0Var.getOffsetY());
            if (fw0Var.getSwipeOffsetY() != topActionBarOffsetY) {
                fw0Var.d(topActionBarOffsetY);
                z2 = true;
            } else {
                z2 = false;
            }
            int Q = this.b.o3.Q() + i;
            setMeasuredDimension(getMeasuredWidth(), i);
            this.P = true;
            fw0Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z2) {
                ValueAnimator valueAnimator = this.r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.r = null;
                }
                if (gw0Var.getWebView() != null) {
                    int scrollY = gw0Var.getWebView().getScrollY();
                    int i2 = (Q - i) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i2).setDuration(250L);
                    this.r = duration;
                    duration.setInterpolator(la2.V);
                    this.r.addUpdateListener(new j12(this, (byte) 0));
                    this.r.addListener(new cn(this, i2, (byte) 4));
                    this.r.start();
                }
            }
        }
    }

    @Override
    public final void C(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s12.C(int, int):void");
    }

    @Override
    public final void I(p02 p02Var) {
        gw0 gw0Var = this.n;
        CharSequence r = l7c.r(na7.q1(this.G).V1(Long.valueOf(this.w)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(gl.L(20.0f));
            r = vu3.m(r, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        x02 x02Var = this.b;
        x02Var.U2.setTitle(r);
        this.K.setSwipeOffsetY(0.0f);
        if (gw0Var.getWebView() != null) {
            gw0Var.getWebView().scrollTo(0, 0);
        }
        d dVar = x02Var.Z1;
        if (dVar != null) {
            gw0Var.setParentActivity(dVar.getParentActivity());
        }
        this.L.setVisibility(0);
        if (!gw0Var.S) {
            gl.L3(x02Var.U2.getBackButton(), 2131231272);
        }
    }

    @Override
    public final void J() {
        if (this.n.O) {
            Q();
        }
        this.K.setSwipeOffsetAnimationDisallowed(false);
        gl.c3(new i12(this, (byte) 0));
    }

    @Override
    public final void K() {
        fw0 fw0Var = this.K;
        fw0Var.d(fw0Var.getTopActionBarOffsetY() + (-fw0Var.getOffsetY()));
    }

    @Override
    public final boolean N() {
        return false;
    }

    public final boolean P() {
        String str;
        if (this.T) {
            TLRPC.User V1 = na7.q1(this.G).V1(Long.valueOf(this.w));
            if (V1 != null) {
                str = qu2.m(0, V1.first_name, V1.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = str;
            hdVar.U = k96.M0(2131752905, null);
            alertDialog$Builder.j(k96.M0(2131752904, null), new k12(this));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            hdVar.show();
            zkb.X((TextView) hdVar.c(-1), bkb.p7, this.a);
            return false;
        }
        this.b.dismiss();
        return true;
    }

    public final void Q() {
        x02 x02Var = this.b;
        d dVar = x02Var.Z1;
        if ((dVar instanceof mu1) && ((mu1) dVar).m1.Q() > gl.L(20.0f)) {
            gl.t1(x02Var.Z1.getFragmentView());
            gl.d3(new i12(this, (byte) 1), 250L);
            return;
        }
        x02Var.getWindow().setSoftInputMode(20);
        setFocusable(true);
        x02Var.v0(true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        gw0 gw0Var = this.n;
        if (i == kk7.y1) {
            if (this.y == ((Long) objArr[0]).longValue()) {
                gw0Var.f();
                this.I = true;
                this.b.dismiss();
            }
        } else if (i == kk7.p4) {
            gw0Var.n.b(bkb.v0(bkb.g5, this.a), 153);
        }
    }

    @Override
    public final boolean g() {
        return this.W;
    }

    @Override
    public int getButtonsHideOffset() {
        return gl.L(12.0f) + ((int) this.K.getTopActionBarOffsetY());
    }

    @Override
    public int getCurrentItemTop() {
        fw0 fw0Var = this.K;
        return (int) (fw0Var.getOffsetY() + fw0Var.getSwipeOffsetY());
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
        return gl.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (int) this.K.getOffsetY();
    }

    public String getStartCommand() {
        return this.H;
    }

    public hv0 getWebViewContainer() {
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
        P();
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
    public final void q() {
        kk7.f(this.G).n(this, kk7.y1);
        kk7.e().n(this, kk7.p4);
        r6 t = this.b.U2.t();
        r7 r7Var = this.L;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r7Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        t.removeView(r7Var);
        this.n.f();
        this.U = true;
        gl.r(this.V);
    }

    @Override
    public final void requestLayout() {
        if (this.s) {
            return;
        }
        super.requestLayout();
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

    public void setDelegate(ku0 ku0Var) {
        this.n.setDelegate(ku0Var);
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
    public final boolean t() {
        P();
        return false;
    }

    @Override
    public final void u() {
        x02 x02Var = this.b;
        x02Var.v0(false);
        x02Var.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void v() {
        this.L.setVisibility(8);
        this.Q = false;
        gw0 gw0Var = this.n;
        boolean z = gw0Var.S;
        x02 x02Var = this.b;
        if (!z) {
            gl.L3(x02Var.U2.getBackButton(), 2131231243);
        }
        x02Var.U2.setBackground(null);
        if (gw0Var.U) {
            gw0Var.f();
            this.I = true;
        }
    }

    @Override
    public final void x(int i) {
        m12 m12Var = this.J;
        gw0 gw0Var = this.n;
        if (i == -1) {
            if (!gw0Var.A()) {
                P();
                return;
            }
            return;
        }
        x02 x02Var = this.b;
        if (i == 2131296502) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.w);
            x02Var.Z1.presentFragment(new mu1(bundle));
            x02Var.dismiss();
            return;
        }
        int i2 = 0;
        if (i == 2131296506) {
            if (gw0Var.getWebView() != null) {
                gw0Var.getWebView().animate().cancel();
                gw0Var.getWebView().animate().alpha(0.0f).start();
            }
            m12Var.setLoadProgress(0.0f);
            m12Var.setAlpha(1.0f);
            m12Var.setVisibility(0);
            gw0Var.setBotUser(na7.q1(this.G).V1(Long.valueOf(this.w)));
            gw0Var.p(this.G, this.w);
            kk7.f(gw0Var.N).d(new st0(gw0Var, (byte) 1));
        } else if (i == 2131296497) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = hq6.d0(this.G).b.bots;
            int size = arrayList.size();
            while (i2 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i2);
                i2++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.w) {
                    x02Var.f1(tL_attachMenuBot2, na7.q1(this.G).V1(Long.valueOf(this.w)));
                    return;
                }
            }
        } else if (i == 2131296508) {
            gw0Var.getClass();
            gw0Var.Q = System.currentTimeMillis();
            gw0Var.v("settings_button_pressed", null);
        } else if (i == 2131296492) {
            hq6.d0(this.G).z0(this.w, hq6.f2 ? 1 : 0, null);
        } else if (i == 2131296512) {
            d01.t(getContext(), k96.M0(2131752881, null));
        } else if (i == 2131296507) {
            int i3 = this.G;
            Context context = getContext();
            u21 u21Var = new u21(f11.a(getContext()), this.a);
            long j = this.w;
            int i4 = b89.v1;
            b89.D0(i3, context, j, false, false, new ArrayList(), u21Var, null, new byte[0], null, null);
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
