package org.telegram.messenger;
public final class pi implements Runnable {
    public final int f17076a;
    public final CharSequence f17077b;
    public final AccountInstance f17078c;
    public final long d;
    public final long e;
    public final boolean f17079f;
    public final int h;
    public final int f17080n;
    public final long f17081r;

    public pi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f17076a = i12;
        this.f17077b = charSequence;
        this.f17078c = accountInstance;
        this.d = j3;
        this.e = j10;
        this.f17079f = z10;
        this.h = i10;
        this.f17080n = i11;
        this.f17081r = j11;
    }

    @Override
    public final void run() {
        switch (this.f17076a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f17077b, this.f17078c, this.d, this.e, this.f17079f, this.h, this.f17080n, this.f17081r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f17077b, this.f17078c, this.d, this.e, this.f17079f, this.h, this.f17080n, this.f17081r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f17077b, this.f17078c, this.d, this.e, this.f17079f, this.h, this.f17080n, this.f17081r);
                return;
        }
    }
}
