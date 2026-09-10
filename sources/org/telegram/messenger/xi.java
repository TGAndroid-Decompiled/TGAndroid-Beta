package org.telegram.messenger;
public final class xi implements Runnable {
    public final int f17000a;
    public final CharSequence f17001b;
    public final AccountInstance f17002c;
    public final long d;
    public final long e;
    public final boolean f17003f;
    public final int h;
    public final int f17004n;
    public final long f17005r;

    public xi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f17000a = i12;
        this.f17001b = charSequence;
        this.f17002c = accountInstance;
        this.d = j3;
        this.e = j10;
        this.f17003f = z10;
        this.h = i10;
        this.f17004n = i11;
        this.f17005r = j11;
    }

    @Override
    public final void run() {
        switch (this.f17000a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f17001b, this.f17002c, this.d, this.e, this.f17003f, this.h, this.f17004n, this.f17005r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f17001b, this.f17002c, this.d, this.e, this.f17003f, this.h, this.f17004n, this.f17005r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f17001b, this.f17002c, this.d, this.e, this.f17003f, this.h, this.f17004n, this.f17005r);
                return;
        }
    }
}
