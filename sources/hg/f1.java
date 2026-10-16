package hg;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.wz;
public final class f1 {
    public final int f10555a;
    public final long f10556b;
    public final long f10557c;
    public boolean e;
    public final int f10559g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f10558f = -1;

    public f1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j10, long j11, int i11) {
        this.f10559g = i11;
        this.h = notificationCenterDelegate;
        this.f10555a = i10;
        this.f10556b = j10;
        this.f10557c = j11;
    }

    public final void a() {
        boolean N;
        switch (this.f10559g) {
            case 0:
                N = ((j1) this.h).N();
                break;
            default:
                wz wzVar = (wz) this.h;
                if (wzVar.f30760t1 != null && wzVar.getVisibility() == 0 && wzVar.K0) {
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
                MessagesController.getInstance(this.f10555a).sendTyping(this.f10556b, this.f10557c, 2, 0);
            }
            this.f10558f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f10558f == -1) {
                this.f10558f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f10558f > 2000) {
                this.e = true;
                this.f10558f = System.currentTimeMillis();
                MessagesController.getInstance(this.f10555a).sendTyping(this.f10556b, this.f10557c, 10, 0);
            }
        }
    }
}
