package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f18805a;
    public final GroupCallMessagesController f18806b;
    public final long f18807c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f18805a = i10;
        this.f18806b = groupCallMessagesController;
        this.f18807c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f18805a) {
            case 0:
                GroupCallMessagesController.a(this.f18806b, this.f18807c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f18806b, this.f18807c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f18806b, this.f18807c, this.d);
                return;
        }
    }
}
