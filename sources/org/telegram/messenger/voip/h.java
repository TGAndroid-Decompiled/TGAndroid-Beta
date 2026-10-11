package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19563a;
    public final GroupCallMessagesController f19564b;
    public final long f19565c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f19563a = i10;
        this.f19564b = groupCallMessagesController;
        this.f19565c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19563a) {
            case 0:
                GroupCallMessagesController.a(this.f19564b, this.f19565c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19564b, this.f19565c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19564b, this.f19565c, this.d);
                return;
        }
    }
}
