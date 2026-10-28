package org.telegram.messenger;
public final class cl implements Runnable {
    public final int f19850a;
    public final TranslateController f19851b;
    public final String f19852c;
    public final MessageObject d;
    public final long e;
    public final int f19853f;

    public cl(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f19850a = i11;
        this.f19851b = translateController;
        this.f19852c = str;
        this.d = messageObject;
        this.e = j10;
        this.f19853f = i10;
    }

    @Override
    public final void run() {
        switch (this.f19850a) {
            case 0:
                long j10 = this.e;
                int i10 = this.f19853f;
                this.f19851b.lambda$checkLanguage$16(this.f19852c, this.d, j10, i10);
                return;
            default:
                long j11 = this.e;
                int i11 = this.f19853f;
                this.f19851b.lambda$checkLanguage$12(this.f19852c, this.d, j11, i11);
                return;
        }
    }
}
