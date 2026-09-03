package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class u6 implements Runnable {
    public final int f20171a;
    public final int f20172b;
    public final int f20173c;
    public final Object d;

    public u6(int i10, int i11, String str) {
        this.f20171a = 3;
        this.f20172b = i10;
        this.f20173c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f20171a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f20172b, this.f20173c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f20172b, this.f20173c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$43(this.f20172b, this.f20173c);
                return;
            default:
                PushListenerController.d(this.f20172b, this.f20173c, (String) this.d);
                return;
        }
    }

    public u6(Object obj, int i10, int i11, int i12) {
        this.f20171a = i12;
        this.d = obj;
        this.f20172b = i10;
        this.f20173c = i11;
    }
}
