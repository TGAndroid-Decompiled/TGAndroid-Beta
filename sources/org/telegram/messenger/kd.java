package org.telegram.messenger;
public final class kd implements Runnable {
    public final int f17669a;
    public final long f17670b;
    public final long f17671c;
    public final BaseController d;

    public kd(BaseController baseController, long j10, long j11, int i10) {
        this.f17669a = i10;
        this.d = baseController;
        this.f17670b = j10;
        this.f17671c = j11;
    }

    @Override
    public final void run() {
        switch (this.f17669a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$240(this.f17670b, this.f17671c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$3(this.f17670b, this.f17671c);
                return;
        }
    }
}
