package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f17652a;
    public final GroupCallMessagesController f17653b;
    public final long f17654c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f17652a = i10;
        this.f17653b = groupCallMessagesController;
        this.f17654c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17652a) {
            case 0:
                GroupCallMessagesController.a(this.f17653b, this.f17654c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f17653b, this.f17654c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f17653b, this.f17654c, this.d);
                return;
        }
    }
}
