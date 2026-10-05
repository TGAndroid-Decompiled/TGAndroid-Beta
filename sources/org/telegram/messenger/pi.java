package org.telegram.messenger;
public final class pi implements Runnable {
    public final int f18916a;
    public final CharSequence f18917b;
    public final AccountInstance f18918c;
    public final long d;
    public final long f18919e;
    public final boolean f18920f;
    public final int h;
    public final int f18921n;
    public final long f18922r;

    public pi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f18916a = i12;
        this.f18917b = charSequence;
        this.f18918c = accountInstance;
        this.d = j3;
        this.f18919e = j10;
        this.f18920f = z10;
        this.h = i10;
        this.f18921n = i11;
        this.f18922r = j11;
    }

    @Override
    public final void run() {
        switch (this.f18916a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f18917b, this.f18918c, this.d, this.f18919e, this.f18920f, this.h, this.f18921n, this.f18922r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f18917b, this.f18918c, this.d, this.f18919e, this.f18920f, this.h, this.f18921n, this.f18922r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f18917b, this.f18918c, this.d, this.f18919e, this.f18920f, this.h, this.f18921n, this.f18922r);
                return;
        }
    }
}
