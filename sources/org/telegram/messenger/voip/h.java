package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f19553a;
    public final GroupCallMessagesController f19554b;
    public final long f19555c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f19553a = i10;
        this.f19554b = groupCallMessagesController;
        this.f19555c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f19553a) {
            case 0:
                GroupCallMessagesController.a(this.f19554b, this.f19555c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f19554b, this.f19555c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f19554b, this.f19555c, this.d);
                return;
        }
    }
}
