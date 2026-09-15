package org.telegram.messenger;
public final class al implements Runnable {
    public final int f15697a;
    public final TranslateController f15698b;
    public final String f15699c;
    public final MessageObject d;
    public final long e;
    public final int f15700f;

    public al(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f15697a = i11;
        this.f15698b = translateController;
        this.f15699c = str;
        this.d = messageObject;
        this.e = j3;
        this.f15700f = i10;
    }

    @Override
    public final void run() {
        switch (this.f15697a) {
            case 0:
                long j3 = this.e;
                int i10 = this.f15700f;
                this.f15698b.lambda$checkLanguage$16(this.f15699c, this.d, j3, i10);
                return;
            default:
                long j10 = this.e;
                int i11 = this.f15700f;
                this.f15698b.lambda$checkLanguage$12(this.f15699c, this.d, j10, i11);
                return;
        }
    }
}
