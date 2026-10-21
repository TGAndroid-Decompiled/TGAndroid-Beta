package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19855a;
    public final GroupCallMessagesController f19856b;
    public final long f19857c;
    public final GroupCallMessage d;

    public g(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f19855a = i10;
        this.f19856b = groupCallMessagesController;
        this.f19857c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19855a) {
            case 0:
                GroupCallMessagesController.a(this.f19856b, this.f19857c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19856b, this.f19857c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19856b, this.f19857c, this.d);
                return;
        }
    }
}
