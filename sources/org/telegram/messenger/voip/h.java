package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19558a;
    public final GroupCallMessagesController f19559b;
    public final long f19560c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f19558a = i10;
        this.f19559b = groupCallMessagesController;
        this.f19560c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19558a) {
            case 0:
                GroupCallMessagesController.a(this.f19559b, this.f19560c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19559b, this.f19560c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19559b, this.f19560c, this.d);
                return;
        }
    }
}
