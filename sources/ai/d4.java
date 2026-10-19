package ai;

import org.telegram.messenger.AndroidUtilities;
public final class d4 implements Runnable {
    public final int f1131a;
    public final k7 f1132b;
    public final String f1133c;

    public d4(k7 k7Var, String str, int i10) {
        this.f1131a = i10;
        this.f1132b = k7Var;
        this.f1133c = str;
    }

    @Override
    public final void run() {
        switch (this.f1131a) {
            case 0:
                k7.a0(this.f1132b, this.f1133c);
                return;
            case 1:
                k7.v0(this.f1132b, this.f1133c);
                return;
            case 2:
                k7.n0(this.f1132b, this.f1133c);
                return;
            case 3:
                k7.I0(this.f1132b, this.f1133c);
                return;
            case 4:
                k7.i1(this.f1132b, this.f1133c);
                return;
            case 5:
                k7.H0(this.f1132b, this.f1133c);
                return;
            case 6:
                k7.R(this.f1132b, this.f1133c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f1133c);
                org.telegram.ui.Components.qc k10 = this.f1132b.getBulletinFactory().k(false);
                k10.f29606t = true;
                k10.j();
                return;
            default:
                k7.l0(this.f1132b, this.f1133c);
                return;
        }
    }
}
