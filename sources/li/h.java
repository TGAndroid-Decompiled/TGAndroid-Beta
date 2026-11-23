package li;

import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
public final class h implements Runnable {
    public final int f20035a;
    public final o f20036b;

    public h(o oVar, int i7) {
        this.f20035a = i7;
        this.f20036b = oVar;
    }

    @Override
    public final void run() {
        int i7 = this.f20035a;
        o oVar = this.f20036b;
        switch (i7) {
            case 0:
                o.b0(oVar);
                return;
            default:
                ks notificationCenter = oVar.getNotificationCenter();
                int i10 = mp.I8;
                notificationCenter.k(2, 8192);
                return;
        }
    }
}
