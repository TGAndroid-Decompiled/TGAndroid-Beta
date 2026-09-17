package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19404a;
    public final GroupCallMessagesController f19405b;
    public final long f19406c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f19404a = i10;
        this.f19405b = groupCallMessagesController;
        this.f19406c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19404a) {
            case 0:
                GroupCallMessagesController.a(this.f19405b, this.f19406c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19405b, this.f19406c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19405b, this.f19406c, this.d);
                return;
        }
    }
}
