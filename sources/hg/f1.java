package hg;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.wz;
public final class f1 {
    public final int f10551a;
    public final long f10552b;
    public final long f10553c;
    public boolean e;
    public final int f10555g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f10554f = -1;

    public f1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j10, long j11, int i11) {
        this.f10555g = i11;
        this.h = notificationCenterDelegate;
        this.f10551a = i10;
        this.f10552b = j10;
        this.f10553c = j11;
    }

    public final void a() {
        boolean N;
        switch (this.f10555g) {
            case 0:
                N = ((j1) this.h).N();
                break;
            default:
                wz wzVar = (wz) this.h;
                if (wzVar.f31067t1 != null && wzVar.getVisibility() == 0 && wzVar.K0) {
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
                MessagesController.getInstance(this.f10551a).sendTyping(this.f10552b, this.f10553c, 2, 0);
            }
            this.f10554f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f10554f == -1) {
                this.f10554f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f10554f > 2000) {
                this.e = true;
                this.f10554f = System.currentTimeMillis();
                MessagesController.getInstance(this.f10551a).sendTyping(this.f10552b, this.f10553c, 10, 0);
            }
        }
    }
}
