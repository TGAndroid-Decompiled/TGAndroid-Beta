package org.telegram.messenger;
public final class qi implements Runnable {
    public final int f17344a;
    public final CharSequence f17345b;
    public final AccountInstance f17346c;
    public final long d;
    public final long e;
    public final boolean f17347f;
    public final int h;
    public final int f17348n;
    public final long f17349r;

    public qi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f17344a = i12;
        this.f17345b = charSequence;
        this.f17346c = accountInstance;
        this.d = j3;
        this.e = j10;
        this.f17347f = z10;
        this.h = i10;
        this.f17348n = i11;
        this.f17349r = j11;
    }

    @Override
    public final void run() {
        switch (this.f17344a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f17345b, this.f17346c, this.d, this.e, this.f17347f, this.h, this.f17348n, this.f17349r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f17345b, this.f17346c, this.d, this.e, this.f17347f, this.h, this.f17348n, this.f17349r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f17345b, this.f17346c, this.d, this.e, this.f17347f, this.h, this.f17348n, this.f17349r);
                return;
        }
    }
}
