package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f17894a;
    public final GroupCallMessagesController f17895b;
    public final long f17896c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f17894a = i10;
        this.f17895b = groupCallMessagesController;
        this.f17896c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17894a) {
            case 0:
                GroupCallMessagesController.a(this.f17895b, this.f17896c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f17895b, this.f17896c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f17895b, this.f17896c, this.d);
                return;
        }
    }
}
