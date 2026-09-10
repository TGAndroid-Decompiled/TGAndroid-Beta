package org.telegram.messenger;
public final class il implements Runnable {
    public final int f15477a;
    public final TranslateController f15478b;
    public final String f15479c;
    public final MessageObject d;
    public final long e;
    public final int f15480f;

    public il(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f15477a = i11;
        this.f15478b = translateController;
        this.f15479c = str;
        this.d = messageObject;
        this.e = j3;
        this.f15480f = i10;
    }

    @Override
    public final void run() {
        switch (this.f15477a) {
            case 0:
                long j3 = this.e;
                int i10 = this.f15480f;
                this.f15478b.lambda$checkLanguage$16(this.f15479c, this.d, j3, i10);
                return;
            default:
                long j10 = this.e;
                int i11 = this.f15480f;
                this.f15478b.lambda$checkLanguage$12(this.f15479c, this.d, j10, i11);
                return;
        }
    }
}
