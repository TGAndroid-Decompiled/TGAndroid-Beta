package ih;

import jh.k7;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
public final class p5 implements NotificationCenter.NotificationCenterDelegate {
    public final int f9327a;
    public final k7 f9328b;
    public final b5 f9329c;
    public f5 d;
    public boolean f9330e;

    public p5(int i10, long j10) {
        this.f9327a = i10;
        k7 k7Var = new k7(i10, 0L, false);
        this.f9328b = k7Var;
        k7Var.f12391p = j10;
        b5 b5Var = new b5(j10, i10, new ag.i0(this, 16));
        b5Var.f9059s = true;
        this.f9329c = b5Var;
    }

    public final void a() {
        if (this.f9330e) {
            return;
        }
        NotificationCenter.getInstance(this.f9327a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f9328b.a();
        this.f9329c.g(false);
        this.f9330e = true;
    }

    public final void b() {
        if (!this.f9330e) {
            return;
        }
        NotificationCenter.getInstance(this.f9327a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        k7 k7Var = this.f9328b;
        if (k7Var.f12388m != -1) {
            ConnectionsManager.getInstance(k7Var.f12378a).cancelRequest(k7Var.f12388m, true);
            k7Var.f12388m = -1;
        }
        k7Var.f12384i = false;
        this.f9329c.f();
        this.f9330e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        f5 f5Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f9328b && (f5Var = this.d) != null) {
            f5Var.run();
        }
    }
}
