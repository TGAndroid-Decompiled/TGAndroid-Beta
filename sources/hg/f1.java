package hg;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.tz;
public final class f1 {
    public final int f11859a;
    public final long f11860b;
    public final long f11861c;
    public boolean e;
    public final int f11863g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f11862f = -1;

    public f1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j10, long j11, int i11) {
        this.f11863g = i11;
        this.h = notificationCenterDelegate;
        this.f11859a = i10;
        this.f11860b = j10;
        this.f11861c = j11;
    }

    public final void a() {
        boolean N;
        switch (this.f11863g) {
            case 0:
                N = ((j1) this.h).N();
                break;
            default:
                tz tzVar = (tz) this.h;
                if (tzVar.f30779t1 != null && tzVar.getVisibility() == 0 && tzVar.K0) {
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
                MessagesController.getInstance(this.f11859a).sendTyping(this.f11860b, this.f11861c, 2, 0);
            }
            this.f11862f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f11862f == -1) {
                this.f11862f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f11862f > 2000) {
                this.e = true;
                this.f11862f = System.currentTimeMillis();
                MessagesController.getInstance(this.f11859a).sendTyping(this.f11860b, this.f11861c, 10, 0);
            }
        }
    }
}
