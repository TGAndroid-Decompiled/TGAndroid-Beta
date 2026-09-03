package kh;

import lh.l7;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
public final class o5 implements NotificationCenter.NotificationCenterDelegate {
    public final int f10849a;
    public final l7 f10850b;
    public final a5 f10851c;
    public e5 d;
    public boolean e;

    public o5(int i10, long j10) {
        this.f10849a = i10;
        l7 l7Var = new l7(i10, 0L, false);
        this.f10850b = l7Var;
        l7Var.f12760p = j10;
        a5 a5Var = new a5(j10, i10, new cg.h0(this, 16));
        a5Var.f10595s = true;
        this.f10851c = a5Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f10849a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f10850b.a();
        this.f10851c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f10849a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        l7 l7Var = this.f10850b;
        if (l7Var.f12757m != -1) {
            ConnectionsManager.getInstance(l7Var.f12748a).cancelRequest(l7Var.f12757m, true);
            l7Var.f12757m = -1;
        }
        l7Var.f12753i = false;
        this.f10851c.f();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e5 e5Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f10850b && (e5Var = this.d) != null) {
            e5Var.run();
        }
    }
}
