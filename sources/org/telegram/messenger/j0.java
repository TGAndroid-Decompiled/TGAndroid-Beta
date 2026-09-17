package org.telegram.messenger;
public final class j0 implements Runnable {
    public final int f18057a;
    public final BotForumHelper f18058b;
    public final long f18059c;
    public final int d;
    public final long f18060e;

    public j0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f18057a = i11;
        this.f18058b = botForumHelper;
        this.f18059c = j3;
        this.d = i10;
        this.f18060e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18057a) {
            case 0:
                BotForumHelper.a(this.f18058b, this.f18059c, this.d, this.f18060e);
                return;
            default:
                BotForumHelper.d(this.f18058b, this.f18059c, this.d, this.f18060e);
                return;
        }
    }
}
