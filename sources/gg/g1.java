package gg;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.nz;
public final class g1 {
    public final int f9733a;
    public final long f9734b;
    public final long f9735c;
    public boolean e;
    public final int f9737g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f9736f = -1;

    public g1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j3, long j10, int i11) {
        this.f9737g = i11;
        this.h = notificationCenterDelegate;
        this.f9733a = i10;
        this.f9734b = j3;
        this.f9735c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.f9737g) {
            case 0:
                N = ((k1) this.h).N();
                break;
            default:
                nz nzVar = (nz) this.h;
                if (nzVar.f26871t1 != null && nzVar.getVisibility() == 0 && nzVar.K0) {
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
                MessagesController.getInstance(this.f9733a).sendTyping(this.f9734b, this.f9735c, 2, 0);
            }
            this.f9736f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f9736f == -1) {
                this.f9736f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f9736f > 2000) {
                this.e = true;
                this.f9736f = System.currentTimeMillis();
                MessagesController.getInstance(this.f9733a).sendTyping(this.f9734b, this.f9735c, 10, 0);
            }
        }
    }
}
