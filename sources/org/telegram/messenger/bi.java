package org.telegram.messenger;
public final class bi implements Runnable {
    public final int f18030a;
    public final SecretChatHelper f18031b;
    public final long f18032c;

    public bi(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f18030a = i10;
        this.f18031b = secretChatHelper;
        this.f18032c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18030a) {
            case 0:
                SecretChatHelper.y(this.f18031b, this.f18032c);
                return;
            case 1:
                SecretChatHelper.u(this.f18031b, this.f18032c);
                return;
            case 2:
                SecretChatHelper.j(this.f18031b, this.f18032c);
                return;
            default:
                SecretChatHelper.x(this.f18031b, this.f18032c);
                return;
        }
    }
}
