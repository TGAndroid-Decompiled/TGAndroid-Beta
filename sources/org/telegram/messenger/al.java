package org.telegram.messenger;
public final class al implements Runnable {
    public final int f17209a;
    public final TranslateController f17210b;
    public final String f17211c;
    public final MessageObject d;
    public final long f17212e;
    public final int f17213f;

    public al(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f17209a = i11;
        this.f17210b = translateController;
        this.f17211c = str;
        this.d = messageObject;
        this.f17212e = j3;
        this.f17213f = i10;
    }

    @Override
    public final void run() {
        switch (this.f17209a) {
            case 0:
                long j3 = this.f17212e;
                int i10 = this.f17213f;
                this.f17210b.lambda$checkLanguage$16(this.f17211c, this.d, j3, i10);
                return;
            default:
                long j10 = this.f17212e;
                int i11 = this.f17213f;
                this.f17210b.lambda$checkLanguage$12(this.f17211c, this.d, j10, i11);
                return;
        }
    }
}
