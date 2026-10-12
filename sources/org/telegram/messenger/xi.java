package org.telegram.messenger;
public final class xi implements Runnable {
    public final int f19591a;
    public final CharSequence f19592b;
    public final AccountInstance f19593c;
    public final long d;
    public final long f19594e;
    public final boolean f19595f;
    public final int h;
    public final int f19596n;
    public final long f19597r;

    public xi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f19591a = i12;
        this.f19592b = charSequence;
        this.f19593c = accountInstance;
        this.d = j3;
        this.f19594e = j10;
        this.f19595f = z10;
        this.h = i10;
        this.f19596n = i11;
        this.f19597r = j11;
    }

    @Override
    public final void run() {
        switch (this.f19591a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f19592b, this.f19593c, this.d, this.f19594e, this.f19595f, this.h, this.f19596n, this.f19597r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f19592b, this.f19593c, this.d, this.f19594e, this.f19595f, this.h, this.f19596n, this.f19597r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f19592b, this.f19593c, this.d, this.f19594e, this.f19595f, this.h, this.f19596n, this.f19597r);
                return;
        }
    }
}
