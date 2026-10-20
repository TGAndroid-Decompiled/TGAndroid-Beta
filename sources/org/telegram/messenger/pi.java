package org.telegram.messenger;
public final class pi implements Runnable {
    public final int f19279a;
    public final CharSequence f19280b;
    public final AccountInstance f19281c;
    public final long d;
    public final long e;
    public final boolean f19282f;
    public final int h;
    public final int f19283n;
    public final long f19284r;

    public pi(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i10, int i11, long j12, int i12) {
        this.f19279a = i12;
        this.f19280b = charSequence;
        this.f19281c = accountInstance;
        this.d = j10;
        this.e = j11;
        this.f19282f = z10;
        this.h = i10;
        this.f19283n = i11;
        this.f19284r = j12;
    }

    @Override
    public final void run() {
        switch (this.f19279a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f19280b, this.f19281c, this.d, this.e, this.f19282f, this.h, this.f19283n, this.f19284r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f19280b, this.f19281c, this.d, this.e, this.f19282f, this.h, this.f19283n, this.f19284r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f19280b, this.f19281c, this.d, this.e, this.f19282f, this.h, this.f19283n, this.f19284r);
                return;
        }
    }
}
