package org.telegram.messenger;
public final class di implements Runnable {
    public final int f15988a;
    public final SecretChatHelper f15989b;
    public final long f15990c;

    public di(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f15988a = i10;
        this.f15989b = secretChatHelper;
        this.f15990c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15988a) {
            case 0:
                SecretChatHelper.y(this.f15989b, this.f15990c);
                return;
            case 1:
                SecretChatHelper.u(this.f15989b, this.f15990c);
                return;
            case 2:
                SecretChatHelper.j(this.f15989b, this.f15990c);
                return;
            default:
                SecretChatHelper.x(this.f15989b, this.f15990c);
                return;
        }
    }
}
