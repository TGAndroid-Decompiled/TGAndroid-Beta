package org.telegram.messenger;
public final class ci implements Runnable {
    public final int f16140a;
    public final SecretChatHelper f16141b;
    public final long f16142c;

    public ci(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f16140a = i10;
        this.f16141b = secretChatHelper;
        this.f16142c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16140a) {
            case 0:
                SecretChatHelper.y(this.f16141b, this.f16142c);
                return;
            case 1:
                SecretChatHelper.u(this.f16141b, this.f16142c);
                return;
            case 2:
                SecretChatHelper.j(this.f16141b, this.f16142c);
                return;
            default:
                SecretChatHelper.x(this.f16141b, this.f16142c);
                return;
        }
    }
}
