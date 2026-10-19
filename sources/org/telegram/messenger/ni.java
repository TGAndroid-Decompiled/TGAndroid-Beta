package org.telegram.messenger;
public final class ni implements Runnable {
    public final int f19110a;
    public final CharSequence f19111b;
    public final AccountInstance f19112c;
    public final long d;
    public final long e;
    public final boolean f19113f;
    public final int h;
    public final int f19114n;
    public final long f19115r;

    public ni(CharSequence charSequence, AccountInstance accountInstance, long j10, long j11, boolean z10, int i10, int i11, long j12, int i12) {
        this.f19110a = i12;
        this.f19111b = charSequence;
        this.f19112c = accountInstance;
        this.d = j10;
        this.e = j11;
        this.f19113f = z10;
        this.h = i10;
        this.f19114n = i11;
        this.f19115r = j12;
    }

    @Override
    public final void run() {
        switch (this.f19110a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingText$129(this.f19111b, this.f19112c, this.d, this.e, this.f19113f, this.h, this.f19114n, this.f19115r);
                return;
            case 1:
                SendMessagesHelper.lambda$prepareSendingText$127(this.f19111b, this.f19112c, this.d, this.e, this.f19113f, this.h, this.f19114n, this.f19115r);
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingText$128(this.f19111b, this.f19112c, this.d, this.e, this.f19113f, this.h, this.f19114n, this.f19115r);
                return;
        }
    }
}
