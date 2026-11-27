package defpackage;
public final class vb1 implements Runnable {
    public final byte a;
    public final ibb b;

    public vb1(ibb ibbVar, byte b) {
        this.a = b;
        this.b = ibbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ibb ibbVar = this.b;
        switch (b) {
            case 0:
                ibbVar.n();
                return;
            case 1:
                ibbVar.K0 = false;
                ibbVar.L0 = Integer.MIN_VALUE;
                ibbVar.invalidate();
                ibbVar.S0.setVisibility(0);
                ibbVar.T0.setVisibility(0);
                return;
            default:
                sbb sbbVar = ibbVar.S1;
                hbb hbbVar = sbbVar.Y0;
                if (hbbVar != null) {
                    hbbVar.P = false;
                    hbbVar.b();
                    hbb hbbVar2 = sbbVar.Y0;
                    hbbVar2.m(0L);
                    ksb ksbVar = hbbVar2.G;
                    if (ksbVar != null) {
                        ksbVar.setProgress(0L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
