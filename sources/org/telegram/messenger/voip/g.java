package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f19865a;
    public final GroupCallMessagesController f19866b;
    public final long f19867c;
    public final GroupCallMessage d;

    public g(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f19865a = i10;
        this.f19866b = groupCallMessagesController;
        this.f19867c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19865a) {
            case 0:
                GroupCallMessagesController.a(this.f19866b, this.f19867c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19866b, this.f19867c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19866b, this.f19867c, this.d);
                return;
        }
    }
}
