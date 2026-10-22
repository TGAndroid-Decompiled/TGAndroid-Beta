package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class y6 implements Runnable {
    public final int f20126a;
    public final int f20127b;
    public final int f20128c;
    public final Object d;

    public y6(int i10, int i11, String str) {
        this.f20126a = 3;
        this.f20127b = i10;
        this.f20128c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f20126a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f20127b, this.f20128c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f20127b, this.f20128c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$44(this.f20127b, this.f20128c);
                return;
            default:
                PushListenerController.lambda$sendRegistrationToServer$0(this.f20127b, this.f20128c, (String) this.d);
                return;
        }
    }

    public y6(Object obj, int i10, int i11, int i12) {
        this.f20126a = i12;
        this.d = obj;
        this.f20127b = i10;
        this.f20128c = i11;
    }
}
