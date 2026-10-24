package org.telegram.messenger;
public final class k0 implements Runnable {
    public final int f18801a;
    public final BotForumHelper f18802b;
    public final long f18803c;
    public final int d;
    public final long e;

    public k0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f18801a = i11;
        this.f18802b = botForumHelper;
        this.f18803c = j10;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f18801a) {
            case 0:
                BotForumHelper.a(this.f18802b, this.f18803c, this.d, this.e);
                return;
            default:
                BotForumHelper.c(this.f18802b, this.f18803c, this.d, this.e);
                return;
        }
    }
}
