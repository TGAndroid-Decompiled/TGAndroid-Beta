package org.telegram.messenger;
public final class oi implements Runnable {
    public final int f18662a;
    public final CharSequence f18663b;
    public final AccountInstance f18664c;
    public final long d;
    public final long f18665e;
    public final boolean f18666f;
    public final int h;
    public final int f18667n;
    public final long f18668r;

    public oi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f18662a = i12;
        this.f18663b = charSequence;
        this.f18664c = accountInstance;
        this.d = j3;
        this.f18665e = j10;
        this.f18666f = z10;
        this.h = i10;
        this.f18667n = i11;
        this.f18668r = j11;
    }

    @Override
    public final void run() {
        switch (this.f18662a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f18663b, this.f18664c, this.d, this.f18665e, this.f18666f, this.h, this.f18667n, this.f18668r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f18663b, this.f18664c, this.d, this.f18665e, this.f18666f, this.h, this.f18667n, this.f18668r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f18663b, this.f18664c, this.d, this.f18665e, this.f18666f, this.h, this.f18667n, this.f18668r);
                return;
        }
    }
}
