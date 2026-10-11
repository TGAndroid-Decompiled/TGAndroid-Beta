package org.telegram.messenger;
public final class si implements Runnable {
    public final int f19212a;
    public final CharSequence f19213b;
    public final AccountInstance f19214c;
    public final long d;
    public final long f19215e;
    public final boolean f19216f;
    public final int h;
    public final int f19217n;
    public final long f19218r;

    public si(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f19212a = i12;
        this.f19213b = charSequence;
        this.f19214c = accountInstance;
        this.d = j3;
        this.f19215e = j10;
        this.f19216f = z10;
        this.h = i10;
        this.f19217n = i11;
        this.f19218r = j11;
    }

    @Override
    public final void run() {
        switch (this.f19212a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f19213b, this.f19214c, this.d, this.f19215e, this.f19216f, this.h, this.f19217n, this.f19218r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f19213b, this.f19214c, this.d, this.f19215e, this.f19216f, this.h, this.f19217n, this.f19218r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f19213b, this.f19214c, this.d, this.f19215e, this.f19216f, this.h, this.f19217n, this.f19218r);
                return;
        }
    }
}
