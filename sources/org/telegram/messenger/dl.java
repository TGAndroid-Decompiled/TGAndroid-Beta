package org.telegram.messenger;
public final class dl implements Runnable {
    public final int f17118a;
    public final TranslateController f17119b;
    public final String f17120c;
    public final MessageObject d;
    public final long e;
    public final int f17121f;

    public dl(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f17118a = i11;
        this.f17119b = translateController;
        this.f17120c = str;
        this.d = messageObject;
        this.e = j10;
        this.f17121f = i10;
    }

    @Override
    public final void run() {
        switch (this.f17118a) {
            case 0:
                long j10 = this.e;
                int i10 = this.f17121f;
                this.f17119b.lambda$checkLanguage$16(this.f17120c, this.d, j10, i10);
                return;
            default:
                long j11 = this.e;
                int i11 = this.f17121f;
                this.f17119b.lambda$checkLanguage$12(this.f17120c, this.d, j11, i11);
                return;
        }
    }
}
