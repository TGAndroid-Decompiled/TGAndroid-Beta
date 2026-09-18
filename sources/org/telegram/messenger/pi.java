package org.telegram.messenger;
public final class pi implements Runnable {
    public final int f17085a;
    public final CharSequence f17086b;
    public final AccountInstance f17087c;
    public final long d;
    public final long e;
    public final boolean f17088f;
    public final int h;
    public final int f17089n;
    public final long f17090r;

    public pi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f17085a = i12;
        this.f17086b = charSequence;
        this.f17087c = accountInstance;
        this.d = j3;
        this.e = j10;
        this.f17088f = z10;
        this.h = i10;
        this.f17089n = i11;
        this.f17090r = j11;
    }

    @Override
    public final void run() {
        switch (this.f17085a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f17086b, this.f17087c, this.d, this.e, this.f17088f, this.h, this.f17089n, this.f17090r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f17086b, this.f17087c, this.d, this.e, this.f17088f, this.h, this.f17089n, this.f17090r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f17086b, this.f17087c, this.d, this.e, this.f17088f, this.h, this.f17089n, this.f17090r);
                return;
        }
    }
}
