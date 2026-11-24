package defpackage;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.ConnectionsManager;
public final class nj1 implements Runnable {
    public final byte a;
    public final ik1 b;
    public final int c;

    public nj1(ik1 ik1Var, int i, byte b) {
        this.a = b;
        this.b = ik1Var;
        this.c = i;
    }

    @Override
    public final void run() {
        long f;
        boolean z;
        String H;
        byte b = this.a;
        int i = this.c;
        ik1 ik1Var = this.b;
        switch (b) {
            case 0:
                l11.u(ik1Var.getContext(), jb6.M0(i, null));
                return;
            case 1:
                nj1 nj1Var = ik1Var.f1;
                vc vcVar = ik1Var.O0;
                u31.e();
                if (ik1Var.D0.amount < oc7.r1(i).l4.q2.f()) {
                    ik1Var.M0 = true;
                    f = ik1Var.D0.amount;
                    ik1Var.N0 = f;
                } else {
                    ik1Var.M0 = false;
                    f = oc7.r1(i).l4.q2.f();
                    ik1Var.N0 = f;
                }
                ik1Var.L0 = true;
                vcVar.setText(Long.toString(f));
                vcVar.setSelection(vcVar.getText().length());
                ik1Var.L0 = false;
                gm.r(nj1Var);
                nj1Var.run();
                return;
            default:
                nj1 nj1Var2 = ik1Var.f1;
                int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
                xj1 xj1Var = ik1Var.G0;
                if (ik1Var.N0 <= 0 && ik1Var.B0 <= currentTime) {
                    z = false;
                } else {
                    z = true;
                }
                xj1Var.setEnabled(z);
                if (currentTime < ik1Var.B0) {
                    xj1Var.i(jb6.M0(2131748124, null), true, true);
                    if (ik1Var.e1 == null) {
                        ik1Var.e1 = new SpannableStringBuilder("l");
                        pn2 pn2Var = new pn2(2131231981, 0);
                        pn2Var.n = 1;
                        ik1Var.e1.setSpan(pn2Var, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) ik1Var.e1).append((CharSequence) au0.x0(ik1Var.B0 - currentTime));
                    xj1Var.g(spannableStringBuilder, true);
                    u31 u31Var = ik1Var.P0;
                    if (u31Var != null) {
                        y21 y21Var = u31Var.e;
                        if ((y21Var instanceof b31) && y21Var.isAttachedToWindow()) {
                            hg9.q(null, null, 2131752905, new Object[]{au0.x0(ik1Var.B0 - currentTime)}, ((b31) ik1Var.P0.e).b);
                        }
                    }
                    gm.r(nj1Var2);
                    gm.d3(nj1Var2, 1000L);
                    return;
                }
                xj1Var.g(null, true);
                if (ik1Var.M0) {
                    H = jb6.M0(2131748125, null);
                } else {
                    H = jb6.H(' ', "MonetizationStarsWithdraw", (int) ik1Var.N0);
                }
                xj1Var.i(nxa.Z0(false, H, ik1Var.H0), true, true);
                return;
        }
    }
}
