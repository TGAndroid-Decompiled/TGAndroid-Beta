package org.telegram.messenger;
public final class xk implements Runnable {
    public final int f20104a;
    public final TranslateController f20105b;
    public final String f20106c;
    public final MessageObject d;
    public final long e;
    public final int f20107f;

    public xk(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f20104a = i11;
        this.f20105b = translateController;
        this.f20106c = str;
        this.d = messageObject;
        this.e = j10;
        this.f20107f = i10;
    }

    @Override
    public final void run() {
        switch (this.f20104a) {
            case 0:
                long j10 = this.e;
                int i10 = this.f20107f;
                this.f20105b.lambda$checkLanguage$16(this.f20106c, this.d, j10, i10);
                return;
            default:
                long j11 = this.e;
                int i11 = this.f20107f;
                this.f20105b.lambda$checkLanguage$12(this.f20106c, this.d, j11, i11);
                return;
        }
    }
}
