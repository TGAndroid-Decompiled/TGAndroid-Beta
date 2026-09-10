package org.telegram.messenger.voip;
public final class j implements Runnable {
    public final int f16740a;
    public final GroupCallMessagesController f16741b;
    public final long f16742c;
    public final GroupCallMessage d;

    public j(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i10) {
        this.f16740a = i10;
        this.f16741b = groupCallMessagesController;
        this.f16742c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f16740a) {
            case 0:
                GroupCallMessagesController.a(this.f16741b, this.f16742c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f16741b, this.f16742c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f16741b, this.f16742c, this.d);
                return;
        }
    }
}
