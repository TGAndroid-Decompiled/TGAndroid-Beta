package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class du1 extends n7 {
    public float a;
    public final mu1 b;

    public du1(mu1 mu1Var) {
        this.b = mu1Var;
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
        mu1 mu1Var;
        mu1 mu1Var2 = this.b;
        if (!mu1Var2.jd.f) {
            if (mu1Var2.J3 != null && mu1Var2.E1 != null) {
                View currentView = mu1Var2.F1.getCurrentView();
                if (currentView instanceof uu1) {
                    mu1Var = ((uu1) currentView).a;
                } else {
                    mu1Var = mu1Var2;
                }
                if (!mu1Var.hd.f) {
                    mu1Var.bc(true);
                    return false;
                }
                int currentPosition = mu1Var2.E1.a.getCurrentPosition();
                byte b = mu1Var2.G1;
                if (currentPosition != b) {
                    mu1Var2.E1.a.e(b, b);
                    return false;
                }
            } else if (mu1Var2.hd.f) {
                mu1Var2.bc(false);
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
        mu1 mu1Var = this.b;
        mu1Var.V5();
        if (mu1Var.D3 == null && mu1Var.E3 == null) {
            if (mu1Var.C3) {
                mu1Var.X1.getAdapter().U(null, 0, null, false, true);
                mu1Var.C3 = false;
                mu1Var.k0.P("", true);
            }
            r7 r7Var = mu1Var.k0;
            if (mu1Var.Z7()) {
                i = 2131745676;
            } else {
                i = 2131745644;
            }
            r7Var.setSearchFieldHint(k96.M0(i, null));
            mu1Var.h3.setVisibility(0);
            ImageView imageView = mu1Var.i3;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            mu1Var.D3 = null;
            mu1Var.E3 = null;
            return;
        }
        ImageView imageView2 = mu1Var.i3;
        if (imageView2 != null) {
            imageView2.callOnClick();
        }
    }

    @Override
    public final void h() {
        int i;
        int i2;
        int i3;
        k27 k27Var;
        TLRPC.Chat chat;
        mu1 mu1Var = this.b;
        mu1Var.H3 = false;
        mu1Var.Rc();
        mu1Var.ed();
        ImageView imageView = mu1Var.h3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = mu1Var.i3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (mu1Var.C3) {
            mu1Var.X1.getAdapter().U(null, 0, null, false, true);
            mu1Var.C3 = false;
        }
        mu1Var.X1.setReversed(false);
        mu1Var.X1.getAdapter().l0 = false;
        mu1Var.s5();
        mu1Var.D3 = null;
        mu1Var.E3 = null;
        mu1Var.J3 = null;
        r7 r7Var = mu1Var.k0;
        if (mu1Var.Z7()) {
            i = 2131745676;
        } else {
            i = 2131745644;
        }
        r7Var.setSearchFieldHint(k96.M0(i, null));
        mu1Var.k0.setSearchFieldCaption(null);
        mu1Var.id.a(false, true);
        mu1Var.jd.a(false, true);
        if (mu1Var.a0.H0() && TextUtils.isEmpty(mu1Var.a0.getSlowModeTimer()) && (((chat = mu1Var.e) == null || hc2.q(chat)) && !mu1Var.X7())) {
            r7 r7Var2 = mu1Var.j0;
            if (r7Var2 != null) {
                r7Var2.setVisibility(8);
            }
            q6 q6Var = mu1Var.g0;
            if (q6Var != null) {
                q6Var.e(0);
            }
            fq2 fq2Var = mu1Var.f0;
            if (fq2Var != null) {
                fq2Var.b(true);
            }
            r7 r7Var3 = mu1Var.p0;
            if (r7Var3 != null && mu1Var.ha) {
                r7Var3.setVisibility(8);
            }
            q6 q6Var2 = mu1Var.q0;
            if (q6Var2 != null && mu1Var.ia) {
                q6Var2.e(8);
            }
            r7 r7Var4 = mu1Var.l0;
            if (r7Var4 != null) {
                r7Var4.setVisibility(8);
            }
            r7 r7Var5 = mu1Var.m0;
            if (r7Var5 != null) {
                r7Var5.setVisibility(8);
            }
        } else {
            r7 r7Var6 = mu1Var.j0;
            if (r7Var6 != null) {
                r7Var6.setVisibility(0);
            }
            q6 q6Var3 = mu1Var.q0;
            if (q6Var3 != null && mu1Var.ia) {
                q6Var3.e(0);
            }
            r7 r7Var7 = mu1Var.l0;
            if (r7Var7 != null) {
                r7Var7.setVisibility(0);
            }
            r7 r7Var8 = mu1Var.p0;
            if (r7Var8 != null && mu1Var.ha) {
                r7Var8.setVisibility(0);
            }
            q6 q6Var4 = mu1Var.g0;
            if (q6Var4 != null) {
                q6Var4.e(8);
            }
            fq2 fq2Var2 = mu1Var.f0;
            if (fq2Var2 != null) {
                fq2Var2.b(false);
            }
        }
        if (mu1Var.F1 != null) {
            if (mu1Var.E1.a.getCurrentPosition() != 0) {
                mu1Var.E1.a.e(0, 0);
                mu1Var.H1 = true;
            } else {
                mu1Var.F1.h.clear();
            }
        }
        int i4 = mu1Var.g4;
        if (i4 == 3 || i4 == 8 || ((mu1Var.s4 == 0 && !l7c.B(mu1Var.f)) || ((k27Var = mu1Var.m4) != null && k27Var.M1() < 10))) {
            mu1Var.k0.setVisibility(8);
        }
        mu1Var.r0 = false;
        mu1Var.rd();
        hq6 mediaDataController = mu1Var.getMediaDataController();
        mediaDataController.Z0.clear();
        mediaDataController.a1.clear();
        mediaDataController.b1.clear();
        if (mu1Var.d4 == 3) {
            i3 = ((d) mu1Var).currentAccount;
            cd5.a(i3).b(3).a();
        } else {
            i2 = ((d) mu1Var).currentAccount;
            cd5 a = cd5.a(i2);
            a.b.a();
            a.c.a();
        }
        ra7 ra7Var = mu1Var.b4;
        if (ra7Var != null) {
            ra7Var.f();
        }
        mu1Var.Sa();
        mu1Var.Dc(false);
        mu1Var.Uc(0, true);
        mu1Var.ud(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 0.0f);
        ofFloat.addUpdateListener(new cu1(this, (byte) 2));
        ofFloat.setInterpolator(s33.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        mu1Var.hd.a(false, true);
        mu1Var.dd();
        mu1Var.F3 = null;
        mu1Var.ed();
        mu1Var.Rc();
        lr1 lr1Var = mu1Var.D1;
        if (lr1Var != null) {
            lr1Var.d.M(new d42((byte) 2));
            lr1Var.h = 0L;
            mu1Var.D1.g(false);
        }
        xq1 xq1Var = mu1Var.E1;
        if (xq1Var != null) {
            xq1Var.b(false);
        }
        mu1Var.yb(false);
    }

    @Override
    public final void i() {
        xq1 xq1Var;
        int i;
        mu1 mu1Var = this.b;
        boolean z = true;
        mu1Var.H3 = true;
        mu1Var.Rc();
        mu1Var.ed();
        if (((mu1Var.s4 != 0 && mu1Var.g4 != 3) || l7c.B(mu1Var.f)) && !mu1Var.Lc) {
            mu1Var.ra(null);
        }
        if (mu1Var.k5) {
            mu1Var.saveKeyboardPositionBeforeTransition();
            if (!mu1Var.mb) {
                Activity parentActivity = mu1Var.getParentActivity();
                i = ((d) mu1Var).classGuid;
                gl.V2(parentActivity, i);
            }
            gl.d3(new hq1(this, (byte) 6), 500L);
            je5 je5Var = mu1Var.v2;
            if (je5Var != null) {
                je5Var.f(true);
            }
            je5 je5Var2 = mu1Var.x2;
            if (je5Var2 != null) {
                je5Var2.f(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
        ofFloat.addUpdateListener(new cu1(this, (byte) 1));
        ofFloat.setInterpolator(s33.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        lr1 lr1Var = mu1Var.D1;
        if (lr1Var != null) {
            if (mu1Var.mb || !lr1Var.a() || mu1Var.J3 != null) {
                z = false;
            }
            lr1Var.g(z);
        }
        if (mu1Var.J3 != null && (xq1Var = mu1Var.E1) != null) {
            int currentPosition = xq1Var.a.getCurrentPosition();
            byte b = mu1Var.G1;
            if (currentPosition != b) {
                mu1Var.E1.a.e(b, b);
            }
        }
    }

    @Override
    public final void j(rf4 rf4Var) {
        mu1 mu1Var = this.b;
        lr1 lr1Var = mu1Var.D1;
        if (lr1Var != null) {
            lr1Var.d.M(new d42((byte) 2));
            lr1Var.h = 0L;
        }
        mu1Var.F3 = null;
        mu1Var.ed();
        mu1Var.Rc();
        mu1Var.yb(false);
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        wjb wjbVar;
        mu1 mu1Var = this.b;
        boolean z = false;
        mu1Var.bd(0, 0, -1);
        if (editTextBoldCursor != null) {
            str = editTextBoldCursor.getText().toString();
        } else {
            str = mu1Var.I3;
        }
        mu1Var.I3 = str;
        if (!TextUtils.isEmpty(str) && (mu1Var.I3.startsWith("$") || mu1Var.I3.startsWith("#"))) {
            mu1Var.W5();
            if (mu1Var.I3.contains("@")) {
                String str2 = mu1Var.I3;
                wjbVar = ((d) mu1Var).resourceProvider;
                mu1Var.presentFragment(new tc5(str2, wjbVar));
                return;
            }
            if (mu1Var.J3 == null) {
                mu1Var.J3 = mu1Var.I3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
                ofFloat.addUpdateListener(new cu1(this, (byte) 0));
                ofFloat.setInterpolator(s33.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                lr1 lr1Var = mu1Var.D1;
                if (lr1Var != null) {
                    if (!mu1Var.mb && lr1Var.a() && mu1Var.J3 == null) {
                        z = true;
                    }
                    lr1Var.g(z);
                }
            }
            mu1Var.J3 = mu1Var.I3;
            mu1Var.X4(true);
            i2 = ((d) mu1Var).currentAccount;
            cd5.a(i2).c(mu1Var.J3);
            mu1Var.I1.f.O(true);
            View currentView = mu1Var.F1.getCurrentView();
            if (mu1Var.d4 == 3) {
                i4 = ((d) mu1Var).currentAccount;
                cd5.a(i4).b(3).a();
            } else {
                i3 = ((d) mu1Var).currentAccount;
                cd5 a = cd5.a(i3);
                a.b.a();
                a.c.a();
            }
            if (currentView instanceof uu1) {
                ((uu1) currentView).a.fd(mu1Var.J3);
            }
            mu1Var.dd();
            mu1Var.s2.e(true, true);
            mu1Var.bc(true);
            z = true;
        } else {
            mu1Var.J3 = null;
            xq1 xq1Var = mu1Var.E1;
            if (xq1Var != null) {
                xq1Var.b(false);
                mu1Var.dd();
            }
            xq1 xq1Var2 = mu1Var.E1;
            if (xq1Var2 != null && xq1Var2.a.getCurrentPosition() != 0) {
                mu1Var.E1.a.e(0, 0);
            }
        }
        xq1 xq1Var3 = mu1Var.E1;
        if (xq1Var3 != null) {
            xq1Var3.b(z);
        }
        hq6 mediaDataController = mu1Var.getMediaDataController();
        String str3 = mu1Var.I3;
        long j = mu1Var.l6;
        long j2 = mu1Var.d7;
        i = ((d) mu1Var).classGuid;
        mediaDataController.Z1(str3, j, j2, i, 0, mu1Var.s4, false, mu1Var.D3, mu1Var.E3, true, mu1Var.F3);
    }

    @Override
    public final void l(EditTextBoldCursor editTextBoldCursor) {
        boolean z;
        mu1 mu1Var = this.b;
        fm0 fm0Var = mu1Var.jd;
        if (mu1Var.J3 == null) {
            mu1Var.bc(false);
        }
        mu1Var.V5();
        if (mu1Var.C3) {
            mu1Var.X1.getAdapter().U("@" + editTextBoldCursor.getText().toString(), 0, mu1Var.M6, true, true);
        } else if (mu1Var.D3 == null && mu1Var.E3 == null && mu1Var.i3 != null && TextUtils.equals(editTextBoldCursor.getText(), k96.M0(2131745574, null))) {
            mu1Var.i3.callOnClick();
        }
        if (mu1Var.J3 != null) {
            if (editTextBoldCursor.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z != fm0Var.f) {
                if (z) {
                    mu1Var.W5();
                }
                fm0Var.a(z, true);
                vq1 vq1Var = mu1Var.F1;
                if (vq1Var != null) {
                    vq1Var.E(0);
                }
                if (z) {
                    mu1Var.bc(true);
                }
                mu1Var.Dc(false);
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
