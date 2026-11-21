package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f27510a;
    public final GroupCallMessagesController f27511b;
    public final long f27512c;
    public final GroupCallMessage d;

    public e(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i7) {
        this.f27510a = i7;
        this.f27511b = groupCallMessagesController;
        this.f27512c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f27510a) {
            case 0:
                GroupCallMessagesController.a(this.f27511b, this.f27512c, this.d);
                return;
            case 1:
                GroupCallMessagesController.d(this.f27511b, this.f27512c, this.d);
                return;
            default:
                GroupCallMessagesController.f(this.f27511b, this.f27512c, this.d);
                return;
        }
    }
}
