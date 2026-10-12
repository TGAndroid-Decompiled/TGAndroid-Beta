package org.telegram.messenger;
public final class gl implements Runnable {
    public final int f17729a;
    public final TranslateController f17730b;
    public final String f17731c;
    public final MessageObject d;
    public final long f17732e;
    public final int f17733f;

    public gl(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f17729a = i11;
        this.f17730b = translateController;
        this.f17731c = str;
        this.d = messageObject;
        this.f17732e = j3;
        this.f17733f = i10;
    }

    @Override
    public final void run() {
        switch (this.f17729a) {
            case 0:
                long j3 = this.f17732e;
                int i10 = this.f17733f;
                this.f17730b.lambda$checkLanguage$16(this.f17731c, this.d, j3, i10);
                return;
            default:
                long j10 = this.f17732e;
                int i11 = this.f17733f;
                this.f17730b.lambda$checkLanguage$12(this.f17731c, this.d, j10, i11);
                return;
        }
    }
}
