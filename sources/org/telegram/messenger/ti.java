package org.telegram.messenger;
public final class ti implements Runnable {
    public final int f19259a;
    public final CharSequence f19260b;
    public final AccountInstance f19261c;
    public final long d;
    public final long f19262e;
    public final boolean f19263f;
    public final int h;
    public final int f19264n;
    public final long f19265r;

    public ti(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f19259a = i12;
        this.f19260b = charSequence;
        this.f19261c = accountInstance;
        this.d = j3;
        this.f19262e = j10;
        this.f19263f = z10;
        this.h = i10;
        this.f19264n = i11;
        this.f19265r = j11;
    }

    @Override
    public final void run() {
        switch (this.f19259a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f19260b, this.f19261c, this.d, this.f19262e, this.f19263f, this.h, this.f19264n, this.f19265r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f19260b, this.f19261c, this.d, this.f19262e, this.f19263f, this.h, this.f19264n, this.f19265r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f19260b, this.f19261c, this.d, this.f19262e, this.f19263f, this.h, this.f19264n, this.f19265r);
                return;
        }
    }
}
