package ai;

import org.telegram.messenger.AndroidUtilities;
public final class g4 implements Runnable {
    public final int f1345a;
    public final l7 f1346b;
    public final String f1347c;

    public g4(l7 l7Var, String str, int i10) {
        this.f1345a = i10;
        this.f1346b = l7Var;
        this.f1347c = str;
    }

    @Override
    public final void run() {
        switch (this.f1345a) {
            case 0:
                l7.b0(this.f1346b, this.f1347c);
                return;
            case 1:
                l7.z0(this.f1346b, this.f1347c);
                return;
            case 2:
                l7.l0(this.f1346b, this.f1347c);
                return;
            case 3:
                l7.O0(this.f1346b, this.f1347c);
                return;
            case 4:
                l7.h1(this.f1346b, this.f1347c);
                return;
            case 5:
                l7.M0(this.f1346b, this.f1347c);
                return;
            case 6:
                l7.P(this.f1346b, this.f1347c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f1347c);
                org.telegram.ui.Components.qc k10 = this.f1346b.getBulletinFactory().k(false);
                k10.f29842t = true;
                k10.j();
                return;
            default:
                l7.j0(this.f1346b, this.f1347c);
                return;
        }
    }
}
