package org.telegram.messenger;
public final class ei implements Runnable {
    public final int f16883a;
    public final SecretChatHelper f16884b;
    public final long f16885c;

    public ei(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f16883a = i10;
        this.f16884b = secretChatHelper;
        this.f16885c = j10;
    }

    @Override
    public final void run() {
        switch (this.f16883a) {
            case 0:
                SecretChatHelper.y(this.f16884b, this.f16885c);
                return;
            case 1:
                SecretChatHelper.u(this.f16884b, this.f16885c);
                return;
            case 2:
                SecretChatHelper.j(this.f16884b, this.f16885c);
                return;
            default:
                SecretChatHelper.x(this.f16884b, this.f16885c);
                return;
        }
    }
}
