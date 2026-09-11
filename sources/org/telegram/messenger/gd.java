package org.telegram.messenger;
public final class gd implements Runnable {
    public final int f17795a;
    public final long f17796b;
    public final long f17797c;
    public final BaseController d;

    public gd(BaseController baseController, long j3, long j10, int i10) {
        this.f17795a = i10;
        this.d = baseController;
        this.f17796b = j3;
        this.f17797c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17795a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f17796b, this.f17797c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f17796b, this.f17797c);
                return;
        }
    }
}
