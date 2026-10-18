package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19858a;
    public final GroupCallMessagesController f19859b;
    public final long f19860c;
    public final GroupCallMessage d;

    public g(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f19858a = i10;
        this.f19859b = groupCallMessagesController;
        this.f19860c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19858a) {
            case 0:
                GroupCallMessagesController.a(this.f19859b, this.f19860c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19859b, this.f19860c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19859b, this.f19860c, this.d);
                return;
        }
    }
}
