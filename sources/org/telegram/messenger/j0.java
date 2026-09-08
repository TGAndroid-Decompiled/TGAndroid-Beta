package org.telegram.messenger;
public final class j0 implements Runnable {
    public final int f18039a;
    public final BotForumHelper f18040b;
    public final long f18041c;
    public final int d;
    public final long f18042e;

    public j0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f18039a = i11;
        this.f18040b = botForumHelper;
        this.f18041c = j3;
        this.d = i10;
        this.f18042e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18039a) {
            case 0:
                BotForumHelper.a(this.f18040b, this.f18041c, this.d, this.f18042e);
                return;
            default:
                BotForumHelper.d(this.f18040b, this.f18041c, this.d, this.f18042e);
                return;
        }
    }
}
