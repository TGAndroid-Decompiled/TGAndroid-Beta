package bi;

import org.telegram.messenger.AndroidUtilities;
public final class b4 implements Runnable {
    public final int f4335a;
    public final h7 f4336b;
    public final String f4337c;

    public b4(h7 h7Var, String str, int i10) {
        this.f4335a = i10;
        this.f4336b = h7Var;
        this.f4337c = str;
    }

    @Override
    public final void run() {
        switch (this.f4335a) {
            case 0:
                h7.b0(this.f4336b, this.f4337c);
                return;
            case 1:
                h7.z0(this.f4336b, this.f4337c);
                return;
            case 2:
                h7.l0(this.f4336b, this.f4337c);
                return;
            case 3:
                h7.O0(this.f4336b, this.f4337c);
                return;
            case 4:
                h7.h1(this.f4336b, this.f4337c);
                return;
            case 5:
                h7.M0(this.f4336b, this.f4337c);
                return;
            case 6:
                h7.P(this.f4336b, this.f4337c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f4337c);
                org.telegram.ui.Components.qc k10 = this.f4336b.getBulletinFactory().k(false);
                k10.f31900u = true;
                k10.j();
                return;
            default:
                h7.j0(this.f4336b, this.f4337c);
                return;
        }
    }
}
