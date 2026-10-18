package org.telegram.messenger;
public final class wk implements Runnable {
    public final int f20025a;
    public final TranslateController f20026b;
    public final String f20027c;
    public final MessageObject d;
    public final long e;
    public final int f20028f;

    public wk(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f20025a = i11;
        this.f20026b = translateController;
        this.f20027c = str;
        this.d = messageObject;
        this.e = j10;
        this.f20028f = i10;
    }

    @Override
    public final void run() {
        switch (this.f20025a) {
            case 0:
                long j10 = this.e;
                int i10 = this.f20028f;
                this.f20026b.lambda$checkLanguage$16(this.f20027c, this.d, j10, i10);
                return;
            default:
                long j11 = this.e;
                int i11 = this.f20028f;
                this.f20026b.lambda$checkLanguage$12(this.f20027c, this.d, j11, i11);
                return;
        }
    }
}
