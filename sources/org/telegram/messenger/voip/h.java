package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f17909a;
    public final GroupCallMessagesController f17910b;
    public final long f17911c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f17909a = i10;
        this.f17910b = groupCallMessagesController;
        this.f17911c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17909a) {
            case 0:
                GroupCallMessagesController.a(this.f17910b, this.f17911c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f17910b, this.f17911c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f17910b, this.f17911c, this.d);
                return;
        }
    }
}
