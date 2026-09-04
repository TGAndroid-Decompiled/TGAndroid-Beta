package hg;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.kz;
public final class g1 {
    public final int f11055a;
    public final long f11056b;
    public final long f11057c;
    public boolean f11058e;
    public final int f11060g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f11059f = -1;

    public g1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j3, long j10, int i11) {
        this.f11060g = i11;
        this.h = notificationCenterDelegate;
        this.f11055a = i10;
        this.f11056b = j3;
        this.f11057c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.f11060g) {
            case 0:
                N = ((k1) this.h).N();
                break;
            default:
                kz kzVar = (kz) this.h;
                if (kzVar.f27986t1 != null && kzVar.getVisibility() == 0 && kzVar.K0) {
                    N = true;
                    break;
                } else {
                    N = false;
                    break;
                }
        }
        this.d = N;
        if (!N) {
            if (this.f11058e) {
                MessagesController.getInstance(this.f11055a).sendTyping(this.f11056b, this.f11057c, 2, 0);
            }
            this.f11059f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f11059f == -1) {
                this.f11059f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f11059f > 2000) {
                this.f11058e = true;
                this.f11059f = System.currentTimeMillis();
                MessagesController.getInstance(this.f11055a).sendTyping(this.f11056b, this.f11057c, 10, 0);
            }
        }
    }
}
