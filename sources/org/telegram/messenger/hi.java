package org.telegram.messenger;
public final class hi implements Runnable {
    public final int f17818a;
    public final SecretChatHelper f17819b;
    public final long f17820c;

    public hi(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f17818a = i10;
        this.f17819b = secretChatHelper;
        this.f17820c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17818a) {
            case 0:
                SecretChatHelper.y(this.f17819b, this.f17820c);
                return;
            case 1:
                SecretChatHelper.u(this.f17819b, this.f17820c);
                return;
            case 2:
                SecretChatHelper.j(this.f17819b, this.f17820c);
                return;
            default:
                SecretChatHelper.x(this.f17819b, this.f17820c);
                return;
        }
    }
}
