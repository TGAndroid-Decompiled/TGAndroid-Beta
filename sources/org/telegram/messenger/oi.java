package org.telegram.messenger;
public final class oi implements Runnable {
    public final int f18635a;
    public final CharSequence f18636b;
    public final AccountInstance f18637c;
    public final long d;
    public final long f18638e;
    public final boolean f18639f;
    public final int h;
    public final int f18640n;
    public final long f18641r;

    public oi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f18635a = i12;
        this.f18636b = charSequence;
        this.f18637c = accountInstance;
        this.d = j3;
        this.f18638e = j10;
        this.f18639f = z10;
        this.h = i10;
        this.f18640n = i11;
        this.f18641r = j11;
    }

    @Override
    public final void run() {
        switch (this.f18635a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f18636b, this.f18637c, this.d, this.f18638e, this.f18639f, this.h, this.f18640n, this.f18641r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f18636b, this.f18637c, this.d, this.f18638e, this.f18639f, this.h, this.f18640n, this.f18641r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f18636b, this.f18637c, this.d, this.f18638e, this.f18639f, this.h, this.f18640n, this.f18641r);
                return;
        }
    }
}
