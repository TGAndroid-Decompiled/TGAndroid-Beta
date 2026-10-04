package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class q6 implements Runnable {
    public final int f18953a;
    public final int f18954b;
    public final int f18955c;
    public final Object d;

    public q6(int i10, int i11, String str) {
        this.f18953a = 3;
        this.f18954b = i10;
        this.f18955c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18953a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f18954b, this.f18955c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f18954b, this.f18955c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$43(this.f18954b, this.f18955c);
                return;
            default:
                PushListenerController.d(this.f18954b, this.f18955c, (String) this.d);
                return;
        }
    }

    public q6(Object obj, int i10, int i11, int i12) {
        this.f18953a = i12;
        this.d = obj;
        this.f18954b = i10;
        this.f18955c = i11;
    }
}
