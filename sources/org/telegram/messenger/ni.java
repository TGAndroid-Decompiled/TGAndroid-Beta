package org.telegram.messenger;
public final class ni implements Runnable {
    public final int f19113a;
    public final CharSequence f19114b;
    public final AccountInstance f19115c;
    public final long d;
    public final long e;
    public final boolean f19116f;
    public final int h;
    public final int f19117n;
    public final long f19118r;

    public ni(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i10, int i11, long j12, int i12) {
        this.f19113a = i12;
        this.f19114b = charSequence;
        this.f19115c = accountInstance;
        this.d = j10;
        this.e = j11;
        this.f19116f = z10;
        this.h = i10;
        this.f19117n = i11;
        this.f19118r = j12;
    }

    @Override
    public final void run() {
        switch (this.f19113a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f19114b, this.f19115c, this.d, this.e, this.f19116f, this.h, this.f19117n, this.f19118r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f19114b, this.f19115c, this.d, this.e, this.f19116f, this.h, this.f19117n, this.f19118r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f19114b, this.f19115c, this.d, this.e, this.f19116f, this.h, this.f19117n, this.f19118r);
                return;
        }
    }
}
