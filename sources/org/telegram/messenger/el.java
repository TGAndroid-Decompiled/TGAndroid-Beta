package org.telegram.messenger;
public final class el implements Runnable {
    public final int f16893a;
    public final TranslateController f16894b;
    public final String f16895c;
    public final MessageObject d;
    public final long e;
    public final int f16896f;

    public el(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f16893a = i11;
        this.f16894b = translateController;
        this.f16895c = str;
        this.d = messageObject;
        this.e = j10;
        this.f16896f = i10;
    }

    @Override
    public final void run() {
        switch (this.f16893a) {
            case 0:
                long j10 = this.e;
                int i10 = this.f16896f;
                this.f16894b.lambda$checkLanguage$16(this.f16895c, this.d, j10, i10);
                return;
            default:
                long j11 = this.e;
                int i11 = this.f16896f;
                this.f16894b.lambda$checkLanguage$12(this.f16895c, this.d, j11, i11);
                return;
        }
    }
}
