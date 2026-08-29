package org.telegram.messenger;
public final class ni implements Runnable {
    public final int f21083a;
    public final CharSequence f21084b;
    public final AccountInstance f21085c;
    public final long d;
    public final long f21086e;
    public final boolean f21087f;
    public final int h;
    public final int f21088n;
    public final long f21089r;

    public ni(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i10, int i11, long j12, int i12) {
        this.f21083a = i12;
        this.f21084b = charSequence;
        this.f21085c = accountInstance;
        this.d = j10;
        this.f21086e = j11;
        this.f21087f = z10;
        this.h = i10;
        this.f21088n = i11;
        this.f21089r = j12;
    }

    @Override
    public final void run() {
        switch (this.f21083a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f21084b, this.f21085c, this.d, this.f21086e, this.f21087f, this.h, this.f21088n, this.f21089r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f21084b, this.f21085c, this.d, this.f21086e, this.f21087f, this.h, this.f21088n, this.f21089r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f21084b, this.f21085c, this.d, this.f21086e, this.f21087f, this.h, this.f21088n, this.f21089r);
                return;
        }
    }
}
