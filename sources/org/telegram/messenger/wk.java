package org.telegram.messenger;
public final class wk implements Runnable {
    public final int f20019a;
    public final TranslateController f20020b;
    public final String f20021c;
    public final MessageObject d;
    public final long e;
    public final int f20022f;

    public wk(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f20019a = i11;
        this.f20020b = translateController;
        this.f20021c = str;
        this.d = messageObject;
        this.e = j10;
        this.f20022f = i10;
    }

    @Override
    public final void run() {
        switch (this.f20019a) {
            case 0:
                long j10 = this.e;
                int i10 = this.f20022f;
                this.f20020b.lambda$checkLanguage$16(this.f20021c, this.d, j10, i10);
                return;
            default:
                long j11 = this.e;
                int i11 = this.f20022f;
                this.f20020b.lambda$checkLanguage$12(this.f20021c, this.d, j11, i11);
                return;
        }
    }
}
