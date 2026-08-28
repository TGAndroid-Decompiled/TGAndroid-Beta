package org.telegram.messenger;
public final class j0 implements Runnable {
    public final int f20634a;
    public final BotForumHelper f20635b;
    public final long f20636c;
    public final int d;
    public final long f20637e;

    public j0(BotForumHelper botForumHelper, long j10, int i9, long j11, int i10) {
        this.f20634a = i10;
        this.f20635b = botForumHelper;
        this.f20636c = j10;
        this.d = i9;
        this.f20637e = j11;
    }

    @Override
    public final void run() {
        switch (this.f20634a) {
            case 0:
                BotForumHelper.a(this.f20635b, this.f20636c, this.d, this.f20637e);
                return;
            default:
                BotForumHelper.d(this.f20635b, this.f20636c, this.d, this.f20637e);
                return;
        }
    }
}
