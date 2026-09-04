package org.telegram.messenger;
public final class al implements Runnable {
    public final int f17182a;
    public final TranslateController f17183b;
    public final String f17184c;
    public final MessageObject d;
    public final long f17185e;
    public final int f17186f;

    public al(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f17182a = i11;
        this.f17183b = translateController;
        this.f17184c = str;
        this.d = messageObject;
        this.f17185e = j3;
        this.f17186f = i10;
    }

    @Override
    public final void run() {
        switch (this.f17182a) {
            case 0:
                long j3 = this.f17185e;
                int i10 = this.f17186f;
                this.f17183b.lambda$checkLanguage$16(this.f17184c, this.d, j3, i10);
                return;
            default:
                long j10 = this.f17185e;
                int i11 = this.f17186f;
                this.f17183b.lambda$checkLanguage$12(this.f17184c, this.d, j10, i11);
                return;
        }
    }
}
