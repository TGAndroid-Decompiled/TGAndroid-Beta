package org.telegram.messenger;
public final class hd implements Runnable {
    public final int f18520a;
    public final long f18521b;
    public final long f18522c;
    public final BaseController d;

    public hd(BaseController baseController, long j10, long j11, int i10) {
        this.f18520a = i10;
        this.d = baseController;
        this.f18521b = j10;
        this.f18522c = j11;
    }

    @Override
    public final void run() {
        switch (this.f18520a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f18521b, this.f18522c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f18521b, this.f18522c);
                return;
        }
    }
}
