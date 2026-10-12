package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19339a;
    public final GroupCallMessagesController f19340b;
    public final long f19341c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f19339a = i10;
        this.f19340b = groupCallMessagesController;
        this.f19341c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19339a) {
            case 0:
                GroupCallMessagesController.a(this.f19340b, this.f19341c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19340b, this.f19341c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19340b, this.f19341c, this.d);
                return;
        }
    }
}
