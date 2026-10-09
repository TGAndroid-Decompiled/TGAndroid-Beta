package org.telegram.messenger;
public final class jd implements Runnable {
    public final int f18255a;
    public final long f18256b;
    public final long f18257c;
    public final BaseController d;

    public jd(BaseController baseController, long j3, long j10, int i10) {
        this.f18255a = i10;
        this.d = baseController;
        this.f18256b = j3;
        this.f18257c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18255a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f18256b, this.f18257c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f18256b, this.f18257c);
                return;
        }
    }
}
