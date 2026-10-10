package org.telegram.messenger;
public final class jd implements Runnable {
    public final int f18259a;
    public final long f18260b;
    public final long f18261c;
    public final BaseController d;

    public jd(BaseController baseController, long j3, long j10, int i10) {
        this.f18259a = i10;
        this.d = baseController;
        this.f18260b = j3;
        this.f18261c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18259a) {
            case 0:
                ((MessagesController) this.d).lambda$markDialogAsReadNow$239(this.f18260b, this.f18261c);
                return;
            default:
                ((NotificationsController) this.d).lambda$setOpenedDialogId$4(this.f18260b, this.f18261c);
                return;
        }
    }
}
