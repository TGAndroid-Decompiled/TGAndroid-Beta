package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19879a;
    public final GroupCallMessagesController f19880b;
    public final long f19881c;
    public final GroupCallMessage d;

    public g(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f19879a = i10;
        this.f19880b = groupCallMessagesController;
        this.f19881c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19879a) {
            case 0:
                GroupCallMessagesController.a(this.f19880b, this.f19881c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19880b, this.f19881c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19880b, this.f19881c, this.d);
                return;
        }
    }
}
