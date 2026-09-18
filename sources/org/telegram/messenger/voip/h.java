package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f17666a;
    public final GroupCallMessagesController f17667b;
    public final long f17668c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f17666a = i10;
        this.f17667b = groupCallMessagesController;
        this.f17668c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17666a) {
            case 0:
                GroupCallMessagesController.a(this.f17667b, this.f17668c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f17667b, this.f17668c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f17667b, this.f17668c, this.d);
                return;
        }
    }
}
