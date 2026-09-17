package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class p6 implements Runnable {
    public final int f18680a;
    public final int f18681b;
    public final int f18682c;
    public final Object d;

    public p6(int i10, int i11, String str) {
        this.f18680a = 3;
        this.f18681b = i10;
        this.f18682c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18680a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f18681b, this.f18682c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f18681b, this.f18682c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$43(this.f18681b, this.f18682c);
                return;
            default:
                PushListenerController.d(this.f18681b, this.f18682c, (String) this.d);
                return;
        }
    }

    public p6(Object obj, int i10, int i11, int i12) {
        this.f18680a = i12;
        this.d = obj;
        this.f18681b = i10;
        this.f18682c = i11;
    }
}
