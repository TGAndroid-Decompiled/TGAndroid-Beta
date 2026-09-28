package org.telegram.messenger;
public final class oi implements Runnable {
    public final int f17229a;
    public final CharSequence f17230b;
    public final AccountInstance f17231c;
    public final long d;
    public final long e;
    public final boolean f17232f;
    public final int h;
    public final int f17233n;
    public final long f17234r;

    public oi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f17229a = i12;
        this.f17230b = charSequence;
        this.f17231c = accountInstance;
        this.d = j3;
        this.e = j10;
        this.f17232f = z10;
        this.h = i10;
        this.f17233n = i11;
        this.f17234r = j11;
    }

    @Override
    public final void run() {
        switch (this.f17229a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f17230b, this.f17231c, this.d, this.e, this.f17232f, this.h, this.f17233n, this.f17234r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f17230b, this.f17231c, this.d, this.e, this.f17232f, this.h, this.f17233n, this.f17234r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f17230b, this.f17231c, this.d, this.e, this.f17232f, this.h, this.f17233n, this.f17234r);
                return;
        }
    }
}
