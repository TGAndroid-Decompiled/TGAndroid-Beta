package org.telegram.messenger;
public final class al implements Runnable {
    public final int f15693a;
    public final TranslateController f15694b;
    public final String f15695c;
    public final MessageObject d;
    public final long e;
    public final int f15696f;

    public al(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f15693a = i11;
        this.f15694b = translateController;
        this.f15695c = str;
        this.d = messageObject;
        this.e = j3;
        this.f15696f = i10;
    }

    @Override
    public final void run() {
        switch (this.f15693a) {
            case 0:
                long j3 = this.e;
                int i10 = this.f15696f;
                this.f15694b.lambda$checkLanguage$16(this.f15695c, this.d, j3, i10);
                return;
            default:
                long j10 = this.e;
                int i11 = this.f15696f;
                this.f15694b.lambda$checkLanguage$12(this.f15695c, this.d, j10, i11);
                return;
        }
    }
}
