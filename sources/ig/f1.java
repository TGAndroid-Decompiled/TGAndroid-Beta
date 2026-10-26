package ig;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.sz;
public final class f1 {
    public final int f14054a;
    public final long f14055b;
    public final long f14056c;
    public boolean e;
    public final int f14058g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f14057f = -1;

    public f1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j10, long j11, int i11) {
        this.f14058g = i11;
        this.h = notificationCenterDelegate;
        this.f14054a = i10;
        this.f14055b = j10;
        this.f14056c = j11;
    }

    public final void a() {
        boolean N;
        switch (this.f14058g) {
            case 0:
                N = ((j1) this.h).N();
                break;
            default:
                sz szVar = (sz) this.h;
                if (szVar.f32772t1 != null && szVar.getVisibility() == 0 && szVar.K0) {
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
                MessagesController.getInstance(this.f14054a).sendTyping(this.f14055b, this.f14056c, 2, 0);
            }
            this.f14057f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f14057f == -1) {
                this.f14057f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f14057f > 2000) {
                this.e = true;
                this.f14057f = System.currentTimeMillis();
                MessagesController.getInstance(this.f14054a).sendTyping(this.f14055b, this.f14056c, 10, 0);
            }
        }
    }
}
