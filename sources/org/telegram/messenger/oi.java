package org.telegram.messenger;
public final class oi implements Runnable {
    public final int f17228a;
    public final CharSequence f17229b;
    public final AccountInstance f17230c;
    public final long d;
    public final long e;
    public final boolean f17231f;
    public final int h;
    public final int f17232n;
    public final long f17233r;

    public oi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f17228a = i12;
        this.f17229b = charSequence;
        this.f17230c = accountInstance;
        this.d = j3;
        this.e = j10;
        this.f17231f = z10;
        this.h = i10;
        this.f17232n = i11;
        this.f17233r = j11;
    }

    @Override
    public final void run() {
        switch (this.f17228a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f17229b, this.f17230c, this.d, this.e, this.f17231f, this.h, this.f17232n, this.f17233r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f17229b, this.f17230c, this.d, this.e, this.f17231f, this.h, this.f17232n, this.f17233r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f17229b, this.f17230c, this.d, this.e, this.f17231f, this.h, this.f17232n, this.f17233r);
                return;
        }
    }
}
