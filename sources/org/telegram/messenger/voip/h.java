package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f17641a;
    public final GroupCallMessagesController f17642b;
    public final long f17643c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f17641a = i10;
        this.f17642b = groupCallMessagesController;
        this.f17643c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17641a) {
            case 0:
                GroupCallMessagesController.a(this.f17642b, this.f17643c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f17642b, this.f17643c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f17642b, this.f17643c, this.d);
                return;
        }
    }
}
