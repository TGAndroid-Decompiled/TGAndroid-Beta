package org.telegram.messenger;
public final class oi implements Runnable {
    public final int f18811a;
    public final CharSequence f18812b;
    public final AccountInstance f18813c;
    public final long d;
    public final long f18814e;
    public final boolean f18815f;
    public final int h;
    public final int f18816n;
    public final long f18817r;

    public oi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f18811a = i12;
        this.f18812b = charSequence;
        this.f18813c = accountInstance;
        this.d = j3;
        this.f18814e = j10;
        this.f18815f = z10;
        this.h = i10;
        this.f18816n = i11;
        this.f18817r = j11;
    }

    @Override
    public final void run() {
        switch (this.f18811a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f18812b, this.f18813c, this.d, this.f18814e, this.f18815f, this.h, this.f18816n, this.f18817r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f18812b, this.f18813c, this.d, this.f18814e, this.f18815f, this.h, this.f18816n, this.f18817r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f18812b, this.f18813c, this.d, this.f18814e, this.f18815f, this.h, this.f18816n, this.f18817r);
                return;
        }
    }
}
