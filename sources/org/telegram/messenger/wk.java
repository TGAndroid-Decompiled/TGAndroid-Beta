package org.telegram.messenger;
public final class wk implements Runnable {
    public final int f20023a;
    public final TranslateController f20024b;
    public final String f20025c;
    public final MessageObject d;
    public final long e;
    public final int f20026f;

    public wk(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f20023a = i11;
        this.f20024b = translateController;
        this.f20025c = str;
        this.d = messageObject;
        this.e = j10;
        this.f20026f = i10;
    }

    @Override
    public final void run() {
        switch (this.f20023a) {
            case 0:
                long j10 = this.e;
                int i10 = this.f20026f;
                this.f20024b.lambda$checkLanguage$16(this.f20025c, this.d, j10, i10);
                return;
            default:
                long j11 = this.e;
                int i11 = this.f20026f;
                this.f20024b.lambda$checkLanguage$12(this.f20025c, this.d, j11, i11);
                return;
        }
    }
}
