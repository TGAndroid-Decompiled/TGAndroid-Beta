package org.telegram.messenger;
public final class al implements Runnable {
    public final int f15933a;
    public final TranslateController f15934b;
    public final String f15935c;
    public final MessageObject d;
    public final long e;
    public final int f15936f;

    public al(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f15933a = i11;
        this.f15934b = translateController;
        this.f15935c = str;
        this.d = messageObject;
        this.e = j3;
        this.f15936f = i10;
    }

    @Override
    public final void run() {
        switch (this.f15933a) {
            case 0:
                long j3 = this.e;
                int i10 = this.f15936f;
                this.f15934b.lambda$checkLanguage$16(this.f15935c, this.d, j3, i10);
                return;
            default:
                long j10 = this.e;
                int i11 = this.f15936f;
                this.f15934b.lambda$checkLanguage$12(this.f15935c, this.d, j10, i11);
                return;
        }
    }
}
