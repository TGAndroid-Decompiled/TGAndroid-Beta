package gg;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.b00;
public final class f1 {
    public final int f10591a;
    public final long f10592b;
    public final long f10593c;
    public boolean f10594e;
    public final int f10596g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f10595f = -1;

    public f1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j3, long j10, int i11) {
        this.f10596g = i11;
        this.h = notificationCenterDelegate;
        this.f10591a = i10;
        this.f10592b = j3;
        this.f10593c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.f10596g) {
            case 0:
                N = ((j1) this.h).N();
                break;
            default:
                b00 b00Var = (b00) this.h;
                if (b00Var.f24785t1 != null && b00Var.getVisibility() == 0 && b00Var.K0) {
                    N = true;
                    break;
                } else {
                    N = false;
                    break;
                }
        }
        this.d = N;
        if (!N) {
            if (this.f10594e) {
                MessagesController.getInstance(this.f10591a).sendTyping(this.f10592b, this.f10593c, 2, 0);
            }
            this.f10595f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f10595f == -1) {
                this.f10595f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f10595f > 2000) {
                this.f10594e = true;
                this.f10595f = System.currentTimeMillis();
                MessagesController.getInstance(this.f10591a).sendTyping(this.f10592b, this.f10593c, 10, 0);
            }
        }
    }
}
