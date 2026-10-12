package org.telegram.messenger;
public final class hi implements Runnable {
    public final int f17817a;
    public final SecretChatHelper f17818b;
    public final long f17819c;

    public hi(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f17817a = i10;
        this.f17818b = secretChatHelper;
        this.f17819c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17817a) {
            case 0:
                SecretChatHelper.y(this.f17818b, this.f17819c);
                return;
            case 1:
                SecretChatHelper.u(this.f17818b, this.f17819c);
                return;
            case 2:
                SecretChatHelper.j(this.f17818b, this.f17819c);
                return;
            default:
                SecretChatHelper.x(this.f17818b, this.f17819c);
                return;
        }
    }
}
