package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19854a;
    public final GroupCallMessagesController f19855b;
    public final long f19856c;
    public final GroupCallMessage d;

    public g(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f19854a = i10;
        this.f19855b = groupCallMessagesController;
        this.f19856c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19854a) {
            case 0:
                GroupCallMessagesController.a(this.f19855b, this.f19856c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19855b, this.f19856c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19855b, this.f19856c, this.d);
                return;
        }
    }
}
