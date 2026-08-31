package org.telegram.messenger;
public final class si implements Runnable {
    public final int f20009a;
    public final CharSequence f20010b;
    public final AccountInstance f20011c;
    public final long d;
    public final long f20012e;
    public final boolean f20013f;
    public final int h;
    public final int f20014n;
    public final long f20015r;

    public si(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z4, int i10, int i11, long j12, int i12) {
        this.f20009a = i12;
        this.f20010b = charSequence;
        this.f20011c = accountInstance;
        this.d = j10;
        this.f20012e = j11;
        this.f20013f = z4;
        this.h = i10;
        this.f20014n = i11;
        this.f20015r = j12;
    }

    @Override
    public final void run() {
        switch (this.f20009a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f20010b, this.f20011c, this.d, this.f20012e, this.f20013f, this.h, this.f20014n, this.f20015r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f20010b, this.f20011c, this.d, this.f20012e, this.f20013f, this.h, this.f20014n, this.f20015r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f20010b, this.f20011c, this.d, this.f20012e, this.f20013f, this.h, this.f20014n, this.f20015r);
                return;
        }
    }
}
