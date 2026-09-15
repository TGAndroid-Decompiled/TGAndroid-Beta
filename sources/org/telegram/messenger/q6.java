package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class q6 implements Runnable {
    public final int f17113a;
    public final int f17114b;
    public final int f17115c;
    public final Object d;

    public q6(int i10, int i11, String str) {
        this.f17113a = 3;
        this.f17114b = i10;
        this.f17115c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17113a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f17114b, this.f17115c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f17114b, this.f17115c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$43(this.f17114b, this.f17115c);
                return;
            default:
                PushListenerController.d(this.f17114b, this.f17115c, (String) this.d);
                return;
        }
    }

    public q6(Object obj, int i10, int i11, int i12) {
        this.f17113a = i12;
        this.d = obj;
        this.f17114b = i10;
        this.f17115c = i11;
    }
}
