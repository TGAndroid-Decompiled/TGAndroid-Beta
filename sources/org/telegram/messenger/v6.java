package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class v6 implements Runnable {
    public final int f19719a;
    public final int f19720b;
    public final int f19721c;
    public final Object d;

    public v6(int i10, int i11, String str) {
        this.f19719a = 3;
        this.f19720b = i10;
        this.f19721c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19719a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f19720b, this.f19721c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f19720b, this.f19721c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$44(this.f19720b, this.f19721c);
                return;
            default:
                PushListenerController.lambda$sendRegistrationToServer$0(this.f19720b, this.f19721c, (String) this.d);
                return;
        }
    }

    public v6(Object obj, int i10, int i11, int i12) {
        this.f19719a = i12;
        this.d = obj;
        this.f19720b = i10;
        this.f19721c = i11;
    }
}
