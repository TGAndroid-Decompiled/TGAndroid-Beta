package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f27437a;
    public final GroupCallMessagesController f27438b;
    public final long f27439c;
    public final GroupCallMessage d;

    public e(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i7) {
        this.f27437a = i7;
        this.f27438b = groupCallMessagesController;
        this.f27439c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f27437a) {
            case 0:
                GroupCallMessagesController.a(this.f27438b, this.f27439c, this.d);
                return;
            case 1:
                GroupCallMessagesController.d(this.f27438b, this.f27439c, this.d);
                return;
            default:
                GroupCallMessagesController.f(this.f27438b, this.f27439c, this.d);
                return;
        }
    }
}
