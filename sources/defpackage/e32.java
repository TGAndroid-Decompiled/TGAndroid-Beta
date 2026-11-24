package defpackage;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class e32 extends a22 implements jm7 {
    public int E;
    public long F;
    public int G;
    public String H;
    public boolean I;
    public x22 J;
    public nx0 K;
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
    public t22 V;
    public boolean W;
    public int a0;
    public ox0 n;
    public ValueAnimator r;
    public boolean s;
    public long w;
    public long x;
    public long y;

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e32.B(int, int):void");
    }

    @Override
    public final void H(a22 a22Var) {
        ox0 ox0Var = this.n;
        CharSequence r = m9c.r(oc7.r1(this.G).W1(Long.valueOf(this.w)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(gm.L(20.0f));
            r = gw3.m(r, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        i22 i22Var = this.b;
        i22Var.U2.setTitle(r);
        this.K.setSwipeOffsetY(0.0f);
        if (ox0Var.getWebView() != null) {
            ox0Var.getWebView().scrollTo(0, 0);
        }
        d dVar = i22Var.Z1;
        if (dVar != null) {
            ox0Var.setParentActivity(dVar.getParentActivity());
        }
        this.L.setVisibility(0);
        if (!ox0Var.S) {
            gm.L3(i22Var.U2.getBackButton(), 2131231273);
        }
    }

    @Override
    public final void I() {
        if (this.n.O) {
            P();
        }
        this.K.setSwipeOffsetAnimationDisallowed(false);
        gm.c3(new t22(this, (byte) 0));
    }

    @Override
    public final void J() {
        nx0 nx0Var = this.K;
        nx0Var.d(nx0Var.getTopActionBarOffsetY() + (-nx0Var.getOffsetY()));
    }

    @Override
    public final boolean M() {
        return false;
    }

    public final boolean O() {
        String str;
        if (this.T) {
            TLRPC.User W1 = oc7.r1(this.G).W1(Long.valueOf(this.w));
            if (W1 != null) {
                str = bw2.m(0, W1.first_name, W1.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            he heVar = alertDialog$Builder.a;
            heVar.S = str;
            heVar.U = jb6.M0(2131752870, null);
            alertDialog$Builder.j(jb6.M0(2131752869, null), new v22(this));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            heVar.show();
            anb.X((TextView) heVar.c(-1), cmb.p7, this.a);
            return false;
        }
        this.b.dismiss();
        return true;
    }

    public final void P() {
        i22 i22Var = this.b;
        d dVar = i22Var.Z1;
        if ((dVar instanceof yv1) && ((yv1) dVar).m1.Q() > gm.L(20.0f)) {
            gm.t1(i22Var.Z1.getFragmentView());
            gm.d3(new t22(this, (byte) 1), 250L);
            return;
        }
        i22Var.getWindow().setSoftInputMode(20);
        setFocusable(true);
        i22Var.v0(true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ox0 ox0Var = this.n;
        if (i == nm7.z1) {
            if (this.y == ((Long) objArr[0]).longValue()) {
                ox0Var.f();
                this.I = true;
                this.b.dismiss();
            }
        } else if (i == nm7.r4) {
            ox0Var.n.b(cmb.v0(cmb.g5, this.a), 153);
        }
    }

    @Override
    public final boolean g() {
        return this.W;
    }

    @Override
    public int getButtonsHideOffset() {
        return gm.L(12.0f) + ((int) this.K.getTopActionBarOffsetY());
    }

    @Override
    public int getCurrentItemTop() {
        nx0 nx0Var = this.K;
        return (int) (nx0Var.getOffsetY() + nx0Var.getSwipeOffsetY());
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
        return gm.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (int) this.K.getOffsetY();
    }

    public String getStartCommand() {
        return this.H;
    }

    public qw0 getWebViewContainer() {
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
        nm7.f(this.G).n(this, nm7.z1);
        nm7.e().n(this, nm7.r4);
        r6 t = this.b.U2.t();
        r7 r7Var = this.L;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r7Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        t.removeView(r7Var);
        this.n.f();
        this.U = true;
        gm.r(this.V);
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

    public void setDelegate(uv0 uv0Var) {
        this.n.setDelegate(uv0Var);
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
    public final void t() {
        i22 i22Var = this.b;
        i22Var.v0(false);
        i22Var.getWindow().setSoftInputMode(48);
    }

    @Override
    public final void u() {
        this.L.setVisibility(8);
        this.Q = false;
        ox0 ox0Var = this.n;
        boolean z = ox0Var.S;
        i22 i22Var = this.b;
        if (!z) {
            gm.L3(i22Var.U2.getBackButton(), 2131231244);
        }
        i22Var.U2.setBackground(null);
        if (ox0Var.U) {
            ox0Var.f();
            this.I = true;
        }
    }

    @Override
    public final void w(int i) {
        x22 x22Var = this.J;
        ox0 ox0Var = this.n;
        if (i == -1) {
            if (!ox0Var.A()) {
                O();
                return;
            }
            return;
        }
        i22 i22Var = this.b;
        if (i == 2131296502) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.w);
            i22Var.Z1.presentFragment(new yv1(bundle));
            i22Var.dismiss();
            return;
        }
        int i2 = 0;
        if (i == 2131296506) {
            if (ox0Var.getWebView() != null) {
                ox0Var.getWebView().animate().cancel();
                ox0Var.getWebView().animate().alpha(0.0f).start();
            }
            x22Var.setLoadProgress(0.0f);
            x22Var.setAlpha(1.0f);
            x22Var.setVisibility(0);
            ox0Var.setBotUser(oc7.r1(this.G).W1(Long.valueOf(this.w)));
            ox0Var.p(this.G, this.w);
            nm7.f(ox0Var.N).d(new bv0(ox0Var, (byte) 1));
        } else if (i == 2131296497) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = hs6.d0(this.G).b.bots;
            int size = arrayList.size();
            while (i2 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i2);
                i2++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.w) {
                    i22Var.f1(tL_attachMenuBot2, oc7.r1(this.G).W1(Long.valueOf(this.w)));
                    return;
                }
            }
        } else if (i == 2131296508) {
            ox0Var.getClass();
            ox0Var.Q = System.currentTimeMillis();
            ox0Var.v("settings_button_pressed", null);
        } else if (i == 2131296492) {
            hs6.d0(this.G).z0(this.w, hs6.f2 ? 1 : 0, null);
        } else if (i == 2131296512) {
            l11.u(getContext(), jb6.M0(2131752846, null));
        } else if (i == 2131296507) {
            da9.E0(this.G, getContext(), new c41(n21.a(getContext()), this.a), this.w);
        }
    }

    @Override
    public final void y() {
        this.P = false;
        this.K.setSwipeOffsetAnimationDisallowed(false);
        this.n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override
    public final void z(int i, boolean z) {
        boolean z2;
        ox0 ox0Var = this.n;
        nx0 nx0Var = this.K;
        if (z) {
            ox0Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = nx0Var.getTopActionBarOffsetY() + (-nx0Var.getOffsetY());
            if (nx0Var.getSwipeOffsetY() != topActionBarOffsetY) {
                nx0Var.d(topActionBarOffsetY);
                z2 = true;
            } else {
                z2 = false;
            }
            int Q = this.b.o3.Q() + i;
            setMeasuredDimension(getMeasuredWidth(), i);
            this.P = true;
            nx0Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z2) {
                ValueAnimator valueAnimator = this.r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.r = null;
                }
                if (ox0Var.getWebView() != null) {
                    int scrollY = ox0Var.getWebView().getScrollY();
                    int i2 = (Q - i) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i2).setDuration(250L);
                    this.r = duration;
                    duration.setInterpolator(wb2.V);
                    this.r.addUpdateListener(new u22(this, (byte) 0));
                    this.r.addListener(new co(this, i2, (byte) 4));
                    this.r.start();
                }
            }
        }
    }
}
