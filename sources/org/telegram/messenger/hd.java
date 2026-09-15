package org.telegram.messenger;
public final class hd implements Runnable {
    public final int f16327a;
    public final long f16328b;
    public final long f16329c;
    public final BaseController d;

    public hd(BaseController baseController, long j3, long j10, int i10) {
        this.f16327a = i10;
        this.d = baseController;
        this.f16328b = j3;
        this.f16329c = j10;
    }

    @Override
    public final void run() {
        switch (this.f16327a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f16328b, this.f16329c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f16328b, this.f16329c);
                return;
        }
    }
}
