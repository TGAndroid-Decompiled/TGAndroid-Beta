package ai;

import org.telegram.messenger.AndroidUtilities;
public final class j4 implements Runnable {
    public final int f1555a;
    public final k7 f1556b;
    public final String f1557c;

    public j4(k7 k7Var, String str, int i10) {
        this.f1555a = i10;
        this.f1556b = k7Var;
        this.f1557c = str;
    }

    @Override
    public final void run() {
        switch (this.f1555a) {
            case 0:
                k7.m0(this.f1556b, this.f1557c);
                return;
            case 1:
                k7.A0(this.f1556b, this.f1557c);
                return;
            case 2:
                k7.n0(this.f1556b, this.f1557c);
                return;
            case 3:
                k7.N0(this.f1556b, this.f1557c);
                return;
            case 4:
                k7.i1(this.f1556b, this.f1557c);
                return;
            case 5:
                k7.M0(this.f1556b, this.f1557c);
                return;
            case 6:
                k7.Q(this.f1556b, this.f1557c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f1557c);
                org.telegram.ui.Components.qc k10 = this.f1556b.getBulletinFactory().k(false);
                k10.f29655t = true;
                k10.j();
                return;
            default:
                k7.k0(this.f1556b, this.f1557c);
                return;
        }
    }
}
