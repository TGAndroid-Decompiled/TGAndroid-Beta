package org.telegram.messenger;
public final class al implements Runnable {
    public final int f15881a;
    public final TranslateController f15882b;
    public final String f15883c;
    public final MessageObject d;
    public final long e;
    public final int f15884f;

    public al(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f15881a = i11;
        this.f15882b = translateController;
        this.f15883c = str;
        this.d = messageObject;
        this.e = j3;
        this.f15884f = i10;
    }

    @Override
    public final void run() {
        switch (this.f15881a) {
            case 0:
                long j3 = this.e;
                int i10 = this.f15884f;
                this.f15882b.lambda$checkLanguage$16(this.f15883c, this.d, j3, i10);
                return;
            default:
                long j10 = this.e;
                int i11 = this.f15884f;
                this.f15882b.lambda$checkLanguage$12(this.f15883c, this.d, j10, i11);
                return;
        }
    }
}
