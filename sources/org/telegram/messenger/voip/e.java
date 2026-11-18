package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f27484a;
    public final GroupCallMessagesController f27485b;
    public final long f27486c;
    public final GroupCallMessage d;

    public e(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i7) {
        this.f27484a = i7;
        this.f27485b = groupCallMessagesController;
        this.f27486c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f27484a) {
            case 0:
                GroupCallMessagesController.a(this.f27485b, this.f27486c, this.d);
                return;
            case 1:
                GroupCallMessagesController.d(this.f27485b, this.f27486c, this.d);
                return;
            default:
                GroupCallMessagesController.f(this.f27485b, this.f27486c, this.d);
                return;
        }
    }
}
