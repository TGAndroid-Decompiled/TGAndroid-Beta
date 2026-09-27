package gg;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.mz;
public final class g1 {
    public final int f9727a;
    public final long f9728b;
    public final long f9729c;
    public boolean e;
    public final int f9731g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f9730f = -1;

    public g1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j3, long j10, int i11) {
        this.f9731g = i11;
        this.h = notificationCenterDelegate;
        this.f9727a = i10;
        this.f9728b = j3;
        this.f9729c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.f9731g) {
            case 0:
                N = ((k1) this.h).N();
                break;
            default:
                mz mzVar = (mz) this.h;
                if (mzVar.f26627t1 != null && mzVar.getVisibility() == 0 && mzVar.K0) {
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
                MessagesController.getInstance(this.f9727a).sendTyping(this.f9728b, this.f9729c, 2, 0);
            }
            this.f9730f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f9730f == -1) {
                this.f9730f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f9730f > 2000) {
                this.e = true;
                this.f9730f = System.currentTimeMillis();
                MessagesController.getInstance(this.f9727a).sendTyping(this.f9728b, this.f9729c, 10, 0);
            }
        }
    }
}
