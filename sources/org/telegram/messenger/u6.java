package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class u6 implements Runnable {
    public final int f18557a;
    public final int f18558b;
    public final int f18559c;
    public final Object d;

    public u6(int i10, int i11, String str) {
        this.f18557a = 3;
        this.f18558b = i10;
        this.f18559c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18557a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f18558b, this.f18559c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f18558b, this.f18559c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$44(this.f18558b, this.f18559c);
                return;
            default:
                PushListenerController.d(this.f18558b, this.f18559c, (String) this.d);
                return;
        }
    }

    public u6(Object obj, int i10, int i11, int i12) {
        this.f18557a = i12;
        this.d = obj;
        this.f18558b = i10;
        this.f18559c = i11;
    }
}
