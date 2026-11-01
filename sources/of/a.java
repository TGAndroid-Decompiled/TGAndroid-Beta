package of;

import org.telegram.messenger.at;
public final class a implements Runnable {
    public final int f14152a;
    public final c f14153b;

    public a(c cVar, int i10) {
        this.f14152a = i10;
        this.f14153b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f14152a) {
            case 0:
                this.f14153b.g(false);
                return;
            default:
                at.f(this.f14153b.f14161c).k(307, new Object[0]);
                return;
        }
    }
}
