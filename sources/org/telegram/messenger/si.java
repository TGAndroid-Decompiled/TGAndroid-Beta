package org.telegram.messenger;
public final class si implements Runnable {
    public final int f20011a;
    public final CharSequence f20012b;
    public final AccountInstance f20013c;
    public final long d;
    public final long f20014e;
    public final boolean f20015f;
    public final int h;
    public final int f20016n;
    public final long f20017r;

    public si(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z4, int i10, int i11, long j12, int i12) {
        this.f20011a = i12;
        this.f20012b = charSequence;
        this.f20013c = accountInstance;
        this.d = j10;
        this.f20014e = j11;
        this.f20015f = z4;
        this.h = i10;
        this.f20016n = i11;
        this.f20017r = j12;
    }

    @Override
    public final void run() {
        switch (this.f20011a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f20012b, this.f20013c, this.d, this.f20014e, this.f20015f, this.h, this.f20016n, this.f20017r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f20012b, this.f20013c, this.d, this.f20014e, this.f20015f, this.h, this.f20016n, this.f20017r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f20012b, this.f20013c, this.d, this.f20014e, this.f20015f, this.h, this.f20016n, this.f20017r);
                return;
        }
    }
}
