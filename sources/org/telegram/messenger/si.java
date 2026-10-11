package org.telegram.messenger;
public final class si implements Runnable {
    public final int f19176a;
    public final CharSequence f19177b;
    public final AccountInstance f19178c;
    public final long d;
    public final long f19179e;
    public final boolean f19180f;
    public final int h;
    public final int f19181n;
    public final long f19182r;

    public si(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f19176a = i12;
        this.f19177b = charSequence;
        this.f19178c = accountInstance;
        this.d = j3;
        this.f19179e = j10;
        this.f19180f = z10;
        this.h = i10;
        this.f19181n = i11;
        this.f19182r = j11;
    }

    @Override
    public final void run() {
        switch (this.f19176a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f19177b, this.f19178c, this.d, this.f19179e, this.f19180f, this.h, this.f19181n, this.f19182r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f19177b, this.f19178c, this.d, this.f19179e, this.f19180f, this.h, this.f19181n, this.f19182r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f19177b, this.f19178c, this.d, this.f19179e, this.f19180f, this.h, this.f19181n, this.f19182r);
                return;
        }
    }
}
