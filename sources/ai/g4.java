package ai;

import org.telegram.messenger.AndroidUtilities;
public final class g4 implements Runnable {
    public final int f1348a;
    public final l7 f1349b;
    public final String f1350c;

    public g4(l7 l7Var, String str, int i10) {
        this.f1348a = i10;
        this.f1349b = l7Var;
        this.f1350c = str;
    }

    @Override
    public final void run() {
        switch (this.f1348a) {
            case 0:
                l7.c0(this.f1349b, this.f1350c);
                return;
            case 1:
                l7.A0(this.f1349b, this.f1350c);
                return;
            case 2:
                l7.m0(this.f1349b, this.f1350c);
                return;
            case 3:
                l7.P0(this.f1349b, this.f1350c);
                return;
            case 4:
                l7.i1(this.f1349b, this.f1350c);
                return;
            case 5:
                l7.N0(this.f1349b, this.f1350c);
                return;
            case 6:
                l7.Q(this.f1349b, this.f1350c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f1350c);
                org.telegram.ui.Components.qc k10 = this.f1349b.getBulletinFactory().k(false);
                k10.f29604t = true;
                k10.j();
                return;
            default:
                l7.k0(this.f1349b, this.f1350c);
                return;
        }
    }
}
