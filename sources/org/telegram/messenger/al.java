package org.telegram.messenger;
public final class al implements Runnable {
    public final int f17376a;
    public final TranslateController f17377b;
    public final String f17378c;
    public final MessageObject d;
    public final long f17379e;
    public final int f17380f;

    public al(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f17376a = i11;
        this.f17377b = translateController;
        this.f17378c = str;
        this.d = messageObject;
        this.f17379e = j3;
        this.f17380f = i10;
    }

    @Override
    public final void run() {
        switch (this.f17376a) {
            case 0:
                long j3 = this.f17379e;
                int i10 = this.f17380f;
                this.f17377b.lambda$checkLanguage$16(this.f17378c, this.d, j3, i10);
                return;
            default:
                long j10 = this.f17379e;
                int i11 = this.f17380f;
                this.f17377b.lambda$checkLanguage$12(this.f17378c, this.d, j10, i11);
                return;
        }
    }
}
