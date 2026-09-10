package org.telegram.messenger;
public final class pd implements Runnable {
    public final int f16053a;
    public final long f16054b;
    public final long f16055c;
    public final BaseController d;

    public pd(BaseController baseController, long j3, long j10, int i10) {
        this.f16053a = i10;
        this.d = baseController;
        this.f16054b = j3;
        this.f16055c = j10;
    }

    @Override
    public final void run() {
        switch (this.f16053a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f16054b, this.f16055c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f16054b, this.f16055c);
                return;
        }
    }
}
