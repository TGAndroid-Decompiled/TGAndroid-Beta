package org.telegram.messenger.voip;
public final class e implements Runnable {
    public final int f26111a;
    public final GroupCallMessagesController f26112b;
    public final long f26113c;
    public final GroupCallMessage d;

    public e(GroupCallMessagesController groupCallMessagesController, long j3, GroupCallMessage groupCallMessage, int i7) {
        this.f26111a = i7;
        this.f26112b = groupCallMessagesController;
        this.f26113c = j3;
        this.d = groupCallMessage;
    }

    @Override
    public final void run() {
        switch (this.f26111a) {
            case 0:
                this.f26112b.lambda$processUpdate$0(this.f26113c, this.d);
                return;
            case 1:
                this.f26112b.lambda$processUpdate$1(this.f26113c, this.d);
                return;
            default:
                this.f26112b.lambda$processUpdate$2(this.f26113c, this.d);
                return;
        }
    }
}
