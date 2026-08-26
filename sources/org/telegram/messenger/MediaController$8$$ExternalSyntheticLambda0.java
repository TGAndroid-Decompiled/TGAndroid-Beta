package org.telegram.messenger;

public final class MediaController$8$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final int f$2;

    public MediaController$8$$ExternalSyntheticLambda0(int i, int i2, String str) {
        this.$r8$classId = 3;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$0 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MediaController.AnonymousClass8) this.f$0).lambda$onStateChanged$0(this.f$1, this.f$2);
                break;
            case 1:
                ((MediaDataController) this.f$0).lambda$processLoadedStickers$106(this.f$1, this.f$2);
                break;
            case 2:
                ((NotificationsController) this.f$0).lambda$deleteNotificationChannelGlobal$43(this.f$1, this.f$2);
                break;
            default:
                PushListenerController.lambda$sendRegistrationToServer$0(this.f$1, this.f$2, (String) this.f$0);
                break;
        }
    }

    public MediaController$8$$ExternalSyntheticLambda0(Object obj, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = i2;
    }
}
