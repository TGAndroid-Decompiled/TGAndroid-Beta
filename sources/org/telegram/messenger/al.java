package org.telegram.messenger;
public final class al implements Runnable {
    public final int f17380a;
    public final TranslateController f17381b;
    public final String f17382c;
    public final MessageObject d;
    public final long f17383e;
    public final int f17384f;

    public al(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f17380a = i11;
        this.f17381b = translateController;
        this.f17382c = str;
        this.d = messageObject;
        this.f17383e = j3;
        this.f17384f = i10;
    }

    @Override
    public final void run() {
        switch (this.f17380a) {
            case 0:
                long j3 = this.f17383e;
                int i10 = this.f17384f;
                this.f17381b.lambda$checkLanguage$16(this.f17382c, this.d, j3, i10);
                return;
            default:
                long j10 = this.f17383e;
                int i11 = this.f17384f;
                this.f17381b.lambda$checkLanguage$12(this.f17382c, this.d, j10, i11);
                return;
        }
    }
}
