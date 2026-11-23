package li;

import org.telegram.messenger.ls;
import org.telegram.messenger.np;
public final class i implements Runnable {
    public final int f19972a;
    public final p f19973b;

    public i(p pVar, int i7) {
        this.f19972a = i7;
        this.f19973b = pVar;
    }

    @Override
    public final void run() {
        int i7 = this.f19972a;
        p pVar = this.f19973b;
        switch (i7) {
            case 0:
                p.b0(pVar);
                return;
            default:
                ls notificationCenter = pVar.getNotificationCenter();
                int i10 = np.I8;
                notificationCenter.k(2, 8192);
                return;
        }
    }
}
