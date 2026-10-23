package org.telegram.messenger;
public final class ai implements Runnable {
    public final int f17895a;
    public final SecretChatHelper f17896b;
    public final long f17897c;

    public ai(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f17895a = i10;
        this.f17896b = secretChatHelper;
        this.f17897c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17895a) {
            case 0:
                SecretChatHelper.y(this.f17896b, this.f17897c);
                return;
            case 1:
                SecretChatHelper.u(this.f17896b, this.f17897c);
                return;
            case 2:
                SecretChatHelper.j(this.f17896b, this.f17897c);
                return;
            default:
                SecretChatHelper.x(this.f17896b, this.f17897c);
                return;
        }
    }
}
