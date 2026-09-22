package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f17896a;
    public final GroupCallMessagesController f17897b;
    public final long f17898c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f17896a = i10;
        this.f17897b = groupCallMessagesController;
        this.f17898c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17896a) {
            case 0:
                GroupCallMessagesController.a(this.f17897b, this.f17898c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f17897b, this.f17898c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f17897b, this.f17898c, this.d);
                return;
        }
    }
}
