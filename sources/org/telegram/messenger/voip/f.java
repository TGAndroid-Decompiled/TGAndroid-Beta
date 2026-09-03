package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f20402a;
    public final GroupCallMessagesController f20403b;
    public final long f20404c;
    public final GroupCallMessage d;

    public f(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f20402a = i10;
        this.f20403b = groupCallMessagesController;
        this.f20404c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f20402a) {
            case 0:
                GroupCallMessagesController.a(this.f20403b, this.f20404c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f20403b, this.f20404c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f20403b, this.f20404c, this.d);
                return;
        }
    }
}
