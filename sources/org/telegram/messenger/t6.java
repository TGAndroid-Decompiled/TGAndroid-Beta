package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class t6 implements Runnable {
    public final int f21620a;
    public final int f21621b;
    public final int f21622c;
    public final Object d;

    public t6(int i10, int i11, String str) {
        this.f21620a = 3;
        this.f21621b = i10;
        this.f21622c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f21620a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f21621b, this.f21622c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f21621b, this.f21622c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$43(this.f21621b, this.f21622c);
                return;
            default:
                PushListenerController.lambda$sendRegistrationToServer$0(this.f21621b, this.f21622c, (String) this.d);
                return;
        }
    }

    public t6(Object obj, int i10, int i11, int i12) {
        this.f21620a = i12;
        this.d = obj;
        this.f21621b = i10;
        this.f21622c = i11;
    }
}
