package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class q6 implements Runnable {
    public final int f18760a;
    public final int f18761b;
    public final int f18762c;
    public final Object d;

    public q6(int i10, int i11, String str) {
        this.f18760a = 3;
        this.f18761b = i10;
        this.f18762c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18760a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f18761b, this.f18762c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f18761b, this.f18762c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$43(this.f18761b, this.f18762c);
                return;
            default:
                PushListenerController.d(this.f18761b, this.f18762c, (String) this.d);
                return;
        }
    }

    public q6(Object obj, int i10, int i11, int i12) {
        this.f18760a = i12;
        this.d = obj;
        this.f18761b = i10;
        this.f18762c = i11;
    }
}
