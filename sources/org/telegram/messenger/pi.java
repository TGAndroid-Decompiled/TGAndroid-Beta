package org.telegram.messenger;
public final class pi implements Runnable {
    public final int f17289a;
    public final CharSequence f17290b;
    public final AccountInstance f17291c;
    public final long d;
    public final long e;
    public final boolean f17292f;
    public final int h;
    public final int f17293n;
    public final long f17294r;

    public pi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f17289a = i12;
        this.f17290b = charSequence;
        this.f17291c = accountInstance;
        this.d = j3;
        this.e = j10;
        this.f17292f = z10;
        this.h = i10;
        this.f17293n = i11;
        this.f17294r = j11;
    }

    @Override
    public final void run() {
        switch (this.f17289a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f17290b, this.f17291c, this.d, this.e, this.f17292f, this.h, this.f17293n, this.f17294r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f17290b, this.f17291c, this.d, this.e, this.f17292f, this.h, this.f17293n, this.f17294r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f17290b, this.f17291c, this.d, this.e, this.f17292f, this.h, this.f17293n, this.f17294r);
                return;
        }
    }
}
