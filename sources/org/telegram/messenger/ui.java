package org.telegram.messenger;
public final class ui implements Runnable {
    public final int f18305a;
    public final CharSequence f18306b;
    public final AccountInstance f18307c;
    public final long d;
    public final long e;
    public final boolean f18308f;
    public final int h;
    public final int f18309n;
    public final long f18310r;

    public ui(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i10, int i11, long j12, int i12) {
        this.f18305a = i12;
        this.f18306b = charSequence;
        this.f18307c = accountInstance;
        this.d = j10;
        this.e = j11;
        this.f18308f = z10;
        this.h = i10;
        this.f18309n = i11;
        this.f18310r = j12;
    }

    @Override
    public final void run() {
        switch (this.f18305a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f18306b, this.f18307c, this.d, this.e, this.f18308f, this.h, this.f18309n, this.f18310r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f18306b, this.f18307c, this.d, this.e, this.f18308f, this.h, this.f18309n, this.f18310r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f18306b, this.f18307c, this.d, this.e, this.f18308f, this.h, this.f18309n, this.f18310r);
                return;
        }
    }
}
