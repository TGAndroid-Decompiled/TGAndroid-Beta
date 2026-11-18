package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f27482a;
    public final GroupCallMessagesController f27483b;
    public final long f27484c;
    public final GroupCallMessage d;

    public e(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i7) {
        this.f27482a = i7;
        this.f27483b = groupCallMessagesController;
        this.f27484c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f27482a) {
            case 0:
                GroupCallMessagesController.a(this.f27483b, this.f27484c, this.d);
                return;
            case 1:
                GroupCallMessagesController.d(this.f27483b, this.f27484c, this.d);
                return;
            default:
                GroupCallMessagesController.f(this.f27483b, this.f27484c, this.d);
                return;
        }
    }
}
