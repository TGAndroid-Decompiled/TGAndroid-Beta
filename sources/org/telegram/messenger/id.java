package org.telegram.messenger;
public final class id implements Runnable {
    public final int f18597a;
    public final long f18598b;
    public final long f18599c;
    public final BaseController d;

    public id(BaseController baseController, long j10, long j11, int i10) {
        this.f18597a = i10;
        this.d = baseController;
        this.f18598b = j10;
        this.f18599c = j11;
    }

    @Override
    public final void run() {
        switch (this.f18597a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f18598b, this.f18599c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f18598b, this.f18599c);
                return;
        }
    }
}
