package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f19016a;
    public final int f19017b;
    public final int f19018c;
    public final Object d;

    public r6(int i10, int i11, String str) {
        this.f19016a = 3;
        this.f19017b = i10;
        this.f19018c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19016a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f19017b, this.f19018c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f19017b, this.f19018c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$44(this.f19017b, this.f19018c);
                return;
            default:
                PushListenerController.d(this.f19017b, this.f19018c, (String) this.d);
                return;
        }
    }

    public r6(Object obj, int i10, int i11, int i12) {
        this.f19016a = i12;
        this.d = obj;
        this.f19017b = i10;
        this.f19018c = i11;
    }
}
