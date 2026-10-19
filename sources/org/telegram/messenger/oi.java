package org.telegram.messenger;
public final class oi implements Runnable {
    public final int f19189a;
    public final CharSequence f19190b;
    public final AccountInstance f19191c;
    public final long d;
    public final long e;
    public final boolean f19192f;
    public final int h;
    public final int f19193n;
    public final long f19194r;

    public oi(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i10, int i11, long j12, int i12) {
        this.f19189a = i12;
        this.f19190b = charSequence;
        this.f19191c = accountInstance;
        this.d = j10;
        this.e = j11;
        this.f19192f = z10;
        this.h = i10;
        this.f19193n = i11;
        this.f19194r = j12;
    }

    @Override
    public final void run() {
        switch (this.f19189a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f19190b, this.f19191c, this.d, this.e, this.f19192f, this.h, this.f19193n, this.f19194r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f19190b, this.f19191c, this.d, this.e, this.f19192f, this.h, this.f19193n, this.f19194r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f19190b, this.f19191c, this.d, this.e, this.f19192f, this.h, this.f19193n, this.f19194r);
                return;
        }
    }
}
