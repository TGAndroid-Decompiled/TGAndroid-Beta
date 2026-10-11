package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19599a;
    public final GroupCallMessagesController f19600b;
    public final long f19601c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f19599a = i10;
        this.f19600b = groupCallMessagesController;
        this.f19601c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19599a) {
            case 0:
                GroupCallMessagesController.a(this.f19600b, this.f19601c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19600b, this.f19601c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19600b, this.f19601c, this.d);
                return;
        }
    }
}
