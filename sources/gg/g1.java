package gg;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.nz;
public final class g1 {
    public final int f10586a;
    public final long f10587b;
    public final long f10588c;
    public boolean f10589e;
    public final int f10591g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f10590f = -1;

    public g1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j3, long j10, int i11) {
        this.f10591g = i11;
        this.h = notificationCenterDelegate;
        this.f10586a = i10;
        this.f10587b = j3;
        this.f10588c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.f10591g) {
            case 0:
                N = ((k1) this.h).N();
                break;
            default:
                nz nzVar = (nz) this.h;
                if (nzVar.f29248t1 != null && nzVar.getVisibility() == 0 && nzVar.K0) {
                    N = true;
                    break;
                } else {
                    N = false;
                    break;
                }
        }
        this.d = N;
        if (!N) {
            if (this.f10589e) {
                MessagesController.getInstance(this.f10586a).sendTyping(this.f10587b, this.f10588c, 2, 0);
            }
            this.f10590f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f10590f == -1) {
                this.f10590f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f10590f > 2000) {
                this.f10589e = true;
                this.f10590f = System.currentTimeMillis();
                MessagesController.getInstance(this.f10586a).sendTyping(this.f10587b, this.f10588c, 10, 0);
            }
        }
    }
}
