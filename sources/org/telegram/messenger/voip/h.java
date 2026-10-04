package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19561a;
    public final GroupCallMessagesController f19562b;
    public final long f19563c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f19561a = i10;
        this.f19562b = groupCallMessagesController;
        this.f19563c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19561a) {
            case 0:
                GroupCallMessagesController.a(this.f19562b, this.f19563c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19562b, this.f19563c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19562b, this.f19563c, this.d);
                return;
        }
    }
}
