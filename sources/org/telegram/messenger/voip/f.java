package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f20400a;
    public final GroupCallMessagesController f20401b;
    public final long f20402c;
    public final GroupCallMessage d;

    public f(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f20400a = i10;
        this.f20401b = groupCallMessagesController;
        this.f20402c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f20400a) {
            case 0:
                GroupCallMessagesController.a(this.f20401b, this.f20402c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f20401b, this.f20402c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f20401b, this.f20402c, this.d);
                return;
        }
    }
}
