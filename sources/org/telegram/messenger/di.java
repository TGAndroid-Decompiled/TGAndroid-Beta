package org.telegram.messenger;
public final class di implements Runnable {
    public final int f15979a;
    public final SecretChatHelper f15980b;
    public final long f15981c;

    public di(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f15979a = i10;
        this.f15980b = secretChatHelper;
        this.f15981c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15979a) {
            case 0:
                SecretChatHelper.y(this.f15980b, this.f15981c);
                return;
            case 1:
                SecretChatHelper.u(this.f15980b, this.f15981c);
                return;
            case 2:
                SecretChatHelper.j(this.f15980b, this.f15981c);
                return;
            default:
                SecretChatHelper.x(this.f15980b, this.f15981c);
                return;
        }
    }
}
