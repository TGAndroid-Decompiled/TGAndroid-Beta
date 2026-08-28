package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gc;
public final class w2 implements Runnable {
    public final int f9086a;
    public final k5 f9087b;
    public final String f9088c;

    public w2(k5 k5Var, String str, int i9) {
        this.f9086a = i9;
        this.f9087b = k5Var;
        this.f9088c = str;
    }

    @Override
    public final void run() {
        switch (this.f9086a) {
            case 0:
                k5.i1(this.f9087b, this.f9088c);
                return;
            case 1:
                k5.h1(this.f9087b, this.f9088c);
                return;
            case 2:
                k5.s0(this.f9087b, this.f9088c);
                return;
            case 3:
                k5.Q0(this.f9087b, this.f9088c);
                return;
            case 4:
                k5.B0(this.f9087b, this.f9088c);
                return;
            case 5:
                k5.P(this.f9087b, this.f9088c);
                return;
            case 6:
                k5.v0(this.f9087b, this.f9088c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f9088c);
                gc k10 = this.f9087b.getBulletinFactory().k(false);
                k10.f28747t = true;
                k10.j();
                return;
            default:
                k5.n0(this.f9087b, this.f9088c);
                return;
        }
    }
}
