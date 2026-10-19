package org.telegram.messenger;
public final class l0 implements Runnable {
    public final int f18824a;
    public final BotForumHelper f18825b;
    public final long f18826c;
    public final int d;
    public final long e;

    public l0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f18824a = i11;
        this.f18825b = botForumHelper;
        this.f18826c = j10;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f18824a) {
            case 0:
                BotForumHelper.a(this.f18825b, this.f18826c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f18825b, this.f18826c, this.d, this.e);
                return;
        }
    }
}
