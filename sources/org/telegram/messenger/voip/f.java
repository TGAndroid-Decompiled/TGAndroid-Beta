package org.telegram.messenger.voip;

public final class f implements Runnable {

    public final int f21905a;

    public final GroupCallMessagesController f21906b;

    public final long f21907c;
    public final GroupCallMessage d;

    public f(GroupCallMessagesController groupCallMessagesController, long j10, GroupCallMessage groupCallMessage, int i10) {
        this.f21905a = i10;
        this.f21906b = groupCallMessagesController;
        this.f21907c = j10;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f21905a) {
            case 0:
                this.f21906b.lambda$processUpdate$0(this.f21907c, this.d);
                break;
            case 1:
                this.f21906b.lambda$processUpdate$1(this.f21907c, this.d);
                break;
            default:
                this.f21906b.lambda$processUpdate$2(this.f21907c, this.d);
                break;
        }
    }
}
