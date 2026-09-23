package org.telegram.messenger;
public final class oi implements Runnable {
    public final int f16973a;
    public final CharSequence f16974b;
    public final AccountInstance f16975c;
    public final long d;
    public final long e;
    public final boolean f16976f;
    public final int h;
    public final int f16977n;
    public final long f16978r;

    public oi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f16973a = i12;
        this.f16974b = charSequence;
        this.f16975c = accountInstance;
        this.d = j3;
        this.e = j10;
        this.f16976f = z10;
        this.h = i10;
        this.f16977n = i11;
        this.f16978r = j11;
    }

    @Override
    public final void run() {
        switch (this.f16973a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f16974b, this.f16975c, this.d, this.e, this.f16976f, this.h, this.f16977n, this.f16978r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f16974b, this.f16975c, this.d, this.e, this.f16976f, this.h, this.f16977n, this.f16978r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f16974b, this.f16975c, this.d, this.e, this.f16976f, this.h, this.f16977n, this.f16978r);
                return;
        }
    }
}
