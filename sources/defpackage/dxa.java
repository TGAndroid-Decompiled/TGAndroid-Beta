package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class dxa extends mz0 implements jm7 {
    public final long S1;
    public final ds0 T1;
    public final FrameLayout U1;
    public final uj4 V1;
    public Runnable W1;
    public final TLRPC.InputPeer X1;
    public final boolean Y1;
    public l7c Z1;
    public boolean a2;

    public dxa(Context context, ylb ylbVar, long j, int i, String str, Runnable runnable, long j2) {
        super(context, null, false, false, ylbVar);
        TLRPC.InputPeer i1;
        boolean z;
        String str2;
        String str3;
        this.u1 = 0.2f;
        this.W1 = runnable;
        if (j2 == 0) {
            i1 = null;
        } else {
            i1 = oc7.r1(this.a).i1(j2);
        }
        this.X1 = i1;
        jva v = jva.v(this.a, false);
        if (i1 != null && oc7.r1(v.a).l4.l0.f) {
            z = cj0.h().j();
        } else {
            z = true;
        }
        this.Y1 = z;
        J();
        r59 r59Var = this.n1;
        int i2 = this.u0;
        r59Var.setPadding(i2, 0, i2, 0);
        this.n1.setOnItemClickListener(new s19(this, (byte) 14));
        this.n1.r1();
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        this.n1.setItemAnimator(sc3Var);
        t0(cmb.h5);
        this.S1 = j;
        ds0 ds0Var = new ds0(this.a, ylbVar, context);
        TextView textView = (TextView) ds0Var.e;
        this.T1 = ds0Var;
        ((TextView) ds0Var.b).setText(jb6.G((int) Math.max(0L, j - jva.v(this.a, false).m().amount), "StarsNeededTitle", new Object[0]));
        if (i == 1) {
            str2 = "StarsNeededTextBuySubscription";
        } else {
            if (i != 2) {
                if (i == 7) {
                    str2 = "StarsNeededTextKeepBotSubscription";
                } else if (i == 8) {
                    str2 = "StarsNeededTextKeepBizSubscription";
                } else if (i != 3) {
                    if (i == 4) {
                        str2 = "StarsNeededTextLink";
                        if (str == null) {
                            str3 = "StarsNeededTextLink";
                        } else {
                            str3 = "StarsNeededTextLink_" + str.toLowerCase();
                        }
                        String N0 = jb6.N0(str3);
                        if ((N0.startsWith("LOC_ERR") ? null : N0) != null) {
                            str2 = str3;
                        }
                    } else if (i == 5) {
                        str2 = "StarsNeededTextReactions";
                    } else if (i == 6) {
                        str2 = "StarsNeededTextGift";
                    } else if (i == 12) {
                        str2 = "StarsNeededTextGiftChannel";
                    } else if (i == 13) {
                        str2 = "StarsNeededTextPrivateMessage";
                    } else if (i == 10) {
                        str2 = "StarsNeededTextGiftUpgrade";
                    } else if (i == 11) {
                        str2 = "StarsNeededTextGiftTransfer";
                    } else if (i == 9) {
                        str2 = "StarsNeededBizText";
                    } else if (i == 14) {
                        str2 = "StarsNeededTextGiftBuyResale";
                    } else if (i == 15) {
                        str2 = "StarsNeededTextSearch";
                    } else if (i == 16) {
                        str2 = "StarsNeededRemoveGiftDescription";
                    } else if (i == 17) {
                        str2 = "StarsNeededLiveComments";
                    } else {
                        str2 = "StarsNeededText";
                    }
                }
            }
            str2 = "StarsNeededTextKeepSubscription";
        }
        if (TextUtils.isEmpty(str2)) {
            textView.setText("");
        } else {
            String a0 = jb6.a0(str2, null, 0, str);
            a0 = a0.startsWith("LOC_ERR") ? null : a0;
            textView.setText(gm.S2(a0 == null ? jb6.N0(str2) : a0));
            textView.setMaxWidth(hg5.a(textView.getText(), textView.getPaint()));
        }
        this.o1.setTitle(J0());
        FrameLayout frameLayout = new FrameLayout(context);
        this.U1 = frameLayout;
        l66 l66Var = new l66(context, ylbVar);
        frameLayout.setPadding(0, gm.L(11.0f), 0, gm.L(11.0f));
        l66Var.setTextSize(1, 12.0f);
        anb.X(l66Var, cmb.A6, ylbVar);
        anb.G(l66Var, cmb.Wc, ylbVar);
        if (z) {
            l66Var.setText(gm.N2(jb6.M0(2131744656, null), -1, 0, new nsa(this, (byte) 4), null));
        } else {
            l66Var.setText(gm.S2(jb6.M0(2131744738, null)));
        }
        l66Var.setGravity(17);
        l66Var.setMaxWidth(hg5.a(l66Var.getText(), l66Var.getPaint()));
        frameLayout.addView(l66Var, qoe.e(-2, -1, 17));
        anb.h(cmb.g5, ylbVar, frameLayout);
        uj4 uj4Var = new uj4(getContext());
        this.V1 = uj4Var;
        this.b.addView(uj4Var, qoe.c(-1.0f, -1));
        l7c l7cVar = this.Z1;
        if (l7cVar != null) {
            l7cVar.O(false);
        }
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(this.n1, getContext(), this.a, 0, true, new vh8(this, (byte) 26), this.J0);
        this.Z1 = l7cVar;
        return l7cVar;
    }

    @Override
    public final void H() {
        super.H();
        nm7.f(this.a).n(this, nm7.x3);
        nm7.f(this.a).n(this, nm7.A3);
    }

    @Override
    public final CharSequence J0() {
        ds0 ds0Var = this.T1;
        if (ds0Var == null) {
            return null;
        }
        return ((TextView) ds0Var.b).getText();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Runnable runnable;
        if (i == nm7.x3 || i == nm7.A3) {
            l7c l7cVar = this.Z1;
            if (l7cVar != null) {
                l7cVar.O(true);
            }
            long j = jva.v(this.a, false).m().amount;
            long j2 = this.S1;
            ((TextView) this.T1.b).setText(jb6.H(',', "StarsNeededTitle", (int) (j2 - j)));
            iz0 iz0Var = this.o1;
            if (iz0Var != null) {
                iz0Var.setTitle(J0());
            }
            if (j >= j2 && (runnable = this.W1) != null) {
                runnable.run();
                this.W1 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ds0 ds0Var = this.T1;
        if (ds0Var != null) {
            ((ft4) ds0Var.c).setPaused(true);
        }
    }

    @Override
    public final void show() {
        ms1 ms1Var;
        if (!this.Y1) {
            ts2.u(null, 2131747130, new c41(n21.a(getContext()), this.J0), 2131624221, 36);
        } else if (jva.v(this.a, false).m().amount >= this.S1) {
            Runnable runnable = this.W1;
            if (runnable != null) {
                runnable.run();
                this.W1 = null;
            }
        } else {
            d Q = LaunchActivity.Q();
            if (Q instanceof yv1) {
                yv1 yv1Var = (yv1) Q;
                if (yv1Var.Y7() && (ms1Var = yv1Var.a0) != null) {
                    ms1Var.R();
                }
            }
            super.show();
            nm7.f(this.a).b(this, nm7.x3);
            nm7.f(this.a).b(this, nm7.A3);
        }
    }
}
