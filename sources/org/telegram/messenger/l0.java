package org.telegram.messenger;
public final class l0 implements Runnable {
    public final int f18833a;
    public final BotForumHelper f18834b;
    public final long f18835c;
    public final int d;
    public final long e;

    public l0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f18833a = i11;
        this.f18834b = botForumHelper;
        this.f18835c = j10;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f18833a) {
            case 0:
                BotForumHelper.a(this.f18834b, this.f18835c, this.d, this.e);
                return;
            default:
                BotForumHelper.c(this.f18834b, this.f18835c, this.d, this.e);
                return;
        }
    }
}
