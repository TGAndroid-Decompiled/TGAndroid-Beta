package hg;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.kz;
public final class g1 {
    public final int f11081a;
    public final long f11082b;
    public final long f11083c;
    public boolean f11084e;
    public final int f11086g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f11085f = -1;

    public g1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j3, long j10, int i11) {
        this.f11086g = i11;
        this.h = notificationCenterDelegate;
        this.f11081a = i10;
        this.f11082b = j3;
        this.f11083c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.f11086g) {
            case 0:
                N = ((k1) this.h).N();
                break;
            default:
                kz kzVar = (kz) this.h;
                if (kzVar.f28013t1 != null && kzVar.getVisibility() == 0 && kzVar.K0) {
                    N = true;
                    break;
                } else {
                    N = false;
                    break;
                }
        }
        this.d = N;
        if (!N) {
            if (this.f11084e) {
                MessagesController.getInstance(this.f11081a).sendTyping(this.f11082b, this.f11083c, 2, 0);
            }
            this.f11085f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f11085f == -1) {
                this.f11085f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f11085f > 2000) {
                this.f11084e = true;
                this.f11085f = System.currentTimeMillis();
                MessagesController.getInstance(this.f11081a).sendTyping(this.f11082b, this.f11083c, 10, 0);
            }
        }
    }
}
