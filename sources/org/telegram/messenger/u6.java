package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class u6 implements Runnable {
    public final int f18258a;
    public final int f18259b;
    public final int f18260c;
    public final Object d;

    public u6(int i10, int i11, String str) {
        this.f18258a = 3;
        this.f18259b = i10;
        this.f18260c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18258a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f18259b, this.f18260c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f18259b, this.f18260c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$44(this.f18259b, this.f18260c);
                return;
            default:
                PushListenerController.d(this.f18259b, this.f18260c, (String) this.d);
                return;
        }
    }

    public u6(Object obj, int i10, int i11, int i12) {
        this.f18258a = i12;
        this.d = obj;
        this.f18259b = i10;
        this.f18260c = i11;
    }
}
