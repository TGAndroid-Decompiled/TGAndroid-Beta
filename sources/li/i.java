package li;

import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
public final class i implements Runnable {
    public final int f19941a;
    public final p f19942b;

    public i(p pVar, int i7) {
        this.f19941a = i7;
        this.f19942b = pVar;
    }

    @Override
    public final void run() {
        int i7 = this.f19941a;
        p pVar = this.f19942b;
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
