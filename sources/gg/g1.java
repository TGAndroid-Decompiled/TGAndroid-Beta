package gg;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.kz;
public final class g1 {
    public final int f9735a;
    public final long f9736b;
    public final long f9737c;
    public boolean e;
    public final int f9739g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f9738f = -1;

    public g1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j3, long j10, int i11) {
        this.f9739g = i11;
        this.h = notificationCenterDelegate;
        this.f9735a = i10;
        this.f9736b = j3;
        this.f9737c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.f9739g) {
            case 0:
                N = ((k1) this.h).N();
                break;
            default:
                kz kzVar = (kz) this.h;
                if (kzVar.f25756t1 != null && kzVar.getVisibility() == 0 && kzVar.K0) {
                    N = true;
                    break;
                } else {
                    N = false;
                    break;
                }
        }
        this.d = N;
        if (!N) {
            if (this.e) {
                MessagesController.getInstance(this.f9735a).sendTyping(this.f9736b, this.f9737c, 2, 0);
            }
            this.f9738f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f9738f == -1) {
                this.f9738f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f9738f > 2000) {
                this.e = true;
                this.f9738f = System.currentTimeMillis();
                MessagesController.getInstance(this.f9735a).sendTyping(this.f9736b, this.f9737c, 10, 0);
            }
        }
    }
}
