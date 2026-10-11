package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f19019a;
    public final int f19020b;
    public final int f19021c;
    public final Object d;

    public r6(int i10, int i11, String str) {
        this.f19019a = 3;
        this.f19020b = i10;
        this.f19021c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19019a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f19020b, this.f19021c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f19020b, this.f19021c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$44(this.f19020b, this.f19021c);
                return;
            default:
                PushListenerController.d(this.f19020b, this.f19021c, (String) this.d);
                return;
        }
    }

    public r6(Object obj, int i10, int i11, int i12) {
        this.f19019a = i12;
        this.d = obj;
        this.f19020b = i10;
        this.f19021c = i11;
    }
}
