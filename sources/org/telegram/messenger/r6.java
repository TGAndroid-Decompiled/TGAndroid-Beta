package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f19055a;
    public final int f19056b;
    public final int f19057c;
    public final Object d;

    public r6(int i10, int i11, String str) {
        this.f19055a = 3;
        this.f19056b = i10;
        this.f19057c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19055a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f19056b, this.f19057c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f19056b, this.f19057c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$44(this.f19056b, this.f19057c);
                return;
            default:
                PushListenerController.d(this.f19056b, this.f19057c, (String) this.d);
                return;
        }
    }

    public r6(Object obj, int i10, int i11, int i12) {
        this.f19055a = i12;
        this.d = obj;
        this.f19056b = i10;
        this.f19057c = i11;
    }
}
