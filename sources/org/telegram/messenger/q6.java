package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class q6 implements Runnable {
    public final int f18958a;
    public final int f18959b;
    public final int f18960c;
    public final Object d;

    public q6(int i10, int i11, String str) {
        this.f18958a = 3;
        this.f18959b = i10;
        this.f18960c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18958a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f18959b, this.f18960c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f18959b, this.f18960c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$43(this.f18959b, this.f18960c);
                return;
            default:
                PushListenerController.d(this.f18959b, this.f18960c, (String) this.d);
                return;
        }
    }

    public q6(Object obj, int i10, int i11, int i12) {
        this.f18958a = i12;
        this.d = obj;
        this.f18959b = i10;
        this.f18960c = i11;
    }
}
