package gh;

import hh.m7;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;

public final class w5 implements NotificationCenter.NotificationCenterDelegate {

    public final int f7605a;

    public final m7 f7606b;

    public final i5 f7607c;
    public m5 d;

    public boolean f7608e;

    public w5(int i10, long j10) {
        this.f7605a = i10;
        m7 m7Var = new m7(i10, 0L, false);
        this.f7606b = m7Var;
        m7Var.f9757p = j10;
        i5 i5Var = new i5(j10, i10, new ag.n0(this, 11));
        i5Var.f7339s = true;
        this.f7607c = i5Var;
    }

    public final void a() {
        if (this.f7608e) {
            return;
        }
        NotificationCenter.getInstance(this.f7605a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f7606b.a();
        this.f7607c.g(false);
        this.f7608e = true;
    }

    public final void b() {
        if (this.f7608e) {
            NotificationCenter.getInstance(this.f7605a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
            m7 m7Var = this.f7606b;
            if (m7Var.f9754m != -1) {
                ConnectionsManager.getInstance(m7Var.f9744a).cancelRequest(m7Var.f9754m, true);
                m7Var.f9754m = -1;
            }
            m7Var.f9750i = false;
            this.f7607c.f();
            this.f7608e = false;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        m5 m5Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f7606b && (m5Var = this.d) != null) {
            m5Var.run();
        }
    }
}
