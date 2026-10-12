package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class u6 implements Runnable {
    public final int f19068a;
    public final int f19069b;
    public final int f19070c;
    public final Object d;

    public u6(int i10, int i11, String str) {
        this.f19068a = 3;
        this.f19069b = i10;
        this.f19070c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19068a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f19069b, this.f19070c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f19069b, this.f19070c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$44(this.f19069b, this.f19070c);
                return;
            default:
                PushListenerController.d(this.f19069b, this.f19070c, (String) this.d);
                return;
        }
    }

    public u6(Object obj, int i10, int i11, int i12) {
        this.f19068a = i12;
        this.d = obj;
        this.f19069b = i10;
        this.f19070c = i11;
    }
}
