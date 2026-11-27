package defpackage;

import org.telegram.messenger.MediaController;
public final class fy9 implements Runnable {
    public final byte a;
    public final ky9 b;

    public fy9(ky9 ky9Var, byte b) {
        this.a = b;
        this.b = ky9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ky9 ky9Var = this.b;
        switch (b) {
            case 0:
                fy9 fy9Var = ky9Var.a0;
                kfc kfcVar = ky9Var.x;
                if (kfcVar != null) {
                    ky9Var.b0 = ((float) kfcVar.S()) / ((float) ky9Var.x.U());
                    jy9 jy9Var = ky9Var.O;
                    if (jy9Var != null) {
                        jy9Var.Bc = (ky9Var.x.U() - ky9Var.x.S()) / 1000;
                        ky9Var.O.W3();
                        xy9 seekBarWaveform = ky9Var.O.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f = ky9Var.b0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f;
                            wb2 wb2Var = seekBarWaveform.n;
                            if (wb2Var != null) {
                                wb2Var.invalidate();
                            }
                        }
                    }
                    if (ky9Var.x.c0()) {
                        hl.r(fy9Var);
                        hl.d3(fy9Var, 16L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ky9Var.c();
                return;
            case 2:
                ky9Var.b();
                return;
            default:
                if (ky9Var.d == null) {
                    hl.c3(new fy9(ky9Var, (byte) 2));
                    wb2 wb2Var2 = ky9Var.P;
                    if (wb2Var2 != null) {
                        wb2Var2.setVisibility(0);
                        ky9Var.P.invalidate();
                    }
                }
                MediaController.z().J0();
                return;
        }
    }
}
