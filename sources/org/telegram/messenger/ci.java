package org.telegram.messenger;
public final class ci implements Runnable {
    public final int f15887a;
    public final SecretChatHelper f15888b;
    public final long f15889c;

    public ci(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f15887a = i10;
        this.f15888b = secretChatHelper;
        this.f15889c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15887a) {
            case 0:
                SecretChatHelper.y(this.f15888b, this.f15889c);
                return;
            case 1:
                SecretChatHelper.u(this.f15888b, this.f15889c);
                return;
            case 2:
                SecretChatHelper.j(this.f15888b, this.f15889c);
                return;
            default:
                SecretChatHelper.x(this.f15888b, this.f15889c);
                return;
        }
    }
}
