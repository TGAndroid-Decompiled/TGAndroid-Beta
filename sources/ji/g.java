package ji;

import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
public final class g implements Runnable {
    public final int f16306a;
    public final n f16307b;

    public g(n nVar, int i3) {
        this.f16306a = i3;
        this.f16307b = nVar;
    }

    @Override
    public final void run() {
        int i3 = this.f16306a;
        n nVar = this.f16307b;
        switch (i3) {
            case 0:
                n.b0(nVar);
                return;
            default:
                hs notificationCenter = nVar.getNotificationCenter();
                int i10 = hp.C8;
                notificationCenter.k(2, 8192);
                return;
        }
    }
}
