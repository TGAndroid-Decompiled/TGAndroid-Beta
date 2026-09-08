package org.telegram.messenger;
public final class di implements Runnable {
    public final int f17517a;
    public final SecretChatHelper f17518b;
    public final long f17519c;

    public di(SecretChatHelper secretChatHelper, long j3, int i10) {
        this.f17517a = i10;
        this.f17518b = secretChatHelper;
        this.f17519c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17517a) {
            case 0:
                SecretChatHelper.x(this.f17518b, this.f17519c);
                return;
            case 1:
                SecretChatHelper.t(this.f17518b, this.f17519c);
                return;
            case 2:
                SecretChatHelper.j(this.f17518b, this.f17519c);
                return;
            default:
                SecretChatHelper.w(this.f17518b, this.f17519c);
                return;
        }
    }
}
