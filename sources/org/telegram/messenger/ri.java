package org.telegram.messenger;
public final class ri implements Runnable {
    public final int f19412a;
    public final CharSequence f19413b;
    public final AccountInstance f19414c;
    public final long d;
    public final long e;
    public final boolean f19415f;
    public final int h;
    public final int f19416n;
    public final long f19417r;

    public ri(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i10, int i11, long j12, int i12) {
        this.f19412a = i12;
        this.f19413b = charSequence;
        this.f19414c = accountInstance;
        this.d = j10;
        this.e = j11;
        this.f19415f = z10;
        this.h = i10;
        this.f19416n = i11;
        this.f19417r = j12;
    }

    @Override
    public final void run() {
        switch (this.f19412a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f19413b, this.f19414c, this.d, this.e, this.f19415f, this.h, this.f19416n, this.f19417r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f19413b, this.f19414c, this.d, this.e, this.f19415f, this.h, this.f19416n, this.f19417r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f19413b, this.f19414c, this.d, this.e, this.f19415f, this.h, this.f19416n, this.f19417r);
                return;
        }
    }
}
