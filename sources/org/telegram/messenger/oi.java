package org.telegram.messenger;
public final class oi implements Runnable {
    public final int f17224a;
    public final CharSequence f17225b;
    public final AccountInstance f17226c;
    public final long d;
    public final long e;
    public final boolean f17227f;
    public final int h;
    public final int f17228n;
    public final long f17229r;

    public oi(CharSequence charSequence, AccountInstance accountInstance, long j3, long j10, boolean z10, int i10, int i11, long j11, int i12) {
        this.f17224a = i12;
        this.f17225b = charSequence;
        this.f17226c = accountInstance;
        this.d = j3;
        this.e = j10;
        this.f17227f = z10;
        this.h = i10;
        this.f17228n = i11;
        this.f17229r = j11;
    }

    @Override
    public final void run() {
        switch (this.f17224a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$126(this.f17225b, this.f17226c, this.d, this.e, this.f17227f, this.h, this.f17228n, this.f17229r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$124(this.f17225b, this.f17226c, this.d, this.e, this.f17227f, this.h, this.f17228n, this.f17229r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$125(this.f17225b, this.f17226c, this.d, this.e, this.f17227f, this.h, this.f17228n, this.f17229r);
                return;
        }
    }
}
