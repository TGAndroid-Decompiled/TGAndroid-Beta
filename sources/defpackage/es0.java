package defpackage;

import android.text.SpannableStringBuilder;
public final class es0 implements Runnable {
    public final byte a;
    public final ss0 b;

    public es0(ss0 ss0Var, byte b) {
        this.a = b;
        this.b = ss0Var;
    }

    @Override
    public final void run() {
        boolean z;
        String H;
        byte b = this.a;
        ss0 ss0Var = this.b;
        switch (b) {
            case 0:
                es0 es0Var = ss0Var.t0;
                int currentTime = ss0Var.getConnectionsManager().getCurrentTime();
                tb tbVar = ss0Var.b0;
                if (ss0Var.Z <= 0 && ss0Var.Q <= currentTime) {
                    z = false;
                } else {
                    z = true;
                }
                tbVar.setEnabled(z);
                int i = ss0Var.Q;
                tb tbVar2 = ss0Var.b0;
                if (currentTime < i) {
                    tbVar2.i(k96.M0(2131752956, null), true, true);
                    if (ss0Var.s0 == null) {
                        ss0Var.s0 = new SpannableStringBuilder("l");
                        cm2 cm2Var = new cm2(2131231980, 0);
                        cm2Var.n = 1;
                        ss0Var.s0.setSpan(cm2Var, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) ss0Var.s0).append((CharSequence) ss0.w0(ss0Var.Q - currentTime));
                    ss0Var.b0.g(spannableStringBuilder, true);
                    m21 m21Var = ss0Var.k0;
                    if (m21Var != null) {
                        q11 q11Var = m21Var.e;
                        if ((q11Var instanceof t11) && q11Var.isAttachedToWindow()) {
                            de9.r(null, null, 2131752940, new Object[]{ss0.w0(ss0Var.Q - currentTime)}, ((t11) ss0Var.k0.e).b);
                        }
                    }
                    gl.r(es0Var);
                    gl.e3(es0Var, 1000L);
                    return;
                }
                tbVar2.g(null, true);
                tb tbVar3 = ss0Var.b0;
                if (ss0Var.Y) {
                    H = k96.M0(2131752957, null);
                } else {
                    H = k96.H(' ', "BotStarsButtonWithdrawShort", (int) ss0Var.Z);
                }
                tbVar3.i(jva.Y0(false, H, ss0Var.d0), true, true);
                return;
            case 1:
                ss0Var.t0();
                return;
            case 2:
                d01.t(ss0Var.getParentActivity(), k96.M0(2131752944, null));
                return;
            case 3:
                ss0Var.r0();
                return;
            case 4:
                d01.t(ss0Var.getParentActivity(), k96.M0(2131753017, null));
                return;
            case 5:
                d01.t(ss0Var.getParentActivity(), k96.M0(2131753037, null));
                return;
            default:
                ss0Var.c0.setLoading(false);
                return;
        }
    }
}
