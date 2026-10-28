package jg;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f15708a;
    public final n f15709b;

    public g(n nVar, int i10) {
        this.f15708a = i10;
        this.f15709b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f15708a) {
            case 0:
                n.Z(this.f15709b);
                return;
            case 1:
                n.a0(this.f15709b);
                return;
            default:
                g gVar = this.f15709b.e;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}
