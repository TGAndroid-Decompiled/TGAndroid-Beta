package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class p6 implements Runnable {
    public final int f21206a;
    public final int f21207b;
    public final int f21208c;
    public final Object d;

    public p6(int i9, int i10, String str) {
        this.f21206a = 3;
        this.f21207b = i9;
        this.f21208c = i10;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f21206a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f21207b, this.f21208c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f21207b, this.f21208c);
                return;
            case 2:
                NotificationsController.c0((NotificationsController) this.d, this.f21207b, this.f21208c);
                return;
            default:
                PushListenerController.lambda$sendRegistrationToServer$0(this.f21207b, this.f21208c, (String) this.d);
                return;
        }
    }

    public p6(Object obj, int i9, int i10, int i11) {
        this.f21206a = i11;
        this.d = obj;
        this.f21207b = i9;
        this.f21208c = i10;
    }
}
