package org.telegram.messenger;
public final class pi implements Runnable {
    public final int f19276a;
    public final CharSequence f19277b;
    public final AccountInstance f19278c;
    public final long d;
    public final long e;
    public final boolean f19279f;
    public final int h;
    public final int f19280n;
    public final long f19281r;

    public pi(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i10, int i11, long j12, int i12) {
        this.f19276a = i12;
        this.f19277b = charSequence;
        this.f19278c = accountInstance;
        this.d = j10;
        this.e = j11;
        this.f19279f = z10;
        this.h = i10;
        this.f19280n = i11;
        this.f19281r = j12;
    }

    @Override
    public final void run() {
        switch (this.f19276a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f19277b, this.f19278c, this.d, this.e, this.f19279f, this.h, this.f19280n, this.f19281r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f19277b, this.f19278c, this.d, this.e, this.f19279f, this.h, this.f19280n, this.f19281r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f19277b, this.f19278c, this.d, this.e, this.f19279f, this.h, this.f19280n, this.f19281r);
                return;
        }
    }
}
