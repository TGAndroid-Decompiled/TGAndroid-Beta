package org.telegram.messenger;
public final class cl implements Runnable {
    public final int f17006a;
    public final TranslateController f17007b;
    public final String f17008c;
    public final MessageObject d;
    public final long e;
    public final int f17009f;

    public cl(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f17006a = i11;
        this.f17007b = translateController;
        this.f17008c = str;
        this.d = messageObject;
        this.e = j10;
        this.f17009f = i10;
    }

    @Override
    public final void run() {
        switch (this.f17006a) {
            case 0:
                long j10 = this.e;
                int i10 = this.f17009f;
                this.f17007b.lambda$checkLanguage$16(this.f17008c, this.d, j10, i10);
                return;
            default:
                long j11 = this.e;
                int i11 = this.f17009f;
                this.f17007b.lambda$checkLanguage$12(this.f17008c, this.d, j11, i11);
                return;
        }
    }
}
