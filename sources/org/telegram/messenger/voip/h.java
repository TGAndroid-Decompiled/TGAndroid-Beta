package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19340a;
    public final GroupCallMessagesController f19341b;
    public final long f19342c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f19340a = i10;
        this.f19341b = groupCallMessagesController;
        this.f19342c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19340a) {
            case 0:
                GroupCallMessagesController.a(this.f19341b, this.f19342c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19341b, this.f19342c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19341b, this.f19342c, this.d);
                return;
        }
    }
}
