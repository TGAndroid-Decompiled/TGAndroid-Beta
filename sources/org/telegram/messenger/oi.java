package org.telegram.messenger;
public final class oi implements Runnable {
    public final int f19186a;
    public final CharSequence f19187b;
    public final AccountInstance f19188c;
    public final long d;
    public final long e;
    public final boolean f19189f;
    public final int h;
    public final int f19190n;
    public final long f19191r;

    public oi(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i10, int i11, long j12, int i12) {
        this.f19186a = i12;
        this.f19187b = charSequence;
        this.f19188c = accountInstance;
        this.d = j10;
        this.e = j11;
        this.f19189f = z10;
        this.h = i10;
        this.f19190n = i11;
        this.f19191r = j12;
    }

    @Override
    public final void run() {
        switch (this.f19186a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f19187b, this.f19188c, this.d, this.e, this.f19189f, this.h, this.f19190n, this.f19191r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f19187b, this.f19188c, this.d, this.e, this.f19189f, this.h, this.f19190n, this.f19191r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f19187b, this.f19188c, this.d, this.e, this.f19189f, this.h, this.f19190n, this.f19191r);
                return;
        }
    }
}
