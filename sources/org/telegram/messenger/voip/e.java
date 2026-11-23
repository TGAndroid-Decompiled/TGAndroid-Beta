package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f27578a;
    public final GroupCallMessagesController f27579b;
    public final long f27580c;
    public final GroupCallMessage d;

    public e(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i7) {
        this.f27578a = i7;
        this.f27579b = groupCallMessagesController;
        this.f27580c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f27578a) {
            case 0:
                GroupCallMessagesController.a(this.f27579b, this.f27580c, this.d);
                return;
            case 1:
                GroupCallMessagesController.d(this.f27579b, this.f27580c, this.d);
                return;
            default:
                GroupCallMessagesController.f(this.f27579b, this.f27580c, this.d);
                return;
        }
    }
}
