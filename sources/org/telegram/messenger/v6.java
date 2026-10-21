package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class v6 implements Runnable {
    public final int f19716a;
    public final int f19717b;
    public final int f19718c;
    public final Object d;

    public v6(int i10, int i11, String str) {
        this.f19716a = 3;
        this.f19717b = i10;
        this.f19718c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19716a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f19717b, this.f19718c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f19717b, this.f19718c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$44(this.f19717b, this.f19718c);
                return;
            default:
                PushListenerController.lambda$sendRegistrationToServer$0(this.f19717b, this.f19718c, (String) this.d);
                return;
        }
    }

    public v6(Object obj, int i10, int i11, int i12) {
        this.f19716a = i12;
        this.d = obj;
        this.f19717b = i10;
        this.f19718c = i11;
    }
}
