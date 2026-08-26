package org.telegram.messenger;

public final class MessagesController$$ExternalSyntheticLambda422 implements Runnable {
    public final int $r8$classId;
    public final BaseController f$0;
    public final long f$1;
    public final long f$2;

    public MessagesController$$ExternalSyntheticLambda422(BaseController baseController, long j, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = baseController;
        this.f$1 = j;
        this.f$2 = j2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesController) this.f$0).lambda$markDialogAsReadNow$240(this.f$1, this.f$2);
                break;
            default:
                ((NotificationsController) this.f$0).lambda$setOpenedDialogId$3(this.f$1, this.f$2);
                break;
        }
    }
}
