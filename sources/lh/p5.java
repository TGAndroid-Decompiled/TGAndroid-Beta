package lh;

import mh.l7;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
public final class p5 implements NotificationCenter.NotificationCenterDelegate {
    public final int f12894a;
    public final l7 f12895b;
    public final b5 f12896c;
    public f5 d;
    public boolean f12897e;

    public p5(int i10, long j10) {
        this.f12894a = i10;
        l7 l7Var = new l7(i10, 0L, false);
        this.f12895b = l7Var;
        l7Var.f14409p = j10;
        b5 b5Var = new b5(j10, i10, new dg.h0(this, 16));
        b5Var.f12634s = true;
        this.f12896c = b5Var;
    }

    public final void a() {
        if (this.f12897e) {
            return;
        }
        NotificationCenter.getInstance(this.f12894a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f12895b.a();
        this.f12896c.g(false);
        this.f12897e = true;
    }

    public final void b() {
        if (!this.f12897e) {
            return;
        }
        NotificationCenter.getInstance(this.f12894a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        l7 l7Var = this.f12895b;
        if (l7Var.f14406m != -1) {
            ConnectionsManager.getInstance(l7Var.f14396a).cancelRequest(l7Var.f14406m, true);
            l7Var.f14406m = -1;
        }
        l7Var.f14402i = false;
        this.f12896c.f();
        this.f12897e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        f5 f5Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f12895b && (f5Var = this.d) != null) {
            f5Var.run();
        }
    }
}
