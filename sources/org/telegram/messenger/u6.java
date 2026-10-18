package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class u6 implements Runnable {
    public final int f19629a;
    public final int f19630b;
    public final int f19631c;
    public final Object d;

    public u6(int i10, int i11, String str) {
        this.f19629a = 3;
        this.f19630b = i10;
        this.f19631c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19629a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f19630b, this.f19631c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f19630b, this.f19631c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$44(this.f19630b, this.f19631c);
                return;
            default:
                PushListenerController.lambda$sendRegistrationToServer$0(this.f19630b, this.f19631c, (String) this.d);
                return;
        }
    }

    public u6(Object obj, int i10, int i11, int i12) {
        this.f19629a = i12;
        this.d = obj;
        this.f19630b = i10;
        this.f19631c = i11;
    }
}
