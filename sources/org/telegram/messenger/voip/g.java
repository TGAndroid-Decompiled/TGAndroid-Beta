package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19864a;
    public final GroupCallMessagesController f19865b;
    public final long f19866c;
    public final GroupCallMessage d;

    public g(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f19864a = i10;
        this.f19865b = groupCallMessagesController;
        this.f19866c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19864a) {
            case 0:
                GroupCallMessagesController.a(this.f19865b, this.f19866c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19865b, this.f19866c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19865b, this.f19866c, this.d);
                return;
        }
    }
}
