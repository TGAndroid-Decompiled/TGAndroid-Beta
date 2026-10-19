package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19861a;
    public final GroupCallMessagesController f19862b;
    public final long f19863c;
    public final GroupCallMessage d;

    public g(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f19861a = i10;
        this.f19862b = groupCallMessagesController;
        this.f19863c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19861a) {
            case 0:
                GroupCallMessagesController.a(this.f19862b, this.f19863c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19862b, this.f19863c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19862b, this.f19863c, this.d);
                return;
        }
    }
}
