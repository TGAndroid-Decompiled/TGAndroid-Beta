package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f17843a;
    public final GroupCallMessagesController f17844b;
    public final long f17845c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f17843a = i10;
        this.f17844b = groupCallMessagesController;
        this.f17845c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17843a) {
            case 0:
                GroupCallMessagesController.a(this.f17844b, this.f17845c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f17844b, this.f17845c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f17844b, this.f17845c, this.d);
                return;
        }
    }
}
