package org.telegram.messenger;
public final class md implements Runnable {
    public final int f17564a;
    public final long f17565b;
    public final long f17566c;
    public final BaseController d;

    public md(BaseController baseController, long j10, long j11, int i10) {
        this.f17564a = i10;
        this.d = baseController;
        this.f17565b = j10;
        this.f17566c = j11;
    }

    @Override
    public final void run() {
        switch (this.f17564a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f17565b, this.f17566c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f17565b, this.f17566c);
                return;
        }
    }
}
