package org.telegram.messenger;
public final class hd implements Runnable {
    public final int f16336a;
    public final long f16337b;
    public final long f16338c;
    public final BaseController d;

    public hd(BaseController baseController, long j3, long j10, int i10) {
        this.f16336a = i10;
        this.d = baseController;
        this.f16337b = j3;
        this.f16338c = j10;
    }

    @Override
    public final void run() {
        switch (this.f16336a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f16337b, this.f16338c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f16337b, this.f16338c);
                return;
        }
    }
}
