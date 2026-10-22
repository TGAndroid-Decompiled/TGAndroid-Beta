package org.telegram.messenger;
public final class bi implements Runnable {
    public final int f17967a;
    public final SecretChatHelper f17968b;
    public final long f17969c;

    public bi(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f17967a = i10;
        this.f17968b = secretChatHelper;
        this.f17969c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17967a) {
            case 0:
                SecretChatHelper.y(this.f17968b, this.f17969c);
                return;
            case 1:
                SecretChatHelper.u(this.f17968b, this.f17969c);
                return;
            case 2:
                SecretChatHelper.j(this.f17968b, this.f17969c);
                return;
            default:
                SecretChatHelper.x(this.f17968b, this.f17969c);
                return;
        }
    }
}
