package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class u6 implements Runnable {
    public final int f18564a;
    public final int f18565b;
    public final int f18566c;
    public final Object d;

    public u6(int i10, int i11, String str) {
        this.f18564a = 3;
        this.f18565b = i10;
        this.f18566c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18564a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f18565b, this.f18566c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f18565b, this.f18566c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$43(this.f18565b, this.f18566c);
                return;
            default:
                PushListenerController.d(this.f18565b, this.f18566c, (String) this.d);
                return;
        }
    }

    public u6(Object obj, int i10, int i11, int i12) {
        this.f18564a = i12;
        this.d = obj;
        this.f18565b = i10;
        this.f18566c = i11;
    }
}
