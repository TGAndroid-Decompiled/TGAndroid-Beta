package of;

import org.telegram.messenger.zs;
public final class a implements Runnable {
    public final int f14151a;
    public final c f14152b;

    public a(c cVar, int i10) {
        this.f14151a = i10;
        this.f14152b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f14151a) {
            case 0:
                this.f14152b.g(false);
                return;
            default:
                zs.f(this.f14152b.f14160c).k(307, new Object[0]);
                return;
        }
    }
}
