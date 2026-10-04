package org.telegram.messenger;
public final class oi implements Runnable {
    public final int f18810a;
    public final CharSequence f18811b;
    public final AccountInstance f18812c;
    public final long d;
    public final long f18813e;
    public final boolean f18814f;
    public final int h;
    public final int f18815n;
    public final long f18816r;

    public oi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f18810a = i12;
        this.f18811b = charSequence;
        this.f18812c = accountInstance;
        this.d = j3;
        this.f18813e = j10;
        this.f18814f = z10;
        this.h = i10;
        this.f18815n = i11;
        this.f18816r = j11;
    }

    @Override
    public final void run() {
        switch (this.f18810a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f18811b, this.f18812c, this.d, this.f18813e, this.f18814f, this.h, this.f18815n, this.f18816r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f18811b, this.f18812c, this.d, this.f18813e, this.f18814f, this.h, this.f18815n, this.f18816r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f18811b, this.f18812c, this.d, this.f18813e, this.f18814f, this.h, this.f18815n, this.f18816r);
                return;
        }
    }
}
