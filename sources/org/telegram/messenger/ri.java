package org.telegram.messenger;
public final class ri implements Runnable {
    public final int f18331a;
    public final CharSequence f18332b;
    public final AccountInstance f18333c;
    public final long d;
    public final long e;
    public final boolean f18334f;
    public final int h;
    public final int f18335n;
    public final long f18336r;

    public ri(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z4, int i10, int i11, long j12, int i12) {
        this.f18331a = i12;
        this.f18332b = charSequence;
        this.f18333c = accountInstance;
        this.d = j10;
        this.e = j11;
        this.f18334f = z4;
        this.h = i10;
        this.f18335n = i11;
        this.f18336r = j12;
    }

    @Override
    public final void run() {
        switch (this.f18331a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f18332b, this.f18333c, this.d, this.e, this.f18334f, this.h, this.f18335n, this.f18336r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f18332b, this.f18333c, this.d, this.e, this.f18334f, this.h, this.f18335n, this.f18336r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f18332b, this.f18333c, this.d, this.e, this.f18334f, this.h, this.f18335n, this.f18336r);
                return;
        }
    }
}
