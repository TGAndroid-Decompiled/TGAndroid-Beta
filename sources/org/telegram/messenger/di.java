package org.telegram.messenger;
public final class di implements Runnable {
    public final int f16204a;
    public final SecretChatHelper f16205b;
    public final long f16206c;

    public di(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f16204a = i10;
        this.f16205b = secretChatHelper;
        this.f16206c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16204a) {
            case 0:
                SecretChatHelper.y(this.f16205b, this.f16206c);
                return;
            case 1:
                SecretChatHelper.u(this.f16205b, this.f16206c);
                return;
            case 2:
                SecretChatHelper.j(this.f16205b, this.f16206c);
                return;
            default:
                SecretChatHelper.x(this.f16205b, this.f16206c);
                return;
        }
    }
}
