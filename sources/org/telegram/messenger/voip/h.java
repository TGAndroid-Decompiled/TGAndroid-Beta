package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f17881a;
    public final GroupCallMessagesController f17882b;
    public final long f17883c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f17881a = i10;
        this.f17882b = groupCallMessagesController;
        this.f17883c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17881a) {
            case 0:
                GroupCallMessagesController.a(this.f17882b, this.f17883c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f17882b, this.f17883c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f17882b, this.f17883c, this.d);
                return;
        }
    }
}
