package org.telegram.messenger;
public final class pi implements Runnable {
    public final int f17068a;
    public final CharSequence f17069b;
    public final AccountInstance f17070c;
    public final long d;
    public final long e;
    public final boolean f17071f;
    public final int h;
    public final int f17072n;
    public final long f17073r;

    public pi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f17068a = i12;
        this.f17069b = charSequence;
        this.f17070c = accountInstance;
        this.d = j3;
        this.e = j10;
        this.f17071f = z10;
        this.h = i10;
        this.f17072n = i11;
        this.f17073r = j11;
    }

    @Override
    public final void run() {
        switch (this.f17068a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f17069b, this.f17070c, this.d, this.e, this.f17071f, this.h, this.f17072n, this.f17073r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f17069b, this.f17070c, this.d, this.e, this.f17071f, this.h, this.f17072n, this.f17073r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f17069b, this.f17070c, this.d, this.e, this.f17071f, this.h, this.f17072n, this.f17073r);
                return;
        }
    }
}
