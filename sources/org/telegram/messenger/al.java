package org.telegram.messenger;
public final class al implements Runnable {
    public final int f17409a;
    public final TranslateController f17410b;
    public final String f17411c;
    public final MessageObject d;
    public final long f17412e;
    public final int f17413f;

    public al(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f17409a = i11;
        this.f17410b = translateController;
        this.f17411c = str;
        this.d = messageObject;
        this.f17412e = j3;
        this.f17413f = i10;
    }

    @Override
    public final void run() {
        switch (this.f17409a) {
            case 0:
                long j3 = this.f17412e;
                int i10 = this.f17413f;
                this.f17410b.lambda$checkLanguage$16(this.f17411c, this.d, j3, i10);
                return;
            default:
                long j10 = this.f17412e;
                int i11 = this.f17413f;
                this.f17410b.lambda$checkLanguage$12(this.f17411c, this.d, j10, i11);
                return;
        }
    }
}
