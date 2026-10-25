package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f21636a;
    public final GroupCallMessagesController f21637b;
    public final long f21638c;
    public final GroupCallMessage d;

    public f(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f21636a = i10;
        this.f21637b = groupCallMessagesController;
        this.f21638c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f21636a) {
            case 0:
                GroupCallMessagesController.a(this.f21637b, this.f21638c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f21637b, this.f21638c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f21637b, this.f21638c, this.d);
                return;
        }
    }
}
