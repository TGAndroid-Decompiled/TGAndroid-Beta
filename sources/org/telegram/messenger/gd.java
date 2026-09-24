package org.telegram.messenger;
public final class gd implements Runnable {
    public final int f16453a;
    public final long f16454b;
    public final long f16455c;
    public final BaseController d;

    public gd(BaseController baseController, long j3, long j10, int i10) {
        this.f16453a = i10;
        this.d = baseController;
        this.f16454b = j3;
        this.f16455c = j10;
    }

    @Override
    public final void run() {
        switch (this.f16453a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f16454b, this.f16455c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f16454b, this.f16455c);
                return;
        }
    }
}
