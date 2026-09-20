package org.telegram.messenger;
public final class hd implements Runnable {
    public final int f16552a;
    public final long f16553b;
    public final long f16554c;
    public final BaseController d;

    public hd(BaseController baseController, long j3, long j10, int i10) {
        this.f16552a = i10;
        this.d = baseController;
        this.f16553b = j3;
        this.f16554c = j10;
    }

    @Override
    public final void run() {
        switch (this.f16552a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f16553b, this.f16554c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f16553b, this.f16554c);
                return;
        }
    }
}
