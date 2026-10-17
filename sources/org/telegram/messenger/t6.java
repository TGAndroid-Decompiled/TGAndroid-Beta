package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class t6 implements Runnable {
    public final int f19547a;
    public final int f19548b;
    public final int f19549c;
    public final Object d;

    public t6(int i10, int i11, String str) {
        this.f19547a = 3;
        this.f19548b = i10;
        this.f19549c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19547a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f19548b, this.f19549c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f19548b, this.f19549c);
                return;
            case 2:
                NotificationsController.m((NotificationsController) this.d, this.f19548b, this.f19549c);
                return;
            default:
                PushListenerController.lambda$sendRegistrationToServer$0(this.f19548b, this.f19549c, (String) this.d);
                return;
        }
    }

    public t6(Object obj, int i10, int i11, int i12) {
        this.f19547a = i12;
        this.d = obj;
        this.f19548b = i10;
        this.f19549c = i11;
    }
}
