package org.telegram.messenger;
public final class cl implements Runnable {
    public final int f18437a;
    public final TranslateController f18438b;
    public final String f18439c;
    public final MessageObject d;
    public final long f18440e;
    public final int f18441f;

    public cl(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f18437a = i11;
        this.f18438b = translateController;
        this.f18439c = str;
        this.d = messageObject;
        this.f18440e = j10;
        this.f18441f = i10;
    }

    @Override
    public final void run() {
        switch (this.f18437a) {
            case 0:
                long j10 = this.f18440e;
                int i10 = this.f18441f;
                this.f18438b.lambda$checkLanguage$16(this.f18439c, this.d, j10, i10);
                return;
            default:
                long j11 = this.f18440e;
                int i11 = this.f18441f;
                this.f18438b.lambda$checkLanguage$12(this.f18439c, this.d, j11, i11);
                return;
        }
    }
}
