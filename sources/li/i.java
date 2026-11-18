package li;

import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
public final class i implements Runnable {
    public final int f19944a;
    public final p f19945b;

    public i(p pVar, int i7) {
        this.f19944a = i7;
        this.f19945b = pVar;
    }

    @Override
    public final void run() {
        int i7 = this.f19944a;
        p pVar = this.f19945b;
        switch (i7) {
            case 0:
                p.b0(pVar);
                return;
            default:
                ks notificationCenter = pVar.getNotificationCenter();
                int i10 = mp.I8;
                notificationCenter.k(2, 8192);
                return;
        }
    }
}
