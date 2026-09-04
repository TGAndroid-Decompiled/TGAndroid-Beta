package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19363a;
    public final GroupCallMessagesController f19364b;
    public final long f19365c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f19363a = i10;
        this.f19364b = groupCallMessagesController;
        this.f19365c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19363a) {
            case 0:
                GroupCallMessagesController.a(this.f19364b, this.f19365c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19364b, this.f19365c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19364b, this.f19365c, this.d);
                return;
        }
    }
}
