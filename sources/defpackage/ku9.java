package defpackage;

import org.telegram.messenger.MediaController;
public final class ku9 implements Runnable {
    public final byte a;
    public final qu9 b;

    public ku9(qu9 qu9Var, byte b) {
        this.a = b;
        this.b = qu9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qu9 qu9Var = this.b;
        switch (b) {
            case 0:
                ku9 ku9Var = qu9Var.a0;
                lbc lbcVar = qu9Var.x;
                if (lbcVar != null) {
                    qu9Var.b0 = ((float) lbcVar.S()) / ((float) qu9Var.x.U());
                    ou9 ou9Var = qu9Var.O;
                    if (ou9Var != null) {
                        ou9Var.Bc = (qu9Var.x.U() - qu9Var.x.S()) / 1000;
                        qu9Var.O.W3();
                        dv9 seekBarWaveform = qu9Var.O.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f = qu9Var.b0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f;
                            gb2 gb2Var = seekBarWaveform.n;
                            if (gb2Var != null) {
                                gb2Var.invalidate();
                            }
                        }
                    }
                    if (qu9Var.x.c0()) {
                        gl.r(ku9Var);
                        gl.e3(ku9Var, 16L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                qu9Var.c();
                return;
            case 2:
                qu9Var.b();
                return;
            default:
                if (qu9Var.d == null) {
                    gl.d3(new ku9(qu9Var, (byte) 2));
                    gb2 gb2Var2 = qu9Var.P;
                    if (gb2Var2 != null) {
                        gb2Var2.setVisibility(0);
                        qu9Var.P.invalidate();
                    }
                }
                MediaController.w().E0();
                return;
        }
    }
}
