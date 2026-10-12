package org.telegram.messenger;
public final class vi implements Runnable {
    public final int f18698a;
    public final CharSequence f18699b;
    public final AccountInstance f18700c;
    public final long d;
    public final long e;
    public final boolean f18701f;
    public final int h;
    public final int f18702n;
    public final long f18703r;

    public vi(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i10, int i11, long j12, int i12) {
        this.f18698a = i12;
        this.f18699b = charSequence;
        this.f18700c = accountInstance;
        this.d = j10;
        this.e = j11;
        this.f18701f = z10;
        this.h = i10;
        this.f18702n = i11;
        this.f18703r = j12;
    }

    @Override
    public final void run() {
        switch (this.f18698a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f18699b, this.f18700c, this.d, this.e, this.f18701f, this.h, this.f18702n, this.f18703r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f18699b, this.f18700c, this.d, this.e, this.f18701f, this.h, this.f18702n, this.f18703r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f18699b, this.f18700c, this.d, this.e, this.f18701f, this.h, this.f18702n, this.f18703r);
                return;
        }
    }
}
