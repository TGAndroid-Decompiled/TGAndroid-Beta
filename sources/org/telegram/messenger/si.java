package org.telegram.messenger;
public final class si implements Runnable {
    public final int f18401a;
    public final CharSequence f18402b;
    public final AccountInstance f18403c;
    public final long d;
    public final long e;
    public final boolean f18404f;
    public final int h;
    public final int f18405n;
    public final long f18406r;

    public si(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z4, int i10, int i11, long j12, int i12) {
        this.f18401a = i12;
        this.f18402b = charSequence;
        this.f18403c = accountInstance;
        this.d = j10;
        this.e = j11;
        this.f18404f = z4;
        this.h = i10;
        this.f18405n = i11;
        this.f18406r = j12;
    }

    @Override
    public final void run() {
        switch (this.f18401a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f18402b, this.f18403c, this.d, this.e, this.f18404f, this.h, this.f18405n, this.f18406r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f18402b, this.f18403c, this.d, this.e, this.f18404f, this.h, this.f18405n, this.f18406r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f18402b, this.f18403c, this.d, this.e, this.f18404f, this.h, this.f18405n, this.f18406r);
                return;
        }
    }
}
