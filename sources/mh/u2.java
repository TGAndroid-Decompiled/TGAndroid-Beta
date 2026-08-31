package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ic;
public final class u2 implements Runnable {
    public final int f14864a;
    public final g5 f14865b;
    public final String f14866c;

    public u2(g5 g5Var, String str, int i10) {
        this.f14864a = i10;
        this.f14865b = g5Var;
        this.f14866c = str;
    }

    @Override
    public final void run() {
        switch (this.f14864a) {
            case 0:
                g5.i1(this.f14865b, this.f14866c);
                return;
            case 1:
                g5.h1(this.f14865b, this.f14866c);
                return;
            case 2:
                g5.t0(this.f14865b, this.f14866c);
                return;
            case 3:
                g5.Q0(this.f14865b, this.f14866c);
                return;
            case 4:
                g5.C0(this.f14865b, this.f14866c);
                return;
            case 5:
                g5.Q(this.f14865b, this.f14866c);
                return;
            case 6:
                g5.w0(this.f14865b, this.f14866c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f14866c);
                ic k10 = this.f14865b.getBulletinFactory().k(false);
                k10.f27755t = true;
                k10.j();
                return;
            default:
                g5.o0(this.f14865b, this.f14866c);
                return;
        }
    }
}
