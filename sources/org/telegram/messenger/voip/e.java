package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f27473a;
    public final GroupCallMessagesController f27474b;
    public final long f27475c;
    public final GroupCallMessage d;

    public e(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i7) {
        this.f27473a = i7;
        this.f27474b = groupCallMessagesController;
        this.f27475c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f27473a) {
            case 0:
                GroupCallMessagesController.a(this.f27474b, this.f27475c, this.d);
                return;
            case 1:
                GroupCallMessagesController.d(this.f27474b, this.f27475c, this.d);
                return;
            default:
                GroupCallMessagesController.f(this.f27474b, this.f27475c, this.d);
                return;
        }
    }
}
