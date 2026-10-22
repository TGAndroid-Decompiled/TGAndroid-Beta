package org.telegram.messenger;
public final class md implements Runnable {
    public final int f18964a;
    public final long f18965b;
    public final long f18966c;
    public final BaseController d;

    public md(BaseController baseController, long j10, long j11, int i10) {
        this.f18964a = i10;
        this.d = baseController;
        this.f18965b = j10;
        this.f18966c = j11;
    }

    @Override
    public final void run() {
        switch (this.f18964a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f18965b, this.f18966c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f18965b, this.f18966c);
                return;
        }
    }
}
