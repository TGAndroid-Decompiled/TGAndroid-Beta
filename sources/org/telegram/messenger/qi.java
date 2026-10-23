package org.telegram.messenger;
public final class qi implements Runnable {
    public final int f19410a;
    public final CharSequence f19411b;
    public final AccountInstance f19412c;
    public final long d;
    public final long e;
    public final boolean f19413f;
    public final int h;
    public final int f19414n;
    public final long f19415r;

    public qi(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i10, int i11, long j12, int i12) {
        this.f19410a = i12;
        this.f19411b = charSequence;
        this.f19412c = accountInstance;
        this.d = j10;
        this.e = j11;
        this.f19413f = z10;
        this.h = i10;
        this.f19414n = i11;
        this.f19415r = j12;
    }

    @Override
    public final void run() {
        switch (this.f19410a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f19411b, this.f19412c, this.d, this.e, this.f19413f, this.h, this.f19414n, this.f19415r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f19411b, this.f19412c, this.d, this.e, this.f19413f, this.h, this.f19414n, this.f19415r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f19411b, this.f19412c, this.d, this.e, this.f19413f, this.h, this.f19414n, this.f19415r);
                return;
        }
    }
}
