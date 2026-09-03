package lh;

import mh.l7;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
public final class p5 implements NotificationCenter.NotificationCenterDelegate {
    public final int f12896a;
    public final l7 f12897b;
    public final b5 f12898c;
    public f5 d;
    public boolean f12899e;

    public p5(int i10, long j10) {
        this.f12896a = i10;
        l7 l7Var = new l7(i10, 0L, false);
        this.f12897b = l7Var;
        l7Var.f14411p = j10;
        b5 b5Var = new b5(j10, i10, new dg.h0(this, 16));
        b5Var.f12636s = true;
        this.f12898c = b5Var;
    }

    public final void a() {
        if (this.f12899e) {
            return;
        }
        NotificationCenter.getInstance(this.f12896a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f12897b.a();
        this.f12898c.g(false);
        this.f12899e = true;
    }

    public final void b() {
        if (!this.f12899e) {
            return;
        }
        NotificationCenter.getInstance(this.f12896a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        l7 l7Var = this.f12897b;
        if (l7Var.f14408m != -1) {
            ConnectionsManager.getInstance(l7Var.f14398a).cancelRequest(l7Var.f14408m, true);
            l7Var.f14408m = -1;
        }
        l7Var.f14404i = false;
        this.f12898c.f();
        this.f12899e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        f5 f5Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f12897b && (f5Var = this.d) != null) {
            f5Var.run();
        }
    }
}
