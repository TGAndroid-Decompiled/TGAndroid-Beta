package org.telegram.messenger;
public final class oi implements Runnable {
    public final int f17209a;
    public final CharSequence f17210b;
    public final AccountInstance f17211c;
    public final long d;
    public final long e;
    public final boolean f17212f;
    public final int h;
    public final int f17213n;
    public final long f17214r;

    public oi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f17209a = i12;
        this.f17210b = charSequence;
        this.f17211c = accountInstance;
        this.d = j3;
        this.e = j10;
        this.f17212f = z10;
        this.h = i10;
        this.f17213n = i11;
        this.f17214r = j11;
    }

    @Override
    public final void run() {
        switch (this.f17209a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f17210b, this.f17211c, this.d, this.e, this.f17212f, this.h, this.f17213n, this.f17214r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f17210b, this.f17211c, this.d, this.e, this.f17212f, this.h, this.f17213n, this.f17214r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f17210b, this.f17211c, this.d, this.e, this.f17212f, this.h, this.f17213n, this.f17214r);
                return;
        }
    }
}
