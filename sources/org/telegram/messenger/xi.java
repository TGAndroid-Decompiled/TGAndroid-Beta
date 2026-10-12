package org.telegram.messenger;
public final class xi implements Runnable {
    public final int f19590a;
    public final CharSequence f19591b;
    public final AccountInstance f19592c;
    public final long d;
    public final long f19593e;
    public final boolean f19594f;
    public final int h;
    public final int f19595n;
    public final long f19596r;

    public xi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f19590a = i12;
        this.f19591b = charSequence;
        this.f19592c = accountInstance;
        this.d = j3;
        this.f19593e = j10;
        this.f19594f = z10;
        this.h = i10;
        this.f19595n = i11;
        this.f19596r = j11;
    }

    @Override
    public final void run() {
        switch (this.f19590a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f19591b, this.f19592c, this.d, this.f19593e, this.f19594f, this.h, this.f19595n, this.f19596r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f19591b, this.f19592c, this.d, this.f19593e, this.f19594f, this.h, this.f19595n, this.f19596r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f19591b, this.f19592c, this.d, this.f19593e, this.f19594f, this.h, this.f19595n, this.f19596r);
                return;
        }
    }
}
