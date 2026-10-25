package org.telegram.messenger;
public final class ti implements Runnable {
    public final int f21351a;
    public final CharSequence f21352b;
    public final AccountInstance f21353c;
    public final long d;
    public final long e;
    public final boolean f21354f;
    public final int h;
    public final int f21355n;
    public final long f21356r;

    public ti(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i10, int i11, long j12, int i12) {
        this.f21351a = i12;
        this.f21352b = charSequence;
        this.f21353c = accountInstance;
        this.d = j10;
        this.e = j11;
        this.f21354f = z10;
        this.h = i10;
        this.f21355n = i11;
        this.f21356r = j12;
    }

    @Override
    public final void run() {
        switch (this.f21351a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f21352b, this.f21353c, this.d, this.e, this.f21354f, this.h, this.f21355n, this.f21356r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f21352b, this.f21353c, this.d, this.e, this.f21354f, this.h, this.f21355n, this.f21356r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f21352b, this.f21353c, this.d, this.e, this.f21354f, this.h, this.f21355n, this.f21356r);
                return;
        }
    }
}
