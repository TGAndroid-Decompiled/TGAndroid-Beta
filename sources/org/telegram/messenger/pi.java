package org.telegram.messenger;
public final class pi implements Runnable {
    public final int f18719a;
    public final CharSequence f18720b;
    public final AccountInstance f18721c;
    public final long d;
    public final long f18722e;
    public final boolean f18723f;
    public final int h;
    public final int f18724n;
    public final long f18725r;

    public pi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f18719a = i12;
        this.f18720b = charSequence;
        this.f18721c = accountInstance;
        this.d = j3;
        this.f18722e = j10;
        this.f18723f = z10;
        this.h = i10;
        this.f18724n = i11;
        this.f18725r = j11;
    }

    @Override
    public final void run() {
        switch (this.f18719a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f18720b, this.f18721c, this.d, this.f18722e, this.f18723f, this.h, this.f18724n, this.f18725r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f18720b, this.f18721c, this.d, this.f18722e, this.f18723f, this.h, this.f18724n, this.f18725r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f18720b, this.f18721c, this.d, this.f18722e, this.f18723f, this.h, this.f18724n, this.f18725r);
                return;
        }
    }
}
