package org.telegram.messenger;
public final class cl implements Runnable {
    public final int f16991a;
    public final TranslateController f16992b;
    public final String f16993c;
    public final MessageObject d;
    public final long e;
    public final int f16994f;

    public cl(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f16991a = i11;
        this.f16992b = translateController;
        this.f16993c = str;
        this.d = messageObject;
        this.e = j10;
        this.f16994f = i10;
    }

    @Override
    public final void run() {
        switch (this.f16991a) {
            case 0:
                long j10 = this.e;
                int i10 = this.f16994f;
                this.f16992b.lambda$checkLanguage$16(this.f16993c, this.d, j10, i10);
                return;
            default:
                long j11 = this.e;
                int i11 = this.f16994f;
                this.f16992b.lambda$checkLanguage$12(this.f16993c, this.d, j11, i11);
                return;
        }
    }
}
