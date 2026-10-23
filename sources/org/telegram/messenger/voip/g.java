package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19944a;
    public final GroupCallMessagesController f19945b;
    public final long f19946c;
    public final GroupCallMessage d;

    public g(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f19944a = i10;
        this.f19945b = groupCallMessagesController;
        this.f19946c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19944a) {
            case 0:
                GroupCallMessagesController.a(this.f19945b, this.f19946c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19945b, this.f19946c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19945b, this.f19946c, this.d);
                return;
        }
    }
}
