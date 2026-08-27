package org.telegram.messenger;

public final class j0 implements Runnable {

    public final int f20620a;

    public final BotForumHelper f20621b;

    public final long f20622c;
    public final int d;

    public final long f20623e;

    public j0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f20620a = i11;
        this.f20621b = botForumHelper;
        this.f20622c = j10;
        this.d = i10;
        this.f20623e = j11;
    }

    @Override
    public final void run() {
        switch (this.f20620a) {
            case 0:
                this.f20621b.lambda$onBotForumDraftUpdate$1(this.f20622c, this.d, this.f20623e);
                break;
            default:
                this.f20621b.lambda$onBotForumDraftUpdate$0(this.f20622c, this.d, this.f20623e);
                break;
        }
    }
}
