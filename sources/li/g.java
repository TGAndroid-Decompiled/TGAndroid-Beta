package li;

import org.telegram.messenger.np;
import org.telegram.messenger.ns;
public final class g implements Runnable {
    public final int f19570a;
    public final n f19571b;

    public g(n nVar, int i7) {
        this.f19570a = i7;
        this.f19571b = nVar;
    }

    @Override
    public final void run() {
        int i7 = this.f19570a;
        n nVar = this.f19571b;
        switch (i7) {
            case 0:
                n.b0(nVar);
                return;
            default:
                ns notificationCenter = nVar.getNotificationCenter();
                int i10 = np.D8;
                notificationCenter.k(2, 8192);
                return;
        }
    }
}
