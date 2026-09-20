package org.telegram.messenger;
public final class al implements Runnable {
    public final int f15918a;
    public final TranslateController f15919b;
    public final String f15920c;
    public final MessageObject d;
    public final long e;
    public final int f15921f;

    public al(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f15918a = i11;
        this.f15919b = translateController;
        this.f15920c = str;
        this.d = messageObject;
        this.e = j3;
        this.f15921f = i10;
    }

    @Override
    public final void run() {
        switch (this.f15918a) {
            case 0:
                long j3 = this.e;
                int i10 = this.f15921f;
                this.f15919b.lambda$checkLanguage$16(this.f15920c, this.d, j3, i10);
                return;
            default:
                long j10 = this.e;
                int i11 = this.f15921f;
                this.f15919b.lambda$checkLanguage$12(this.f15920c, this.d, j10, i11);
                return;
        }
    }
}
