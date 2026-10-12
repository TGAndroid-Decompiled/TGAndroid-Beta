package gg;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.d00;
public final class f1 {
    public final int f10590a;
    public final long f10591b;
    public final long f10592c;
    public boolean f10593e;
    public final int f10595g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f10594f = -1;

    public f1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j3, long j10, int i11) {
        this.f10595g = i11;
        this.h = notificationCenterDelegate;
        this.f10590a = i10;
        this.f10591b = j3;
        this.f10592c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.f10595g) {
            case 0:
                N = ((j1) this.h).N();
                break;
            default:
                d00 d00Var = (d00) this.h;
                if (d00Var.f25134t1 != null && d00Var.getVisibility() == 0 && d00Var.K0) {
                    N = true;
                    break;
                } else {
                    N = false;
                    break;
                }
        }
        this.d = N;
        if (!N) {
            if (this.f10593e) {
                MessagesController.getInstance(this.f10590a).sendTyping(this.f10591b, this.f10592c, 2, 0);
            }
            this.f10594f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f10594f == -1) {
                this.f10594f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f10594f > 2000) {
                this.f10593e = true;
                this.f10594f = System.currentTimeMillis();
                MessagesController.getInstance(this.f10590a).sendTyping(this.f10591b, this.f10592c, 10, 0);
            }
        }
    }
}
