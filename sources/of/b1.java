package of;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.wy;
public final class b1 {
    public final int f19247a;
    public final long f19248b;
    public final long f19249c;
    public boolean f19250e;
    public final int f19252g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f19251f = -1;

    public b1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9, long j10, long j11, int i10) {
        this.f19252g = i10;
        this.h = notificationCenterDelegate;
        this.f19247a = i9;
        this.f19248b = j10;
        this.f19249c = j11;
    }

    public final void a() {
        boolean N;
        switch (this.f19252g) {
            case 0:
                N = ((f1) this.h).N();
                break;
            default:
                wy wyVar = (wy) this.h;
                if (wyVar.f34432p1 != null && wyVar.getVisibility() == 0 && wyVar.G0) {
                    N = true;
                    break;
                } else {
                    N = false;
                    break;
                }
        }
        this.d = N;
        if (!N) {
            if (this.f19250e) {
                MessagesController.getInstance(this.f19247a).sendTyping(this.f19248b, this.f19249c, 2, 0);
            }
            this.f19251f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f19251f == -1) {
                this.f19251f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f19251f > 2000) {
                this.f19250e = true;
                this.f19251f = System.currentTimeMillis();
                MessagesController.getInstance(this.f19247a).sendTyping(this.f19248b, this.f19249c, 10, 0);
            }
        }
    }
}
