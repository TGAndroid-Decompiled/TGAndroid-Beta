package org.telegram.messenger;
public final class gd implements Runnable {
    public final int f16464a;
    public final long f16465b;
    public final long f16466c;
    public final BaseController d;

    public gd(BaseController baseController, long j3, long j10, int i10) {
        this.f16464a = i10;
        this.d = baseController;
        this.f16465b = j3;
        this.f16466c = j10;
    }

    @Override
    public final void run() {
        switch (this.f16464a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f16465b, this.f16466c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f16465b, this.f16466c);
                return;
        }
    }
}
