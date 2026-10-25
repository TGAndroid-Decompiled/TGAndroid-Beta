package org.telegram.messenger;
public final class di implements Runnable {
    public final int f19922a;
    public final SecretChatHelper f19923b;
    public final long f19924c;

    public di(SecretChatHelper secretChatHelper, long j10, int i10) {
        this.f19922a = i10;
        this.f19923b = secretChatHelper;
        this.f19924c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19922a) {
            case 0:
                SecretChatHelper.y(this.f19923b, this.f19924c);
                return;
            case 1:
                SecretChatHelper.u(this.f19923b, this.f19924c);
                return;
            case 2:
                SecretChatHelper.j(this.f19923b, this.f19924c);
                return;
            default:
                SecretChatHelper.x(this.f19923b, this.f19924c);
                return;
        }
    }
}
