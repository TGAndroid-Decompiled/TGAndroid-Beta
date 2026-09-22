package org.telegram.messenger;
public final class pi implements Runnable {
    public final int f17304a;
    public final CharSequence f17305b;
    public final AccountInstance f17306c;
    public final long d;
    public final long e;
    public final boolean f17307f;
    public final int h;
    public final int f17308n;
    public final long f17309r;

    public pi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f17304a = i12;
        this.f17305b = charSequence;
        this.f17306c = accountInstance;
        this.d = j3;
        this.e = j10;
        this.f17307f = z10;
        this.h = i10;
        this.f17308n = i11;
        this.f17309r = j11;
    }

    @Override
    public final void run() {
        switch (this.f17304a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f17305b, this.f17306c, this.d, this.e, this.f17307f, this.h, this.f17308n, this.f17309r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f17305b, this.f17306c, this.d, this.e, this.f17307f, this.h, this.f17308n, this.f17309r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f17305b, this.f17306c, this.d, this.e, this.f17307f, this.h, this.f17308n, this.f17309r);
                return;
        }
    }
}
