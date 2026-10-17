package org.telegram.messenger;
public final class oi implements Runnable {
    public final int f19207a;
    public final CharSequence f19208b;
    public final AccountInstance f19209c;
    public final long d;
    public final long e;
    public final boolean f19210f;
    public final int h;
    public final int f19211n;
    public final long f19212r;

    public oi(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i10, int i11, long j12, int i12) {
        this.f19207a = i12;
        this.f19208b = charSequence;
        this.f19209c = accountInstance;
        this.d = j10;
        this.e = j11;
        this.f19210f = z10;
        this.h = i10;
        this.f19211n = i11;
        this.f19212r = j12;
    }

    @Override
    public final void run() {
        switch (this.f19207a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f19208b, this.f19209c, this.d, this.e, this.f19210f, this.h, this.f19211n, this.f19212r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f19208b, this.f19209c, this.d, this.e, this.f19210f, this.h, this.f19211n, this.f19212r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f19208b, this.f19209c, this.d, this.e, this.f19210f, this.h, this.f19211n, this.f19212r);
                return;
        }
    }
}
