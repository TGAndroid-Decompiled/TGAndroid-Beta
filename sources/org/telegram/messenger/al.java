package org.telegram.messenger;
public final class al implements Runnable {
    public final int f17373a;
    public final TranslateController f17374b;
    public final String f17375c;
    public final MessageObject d;
    public final long f17376e;
    public final int f17377f;

    public al(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f17373a = i11;
        this.f17374b = translateController;
        this.f17375c = str;
        this.d = messageObject;
        this.f17376e = j3;
        this.f17377f = i10;
    }

    @Override
    public final void run() {
        switch (this.f17373a) {
            case 0:
                long j3 = this.f17376e;
                int i10 = this.f17377f;
                this.f17374b.lambda$checkLanguage$16(this.f17375c, this.d, j3, i10);
                return;
            default:
                long j10 = this.f17376e;
                int i11 = this.f17377f;
                this.f17374b.lambda$checkLanguage$12(this.f17375c, this.d, j10, i11);
                return;
        }
    }
}
