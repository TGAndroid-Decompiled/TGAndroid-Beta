package org.telegram.messenger.voip;
public final class i implements Runnable {
    public final int f18816a;
    public final GroupCallMessagesController f18817b;
    public final long f18818c;
    public final GroupCallMessage d;

    public i(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f18816a = i10;
        this.f18817b = groupCallMessagesController;
        this.f18818c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f18816a) {
            case 0:
                GroupCallMessagesController.a(this.f18817b, this.f18818c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f18817b, this.f18818c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f18817b, this.f18818c, this.d);
                return;
        }
    }
}
