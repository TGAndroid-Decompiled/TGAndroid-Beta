package org.telegram.messenger;
public final class cl implements Runnable {
    public final int f18435a;
    public final TranslateController f18436b;
    public final String f18437c;
    public final MessageObject d;
    public final long f18438e;
    public final int f18439f;

    public cl(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f18435a = i11;
        this.f18436b = translateController;
        this.f18437c = str;
        this.d = messageObject;
        this.f18438e = j10;
        this.f18439f = i10;
    }

    @Override
    public final void run() {
        switch (this.f18435a) {
            case 0:
                long j10 = this.f18438e;
                int i10 = this.f18439f;
                this.f18436b.lambda$checkLanguage$16(this.f18437c, this.d, j10, i10);
                return;
            default:
                long j11 = this.f18438e;
                int i11 = this.f18439f;
                this.f18436b.lambda$checkLanguage$12(this.f18437c, this.d, j11, i11);
                return;
        }
    }
}
