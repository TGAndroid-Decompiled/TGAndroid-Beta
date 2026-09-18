package org.telegram.messenger;
public final class al implements Runnable {
    public final int f15706a;
    public final TranslateController f15707b;
    public final String f15708c;
    public final MessageObject d;
    public final long e;
    public final int f15709f;

    public al(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f15706a = i11;
        this.f15707b = translateController;
        this.f15708c = str;
        this.d = messageObject;
        this.e = j3;
        this.f15709f = i10;
    }

    @Override
    public final void run() {
        switch (this.f15706a) {
            case 0:
                long j3 = this.e;
                int i10 = this.f15709f;
                this.f15707b.lambda$checkLanguage$16(this.f15708c, this.d, j3, i10);
                return;
            default:
                long j10 = this.e;
                int i11 = this.f15709f;
                this.f15707b.lambda$checkLanguage$12(this.f15708c, this.d, j10, i11);
                return;
        }
    }
}
