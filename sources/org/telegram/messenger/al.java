package org.telegram.messenger;
public final class al implements Runnable {
    public final int f17892a;
    public final TranslateController f17893b;
    public final String f17894c;
    public final MessageObject d;
    public final long e;
    public final int f17895f;

    public al(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f17892a = i11;
        this.f17893b = translateController;
        this.f17894c = str;
        this.d = messageObject;
        this.e = j10;
        this.f17895f = i10;
    }

    @Override
    public final void run() {
        switch (this.f17892a) {
            case 0:
                long j10 = this.e;
                int i10 = this.f17895f;
                this.f17893b.lambda$checkLanguage$16(this.f17894c, this.d, j10, i10);
                return;
            default:
                long j11 = this.e;
                int i11 = this.f17895f;
                this.f17893b.lambda$checkLanguage$12(this.f17894c, this.d, j11, i11);
                return;
        }
    }
}
