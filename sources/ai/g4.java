package ai;

import org.telegram.messenger.AndroidUtilities;
public final class g4 implements Runnable {
    public final int f1358a;
    public final k7 f1359b;
    public final String f1360c;

    public g4(k7 k7Var, String str, int i10) {
        this.f1358a = i10;
        this.f1359b = k7Var;
        this.f1360c = str;
    }

    @Override
    public final void run() {
        switch (this.f1358a) {
            case 0:
                k7.m0(this.f1359b, this.f1360c);
                return;
            case 1:
                k7.A0(this.f1359b, this.f1360c);
                return;
            case 2:
                k7.n0(this.f1359b, this.f1360c);
                return;
            case 3:
                k7.M0(this.f1359b, this.f1360c);
                return;
            case 4:
                k7.f1(this.f1359b, this.f1360c);
                return;
            case 5:
                k7.L0(this.f1359b, this.f1360c);
                return;
            case 6:
                k7.Q(this.f1359b, this.f1360c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f1360c);
                org.telegram.ui.Components.qc k10 = this.f1359b.getBulletinFactory().k(false);
                k10.f29649t = true;
                k10.j();
                return;
            default:
                k7.l0(this.f1359b, this.f1360c);
                return;
        }
    }
}
