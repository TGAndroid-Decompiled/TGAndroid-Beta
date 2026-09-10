package fg;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.rz;
public final class h1 {
    public final int f8061a;
    public final long f8062b;
    public final long f8063c;
    public boolean e;
    public final int f8065g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f8064f = -1;

    public h1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j3, long j10, int i11) {
        this.f8065g = i11;
        this.h = notificationCenterDelegate;
        this.f8061a = i10;
        this.f8062b = j3;
        this.f8063c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.f8065g) {
            case 0:
                N = ((l1) this.h).N();
                break;
            default:
                rz rzVar = (rz) this.h;
                if (rzVar.f26858t1 != null && rzVar.getVisibility() == 0 && rzVar.K0) {
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
                MessagesController.getInstance(this.f8061a).sendTyping(this.f8062b, this.f8063c, 2, 0);
            }
            this.f8064f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f8064f == -1) {
                this.f8064f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f8064f > 2000) {
                this.e = true;
                this.f8064f = System.currentTimeMillis();
                MessagesController.getInstance(this.f8061a).sendTyping(this.f8062b, this.f8063c, 10, 0);
            }
        }
    }
}
