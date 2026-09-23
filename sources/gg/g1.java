package gg;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.lz;
public final class g1 {
    public final int f9722a;
    public final long f9723b;
    public final long f9724c;
    public boolean e;
    public final int f9726g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f9725f = -1;

    public g1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j3, long j10, int i11) {
        this.f9726g = i11;
        this.h = notificationCenterDelegate;
        this.f9722a = i10;
        this.f9723b = j3;
        this.f9724c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.f9726g) {
            case 0:
                N = ((k1) this.h).N();
                break;
            default:
                lz lzVar = (lz) this.h;
                if (lzVar.f26021t1 != null && lzVar.getVisibility() == 0 && lzVar.K0) {
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
                MessagesController.getInstance(this.f9722a).sendTyping(this.f9723b, this.f9724c, 2, 0);
            }
            this.f9725f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f9725f == -1) {
                this.f9725f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f9725f > 2000) {
                this.e = true;
                this.f9725f = System.currentTimeMillis();
                MessagesController.getInstance(this.f9722a).sendTyping(this.f9723b, this.f9724c, 10, 0);
            }
        }
    }
}
