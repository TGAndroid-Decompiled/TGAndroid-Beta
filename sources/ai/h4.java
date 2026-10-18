package ai;

import org.telegram.messenger.AndroidUtilities;
public final class h4 implements Runnable {
    public final int f1407a;
    public final k7 f1408b;
    public final String f1409c;

    public h4(k7 k7Var, String str, int i10) {
        this.f1407a = i10;
        this.f1408b = k7Var;
        this.f1409c = str;
    }

    @Override
    public final void run() {
        switch (this.f1407a) {
            case 0:
                k7.l0(this.f1408b, this.f1409c);
                return;
            case 1:
                k7.y0(this.f1408b, this.f1409c);
                return;
            case 2:
                k7.m0(this.f1408b, this.f1409c);
                return;
            case 3:
                k7.K0(this.f1408b, this.f1409c);
                return;
            case 4:
                k7.g1(this.f1408b, this.f1409c);
                return;
            case 5:
                k7.J0(this.f1408b, this.f1409c);
                return;
            case 6:
                k7.Q(this.f1408b, this.f1409c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f1409c);
                org.telegram.ui.Components.qc k10 = this.f1408b.getBulletinFactory().k(false);
                k10.f29648t = true;
                k10.j();
                return;
            default:
                k7.k0(this.f1408b, this.f1409c);
                return;
        }
    }
}
