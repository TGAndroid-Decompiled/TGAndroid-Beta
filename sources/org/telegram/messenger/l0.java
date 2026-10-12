package org.telegram.messenger;
public final class l0 implements Runnable {
    public final int f18117a;
    public final BotForumHelper f18118b;
    public final long f18119c;
    public final int d;
    public final long f18120e;

    public l0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f18117a = i11;
        this.f18118b = botForumHelper;
        this.f18119c = j3;
        this.d = i10;
        this.f18120e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18117a) {
            case 0:
                BotForumHelper.a(this.f18118b, this.f18119c, this.d, this.f18120e);
                return;
            default:
                BotForumHelper.d(this.f18118b, this.f18119c, this.d, this.f18120e);
                return;
        }
    }
}
