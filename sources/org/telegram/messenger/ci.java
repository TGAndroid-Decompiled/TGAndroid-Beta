package org.telegram.messenger;
public final class ci implements Runnable {
    public final int f16139a;
    public final SecretChatHelper f16140b;
    public final long f16141c;

    public ci(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f16139a = i10;
        this.f16140b = secretChatHelper;
        this.f16141c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16139a) {
            case 0:
                SecretChatHelper.y(this.f16140b, this.f16141c);
                return;
            case 1:
                SecretChatHelper.u(this.f16140b, this.f16141c);
                return;
            case 2:
                SecretChatHelper.j(this.f16140b, this.f16141c);
                return;
            default:
                SecretChatHelper.x(this.f16140b, this.f16141c);
                return;
        }
    }
}
