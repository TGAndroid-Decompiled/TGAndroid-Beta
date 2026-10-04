package org.telegram.messenger;
public final class pi implements Runnable {
    public final int f18911a;
    public final CharSequence f18912b;
    public final AccountInstance f18913c;
    public final long d;
    public final long f18914e;
    public final boolean f18915f;
    public final int h;
    public final int f18916n;
    public final long f18917r;

    public pi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f18911a = i12;
        this.f18912b = charSequence;
        this.f18913c = accountInstance;
        this.d = j3;
        this.f18914e = j10;
        this.f18915f = z10;
        this.h = i10;
        this.f18916n = i11;
        this.f18917r = j11;
    }

    @Override
    public final void run() {
        switch (this.f18911a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f18912b, this.f18913c, this.d, this.f18914e, this.f18915f, this.h, this.f18916n, this.f18917r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f18912b, this.f18913c, this.d, this.f18914e, this.f18915f, this.h, this.f18916n, this.f18917r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f18912b, this.f18913c, this.d, this.f18914e, this.f18915f, this.h, this.f18916n, this.f18917r);
                return;
        }
    }
}
