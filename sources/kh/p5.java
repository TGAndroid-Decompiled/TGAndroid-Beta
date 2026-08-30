package kh;

import lh.l7;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
public final class p5 implements NotificationCenter.NotificationCenterDelegate {
    public final int f10750a;
    public final l7 f10751b;
    public final b5 f10752c;
    public f5 d;
    public boolean e;

    public p5(int i10, long j10) {
        this.f10750a = i10;
        l7 l7Var = new l7(i10, 0L, false);
        this.f10751b = l7Var;
        l7Var.f12776p = j10;
        b5 b5Var = new b5(j10, i10, new cg.h0(this, 16));
        b5Var.f10497s = true;
        this.f10752c = b5Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f10750a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f10751b.a();
        this.f10752c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f10750a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        l7 l7Var = this.f10751b;
        if (l7Var.f12773m != -1) {
            ConnectionsManager.getInstance(l7Var.f12764a).cancelRequest(l7Var.f12773m, true);
            l7Var.f12773m = -1;
        }
        l7Var.f12769i = false;
        this.f10752c.f();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        f5 f5Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f10751b && (f5Var = this.d) != null) {
            f5Var.run();
        }
    }
}
