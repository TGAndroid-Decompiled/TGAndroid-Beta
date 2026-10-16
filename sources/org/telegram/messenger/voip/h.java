package org.telegram.messenger.voip;
public final class h implements Runnable {
    public final int f18503a;
    public final GroupCallMessagesController f18504b;
    public final long f18505c;
    public final GroupCallMessage d;

    public h(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f18503a = i10;
        this.f18504b = groupCallMessagesController;
        this.f18505c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f18503a) {
            case 0:
                GroupCallMessagesController.a(this.f18504b, this.f18505c, this.d);
                return;
            case 1:
                GroupCallMessagesController.f(this.f18504b, this.f18505c, this.d);
                return;
            default:
                GroupCallMessagesController.g(this.f18504b, this.f18505c, this.d);
                return;
        }
    }
}
