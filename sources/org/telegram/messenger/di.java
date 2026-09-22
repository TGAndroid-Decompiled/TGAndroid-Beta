package org.telegram.messenger;
public final class di implements Runnable {
    public final int f16219a;
    public final SecretChatHelper f16220b;
    public final long f16221c;

    public di(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f16219a = i10;
        this.f16220b = secretChatHelper;
        this.f16221c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16219a) {
            case 0:
                SecretChatHelper.y(this.f16220b, this.f16221c);
                return;
            case 1:
                SecretChatHelper.u(this.f16220b, this.f16221c);
                return;
            case 2:
                SecretChatHelper.j(this.f16220b, this.f16221c);
                return;
            default:
                SecretChatHelper.x(this.f16220b, this.f16221c);
                return;
        }
    }
}
