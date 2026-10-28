package org.telegram.messenger;
public final class ui implements Runnable {
    public final int f21453a;
    public final CharSequence f21454b;
    public final AccountInstance f21455c;
    public final long d;
    public final long e;
    public final boolean f21456f;
    public final int h;
    public final int f21457n;
    public final long f21458r;

    public ui(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i10, int i11, long j12, int i12) {
        this.f21453a = i12;
        this.f21454b = charSequence;
        this.f21455c = accountInstance;
        this.d = j10;
        this.e = j11;
        this.f21456f = z10;
        this.h = i10;
        this.f21457n = i11;
        this.f21458r = j12;
    }

    @Override
    public final void run() {
        switch (this.f21453a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f21454b, this.f21455c, this.d, this.e, this.f21456f, this.h, this.f21457n, this.f21458r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f21454b, this.f21455c, this.d, this.e, this.f21456f, this.h, this.f21457n, this.f21458r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f21454b, this.f21455c, this.d, this.e, this.f21456f, this.h, this.f21457n, this.f21458r);
                return;
        }
    }
}
