package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class w6 implements Runnable {
    public final int f16839a;
    public final int f16840b;
    public final int f16841c;
    public final Object d;

    public w6(int i10, int i11, String str) {
        this.f16839a = 3;
        this.f16840b = i10;
        this.f16841c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16839a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f16840b, this.f16841c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f16840b, this.f16841c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$43(this.f16840b, this.f16841c);
                return;
            default:
                PushListenerController.lambda$sendRegistrationToServer$0(this.f16840b, this.f16841c, (String) this.d);
                return;
        }
    }

    public w6(Object obj, int i10, int i11, int i12) {
        this.f16839a = i12;
        this.d = obj;
        this.f16840b = i10;
        this.f16841c = i11;
    }
}
