package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f17911a;
    public final GroupCallMessagesController f17912b;
    public final long f17913c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f17911a = i10;
        this.f17912b = groupCallMessagesController;
        this.f17913c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17911a) {
            case 0:
                GroupCallMessagesController.a(this.f17912b, this.f17913c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f17912b, this.f17913c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f17912b, this.f17913c, this.d);
                return;
        }
    }
}
