package org.telegram.messenger;
public final class oi implements Runnable {
    public final int f17245a;
    public final CharSequence f17246b;
    public final AccountInstance f17247c;
    public final long d;
    public final long e;
    public final boolean f17248f;
    public final int h;
    public final int f17249n;
    public final long f17250r;

    public oi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f17245a = i12;
        this.f17246b = charSequence;
        this.f17247c = accountInstance;
        this.d = j3;
        this.e = j10;
        this.f17248f = z10;
        this.h = i10;
        this.f17249n = i11;
        this.f17250r = j11;
    }

    @Override
    public final void run() {
        switch (this.f17245a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f17246b, this.f17247c, this.d, this.e, this.f17248f, this.h, this.f17249n, this.f17250r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f17246b, this.f17247c, this.d, this.e, this.f17248f, this.h, this.f17249n, this.f17250r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f17246b, this.f17247c, this.d, this.e, this.f17248f, this.h, this.f17249n, this.f17250r);
                return;
        }
    }
}
