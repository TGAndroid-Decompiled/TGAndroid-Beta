package org.telegram.messenger;
public final class gi implements Runnable {
    public final int f20408a;
    public final CharSequence f20409b;
    public final AccountInstance f20410c;
    public final long d;
    public final long f20411e;
    public final boolean f20412f;
    public final int h;
    public final int f20413n;
    public final long f20414r;

    public gi(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i9, int i10, long j12, int i11) {
        this.f20408a = i11;
        this.f20409b = charSequence;
        this.f20410c = accountInstance;
        this.d = j10;
        this.f20411e = j11;
        this.f20412f = z10;
        this.h = i9;
        this.f20413n = i10;
        this.f20414r = j12;
    }

    @Override
    public final void run() {
        switch (this.f20408a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f20409b, this.f20410c, this.d, this.f20411e, this.f20412f, this.h, this.f20413n, this.f20414r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f20409b, this.f20410c, this.d, this.f20411e, this.f20412f, this.h, this.f20413n, this.f20414r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f20409b, this.f20410c, this.d, this.f20411e, this.f20412f, this.h, this.f20413n, this.f20414r);
                return;
        }
    }
}
