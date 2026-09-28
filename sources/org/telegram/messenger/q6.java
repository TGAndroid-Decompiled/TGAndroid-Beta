package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class q6 implements Runnable {
    public final int f17360a;
    public final int f17361b;
    public final int f17362c;
    public final Object d;

    public q6(int i10, int i11, String str) {
        this.f17360a = 3;
        this.f17361b = i10;
        this.f17362c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17360a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f17361b, this.f17362c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f17361b, this.f17362c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$43(this.f17361b, this.f17362c);
                return;
            default:
                PushListenerController.d(this.f17361b, this.f17362c, (String) this.d);
                return;
        }
    }

    public q6(Object obj, int i10, int i11, int i12) {
        this.f17360a = i12;
        this.d = obj;
        this.f17361b = i10;
        this.f17362c = i11;
    }
}
