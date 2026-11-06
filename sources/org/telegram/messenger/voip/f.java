package org.telegram.messenger.voip;
public final class f implements Runnable {
    public final int f26108a;
    public final GroupCallMessagesController f26109b;
    public final long f26110c;
    public final GroupCallMessage d;

    public f(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i7) {
        this.f26108a = i7;
        this.f26109b = groupCallMessagesController;
        this.f26110c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f26108a) {
            case 0:
                this.f26109b.lambda$processUpdate$0(this.f26110c, this.d);
                return;
            case 1:
                this.f26109b.lambda$processUpdate$1(this.f26110c, this.d);
                return;
            default:
                this.f26109b.lambda$processUpdate$2(this.f26110c, this.d);
                return;
        }
    }
}
