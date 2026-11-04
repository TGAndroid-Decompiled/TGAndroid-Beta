package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f25999a;
    public final GroupCallMessagesController f26000b;
    public final long f26001c;
    public final GroupCallMessage d;

    public f(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i3) {
        this.f25999a = i3;
        this.f26000b = groupCallMessagesController;
        this.f26001c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f25999a) {
            case 0:
                GroupCallMessagesController.a(this.f26000b, this.f26001c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f26000b, this.f26001c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f26000b, this.f26001c, this.d);
                return;
        }
    }
}
