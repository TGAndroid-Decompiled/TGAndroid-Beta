package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19562a;
    public final GroupCallMessagesController f19563b;
    public final long f19564c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f19562a = i10;
        this.f19563b = groupCallMessagesController;
        this.f19564c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19562a) {
            case 0:
                GroupCallMessagesController.a(this.f19563b, this.f19564c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19563b, this.f19564c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19563b, this.f19564c, this.d);
                return;
        }
    }
}
