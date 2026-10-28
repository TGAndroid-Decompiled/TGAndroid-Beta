package ig;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.sz;
public final class f1 {
    public final int f14053a;
    public final long f14054b;
    public final long f14055c;
    public boolean e;
    public final int f14057g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f14056f = -1;

    public f1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j10, long j11, int i11) {
        this.f14057g = i11;
        this.h = notificationCenterDelegate;
        this.f14053a = i10;
        this.f14054b = j10;
        this.f14055c = j11;
    }

    public final void a() {
        boolean N;
        switch (this.f14057g) {
            case 0:
                N = ((j1) this.h).N();
                break;
            default:
                sz szVar = (sz) this.h;
                if (szVar.f32766t1 != null && szVar.getVisibility() == 0 && szVar.K0) {
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
                MessagesController.getInstance(this.f14053a).sendTyping(this.f14054b, this.f14055c, 2, 0);
            }
            this.f14056f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f14056f == -1) {
                this.f14056f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f14056f > 2000) {
                this.e = true;
                this.f14056f = System.currentTimeMillis();
                MessagesController.getInstance(this.f14053a).sendTyping(this.f14054b, this.f14055c, 10, 0);
            }
        }
    }
}
