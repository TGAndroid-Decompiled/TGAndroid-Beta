package org.telegram.messenger;
public final class md implements Runnable {
    public final int f18280a;
    public final long f18281b;
    public final long f18282c;
    public final BaseController d;

    public md(BaseController baseController, long j3, long j10, int i10) {
        this.f18280a = i10;
        this.d = baseController;
        this.f18281b = j3;
        this.f18282c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18280a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f18281b, this.f18282c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f18281b, this.f18282c);
                return;
        }
    }
}
