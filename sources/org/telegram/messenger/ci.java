package org.telegram.messenger;
public final class ci implements Runnable {
    public final int f17594a;
    public final SecretChatHelper f17595b;
    public final long f17596c;

    public ci(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f17594a = i10;
        this.f17595b = secretChatHelper;
        this.f17596c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17594a) {
            case 0:
                SecretChatHelper.y(this.f17595b, this.f17596c);
                return;
            case 1:
                SecretChatHelper.u(this.f17595b, this.f17596c);
                return;
            case 2:
                SecretChatHelper.j(this.f17595b, this.f17596c);
                return;
            default:
                SecretChatHelper.x(this.f17595b, this.f17596c);
                return;
        }
    }
}
