package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19876a;
    public final GroupCallMessagesController f19877b;
    public final long f19878c;
    public final GroupCallMessage d;

    public g(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f19876a = i10;
        this.f19877b = groupCallMessagesController;
        this.f19878c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19876a) {
            case 0:
                GroupCallMessagesController.a(this.f19877b, this.f19878c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19877b, this.f19878c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19877b, this.f19878c, this.d);
                return;
        }
    }
}
