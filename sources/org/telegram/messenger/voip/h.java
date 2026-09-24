package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f17885a;
    public final GroupCallMessagesController f17886b;
    public final long f17887c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f17885a = i10;
        this.f17886b = groupCallMessagesController;
        this.f17887c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17885a) {
            case 0:
                GroupCallMessagesController.a(this.f17886b, this.f17887c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f17886b, this.f17887c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f17886b, this.f17887c, this.d);
                return;
        }
    }
}
