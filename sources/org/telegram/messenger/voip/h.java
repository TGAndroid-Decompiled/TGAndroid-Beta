package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19377a;
    public final GroupCallMessagesController f19378b;
    public final long f19379c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f19377a = i10;
        this.f19378b = groupCallMessagesController;
        this.f19379c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19377a) {
            case 0:
                GroupCallMessagesController.a(this.f19378b, this.f19379c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19378b, this.f19379c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19378b, this.f19379c, this.d);
                return;
        }
    }
}
