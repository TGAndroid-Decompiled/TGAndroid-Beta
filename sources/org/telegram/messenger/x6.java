package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class x6 implements Runnable {
    public final int f20053a;
    public final int f20054b;
    public final int f20055c;
    public final Object d;

    public x6(int i10, int i11, String str) {
        this.f20053a = 3;
        this.f20054b = i10;
        this.f20055c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f20053a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f20054b, this.f20055c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f20054b, this.f20055c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$44(this.f20054b, this.f20055c);
                return;
            default:
                PushListenerController.lambda$sendRegistrationToServer$0(this.f20054b, this.f20055c, (String) this.d);
                return;
        }
    }

    public x6(Object obj, int i10, int i11, int i12) {
        this.f20053a = i12;
        this.d = obj;
        this.f20054b = i10;
        this.f20055c = i11;
    }
}
