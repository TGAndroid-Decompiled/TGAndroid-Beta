package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class t6 implements Runnable {
    public final int f19553a;
    public final int f19554b;
    public final int f19555c;
    public final Object d;

    public t6(int i10, int i11, String str) {
        this.f19553a = 3;
        this.f19554b = i10;
        this.f19555c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19553a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f19554b, this.f19555c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f19554b, this.f19555c);
                return;
            case 2:
                NotificationsController.m((NotificationsController) this.d, this.f19554b, this.f19555c);
                return;
            default:
                PushListenerController.lambda$sendRegistrationToServer$0(this.f19554b, this.f19555c, (String) this.d);
                return;
        }
    }

    public t6(Object obj, int i10, int i11, int i12) {
        this.f19553a = i12;
        this.d = obj;
        this.f19554b = i10;
        this.f19555c = i11;
    }
}
