package org.telegram.messenger;
public final class ld implements Runnable {
    public final int f18888a;
    public final long f18889b;
    public final long f18890c;
    public final BaseController d;

    public ld(BaseController baseController, long j10, long j11, int i10) {
        this.f18888a = i10;
        this.d = baseController;
        this.f18889b = j10;
        this.f18890c = j11;
    }

    @Override
    public final void run() {
        switch (this.f18888a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f18889b, this.f18890c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f18889b, this.f18890c);
                return;
        }
    }
}
