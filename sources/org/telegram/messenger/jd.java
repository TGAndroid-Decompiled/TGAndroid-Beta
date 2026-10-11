package org.telegram.messenger;
public final class jd implements Runnable {
    public final int f18264a;
    public final long f18265b;
    public final long f18266c;
    public final BaseController d;

    public jd(BaseController baseController, long j3, long j10, int i10) {
        this.f18264a = i10;
        this.d = baseController;
        this.f18265b = j3;
        this.f18266c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18264a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f18265b, this.f18266c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f18265b, this.f18266c);
                return;
        }
    }
}
