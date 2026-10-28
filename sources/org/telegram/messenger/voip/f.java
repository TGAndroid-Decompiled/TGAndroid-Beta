package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f21624a;
    public final GroupCallMessagesController f21625b;
    public final long f21626c;
    public final GroupCallMessage d;

    public f(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f21624a = i10;
        this.f21625b = groupCallMessagesController;
        this.f21626c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f21624a) {
            case 0:
                GroupCallMessagesController.a(this.f21625b, this.f21626c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f21625b, this.f21626c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f21625b, this.f21626c, this.d);
                return;
        }
    }
}
