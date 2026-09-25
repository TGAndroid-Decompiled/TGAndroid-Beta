package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f17900a;
    public final GroupCallMessagesController f17901b;
    public final long f17902c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f17900a = i10;
        this.f17901b = groupCallMessagesController;
        this.f17902c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17900a) {
            case 0:
                GroupCallMessagesController.a(this.f17901b, this.f17902c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f17901b, this.f17902c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f17901b, this.f17902c, this.d);
                return;
        }
    }
}
