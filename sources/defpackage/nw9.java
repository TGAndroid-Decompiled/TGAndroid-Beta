package defpackage;

import org.telegram.messenger.MediaController;
public final class nw9 implements Runnable {
    public final byte a;
    public final tw9 b;

    public nw9(tw9 tw9Var, byte b) {
        this.a = b;
        this.b = tw9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        tw9 tw9Var = this.b;
        switch (b) {
            case 0:
                nw9 nw9Var = tw9Var.a0;
                ndc ndcVar = tw9Var.x;
                if (ndcVar != null) {
                    tw9Var.b0 = ((float) ndcVar.S()) / ((float) tw9Var.x.U());
                    rw9 rw9Var = tw9Var.O;
                    if (rw9Var != null) {
                        rw9Var.Bc = (tw9Var.x.U() - tw9Var.x.S()) / 1000;
                        tw9Var.O.W3();
                        gx9 seekBarWaveform = tw9Var.O.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f = tw9Var.b0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f;
                            rc2 rc2Var = seekBarWaveform.n;
                            if (rc2Var != null) {
                                rc2Var.invalidate();
                            }
                        }
                    }
                    if (tw9Var.x.c0()) {
                        gm.r(nw9Var);
                        gm.d3(nw9Var, 16L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                tw9Var.c();
                return;
            case 2:
                tw9Var.b();
                return;
            default:
                if (tw9Var.d == null) {
                    gm.c3(new nw9(tw9Var, (byte) 2));
                    rc2 rc2Var2 = tw9Var.P;
                    if (rc2Var2 != null) {
                        rc2Var2.setVisibility(0);
                        tw9Var.P.invalidate();
                    }
                }
                MediaController.w().E0();
                return;
        }
    }
}
