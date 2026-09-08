package org.telegram.messenger;
public final class pi implements Runnable {
    public final int f18746a;
    public final CharSequence f18747b;
    public final AccountInstance f18748c;
    public final long d;
    public final long f18749e;
    public final boolean f18750f;
    public final int h;
    public final int f18751n;
    public final long f18752r;

    public pi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f18746a = i12;
        this.f18747b = charSequence;
        this.f18748c = accountInstance;
        this.d = j3;
        this.f18749e = j10;
        this.f18750f = z10;
        this.h = i10;
        this.f18751n = i11;
        this.f18752r = j11;
    }

    @Override
    public final void run() {
        switch (this.f18746a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f18747b, this.f18748c, this.d, this.f18749e, this.f18750f, this.h, this.f18751n, this.f18752r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f18747b, this.f18748c, this.d, this.f18749e, this.f18750f, this.h, this.f18751n, this.f18752r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f18747b, this.f18748c, this.d, this.f18749e, this.f18750f, this.h, this.f18751n, this.f18752r);
                return;
        }
    }
}
