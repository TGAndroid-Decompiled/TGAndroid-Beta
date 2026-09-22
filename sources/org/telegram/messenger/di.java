package org.telegram.messenger;
public final class di implements Runnable {
    public final int f15976a;
    public final SecretChatHelper f15977b;
    public final long f15978c;

    public di(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f15976a = i10;
        this.f15977b = secretChatHelper;
        this.f15978c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15976a) {
            case 0:
                SecretChatHelper.y(this.f15977b, this.f15978c);
                return;
            case 1:
                SecretChatHelper.u(this.f15977b, this.f15978c);
                return;
            case 2:
                SecretChatHelper.j(this.f15977b, this.f15978c);
                return;
            default:
                SecretChatHelper.x(this.f15977b, this.f15978c);
                return;
        }
    }
}
