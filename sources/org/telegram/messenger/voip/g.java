package org.telegram.messenger.voip;
public final class g implements Runnable {
    public final int f18780a;
    public final GroupCallMessagesController f18781b;
    public final long f18782c;
    public final GroupCallMessage d;

    public g(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f18780a = i10;
        this.f18781b = groupCallMessagesController;
        this.f18782c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f18780a) {
            case 0:
                GroupCallMessagesController.a(this.f18781b, this.f18782c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f18781b, this.f18782c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f18781b, this.f18782c, this.d);
                return;
        }
    }
}
