package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19939a;
    public final GroupCallMessagesController f19940b;
    public final long f19941c;
    public final GroupCallMessage d;

    public g(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f19939a = i10;
        this.f19940b = groupCallMessagesController;
        this.f19941c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19939a) {
            case 0:
                GroupCallMessagesController.a(this.f19940b, this.f19941c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19940b, this.f19941c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19940b, this.f19941c, this.d);
                return;
        }
    }
}
