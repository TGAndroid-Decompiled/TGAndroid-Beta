package org.telegram.messenger;

public final class vk implements Runnable {

    public final int f21872a;

    public final TranslateController f21873b;

    public final String f21874c;
    public final MessageObject d;

    public final long f21875e;

    public final int f21876f;

    public vk(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f21872a = i11;
        this.f21873b = translateController;
        this.f21874c = str;
        this.d = messageObject;
        this.f21875e = j10;
        this.f21876f = i10;
    }

    @Override
    public final void run() {
        switch (this.f21872a) {
            case 0:
                long j10 = this.f21875e;
                int i10 = this.f21876f;
                this.f21873b.lambda$checkLanguage$16(this.f21874c, this.d, j10, i10);
                break;
            default:
                long j11 = this.f21875e;
                int i11 = this.f21876f;
                this.f21873b.lambda$checkLanguage$12(this.f21874c, this.d, j11, i11);
                break;
        }
    }
}
