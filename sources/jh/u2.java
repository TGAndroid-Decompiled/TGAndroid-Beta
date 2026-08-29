package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mc;
public final class u2 implements Runnable {
    public final int f12888a;
    public final h5 f12889b;
    public final String f12890c;

    public u2(h5 h5Var, String str, int i10) {
        this.f12888a = i10;
        this.f12889b = h5Var;
        this.f12890c = str;
    }

    @Override
    public final void run() {
        switch (this.f12888a) {
            case 0:
                h5.i1(this.f12889b, this.f12890c);
                return;
            case 1:
                h5.h1(this.f12889b, this.f12890c);
                return;
            case 2:
                h5.t0(this.f12889b, this.f12890c);
                return;
            case 3:
                h5.Q0(this.f12889b, this.f12890c);
                return;
            case 4:
                h5.C0(this.f12889b, this.f12890c);
                return;
            case 5:
                h5.Q(this.f12889b, this.f12890c);
                return;
            case 6:
                h5.w0(this.f12889b, this.f12890c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f12890c);
                mc k9 = this.f12889b.getBulletinFactory().k(false);
                k9.f30662t = true;
                k9.j();
                return;
            default:
                h5.o0(this.f12889b, this.f12890c);
                return;
        }
    }
}
