package defpackage;
public final class vb1 implements Runnable {
    public final byte a;
    public final hbb b;

    public vb1(hbb hbbVar, byte b) {
        this.a = b;
        this.b = hbbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hbb hbbVar = this.b;
        switch (b) {
            case 0:
                hbbVar.n();
                return;
            case 1:
                hbbVar.K0 = false;
                hbbVar.L0 = Integer.MIN_VALUE;
                hbbVar.invalidate();
                hbbVar.S0.setVisibility(0);
                hbbVar.T0.setVisibility(0);
                return;
            default:
                rbb rbbVar = hbbVar.S1;
                gbb gbbVar = rbbVar.Y0;
                if (gbbVar != null) {
                    gbbVar.P = false;
                    gbbVar.b();
                    gbb gbbVar2 = rbbVar.Y0;
                    gbbVar2.m(0L);
                    ksb ksbVar = gbbVar2.G;
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
