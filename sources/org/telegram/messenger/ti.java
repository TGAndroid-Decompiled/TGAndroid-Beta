package org.telegram.messenger;
public final class ti implements Runnable {
    public final int f19263a;
    public final CharSequence f19264b;
    public final AccountInstance f19265c;
    public final long d;
    public final long f19266e;
    public final boolean f19267f;
    public final int h;
    public final int f19268n;
    public final long f19269r;

    public ti(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f19263a = i12;
        this.f19264b = charSequence;
        this.f19265c = accountInstance;
        this.d = j3;
        this.f19266e = j10;
        this.f19267f = z10;
        this.h = i10;
        this.f19268n = i11;
        this.f19269r = j11;
    }

    @Override
    public final void run() {
        switch (this.f19263a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f19264b, this.f19265c, this.d, this.f19266e, this.f19267f, this.h, this.f19268n, this.f19269r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f19264b, this.f19265c, this.d, this.f19266e, this.f19267f, this.h, this.f19268n, this.f19269r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f19264b, this.f19265c, this.d, this.f19266e, this.f19267f, this.h, this.f19268n, this.f19269r);
                return;
        }
    }
}
