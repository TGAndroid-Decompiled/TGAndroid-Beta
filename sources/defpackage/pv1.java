package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pv1 extends n7 {
    public float a;
    public final yv1 b;

    public pv1(yv1 yv1Var) {
        this.b = yv1Var;
    }

    @Override
    public final boolean a() {
        if (this.b.J3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        yv1 yv1Var;
        yv1 yv1Var2 = this.b;
        if (!yv1Var2.td.f) {
            if (yv1Var2.J3 != null && yv1Var2.E1 != null) {
                View currentView = yv1Var2.F1.getCurrentView();
                if (currentView instanceof gw1) {
                    yv1Var = ((gw1) currentView).a;
                } else {
                    yv1Var = yv1Var2;
                }
                if (!yv1Var.rd.f) {
                    yv1Var.nc(true);
                    return false;
                }
                int currentPosition = yv1Var2.E1.a.getCurrentPosition();
                byte b = yv1Var2.G1;
                if (currentPosition != b) {
                    yv1Var2.E1.a.e(b, b);
                    return false;
                }
            } else if (yv1Var2.rd.f) {
                yv1Var2.nc(false);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean d() {
        return this.b.C3;
    }

    @Override
    public final void f() {
        int i;
        yv1 yv1Var = this.b;
        yv1Var.c6();
        if (yv1Var.D3 == null && yv1Var.E3 == null) {
            if (yv1Var.C3) {
                yv1Var.X1.getAdapter().U(null, 0, null, false, true);
                yv1Var.C3 = false;
                yv1Var.k0.P("", true);
            }
            r7 r7Var = yv1Var.k0;
            if (yv1Var.i8()) {
                i = 2131745602;
            } else {
                i = 2131745570;
            }
            r7Var.setSearchFieldHint(jb6.M0(i, null));
            yv1Var.h3.setVisibility(0);
            ImageView imageView = yv1Var.i3;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            yv1Var.D3 = null;
            yv1Var.E3 = null;
            return;
        }
        ImageView imageView2 = yv1Var.i3;
        if (imageView2 != null) {
            imageView2.callOnClick();
        }
    }

    @Override
    public final void h() {
        int i;
        int i2;
        int i3;
        k47 k47Var;
        TLRPC.Chat chat;
        yv1 yv1Var = this.b;
        yv1Var.H3 = false;
        yv1Var.dd();
        yv1Var.qd();
        ImageView imageView = yv1Var.h3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = yv1Var.i3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (yv1Var.C3) {
            yv1Var.X1.getAdapter().U(null, 0, null, false, true);
            yv1Var.C3 = false;
        }
        yv1Var.X1.setReversed(false);
        yv1Var.X1.getAdapter().l0 = false;
        yv1Var.z5();
        yv1Var.D3 = null;
        yv1Var.E3 = null;
        yv1Var.J3 = null;
        r7 r7Var = yv1Var.k0;
        if (yv1Var.i8()) {
            i = 2131745602;
        } else {
            i = 2131745570;
        }
        r7Var.setSearchFieldHint(jb6.M0(i, null));
        yv1Var.k0.setSearchFieldCaption(null);
        yv1Var.sd.a(false, true);
        yv1Var.td.a(false, true);
        if (yv1Var.a0.H0() && TextUtils.isEmpty(yv1Var.a0.getSlowModeTimer()) && (((chat = yv1Var.e) == null || sd2.q(chat)) && !yv1Var.g8())) {
            r7 r7Var2 = yv1Var.j0;
            if (r7Var2 != null) {
                r7Var2.setVisibility(8);
            }
            q6 q6Var = yv1Var.g0;
            if (q6Var != null) {
                q6Var.e(0);
            }
            qr2 qr2Var = yv1Var.f0;
            if (qr2Var != null) {
                qr2Var.b(true);
            }
            r7 r7Var3 = yv1Var.p0;
            if (r7Var3 != null && yv1Var.ha) {
                r7Var3.setVisibility(8);
            }
            q6 q6Var2 = yv1Var.q0;
            if (q6Var2 != null && yv1Var.ia) {
                q6Var2.e(8);
            }
            r7 r7Var4 = yv1Var.l0;
            if (r7Var4 != null) {
                r7Var4.setVisibility(8);
            }
            r7 r7Var5 = yv1Var.m0;
            if (r7Var5 != null) {
                r7Var5.setVisibility(8);
            }
        } else {
            r7 r7Var6 = yv1Var.j0;
            if (r7Var6 != null) {
                r7Var6.setVisibility(0);
            }
            q6 q6Var3 = yv1Var.q0;
            if (q6Var3 != null && yv1Var.ia) {
                q6Var3.e(0);
            }
            r7 r7Var7 = yv1Var.l0;
            if (r7Var7 != null) {
                r7Var7.setVisibility(0);
            }
            r7 r7Var8 = yv1Var.p0;
            if (r7Var8 != null && yv1Var.ha) {
                r7Var8.setVisibility(0);
            }
            q6 q6Var4 = yv1Var.g0;
            if (q6Var4 != null) {
                q6Var4.e(8);
            }
            qr2 qr2Var2 = yv1Var.f0;
            if (qr2Var2 != null) {
                qr2Var2.b(false);
            }
        }
        if (yv1Var.F1 != null) {
            if (yv1Var.E1.a.getCurrentPosition() != 0) {
                yv1Var.E1.a.e(0, 0);
                yv1Var.H1 = true;
            } else {
                yv1Var.F1.h.clear();
            }
        }
        int i4 = yv1Var.g4;
        if (i4 == 3 || i4 == 8 || ((yv1Var.s4 == 0 && !m9c.B(yv1Var.f)) || ((k47Var = yv1Var.m4) != null && k47Var.M1() < 10))) {
            yv1Var.k0.setVisibility(8);
        }
        yv1Var.r0 = false;
        yv1Var.Dd();
        hs6 mediaDataController = yv1Var.getMediaDataController();
        mediaDataController.Z0.clear();
        mediaDataController.a1.clear();
        mediaDataController.b1.clear();
        if (yv1Var.d4 == 3) {
            i3 = ((d) yv1Var).currentAccount;
            af5.a(i3).b(3).a();
        } else {
            i2 = ((d) yv1Var).currentAccount;
            af5 a = af5.a(i2);
            a.b.a();
            a.c.a();
        }
        sc7 sc7Var = yv1Var.b4;
        if (sc7Var != null) {
            sc7Var.f();
        }
        yv1Var.cb();
        yv1Var.Pc(false);
        yv1Var.gd(0, true);
        yv1Var.Gd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 0.0f);
        ofFloat.addUpdateListener(new ov1(this, (byte) 2));
        ofFloat.setInterpolator(d53.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        yv1Var.rd.a(false, true);
        yv1Var.pd();
        yv1Var.F3 = null;
        yv1Var.qd();
        yv1Var.dd();
        ys1 ys1Var = yv1Var.D1;
        if (ys1Var != null) {
            ys1Var.d.M(new o52((byte) 2));
            ys1Var.h = 0L;
            yv1Var.D1.g(false);
        }
        js1 js1Var = yv1Var.E1;
        if (js1Var != null) {
            js1Var.b(false);
        }
        yv1Var.Ib(false);
    }

    @Override
    public final void i() {
        js1 js1Var;
        int i;
        yv1 yv1Var = this.b;
        boolean z = true;
        yv1Var.H3 = true;
        yv1Var.dd();
        yv1Var.qd();
        if (((yv1Var.s4 != 0 && yv1Var.g4 != 3) || m9c.B(yv1Var.f)) && !yv1Var.Vc) {
            yv1Var.Ba(null);
        }
        if (yv1Var.k5) {
            yv1Var.saveKeyboardPositionBeforeTransition();
            if (!yv1Var.mb) {
                Activity parentActivity = yv1Var.getParentActivity();
                i = ((d) yv1Var).classGuid;
                gm.V2(parentActivity, i);
            }
            gm.d3(new fo1(this, (byte) 10), 500L);
            hg5 hg5Var = yv1Var.v2;
            if (hg5Var != null) {
                hg5Var.f(true);
            }
            hg5 hg5Var2 = yv1Var.x2;
            if (hg5Var2 != null) {
                hg5Var2.f(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
        ofFloat.addUpdateListener(new ov1(this, (byte) 1));
        ofFloat.setInterpolator(d53.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        ys1 ys1Var = yv1Var.D1;
        if (ys1Var != null) {
            if (yv1Var.mb || !ys1Var.a() || yv1Var.J3 != null) {
                z = false;
            }
            ys1Var.g(z);
        }
        if (yv1Var.J3 != null && (js1Var = yv1Var.E1) != null) {
            int currentPosition = js1Var.a.getCurrentPosition();
            byte b = yv1Var.G1;
            if (currentPosition != b) {
                yv1Var.E1.a.e(b, b);
            }
        }
    }

    @Override
    public final void j(sh4 sh4Var) {
        yv1 yv1Var = this.b;
        ys1 ys1Var = yv1Var.D1;
        if (ys1Var != null) {
            ys1Var.d.M(new o52((byte) 2));
            ys1Var.h = 0L;
        }
        yv1Var.F3 = null;
        yv1Var.qd();
        yv1Var.dd();
        yv1Var.Ib(false);
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        ylb ylbVar;
        yv1 yv1Var = this.b;
        boolean z = false;
        yv1Var.nd(0, 0, -1);
        if (editTextBoldCursor != null) {
            str = editTextBoldCursor.getText().toString();
        } else {
            str = yv1Var.I3;
        }
        yv1Var.I3 = str;
        if (!TextUtils.isEmpty(str) && (yv1Var.I3.startsWith("$") || yv1Var.I3.startsWith("#"))) {
            yv1Var.d6();
            if (yv1Var.I3.contains("@")) {
                String str2 = yv1Var.I3;
                ylbVar = ((d) yv1Var).resourceProvider;
                yv1Var.presentFragment(new re5(str2, ylbVar));
                return;
            }
            if (yv1Var.J3 == null) {
                yv1Var.J3 = yv1Var.I3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
                ofFloat.addUpdateListener(new ov1(this, (byte) 0));
                ofFloat.setInterpolator(d53.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                ys1 ys1Var = yv1Var.D1;
                if (ys1Var != null) {
                    if (!yv1Var.mb && ys1Var.a() && yv1Var.J3 == null) {
                        z = true;
                    }
                    ys1Var.g(z);
                }
            }
            yv1Var.J3 = yv1Var.I3;
            yv1Var.e5(true);
            i2 = ((d) yv1Var).currentAccount;
            af5.a(i2).c(yv1Var.J3);
            yv1Var.I1.f.O(true);
            View currentView = yv1Var.F1.getCurrentView();
            if (yv1Var.d4 == 3) {
                i4 = ((d) yv1Var).currentAccount;
                af5.a(i4).b(3).a();
            } else {
                i3 = ((d) yv1Var).currentAccount;
                af5 a = af5.a(i3);
                a.b.a();
                a.c.a();
            }
            if (currentView instanceof gw1) {
                ((gw1) currentView).a.rd(yv1Var.J3);
            }
            yv1Var.pd();
            yv1Var.s2.e(true, true);
            yv1Var.nc(true);
            z = true;
        } else {
            yv1Var.J3 = null;
            js1 js1Var = yv1Var.E1;
            if (js1Var != null) {
                js1Var.b(false);
                yv1Var.pd();
            }
            js1 js1Var2 = yv1Var.E1;
            if (js1Var2 != null && js1Var2.a.getCurrentPosition() != 0) {
                yv1Var.E1.a.e(0, 0);
            }
        }
        js1 js1Var3 = yv1Var.E1;
        if (js1Var3 != null) {
            js1Var3.b(z);
        }
        hs6 mediaDataController = yv1Var.getMediaDataController();
        String str3 = yv1Var.I3;
        long j = yv1Var.l6;
        long j2 = yv1Var.d7;
        i = ((d) yv1Var).classGuid;
        mediaDataController.Z1(str3, j, j2, i, 0, yv1Var.s4, false, yv1Var.D3, yv1Var.E3, true, yv1Var.F3);
    }

    @Override
    public final void l(EditTextBoldCursor editTextBoldCursor) {
        boolean z;
        yv1 yv1Var = this.b;
        fn0 fn0Var = yv1Var.td;
        if (yv1Var.J3 == null) {
            yv1Var.nc(false);
        }
        yv1Var.c6();
        if (yv1Var.C3) {
            yv1Var.X1.getAdapter().U("@" + editTextBoldCursor.getText().toString(), 0, yv1Var.M6, true, true);
        } else if (yv1Var.D3 == null && yv1Var.E3 == null && yv1Var.i3 != null && TextUtils.equals(editTextBoldCursor.getText(), jb6.M0(2131745500, null))) {
            yv1Var.i3.callOnClick();
        }
        if (yv1Var.J3 != null) {
            if (editTextBoldCursor.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z != fn0Var.f) {
                if (z) {
                    yv1Var.d6();
                }
                fn0Var.a(z, true);
                hs1 hs1Var = yv1Var.F1;
                if (hs1Var != null) {
                    hs1Var.E(0);
                }
                if (z) {
                    yv1Var.nc(true);
                }
                yv1Var.Pc(false);
            }
        }
    }

    @Override
    public final boolean m() {
        if (this.b.J3 == null) {
            return true;
        }
        return false;
    }
}
