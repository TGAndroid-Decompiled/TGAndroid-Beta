package org.telegram.messenger;
public final class oi implements Runnable {
    public final int f17218a;
    public final CharSequence f17219b;
    public final AccountInstance f17220c;
    public final long d;
    public final long e;
    public final boolean f17221f;
    public final int h;
    public final int f17222n;
    public final long f17223r;

    public oi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f17218a = i12;
        this.f17219b = charSequence;
        this.f17220c = accountInstance;
        this.d = j3;
        this.e = j10;
        this.f17221f = z10;
        this.h = i10;
        this.f17222n = i11;
        this.f17223r = j11;
    }

    @Override
    public final void run() {
        switch (this.f17218a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f17219b, this.f17220c, this.d, this.e, this.f17221f, this.h, this.f17222n, this.f17223r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f17219b, this.f17220c, this.d, this.e, this.f17221f, this.h, this.f17222n, this.f17223r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f17219b, this.f17220c, this.d, this.e, this.f17221f, this.h, this.f17222n, this.f17223r);
                return;
        }
    }
}
