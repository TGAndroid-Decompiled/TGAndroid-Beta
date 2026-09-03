package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f18755a;
    public final GroupCallMessagesController f18756b;
    public final long f18757c;
    public final GroupCallMessage d;

    public f(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f18755a = i10;
        this.f18756b = groupCallMessagesController;
        this.f18757c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f18755a) {
            case 0:
                GroupCallMessagesController.a(this.f18756b, this.f18757c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f18756b, this.f18757c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f18756b, this.f18757c, this.d);
                return;
        }
    }
}
