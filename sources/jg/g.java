package jg;

import org.telegram.messenger.AndroidUtilities;
public final class g implements Runnable {
    public final int f15709a;
    public final n f15710b;

    public g(n nVar, int i10) {
        this.f15709a = i10;
        this.f15710b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f15709a) {
            case 0:
                n.Z(this.f15710b);
                return;
            case 1:
                n.a0(this.f15710b);
                return;
            default:
                g gVar = this.f15710b.e;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, 5000L);
                return;
        }
    }
}
