package org.telegram.messenger;
public final class qk implements Runnable {
    public final int f21354a;
    public final TranslateController f21355b;
    public final String f21356c;
    public final MessageObject d;
    public final long f21357e;
    public final int f21358f;

    public qk(TranslateController translateController, String str, MessageObject messageObject, long j10, int i9, int i10) {
        this.f21354a = i10;
        this.f21355b = translateController;
        this.f21356c = str;
        this.d = messageObject;
        this.f21357e = j10;
        this.f21358f = i9;
    }

    @Override
    public final void run() {
        switch (this.f21354a) {
            case 0:
                long j10 = this.f21357e;
                int i9 = this.f21358f;
                this.f21355b.lambda$checkLanguage$16(this.f21356c, this.d, j10, i9);
                return;
            default:
                long j11 = this.f21357e;
                int i10 = this.f21358f;
                this.f21355b.lambda$checkLanguage$12(this.f21356c, this.d, j11, i10);
                return;
        }
    }
}
