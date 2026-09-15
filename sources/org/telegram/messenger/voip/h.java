package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f17657a;
    public final GroupCallMessagesController f17658b;
    public final long f17659c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f17657a = i10;
        this.f17658b = groupCallMessagesController;
        this.f17659c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17657a) {
            case 0:
                GroupCallMessagesController.a(this.f17658b, this.f17659c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f17658b, this.f17659c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f17658b, this.f17659c, this.d);
                return;
        }
    }
}
