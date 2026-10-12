package org.telegram.messenger;
public final class gl implements Runnable {
    public final int f17730a;
    public final TranslateController f17731b;
    public final String f17732c;
    public final MessageObject d;
    public final long f17733e;
    public final int f17734f;

    public gl(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f17730a = i11;
        this.f17731b = translateController;
        this.f17732c = str;
        this.d = messageObject;
        this.f17733e = j3;
        this.f17734f = i10;
    }

    @Override
    public final void run() {
        switch (this.f17730a) {
            case 0:
                long j3 = this.f17733e;
                int i10 = this.f17734f;
                this.f17731b.lambda$checkLanguage$16(this.f17732c, this.d, j3, i10);
                return;
            default:
                long j10 = this.f17733e;
                int i11 = this.f17734f;
                this.f17731b.lambda$checkLanguage$12(this.f17732c, this.d, j10, i11);
                return;
        }
    }
}
