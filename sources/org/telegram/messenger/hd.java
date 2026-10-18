package org.telegram.messenger;
public final class hd implements Runnable {
    public final int f18523a;
    public final long f18524b;
    public final long f18525c;
    public final BaseController d;

    public hd(BaseController baseController, long j10, long j11, int i10) {
        this.f18523a = i10;
        this.d = baseController;
        this.f18524b = j10;
        this.f18525c = j11;
    }

    @Override
    public final void run() {
        switch (this.f18523a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f18524b, this.f18525c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f18524b, this.f18525c);
                return;
        }
    }
}
