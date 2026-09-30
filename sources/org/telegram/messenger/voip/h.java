package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f17927a;
    public final GroupCallMessagesController f17928b;
    public final long f17929c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f17927a = i10;
        this.f17928b = groupCallMessagesController;
        this.f17929c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f17927a) {
            case 0:
                GroupCallMessagesController.a(this.f17928b, this.f17929c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f17928b, this.f17929c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f17928b, this.f17929c, this.d);
                return;
        }
    }
}
