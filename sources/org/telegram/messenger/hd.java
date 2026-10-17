package org.telegram.messenger;
public final class hd implements Runnable {
    public final int f18524a;
    public final long f18525b;
    public final long f18526c;
    public final BaseController d;

    public hd(BaseController baseController, long j10, long j11, int i10) {
        this.f18524a = i10;
        this.d = baseController;
        this.f18525b = j10;
        this.f18526c = j11;
    }

    @Override
    public final void run() {
        switch (this.f18524a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f18525b, this.f18526c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f18525b, this.f18526c);
                return;
        }
    }
}
