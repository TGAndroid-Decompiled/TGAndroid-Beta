package org.telegram.messenger;
public final class md implements Runnable {
    public final int f19030a;
    public final long f19031b;
    public final long f19032c;
    public final BaseController d;

    public md(BaseController baseController, long j10, long j11, int i10) {
        this.f19030a = i10;
        this.d = baseController;
        this.f19031b = j10;
        this.f19032c = j11;
    }

    @Override
    public final void run() {
        switch (this.f19030a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f19031b, this.f19032c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f19031b, this.f19032c);
                return;
        }
    }
}
