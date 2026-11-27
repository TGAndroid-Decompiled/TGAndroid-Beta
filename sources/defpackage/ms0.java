package defpackage;

import android.text.SpannableStringBuilder;
public final class ms0 implements Runnable {
    public final byte a;
    public final at0 b;

    public ms0(at0 at0Var, byte b) {
        this.a = b;
        this.b = at0Var;
    }

    @Override
    public final void run() {
        boolean z;
        String H;
        byte b = this.a;
        at0 at0Var = this.b;
        switch (b) {
            case 0:
                ms0 ms0Var = at0Var.t0;
                int currentTime = at0Var.getConnectionsManager().getCurrentTime();
                ub ubVar = at0Var.b0;
                if (at0Var.Z <= 0 && at0Var.Q <= currentTime) {
                    z = false;
                } else {
                    z = true;
                }
                ubVar.setEnabled(z);
                int i = at0Var.Q;
                ub ubVar2 = at0Var.b0;
                if (currentTime < i) {
                    ubVar2.i(ob6.M0(2131752949, null), true, true);
                    if (at0Var.s0 == null) {
                        at0Var.s0 = new SpannableStringBuilder("l");
                        wm2 wm2Var = new wm2(2131231980, 0);
                        wm2Var.n = 1;
                        at0Var.s0.setSpan(wm2Var, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) at0Var.s0).append((CharSequence) at0.x0(at0Var.Q - currentTime));
                    at0Var.b0.g(spannableStringBuilder, true);
                    v21 v21Var = at0Var.k0;
                    if (v21Var != null) {
                        z11 z11Var = v21Var.e;
                        if ((z11Var instanceof c21) && z11Var.isAttachedToWindow()) {
                            uh9.r(null, null, 2131752933, new Object[]{at0.x0(at0Var.Q - currentTime)}, ((c21) at0Var.k0.e).b);
                        }
                    }
                    hl.r(ms0Var);
                    hl.d3(ms0Var, 1000L);
                    return;
                }
                ubVar2.g(null, true);
                ub ubVar3 = at0Var.b0;
                if (at0Var.Y) {
                    H = ob6.M0(2131752950, null);
                } else {
                    H = ob6.H(' ', "BotStarsButtonWithdrawShort", (int) at0Var.Z);
                }
                ubVar3.i(nza.Z0(false, H, at0Var.d0), true, true);
                return;
            case 1:
                at0Var.t0();
                return;
            case 2:
                m01.u(at0Var.getParentActivity(), ob6.M0(2131752937, null));
                return;
            case 3:
                at0Var.r0();
                return;
            case 4:
                m01.u(at0Var.getParentActivity(), ob6.M0(2131753013, null));
                return;
            case 5:
                m01.u(at0Var.getParentActivity(), ob6.M0(2131753033, null));
                return;
            default:
                at0Var.c0.setLoading(false);
                return;
        }
    }
}
