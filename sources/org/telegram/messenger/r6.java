package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f19012a;
    public final int f19013b;
    public final int f19014c;
    public final Object d;

    public r6(int i10, int i11, String str) {
        this.f19012a = 3;
        this.f19013b = i10;
        this.f19014c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19012a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f19013b, this.f19014c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f19013b, this.f19014c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$44(this.f19013b, this.f19014c);
                return;
            default:
                PushListenerController.d(this.f19013b, this.f19014c, (String) this.d);
                return;
        }
    }

    public r6(Object obj, int i10, int i11, int i12) {
        this.f19012a = i12;
        this.d = obj;
        this.f19013b = i10;
        this.f19014c = i11;
    }
}
