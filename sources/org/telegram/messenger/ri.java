package org.telegram.messenger;
public final class ri implements Runnable {
    public final int f19482a;
    public final CharSequence f19483b;
    public final AccountInstance f19484c;
    public final long d;
    public final long e;
    public final boolean f19485f;
    public final int h;
    public final int f19486n;
    public final long f19487r;

    public ri(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i10, int i11, long j12, int i12) {
        this.f19482a = i12;
        this.f19483b = charSequence;
        this.f19484c = accountInstance;
        this.d = j10;
        this.e = j11;
        this.f19485f = z10;
        this.h = i10;
        this.f19486n = i11;
        this.f19487r = j12;
    }

    @Override
    public final void run() {
        switch (this.f19482a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f19483b, this.f19484c, this.d, this.e, this.f19485f, this.h, this.f19486n, this.f19487r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f19483b, this.f19484c, this.d, this.e, this.f19485f, this.h, this.f19486n, this.f19487r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f19483b, this.f19484c, this.d, this.e, this.f19485f, this.h, this.f19486n, this.f19487r);
                return;
        }
    }
}
