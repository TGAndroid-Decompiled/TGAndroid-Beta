package gg;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.a00;
public final class f1 {
    public final int f10592a;
    public final long f10593b;
    public final long f10594c;
    public boolean f10595e;
    public final int f10597g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f10596f = -1;

    public f1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j3, long j10, int i11) {
        this.f10597g = i11;
        this.h = notificationCenterDelegate;
        this.f10592a = i10;
        this.f10593b = j3;
        this.f10594c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.f10597g) {
            case 0:
                N = ((j1) this.h).N();
                break;
            default:
                a00 a00Var = (a00) this.h;
                if (a00Var.f24455t1 != null && a00Var.getVisibility() == 0 && a00Var.K0) {
                    N = true;
                    break;
                } else {
                    N = false;
                    break;
                }
        }
        this.d = N;
        if (!N) {
            if (this.f10595e) {
                MessagesController.getInstance(this.f10592a).sendTyping(this.f10593b, this.f10594c, 2, 0);
            }
            this.f10596f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f10596f == -1) {
                this.f10596f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f10596f > 2000) {
                this.f10595e = true;
                this.f10596f = System.currentTimeMillis();
                MessagesController.getInstance(this.f10592a).sendTyping(this.f10593b, this.f10594c, 10, 0);
            }
        }
    }
}
