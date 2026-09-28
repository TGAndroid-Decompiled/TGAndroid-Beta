package org.telegram.messenger;
public final class gd implements Runnable {
    public final int f16475a;
    public final long f16476b;
    public final long f16477c;
    public final BaseController d;

    public gd(BaseController baseController, long j3, long j10, int i10) {
        this.f16475a = i10;
        this.d = baseController;
        this.f16476b = j3;
        this.f16477c = j10;
    }

    @Override
    public final void run() {
        switch (this.f16475a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f16476b, this.f16477c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f16476b, this.f16477c);
                return;
        }
    }
}
