package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f21881a;
    public final GroupCallMessagesController f21882b;
    public final long f21883c;
    public final GroupCallMessage d;

    public f(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i9) {
        this.f21881a = i9;
        this.f21882b = groupCallMessagesController;
        this.f21883c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f21881a) {
            case 0:
                GroupCallMessagesController.a(this.f21882b, this.f21883c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f21882b, this.f21883c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f21882b, this.f21883c, this.d);
                return;
        }
    }
}
