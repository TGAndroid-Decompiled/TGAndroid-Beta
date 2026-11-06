package ii;

import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
public final class i implements Runnable {
    public final int f15544a;
    public final p f15545b;

    public i(p pVar, int i7) {
        this.f15544a = i7;
        this.f15545b = pVar;
    }

    @Override
    public final void run() {
        int i7 = this.f15544a;
        p pVar = this.f15545b;
        switch (i7) {
            case 0:
                p.b0(pVar);
                return;
            default:
                qs notificationCenter = pVar.getNotificationCenter();
                int i10 = qp.C8;
                notificationCenter.k(2, 8192);
                return;
        }
    }
}
