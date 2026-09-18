package org.telegram.messenger;
public final class hd implements Runnable {
    public final int f16506a;
    public final long f16507b;
    public final long f16508c;
    public final BaseController d;

    public hd(BaseController baseController, long j3, long j10, int i10) {
        this.f16506a = i10;
        this.d = baseController;
        this.f16507b = j3;
        this.f16508c = j10;
    }

    @Override
    public final void run() {
        switch (this.f16506a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f16507b, this.f16508c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f16507b, this.f16508c);
                return;
        }
    }
}
