package org.telegram.messenger;
public final class ci implements Runnable {
    public final int f16156a;
    public final SecretChatHelper f16157b;
    public final long f16158c;

    public ci(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f16156a = i10;
        this.f16157b = secretChatHelper;
        this.f16158c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16156a) {
            case 0:
                SecretChatHelper.y(this.f16157b, this.f16158c);
                return;
            case 1:
                SecretChatHelper.u(this.f16157b, this.f16158c);
                return;
            case 2:
                SecretChatHelper.j(this.f16157b, this.f16158c);
                return;
            default:
                SecretChatHelper.x(this.f16157b, this.f16158c);
                return;
        }
    }
}
