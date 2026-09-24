package org.telegram.messenger;
public final class ci implements Runnable {
    public final int f16130a;
    public final SecretChatHelper f16131b;
    public final long f16132c;

    public ci(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f16130a = i10;
        this.f16131b = secretChatHelper;
        this.f16132c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16130a) {
            case 0:
                SecretChatHelper.y(this.f16131b, this.f16132c);
                return;
            case 1:
                SecretChatHelper.u(this.f16131b, this.f16132c);
                return;
            case 2:
                SecretChatHelper.j(this.f16131b, this.f16132c);
                return;
            default:
                SecretChatHelper.x(this.f16131b, this.f16132c);
                return;
        }
    }
}
