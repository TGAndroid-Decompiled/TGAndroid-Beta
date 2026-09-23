package org.telegram.messenger;
public final class gd implements Runnable {
    public final int f16209a;
    public final long f16210b;
    public final long f16211c;
    public final BaseController d;

    public gd(BaseController baseController, long j3, long j10, int i10) {
        this.f16209a = i10;
        this.d = baseController;
        this.f16210b = j3;
        this.f16211c = j10;
    }

    @Override
    public final void run() {
        switch (this.f16209a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f16210b, this.f16211c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f16210b, this.f16211c);
                return;
        }
    }
}
