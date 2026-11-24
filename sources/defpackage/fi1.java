package defpackage;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.ConnectionsManager;
public final class fi1 implements Runnable {
    public final byte a;
    public final zi1 b;
    public final int c;

    public fi1(zi1 zi1Var, int i, byte b) {
        this.a = b;
        this.b = zi1Var;
        this.c = i;
    }

    @Override
    public final void run() {
        long f;
        boolean z;
        String H;
        byte b = this.a;
        int i = this.c;
        zi1 zi1Var = this.b;
        switch (b) {
            case 0:
                d01.t(zi1Var.getContext(), k96.M0(i, null));
                return;
            case 1:
                fi1 fi1Var = zi1Var.f1;
                ps0 ps0Var = zi1Var.O0;
                m21.e();
                if (zi1Var.D0.amount < na7.q1(i).k4.q2.f()) {
                    zi1Var.M0 = true;
                    f = zi1Var.D0.amount;
                    zi1Var.N0 = f;
                } else {
                    zi1Var.M0 = false;
                    f = na7.q1(i).k4.q2.f();
                    zi1Var.N0 = f;
                }
                zi1Var.L0 = true;
                ps0Var.setText(Long.toString(f));
                ps0Var.setSelection(ps0Var.getText().length());
                zi1Var.L0 = false;
                gl.r(fi1Var);
                fi1Var.run();
                return;
            default:
                fi1 fi1Var2 = zi1Var.f1;
                int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
                oi1 oi1Var = zi1Var.G0;
                if (zi1Var.N0 <= 0 && zi1Var.B0 <= currentTime) {
                    z = false;
                } else {
                    z = true;
                }
                oi1Var.setEnabled(z);
                if (currentTime < zi1Var.B0) {
                    oi1Var.i(k96.M0(2131748175, null), true, true);
                    if (zi1Var.e1 == null) {
                        zi1Var.e1 = new SpannableStringBuilder("l");
                        cm2 cm2Var = new cm2(2131231980, 0);
                        cm2Var.n = 1;
                        zi1Var.e1.setSpan(cm2Var, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) zi1Var.e1).append((CharSequence) ss0.w0(zi1Var.B0 - currentTime));
                    oi1Var.g(spannableStringBuilder, true);
                    m21 m21Var = zi1Var.P0;
                    if (m21Var != null) {
                        q11 q11Var = m21Var.e;
                        if ((q11Var instanceof t11) && q11Var.isAttachedToWindow()) {
                            de9.r(null, null, 2131752940, new Object[]{ss0.w0(zi1Var.B0 - currentTime)}, ((t11) zi1Var.P0.e).b);
                        }
                    }
                    gl.r(fi1Var2);
                    gl.d3(fi1Var2, 1000L);
                    return;
                }
                oi1Var.g(null, true);
                if (zi1Var.M0) {
                    H = k96.M0(2131748176, null);
                } else {
                    H = k96.H(' ', "MonetizationStarsWithdraw", (int) zi1Var.N0);
                }
                oi1Var.i(jva.Y0(false, H, zi1Var.H0), true, true);
                return;
        }
    }
}
