package org.telegram.messenger;
public final class bl implements Runnable {
    public final int f19733a;
    public final TranslateController f19734b;
    public final String f19735c;
    public final MessageObject d;
    public final long e;
    public final int f19736f;

    public bl(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f19733a = i11;
        this.f19734b = translateController;
        this.f19735c = str;
        this.d = messageObject;
        this.e = j10;
        this.f19736f = i10;
    }

    @Override
    public final void run() {
        switch (this.f19733a) {
            case 0:
                long j10 = this.e;
                int i10 = this.f19736f;
                this.f19734b.lambda$checkLanguage$16(this.f19735c, this.d, j10, i10);
                return;
            default:
                long j11 = this.e;
                int i11 = this.f19736f;
                this.f19734b.lambda$checkLanguage$12(this.f19735c, this.d, j11, i11);
                return;
        }
    }
}
