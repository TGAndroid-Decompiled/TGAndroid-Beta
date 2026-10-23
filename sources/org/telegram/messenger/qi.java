package org.telegram.messenger;
public final class qi implements Runnable {
    public final int f19340a;
    public final CharSequence f19341b;
    public final AccountInstance f19342c;
    public final long d;
    public final long e;
    public final boolean f19343f;
    public final int h;
    public final int f19344n;
    public final long f19345r;

    public qi(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i10, int i11, long j12, int i12) {
        this.f19340a = i12;
        this.f19341b = charSequence;
        this.f19342c = accountInstance;
        this.d = j10;
        this.e = j11;
        this.f19343f = z10;
        this.h = i10;
        this.f19344n = i11;
        this.f19345r = j12;
    }

    @Override
    public final void run() {
        switch (this.f19340a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f19341b, this.f19342c, this.d, this.e, this.f19343f, this.h, this.f19344n, this.f19345r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f19341b, this.f19342c, this.d, this.e, this.f19343f, this.h, this.f19344n, this.f19345r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f19341b, this.f19342c, this.d, this.e, this.f19343f, this.h, this.f19344n, this.f19345r);
                return;
        }
    }
}
