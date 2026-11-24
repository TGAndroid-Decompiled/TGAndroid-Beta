package defpackage;

import android.text.SpannableStringBuilder;
public final class mt0 implements Runnable {
    public final byte a;
    public final au0 b;

    public mt0(au0 au0Var, byte b) {
        this.a = b;
        this.b = au0Var;
    }

    @Override
    public final void run() {
        boolean z;
        String H;
        byte b = this.a;
        au0 au0Var = this.b;
        switch (b) {
            case 0:
                mt0 mt0Var = au0Var.t0;
                int currentTime = au0Var.getConnectionsManager().getCurrentTime();
                tb tbVar = au0Var.b0;
                if (au0Var.Z <= 0 && au0Var.Q <= currentTime) {
                    z = false;
                } else {
                    z = true;
                }
                tbVar.setEnabled(z);
                int i = au0Var.Q;
                tb tbVar2 = au0Var.b0;
                if (currentTime < i) {
                    tbVar2.i(jb6.M0(2131752921, null), true, true);
                    if (au0Var.s0 == null) {
                        au0Var.s0 = new SpannableStringBuilder("l");
                        pn2 pn2Var = new pn2(2131231981, 0);
                        pn2Var.n = 1;
                        au0Var.s0.setSpan(pn2Var, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) au0Var.s0).append((CharSequence) au0.x0(au0Var.Q - currentTime));
                    au0Var.b0.g(spannableStringBuilder, true);
                    u31 u31Var = au0Var.k0;
                    if (u31Var != null) {
                        y21 y21Var = u31Var.e;
                        if ((y21Var instanceof b31) && y21Var.isAttachedToWindow()) {
                            hg9.q(null, null, 2131752905, new Object[]{au0.x0(au0Var.Q - currentTime)}, ((b31) au0Var.k0.e).b);
                        }
                    }
                    gm.r(mt0Var);
                    gm.d3(mt0Var, 1000L);
                    return;
                }
                tbVar2.g(null, true);
                tb tbVar3 = au0Var.b0;
                if (au0Var.Y) {
                    H = jb6.M0(2131752922, null);
                } else {
                    H = jb6.H(' ', "BotStarsButtonWithdrawShort", (int) au0Var.Z);
                }
                tbVar3.i(nxa.Z0(false, H, au0Var.d0), true, true);
                return;
            case 1:
                au0Var.u0();
                return;
            case 2:
                l11.u(au0Var.getParentActivity(), jb6.M0(2131752909, null));
                return;
            case 3:
                au0Var.s0();
                return;
            case 4:
                l11.u(au0Var.getParentActivity(), jb6.M0(2131752985, null));
                return;
            case 5:
                l11.u(au0Var.getParentActivity(), jb6.M0(2131753005, null));
                return;
            default:
                au0Var.c0.setLoading(false);
                return;
        }
    }
}
