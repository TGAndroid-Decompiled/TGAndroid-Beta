package org.telegram.messenger;
public final class md implements Runnable {
    public final int f18279a;
    public final long f18280b;
    public final long f18281c;
    public final BaseController d;

    public md(BaseController baseController, long j3, long j10, int i10) {
        this.f18279a = i10;
        this.d = baseController;
        this.f18280b = j3;
        this.f18281c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18279a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f18280b, this.f18281c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f18280b, this.f18281c);
                return;
        }
    }
}
