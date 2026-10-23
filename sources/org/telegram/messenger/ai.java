package org.telegram.messenger;
public final class ai implements Runnable {
    public final int f17958a;
    public final SecretChatHelper f17959b;
    public final long f17960c;

    public ai(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f17958a = i10;
        this.f17959b = secretChatHelper;
        this.f17960c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17958a) {
            case 0:
                SecretChatHelper.y(this.f17959b, this.f17960c);
                return;
            case 1:
                SecretChatHelper.u(this.f17959b, this.f17960c);
                return;
            case 2:
                SecretChatHelper.j(this.f17959b, this.f17960c);
                return;
            default:
                SecretChatHelper.x(this.f17959b, this.f17960c);
                return;
        }
    }
}
