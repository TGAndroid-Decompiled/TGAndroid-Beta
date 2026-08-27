package org.telegram.messenger;

public final class ki implements Runnable {

    public final int f20796a;

    public final CharSequence f20797b;

    public final AccountInstance f20798c;
    public final long d;

    public final long f20799e;

    public final boolean f20800f;
    public final int h;

    public final int f20801n;

    public final long f20802r;

    public ki(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i10, int i11, long j12, int i12) {
        this.f20796a = i12;
        this.f20797b = charSequence;
        this.f20798c = accountInstance;
        this.d = j10;
        this.f20799e = j11;
        this.f20800f = z10;
        this.h = i10;
        this.f20801n = i11;
        this.f20802r = j12;
    }

    @Override
    public final void run() {
        switch (this.f20796a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f20797b, this.f20798c, this.d, this.f20799e, this.f20800f, this.h, this.f20801n, this.f20802r);
                break;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f20797b, this.f20798c, this.d, this.f20799e, this.f20800f, this.h, this.f20801n, this.f20802r);
                break;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f20797b, this.f20798c, this.d, this.f20799e, this.f20800f, this.h, this.f20801n, this.f20802r);
                break;
        }
    }
}
