package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f17910a;
    public final GroupCallMessagesController f17911b;
    public final long f17912c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f17910a = i10;
        this.f17911b = groupCallMessagesController;
        this.f17912c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17910a) {
            case 0:
                GroupCallMessagesController.a(this.f17911b, this.f17912c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f17911b, this.f17912c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f17911b, this.f17912c, this.d);
                return;
        }
    }
}
