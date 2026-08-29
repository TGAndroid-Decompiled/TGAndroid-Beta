package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f21945a;
    public final GroupCallMessagesController f21946b;
    public final long f21947c;
    public final GroupCallMessage d;

    public f(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f21945a = i10;
        this.f21946b = groupCallMessagesController;
        this.f21947c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f21945a) {
            case 0:
                GroupCallMessagesController.a(this.f21946b, this.f21947c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f21946b, this.f21947c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f21946b, this.f21947c, this.d);
                return;
        }
    }
}
